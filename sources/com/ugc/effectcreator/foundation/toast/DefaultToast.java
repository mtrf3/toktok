package com.ugc.effectcreator.foundation.toast;

import X.C16880lQ;
import android.content.Context;
import android.widget.Toast;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.IToast;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class DefaultToast implements IToast {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.IToast
    public void showToast(Context context, String text) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(text, "text");
        C16880lQ.LLZILL(Toast.makeText(C16880lQ.LLLLL(context), text, 1));
    }
}
