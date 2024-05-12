package X;

import android.app.Application;
import com.ss.android.ugc.aweme.services.ttep.IDownloadCallback;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.ugc.effectplatform.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XFE implements IFetchResourceListener {
    public final /* synthetic */ IDownloadCallback LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public final void onFailure(Exception exception) {
        o.LJIIIZ(exception, "exception");
        this.LJLIL.onFail(-10, "", exception);
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public final void onSuccess(long j) {
        com.ss.android.ugc.effectmanager.effect.model.Effect effect = new com.ss.android.ugc.effectmanager.effect.model.Effect(this.LJLILLLLZI);
        Application application = C44172HVg.LIZ;
        o.LJIIIIZZ(application, "application");
        C84488XDw.LIZ(application, null).fetchEffect(effect, new XFI(this.LJLIL));
    }

    public XFE(IDownloadCallback iDownloadCallback, Effect effect) {
        this.LJLIL = iDownloadCallback;
        this.LJLILLLLZI = effect;
    }
}
