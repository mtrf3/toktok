package X;

import Y.ARunnableS11S0201000_8;
import android.app.Activity;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import com.bytedance.pia.core.bridge.channel.WebViewPort;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.FsN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC40339FsN implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        Aweme aweme;
        String aid;
        switch (this.LJLIL) {
            case 0:
                WebViewPort webViewPort = (WebViewPort) this.LJLILLLLZI;
                Boolean bool = (Boolean) this.LJLJI;
                m mVar = (m) this.LJLJJI;
                webViewPort.getClass();
                if (!bool.booleanValue()) {
                    try {
                        if (mVar.LJJIJLIJ("data")) {
                            j LJJIJ = mVar.LJJIJ("data");
                            LJJIJ.getClass();
                            if (LJJIJ instanceof m) {
                                mVar.LJJIIZ("data", mVar.LJJIJ("data").LJIIZILJ().toString());
                            }
                        }
                    } catch (Throwable th) {
                        C37238EjS.LIZLLL(4, "[Bridge] handle local message error:", th);
                    }
                }
                String jVar = mVar.toString();
                C37238EjS.LJFF(jVar);
                WebMessagePort webMessagePort = webViewPort.LIZJ;
                if (webMessagePort != null) {
                    webMessagePort.postMessage(new WebMessage(jVar));
                    return;
                } else {
                    C37613EpV.LIZIZ(new ARunnableS11S0201000_8(2, webViewPort, jVar, 5));
                    return;
                }
            case 1:
                VideoViewCell videoViewCell = (VideoViewCell) this.LJLILLLLZI;
                Object obj = this.LJLJI;
                ActivityC45651qj activity = videoViewCell.getActivity();
                if (activity == null || activity.isFinishing() || obj != videoViewCell.getAweme()) {
                    return;
                }
                EnumC111394Yt enumC111394Yt = C2NU.LIZ.LIZJ;
                if (enumC111394Yt == EnumC111394Yt.NOT_AVAILABLE) {
                    C26045AKb c26045AKb = new C26045AKb(activity);
                    c26045AKb.LJIIIIZZ(R.string.dtf);
                    c26045AKb.LJIIJ();
                    C40340FsO.LIZ(R.string.dtf);
                    return;
                }
                if (enumC111394Yt == EnumC111394Yt.FAKE) {
                    C26045AKb c26045AKb2 = new C26045AKb(activity);
                    c26045AKb2.LJIIIIZZ(R.string.dtd);
                    c26045AKb2.LJIIJ();
                    C40340FsO.LIZ(R.string.dtd);
                    return;
                }
                if (enumC111394Yt != EnumC111394Yt.AVAILABLE || (aweme = videoViewCell.getAweme()) == null || (aid = aweme.getAid()) == null) {
                    return;
                }
                C252519vb.LIZ(activity, aid);
                return;
            default:
                final MusicRecordService musicRecordService = (MusicRecordService) this.LJLILLLLZI;
                Activity activity2 = (Activity) this.LJLJI;
                final MusicModel musicModel = (MusicModel) this.LJLJJI;
                if (musicRecordService.LJFF && activity2 != null && !activity2.isFinishing()) {
                    HWH LIZIZ = HWG.LIZIZ(activity2, HWK.VISIBLE, new HWI() { // from class: X.OVB
                        @Override // X.HWI
                        public final void LIZIZ() {
                            MusicRecordService.this.LJ.LIZ(musicModel.getMusicId());
                        }
                    });
                    musicRecordService.LIZLLL = LIZIZ;
                    LIZIZ.setMessage(activity2.getResources().getString(R.string.rjz));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC40339FsN(int i, Object obj, Object obj2, Object obj3) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
    }
}
