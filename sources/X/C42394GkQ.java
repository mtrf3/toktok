package X;

import Y.ACallableS110S0100000_7;
import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import kotlin.jvm.internal.o;

/* renamed from: X.GkQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42394GkQ implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ C42393GkP LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Aweme LIZJ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        this.LIZ.LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
        if (!MEX.LJFF()) {
            C10K.LIZIZ(new ACallableS110S0100000_7(this.LIZ, 49), C10K.LJIIIIZZ, null);
        }
        C42393GkP c42393GkP = this.LIZ;
        String str = c42393GkP.LJI;
        if (str != null) {
            String str2 = c42393GkP.LJII;
            if (str2 != null) {
                String str3 = c42393GkP.LJIIIIZZ;
                if (str3 != null) {
                    ChangeBanMusicConfig changeBanMusicConfig = new ChangeBanMusicConfig(str, str2, str3, c42393GkP.LJIIIZ, this.LIZIZ);
                    changeBanMusicConfig.setOutputDir(this.LIZ.LJIIJ);
                    IRecordService recordService = service.uiService().recordService();
                    Aweme aweme = this.LIZJ;
                    C42393GkP c42393GkP2 = this.LIZ;
                    Activity activity = c42393GkP2.LIZ;
                    if (activity != null) {
                        recordService.startChangeBanMusic(aweme, activity, changeBanMusicConfig, c42393GkP2.LJIILJJIL, c42393GkP2.LIZIZ);
                        return;
                    } else {
                        o.LJIJI("mContext");
                        throw null;
                    }
                }
                o.LJIJI("mTempWavPath");
                throw null;
            }
            o.LJIJI("mTempMp4Path");
            throw null;
        }
        o.LJIJI("mOutPath");
        throw null;
    }

    public C42394GkQ(Aweme aweme, C42393GkP c42393GkP, String str) {
        this.LIZ = c42393GkP;
        this.LIZIZ = str;
        this.LIZJ = aweme;
    }
}
