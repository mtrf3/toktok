package X;

import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.HaZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44331HaZ extends AbstractC44341Haj {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public final C82632Wbs LJLJJI;

    static {
        TBT tbt = new TBT(C44331HaZ.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC44341Haj
    public final long LIZ() {
        return 7L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44331HaZ(C82622Wbi context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJLJJI = UCI.LJI(this.LJLIL, ActivityC45651qj.class, null);
    }

    @Override // X.AbstractC44341Haj
    public final void LIZIZ(int i, long j, String str) {
        if (new JSONObject(str).optInt("state") != 2) {
            return;
        }
        LIZJ(new AqS157S0100000_7(this, 618));
    }
}
