package Y;

import X.ActivityC45651qj;
import X.C38333F2r;
import X.C55688LtM;
import X.C57283Mdz;
import X.C57284Me0;
import X.C63081OpJ;
import X.C76800UCe;
import X.InterfaceC55235Lm3;
import X.MID;
import android.os.Handler;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.experiment.DiscoveryCommonPoolExperiment;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.assems.tabs.TabAbilityAssem;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ACallableS58S0300000_9 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS58S0300000_9 aCallableS58S0300000_9) {
        return ((TabAbilityAssem) aCallableS58S0300000_9.l0).H3().LIZJ((ActivityC45651qj) aCallableS58S0300000_9.l1, (InterfaceC55235Lm3) aCallableS58S0300000_9.l2, 1);
    }

    public static final Object call$1(ACallableS58S0300000_9 aCallableS58S0300000_9) {
        return ((TabAbilityAssem) aCallableS58S0300000_9.l0).H3().LIZIZ((ActivityC45651qj) aCallableS58S0300000_9.l1, (InterfaceC55235Lm3) aCallableS58S0300000_9.l2, 1);
    }

    public static final Object call$2(ACallableS58S0300000_9 aCallableS58S0300000_9) {
        FollowStatus LJIIIZ;
        Object[] objArr = (Object[]) aCallableS58S0300000_9.l0;
        Aweme aweme = (Aweme) objArr[5];
        String str = (String) objArr[6];
        C57283Mdz c57283Mdz = (C57283Mdz) aCallableS58S0300000_9.l1;
        c57283Mdz.LJLJJL = (Integer) objArr[1];
        c57283Mdz.LJLJJLL = (Boolean) objArr[11];
        Object obj = objArr[9];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
        c57283Mdz.LJLJL = ((Integer) obj).intValue();
        try {
            Object[] objArr2 = (Object[]) aCallableS58S0300000_9.l0;
            String str2 = (String) objArr2[3];
            if (objArr2.length >= 11) {
                IUserService LIZ = UserService.LIZ();
                Object obj2 = ((Object[]) aCallableS58S0300000_9.l0)[0];
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = ((Object[]) aCallableS58S0300000_9.l0)[8];
                o.LJII(obj3, "null cannot be cast to non-null type kotlin.String");
                Object obj4 = ((Object[]) aCallableS58S0300000_9.l0)[1];
                o.LJII(obj4, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj4).intValue();
                Object obj5 = ((Object[]) aCallableS58S0300000_9.l0)[2];
                o.LJII(obj5, "null cannot be cast to non-null type kotlin.Int");
                int intValue2 = ((Integer) obj5).intValue();
                int LIZ2 = C55688LtM.LIZ(str2);
                Object[] objArr3 = (Object[]) aCallableS58S0300000_9.l0;
                String str3 = (String) objArr3[4];
                Object obj6 = objArr3[7];
                o.LJII(obj6, "null cannot be cast to non-null type kotlin.Int");
                int intValue3 = ((Integer) obj6).intValue();
                Object[] objArr4 = (Object[]) aCallableS58S0300000_9.l0;
                LJIIIZ = LIZ.LJIIIZ(intValue, intValue2, LIZ2, intValue3, (String) obj2, (String) obj3, str3, "", (String) objArr4[13], (Map) objArr4[10]);
                if (LJIIIZ != null) {
                    Object obj7 = ((Object[]) aCallableS58S0300000_9.l0)[9];
                    o.LJII(obj7, "null cannot be cast to non-null type kotlin.Int");
                    LJIIIZ.followerStatus = ((Integer) obj7).intValue();
                    Object obj8 = ((Object[]) aCallableS58S0300000_9.l0)[2];
                    o.LJII(obj8, "null cannot be cast to non-null type kotlin.Int");
                    LJIIIZ.followFrom = ((Integer) obj8).intValue();
                }
            } else {
                IUserService LIZ3 = UserService.LIZ();
                Object obj9 = ((Object[]) aCallableS58S0300000_9.l0)[0];
                o.LJII(obj9, "null cannot be cast to non-null type kotlin.String");
                Object obj10 = ((Object[]) aCallableS58S0300000_9.l0)[1];
                o.LJII(obj10, "null cannot be cast to non-null type kotlin.Int");
                int intValue4 = ((Integer) obj10).intValue();
                Object obj11 = ((Object[]) aCallableS58S0300000_9.l0)[2];
                o.LJII(obj11, "null cannot be cast to non-null type kotlin.Int");
                int intValue5 = ((Integer) obj11).intValue();
                int LIZ4 = C55688LtM.LIZ(str2);
                Object[] objArr5 = (Object[]) aCallableS58S0300000_9.l0;
                String str4 = (String) objArr5[4];
                Object obj12 = objArr5[7];
                o.LJII(obj12, "null cannot be cast to non-null type kotlin.Int");
                int intValue6 = ((Integer) obj12).intValue();
                Object[] objArr6 = (Object[]) aCallableS58S0300000_9.l0;
                LJIIIZ = LIZ3.LJIIIZ(intValue4, intValue5, LIZ4, intValue6, (String) obj9, "", str4, "", (String) objArr6[13], (Map) objArr6[9]);
            }
            C57284Me0 c57284Me0 = (C57284Me0) aCallableS58S0300000_9.l2;
            Integer num = (Integer) ((Object[]) aCallableS58S0300000_9.l0)[1];
            c57284Me0.getClass();
            C57284Me0.LJIIIZ(num, aweme, str, LJIIIZ);
            return LJIIIZ;
        } catch (C38333F2r e) {
            if (e.getErrorCode() == 2149 && aweme != null && C63081OpJ.LJLJL(aweme)) {
                C57284Me0 c57284Me02 = (C57284Me0) aCallableS58S0300000_9.l2;
                Integer num2 = (Integer) ((Object[]) aCallableS58S0300000_9.l0)[1];
                Object obj13 = ((Object[]) aCallableS58S0300000_9.l0)[0];
                o.LJII(obj13, "null cannot be cast to non-null type kotlin.String");
                FollowStatus followStatus = new FollowStatus((String) obj13, 0, e.getErrorCode());
                c57284Me02.getClass();
                C57284Me0.LJIIIZ(num2, aweme, str, followStatus);
            }
            throw e;
        }
    }

    public static final Object call$3(ACallableS58S0300000_9 aCallableS58S0300000_9) {
        int i = ((DiscoveryCommonPoolExperiment.DiscoveryCommonPoolExperimentConfig) DiscoveryCommonPoolExperiment.LIZIZ.getValue()).poolSize;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                RecyclerView.ViewHolder createViewHolder = ((MID) aCallableS58S0300000_9.l0).createViewHolder((ViewGroup) ((TrendsTabFragment) aCallableS58S0300000_9.l1)._$_findCachedViewById(R.id.fuc), 0);
                o.LJIIIIZZ(createViewHolder, "adapter.createViewHolder(list_view, 0)");
                ((Handler) aCallableS58S0300000_9.l2).post(new ARunnableS28S0200000_9(createViewHolder, (TrendsTabFragment) aCallableS58S0300000_9.l1, 44));
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return C76800UCe.LIZ;
    }

    public ACallableS58S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
