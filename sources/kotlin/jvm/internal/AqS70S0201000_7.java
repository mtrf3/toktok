package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C41076GAe;
import X.C41077GAf;
import X.C41078GAg;
import X.C76800UCe;
import X.G83;
import X.InterfaceC41079GAh;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity;
import java.util.List;

/* loaded from: classes8.dex */
public class AqS70S0201000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS70S0201000_7 aqS70S0201000_7) {
        PublishService publishService = (PublishService) aqS70S0201000_7.l0;
        return publishService.LIZJ(publishService, (Bitmap) aqS70S0201000_7.l1, aqS70S0201000_7.i2 / 100.0f);
    }

    public static final Object invoke$1(AqS70S0201000_7 aqS70S0201000_7) {
        C41076GAe c41076GAe = (C41076GAe) aqS70S0201000_7.l0;
        int i = aqS70S0201000_7.i2;
        C41078GAg c41078GAg = (C41078GAg) aqS70S0201000_7.l1;
        InterfaceC41079GAh interfaceC41079GAh = c41076GAe.LJLJJI;
        if (i >= 0 && i < 3) {
            if (c41076GAe.LJLILLLLZI != i) {
                G83.LIZ(c41076GAe.LJLJI, i, SelectSaveLocalOptionActivity.LJLJJL, null, new C41077GAf(c41076GAe, c41078GAg, i, interfaceC41079GAh));
            } else {
                interfaceC41079GAh.cancel();
                interfaceC41079GAh.LLILL();
            }
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$2(AqS70S0201000_7 aqS70S0201000_7) {
        Object[] objArr = (Object[]) aqS70S0201000_7.l0;
        o.LJII(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        Object[] objArr2 = (String[]) objArr;
        objArr2[aqS70S0201000_7.i2] = ((InterfaceC88472Yns) aqS70S0201000_7.l1).invoke(objArr2[aqS70S0201000_7.i2]);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS70S0201000_7 aqS70S0201000_7) {
        List list = (List) aqS70S0201000_7.l0;
        o.LJII(list, "null cannot be cast to non-null type java.util.List<kotlin.String>");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS70S0201000_7.l1;
        Object obj = ListProtector.get(list, aqS70S0201000_7.i2);
        o.LJIIIIZZ(obj, "list[index]");
        Object invoke = interfaceC88472Yns.invoke(obj);
        if (!o.LJ(invoke, ListProtector.get(list, aqS70S0201000_7.i2))) {
            ListProtector.set(list, aqS70S0201000_7.i2, invoke);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS70S0201000_7(C41076GAe c41076GAe, int i, C41078GAg c41078GAg, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c41076GAe;
        this.i2 = i;
        this.l1 = c41078GAg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS70S0201000_7(PublishService publishService, int i, Bitmap bitmap, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = publishService;
        this.i2 = i;
        this.l1 = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS70S0201000_7(List list, int i, AqS49S1200000_7 aqS49S1200000_7, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = list;
        this.i2 = i;
        this.l1 = aqS49S1200000_7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS70S0201000_7(Object[] objArr, AqS49S1200000_7 aqS49S1200000_7, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = objArr;
        this.l1 = aqS49S1200000_7;
        this.i2 = i;
    }
}
