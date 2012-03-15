// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.plugins.haxe.lang.lexer.HaxeTokenTypes.*;
import com.intellij.plugins.haxe.lang.psi.*;

public class HaxeFunctionTypeImpl extends HaxePsiCompositeElementImpl implements HaxeFunctionType {

  public HaxeFunctionTypeImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<HaxeAnonymousType> getAnonymousTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaxeAnonymousType.class);
  }

  @Override
  @Nullable
  public HaxeFunctionType getFunctionType() {
    return findChildByClass(HaxeFunctionType.class);
  }

  @Override
  @NotNull
  public List<HaxeType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaxeType.class);
  }

}
