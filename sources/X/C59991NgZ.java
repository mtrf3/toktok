package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.bytedance.ies.ugc.aweme.rich.impression.impl.staticviewability.StaticImpressionSDKService$shouldSendEvent$1$1", f = "StaticImpressionSDKService.kt", l = {84}, m = "invokeSuspend")
/* renamed from: X.NgZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59991NgZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ NBY LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ C59885Ner LJLJJL;
    public final /* synthetic */ OSZ<Float, Integer> LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ InterfaceC59990NgY LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59991NgZ(NBY nby, int i, int i2, C59885Ner c59885Ner, OSZ<Float, Integer> osz, long j, String str, InterfaceC59990NgY interfaceC59990NgY, InterfaceC67352kd<? super C59991NgZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = nby;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = c59885Ner;
        this.LJLJJLL = osz;
        this.LJLJL = j;
        this.LJLJLJ = str;
        this.LJLJLLL = interfaceC59990NgY;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59991NgZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        MBA mba;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            if (this.LJLILLLLZI.LIZ) {
                mba = C36636EZk.LIZ.LJJIJIL();
            } else {
                mba = C78613UtF.LIZ;
            }
            C59992Nga c59992Nga = new C59992Nga(this.LJLJJL, null);
            this.LJLIL = 1;
            obj2 = XKX.LJI(mba, c59992Nga, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        OSZ osz = (OSZ) obj2;
        float floatValue = ((Number) osz.getFirst()).floatValue();
        long longValue = ((Number) osz.getSecond()).longValue();
        int i2 = this.LJLJI * this.LJLJJI;
        ArrayList arrayList = new ArrayList();
        ArrayList<C59993Ngb> arrayList2 = this.LJLJJL.LJFF;
        boolean z = false;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator<C59993Ngb> it = this.LJLJJL.LJFF.iterator();
            while (it.hasNext()) {
                C59993Ngb next = it.next();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(next.LIZ);
                LIZ.append(", ");
                LIZ.append(next.LIZIZ);
                LIZ.append(", ");
                LIZ.append(next.LIZJ - next.LIZ);
                LIZ.append(", ");
                LIZ.append(next.LIZLLL - next.LIZIZ);
                String LIZIZ = X1D.LIZIZ(LIZ);
                String str = next.LJ;
                if (str == null) {
                    str = "";
                }
                arrayList.add(new C60001Ngj(LIZIZ, str, next.LIZ() / i2));
            }
        }
        if (floatValue >= this.LJLJJLL.getSecond().intValue()) {
            z = true;
        }
        long j = this.LJLJL;
        float f = i2;
        this.LJLJLLL.LIZ(new C60002Ngk(z, j + longValue, j, longValue, this.LJLJLJ, floatValue, f - floatValue, this.LJLJJLL.getFirst().floatValue(), floatValue / f, arrayList));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
