package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC125294vt;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C125284vs;
import X.C125304vu;
import X.C132845Jg;
import X.C149865uQ;
import X.C38352F3k;
import X.C40925G4j;
import X.C42599Gnj;
import X.C76732zl;
import X.C76800UCe;
import X.C78450Uqc;
import X.InterfaceC65784Pro;
import X.InterfaceC65895Ptb;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.R47;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AqS48S0400000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS48S0400000_2 aqS48S0400000_2, Object it) {
        o.LJIIIZ(it, "it");
        ((InterfaceC88472Yns) aqS48S0400000_2.l0).invoke("upload_authorization_popup_continue");
        if (!((C149865uQ) aqS48S0400000_2.l1).LIZ.isLogin()) {
            C149865uQ c149865uQ = (C149865uQ) aqS48S0400000_2.l1;
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS48S0400000_2.l2;
            final IAccountUserService userService = c149865uQ.LIZ;
            o.LJIIIIZZ(userService, "userService");
            InterfaceC65895Ptb LJI = AccountService.LJIJ().LJI();
            C78450Uqc c78450Uqc = new C78450Uqc();
            c78450Uqc.LIZ = activityC45651qj;
            c78450Uqc.LJ = new R47() { // from class: X.5uT
                @Override // X.R47
                public final void onResult(int i, int i2, Object obj) {
                    if (i == 1 && i2 == 1) {
                        String curUserId = IAccountUserService.this.getCurUserId();
                        o.LJIIIIZZ(curUserId, "userService.curUserId");
                        C132845Jg.LIZIZ(curUserId);
                    }
                }
            };
            C40925G4j.LIZ(c78450Uqc, LJI);
        } else {
            String curUserId = ((C149865uQ) aqS48S0400000_2.l1).LIZ.getCurUserId();
            o.LJIIIIZZ(curUserId, "userService.curUserId");
            C132845Jg.LIZIZ(curUserId);
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS48S0400000_2.l3;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS48S0400000_2 aqS48S0400000_2, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.flx, new AqS48S0400000_2((InterfaceC88472Yns) aqS48S0400000_2.l0, (InterfaceC88472Yns<? super String, C76800UCe>) aqS48S0400000_2.l1, (C149865uQ) aqS48S0400000_2.l2, (ActivityC45651qj) aqS48S0400000_2.l3, (InterfaceC65784Pro<C76800UCe>) 0));
        actionGroup.LJIIIIZZ(R.string.flw, new AqS168S0100000_2((InterfaceC88472Yns) aqS48S0400000_2.l0, 496));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS48S0400000_2 aqS48S0400000_2, Object handleResult) {
        o.LJIIIZ(handleResult, "handleResult");
        C125304vu c125304vu = (C125304vu) aqS48S0400000_2.l0;
        int i = c125304vu.LIZIZ + 1;
        if (i >= 0 && i < c125304vu.LIZ.size()) {
            C125304vu c125304vu2 = (C125304vu) aqS48S0400000_2.l0;
            int i2 = c125304vu2.LIZIZ + 1;
            c125304vu2.LIZIZ = i2;
            AbstractC125294vt abstractC125294vt = (AbstractC125294vt) ORZ.LJLLLLLL(i2, c125304vu2.LIZ);
            if (abstractC125294vt != null) {
                abstractC125294vt.LIZIZ((C125304vu) aqS48S0400000_2.l0, (C125284vs) aqS48S0400000_2.l2, (InterfaceC88472Yns) aqS48S0400000_2.l1, (InterfaceC88472Yns) aqS48S0400000_2.l3);
            }
        } else if (i == ((C125304vu) aqS48S0400000_2.l0).LIZ.size()) {
            ((C125304vu) aqS48S0400000_2.l0).LIZIZ = 0;
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS48S0400000_2.l1;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(handleResult);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS48S0400000_2 aqS48S0400000_2, Object obj) {
        int i;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C76732zl c76732zl = (C76732zl) aqS48S0400000_2.l0;
        if (booleanValue) {
            View view = (View) aqS48S0400000_2.l1;
            if (view != null) {
                view.performClick();
            }
            i = 2;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(System.currentTimeMillis());
            String LIZJ = C38352F3k.LIZJ(X1D.LIZIZ(LIZ));
            if (C42599Gnj.LIZJ((Context) aqS48S0400000_2.l3, (Bitmap) aqS48S0400000_2.l2, LIZJ) == null) {
                i = -1;
            } else {
                i = 1;
            }
        }
        c76732zl.element = i;
        return Integer.valueOf(((C76732zl) aqS48S0400000_2.l0).element);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS48S0400000_2(C76732zl c76732zl, View view, Bitmap bitmap, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c76732zl;
        this.l1 = view;
        this.l2 = bitmap;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS48S0400000_2(C125304vu c125304vu, C125284vs c125284vs, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c125304vu;
        this.l1 = interfaceC88472Yns;
        this.l2 = c125284vs;
        this.l3 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS48S0400000_2(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, C149865uQ c149865uQ, ActivityC45651qj activityC45651qj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
        this.l2 = c149865uQ;
        this.l3 = activityC45651qj;
    }
}
