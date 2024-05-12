package com.ss.android.ugc.aweme.dsp.playpage.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class DspMusicPlayedInfo extends F9E {
    public transient long LJLIL;

    @InterfaceC65349Pkn("duration_pct")
    public final int durationPct;

    @InterfaceC65349Pkn("full_clip_id")
    public final String fullClipId;

    @InterfaceC65349Pkn("played_seconds")
    public final int playedSeconds;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DspMusicPlayedInfo() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 7
            r0 = r6
            r3 = r2
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.model.DspMusicPlayedInfo.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.fullClipId, Integer.valueOf(this.playedSeconds), Integer.valueOf(this.durationPct)};
    }

    public DspMusicPlayedInfo(String fullClipId, int i, int i2) {
        o.LJIIIZ(fullClipId, "fullClipId");
        this.fullClipId = fullClipId;
        this.playedSeconds = i;
        this.durationPct = i2;
    }

    public /* synthetic */ DspMusicPlayedInfo(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
