package com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment;

import X.AbstractC35763E1v;
import X.AbstractC73672Svk;
import X.C1NE;
import X.C32I;
import X.C35761E1t;
import X.C35762E1u;
import X.C47261Igj;
import X.E61;
import X.E6N;
import X.E6P;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC35766E1y;
import X.InterfaceC35860E5o;
import X.InterfaceC65349Pkn;
import X.O6R;
import X.X1D;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.plugin.clienttrigger.BaseEventMatch;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class RealtimeFeedbackInterceptor implements InterfaceC35766E1y {
    public static final Keva LJFF = Keva.getRepo("realtime_repo");
    public CountDownTimer LIZJ;
    public InterfaceC35860E5o LIZLLL;
    public final List<BaseEventMatch> LIZ = C47261Igj.LJJIJIL(new BaseEventMatch("video_play_end", new ArrayList()), new BaseEventMatch("like", new ArrayList()), new BaseEventMatch("dislike", new ArrayList()), new BaseEventMatch("like_cancel", new ArrayList()));
    public final ArrayList<AbstractC35763E1v> LIZIZ = new ArrayList<>();
    public final E61 LJ = new E61();

    /* loaded from: classes7.dex */
    public interface RealtimeApi {
        @E8M("/tiktok/v1/realtime/feedback/")
        AbstractC73672Svk<RealtimeFeedbackInterceptor$RealtimeFeedbackModel$RealtimeFeedbackResponse> uploadRealtimeFeedback(@InterfaceC195727mC RealtimeFeedbackInterceptor$RealtimeFeedbackModel$RealtimeFeedbackRequest realtimeFeedbackInterceptor$RealtimeFeedbackModel$RealtimeFeedbackRequest);
    }

    public final synchronized void LIZ() {
        CountDownTimer countDownTimer = this.LIZJ;
        if (countDownTimer == null || countDownTimer.isCancelled()) {
            CountDownTimer countDownTimer2 = new CountDownTimer(6000L, 5000L, new E6P(this));
            this.LIZJ = countDownTimer2;
            countDownTimer2.cancel();
            CountDownTimer countDownTimer3 = this.LIZJ;
            if (countDownTimer3 != null) {
                countDownTimer3.start();
            }
        } else {
            CountDownTimer countDownTimer4 = this.LIZJ;
            if (countDownTimer4 != null) {
                countDownTimer4.resume();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor$RealtimeFeedbackModel$RealtimeFeedbackRequest] */
    public static RealtimeFeedbackInterceptor$RealtimeFeedbackModel$RealtimeFeedbackRequest LIZIZ(ArrayList arrayList) {
        String str;
        int type;
        Object obj;
        Long l;
        Object obj2;
        String str2;
        String str3;
        Object obj3;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC35763E1v abstractC35763E1v = (AbstractC35763E1v) it.next();
            Map<String, Object> LIZLLL = abstractC35763E1v.LIZLLL();
            Long l2 = null;
            if (LIZLLL != null && (obj3 = LIZLLL.get("item_id")) != null) {
                str = obj3.toString();
            } else {
                str = null;
            }
            String LIZJ = abstractC35763E1v.LIZJ();
            switch (LIZJ.hashCode()) {
                case 3321751:
                    if (LIZJ.equals("like")) {
                        type = E6N.LIKE.getType();
                        break;
                    }
                    break;
                case 282427540:
                    if (LIZJ.equals("video_play_end")) {
                        type = E6N.VIDEO_PLAY_END.getType();
                        break;
                    }
                    break;
                case 1190532130:
                    if (LIZJ.equals("like_cancel")) {
                        type = E6N.LIKE_CANCEL.getType();
                        break;
                    }
                    break;
                case 1671642405:
                    if (LIZJ.equals("dislike")) {
                        type = E6N.DISLIKE.getType();
                        break;
                    }
                    break;
            }
            type = E6N.UNKNOWN.getType();
            Map<String, Object> LIZLLL2 = abstractC35763E1v.LIZLLL();
            if (LIZLLL2 != null) {
                obj = LIZLLL2.get("play_duration");
            } else {
                obj = null;
            }
            if ((obj instanceof String) && (str3 = (String) obj) != null) {
                l = Long.valueOf(CastLongProtector.parseLong(str3));
            } else {
                l = null;
            }
            Map<String, Object> LIZLLL3 = abstractC35763E1v.LIZLLL();
            if (LIZLLL3 != null) {
                obj2 = LIZLLL3.get("video_duration");
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof String) && (str2 = (String) obj2) != null) {
                l2 = Long.valueOf(O6R.LJJIJ(CastFloatProtector.parseFloat(str2)));
            }
            arrayList2.add(new RealtimeFeedbackInterceptor$RealtimeFeedbackModel$ContentParams(str, type, l, l2));
        }
        final ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((RealtimeFeedbackInterceptor$RealtimeFeedbackModel$ContentParams) next).actionType != E6N.UNKNOWN.getType()) {
                arrayList3.add(next);
            }
        }
        return new Object(arrayList3) { // from class: com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor$RealtimeFeedbackModel$RealtimeFeedbackRequest

            @InterfaceC65349Pkn("realtime_feedback")
            public final List<RealtimeFeedbackInterceptor$RealtimeFeedbackModel$ContentParams> contentParams;

            public final boolean equals(Object obj4) {
                if (this == obj4) {
                    return true;
                }
                return (obj4 instanceof RealtimeFeedbackInterceptor$RealtimeFeedbackModel$RealtimeFeedbackRequest) && o.LJ(this.contentParams, ((RealtimeFeedbackInterceptor$RealtimeFeedbackModel$RealtimeFeedbackRequest) obj4).contentParams);
            }

            public final int hashCode() {
                return this.contentParams.hashCode();
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("RealtimeFeedbackRequest(contentParams=");
                return C1NE.LIZIZ(LIZ, this.contentParams, ')', LIZ);
            }

            {
                o.LJIIIZ(arrayList3, "contentParams");
                this.contentParams = arrayList3;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f0, code lost:
    
        if (r2 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d6, code lost:
    
        if (r2 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x012c, code lost:
    
        if (r2 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0112, code lost:
    
        if (r2 == null) goto L72;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0058. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.AbstractC35763E1v r12) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor.LIZJ(X.E1v):void");
    }

    @Override // X.InterfaceC35766E1y
    public void onEvent(String str) {
        if (str == null) {
            return;
        }
        LIZJ(new C35761E1t(str, null));
    }

    @Override // X.InterfaceC35766E1y
    public final void onEvent(String str, Map<String, String> map) {
        if (str == null) {
            return;
        }
        LIZJ(new C35761E1t(str, map));
    }

    @Override // X.InterfaceC35766E1y
    public final void onEvent(String str, JSONObject jSONObject) {
        if (str == null) {
            return;
        }
        LIZJ(new C35762E1u(str, jSONObject));
    }
}
