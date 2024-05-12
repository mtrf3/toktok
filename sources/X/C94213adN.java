package X;

import com.bytedance.effectcreatormobile.objectselect.viewmodel.EffectLibViewModel;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.adN, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94213adN implements InterfaceC93663aUV<C94411agZ> {
    public final /* synthetic */ EffectLibViewModel LIZ;
    public final /* synthetic */ C93625aTt LIZIZ;
    public final /* synthetic */ long LIZJ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        this.LIZ.getClass();
        EffectLibViewModel.jv0(null, false);
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C94843anX(this, null), 3);
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(C94411agZ c94411agZ) {
        C94411agZ result = c94411agZ;
        o.LJIIIZ(result, "result");
        EffectLibViewModel effectLibViewModel = this.LIZ;
        Long valueOf = Long.valueOf(System.currentTimeMillis() - this.LIZJ);
        effectLibViewModel.getClass();
        EffectLibViewModel.jv0(valueOf, true);
        StateViewModel.hv0(this.LIZ.LJLILLLLZI, result.LJLIL);
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C94844anY(this, null), 3);
    }

    public C94213adN(EffectLibViewModel effectLibViewModel, C93625aTt c93625aTt, long j) {
        this.LIZ = effectLibViewModel;
        this.LIZIZ = c93625aTt;
        this.LIZJ = j;
    }
}
