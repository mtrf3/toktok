package com.bytedance.android.livesdk.livesetting.level;

import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class FansEntranceResConfig {

    @InterfaceC65349Pkn("entrance_webp_animation")
    public String entranceAnimFileName;

    @InterfaceC65349Pkn("entrance_lottie_animation")
    public String entranceLottieFileName;

    @InterfaceC65349Pkn("fans_grade")
    public int fansGrade;

    @InterfaceC65349Pkn("gecko_channel")
    public String geckoChannel;

    /* JADX WARN: Multi-variable type inference failed */
    public FansEntranceResConfig() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public FansEntranceResConfig(int i, String str, String str2, String str3) {
        HH1.LIZ(str, "entranceAnimFileName", str2, "entranceLottieFileName", str3, "geckoChannel");
        this.fansGrade = i;
        this.entranceAnimFileName = str;
        this.entranceLottieFileName = str2;
        this.geckoChannel = str3;
    }

    public /* synthetic */ FansEntranceResConfig(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
