package com.ss.android.ugc.aweme.audiomode.fullepisodev2.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class FullEpisodeConfig extends F9E {

    @InterfaceC65349Pkn("show_podcast_preview_entrance")
    public final int isShowEntryOnFYP;

    @InterfaceC65349Pkn("show_profile_podcast_entrance_for_creators")
    public final int isShownInProfile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FullEpisodeConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.audiomode.fullepisodev2.experiment.FullEpisodeConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.isShowEntryOnFYP), Integer.valueOf(this.isShownInProfile)};
    }

    public FullEpisodeConfig(int i, int i2) {
        this.isShowEntryOnFYP = i;
        this.isShownInProfile = i2;
    }

    public /* synthetic */ FullEpisodeConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
