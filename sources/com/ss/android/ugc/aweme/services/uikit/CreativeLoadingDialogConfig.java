package com.ss.android.ugc.aweme.services.uikit;

import X.AbstractC65781Prl;
import X.C48339Iy7;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.QZY;
import X.X1D;
import android.app.Dialog;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreativeLoadingDialogConfig {
    public boolean backCanCancel;
    public DialogInterface.OnCancelListener cancelListener;
    public CreativeLoadingDialogBuilder.CancelType cancelViewVisibleType;
    public InterfaceC88472Yns<? super Dialog, C76800UCe> clickCancelListener;
    public DialogInterface.OnDismissListener dismissListener;
    public boolean hasOverLay;
    public boolean isShowProgress;
    public String message;
    public DialogInterface.OnShowListener showListener;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CreativeLoadingDialogConfig() {
        /*
            r12 = this;
            r1 = 0
            r2 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r2
            r9 = r2
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogConfig.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreativeLoadingDialogConfig copy$default(CreativeLoadingDialogConfig creativeLoadingDialogConfig, CreativeLoadingDialogBuilder.CancelType cancelType, boolean z, String str, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, DialogInterface.OnCancelListener onCancelListener, InterfaceC88472Yns interfaceC88472Yns, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            cancelType = creativeLoadingDialogConfig.cancelViewVisibleType;
        }
        if ((i & 2) != 0) {
            z = creativeLoadingDialogConfig.isShowProgress;
        }
        if ((i & 4) != 0) {
            str = creativeLoadingDialogConfig.message;
        }
        if ((i & 8) != 0) {
            onDismissListener = creativeLoadingDialogConfig.dismissListener;
        }
        if ((i & 16) != 0) {
            onShowListener = creativeLoadingDialogConfig.showListener;
        }
        if ((i & 32) != 0) {
            onCancelListener = creativeLoadingDialogConfig.cancelListener;
        }
        if ((i & 64) != 0) {
            interfaceC88472Yns = creativeLoadingDialogConfig.clickCancelListener;
        }
        if ((i & 128) != 0) {
            z2 = creativeLoadingDialogConfig.hasOverLay;
        }
        if ((i & 256) != 0) {
            z3 = creativeLoadingDialogConfig.backCanCancel;
        }
        return creativeLoadingDialogConfig.copy(cancelType, z, str, onDismissListener, onShowListener, onCancelListener, interfaceC88472Yns, z2, z3);
    }

    public final CreativeLoadingDialogConfig copy(CreativeLoadingDialogBuilder.CancelType cancelViewVisibleType, boolean z, String str, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, DialogInterface.OnCancelListener onCancelListener, InterfaceC88472Yns<? super Dialog, C76800UCe> clickCancelListener, boolean z2, boolean z3) {
        o.LJIIIZ(cancelViewVisibleType, "cancelViewVisibleType");
        o.LJIIIZ(clickCancelListener, "clickCancelListener");
        return new CreativeLoadingDialogConfig(cancelViewVisibleType, z, str, onDismissListener, onShowListener, onCancelListener, clickCancelListener, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreativeLoadingDialogConfig)) {
            return false;
        }
        CreativeLoadingDialogConfig creativeLoadingDialogConfig = (CreativeLoadingDialogConfig) obj;
        return this.cancelViewVisibleType == creativeLoadingDialogConfig.cancelViewVisibleType && this.isShowProgress == creativeLoadingDialogConfig.isShowProgress && o.LJ(this.message, creativeLoadingDialogConfig.message) && o.LJ(this.dismissListener, creativeLoadingDialogConfig.dismissListener) && o.LJ(this.showListener, creativeLoadingDialogConfig.showListener) && o.LJ(this.cancelListener, creativeLoadingDialogConfig.cancelListener) && o.LJ(this.clickCancelListener, creativeLoadingDialogConfig.clickCancelListener) && this.hasOverLay == creativeLoadingDialogConfig.hasOverLay && this.backCanCancel == creativeLoadingDialogConfig.backCanCancel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.cancelViewVisibleType.hashCode() * 31;
        boolean z = this.isShowProgress;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode4 + i2) * 31;
        String str = this.message;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        DialogInterface.OnDismissListener onDismissListener = this.dismissListener;
        if (onDismissListener == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = onDismissListener.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        DialogInterface.OnShowListener onShowListener = this.showListener;
        if (onShowListener == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = onShowListener.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        DialogInterface.OnCancelListener onCancelListener = this.cancelListener;
        if (onCancelListener != null) {
            i4 = onCancelListener.hashCode();
        }
        int LIZIZ = QZY.LIZIZ(this.clickCancelListener, (i7 + i4) * 31, 31);
        boolean z2 = this.hasOverLay;
        int i8 = z2;
        if (z2 != 0) {
            i8 = 1;
        }
        int i9 = (LIZIZ + i8) * 31;
        if (!this.backCanCancel) {
            i = 0;
        }
        return i9 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreativeLoadingDialogConfig(cancelViewVisibleType=");
        LIZ.append(this.cancelViewVisibleType);
        LIZ.append(", isShowProgress=");
        LIZ.append(this.isShowProgress);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", dismissListener=");
        LIZ.append(this.dismissListener);
        LIZ.append(", showListener=");
        LIZ.append(this.showListener);
        LIZ.append(", cancelListener=");
        LIZ.append(this.cancelListener);
        LIZ.append(", clickCancelListener=");
        LIZ.append(this.clickCancelListener);
        LIZ.append(", hasOverLay=");
        LIZ.append(this.hasOverLay);
        LIZ.append(", backCanCancel=");
        return C48339Iy7.LIZJ(LIZ, this.backCanCancel, ')', LIZ);
    }

    public final boolean getBackCanCancel() {
        return this.backCanCancel;
    }

    public final DialogInterface.OnCancelListener getCancelListener() {
        return this.cancelListener;
    }

    public final CreativeLoadingDialogBuilder.CancelType getCancelViewVisibleType() {
        return this.cancelViewVisibleType;
    }

    public final InterfaceC88472Yns<Dialog, C76800UCe> getClickCancelListener() {
        return this.clickCancelListener;
    }

    public final DialogInterface.OnDismissListener getDismissListener() {
        return this.dismissListener;
    }

    public final boolean getHasOverLay() {
        return this.hasOverLay;
    }

    public final String getMessage() {
        return this.message;
    }

    public final DialogInterface.OnShowListener getShowListener() {
        return this.showListener;
    }

    public final boolean isShowProgress() {
        return this.isShowProgress;
    }

    /* renamed from: com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogConfig$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public final class AnonymousClass1 extends AbstractC65781Prl implements InterfaceC88472Yns<Dialog, C76800UCe> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Dialog it) {
            o.LJIIIZ(it, "it");
        }

        @Override // X.InterfaceC88472Yns
        public /* bridge */ /* synthetic */ C76800UCe invoke(Dialog dialog) {
            invoke2(dialog);
            return C76800UCe.LIZ;
        }
    }

    public final void setBackCanCancel(boolean z) {
        this.backCanCancel = z;
    }

    public final void setCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.cancelListener = onCancelListener;
    }

    public final void setCancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType cancelType) {
        o.LJIIIZ(cancelType, "<set-?>");
        this.cancelViewVisibleType = cancelType;
    }

    public final void setClickCancelListener(InterfaceC88472Yns<? super Dialog, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.clickCancelListener = interfaceC88472Yns;
    }

    public final void setDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.dismissListener = onDismissListener;
    }

    public final void setHasOverLay(boolean z) {
        this.hasOverLay = z;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setShowListener(DialogInterface.OnShowListener onShowListener) {
        this.showListener = onShowListener;
    }

    public final void setShowProgress(boolean z) {
        this.isShowProgress = z;
    }

    public CreativeLoadingDialogConfig(CreativeLoadingDialogBuilder.CancelType cancelViewVisibleType, boolean z, String str, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, DialogInterface.OnCancelListener onCancelListener, InterfaceC88472Yns<? super Dialog, C76800UCe> clickCancelListener, boolean z2, boolean z3) {
        o.LJIIIZ(cancelViewVisibleType, "cancelViewVisibleType");
        o.LJIIIZ(clickCancelListener, "clickCancelListener");
        this.cancelViewVisibleType = cancelViewVisibleType;
        this.isShowProgress = z;
        this.message = str;
        this.dismissListener = onDismissListener;
        this.showListener = onShowListener;
        this.cancelListener = onCancelListener;
        this.clickCancelListener = clickCancelListener;
        this.hasOverLay = z2;
        this.backCanCancel = z3;
    }

    public /* synthetic */ CreativeLoadingDialogConfig(CreativeLoadingDialogBuilder.CancelType cancelType, boolean z, String str, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, DialogInterface.OnCancelListener onCancelListener, InterfaceC88472Yns interfaceC88472Yns, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CreativeLoadingDialogBuilder.CancelType.GONE : cancelType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : onDismissListener, (i & 16) != 0 ? null : onShowListener, (i & 32) == 0 ? onCancelListener : null, (i & 64) != 0 ? AnonymousClass1.INSTANCE : interfaceC88472Yns, (i & 128) != 0 ? false : z2, (i & 256) == 0 ? z3 : false);
    }
}
