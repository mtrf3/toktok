package X;

import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentsData;

/* renamed from: X.8QN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8QN {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C8QM.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C8QP.LJLIL);

    public static FeedComponentPriorityData LIZIZ() {
        FeedComponentsData feedComponentsData;
        if (((Boolean) C53664L4i.LIZJ.getValue()).booleanValue() && (feedComponentsData = (FeedComponentsData) LIZ.getValue()) != null) {
            return feedComponentsData.componentPriorityData;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ce, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.jvm.internal.DefaultConstructorMarker, com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZLLL(com.ss.android.ugc.feed.platform.componentmanager.data.FeedMultiSceneComponentsData r23) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8QN.LIZLLL(com.ss.android.ugc.feed.platform.componentmanager.data.FeedMultiSceneComponentsData):java.util.Map");
    }

    public static final FeedComponentPriorityData LIZ(String str, String str2) {
        java.util.Map map;
        FeedComponentsData feedComponentsData;
        if (C53664L4i.LIZ(str)) {
            if (!C53664L4i.LIZ(str) || (map = (java.util.Map) LIZIZ.getValue()) == null || (feedComponentsData = (FeedComponentsData) map.get(str)) == null) {
                return null;
            }
            return feedComponentsData.componentPriorityData;
        }
        if (!C53664L4i.LIZIZ(str2)) {
            return null;
        }
        return LIZIZ();
    }

    public static void LIZJ(int i, String str) {
        C8QG.LIZ("app_start", "app_start", str, i, "data", null, 32);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fd, code lost:
    
        if (r13.equals("low_tag") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012c, code lost:
    
        r2.parentContainerKey = "left_container";
        r0 = r11.get("main_tag");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0136, code lost:
    
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x013a, code lost:
    
        if (r0.showLimit != (-1)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013c, code lost:
    
        r2.customShowLimit = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0106, code lost:
    
        if (r13.equals("anchor") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0112, code lost:
    
        r2.parentContainerKey = "left_container";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010f, code lost:
    
        if (r13.equals("bottom_button") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0129, code lost:
    
        if (r13.equals("high_tag") == false) goto L59;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x00d9. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentsData LJ(com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentsData r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8QN.LJ(com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentsData, java.lang.String):com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentsData");
    }
}
