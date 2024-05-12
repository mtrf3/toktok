package X;

import android.text.Layout;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class VRT {
    public static void LIZ(VRS vrs, LynxBaseUI lynxBaseUI) {
        java.util.Set set = vrs.LIZLLL;
        for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
            if (lynxBaseUI2 instanceof LynxUI) {
                LynxUI lynxUI = (LynxUI) lynxBaseUI2;
                if (set != null && set.contains(Integer.valueOf(lynxUI.getSign()))) {
                    if (lynxUI.getVisibility()) {
                        lynxUI.setVisibilityForView(4);
                    }
                } else if (!lynxUI.getVisibility()) {
                    lynxUI.setVisibilityForView(0);
                }
            }
        }
    }

    public static C49615Jdb LIZIZ(int i, Layout layout) {
        C49615Jdb c49615Jdb = new C49615Jdb(i, "layout");
        c49615Jdb.LIZJ(Integer.valueOf(layout.getLineCount()), "lineCount");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
            HashMap hashMap = new HashMap();
            hashMap.put("start", Integer.valueOf(layout.getLineStart(i2)));
            hashMap.put("end", Integer.valueOf(layout.getLineEnd(i2)));
            hashMap.put("ellipsisCount", Integer.valueOf(layout.getEllipsisCount(i2)));
            arrayList.add(hashMap);
        }
        c49615Jdb.LIZJ(arrayList, "lines");
        return c49615Jdb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0064, code lost:
    
        if (r5 == 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0062, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0066, code lost:
    
        r1 = r16.getWidth() - r16.getLineMax(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0060, code lost:
    
        if (r5 == 1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.VPY LIZJ(com.lynx.tasm.behavior.ui.LynxBaseUI r12, float r13, float r14, X.VPY r15, android.text.Layout r16, android.text.Spanned r17) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VRT.LIZJ(com.lynx.tasm.behavior.ui.LynxBaseUI, float, float, X.VPY, android.text.Layout, android.text.Spanned):X.VPY");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.VPY LIZLLL(com.lynx.tasm.behavior.ui.LynxBaseUI r12, float r13, float r14, X.VPY r15, android.text.Layout r16, android.text.Spanned r17, float r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VRT.LIZLLL(com.lynx.tasm.behavior.ui.LynxBaseUI, float, float, X.VPY, android.text.Layout, android.text.Spanned, float, boolean):X.VPY");
    }
}
