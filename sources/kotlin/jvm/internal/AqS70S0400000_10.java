package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C51029K0z;
import X.C61295O3v;
import X.C61617OGf;
import X.C66605QCb;
import X.C68322mC;
import X.C76800UCe;
import X.C76L;
import X.C85999Xp5;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.Q82;
import X.Q8F;
import X.Q97;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.forest.chain.fetchers.CDNFetcher;
import com.bytedance.forest.model.Request;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

/* loaded from: classes11.dex */
public class AqS70S0400000_10 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS70S0400000_10 aqS70S0400000_10) {
        ((CDNFetcher) aqS70S0400000_10.l0).doFetch((Request) aqS70S0400000_10.l1, (C61295O3v) aqS70S0400000_10.l2, (InterfaceC88472Yns) aqS70S0400000_10.l3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS70S0400000_10 aqS70S0400000_10) {
        String str;
        Challenge challenge = (Challenge) ((C76L) aqS70S0400000_10.l0).get();
        if (challenge != null) {
            str = challenge.getStickerId();
        } else {
            str = null;
        }
        ((SmartRoute) ((C68322mC) aqS70S0400000_10.l1).element).withParam("is_bundled", !TextUtils.isEmpty(str) ? 1 : 0);
        ((SmartRoute) ((C68322mC) aqS70S0400000_10.l1).element).open();
        C61617OGf c61617OGf = (C61617OGf) aqS70S0400000_10.l2;
        String sb = ((StringBuilder) aqS70S0400000_10.l3).toString();
        o.LJIIIIZZ(sb, "sb.toString()");
        c61617OGf.L(sb, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS70S0400000_10 aqS70S0400000_10) {
        return C85999Xp5.LIZLLL("Facebook", "sharePhotos", C51029K0z.LJJIIZI(new OSZ("image_urls", (List) aqS70S0400000_10.l0)), C66605QCb.LJLIL, new AqS71S0400000_11((List) aqS70S0400000_10.l0, (List<? extends Uri>) aqS70S0400000_10.l1, (Activity) aqS70S0400000_10.l2, (Q97) aqS70S0400000_10.l3, (Q82<Q8F>) 5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS70S0400000_10(C76L c76l, C76L<Challenge> c76l2, C68322mC<SmartRoute> c68322mC, C61617OGf c61617OGf, StringBuilder sb) {
        super(0);
        this.$t = sb;
        this.l0 = c76l;
        this.l1 = c76l2;
        this.l2 = c68322mC;
        this.l3 = c61617OGf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS70S0400000_10(CDNFetcher cDNFetcher, Request request, C61295O3v c61295O3v, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(0);
        this.$t = i;
        this.l0 = cDNFetcher;
        this.l1 = request;
        this.l2 = c61295O3v;
        this.l3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS70S0400000_10(List list, List<? extends Uri> list2, Activity activity, Q97 q97, Q82<Q8F> q82) {
        super(0);
        this.$t = q82;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = activity;
        this.l3 = q97;
    }
}
