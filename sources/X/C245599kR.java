package X;

import android.text.TextUtils;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9kR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245599kR {
    public Object LIZ;

    public C245599kR(int i) {
        if (i != 1) {
            return;
        }
        this.LIZ = new HashMap();
    }

    public /* synthetic */ C245599kR(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        this.LIZ = keyword;
    }

    public final void LIZ(String str, String eventType) {
        C9XS c9xs;
        o.LJIIIZ(eventType, "eventType");
        C245619kT c245619kT = (C245619kT) ((HashMap) this.LIZ).get(str);
        if (c245619kT == null || TextUtils.isEmpty(eventType) || (c9xs = c245619kT.LJLILLLLZI.get(eventType)) == null) {
            return;
        }
        C245589kQ c245589kQ = c9xs.LIZIZ;
        C245609kS c245609kS = c245589kQ.LIZJ;
        C245609kS c245609kS2 = c245589kQ.LIZLLL;
        c245609kS.LIZJ = c245609kS2;
        c245609kS2.LIZLLL = c245609kS;
        c245589kQ.LIZIZ.clear();
    }

    public final C9XS LIZIZ(String str, String eventType) {
        o.LJIIIZ(eventType, "eventType");
        C245619kT c245619kT = (C245619kT) ((HashMap) this.LIZ).get(str);
        if (c245619kT == null) {
            c245619kT = new C245619kT(str);
            ((HashMap) this.LIZ).put(str, c245619kT);
        }
        return c245619kT.L(eventType);
    }
}
