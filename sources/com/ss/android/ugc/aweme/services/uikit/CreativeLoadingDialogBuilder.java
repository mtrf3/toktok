package com.ss.android.ugc.aweme.services.uikit;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.V0N;
import android.app.Dialog;
import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreativeLoadingDialogBuilder {
    public final CreativeLoadingDialogConfig config;

    /* loaded from: classes8.dex */
    public enum CancelType {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S,
        VISIBLE_AFTER_15S;

        public static CancelType valueOf(String str) {
            return (CancelType) V0N.LJJJ(CancelType.class, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreativeLoadingDialogBuilder() {
        boolean z = false;
        this.config = new CreativeLoadingDialogConfig(null, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 511, 0 == true ? 1 : 0);
    }

    public final CreativeLoadingDialogConfig getConfig() {
        return this.config;
    }

    public final CreativeLoadingDialogBuilder backCanCancel(boolean z) {
        this.config.setBackCanCancel(z);
        return this;
    }

    public final CreativeLoadingDialogBuilder cancelListener(DialogInterface.OnCancelListener cancelListener) {
        o.LJIIIZ(cancelListener, "cancelListener");
        this.config.setCancelListener(cancelListener);
        return this;
    }

    public final CreativeLoadingDialogBuilder cancelViewVisibleType(CancelType cancelType) {
        o.LJIIIZ(cancelType, "cancelType");
        this.config.setCancelViewVisibleType(cancelType);
        return this;
    }

    public final CreativeLoadingDialogBuilder clickCancelListener(InterfaceC88472Yns<? super Dialog, C76800UCe> clickCancelListener) {
        o.LJIIIZ(clickCancelListener, "clickCancelListener");
        this.config.setClickCancelListener(clickCancelListener);
        return this;
    }

    public final CreativeLoadingDialogBuilder dismissListener(DialogInterface.OnDismissListener dismissListener) {
        o.LJIIIZ(dismissListener, "dismissListener");
        this.config.setDismissListener(dismissListener);
        return this;
    }

    public final CreativeLoadingDialogBuilder hasOverLay(boolean z) {
        this.config.setHasOverLay(z);
        return this;
    }

    public final CreativeLoadingDialogBuilder loadingMessage(String message) {
        o.LJIIIZ(message, "message");
        this.config.setMessage(message);
        return this;
    }

    public final CreativeLoadingDialogBuilder showListener(DialogInterface.OnShowListener showListener) {
        o.LJIIIZ(showListener, "showListener");
        this.config.setShowListener(showListener);
        return this;
    }

    public final CreativeLoadingDialogBuilder showProgress(boolean z) {
        this.config.setShowProgress(z);
        return this;
    }
}
