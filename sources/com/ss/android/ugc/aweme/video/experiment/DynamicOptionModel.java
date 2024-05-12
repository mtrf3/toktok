package com.ss.android.ugc.aweme.video.experiment;

import X.C46898Ias;
import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class DynamicOptionModel {

    @InterfaceC65349Pkn("reversal")
    public int enableReversal;

    @InterfaceC65349Pkn("key")
    public int key;

    @InterfaceC65349Pkn("libra_key")
    public String libraKey;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    @InterfaceC65349Pkn("type")
    public int type;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DynamicOptionModel() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.experiment.DynamicOptionModel.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicOptionModel)) {
            return false;
        }
        DynamicOptionModel dynamicOptionModel = (DynamicOptionModel) obj;
        return o.LJ(this.libraKey, dynamicOptionModel.libraKey) && this.key == dynamicOptionModel.key && this.type == dynamicOptionModel.type && this.scene == dynamicOptionModel.scene && this.enableReversal == dynamicOptionModel.enableReversal;
    }

    public final int hashCode() {
        String str = this.libraKey;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.key) * 31) + this.type) * 31) + this.scene) * 31) + this.enableReversal;
    }

    public final C46898Ias LIZ() {
        C46898Ias c46898Ias = new C46898Ias();
        c46898Ias.LIZ = this.key;
        c46898Ias.LIZJ = this.type;
        c46898Ias.LIZLLL = this.scene;
        return c46898Ias;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicOptionModel(libraKey=");
        LIZ.append(this.libraKey);
        LIZ.append(", key=");
        LIZ.append(this.key);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", scene=");
        LIZ.append(this.scene);
        LIZ.append(", enableReversal=");
        return b0.LIZJ(LIZ, this.enableReversal, ')', LIZ);
    }

    public DynamicOptionModel(String str, int i, int i2, int i3, int i4) {
        this.libraKey = str;
        this.key = i;
        this.type = i2;
        this.scene = i3;
        this.enableReversal = i4;
    }

    public /* synthetic */ DynamicOptionModel(String str, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) == 0 ? i3 : 0, (i5 & 16) != 0 ? 1 : i4);
    }
}
