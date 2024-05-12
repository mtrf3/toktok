package n8;

import X.AbstractC78707Uul;
import X.C78708Uum;
import X.C78709Uun;
import X.C78710Uuo;
import X.C78711Uup;
import X.C78712Uuq;
import X.C78713Uur;
import X.C78714Uus;
import X.C78715Uut;
import X.C78717Uuv;
import X.InterfaceC78716Uuu;
import X.V8L;
import X.V92;
import X.W5G;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class a {
    public Drawable LIZ;
    public Drawable LIZIZ;
    public AbstractC78707Uul LIZJ;
    public AbstractC78707Uul LIZLLL;
    public float LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    public a() {
        C78712Uuq c78712Uuq = InterfaceC78716Uuu.LJJLIIIJ;
        o.LJFF(c78712Uuq, "ScalingUtils.ScaleType.CENTER_INSIDE");
        this.LIZJ = c78712Uuq;
        this.LIZLLL = c78712Uuq;
        this.LJI = true;
        this.LJII = true;
        this.LJIIIIZZ = true;
        this.LJIIIZ = true;
    }

    public static V8L LIZ(W5G w5g) {
        V92 hierarchy = w5g.getHierarchy();
        o.LJFF(hierarchy, "hierarchy");
        V8L v8l = hierarchy.LIZJ;
        if (v8l != null) {
            return v8l;
        }
        V8L v8l2 = new V8L();
        V92 hierarchy2 = w5g.getHierarchy();
        o.LJFF(hierarchy2, "hierarchy");
        hierarchy2.LJIL(v8l2);
        return v8l2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static AbstractC78707Uul LIZIZ(String str) {
        switch (str.hashCode()) {
            case -1928367066:
                if (str.equals("fitBottomStart")) {
                    C78710Uuo c78710Uuo = InterfaceC78716Uuu.LJJLIIIJJIZ;
                    o.LJFF(c78710Uuo, "ScalingUtils.ScaleType.FIT_BOTTOM_START");
                    return c78710Uuo;
                }
                throw new IllegalArgumentException(i0.LJFF("fresco unsupported scale attr ", str));
            case -1364013995:
                if (str.equals("center")) {
                    C78715Uut c78715Uut = InterfaceC78716Uuu.LJJLIIIIJ;
                    o.LJFF(c78715Uut, "ScalingUtils.ScaleType.CENTER");
                    return c78715Uut;
                }
                throw new IllegalArgumentException(i0.LJFF("fresco unsupported scale attr ", str));
            case -1274298614:
                if (str.equals("fitEnd")) {
                    C78708Uum c78708Uum = InterfaceC78716Uuu.LJJLI;
                    o.LJFF(c78708Uum, "ScalingUtils.ScaleType.FIT_END");
                    return c78708Uum;
                }
                throw new IllegalArgumentException(i0.LJFF("fresco unsupported scale attr ", str));
            case -522179887:
                if (str.equals("fitStart")) {
                    C78711Uup c78711Uup = InterfaceC78716Uuu.LJJJZ;
                    o.LJFF(c78711Uup, "ScalingUtils.ScaleType.FIT_START");
                    return c78711Uup;
                }
                throw new IllegalArgumentException(i0.LJFF("fresco unsupported scale attr ", str));
            case -340708175:
                if (str.equals("centerInside")) {
                    C78712Uuq c78712Uuq = InterfaceC78716Uuu.LJJLIIIJ;
                    o.LJFF(c78712Uuq, "ScalingUtils.ScaleType.CENTER_INSIDE");
                    return c78712Uuq;
                }
                throw new IllegalArgumentException(i0.LJFF("fresco unsupported scale attr ", str));
            case 97441490:
                if (str.equals("fitXY")) {
                    C78709Uun c78709Uun = InterfaceC78716Uuu.LJJJLZIJ;
                    o.LJFF(c78709Uun, "ScalingUtils.ScaleType.FIT_XY");
                    return c78709Uun;
                }
                throw new IllegalArgumentException(i0.LJFF("fresco unsupported scale attr ", str));
            case 520762310:
                if (str.equals("fitCenter")) {
                    C78713Uur c78713Uur = InterfaceC78716Uuu.LJJL;
                    o.LJFF(c78713Uur, "ScalingUtils.ScaleType.FIT_CENTER");
                    return c78713Uur;
                }
                throw new IllegalArgumentException(i0.LJFF("fresco unsupported scale attr ", str));
            case 1161480325:
                if (str.equals("centerCrop")) {
                    C78714Uus c78714Uus = InterfaceC78716Uuu.LJJLIIIJILLIZJL;
                    o.LJFF(c78714Uus, "ScalingUtils.ScaleType.CENTER_CROP");
                    return c78714Uus;
                }
                throw new IllegalArgumentException(i0.LJFF("fresco unsupported scale attr ", str));
            case 1628133256:
                if (str.equals("focusCrop")) {
                    C78717Uuv c78717Uuv = InterfaceC78716Uuu.LJJLIIIJJI;
                    o.LJFF(c78717Uuv, "ScalingUtils.ScaleType.FOCUS_CROP");
                    return c78717Uuv;
                }
                throw new IllegalArgumentException(i0.LJFF("fresco unsupported scale attr ", str));
            default:
                throw new IllegalArgumentException(i0.LJFF("fresco unsupported scale attr ", str));
        }
    }

    public final void LIZJ(W5G w5g, ViewGroup.LayoutParams layoutParams) {
        float f;
        float f2;
        float f3;
        Drawable drawable = this.LIZ;
        if (drawable != null) {
            w5g.getHierarchy().LJIJJ(drawable, this.LIZJ);
        }
        if (this.LIZIZ != null) {
            V92 hierarchy = w5g.getHierarchy();
            Drawable drawable2 = this.LIZIZ;
            AbstractC78707Uul abstractC78707Uul = this.LIZLLL;
            hierarchy.LJIILL(drawable2, 5);
            hierarchy.LJIIL(5).LJIIZILJ(abstractC78707Uul);
        }
        if (this.LJFF) {
            float f4 = 0.0f;
            if (this.LJI) {
                f = this.LJ;
            } else {
                f = 0.0f;
            }
            if (this.LJII) {
                f2 = this.LJ;
            } else {
                f2 = 0.0f;
            }
            if (this.LJIIIIZZ) {
                f3 = this.LJ;
            } else {
                f3 = 0.0f;
            }
            if (this.LJIIIZ) {
                f4 = this.LJ;
            }
            LIZ(w5g).LJ(f, f2, f4, f3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0232, code lost:
    
        if (r5.equals("roundBottomLeft") != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r5.equals("roundTopEnd") != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0157, code lost:
    
        r7.LJFF = true;
        r0 = r9.LIZ;
        kotlin.jvm.internal.o.LJFF(r0, "params.value");
        r7.LJII = java.lang.Boolean.parseBoolean(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0164, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (r5.equals("roundBottomEnd") != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d3, code lost:
    
        r7.LJFF = true;
        r0 = r9.LIZ;
        kotlin.jvm.internal.o.LJFF(r0, "params.value");
        r7.LJIIIZ = java.lang.Boolean.parseBoolean(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01e0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
    
        if (r5.equals("roundTopLeft") != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016d, code lost:
    
        r7.LJFF = true;
        r0 = r9.LIZ;
        kotlin.jvm.internal.o.LJFF(r0, "params.value");
        r7.LJI = java.lang.Boolean.parseBoolean(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x017a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0155, code lost:
    
        if (r5.equals("roundTopRight") != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016b, code lost:
    
        if (r5.equals("roundTopStart") != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d1, code lost:
    
        if (r5.equals("roundBottomRight") != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e7, code lost:
    
        if (r5.equals("roundBottomStart") != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0234, code lost:
    
        r7.LJFF = true;
        r0 = r9.LIZ;
        kotlin.jvm.internal.o.LJFF(r0, "params.value");
        r7.LJIIIIZZ = java.lang.Boolean.parseBoolean(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0241, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r8, p8.a r9, X.W5G r10, android.view.ViewGroup.LayoutParams r11) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.a.LIZLLL(java.lang.String, p8.a, X.W5G, android.view.ViewGroup$LayoutParams):void");
    }
}
