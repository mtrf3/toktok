package X;

import kotlin.jvm.internal.AqS74S1100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Hae, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44336Hae extends AbstractC44341Haj {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public boolean LJLJJLL;

    static {
        TBT tbt = new TBT(C44336Hae.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C44336Hae.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0, c65351Pkp)};
    }

    @Override // X.AbstractC44341Haj
    public final long LIZ() {
        return 1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44336Hae(C82622Wbi context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJLJJI = UCI.LJI(this.LJLIL, ActivityC45651qj.class, null);
        this.LJLJJL = UCI.LJI(this.LJLIL, C44343Hal.class, null);
    }

    @Override // X.AbstractC44341Haj
    public final void LIZIZ(int i, long j, String str) {
        String optString;
        if (str == null || this.LJLJJLL || (optString = new JSONObject(str).optString("session_url")) == null || optString.length() == 0) {
            return;
        }
        this.LJLJJLL = true;
        LIZJ(new AqS74S1100000_7(this, optString, 16));
        ((C44343Hal) this.LJLJJL.LIZ(this, LJLJL[1])).LJ().LIZ(i, 2L, j, "");
    }
}
