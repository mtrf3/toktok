package X;

import android.text.TextUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Tvz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76235Tvz<T> implements InterfaceC64592gB {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C76280Twi LJLJJI;
    public final /* synthetic */ C76234Tvy LJLJJL;

    public C76235Tvz(AqS163S0100000_13 aqS163S0100000_13, int i, long j, C76280Twi c76280Twi, C76234Tvy c76234Tvy) {
        this.LJLIL = aqS163S0100000_13;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = c76280Twi;
        this.LJLJJL = c76234Tvy;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable throwable = (Throwable) obj;
        this.LJLIL.invoke();
        C76265TwT.LJIIIIZZ = -1L;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        int i = this.LJLILLLLZI;
        long j = this.LJLJI;
        o.LJIIIIZZ(throwable, "throwable");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(i, "invite_type", jSONObject);
        boolean z = true;
        C05630Jz.LIZ(1, "team_id", jSONObject);
        C05630Jz.LJI(jSONObject, "role_type", "inviter");
        C05630Jz.LJFF(jSONObject, "teammate_id", j);
        if (i != 1) {
            z = false;
        }
        C76271TwZ.LJJ(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C76271TwZ.LJJII(jSONObject, jSONObject2, throwable);
        C05630Jz.LJI(jSONObject2, "role_type", "inviter");
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "cost", C30725C4b.LIZ() - C76271TwZ.LIZJ);
        c76271TwZ.LJL("invite_failed", jSONObject, jSONObject2, jSONObject3, false);
        if (throwable instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) throwable;
            if (!TextUtils.isEmpty(c29401Dk.getPrompt())) {
                C30868C9o.LJI(c29401Dk.getPrompt());
            } else {
                C30868C9o.LIZJ(R.string.mpi);
            }
            if (this.LJLJJI.LJ() == EnumC76178Tv4.INVITED) {
                this.LJLJJI.LJIIIZ("invite_failed", this.LJLJJL.LJLJJI.LIZLLL);
                return;
            }
            return;
        }
        this.LJLJJI.LJIIIZ("invite_failed", this.LJLJJL.LJLJJI.LIZLLL);
        C30868C9o.LIZJ(R.string.sqr);
    }
}
