package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.WmP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83285WmP implements IFetchEffectListener {
    public final /* synthetic */ C83217WlJ LIZ;
    public final /* synthetic */ InterfaceC83286WmQ LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LIZIZ.LIZIZ(this.LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZIZ.LIZJ(this.LIZ);
    }

    public C83285WmP(C83217WlJ c83217WlJ, C83310Wmo c83310Wmo) {
        this.LIZ = c83217WlJ;
        this.LIZIZ = c83310Wmo;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        this.LIZIZ.LIZ(this.LIZ);
    }
}
