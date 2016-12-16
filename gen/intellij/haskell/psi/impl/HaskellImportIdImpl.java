// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import intellij.haskell.psi.HaskellCname;
import intellij.haskell.psi.HaskellDotDotParens;
import intellij.haskell.psi.HaskellImportId;
import intellij.haskell.psi.HaskellVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HaskellImportIdImpl extends HaskellCompositeElementImpl implements HaskellImportId {

  public HaskellImportIdImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitImportId(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HaskellCname> getCnameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellCname.class);
  }

  @Override
  @Nullable
  public HaskellDotDotParens getDotDotParens() {
    return PsiTreeUtil.getChildOfType(this, HaskellDotDotParens.class);
  }

}
