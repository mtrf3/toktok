package com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast;

import X.C93892aYC;
import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class ToastService implements IToast {
    public static final ToastService INSTANCE = new ToastService();
    public final /* synthetic */ IToast $$delegate_0 = (IToast) C93892aYC.LIZ(IToast.class);

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.IToast
    public void showToast(Context context, String text) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(text, "text");
        this.$$delegate_0.showToast(context, text);
    }
}
