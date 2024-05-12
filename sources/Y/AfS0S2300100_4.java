package Y;

import X.B0A;
import X.B0Z;
import X.C16880lQ;
import X.C27739Aud;
import X.C28057Azl;
import X.C28064Azs;
import X.C28065Azt;
import X.C28068Azw;
import X.C28072B0a;
import X.C28144B2u;
import X.C64797Pbt;
import X.C72264SXs;
import X.C76800UCe;
import X.DialogC25756A8y;
import X.EnumC28063Azr;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.SA3;
import X.SAE;
import android.app.Dialog;
import android.content.Context;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResultTrackData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS93S0300000_4;

/* loaded from: classes5.dex */
public class AfS0S2300100_4 implements InterfaceC64592gB {
    public final int $t;
    public long j5;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS0S2300100_4 afS0S2300100_4, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj2;
        CommuteInfo LJIIJJI;
        HashMap LJ;
        NewPayInfo newPayInfo;
        NewPayInfo newPayInfo2;
        PayResult payResult;
        ExceptionUX exceptionUX;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Object obj3;
        CommuteType commuteType;
        CommuteInfo LJIIJJI2;
        HashMap LJ2;
        NewPayInfo newPayInfo3;
        NewPayInfo newPayInfo4;
        PayResult payResult2;
        m mVar;
        NewPayInfo newPayInfo5;
        Response response = (Response) ((C64797Pbt) obj).LIZIZ;
        ((C28064Azs) afS0S2300100_4.l2).LJIIIIZZ = (PayResponseData) response.data;
        long currentTimeMillis = System.currentTimeMillis() - afS0S2300100_4.j5;
        String str11 = "";
        CommuteType commuteType2 = null;
        if (response.isCodeOK()) {
            C28064Azs c28064Azs = (C28064Azs) afS0S2300100_4.l2;
            if (c28064Azs.LJIIIIZZ != null) {
                C28057Azl c28057Azl = new C28057Azl(c28064Azs.LIZ);
                C28064Azs c28064Azs2 = (C28064Azs) afS0S2300100_4.l2;
                c28057Azl.LIZIZ = c28064Azs2.LIZJ;
                c28057Azl.LIZJ = c28064Azs2.LIZIZ;
                PayResponseData payResponseData = c28064Azs2.LJIIIIZZ;
                if (payResponseData != null && (newPayInfo5 = payResponseData.newPayInfo) != null) {
                    c28057Azl.LIZLLL = newPayInfo5;
                }
                c28057Azl.LJIIIZ = c28064Azs2.LIZLLL;
                if (payResponseData != null && (mVar = payResponseData.cashier) != null) {
                    c28057Azl.LJFF = mVar;
                }
                c28057Azl.LJI = c28064Azs2.LJIIJ;
                c28057Azl.LJII = (PaymentInfo) afS0S2300100_4.l4;
                HashMap<String, Object> hashMap = c28064Azs2.LJII;
                HashMap<String, Object> hashMap2 = new HashMap<>();
                if (hashMap != null) {
                    hashMap2.putAll(hashMap);
                }
                c28057Azl.LJIIIIZZ = hashMap2;
                c28057Azl.LJ = new C28065Azt((C28064Azs) afS0S2300100_4.l2, (PaymentInfo) afS0S2300100_4.l4);
                PaymentResultProcess.INSTANCE.payResultProcess(new SA3(c28057Azl));
                ((InterfaceC65784Pro) afS0S2300100_4.l3).invoke();
                String str12 = afS0S2300100_4.s0;
                List<String> list = ((C28064Azs) afS0S2300100_4.l2).LIZJ;
                if (list != null) {
                    str6 = (String) ORZ.LJLLJ(list);
                } else {
                    str6 = null;
                }
                PaymentMethod paymentMethod = ((PaymentInfo) afS0S2300100_4.l4).paymentMethod;
                if (paymentMethod != null) {
                    str7 = paymentMethod.LJIIL();
                } else {
                    str7 = null;
                }
                PayResponseData payResponseData2 = ((C28064Azs) afS0S2300100_4.l2).LJIIIIZZ;
                if (payResponseData2 != null && (newPayInfo4 = payResponseData2.newPayInfo) != null && (payResult2 = newPayInfo4.payResult) != null) {
                    str8 = SAE.LIZ(payResult2);
                } else {
                    str8 = null;
                }
                PayResponseData payResponseData3 = ((C28064Azs) afS0S2300100_4.l2).LJIIIIZZ;
                if (payResponseData3 != null && (newPayInfo3 = payResponseData3.newPayInfo) != null) {
                    str9 = newPayInfo3.redirectUrl;
                } else {
                    str9 = null;
                }
                C28068Azw.LJ("payment_pay", str12, str6, str7, str8, CardStruct.IStatusCode.DEFAULT, str9, null, currentTimeMillis);
                String str13 = afS0S2300100_4.s1;
                Long valueOf = Long.valueOf(afS0S2300100_4.j5);
                Long valueOf2 = Long.valueOf(System.currentTimeMillis() - afS0S2300100_4.j5);
                PaymentMethod paymentMethod2 = ((PaymentInfo) afS0S2300100_4.l4).paymentMethod;
                if (paymentMethod2 != null) {
                    str10 = paymentMethod2.id;
                    str11 = paymentMethod2.LJIIL();
                } else {
                    str10 = null;
                }
                HashMap<String, Object> hashMap3 = ((C28064Azs) afS0S2300100_4.l2).LJII;
                if (hashMap3 != null && (LJ2 = C27739Aud.LJ("entrance_info", hashMap3)) != null) {
                    obj3 = LJ2.get("source_page_type");
                } else {
                    obj3 = null;
                }
                String valueOf3 = String.valueOf(obj3);
                PaymentMethod paymentMethod3 = ((PaymentInfo) afS0S2300100_4.l4).paymentMethod;
                if (paymentMethod3 != null && (LJIIJJI2 = paymentMethod3.LJIIJJI()) != null) {
                    commuteType = LJIIJJI2.commuteType;
                } else {
                    commuteType = null;
                }
                C72264SXs.LIZ(((C28064Azs) afS0S2300100_4.l2).LIZ).LJIIIIZZ(C27739Aud.LJI(new PayResultTrackData(str13, valueOf, null, valueOf2, str10, str11, 0, valueOf3, commuteType)), afS0S2300100_4.s1);
                return;
            }
        }
        ((Dialog) ((C28064Azs) afS0S2300100_4.l2).LJIIJJI.getValue()).dismiss();
        PayResponseData payResponseData4 = (PayResponseData) response.data;
        if (payResponseData4 != null && payResponseData4.exceptionUX != null) {
            EnumC28063Azr enumC28063Azr = EnumC28063Azr.FROM_DOUBLE_PAYMENT;
            Context context = ((C28064Azs) afS0S2300100_4.l2).LIZ;
            if (payResponseData4 != null) {
                exceptionUX = payResponseData4.exceptionUX;
            } else {
                exceptionUX = null;
            }
            String valueOf4 = String.valueOf(response.code);
            B0Z b0z = B0Z.LJLIL;
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS0S2300100_4.l3;
            C28144B2u.LIZ(enumC28063Azr, context, valueOf4, exceptionUX, true, b0z, interfaceC65784Pro, null, C28072B0a.LJLIL, new AqS108S0300000_4((C28064Azs) afS0S2300100_4.l2, (C28064Azs) afS0S2300100_4.l4, (PaymentInfo) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 2), null, null, null, B0A.LJLIL, new AqS93S0300000_4(response, (Response<PayResponseData>) afS0S2300100_4.l3, (InterfaceC65784Pro<C76800UCe>) afS0S2300100_4.l2, (C28064Azs) 0), null, 7168);
        } else {
            ((C28064Azs) afS0S2300100_4.l2).LIZIZ(response.message);
            ((InterfaceC65784Pro) afS0S2300100_4.l3).invoke();
        }
        String str14 = afS0S2300100_4.s0;
        List<String> list2 = ((C28064Azs) afS0S2300100_4.l2).LIZJ;
        if (list2 != null) {
            str = (String) ORZ.LJLLJ(list2);
        } else {
            str = null;
        }
        PaymentMethod paymentMethod4 = ((PaymentInfo) afS0S2300100_4.l4).paymentMethod;
        if (paymentMethod4 != null) {
            str2 = paymentMethod4.LJIIL();
        } else {
            str2 = null;
        }
        PayResponseData payResponseData5 = ((C28064Azs) afS0S2300100_4.l2).LJIIIIZZ;
        if (payResponseData5 != null && (newPayInfo2 = payResponseData5.newPayInfo) != null && (payResult = newPayInfo2.payResult) != null) {
            str3 = SAE.LIZ(payResult);
        } else {
            str3 = null;
        }
        String valueOf5 = String.valueOf(response.code);
        PayResponseData payResponseData6 = ((C28064Azs) afS0S2300100_4.l2).LJIIIIZZ;
        if (payResponseData6 != null && (newPayInfo = payResponseData6.newPayInfo) != null) {
            str4 = newPayInfo.redirectUrl;
        } else {
            str4 = null;
        }
        C28068Azw.LJ("payment_pay", str14, str, str2, str3, valueOf5, str4, response.message, currentTimeMillis);
        String str15 = afS0S2300100_4.s1;
        Long valueOf6 = Long.valueOf(currentTimeMillis);
        PaymentMethod paymentMethod5 = ((PaymentInfo) afS0S2300100_4.l4).paymentMethod;
        if (paymentMethod5 != null) {
            str5 = paymentMethod5.id;
            str11 = paymentMethod5.LJIIL();
        } else {
            str5 = null;
        }
        Boolean bool = Boolean.FALSE;
        HashMap<String, Object> hashMap4 = ((C28064Azs) afS0S2300100_4.l2).LJII;
        if (hashMap4 != null && (LJ = C27739Aud.LJ("entrance_info", hashMap4)) != null) {
            obj2 = LJ.get("source_page_type");
        } else {
            obj2 = null;
        }
        String valueOf7 = String.valueOf(obj2);
        PaymentMethod paymentMethod6 = ((PaymentInfo) afS0S2300100_4.l4).paymentMethod;
        if (paymentMethod6 != null && (LJIIJJI = paymentMethod6.LJIIJJI()) != null) {
            commuteType2 = LJIIJJI.commuteType;
        }
        C28068Azw.LIZJ(str15, valueOf6, str5, str11, bool, valueOf7, commuteType2, response.message, String.valueOf(response.code));
    }

    public static final void accept$1(AfS0S2300100_4 afS0S2300100_4, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj2;
        CommuteType commuteType;
        CommuteInfo LJIIJJI;
        HashMap LJ;
        Throwable th = (Throwable) obj;
        C28064Azs c28064Azs = (C28064Azs) afS0S2300100_4.l2;
        c28064Azs.getClass();
        try {
            ((DialogC25756A8y) c28064Azs.LJIIJJI.getValue()).dismiss();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        String str6 = null;
        ((C28064Azs) afS0S2300100_4.l2).LIZIZ(null);
        ((InterfaceC65784Pro) afS0S2300100_4.l3).invoke();
        long currentTimeMillis = System.currentTimeMillis() - afS0S2300100_4.j5;
        String str7 = afS0S2300100_4.s0;
        List<String> list = ((C28064Azs) afS0S2300100_4.l2).LIZJ;
        if (list != null) {
            str = (String) ORZ.LJLLJ(list);
        } else {
            str = null;
        }
        PaymentMethod paymentMethod = ((PaymentInfo) afS0S2300100_4.l4).paymentMethod;
        if (paymentMethod != null) {
            str2 = paymentMethod.LJIIL();
        } else {
            str2 = null;
        }
        if (th != null) {
            str3 = th.getMessage();
        } else {
            str3 = null;
        }
        C28068Azw.LJ("payment_pay", str7, str, str2, null, "-1", null, str3, currentTimeMillis);
        String str8 = afS0S2300100_4.s1;
        Long valueOf = Long.valueOf(currentTimeMillis);
        PaymentMethod paymentMethod2 = ((PaymentInfo) afS0S2300100_4.l4).paymentMethod;
        if (paymentMethod2 != null) {
            str4 = paymentMethod2.id;
            str5 = paymentMethod2.LJIIL();
        } else {
            str4 = null;
            str5 = "";
        }
        Boolean bool = Boolean.FALSE;
        HashMap<String, Object> hashMap = ((C28064Azs) afS0S2300100_4.l2).LJII;
        if (hashMap != null && (LJ = C27739Aud.LJ("entrance_info", hashMap)) != null) {
            obj2 = LJ.get("source_page_type");
        } else {
            obj2 = null;
        }
        String valueOf2 = String.valueOf(obj2);
        PaymentMethod paymentMethod3 = ((PaymentInfo) afS0S2300100_4.l4).paymentMethod;
        if (paymentMethod3 != null && (LJIIJJI = paymentMethod3.LJIIJJI()) != null) {
            commuteType = LJIIJJI.commuteType;
        } else {
            commuteType = null;
        }
        if (th != null) {
            str6 = th.getMessage();
        }
        C28068Azw.LIZJ(str8, valueOf, str4, str5, bool, valueOf2, commuteType, str6, "-1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S2300100_4(long r2, X.C28064Azs r4, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r5, java.lang.String r6, java.lang.String r7, X.InterfaceC65784Pro r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            switch(r9) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l2 = r4
            r0.l3 = r8
            r0.j5 = r2
            r0.s0 = r6
            r0.l4 = r5
            r0.s1 = r7
        L12:
            r0.<init>()
            return
        L16:
            r0 = r1
            r0.l2 = r4
            r0.j5 = r2
            r0.l3 = r8
            r0.s0 = r6
            r0.l4 = r5
            r0.s1 = r7
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S2300100_4.<init>(long, X.Azs, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.lang.String, java.lang.String, X.Pro, int):void");
    }
}
