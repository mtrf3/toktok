package X;

import Y.IDeS153S0200000_15;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3Pk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83483Pk {
    public final C98453th LIZ;
    public final C3Q8 LIZIZ;
    public final InterfaceC65784Pro<String> LIZJ;
    public final InterfaceC88472Yns<String, C76800UCe> LIZLLL;
    public final InterfaceC88472Yns<InterfaceC67352kd<? super List<IMUserBaseInfo>>, Object> LJ;
    public final InterfaceC88472Yns<Long, Boolean> LJFF;
    public final InterfaceC88472Yns<IMUserBaseInfo, Boolean> LJI;
    public final InterfaceC88472Yns<IMUser, List<C3QL>> LJII;
    public final InterfaceC88472Yns<C3QC, C76800UCe> LJIIIIZZ;
    public final InterfaceC88472Yns<IMUserBaseInfo, String> LJIIIZ;
    public final InterfaceC65784Pro<Boolean> LJIIJ;
    public final InterfaceC88473Ynt<List<C3QL>, C3QC, InterfaceC67352kd<? super C76800UCe>, Object> LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final InterfaceC65462ha<C3PT> LJIILIIL;
    public boolean LJIILJJIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C83483Pk(C64962gm c64962gm) {
        C98453th c98453th = new C98453th("update_user", "search", 4);
        C3ZD c3zd = C3ZD.LIZ;
        C83503Pm c83503Pm = new C83503Pm(c3zd);
        C3Q8.LIZ.getClass();
        C96413qP.LIZ.LJII();
        C4ZQ c4zq = C4ZQ.LIZIZ;
        EventLiveData<RelationStatus> relationObservable = C77266UUc.LIZIZ.getRelationService().LJFF();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("user_search_content_");
        LIZ.append(C36L.LIZIZ());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(\"${REPO_NAME}_${AppUtil.getUidL()}\")");
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(repo, 771);
        AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(repo, 212);
        C3GM c3gm = new C3GM(C3GN.LIZIZ);
        C39C isSelf = C39C.LJLIL;
        C83513Pn c83513Pn = new C83513Pn(c3zd);
        C83463Pi c83463Pi = new C83463Pi(C3QE.LIZ);
        C83523Po reportSearchSync = C83523Po.LJLIL;
        C83553Pr c83553Pr = new C83553Pr(C83543Pq.LIZ);
        final C3QM c3qm = C3QM.LIZ;
        TBR tbr = new TBR(c3qm) { // from class: X.3QI
            @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
            public final Object get() {
                return Boolean.valueOf(C3QM.LIZ());
            }
        };
        C83573Pt c83573Pt = new C83573Pt(aqS167S0100000_1, aqS151S0100000_1, c4zq, c98453th, null);
        o.LJIIIZ(relationObservable, "relationObservable");
        o.LJIIIZ(isSelf, "isSelf");
        o.LJIIIZ(reportSearchSync, "reportSearchSync");
        this.LIZ = c98453th;
        this.LIZIZ = c4zq;
        this.LIZJ = aqS151S0100000_1;
        this.LIZLLL = aqS167S0100000_1;
        this.LJ = c3gm;
        this.LJFF = isSelf;
        this.LJI = c83513Pn;
        this.LJII = c83463Pi;
        this.LJIIIIZZ = reportSearchSync;
        this.LJIIIZ = c83553Pr;
        this.LJIIJ = tbr;
        this.LJIIJJI = c83573Pt;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C83473Pj.LJLIL);
        this.LJIIL = LIZIZ;
        InterfaceC65462ha<C3PT> LJ = V1M.LJ(V1M.LJIIZILJ(C36636EZk.LIZ, V1M.LJFF(new C83453Ph(relationObservable, c83503Pm, null))), Integer.MAX_VALUE, 2);
        this.LJIILIIL = LJ;
        V1M.LJJIJIIJIL(new IDeS153S0200000_15(new C79823Bi(C47261Igj.LJJIJIIJI(LIZIZ.getValue(), LJ), MBB.INSTANCE, -2, XKI.SUSPEND), new C83433Pf(this, null), 0), c64962gm);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(boolean r15, X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83483Pk.LIZ(boolean, X.2kd):java.lang.Object");
    }
}
