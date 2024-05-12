package com.ss.android.ugc.aweme.effectcreator.services;

import X.C26045AKb;
import android.app.Activity;
import android.content.Context;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.IToast;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TiktokToastImpl implements IToast {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.IToast
    public void showToast(Context context, String text) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(text, "text");
        C26045AKb c26045AKb = new C26045AKb((Activity) context);
        c26045AKb.LJIIIZ(text);
        c26045AKb.LJIIJ();
    }
}
