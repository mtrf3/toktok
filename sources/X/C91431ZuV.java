package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.common.model.BaseDspFeedResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspMusicStruct;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.playpage.model.DspFeedResponse;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.aweme.simkit.model.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ZuV, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91431ZuV implements X8Q {
    public final /* synthetic */ long LIZ;

    @Override // X.X8Q
    public final void LIZ(Exception exception) {
        o.LJIIIZ(exception, "exception");
    }

    public C91431ZuV(long j) {
        this.LIZ = j;
    }

    @Override // X.X8Q
    public final void onSuccess(Object obj) {
        BaseDspFeedResponse baseDspFeedResponse;
        String str;
        Integer num;
        DspStruct dspStruct;
        DspMusicStruct dspMusic;
        Music music;
        UrlModel coverLarge;
        List<String> urlList;
        String str2;
        BaseResponse baseResponse;
        List<DspStruct> dspList;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("api onSuccessPreloadMusicFeedList ");
        LIZ.append(obj);
        X1D.LIZIZ(LIZ);
        String valueOf = String.valueOf(1);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZ;
        boolean z = obj instanceof DspFeedResponse;
        if (z) {
            baseDspFeedResponse = (BaseDspFeedResponse) obj;
        } else {
            baseDspFeedResponse = null;
        }
        if (baseDspFeedResponse != null && (dspList = baseDspFeedResponse.getDspList()) != null && dspList.isEmpty()) {
            str = "failed";
        } else {
            str = "success";
        }
        if ((obj instanceof BaseResponse) && (baseResponse = (BaseResponse) obj) != null) {
            num = Integer.valueOf(baseResponse.error_code);
        } else {
            num = null;
        }
        C91432ZuW.LIZ("track_reco", valueOf, "", elapsedRealtime, str, num, "preload_api", "/tiktok/music/dsp/feed/get/v2/");
        if (z) {
            DspFeedResponse dspFeedResponse = (DspFeedResponse) obj;
            if (dspFeedResponse.getDspList().isEmpty()) {
                PowerPreloadServiceImpl.LIZIZ().LIZ("/tiktok/music/dsp/feed/get/v2/", null);
                return;
            }
            if (C91432ZuW.LJLIL) {
                return;
            }
            BaseDspFeedResponse baseDspFeedResponse2 = (BaseDspFeedResponse) obj;
            C91432ZuW.LIZLLL(baseDspFeedResponse2);
            if (YBK.LIZ().firstFrameOpt.getEnableLocalCache()) {
                C91237ZrN.LIZJ((C1E4.LJIIZILJ() * 1000) + YBK.LIZ().firstFrameOpt.getPreloadTtl());
                AbstractC73672Svk.LJJIJIL(dspFeedResponse).LJJIJL(new C91427ZuR(dspFeedResponse)).LJJL(T16.LIZ()).LJJJLIIL(C91428ZuS.LJLIL, C91429ZuT.LJLIL);
            } else {
                AbstractC73672Svk.LJJIJIL(Boolean.FALSE).LJJIJL(C91424ZuO.LJLIL).LJJL(T16.LIZ()).LJJJLIIL(C91425ZuP.LJLIL, C91426ZuQ.LJLIL);
            }
            C91237ZrN.LIZ = true;
            YXW.LIZ.getClass();
            if (!YXW.LJFF || (dspStruct = (DspStruct) ORZ.LJLLLLLL(0, baseDspFeedResponse2.getDspList())) == null || (dspMusic = dspStruct.getDspMusic()) == null || (music = dspMusic.getMusic()) == null || (coverLarge = music.getCoverLarge()) == null || (urlList = coverLarge.getUrlList()) == null || (str2 = (String) ORZ.LJLLLL(urlList)) == null) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("preload url ");
            LIZ2.append(str2);
            X1D.LIZIZ(LIZ2);
            W5U.LJIIIIZZ(str2).LJI();
        }
    }
}
