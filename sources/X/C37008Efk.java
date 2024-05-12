package X;

import Y.ARunnableS25S0200000_6;
import Y.ARunnableS42S0100000_6;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Efk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37008Efk implements InterfaceC37007Efj {
    public final /* synthetic */ ARunnableS25S0200000_6 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC37002Efe LJLJI;
    public final /* synthetic */ C68322mC LJLJJI;

    @Override // X.InterfaceC37007Efj
    public final void LJ(JSONObject jSONObject) {
        if (this.LJLILLLLZI) {
            ARunnableS42S0100000_6 aRunnableS42S0100000_6 = new ARunnableS42S0100000_6(this, 168);
            Executor executor = C36982EfK.LIZJ;
            if (executor != null) {
                executor.execute(aRunnableS42S0100000_6);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        ((C37012Efo) this.LJLIL.l1).LJ(jSONObject);
        C37009Efl.LIZIZ.remove(this);
    }

    @Override // X.InterfaceC37007Efj
    public final void onFailed(Throwable throwable) {
        o.LJIIJ(throwable, "throwable");
        ((C37012Efo) this.LJLIL.l1).onFailed(throwable);
        C37009Efl.LIZIZ.remove(this);
    }

    public C37008Efk(ARunnableS25S0200000_6 aRunnableS25S0200000_6, boolean z, InterfaceC37002Efe interfaceC37002Efe, C68322mC c68322mC) {
        this.LJLIL = aRunnableS25S0200000_6;
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC37002Efe;
        this.LJLJJI = c68322mC;
    }
}
