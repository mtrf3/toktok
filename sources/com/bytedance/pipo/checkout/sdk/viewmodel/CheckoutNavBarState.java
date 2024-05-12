package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class CheckoutNavBarState extends F9E {
    public static final int $stable = 0;
    public final String currentRoute;
    public final boolean displayDialogOnBack;
    public final boolean displayDialogOnClose;
    public final boolean hideLoading;
    public final boolean isBackShow;
    public final boolean isCloseShow;
    public final boolean isDividerShow;
    public final boolean isFullScreen;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CheckoutNavBarState() {
        /*
            r11 = this;
            r1 = 0
            r2 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState.<init>():void");
    }

    public static /* synthetic */ CheckoutNavBarState copy$default(CheckoutNavBarState checkoutNavBarState, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutNavBarState.currentRoute;
        }
        if ((i & 2) != 0) {
            z = checkoutNavBarState.isBackShow;
        }
        if ((i & 4) != 0) {
            z2 = checkoutNavBarState.isCloseShow;
        }
        if ((i & 8) != 0) {
            z3 = checkoutNavBarState.isFullScreen;
        }
        if ((i & 16) != 0) {
            z4 = checkoutNavBarState.isDividerShow;
        }
        if ((i & 32) != 0) {
            z5 = checkoutNavBarState.displayDialogOnClose;
        }
        if ((i & 64) != 0) {
            z6 = checkoutNavBarState.displayDialogOnBack;
        }
        if ((i & 128) != 0) {
            z7 = checkoutNavBarState.hideLoading;
        }
        return checkoutNavBarState.copy(str, z, z2, z3, z4, z5, z6, z7);
    }

    public final CheckoutNavBarState copy(String currentRoute, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        o.LJIIIZ(currentRoute, "currentRoute");
        return new CheckoutNavBarState(currentRoute, z, z2, z3, z4, z5, z6, z7);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.currentRoute, Boolean.valueOf(this.isBackShow), Boolean.valueOf(this.isCloseShow), Boolean.valueOf(this.isFullScreen), Boolean.valueOf(this.isDividerShow), Boolean.valueOf(this.displayDialogOnClose), Boolean.valueOf(this.displayDialogOnBack), Boolean.valueOf(this.hideLoading)};
    }

    public final String getCurrentRoute() {
        return this.currentRoute;
    }

    public final boolean getDisplayDialogOnBack() {
        return this.displayDialogOnBack;
    }

    public final boolean getDisplayDialogOnClose() {
        return this.displayDialogOnClose;
    }

    public final boolean getHideLoading() {
        return this.hideLoading;
    }

    public final boolean isBackShow() {
        return this.isBackShow;
    }

    public final boolean isCloseShow() {
        return this.isCloseShow;
    }

    public final boolean isDividerShow() {
        return this.isDividerShow;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    public CheckoutNavBarState(String currentRoute, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        o.LJIIIZ(currentRoute, "currentRoute");
        this.currentRoute = currentRoute;
        this.isBackShow = z;
        this.isCloseShow = z2;
        this.isFullScreen = z3;
        this.isDividerShow = z4;
        this.displayDialogOnClose = z5;
        this.displayDialogOnBack = z6;
        this.hideLoading = z7;
    }

    public /* synthetic */ CheckoutNavBarState(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6, (i & 128) == 0 ? z7 : false);
    }
}
