package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeRequestMessageActionHandler$handle$2", f = "KaraokeRequestMessageActionHandler.kt", l = {60, 81}, m = "invokeSuspend")
/* renamed from: X.2Bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54422Bq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C07580Rm LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C31171Kf LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54422Bq(C07580Rm c07580Rm, long j, C31171Kf c31171Kf, InterfaceC67352kd<? super C54422Bq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c07580Rm;
        this.LJLJI = j;
        this.LJLJJI = c31171Kf;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54422Bq(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C279917z LJ;
        List<C279917z> list;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLILLLLZI.LIZLLL);
            LIZ.append(", ");
            LIZ.append(this.LJLILLLLZI.LIZJ.LJIILIIL());
            LIZ.append(", ");
            LIZ.append(this.LJLILLLLZI.LJFF);
            LIZ.append(", ");
            LIZ.append(this.LJLILLLLZI.LJI.invoke().booleanValue());
            C0NB.LIZIZ("KReddot", X1D.LIZIZ(LIZ));
            if (this.LJLILLLLZI.LIZLLL > 0 && this.LJLILLLLZI.LIZJ.LJIILIIL()) {
                C07580Rm c07580Rm = this.LJLILLLLZI;
                if (c07580Rm.LJFF == this.LJLJI && c07580Rm.LJI.invoke().booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C07580Rm c07580Rm2 = this.LJLILLLLZI;
                    C07560Rk c07560Rk = c07580Rm2.LIZ;
                    C1LG c1lg = new C1LG((int) c07580Rm2.LIZLLL);
                    this.LJLIL = 1;
                    if (c07560Rk.LIZ(c1lg, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
        }
        this.LJLILLLLZI.LIZJ.LJIIJ = this.LJLJJI.LIZ;
        if (!this.LJLJJI.LIZJ.isEmpty()) {
            C0EY LJIIJ = this.LJLILLLLZI.LIZJ.LJIIJ(this.LJLJI);
            List<C279917z> list2 = this.LJLJJI.LIZJ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
            for (C279917z c279917z : list2) {
                C279917z c279917z2 = null;
                if (LJIIJ != null && (list = LJIIJ.LIZJ) != null) {
                    Iterator<C279917z> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C279917z next = it.next();
                        if (o.LJ(next, c279917z)) {
                            c279917z2 = next;
                            break;
                        }
                    }
                    c279917z2 = c279917z2;
                }
                if (c279917z2 != null) {
                    LJ = c279917z.LJ(c279917z2.LJIIL).LIZIZ(c279917z2.LJIIJJI);
                } else {
                    LJ = c279917z.LJ(false);
                }
                arrayList.add(LJ);
            }
            List LLJI = ORZ.LLJI(arrayList);
            C0EV c0ev = this.LJLILLLLZI.LIZJ;
            long j = this.LJLJI;
            C0EY LIZ2 = C0EX.LIZ(LLJI.size(), false, LLJI);
            synchronized (c0ev) {
                c0ev.LJ.put(Long.valueOf(j), LIZ2);
            }
            C07580Rm c07580Rm3 = this.LJLILLLLZI;
            long j2 = c07580Rm3.LJFF;
            long j3 = this.LJLJI;
            if (j2 == j3) {
                C07560Rk c07560Rk2 = c07580Rm3.LIZ;
                C1LT c1lt = new C1LT(j3, LLJI);
                this.LJLIL = 2;
                if (c07560Rk2.LIZ(c1lt, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
