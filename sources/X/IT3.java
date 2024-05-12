package X;

import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;

/* loaded from: classes9.dex */
public final class IT3 {
    public String LIZ;
    public VideoInfo LIZIZ;
    public C46554IOw LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayerStateManager key ");
        LIZ.append((Object) this.LIZ);
        LIZ.append(", ssid ");
        LIZ.append((Object) null);
        LIZ.append(", currentVideoInfo ");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZ(IT2 it2) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new VideoInfo();
        }
        VideoInfo videoInfo = this.LIZIZ;
        if (videoInfo == null) {
            videoInfo = null;
        } else {
            videoInfo.setAid(it2.LIZ);
            videoInfo.setPlayBitrate(it2.LJIILL);
            videoInfo.setVideoBitrate(it2.LJFF);
            videoInfo.setAudioBitrate(it2.LJI);
            videoInfo.setBitRateSet(it2.LJIIL);
            videoInfo.setVideoQuality(it2.LJIIJ);
            videoInfo.setAudioQuality(it2.LJIIJJI);
            videoInfo.setDuration(it2.LJIILJJIL);
            videoInfo.setBytevc1(it2.LJJIJ);
            videoInfo.setVideoSize(it2.LIZJ);
            videoInfo.setCodecName(String.valueOf(it2.LJIJJLI));
            videoInfo.setCodecNameStr(it2.LJIL);
            videoInfo.setCodecId(it2.LJJIIZ);
            videoInfo.setPreCacheSize(it2.LJJII);
            videoInfo.setPreloaded(it2.LJJII);
            videoInfo.setInternetSpeed(it2.LJIIIZ);
            videoInfo.setAccess2(it2.LJJIFFI);
            videoInfo.setBatterySaver(it2.LJJIIZI);
            videoInfo.setPtPredictL(it2.LJJIIJZLJL);
        }
        this.LIZIZ = videoInfo;
    }

    public final void LIZIZ(String str, ISM ism) {
        this.LIZ = str;
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.setAppId(ism.LIZ);
        videoInfo.setAppVersion(ism.LIZJ);
        videoInfo.setAid(ism.LIZIZ);
        videoInfo.setDuration(ism.LIZLLL);
        videoInfo.setHitCache(ism.LJII);
        videoInfo.setPreCacheSize(ism.LJIIIZ);
        videoInfo.setPlayBitrate(ism.LJIIL);
        videoInfo.setVideoBitrate(ism.LJIILIIL);
        videoInfo.setVideoQuality(ism.LJIILJJIL);
        videoInfo.setAudioBitrate(ism.LJIILL);
        videoInfo.setAudioQuality(ism.LJIILLIIL);
        videoInfo.setCodecName(ism.LJIIJJI);
        videoInfo.setCodecId(ism.LJIIJ);
        videoInfo.setInternetSpeed(ism.LJIIZILJ);
        videoInfo.setAccess2(ism.LJI);
        videoInfo.setEnableHdr(ism.LJIJ);
        this.LIZIZ = videoInfo;
    }

    public final void LIZJ(String str, ISM ism) {
        this.LIZ = str;
        VideoInfo videoInfo = this.LIZIZ;
        if (videoInfo == null) {
            videoInfo = null;
        } else {
            videoInfo.setAppId(ism.LIZ);
            videoInfo.setAppVersion(ism.LIZJ);
            videoInfo.setAid(ism.LIZIZ);
            videoInfo.setDuration(ism.LIZLLL);
            videoInfo.setHitCache(ism.LJII);
            videoInfo.setPreCacheSize(ism.LJIIIZ);
            videoInfo.setPlayBitrate(ism.LJIIL);
            videoInfo.setVideoBitrate(ism.LJIILIIL);
            videoInfo.setVideoQuality(ism.LJIILJJIL);
            videoInfo.setAudioBitrate(ism.LJIILL);
            videoInfo.setAudioQuality(ism.LJIILLIIL);
            videoInfo.setCodecName(ism.LJIIJJI);
            videoInfo.setCodecId(ism.LJIIJ);
            videoInfo.setInternetSpeed(ism.LJIIZILJ);
            videoInfo.setAccess2(ism.LJI);
            videoInfo.setEnableHdr(ism.LJIJ);
        }
        this.LIZIZ = videoInfo;
    }
}
