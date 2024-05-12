package com.bytedance.ies.xbridge.base.runtime.depend;

import X.F9E;
import android.content.Context;
import android.content.DialogInterface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DialogBuilder extends F9E {
    public final DialogInterface.OnCancelListener cancelListener;
    public final boolean cancelOnTouchOutside;
    public final Context context;
    public final String message;
    public final String negativeBtnText;
    public final DialogInterface.OnClickListener negativeClickListener;
    public final String positiveBtnText;
    public final DialogInterface.OnClickListener positiveClickListener;
    public final String title;

    public static /* synthetic */ DialogBuilder copy$default(DialogBuilder dialogBuilder, Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            context = dialogBuilder.context;
        }
        if ((i & 2) != 0) {
            str = dialogBuilder.title;
        }
        if ((i & 4) != 0) {
            str2 = dialogBuilder.message;
        }
        if ((i & 8) != 0) {
            str3 = dialogBuilder.positiveBtnText;
        }
        if ((i & 16) != 0) {
            onClickListener = dialogBuilder.positiveClickListener;
        }
        if ((i & 32) != 0) {
            str4 = dialogBuilder.negativeBtnText;
        }
        if ((i & 64) != 0) {
            onClickListener2 = dialogBuilder.negativeClickListener;
        }
        if ((i & 128) != 0) {
            onCancelListener = dialogBuilder.cancelListener;
        }
        if ((i & 256) != 0) {
            z = dialogBuilder.cancelOnTouchOutside;
        }
        return dialogBuilder.copy(context, str, str2, str3, onClickListener, str4, onClickListener2, onCancelListener, z);
    }

    public final DialogBuilder copy(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z) {
        o.LJIIJ(context, "context");
        return new DialogBuilder(context, str, str2, str3, onClickListener, str4, onClickListener2, onCancelListener, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.context, this.title, this.message, this.positiveBtnText, this.positiveClickListener, this.negativeBtnText, this.negativeClickListener, this.cancelListener, Boolean.valueOf(this.cancelOnTouchOutside)};
    }

    public final DialogInterface.OnCancelListener getCancelListener() {
        return this.cancelListener;
    }

    public final boolean getCancelOnTouchOutside() {
        return this.cancelOnTouchOutside;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getNegativeBtnText() {
        return this.negativeBtnText;
    }

    public final DialogInterface.OnClickListener getNegativeClickListener() {
        return this.negativeClickListener;
    }

    public final String getPositiveBtnText() {
        return this.positiveBtnText;
    }

    public final DialogInterface.OnClickListener getPositiveClickListener() {
        return this.positiveClickListener;
    }

    public final String getTitle() {
        return this.title;
    }

    public DialogBuilder(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z) {
        o.LJIIJ(context, "context");
        this.context = context;
        this.title = str;
        this.message = str2;
        this.positiveBtnText = str3;
        this.positiveClickListener = onClickListener;
        this.negativeBtnText = str4;
        this.negativeClickListener = onClickListener2;
        this.cancelListener = onCancelListener;
        this.cancelOnTouchOutside = z;
    }

    public /* synthetic */ DialogBuilder(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : onClickListener, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : onClickListener2, (i & 128) == 0 ? onCancelListener : null, (i & 256) != 0 ? true : z);
    }
}
