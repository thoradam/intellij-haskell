// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import intellij.haskell.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import scala.Option;
import scala.collection.Seq;

public class HaskellNewtypeDeclarationImpl extends HaskellCompositeElementImpl implements HaskellNewtypeDeclaration {

  public HaskellNewtypeDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitNewtypeDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HaskellCcontext getCcontext() {
    return PsiTreeUtil.getChildOfType(this, HaskellCcontext.class);
  }

  @Override
  @Nullable
  public HaskellCtypePragma getCtypePragma() {
    return PsiTreeUtil.getChildOfType(this, HaskellCtypePragma.class);
  }

  @Override
  @NotNull
  public HaskellNewconstr getNewconstr() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, HaskellNewconstr.class));
  }

  @Override
  @NotNull
  public HaskellSimpletype getSimpletype() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, HaskellSimpletype.class));
  }

  @Override
  @Nullable
  public HaskellTtype getTtype() {
    return PsiTreeUtil.getChildOfType(this, HaskellTtype.class);
  }

  public String getName() {
    return HaskellPsiImplUtil.getName(this);
  }

  public ItemPresentation getPresentation() {
    return HaskellPsiImplUtil.getPresentation(this);
  }

  public Seq<HaskellNamedElement> getIdentifierElements() {
    return HaskellPsiImplUtil.getIdentifierElements(this);
  }

  public Option<String> getModuleName() {
    return HaskellPsiImplUtil.getModuleName(this);
  }

  public HaskellNamedElement getDataTypeConstructor() {
    return HaskellPsiImplUtil.getDataTypeConstructor(this);
  }

}
