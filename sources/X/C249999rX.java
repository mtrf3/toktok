package X;

import com.bytedance.touchpoint.core.pendant.manager.BasePendantManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9rX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249999rX implements InterfaceC250039rb {
    public static final C5H3 LIZLLL = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C250119rj.LJLIL);
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C250069re.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C250019rZ.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C250029ra.LJLIL);

    @Override // X.InterfaceC250039rb
    public final void LIZIZ() {
        ((java.util.Map) this.LIZIZ.getValue()).clear();
    }

    @Override // X.InterfaceC250039rb
    public final boolean LIZ(String str) {
        Integer num = (Integer) ((java.util.Map) this.LIZIZ.getValue()).get(str);
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final void LIZLLL(BasePendantManager observer) {
        o.LJIIIZ(observer, "observer");
        ((List) this.LIZJ.getValue()).add(observer);
    }

    public final void LJ(int i, String activityId) {
        o.LJIIIZ(activityId, "activityId");
        ((java.util.Map) this.LIZIZ.getValue()).put(activityId, Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
    
        if (r0 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006a, code lost:
    
        if (r0 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00df, code lost:
    
        if (r15 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e3, code lost:
    
        if (r15 != null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    @Override // X.InterfaceC250039rb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.content.Context r14, X.C9OT r15, int r16) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249999rX.LIZJ(android.content.Context, X.9OT, int):void");
    }
}
