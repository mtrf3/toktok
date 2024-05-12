package Y;

import X.C05630Jz;
import X.C0NB;
import X.C15380j0;
import X.C276516r;
import X.C30868C9o;
import X.C31012CFc;
import X.C74824TYe;
import X.C75600Tlk;
import X.C76271TwZ;
import X.InterfaceC64592gB;
import X.X1D;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class AfS5S0000100_13 implements InterfaceC64592gB {
    public final int $t;
    public long j0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS5S0000100_13(long j, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                this.j0 = j;
                return;
            default:
                this.j0 = j;
                return;
        }
    }

    public static final void accept$0(AfS5S0000100_13 afS5S0000100_13, Object obj) {
        C74824TYe.LJJLIIIJILLIZJL(C31012CFc.LIZIZ() - afS5S0000100_13.j0, "list_by_type", null, (Throwable) obj);
    }

    public static final void accept$1(AfS5S0000100_13 afS5S0000100_13, Object obj) {
        Throwable it = (Throwable) obj;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        long j = afS5S0000100_13.j0;
        o.LJIIIIZZ(it, "it");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C76271TwZ.LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C76271TwZ.LJJII(jSONObject, jSONObject2, it);
        C76271TwZ.LJJZZIII(c76271TwZ, "quit_failed", jSONObject, jSONObject2, jSONObject3, false, 16);
        if ((it instanceof C276516r) && ((C276516r) it).getErrorCode() == 4029001) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.myr));
        }
    }

    public static final void accept$2(AfS5S0000100_13 afS5S0000100_13, Object obj) {
        C74824TYe.LJJLIIIJILLIZJL(C31012CFc.LIZIZ() - afS5S0000100_13.j0, "list_by_type", null, (Throwable) obj);
    }

    public static final void accept$3(AfS5S0000100_13 afS5S0000100_13, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startCountDown, uid = ");
        LIZ.append(afS5S0000100_13.j0);
        LIZ.append(", throwable = ");
        LIZ.append(obj);
        C0NB.LJIIIZ("MultiCoHostTimeOut", X1D.LIZIZ(LIZ));
    }

    public static final void accept$4(AfS5S0000100_13 afS5S0000100_13, Object obj) {
        new C75600Tlk().LJIJ(afS5S0000100_13.j0, (Throwable) obj);
    }
}
