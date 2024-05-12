package com.bytedance.android.livesdk.livesetting.game;

import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameLiveFeedbackLabelIds {

    @InterfaceC65349Pkn("game_freezing_or_high_ping")
    public String game_freezing_or_high_ping;

    @InterfaceC65349Pkn("low_audio_quality")
    public String low_audio_quality;

    @InterfaceC65349Pkn("video_buffering_or_freezing")
    public String video_buffering_or_freezing;

    /* JADX WARN: Multi-variable type inference failed */
    public GameLiveFeedbackLabelIds() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final String getGame_freezing_or_high_ping() {
        return this.game_freezing_or_high_ping;
    }

    public final String getLow_audio_quality() {
        return this.low_audio_quality;
    }

    public final String getVideo_buffering_or_freezing() {
        return this.video_buffering_or_freezing;
    }

    public final void setGame_freezing_or_high_ping(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.game_freezing_or_high_ping = str;
    }

    public final void setLow_audio_quality(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.low_audio_quality = str;
    }

    public final void setVideo_buffering_or_freezing(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.video_buffering_or_freezing = str;
    }

    public GameLiveFeedbackLabelIds(String str, String str2, String str3) {
        HH1.LIZ(str, "game_freezing_or_high_ping", str2, "video_buffering_or_freezing", str3, "low_audio_quality");
        this.game_freezing_or_high_ping = str;
        this.video_buffering_or_freezing = str2;
        this.low_audio_quality = str3;
    }

    public /* synthetic */ GameLiveFeedbackLabelIds(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "7196884519075446785" : str, (i & 2) != 0 ? "71968845215375196181" : str2, (i & 4) != 0 ? "71968845215375196183" : str3);
    }
}
