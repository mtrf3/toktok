package X;

import android.os.SystemClock;
import com.google.gson.j;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModelV2$2$1$1$1", f = "CaptionViewModelV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.39b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C792339b extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C77090UNi LJLIL;
    public final /* synthetic */ j LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C792339b(C77090UNi c77090UNi, j jVar, InterfaceC67352kd<? super C792339b> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c77090UNi;
        this.LJLILLLLZI = jVar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C792339b(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        UO1 uo1 = this.LJLIL.LJLJI;
        long LJIJJLI = this.LJLILLLLZI.LJIJJLI();
        C792439c c792439c = uo1.LIZ;
        c792439c.LIZIZ = LJIJJLI;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c792439c.LIZLLL = elapsedRealtime;
        if (c792439c.LIZ == 0 || c792439c.LIZJ == 0) {
            c792439c.LIZ = c792439c.LIZIZ;
            c792439c.LIZJ = elapsedRealtime;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) c792439c.LJ).iterator();
        while (it.hasNext()) {
            AbstractC792639e abstractC792639e = (AbstractC792639e) it.next();
            long j = c792439c.LIZIZ;
            if (abstractC792639e.LIZLLL == 0) {
                abstractC792639e.LIZLLL = j;
            }
            if (j - abstractC792639e.LIZLLL > abstractC792639e.LIZJ) {
                abstractC792639e.LIZ();
                if (abstractC792639e instanceof UOD) {
                    arrayList.add(abstractC792639e);
                }
            }
        }
        ((ArrayList) c792439c.LJ).removeAll(arrayList);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
