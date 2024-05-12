package Y;

import X.ActivityC45651qj;
import X.C26045AKb;
import X.C2U8;
import X.C34K;
import X.C69888Rbo;
import X.C69995RdX;
import X.C70006Rdi;
import X.C70500Rlg;
import X.C71062Ruk;
import X.InterfaceC64592gB;
import X.InterfaceC70070Rek;
import X.ORZ;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class AfS0S0500100_12 implements InterfaceC64592gB {
    public final int $t;
    public long j5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S0500100_12 afS0S0500100_12, Object obj) {
        String str;
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        if (TextUtils.isEmpty(((IPdpStarter.PdpEnterParam) afS0S0500100_12.l0).getChainKey()) && (str = productPackStruct.chainKey) != null && str.length() > 0) {
            HashMap<String, Object> visitReportParams = ((IPdpStarter.PdpEnterParam) afS0S0500100_12.l0).getVisitReportParams();
            if (visitReportParams != null) {
                visitReportParams.put("chain_key", productPackStruct.chainKey);
            }
            ((IPdpStarter.PdpEnterParam) afS0S0500100_12.l0).setChainKey(productPackStruct.chainKey);
        }
        InterfaceC70070Rek.LJJLIIIJLJLI.getClass();
        C69995RdX c69995RdX = C69995RdX.LJLILLLLZI;
        String req = ((C70006Rdi) afS0S0500100_12.l1).LIZ;
        c69995RdX.getClass();
        o.LJIIIZ(req, "req");
        C69995RdX.LJLJLJ.remove(req);
        C69995RdX.LJLJLLL.remove(req);
        if (!((C34K) afS0S0500100_12.l2).element) {
            C70500Rlg.LIZLLL((C70500Rlg) afS0S0500100_12.l3, (ActivityC45651qj) afS0S0500100_12.l4, (IPdpStarter.PdpEnterParam) afS0S0500100_12.l0, productPackStruct, afS0S0500100_12.j5, ((C70006Rdi) afS0S0500100_12.l1).LIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS0S0500100_12 afS0S0500100_12, Object obj) {
        ProductPackStruct productPackStruct;
        List<ProductPackStruct> list;
        Throwable th = (Throwable) obj;
        if (th instanceof C69888Rbo) {
            C69888Rbo c69888Rbo = (C69888Rbo) th;
            ProductInfoPackData productInfoPackData = (ProductInfoPackData) c69888Rbo.getResp().data;
            if (productInfoPackData != null && (list = productInfoPackData.productionInfoPack) != null) {
                productPackStruct = (ProductPackStruct) ORZ.LJLLLL(list);
            } else {
                productPackStruct = null;
            }
            if (!((C34K) afS0S0500100_12.l0).element) {
                C70500Rlg c70500Rlg = (C70500Rlg) afS0S0500100_12.l1;
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) afS0S0500100_12.l2;
                IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) afS0S0500100_12.l3;
                long j = afS0S0500100_12.j5;
                int i = ((C70006Rdi) afS0S0500100_12.l4).LIZIZ;
                int code = c69888Rbo.getCode();
                c70500Rlg.getClass();
                C70500Rlg.LIZJ(activityC45651qj, pdpEnterParam, productPackStruct, j, i, code);
                return;
            }
            return;
        }
        String productId = ((IPdpStarter.PdpEnterParam) afS0S0500100_12.l3).getProductId();
        String awemeId = ((IPdpStarter.PdpEnterParam) afS0S0500100_12.l3).getAwemeId();
        String clickFrom = ((IPdpStarter.PdpEnterParam) afS0S0500100_12.l3).getClickFrom();
        o.LJIIIZ(productId, "productId");
        C2U8.LIZ(new C71062Ruk(productId, 5, awemeId, clickFrom));
        if (((C34K) afS0S0500100_12.l0).element) {
            return;
        }
        C70500Rlg c70500Rlg2 = (C70500Rlg) afS0S0500100_12.l1;
        ActivityC45651qj activityC45651qj2 = (ActivityC45651qj) afS0S0500100_12.l2;
        String string = activityC45651qj2.getString(R.string.tby);
        o.LJIIIIZZ(string, "ctx.getString(R.string.uikit_check_and_retry)");
        c70500Rlg2.getClass();
        C26045AKb c26045AKb = new C26045AKb(activityC45651qj2);
        c26045AKb.LJIIIZ(string);
        c26045AKb.LJIIJ();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S0500100_12(long r2, X.ActivityC45651qj r4, X.C70006Rdi r5, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r6, X.C70500Rlg r7, X.C34K r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            switch(r9) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r8
            r0.l1 = r7
            r0.l2 = r4
            r0.l3 = r6
            r0.j5 = r2
            r0.l4 = r5
        L12:
            r0.<init>()
            return
        L16:
            r0 = r1
            r0.l0 = r6
            r0.l1 = r5
            r0.l2 = r8
            r0.l3 = r7
            r0.l4 = r4
            r0.j5 = r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0500100_12.<init>(long, X.1qj, X.Rdi, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam, X.Rlg, X.34K, int):void");
    }
}
