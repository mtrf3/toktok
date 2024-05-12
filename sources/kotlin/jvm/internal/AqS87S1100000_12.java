package kotlin.jvm.internal;

import X.A90;
import X.AbstractC65781Prl;
import X.C0NB;
import X.C30868C9o;
import X.C70691Rol;
import X.C72991Skl;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import com.ss.android.ugc.aweme.ecommerce.base.review.Option;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public class AqS87S1100000_12 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS87S1100000_12(ReviewFragment reviewFragment, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = reviewFragment;
        this.s0 = str;
    }

    public static final Object invoke$0(AqS87S1100000_12 aqS87S1100000_12, Object obj, Object obj2) {
        C0NB.LIZIZ("LiveReplayVideoClip", "download fail");
        C72991Skl.LIZIZ("fail", aqS87S1100000_12.s0);
        C30868C9o.LIZJ(R.string.nxe);
        ((A90) aqS87S1100000_12.l1).dismiss();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS87S1100000_12 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.review.Option r10 = (com.ss.android.ugc.aweme.ecommerce.base.review.Option) r10
            java.lang.String r0 = "<anonymous parameter 0>"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = r10.key     // Catch: java.lang.Throwable -> L1d java.util.concurrent.CancellationException -> L5f
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> L1d java.util.concurrent.CancellationException -> L5f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1d java.util.concurrent.CancellationException -> L5f
            if (r0 == 0) goto L1d
            int r7 = r0.intValue()
            goto L1e
        L1d:
            r7 = 1
        L1e:
            java.lang.Object r0 = r8.l1
            com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment r0 = (com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment) r0
            com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel r0 = r0.xl()
            X.Rol r0 = r0.LJLLILLLL
            if (r0 == 0) goto L47
            java.lang.Object r6 = r8.l1
            com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment r6 = (com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment) r6
            java.lang.String r5 = r8.s0
            java.lang.String r4 = r10.valueForEvent
            java.lang.String r0 = "node"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.RsP r3 = new X.RsP
            r3.<init>()
            kotlin.jvm.internal.AqS2S3000000_12 r2 = new kotlin.jvm.internal.AqS2S3000000_12
            java.lang.String r1 = "sort_by"
            r0 = 2
            r2.<init>(r1, r5, r4, r0)
            X.C78946Uyc.LJJII(r6, r3, r2)
        L47:
            java.lang.Object r0 = r8.l1
            com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment r0 = (com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment) r0
            com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel r2 = r0.xl()
            r2.getClass()
            kotlin.jvm.internal.AqS36S0001000_12 r1 = new kotlin.jvm.internal.AqS36S0001000_12
            r0 = 14
            r1.<init>(r7, r0)
            r2.setState(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS87S1100000_12.invoke$1(kotlin.jvm.internal.AqS87S1100000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AqS87S1100000_12 aqS87S1100000_12, Object obj, Object obj2) {
        Option option = (Option) obj2;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(option, "option");
        C70691Rol c70691Rol = ((ReviewFragment) aqS87S1100000_12.l1).xl().LJLLILLLL;
        if (c70691Rol != null) {
            C70691Rol.LJI(c70691Rol, (ReviewFragment) aqS87S1100000_12.l1, "sort_by", aqS87S1100000_12.s0, option.valueForEvent);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS87S1100000_12(String str, A90 a90, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = a90;
    }
}
