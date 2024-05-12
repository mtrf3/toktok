package com.ss.android.ugc.aweme.share.qrcode.config;

import X.C2068389v;
import X.C32151Nz;
import X.EF7;
import X.N26;
import X.N28;
import X.O6R;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class QRCodeConfig implements IDynamicBitmapConfig {
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final boolean enable() {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final Drawable fallback() {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_qr_code;
        c2068389v.LIZLLL = Integer.valueOf(ColorProtector.parseColor("#F1F1F1"));
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(190));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(190));
        return c2068389v.LIZ(EF7.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final String key() {
        return "qr_code_default_view";
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final N28 priority() {
        return N28.NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final N26 type() {
        return N26.IMAGE;
    }
}
