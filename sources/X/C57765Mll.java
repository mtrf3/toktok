package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardAdapterWidget;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS58S0201000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mll, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57765Mll extends AbstractC65781Prl implements InterfaceC65784Pro<AbstractC57781Mm1> {
    public final /* synthetic */ Fragment LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ AbstractC57896Mns LJLJI;
    public final /* synthetic */ UserCardAdapterWidget LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57765Mll(Fragment fragment, int i, AbstractC57896Mns abstractC57896Mns, UserCardAdapterWidget userCardAdapterWidget) {
        super(0);
        this.LJLIL = fragment;
        this.LJLILLLLZI = i;
        this.LJLJI = abstractC57896Mns;
        this.LJLJJI = userCardAdapterWidget;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [X.Mm1, X.09q] */
    @Override // X.InterfaceC65784Pro
    public final AbstractC57781Mm1 invoke() {
        Object LIZJ;
        Fragment fragment = this.LJLIL;
        int i = this.LJLILLLLZI;
        AbstractC57896Mns abstractC57896Mns = this.LJLJI;
        UserCardAdapterWidget userCardAdapterWidget = this.LJLJJI;
        C57858MnG c57858MnG = new C57858MnG(null, fragment, 1);
        c57858MnG.LIZLLL(new AqS58S0201000_9(i, abstractC57896Mns, userCardAdapterWidget, 5));
        c57858MnG.LIZ(C57871MnT.LJLIL);
        c57858MnG.LIZIZ(new AqS175S0100000_9(abstractC57896Mns, 249));
        c57858MnG.LIZJ(new AqS175S0100000_9(userCardAdapterWidget, LiveCoverMinSizeSetting.DEFAULT));
        IRelationUserCardInternalService.LIZ.getClass();
        IRelationUserCardInternalService LIZ = C57930MoQ.LIZ();
        C57867MnP c57867MnP = c57858MnG.LIZLLL;
        if (c57867MnP.LIZLLL == -1) {
            int i2 = c57858MnG.LJFF.LIZJ - 10;
            if (i2 < 5) {
                i2 = 5;
            }
            c57867MnP.LIZLLL = i2;
        }
        C65776Prg LIZ2 = C65352Pkq.LIZ(AbstractC57781Mm1.class);
        if (!o.LJ(LIZ2, C65352Pkq.LIZ(C25771A9n.class)) && !o.LJ(LIZ2, C65352Pkq.LIZ(C25770A9m.class)) && (o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC58014Mpm.class)) || o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC57781Mm1.class)))) {
            C57866MnO c57866MnO = c57858MnG.LJFF;
            if (c57866MnO.LJIILJJIL == null) {
                c57866MnO.LJIILJJIL = Boolean.TRUE;
            }
        }
        C57859MnH c57859MnH = new C57859MnH(c57858MnG.LIZ, c57858MnG.LIZIZ, c57858MnG.LIZJ, c57858MnG.LIZLLL, c57858MnG.LJ, c57858MnG.LJFF, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(AbstractC57781Mm1.class);
        if (o.LJ(LIZ3, C65352Pkq.LIZ(C25771A9n.class))) {
            LIZJ = C94293mz.LIZ(LIZ, c57859MnH, 2).getLayout();
        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(C25770A9m.class))) {
            LIZJ = LIZ.LIZIZ(c57859MnH, 0).getLayout();
        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC58014Mpm.class))) {
            LIZJ = LIZ.LIZ(c57859MnH);
        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC57781Mm1.class))) {
            LIZJ = LIZ.LIZJ(c57859MnH);
        } else {
            "type is error!".toString();
            throw new IllegalStateException("type is error!");
        }
        if (LIZJ != null) {
            ?? r0 = (AbstractC029409q) LIZJ;
            r0.setHasStableIds(true);
            return r0;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardAdapter");
    }
}
