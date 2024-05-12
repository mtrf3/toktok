package X;

import Y.ARunnableS27S0200000_8;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.services.IEffectCardService;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KNZ implements IEffectCardService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(KNY.LJLIL);

    @Override // com.ss.android.ugc.aweme.services.IEffectCardService
    public final boolean effectRecommendationCardExperimentEnabled() {
        return e1.LIZ(31744, "show_effect_card", true, false);
    }

    public final KNW LIZIZ() {
        return (KNW) this.LIZ.getValue();
    }

    public static CardShowInfo LIZ(FeedCardInsertData feedCardInsertData) {
        List<CardShowInfo> list;
        CardShowInfo cardShowInfo = null;
        if (feedCardInsertData == null || (list = feedCardInsertData.showInfoList) == null) {
            return null;
        }
        Iterator<CardShowInfo> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CardShowInfo next = it.next();
            if (next.cardType == 2) {
                cardShowInfo = next;
                break;
            }
        }
        return cardShowInfo;
    }

    @Override // com.ss.android.ugc.aweme.services.IEffectCardService
    public final View getEffectRecommendView(Context context) {
        o.LJIIIZ(context, "context");
        if (KNN.LIZ()) {
            return new KNA(context, null, 0);
        }
        return new KN9(context, null, 0);
    }

    @Override // com.ss.android.ugc.aweme.services.IEffectCardService
    public final void filterEffectCardAweme(List<? extends Aweme> list, Context context) {
        String cardInsertStatus;
        CardInsertInfo cardInsertInfo;
        if (list != null && !list.isEmpty() && e1.LIZ(31744, "show_effect_card", true, false) && list != null) {
            List LJLL = ORZ.LJLL(list);
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LJLL).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Aweme aweme = (Aweme) next;
                if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null && cardInsertInfo.getCardType() == 2) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Aweme aweme2 = (Aweme) it2.next();
                CardInsertInfo cardInsertInfo2 = aweme2.getCardInsertInfo();
                if (cardInsertInfo2 != null && (cardInsertStatus = cardInsertInfo2.getCardInsertStatus()) != null && cardInsertStatus.length() == 0 && C65777Prh.LJI(list)) {
                    list.remove(aweme2);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Aweme aweme3 = (Aweme) it3.next();
                if (context != null) {
                    C38995FSd.LIZLLL().execute(new ARunnableS27S0200000_8(context, aweme3, 92));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IEffectCardService
    public final Object getEffectRecommendCardViewHolder(View view, Fragment fragment) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(fragment, "fragment");
        return new C54856Lfw(view, fragment);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00bb, code lost:
    
        LIZIZ().getClass();
        r0 = X.KNW.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00c6, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00c8, code lost:
    
        r0 = java.lang.Integer.valueOf(r0.getInt("effectCardRetryCount", 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00d0, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00d2, code lost:
    
        r1 = r0.intValue() + 1;
        r0 = X.KNW.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00dc, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00de, code lost:
    
        r0.storeInt("effectCardRetryCount", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00af, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0073, code lost:
    
        LIZIZ().getClass();
        r0 = X.KNW.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x007e, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0080, code lost:
    
        r0.storeInt("effectCardRetryCount", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00b1, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0057, code lost:
    
        if (r7.toMillis(r0) <= r10) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (X.AV1.LJIILLIIL() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if (r14 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        r0 = r14.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (r0 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r15 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r15.intValue() != 20000) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        LIZIZ().getClass();
        r0 = X.KNW.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        r0 = java.lang.Integer.valueOf(r0.getInt("effectCardRetryCount", 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        r1 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        if (r1 < X.Q7K.LIZIZ("fyp_effect_card_max_request_times", 0)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (r15 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        if (r15.intValue() == 20000) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (r15 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        if (r15.intValue() == 20000) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e9, code lost:
    
        if (X.C51602KNa.LIZ().resetCounter == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
    
        LIZIZ().getClass();
        r0 = X.KNW.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f6, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f8, code lost:
    
        r0.storeInt("effectCardHasShownCountKey", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fb, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fc, code lost:
    
        r0 = LIZ(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0100, code lost:
    
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0102, code lost:
    
        r1 = java.lang.Integer.valueOf(r0.flowIndex);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0108, code lost:
    
        if (r14 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
    
        r0 = java.lang.Integer.valueOf(r14.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0110, code lost:
    
        r11 = kotlin.jvm.internal.o.LJ(r1, r0);
        LIZIZ().getClass();
        r8 = X.KNW.LIZ();
        LIZIZ().getClass();
        r2 = X.KNW.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012a, code lost:
    
        if (r2 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012c, code lost:
    
        r7 = r2.getStringArray("effectCardHasShownCardId", new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0134, code lost:
    
        if (r7 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0136, code lost:
    
        r5 = r7.length;
        r2 = 0;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0139, code lost:
    
        if (r2 >= r5) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
    
        r0 = (java.lang.Boolean) r8.get(r7[r2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0143, code lost:
    
        if (r0 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        if (r0.booleanValue() != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014d, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015b, code lost:
    
        if (r1 < X.C51602KNa.LIZ().noActionTimes) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015d, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015e, code lost:
    
        r0 = LIZ(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0162, code lost:
    
        if (r0 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0164, code lost:
    
        r9 = java.lang.Integer.valueOf(r0.timeInterval);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016a, code lost:
    
        if (r9 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016c, code lost:
    
        if (r10 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016e, code lost:
    
        r9 = java.lang.Integer.valueOf((X.C51602KNa.LIZ().coolDownDays * 24) + r9.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017f, code lost:
    
        LIZIZ().getClass();
        r5 = X.KNW.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018a, code lost:
    
        if (r5 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
    
        r0 = java.lang.Long.valueOf(r5.getLong("effectCardLastStartCountingTime", 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0198, code lost:
    
        r7 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019c, code lost:
    
        if (r0 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019e, code lost:
    
        if (r9 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b2, code lost:
    
        if ((r7 - r0.longValue()) < java.util.concurrent.TimeUnit.HOURS.toMillis(r9.intValue())) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b4, code lost:
    
        LIZIZ().getClass();
        r0 = X.KNW.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01bf, code lost:
    
        if (r0 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c1, code lost:
    
        r0.storeInt("effectCardHasShownCountKey", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c4, code lost:
    
        r2 = LIZ(r14);
        LIZIZ().getClass();
        r0 = X.KNW.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d3, code lost:
    
        if (r0 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d5, code lost:
    
        r1 = java.lang.Integer.valueOf(r0.getInt("effectCardHasShownCountKey", 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01dd, code lost:
    
        if (r10 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01df, code lost:
    
        r12 = java.lang.Integer.valueOf(X.C51602KNa.LIZ().reducedMaxCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e9, code lost:
    
        if (r1 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01eb, code lost:
    
        if (r12 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f5, code lost:
    
        if (r1.intValue() < r12.intValue()) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x020c, code lost:
    
        if (r11 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f9, code lost:
    
        if (r2 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01fb, code lost:
    
        r12 = java.lang.Integer.valueOf(r2.maxShowCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0202, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0204, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0206, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0209, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0154, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0150, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0152, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (X.EGE.LIZIZ.LIZ() > (r10 - r8)) goto L11;
     */
    @Override // com.ss.android.ugc.aweme.services.IEffectCardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldInsertEffectRecommendCard(java.lang.Object r14, java.lang.Integer r15) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KNZ.shouldInsertEffectRecommendCard(java.lang.Object, java.lang.Integer):boolean");
    }
}
