package X;

import android.app.Application;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes16.dex */
public final class XFG implements IFetchResourceListener {
    public final /* synthetic */ n<Effect> LJLIL;
    public final /* synthetic */ com.ss.ugc.effectplatform.model.Effect LJLILLLLZI;

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public final void onFailure(Exception exception) {
        o.LJIIIZ(exception, "exception");
        this.LJLIL.LIZIZ(exception);
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public final void onSuccess(long j) {
        Effect effect = new Effect(this.LJLILLLLZI);
        Application application = C44172HVg.LIZ;
        o.LJIIIIZZ(application, "application");
        C84488XDw.LIZ(application, null).fetchEffect(effect, new XFH(this.LJLIL));
    }

    public XFG(n<Effect> nVar, com.ss.ugc.effectplatform.model.Effect effect) {
        this.LJLIL = nVar;
        this.LJLILLLLZI = effect;
    }
}
