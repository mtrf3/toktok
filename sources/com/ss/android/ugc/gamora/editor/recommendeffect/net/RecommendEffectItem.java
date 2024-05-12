package com.ss.android.ugc.gamora.editor.recommendeffect.net;

import X.C43588H8u;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class RecommendEffectItem {
    public String LIZ;
    public final boolean LIZIZ;

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl;

    @InterfaceC65349Pkn("effect_id")
    public String id;

    @InterfaceC65349Pkn("tt_prop")
    public final int isTTProp;

    @InterfaceC65349Pkn("location_city")
    public final String locationCity;

    @InterfaceC65349Pkn("need_replay")
    public final boolean needReplay;

    @InterfaceC65349Pkn("nle_model")
    public final String nleModel;

    @InterfaceC65349Pkn("score")
    public final float score;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecommendEffectItem() {
        /*
            r12 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r2 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r3
            r9 = r3
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem.<init>():void");
    }

    public RecommendEffectItem(String str, String str2, boolean z, float f, String str3, String str4, String str5, int i, boolean z2) {
        C43588H8u.LIZLLL(str, "id", str2, "name", str3, "nleModel", str4, "iconUrl");
        this.id = str;
        this.LIZ = str2;
        this.needReplay = z;
        this.score = f;
        this.nleModel = str3;
        this.iconUrl = str4;
        this.locationCity = str5;
        this.isTTProp = i;
        this.LIZIZ = z2;
    }

    public /* synthetic */ RecommendEffectItem(String str, String str2, boolean z, float f, String str3, String str4, String str5, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "this is a effect" : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? "" : str3, (i2 & 32) == 0 ? str4 : "", (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? 0 : i, (i2 & 256) == 0 ? z2 : false);
    }
}
