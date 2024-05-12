package com.ss.ugc.effectplatform.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectQRCode {
    public String qrCodeText;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectQRCode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public String getQrCodeText() {
        return this.qrCodeText;
    }

    public EffectQRCode(String qrCodeText) {
        o.LJIIJ(qrCodeText, "qrCodeText");
        this.qrCodeText = qrCodeText;
    }

    public void setQrCodeText(String str) {
        o.LJIIJ(str, "<set-?>");
        this.qrCodeText = str;
    }

    public /* synthetic */ EffectQRCode(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
