package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Efh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37005Efh implements InterfaceC36765Ebp {
    public C36760Ebk LIZ;
    public final WeakReference<InterfaceC37007Efj> LIZIZ;
    public final InterfaceC37002Efe LIZJ;

    @Override // X.InterfaceC36765Ebp
    public final void LIZ(C36754Ebe c36754Ebe) {
        EnumC36761Ebl enumC36761Ebl;
        C36760Ebk c36760Ebk = this.LIZ;
        if (c36760Ebk == null || (enumC36761Ebl = c36760Ebk.LIZJ) == null) {
            enumC36761Ebl = EnumC36761Ebl.FALLBACK;
        }
        c36754Ebe.LJFF = enumC36761Ebl.ordinal();
        InterfaceC37007Efj interfaceC37007Efj = this.LIZIZ.get();
        if (interfaceC37007Efj != null) {
            if (interfaceC37007Efj instanceof C37011Efn) {
                ((C37011Efn) interfaceC37007Efj).LIZ(c36754Ebe);
            } else {
                interfaceC37007Efj.LJ(c36754Ebe.LIZIZ());
            }
        }
    }

    public final void LIZIZ(JSONObject params) {
        o.LJIIJ(params, "params");
        C36760Ebk LIZIZ = this.LIZJ.LIZIZ(new C36758Ebi(params), this);
        this.LIZ = LIZIZ;
        if (LIZIZ != null) {
            LIZIZ.LIZJ(this);
        }
    }

    @Override // X.InterfaceC36765Ebp
    public final void onFailed(Throwable throwable) {
        o.LJIIJ(throwable, "throwable");
        InterfaceC37007Efj interfaceC37007Efj = this.LIZIZ.get();
        if (interfaceC37007Efj != null) {
            interfaceC37007Efj.onFailed(throwable);
        }
    }

    public C37005Efh(InterfaceC37002Efe prefetchProcessor, InterfaceC37007Efj resultListener) {
        o.LJIIJ(prefetchProcessor, "prefetchProcessor");
        o.LJIIJ(resultListener, "resultListener");
        this.LIZJ = prefetchProcessor;
        this.LIZIZ = new WeakReference<>(resultListener);
    }
}
