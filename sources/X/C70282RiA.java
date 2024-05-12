package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RiA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70282RiA extends LinearLayoutCompat {
    public static final int LJZL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
    public final int LJLLLLLL;
    public final int LJLZ;
    public final ArrayList<C70387Rjr> LJZ;
    public InterfaceC70280Ri8 LJZI;

    public final void setCheckedChangeListener(InterfaceC70280Ri8 checkChangeListener) {
        o.LJIIIZ(checkChangeListener, "checkChangeListener");
        this.LJZI = checkChangeListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70282RiA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
        this.LJZ = new ArrayList<>();
        setOrientation(1);
        this.LJLLLLLL = (int) KL2.LIZJ(context, 20.0f);
        this.LJLZ = (int) KL2.LIZJ(context, 8.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x019d, code lost:
    
        r11 = new X.C010402i(-1, 1);
        r13 = new android.view.View(getContext());
        ((android.widget.LinearLayout.LayoutParams) r11).topMargin = X.C70282RiA.LJZL;
        addView(r13, r11);
        r11 = getContext();
        kotlin.jvm.internal.o.LJIIIIZZ(r11, "context");
        r0 = X.C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.dz, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c1, code lost:
    
        if (r0 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c3, code lost:
    
        r13.setBackgroundColor(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0195, code lost:
    
        if (r9 != X.C47261Igj.LJJI(r0)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019b, code lost:
    
        if (r26.LJIILJJIL() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ce, code lost:
    
        if (r10 != (-1)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e0, code lost:
    
        if (kotlin.jvm.internal.o.LJ(((java.lang.String[]) r4.element)[r9], "") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e4, code lost:
    
        if (r8.propName == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e6, code lost:
    
        r1.post(new Y.ARunnableS12S0301000_12(r9, r1, r29, r8, 2));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018f A[Catch: Exception -> 0x0202, TryCatch #0 {Exception -> 0x0202, blocks: (B:45:0x008a, B:46:0x009e, B:48:0x00a4, B:50:0x00ac, B:52:0x00c3, B:55:0x00cb, B:56:0x00cf, B:58:0x00d5, B:61:0x00df, B:66:0x00f2, B:68:0x00fc, B:69:0x0108, B:72:0x0125, B:74:0x0135, B:75:0x0138, B:79:0x00e6, B:83:0x013c, B:86:0x0158, B:88:0x018f, B:90:0x0197, B:94:0x01d6, B:96:0x01e2, B:98:0x01e6, B:100:0x01f4, B:104:0x019d, B:106:0x01c3, B:108:0x014b, B:114:0x01fd, B:115:0x0201), top: B:44:0x008a }] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [T] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.String[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.util.List<java.lang.Integer> r30, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo r31, java.lang.String[] r32, X.InterfaceC70386Rjq r33, X.InterfaceC88473Ynt<? super java.lang.Integer, ? super android.view.ViewGroup, ? super java.lang.String, java.lang.Integer> r34) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70282RiA.LJIIIZ(java.util.List, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo, java.lang.String[], X.Rjq, X.Ynt):void");
    }
}
