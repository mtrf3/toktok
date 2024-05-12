package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* loaded from: classes9.dex */
public interface JGK extends OnUIPlayListener, InterfaceC48907JHj {
    void LLLJIL();

    void LLLLLJLJLL();

    void Wf(int i);

    void contextPause();

    void contextResume();

    void g9();

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onBuffering(boolean z);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onDecoderBuffering(boolean z);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPausePlay(String str);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPlayCompleted(String str);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPlayCompletedFirstTime(String str);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPlayFailed(IPG ipg);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPlayProgressChange(float f);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPreparePlay(String str);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onRenderFirstFrame(IT4 it4);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onResumePlay(String str);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onRetryOnError(IPG ipg);
}
