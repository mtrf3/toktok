package com.ss.android.ugc.aweme.dsp.experiment;

import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class MusicDspConfig {

    @InterfaceC65349Pkn("enable_music_seek_bar")
    public final boolean enableMusicSeekBar;

    @InterfaceC65349Pkn("should_bring_up_service")
    public final boolean shouldBringUpService;

    @InterfaceC65349Pkn("try_fix_service_bug")
    public final boolean tryToFixServiceBug;

    @InterfaceC65349Pkn("copyright_restrictions")
    public final CopyrightRestrictions copyrightRestrictions = new CopyrightRestrictions();

    @InterfaceC65349Pkn("enable_comment")
    public final boolean enableComment = true;

    @InterfaceC65349Pkn("open_resso_links")
    public final OpenRessoLinks links = new OpenRessoLinks();

    @InterfaceC65349Pkn("enable_retry_play")
    public final boolean enableRetryPlay = true;

    @InterfaceC65349Pkn("player_opt")
    public final PlayerOpt playerOpt = new PlayerOpt();

    @InterfaceC65349Pkn("music_dsp_opt")
    public final MusicDspOpt enableMusicDspOPT = new MusicDspOpt();

    @InterfaceC65349Pkn("first_frame_opt")
    public final FirstFrameOpt firstFrameOpt = new FirstFrameOpt();

    @InterfaceC65349Pkn("ugc_collect")
    public final UgcCollect ugcCollect = new UgcCollect();

    @InterfaceC65349Pkn("audio_feedback_config")
    public final DspFeedbackConfig feedbackConfig = new DspFeedbackConfig();

    @InterfaceC65349Pkn("fix_audio_play_bug")
    public final boolean fixAudioPlayBug = true;

    @InterfaceC65349Pkn("fix_crosstalk_bug")
    public final boolean fixCrosstalkBug = true;

    @InterfaceC65349Pkn("fix_add_node_show")
    public final boolean fixAddNodeShow = true;

    @InterfaceC65349Pkn("notification_pic_33")
    public final boolean notificationPicOn33 = true;
}
