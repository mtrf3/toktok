package X;

import android.view.View;
import java.util.HashMap;

/* renamed from: X.1rU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46121rU extends QXX {
    public static final String[] LJLILLLLZI = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};
    public int LJLIL;

    public C46121rU() {
        super((Object) null);
        this.LJLIL = 80;
    }

    @Override // X.QXX
    public final /* bridge */ /* synthetic */ void LLILZLL() {
    }

    @Override // X.QXX
    public final void LJLJJI(C03860De c03860De) {
        View view = c03860De.LIZIZ;
        Object obj = ((HashMap) c03860De.LIZ).get("android:visibility:visibility");
        if (obj == null) {
            obj = Integer.valueOf(view.getVisibility());
        }
        ((HashMap) c03860De.LIZ).put("android:visibilityPropagation:visibility", obj);
        view.getLocationOnScreen(r4);
        int round = Math.round(view.getTranslationX()) + r4[0];
        int[] iArr = {round};
        iArr[0] = (view.getWidth() / 2) + round;
        int round2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = round2;
        iArr[1] = (view.getHeight() / 2) + round2;
        ((HashMap) c03860De.LIZ).put("android:visibilityPropagation:center", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (X.C16310kV.LIZLLL(r14) == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a1, code lost:
    
        if (X.C16310kV.LIZLLL(r14) == 1) goto L44;
     */
    @Override // X.QXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LLJIJIL(android.view.ViewGroup r14, X.AbstractC03490Bt r15, X.C03860De r16, X.C03860De r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46121rU.LLJIJIL(android.view.ViewGroup, X.0Bt, X.0De, X.0De):long");
    }
}
