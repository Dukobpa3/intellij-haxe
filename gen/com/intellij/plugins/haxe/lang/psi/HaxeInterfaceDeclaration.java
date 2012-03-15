// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaxeInterfaceDeclaration extends HaxeClass {

  @Nullable
  public HaxeComponentName getComponentName();

  @Nullable
  public HaxeExternOrPrivate getExternOrPrivate();

  @NotNull
  public List<HaxeFakeEnumMeta> getFakeEnumMetaList();

  @Nullable
  public HaxeInheritList getInheritList();

  @Nullable
  public HaxeInterfaceBody getInterfaceBody();

  @NotNull
  public List<HaxeRequireMeta> getRequireMetaList();

  @Nullable
  public HaxeTypeParam getTypeParam();

}
