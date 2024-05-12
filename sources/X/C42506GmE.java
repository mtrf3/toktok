package X;

import Y.IDCListenerS283S0100000_7;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS53S0400000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GmE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42506GmE implements GF1 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public final GF9 LJLIL;
    public final OF1 LJLILLLLZI = C1DF.LJJIFFI(this, GFA.LJLIL);
    public final OF1 LJLJI = C1DF.LJJIFFI(this, GFB.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(DJ0.LJLIL);

    static {
        TBT tbt = new TBT(C42506GmE.class, "mission", "getMission()Lcom/ss/android/ugc/aweme/commerce/tools/mission/Mission;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C42506GmE.class, "uid", "getUid()Ljava/lang/String;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC40998G7e
    public final void P0() {
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ GF9 L9() {
        return this.LJLIL;
    }

    public C42506GmE(GF4 gf4) {
        this.LJLIL = gf4;
    }

    @Override // X.InterfaceC40998G7e
    public final boolean Nb0(InterfaceC41450GOo action) {
        o.LJIIIZ(action, "action");
        OF1 of1 = this.LJLILLLLZI;
        InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = LJLJJL;
        Mission mission = (Mission) of1.LIZ(this, interfaceC74236TBoArr[0]);
        if (mission == null) {
            action.LIZ();
            return false;
        }
        if (this.LJLILLLLZI.LIZ(this, interfaceC74236TBoArr[0]) == null || !(!((Keva) this.LJLJJI.getValue()).getBoolean((String) this.LJLJI.LIZ(this, interfaceC74236TBoArr[1]), false))) {
            action.LIZ();
            return false;
        }
        H9C h9c = new H9C();
        h9c.LJIIIIZZ(mission);
        h9c.LJII("mission_post_reminder_show", "mission_id");
        C42509GmH c42509GmH = new C42509GmH(C44384HbQ.LLIILZL(this));
        C26227ARb LIZ = C3AW.LIZ(C44384HbQ.LLIILZL(this));
        LIZ.LJ(R.string.i5_);
        LIZ.LIZ(R.string.i56);
        LIZ.LJIIJJI = c42509GmH;
        UC0.LIZJ(LIZ, new AqS53S0400000_7(c42509GmH, mission, this, action, 8));
        LIZ.LJ = new IDCListenerS283S0100000_7(new AqS173S0100000_7(action, 468), 6);
        LIZ.LIZJ(new AqS173S0100000_7(action, 469));
        LIZ.LJI().LIZLLL();
        return action.getIntercepted();
    }
}
