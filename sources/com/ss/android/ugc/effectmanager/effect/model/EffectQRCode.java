package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectQRCodeTemplate;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EffectQRCode extends EffectQRCodeTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.EffectQRCode kQrcode;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectQRCode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectQRCode
    public String getQrCodeText() {
        String qrCodeText;
        com.ss.ugc.effectplatform.model.EffectQRCode kQrcode = getKQrcode();
        if (kQrcode != null && (qrCodeText = kQrcode.getQrCodeText()) != null) {
            return qrCodeText;
        }
        return super.getQrCodeText();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectQRCodeTemplate
    public com.ss.ugc.effectplatform.model.EffectQRCode getKQrcode() {
        return this.kQrcode;
    }

    public EffectQRCode(com.ss.ugc.effectplatform.model.EffectQRCode effectQRCode) {
        super(effectQRCode);
        String qrCodeText;
        this.kQrcode = effectQRCode;
        com.ss.ugc.effectplatform.model.EffectQRCode kQrcode = getKQrcode();
        if (kQrcode != null && (qrCodeText = kQrcode.getQrCodeText()) != null) {
            super.setQrCodeText(qrCodeText);
        }
    }

    @Override // com.ss.ugc.effectplatform.model.EffectQRCode
    public void setQrCodeText(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectQRCode kQrcode = getKQrcode();
        if (kQrcode != null) {
            kQrcode.setQrCodeText(value);
        }
        super.setQrCodeText(value);
    }

    public /* synthetic */ EffectQRCode(com.ss.ugc.effectplatform.model.EffectQRCode effectQRCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectQRCode);
    }
}
