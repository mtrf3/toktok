package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.ugc.effectplatform.model.EffectQRCode;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class EffectQRCodeTemplate extends EffectQRCode {
    public final transient EffectQRCode kQrcode;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectQRCodeTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public EffectQRCode getKQrcode() {
        return this.kQrcode;
    }

    public EffectQRCodeTemplate(EffectQRCode effectQRCode) {
        super(null, 1, null);
        this.kQrcode = effectQRCode;
    }

    public /* synthetic */ EffectQRCodeTemplate(EffectQRCode effectQRCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectQRCode);
    }
}
