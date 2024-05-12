package com.ss.android.ugc.aweme.live;

import X.C02A;
import X.C30878C9y;
import X.InterfaceLayoutInflaterFactory2C30767C5r;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveRequestLayoutOptSetting;

/* loaded from: classes6.dex */
public class LiveAppCompatViewInflater extends C02A {
    public InterfaceLayoutInflaterFactory2C30767C5r viewInflater;

    @Override // X.C02A
    public View createView(Context context, String str, AttributeSet attributeSet) {
        if (this.viewInflater == null) {
            this.viewInflater = new C30878C9y();
        }
        if (this.viewInflater != null && LiveRequestLayoutOptSetting.INSTANCE.isLayoutParamsCacheEnabled()) {
            return C30878C9y.LIZ(context, str, attributeSet);
        }
        return super.createView(context, str, attributeSet);
    }
}
