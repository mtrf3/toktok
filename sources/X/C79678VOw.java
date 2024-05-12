package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.VOw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79678VOw {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C79678VOw LIZJ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C79678VOw.class), "getOriginLeft", "getGetOriginLeft()Lcom/bytedance/android/monitorV2/util/Reflector$RefMethod;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt};
        LIZJ = new C79678VOw();
        LIZIZ = C221108m2.LIZIZ(C79591VLn.LJLIL);
    }

    public static int LIZ(Drawable drawable) {
        boolean z;
        if (drawable == null) {
            return 0;
        }
        C79243V8d c79243V8d = new C79243V8d();
        C79679VOx c79679VOx = new C79679VOx(drawable);
        synchronized (c79243V8d) {
            c79679VOx.LIZ(c79243V8d);
            z = c79243V8d.LIZ;
            c79243V8d.LIZ = false;
        }
        return (!z ? 1 : 0) ^ 1;
    }

    public static Rect LIZLLL(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public static void LIZJ(View view, Rect rect, java.util.Set set, C79648VNs c79648VNs) {
        if (view.getVisibility() != 0 || set.contains(view)) {
            return;
        }
        set.add(view);
        if (view instanceof VNS) {
            Rect LIZLLL = LIZLLL(view);
            if (Rect.intersects(rect, LIZLLL) || rect.contains(LIZLLL)) {
                c79648VNs.invoke(view, LIZLLL);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                o.LJFF(childAt, "view.getChildAt(i)");
                LIZJ(childAt, rect, set, c79648VNs);
            }
        }
        Object parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        LIZJ((View) parent, rect, set, c79648VNs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0121, code lost:
    
        if (r3.length() > 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0123, code lost:
    
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0140, code lost:
    
        if (r3.length() > 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c0, code lost:
    
        if (r3 > 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0239, code lost:
    
        if (r3.length() > 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x023b, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x025e, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x025b, code lost:
    
        if (r3 != false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.VJI r17, com.lynx.tasm.behavior.ui.LynxBaseUI r18, int r19, int r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79678VOw.LIZIZ(X.VJI, com.lynx.tasm.behavior.ui.LynxBaseUI, int, int, int, int, int, int):void");
    }
}
