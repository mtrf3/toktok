package X;

import Y.ACallableS7S2100000_1;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyGroupStruct;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyRspStruct;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2ZZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2ZZ {
    public static final ExecutorService LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final C62822Ol8 LIZLLL;
    public static final C62822Ol8 LJ;
    public static volatile int LJFF;
    public static final C62822Ol8 LJI;
    public static final C62822Ol8 LJII;
    public static final C62822Ol8 LJIIIIZZ;

    static {
        C38027EwB c38027EwB = new C38027EwB(FSY.SERIAL);
        c38027EwB.LIZIZ = "feed_insertion_executor";
        LIZ = C37191Eih.LIZ(c38027EwB);
        LIZIZ = C221108m2.LIZIZ(C60502Za.LJLIL);
        LIZJ = C221108m2.LIZIZ(C2U0.LJLIL);
        LIZLLL = C221108m2.LIZIZ(C60512Zb.LJLIL);
        LJ = C221108m2.LIZIZ(C2U1.LJLIL);
        LJI = C221108m2.LIZIZ(C2U2.LJLIL);
        LJII = C221108m2.LIZIZ(C59192Tz.LJLIL);
        LJIIIIZZ = C221108m2.LIZIZ(C60522Zc.LJLIL);
    }

    public static CopyOnWriteArrayList LIZJ() {
        return (CopyOnWriteArrayList) LJII.getValue();
    }

    public static CopyOnWriteArrayList LIZLLL() {
        return (CopyOnWriteArrayList) LIZLLL.getValue();
    }

    public static CopyOnWriteArrayList LJ() {
        return (CopyOnWriteArrayList) LJ.getValue();
    }

    public static ConcurrentHashMap LJFF() {
        return (ConcurrentHashMap) LIZIZ.getValue();
    }

    public static void LIZ(Aweme aweme) {
        String str;
        List<Long> clientGidList;
        Long l;
        if (LIZLLL().isEmpty()) {
            return;
        }
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        long LJI2 = LJI(str);
        if (!LJ().contains(Long.valueOf(LJI2))) {
            LJ().add(Long.valueOf(LJI2));
        }
        ConsistencyRspStruct consistencyRspStruct = (ConsistencyRspStruct) ORZ.LJLLJ(LIZLLL());
        if (consistencyRspStruct == null || (clientGidList = consistencyRspStruct.getClientGidList()) == null || (l = (Long) ORZ.LLFF(clientGidList)) == null || LJI2 != l.longValue()) {
            return;
        }
        consistencyRspStruct.setClientGidList(LJ());
        consistencyRspStruct.setFinalGidList(LJ());
        if (aweme != null) {
            str2 = aweme.getRequestId();
        }
        LJIIIIZZ(consistencyRspStruct, str2, false);
        ORS.LJJLJ(LIZLLL());
        LJ().clear();
    }

    public static long LJI(String str) {
        if (str != null) {
            try {
                return CastLongProtector.parseLong(str);
            } catch (NumberFormatException unused) {
                long j = -3750763034362895579L;
                for (int i = 0; i < str.length(); i++) {
                    j = (j ^ str.charAt(i)) * C60532Zd.LIZLLL;
                }
                return j;
            }
        }
        return 0L;
    }

    public static ConsistencyGroupStruct LIZIZ(long j, String str, String str2) {
        int i;
        HashMap<String, String> groupExtraInfo;
        ConsistencyGroupStruct consistencyGroupStruct = new ConsistencyGroupStruct();
        if (ORZ.LJLJJI(str2, C60532Zd.LIZ)) {
            i = 9;
        } else if (ORZ.LJLJJI(str2, C60532Zd.LIZIZ)) {
            i = 10;
        } else {
            i = -1;
        }
        consistencyGroupStruct.setConsistencyVideoType(Integer.valueOf(i));
        if (o.LJ(str2, "ad_rerank")) {
            consistencyGroupStruct.setRerankReason(str2);
            consistencyGroupStruct.getRerankReasonList().add(str2);
        } else {
            consistencyGroupStruct.setProvideReason(str2);
            consistencyGroupStruct.setProvideStage(4);
            if (str != null && !o.LJ(str, String.valueOf(j)) && (groupExtraInfo = consistencyGroupStruct.getGroupExtraInfo()) != null) {
                groupExtraInfo.put("client_origin_id", str);
            }
        }
        return consistencyGroupStruct;
    }

    public static final void LJII(String str, Aweme aweme, String str2) {
        if (!C57232Ml.LIZ() || str2 == null || TextUtils.isEmpty(str2)) {
            return;
        }
        C10K.LIZIZ(new ACallableS7S2100000_1(str2, aweme, str, 6), LIZ, null);
    }

    public static void LJIIIIZZ(ConsistencyRspStruct consistencyRspStruct, String str, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            consistencyRspStruct.setRspType(i);
            String LJIILL = GsonHolder.LIZLLL().LIZ().LJIILL(consistencyRspStruct);
            if (LJIILL != null && s.LJZI(LJIILL).toString().length() != 0) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("video_consistency", LJIILL);
                c188727au.LJ(System.currentTimeMillis(), "mob_time");
                c188727au.LJIIIZ("request_id", str);
                FMX.LJIIL("video_consistency_event", c188727au.LIZ);
            }
        } catch (Exception unused) {
        }
    }
}
