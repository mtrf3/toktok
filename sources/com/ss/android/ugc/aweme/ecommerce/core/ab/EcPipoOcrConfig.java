package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class EcPipoOcrConfig extends F9E {

    @InterfaceC65349Pkn("enable_name")
    public final int enableName;

    @InterfaceC65349Pkn("ocr_mode")
    public final int ocrMode;

    @InterfaceC65349Pkn("show_protection_tips")
    public final int showProtectionTips;

    @InterfaceC65349Pkn("ui_type")
    public final int uiType;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EcPipoOcrConfig() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.ab.EcPipoOcrConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.uiType), Integer.valueOf(this.showProtectionTips), Integer.valueOf(this.ocrMode), Integer.valueOf(this.enableName)};
    }

    public EcPipoOcrConfig(int i, int i2, int i3, int i4) {
        this.uiType = i;
        this.showProtectionTips = i2;
        this.ocrMode = i3;
        this.enableName = i4;
    }

    public /* synthetic */ EcPipoOcrConfig(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
