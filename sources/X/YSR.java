package X;

/* loaded from: classes16.dex */
public interface YSR {
    YSU buildVideoSourceInfo();

    void configPrepareToPlay();

    void doEnginePlay();

    void doPrepare();

    YSN generateEngineParam(boolean z);

    C48155Iv9 getVideoInfoBean();

    YSU getVideoSourceInfo();

    int getVideoViewType();

    void initVideoEngine();

    boolean prepareCalledPlayNotCalled();

    void responseBufferingUpdate(int i);

    void responseCompleted();

    void responseEngineInitPlay();

    void responseError(C47789IpF c47789IpF);

    boolean responseFetchedVideoModel(C47164IfA c47164IfA);

    void responseLoadStateChanged(int i);

    void responseOnVideoPause();

    void responseOnVideoPlay();

    void responsePlaybackStateChanged(int i);

    void responsePrepare();

    void responsePrepared();

    void responseRenderStart();

    void responseSeekComplete(boolean z);

    void responseStreamChanged(int i);

    void responseVideoEngineInfos(C47620ImW c47620ImW);

    void responseVideoSizeChanged(int i, int i2);

    void responseVideoStatusException(int i);

    void responseVideoStreamBitrateChanged(EnumC47176IfM enumC47176IfM, int i);
}
