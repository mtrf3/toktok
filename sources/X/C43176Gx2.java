package X;

import android.text.TextUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gx2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43176Gx2 implements IRuntimeBehaviorService {
    public static final C43176Gx2 LIZ = C43180Gx6.LIZ;
    public static final List<AbstractC43178Gx4> LIZIZ = C47261Igj.LJJIJIIJI(new C43174Gx0(), new C42903Gsd(), new C42644GoS(), new C43184GxA(), new C42988Gu0(), new C42986Gty(), new Y6X(), new C86834Y6c(), new C86833Y6b(), new FR5(), new C42967Gtf(), new C42965Gtd(), new C43193GxJ(), new C42969Gth(), new C43187GxD(), new C43191GxH(), new FLS(), new FLU(), new PNB(), new FJ9(), new C43192GxI(), new C43197GxN());

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final java.util.Map<String, String> LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AbstractC43178Gx4 abstractC43178Gx4 : LIZIZ) {
            String LIZIZ2 = abstractC43178Gx4.LIZIZ();
            if (!TextUtils.isEmpty(LIZIZ2)) {
                linkedHashMap.put(abstractC43178Gx4.LIZJ(), LIZIZ2);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("RuntimeBehaviorManager loadResultSize:");
        LIZ2.append(linkedHashMap.size());
        H7B.LIZ(X1D.LIZIZ(LIZ2));
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final boolean LIZLLL() {
        try {
            Boolean feedbackRecordEnable = C2YJ.LIZIZ.LIZ.getFeedbackRecordEnable();
            o.LJIIIIZZ(feedbackRecordEnable, "{\n            SettingsRe…ackRecordEnable\n        }");
            return feedbackRecordEnable.booleanValue();
        } catch (C158056If unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void LIZ(String type) {
        o.LJIIIZ(type, "type");
        event(type, "");
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void LIZJ(ActivityC45651qj activityC45651qj) {
        PopupManager.LJIIL(new C40519FvH(activityC45651qj));
    }

    public static List LJ(long j, String type) {
        o.LJIIIZ(type, "type");
        VVX vvx = VVX.LIZIZ;
        vvx.getClass();
        return vvx.LIZ.LJIJ().LIZJ(j, type);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void event(String type, String msg) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(msg, "msg");
        if (!LIZLLL()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (AbstractC43178Gx4 abstractC43178Gx4 : LIZIZ) {
            if (abstractC43178Gx4.LIZ(type)) {
                C10K.LIZIZ(new CallableC43177Gx3(this, type, msg, currentTimeMillis, abstractC43178Gx4), C10K.LJI, null);
                return;
            }
        }
        throw new RuntimeException(i0.LJFF(type, " is not support type,please check your code or call zhaoxuan.li"));
    }
}
