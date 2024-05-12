package com.bytedance.android.livesdk.livesetting.level;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class FansClubLottieConfig {

    @InterfaceC65349Pkn("fans_club_entrance_finish_all_task_lottie_name")
    public String finishAllTaskLottieName;

    @InterfaceC65349Pkn("fans_club_entrance_lottie_channel")
    public String lottieChannel;

    @InterfaceC65349Pkn("fans_club_entrance_weak_guide_lottie_name")
    public String weakGuideLottieName;

    /* JADX WARN: Multi-variable type inference failed */
    public FansClubLottieConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public FansClubLottieConfig(String str, String str2, String str3) {
        this.lottieChannel = str;
        this.weakGuideLottieName = str2;
        this.finishAllTaskLottieName = str3;
    }

    public /* synthetic */ FansClubLottieConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
