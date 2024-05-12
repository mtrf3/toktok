package X;

import Y.ARunnableS32S0200000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Twv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76293Twv<T> implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C76278Twg LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    public C76293Twv(int i, C76278Twg c76278Twg, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, long j, boolean z, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = c76278Twg;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = j;
        this.LJLJJL = z;
        this.LJLJJLL = i2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        if (this.LJLIL >= 6) {
            if (C76265TwT.LIZ.LJ() == EnumC76178Tv4.FINISH) {
                C76278Twg.LJJIJIIJI(this.LJLILLLLZI, "multi_finish_retry", 6);
                return;
            }
            return;
        }
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = this.LJLIL + 1;
        if ((throwable instanceof C276516r) && ((C276516r) throwable).getErrorCode() == 4029004) {
            c76732zl.element = 0;
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C76278Twg c76278Twg = this.LJLILLLLZI;
        c76278Twg.LJIIJ = false;
        if (c76278Twg.LIZLLL == 0) {
            return;
        }
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        long j = this.LJLJJI;
        boolean z = this.LJLJJL;
        int i = this.LJLJJLL;
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(z ? 1 : 0, "cut_short", jSONObject);
        C05630Jz.LIZ(i, "source", jSONObject);
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C76271TwZ.LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C76271TwZ.LJJII(jSONObject, jSONObject2, throwable);
        c76271TwZ.LJJIII(jSONObject, true);
        C76271TwZ.LJJZZIII(c76271TwZ, "battle_finish_failed", jSONObject, jSONObject2, jSONObject3, false, 16);
        C0NB.LJIIIZ("MultiMatchViewAnchorPre", "finish, failed");
        this.LJLILLLLZI.LJIIIIZZ(throwable);
        if (this.LJLILLLLZI.LJIIJJI || C76265TwT.LIZ.LIZ(EnumC76178Tv4.PUNISH) || this.LJLJJL) {
            return;
        }
        C76278Twg c76278Twg2 = this.LJLILLLLZI;
        c76278Twg2.LJIIZILJ.postDelayed(new ARunnableS32S0200000_13(c76278Twg2, c76732zl, 53), 1000L);
    }
}
