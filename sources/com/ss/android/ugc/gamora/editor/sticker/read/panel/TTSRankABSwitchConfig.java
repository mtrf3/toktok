package com.ss.android.ugc.gamora.editor.sticker.read.panel;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class TTSRankABSwitchConfig {

    @InterfaceC65349Pkn("tts_panel_use_new_voice_logic")
    public final boolean useNewVoiceLogic;

    @InterfaceC65349Pkn("tts_panel_use_new_voice_logic_time")
    public final long useNewVoiceLogicTime;

    @InterfaceC65349Pkn("tts_panel_use_recently_logic")
    public final boolean useRecentlyLogic;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TTSRankABSwitchConfig() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 7
            r6 = 0
            r0 = r7
            r2 = r1
            r0.<init>(r1, r2, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSRankABSwitchConfig.<init>():void");
    }

    public TTSRankABSwitchConfig(boolean z, boolean z2, long j) {
        this.useRecentlyLogic = z;
        this.useNewVoiceLogic = z2;
        this.useNewVoiceLogicTime = j;
    }

    public /* synthetic */ TTSRankABSwitchConfig(boolean z, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? 604800L : j);
    }
}
