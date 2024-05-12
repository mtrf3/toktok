package kotlin.jvm.internal;

import X.AKT;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C101543yg;
import X.C101573yj;
import X.C101663ys;
import X.C109544Rq;
import X.C139825eE;
import X.C208158Ex;
import X.C221108m2;
import X.C3VV;
import X.C3VX;
import X.C3VY;
import X.C76800UCe;
import X.C7MY;
import X.C82682Wcg;
import X.EIG;
import X.EnumC101583yk;
import X.InterfaceC65784Pro;
import X.InterfaceC82683Wch;
import X.InterfaceC88472Yns;
import X.WHL;
import Y.ACListenerS11S1300000_1;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class AqS2S1310000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS2S1310000_1 aqS2S1310000_1) {
        int i;
        C101543yg.LJ = (InterfaceC88472Yns) aqS2S1310000_1.l1;
        AKT akt = new AKT((ActivityC45651qj) aqS2S1310000_1.l2);
        akt.LJ(R.style.ux);
        akt.LJFF(R.string.esr);
        C208158Ex c208158Ex = akt.LIZ;
        c208158Ex.LJLILLLLZI = 1;
        c208158Ex.LJLJJI = 2;
        akt.LIZLLL(R.string.ess);
        if (aqS2S1310000_1.z4) {
            i = 51;
        } else {
            i = 14;
        }
        int LIZIZ = C7MY.LIZIZ(i);
        C208158Ex c208158Ex2 = akt.LIZ;
        c208158Ex2.LJLJL = LIZIZ;
        c208158Ex2.LJLJLJ = new ACListenerS11S1300000_1((Context) aqS2S1310000_1.l3, (ActivityC45651qj) aqS2S1310000_1.l2, aqS2S1310000_1.s0, (InterfaceC88472Yns) aqS2S1310000_1.l1, 1);
        akt.LIZIZ(C101663ys.LJLIL);
        C101543yg.LIZLLL = akt;
        C101543yg.LJFF = true;
        AKT akt2 = C101543yg.LIZLLL;
        if (akt2 != null) {
            akt2.LJII();
        }
        C101573yj.LJIIIZ(C101573yj.LIZ, aqS2S1310000_1.s0, "greeting_button", EnumC101583yk.DM_SETTINGS_POPUP);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S1310000_1 aqS2S1310000_1) {
        View view = (View) aqS2S1310000_1.l1;
        boolean z = aqS2S1310000_1.z4;
        List list = (List) aqS2S1310000_1.l2;
        String str = C3VX.LIZJ;
        String str2 = aqS2S1310000_1.s0;
        if (view != null && !z && str.length() != 0 && !o.LJ(str, str2) && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(String.valueOf(((C109544Rq) it.next()).getSender()), str)) {
                    Activity activity = (Activity) aqS2S1310000_1.l3;
                    View view2 = (View) aqS2S1310000_1.l1;
                    C139825eE c139825eE = new C139825eE(activity);
                    o.LJIIIZ(view2, "view");
                    C82682Wcg c82682Wcg = c139825eE.LIZ;
                    c82682Wcg.LIZIZ = view2;
                    c82682Wcg.LJIIIZ = true;
                    c82682Wcg.LJIJJLI = true;
                    c139825eE.LJI(WHL.TOP);
                    c139825eE.LJIIJJI(R.string.em7);
                    c139825eE.LIZ.LJII = 3000L;
                    c139825eE.LJ(C3VY.LJLIL);
                    C3VX.LIZIZ = c139825eE.LIZJ();
                    Object value = C221108m2.LIZIZ(EIG.LJLIL).getValue();
                    o.LJIIIIZZ(value, "show$lambda$2(...)");
                    ((INoticeCountTabBadgePresentService) value).LIZLLL();
                    C3VX.LIZLLL = true;
                    InterfaceC82683Wch interfaceC82683Wch = C3VX.LIZIZ;
                    if (interfaceC82683Wch != null) {
                        Object value2 = C3VV.LIZ.getValue();
                        o.LJIIIIZZ(value2, "<get-kevaRepo>(...)");
                        ((Keva) value2).storeBoolean("is_tooltip_displayed", true);
                        interfaceC82683Wch.show();
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS2S1310000_1(View view, View view2, boolean z, List<C109544Rq> list, String str, Activity activity) {
        super(0);
        this.$t = activity;
        this.l1 = view;
        this.z4 = view2;
        this.l2 = z;
        this.s0 = list;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S1310000_1(AqS167S0100000_1 aqS167S0100000_1, ActivityC45651qj activityC45651qj, boolean z, String str, Context context, int i) {
        super(0);
        this.$t = i;
        this.l1 = aqS167S0100000_1;
        this.l2 = activityC45651qj;
        this.z4 = z;
        this.s0 = str;
        this.l3 = context;
    }
}
