package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.count.FeedPlayNumModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.Y9i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86918Y9i {
    public static boolean LIZIZ;
    public static final IAccountService LIZLLL;
    public static String LJ;
    public static final HashSet<AbstractC252339vJ> LJFF;
    public static final C5H3 LJI;
    public static final C8RO LIZ = new C8RO("ConsumeManager");
    public static final C245599kR LIZJ = new C245599kR(1);

    static {
        String curUserId;
        IAccountService LJIJ = AccountService.LJIJ();
        LIZLLL = LJIJ;
        if (TextUtils.isEmpty(LJIJ.LJFF().getCurUserId())) {
            curUserId = CardStruct.IStatusCode.DEFAULT;
        } else {
            curUserId = LJIJ.LJFF().getCurUserId();
        }
        LJ = curUserId;
        LJFF = new HashSet<>();
        LJI = C221108m2.LIZ(EnumC221088m0.PUBLICATION, WFE.LJLIL);
    }

    public static ExecutorService LIZ() {
        return (ExecutorService) LJI.getValue();
    }

    public static void LJ(C86919Y9j c86919Y9j) {
        String str;
        int LIZJ2;
        int LIZIZ2;
        if (JA4.LIZ) {
            return;
        }
        JCM jcm = JCM.LIZ;
        String awemeid = c86919Y9j.LJLIL;
        synchronized (jcm) {
            o.LJIIIZ(awemeid, "awemeid");
            boolean remove = JCM.LJFF.remove(awemeid);
            C8RO c8ro = LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("remove ");
            LIZ2.append(awemeid);
            LIZ2.append(' ');
            if (remove) {
                str = "success";
            } else {
                str = "mismatch";
            }
            LIZ2.append(str);
            c8ro.LIZIZ("ConsumeManager", null, X1D.LIZIZ(LIZ2));
        }
        String str2 = c86919Y9j.LJLJJLL;
        if (str2 != null) {
            String aid = c86919Y9j.LJLIL;
            o.LJIIIZ(aid, "aid");
            JCF.LIZ();
            ArrayList<String> arrayList = C46258IDm.LIZJ;
            if (arrayList.contains(aid)) {
                LIZJ2 = jcm.LIZJ(false);
            } else {
                arrayList.add(aid);
                FeedPlayNumModel model = JCF.LIZJ.getModel();
                model.setRecommendPlayNum(model.getRecommendPlayNum() + 1);
                LIZJ2 = jcm.LIZJ(true);
            }
            ArrayList<String> arrayList2 = C46258IDm.LIZLLL;
            if (arrayList2.contains(str2)) {
                LIZIZ2 = jcm.LIZIZ(false);
            } else {
                arrayList2.add(str2);
                FeedPlayNumModel model2 = JCF.LIZJ.getModel();
                model2.setRecommendBatchNum(model2.getRecommendBatchNum() + 1);
                LIZIZ2 = jcm.LIZIZ(true);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("day_v_num", Integer.valueOf(JCF.LIZJ.getModel().getRecommendPlayNum()));
            linkedHashMap.put("session_v_num", Integer.valueOf(LIZJ2));
            linkedHashMap.put("day_r_num", Integer.valueOf(JCF.LIZJ.getModel().getRecommendBatchNum()));
            linkedHashMap.put("session_r_num", Integer.valueOf(LIZIZ2));
            Integer num = (Integer) linkedHashMap.get("day_v_num");
            if (num != null) {
                c86919Y9j.LJLJLLL = num.intValue();
            }
            Integer num2 = (Integer) linkedHashMap.get("session_v_num");
            if (num2 != null) {
                c86919Y9j.LJLJL = num2.intValue();
            }
            Integer num3 = (Integer) linkedHashMap.get("day_r_num");
            if (num3 != null) {
                c86919Y9j.LJLL = num3.intValue();
            }
            Integer num4 = (Integer) linkedHashMap.get("session_r_num");
            if (num4 != null) {
                c86919Y9j.LJLJLJ = num4.intValue();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:84|85|(17:89|90|(1:92)(1:121)|93|(1:95)|96|97|(1:101)|119|103|104|(5:108|109|(1:111)|112|(1:114))|116|109|(0)|112|(0))|123|90|(0)(0)|93|(0)|96|97|(2:99|101)|119|103|104|(6:106|108|109|(0)|112|(0))|116|109|(0)|112|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b1, code lost:
    
        if (com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r1) != 1) goto L253;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.YG0 r15, java.lang.Object r16, java.lang.Object r17, X.C86919Y9j r18) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86918Y9i.LIZIZ(X.YG0, java.lang.Object, java.lang.Object, X.Y9j):void");
    }

    public static void LIZJ(YG0 consumeEnum, String eventType, String awemeId, java.util.Map reportMap) {
        o.LJIIIZ(consumeEnum, "consumeEnum");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(reportMap, "reportMap");
        LIZLLL(consumeEnum, reportMap, Boolean.TRUE, eventType, awemeId);
    }

    public static void LIZLLL(YG0 yg0, Object obj, Object obj2, String str, String str2) {
        C8RO c8ro = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("recordInternal ");
        LIZ2.append(yg0);
        LIZ2.append(' ');
        LIZ2.append(str);
        LIZ2.append(' ');
        LIZ2.append(str2);
        c8ro.LIZ(null, X1D.LIZIZ(LIZ2));
        LIZ().execute(new RunnableC86920Y9k(yg0, obj, obj2, str2, str));
    }
}
