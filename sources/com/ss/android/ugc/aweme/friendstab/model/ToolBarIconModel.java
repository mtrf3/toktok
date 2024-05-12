package com.ss.android.ugc.aweme.friendstab.model;

import X.C06540Nm;
import X.C76800UCe;
import X.EnumC53733L6z;
import X.InterfaceC65784Pro;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ToolBarIconModel {
    public final boolean hasDot;
    public final int iconRes;
    public final InterfaceC65784Pro<C76800UCe> onClick;
    public final int tintColor;
    public final EnumC53733L6z type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToolBarIconModel copy$default(ToolBarIconModel toolBarIconModel, boolean z, int i, int i2, EnumC53733L6z enumC53733L6z, InterfaceC65784Pro interfaceC65784Pro, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = toolBarIconModel.hasDot;
        }
        if ((i3 & 2) != 0) {
            i = toolBarIconModel.iconRes;
        }
        if ((i3 & 4) != 0) {
            i2 = toolBarIconModel.tintColor;
        }
        if ((i3 & 8) != 0) {
            enumC53733L6z = toolBarIconModel.type;
        }
        if ((i3 & 16) != 0) {
            interfaceC65784Pro = toolBarIconModel.onClick;
        }
        return toolBarIconModel.copy(z, i, i2, enumC53733L6z, interfaceC65784Pro);
    }

    public final ToolBarIconModel copy(boolean z, int i, int i2, EnumC53733L6z enumC53733L6z, InterfaceC65784Pro<C76800UCe> onClick) {
        o.LJIIIZ(onClick, "onClick");
        return new ToolBarIconModel(z, i, i2, enumC53733L6z, onClick);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolBarIconModel)) {
            return false;
        }
        ToolBarIconModel toolBarIconModel = (ToolBarIconModel) obj;
        return this.hasDot == toolBarIconModel.hasDot && this.iconRes == toolBarIconModel.iconRes && this.tintColor == toolBarIconModel.tintColor && this.type == toolBarIconModel.type && o.LJ(this.onClick, toolBarIconModel.onClick);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    public int hashCode() {
        boolean z = this.hasDot;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((((r0 * 31) + this.iconRes) * 31) + this.tintColor) * 31;
        EnumC53733L6z enumC53733L6z = this.type;
        return this.onClick.hashCode() + ((i + (enumC53733L6z == null ? 0 : enumC53733L6z.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolBarIconModel(hasDot=");
        LIZ.append(this.hasDot);
        LIZ.append(", iconRes=");
        LIZ.append(this.iconRes);
        LIZ.append(", tintColor=");
        LIZ.append(this.tintColor);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", onClick=");
        return C06540Nm.LIZJ(LIZ, this.onClick, ')', LIZ);
    }

    public final boolean getHasDot() {
        return this.hasDot;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnClick() {
        return this.onClick;
    }

    public final int getTintColor() {
        return this.tintColor;
    }

    public final EnumC53733L6z getType() {
        return this.type;
    }

    public ToolBarIconModel(boolean z, int i, int i2, EnumC53733L6z enumC53733L6z, InterfaceC65784Pro<C76800UCe> onClick) {
        o.LJIIIZ(onClick, "onClick");
        this.hasDot = z;
        this.iconRes = i;
        this.tintColor = i2;
        this.type = enumC53733L6z;
        this.onClick = onClick;
    }

    public /* synthetic */ ToolBarIconModel(boolean z, int i, int i2, EnumC53733L6z enumC53733L6z, InterfaceC65784Pro interfaceC65784Pro, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? EnumC53733L6z.DEFAULT : enumC53733L6z, interfaceC65784Pro);
    }
}
