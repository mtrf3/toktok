package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C16880lQ;
import X.C221108m2;
import X.C27739Aud;
import X.C62712d9;
import X.C62822Ol8;
import X.C65330PkU;
import X.C65352Pkq;
import X.C73969T1h;
import X.EO4;
import X.InterfaceC60061Nhh;
import X.InterfaceC65349Pkn;
import X.T16;
import X.X1D;
import Y.IDxS307S0100000_6;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.google.gson.m;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EcomPaymentInterceptor implements IInterceptor, InterfaceC60061Nhh {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 518));

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    /* loaded from: classes5.dex */
    public static final class BindResultEvent {

        @InterfaceC65349Pkn("bind_result_url")
        public final String bindResultUrl;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BindResultEvent) && o.LJ(this.bindResultUrl, ((BindResultEvent) obj).bindResultUrl);
        }

        public final int hashCode() {
            String str = this.bindResultUrl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BindResultEvent(bindResultUrl=");
            return q.LIZIZ(LIZ, this.bindResultUrl, ')', LIZ);
        }

        public BindResultEvent(String str) {
            this.bindResultUrl = str;
        }
    }

    /* loaded from: classes5.dex */
    public static final class CashierParams {

        @InterfaceC65349Pkn("cashier_id")
        public final String cashierId;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CashierParams) && o.LJ(this.cashierId, ((CashierParams) obj).cashierId);
        }

        public final int hashCode() {
            String str = this.cashierId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CashierParams(cashierId=");
            return q.LIZIZ(LIZ, this.cashierId, ')', LIZ);
        }

        public CashierParams(String str) {
            this.cashierId = str;
        }
    }

    static {
        C16880lQ.LJLLJ(EcomPaymentInterceptor.class);
    }

    public final Map<String, m> LIZ() {
        return (Map) this.LJLJI.getValue();
    }

    public static void LIZIZ(m mVar) {
        String str;
        IEventCenter LJ = EventCenter.LJ();
        if (mVar == null || (str = mVar.toString()) == null) {
            str = "{}";
        }
        LJ.LIZ("ec_send_caisher", str);
    }

    public final synchronized void LIZJ(m mVar) {
        if (this.LJLIL == 2) {
            LIZIZ(mVar);
            this.LJLILLLLZI = false;
            this.LJLIL = 0;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getHost();
        } else {
            str = null;
        }
        return o.LJ(str, "ec");
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        String str2;
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_fetch_caisher")) {
            CashierParams cashierParams = null;
            if (this.LJLIL == 0) {
                EO4 eo4 = PaymentApi.LIZ;
                Boolean bool = Boolean.FALSE;
                eo4.getClass();
                EO4.LIZ(bool, null).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS307S0100000_6(this, 2));
                return;
            }
            this.LJLILLLLZI = true;
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(CashierParams.class)));
                if (!(fromJson instanceof CashierParams)) {
                    fromJson = null;
                }
                cashierParams = (CashierParams) fromJson;
            } catch (s unused) {
            }
            if (cashierParams != null && (str2 = cashierParams.cashierId) != null) {
                LIZJ(LIZ().get(str2));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0264, code lost:
    
        if (r4.equals("orderlist") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0284, code lost:
    
        r6 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        r1 = r25.getExtra();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0290, code lost:
    
        if (r1 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0292, code lost:
    
        r1 = X.C16880lQ.LLJJIJIIJIL(r1, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0296, code lost:
    
        r3 = X.C1EU.LIZIZ(r1, "cashier_id", r6);
        r1 = r25.getExtra();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x029e, code lost:
    
        if (r1 == null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02a0, code lost:
    
        r1 = X.C16880lQ.LLJJIJIIJIL(r1, "source");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02a4, code lost:
    
        r4 = r3.appendQueryParameter("source", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02a8, code lost:
    
        if (r8 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ae, code lost:
    
        if (ujb.o.LJJJJJL(r8) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f2, code lost:
    
        r4.appendQueryParameter("trackParams", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02b0, code lost:
    
        if (r24 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b2, code lost:
    
        com.ss.android.ugc.aweme.bullet.impl.BulletService.LIZ().LJIIIIZZ(r24, java.lang.String.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02bd, code lost:
    
        r4 = X.C27739Aud.LIZIZ(r25.getExtra(), "requestParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02c7, code lost:
    
        if (r4 != null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02c9, code lost:
    
        r4 = new java.util.HashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ce, code lost:
    
        r1 = r25.getExtra();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02d2, code lost:
    
        if (r1 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02d4, code lost:
    
        r1 = X.C16880lQ.LLJJIJI(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02d8, code lost:
    
        if (r1 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02da, code lost:
    
        r7 = X.C16880lQ.LLJJIII(r1, "cashier");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02de, code lost:
    
        if (r7 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02e2, code lost:
    
        if ((r7 instanceof com.google.gson.m) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02e4, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02e5, code lost:
    
        r3 = (com.google.gson.m) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02e7, code lost:
    
        if (r3 != null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02eb, code lost:
    
        if ((r7 instanceof java.lang.String) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02ed, code lost:
    
        r7 = (java.lang.String) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02fb, code lost:
    
        r3 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(X.C27739Aud.LJFF(), r7, X.C65330PkU.LIZJ(X.C65352Pkq.LIZLLL(com.google.gson.m.class)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x030f, code lost:
    
        if ((r3 instanceof com.google.gson.m) != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0311, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0312, code lost:
    
        r3 = (com.google.gson.m) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0314, code lost:
    
        if (r3 != null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02fa, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0317, code lost:
    
        r23.LJLIL = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x031b, code lost:
    
        if (r23.LJLILLLLZI == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x031d, code lost:
    
        LIZJ(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0322, code lost:
    
        LIZ().put(r6, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02f0, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02f6, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02f8, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x026e, code lost:
    
        if (r4.equals("mall") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0380, code lost:
    
        r6 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        r1 = r25.getExtra();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x038c, code lost:
    
        if (r1 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x038e, code lost:
    
        r4 = X.C16880lQ.LLJJIJIIJIL(r1, "source");
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0392, code lost:
    
        r1 = r25.getExtra();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0396, code lost:
    
        if (r1 == null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0398, code lost:
    
        r2 = X.C16880lQ.LLJJIJIIJIL(r1, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x039c, code lost:
    
        r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r2).buildUpon().appendQueryParameter("cashier_id", r6).appendQueryParameter("source", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03ac, code lost:
    
        if (r8 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03b2, code lost:
    
        if (ujb.o.LJJJJJL(r8) == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03f0, code lost:
    
        r3.appendQueryParameter("trackParams", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03b4, code lost:
    
        if (r24 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03b6, code lost:
    
        com.ss.android.ugc.aweme.bullet.impl.BulletService.LIZ().LJIIIIZZ(r24, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03c1, code lost:
    
        r23.LJLIL = 1;
        r2 = com.ss.android.ugc.aweme.ecommerce.base.payment.api.PaymentApi.LIZ;
        r1 = java.lang.Boolean.FALSE;
        r2.getClass();
        X.EO4.LIZ(r1, r4).LJJL(X.T16.LIZ()).LJJJ(X.C73969T1h.LIZIZ()).LJJJLIIL(new Y.AfS25S1100000_12(r23, r6, 1), new Y.AfS64S0100000_12(r23, 24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03f4, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0278, code lost:
    
        if (r4.equals("viewcode") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0282, code lost:
    
        if (r4.equals("orderdetail") != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x037c, code lost:
    
        if (r4.equals("ordercenter") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0458, code lost:
    
        if ((r2 instanceof X.ActivityC45651qj) != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fe, code lost:
    
        if (r4 == null) goto L78;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r24, com.bytedance.router.RouteIntent r25) {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
