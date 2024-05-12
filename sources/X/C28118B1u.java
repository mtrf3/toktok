package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.B1u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28118B1u {
    public static final /* synthetic */ C28118B1u LIZ = new C28118B1u();

    public static B2I LIZIZ(ElementDTO elementDTO, PaymentMethod paymentMethod) {
        o.LJIIIZ(elementDTO, "elementDTO");
        Integer num = elementDTO.styleType;
        int ordinal = EnumC28119B1v.BA_CITY.ordinal();
        if (num == null || num.intValue() != ordinal) {
            return LIZJ(elementDTO, paymentMethod);
        }
        return new B21(elementDTO, paymentMethod, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.B2I LIZJ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r4, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r5) {
        /*
            java.lang.String r0 = "elementDTO"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "paymentMethod"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.Integer r2 = r4.styleType
            X.B1v r0 = X.EnumC28119B1v.Normal
            int r1 = r0.ordinal()
            if (r2 != 0) goto Lc0
        L14:
            X.B1v r0 = X.EnumC28119B1v.Email
            int r1 = r0.ordinal()
            if (r2 != 0) goto Lc7
        L1c:
            r0 = 0
        L1d:
            r3 = 0
            if (r0 == 0) goto L27
            X.B21 r0 = new X.B21
            r0.<init>(r4, r5, r3)
        L25:
            r3 = r0
        L26:
            return r3
        L27:
            X.B1v r0 = X.EnumC28119B1v.CardNumber
            int r1 = r0.ordinal()
            if (r2 != 0) goto La6
        L2f:
            X.B1v r0 = X.EnumC28119B1v.Date
            int r1 = r0.ordinal()
            if (r2 != 0) goto L9a
        L37:
            X.B1v r0 = X.EnumC28119B1v.CPF
            int r1 = r0.ordinal()
            if (r2 != 0) goto L8e
        L3f:
            X.B1v r0 = X.EnumC28119B1v.Phone
            int r1 = r0.ordinal()
            if (r2 != 0) goto L82
        L47:
            X.B1v r0 = X.EnumC28119B1v.Address
            int r1 = r0.ordinal()
            if (r2 != 0) goto L6f
        L4f:
            X.B1v r0 = X.EnumC28119B1v.BA_CITY
            int r1 = r0.ordinal()
            if (r2 != 0) goto L76
        L57:
            X.B1v r0 = X.EnumC28119B1v.BA_COUNTY
            int r1 = r0.ordinal()
            if (r2 != 0) goto L68
        L5f:
            X.B1v r0 = X.EnumC28119B1v.BA_COUNTRY
            int r1 = r0.ordinal()
            if (r2 != 0) goto Lb3
            goto L26
        L68:
            int r0 = r2.intValue()
            if (r0 != r1) goto L5f
            goto L7c
        L6f:
            int r0 = r2.intValue()
            if (r0 != r1) goto L4f
            goto L7c
        L76:
            int r0 = r2.intValue()
            if (r0 != r1) goto L57
        L7c:
            X.B1q r0 = new X.B1q
            r0.<init>(r4, r5, r3)
            goto L25
        L82:
            int r0 = r2.intValue()
            if (r0 != r1) goto L47
            X.B22 r3 = new X.B22
            r3.<init>(r4, r5)
            goto L26
        L8e:
            int r0 = r2.intValue()
            if (r0 != r1) goto L3f
            X.B21 r0 = new X.B21
            r0.<init>(r4, r5, r3)
            goto L25
        L9a:
            int r0 = r2.intValue()
            if (r0 != r1) goto L37
            X.B20 r0 = new X.B20
            r0.<init>(r4, r5, r3)
            goto L25
        La6:
            int r0 = r2.intValue()
            if (r0 != r1) goto L2f
            X.B1z r0 = new X.B1z
            r0.<init>(r4, r5, r3)
            goto L25
        Lb3:
            int r0 = r2.intValue()
            if (r0 != r1) goto L26
            X.B2C r3 = new X.B2C
            r3.<init>(r4, r5)
            goto L26
        Lc0:
            int r0 = r2.intValue()
            if (r0 != r1) goto L14
            goto Lcd
        Lc7:
            int r0 = r2.intValue()
            if (r0 != r1) goto L1c
        Lcd:
            r0 = 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28118B1u.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):X.B2I");
    }

    public static B1Z LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, Context context) {
        o.LJIIIZ(elementDTO, "elementDTO");
        Integer num = elementDTO.styleType;
        int ordinal = EnumC28119B1v.Normal.ordinal();
        if (num == null || num.intValue() != ordinal) {
            int ordinal2 = EnumC28119B1v.CPF.ordinal();
            if (num == null || num.intValue() != ordinal2) {
                int ordinal3 = EnumC28119B1v.Email.ordinal();
                if (num == null || num.intValue() != ordinal3) {
                    int ordinal4 = EnumC28119B1v.CardNumber.ordinal();
                    List<PaymentMethod> list = null;
                    if (num == null || num.intValue() != ordinal4) {
                        int ordinal5 = EnumC28119B1v.Date.ordinal();
                        if (num == null || num.intValue() != ordinal5) {
                            int ordinal6 = EnumC28119B1v.Region.ordinal();
                            if (num == null || num.intValue() != ordinal6) {
                                int ordinal7 = EnumC28119B1v.Phone.ordinal();
                                if (num == null || num.intValue() != ordinal7) {
                                    int ordinal8 = EnumC28119B1v.Address.ordinal();
                                    if (num == null || num.intValue() != ordinal8) {
                                        return null;
                                    }
                                    return new C71759SEh(context);
                                }
                                return new C28111B1n(context);
                            }
                            return new SD7(context);
                        }
                        return new SD4(context);
                    }
                    SD1 sd1 = new SD1(context);
                    if (paymentMethod != null) {
                        list = paymentMethod.subPaymentMethods;
                    }
                    sd1.setPaymentList(list);
                    return sd1;
                }
            }
        }
        return new SD6(context);
    }
}
