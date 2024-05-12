package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.54Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54Z implements InterfaceC131385Dq {
    public final C1297357h LIZ;
    public float LJ;
    public java.util.Map<NLETrackSlot, java.util.Set<C1290754t>> LIZIZ = new LinkedHashMap();
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 846));
    public List<? extends NLETrackSlot> LIZLLL = new ArrayList();
    public int LJFF = -1;
    public int LJI = -1;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0282, code lost:
    
        r0 = (r29.LJ / X.C1300758p.LIZIZ()) + ((float) (r0.getStartTime() / 1000));
        r9 = 1000;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013e  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.Set] */
    @Override // X.InterfaceC131385Dq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5E1 LIZ() {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54Z.LIZ():X.5E1");
    }

    public C54Z(C1297357h c1297357h) {
        this.LIZ = c1297357h;
    }

    @Override // X.InterfaceC131385Dq
    public final void LIZIZ(C5DY key) {
        o.LJIIIZ(key, "key");
        C2ND.LIZIZ(new C1288854a(this, key), 0L);
    }
}
