package X;

import Y.ARunnableS12S1200000_13;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Uka, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78076Uka {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C0M5<C78102Ul0> LIZ;
    public boolean LIZIZ;
    public final String LIZJ;

    public C78076Uka() {
        new LinkedList();
        new C73318Sq2();
        this.LIZ = new C0M5<>();
        this.LIZJ = "";
    }

    public static int LIZ() {
        Object obj;
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        java.util.Map map = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29824BnA.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = 0;
        }
        return o.LJ(valueOf, obj) ? 1 : 0;
    }

    public final void LIZLLL(int i, boolean z) {
        this.LIZIZ = z;
        C78102Ul0 LJ = this.LIZ.LJ(i, null);
        if (LJ == null) {
            return;
        }
        LJ.LIZIZ = C30725C4b.LIZ() - LJ.LIZLLL;
        LJ.LJFF = 1;
    }

    public final void LIZIZ(EnumC28999BZr code, String str, int i, int i2) {
        o.LJIIIZ(code, "code");
        C65032gt.LIZ(new ARunnableS12S1200000_13(this, str, code, 2));
        String str2 = this.LIZJ;
        C65032gt.LIZ(new RunnableC78154Ulq(i, 0, i2, Float.valueOf(0.0f), Integer.valueOf(code.getErrorCode()), 0L, 0L, 0L, 0L, str, str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0126, code lost:
    
        if (r1 != null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r13, X.C78072UkW r14, java.lang.Long r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78076Uka.LIZJ(int, X.UkW, java.lang.Long, boolean, boolean):void");
    }
}
