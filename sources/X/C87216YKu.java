package X;

import android.graphics.RectF;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.YKu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87216YKu extends F9E {
    public final RectF LJLIL;
    public final RectF LJLILLLLZI;
    public final RectF LJLJI;
    public final RectF LJLJJI;
    public final RectF LJLJJL;
    public final RectF LJLJJLL;
    public final RectF LJLJL;
    public final boolean LJLJLJ;
    public final boolean LJLJLLL;
    public final boolean LJLL;
    public final boolean LJLLI;
    public final boolean LJLLILLLL;
    public final boolean LJLLJ;
    public final boolean LJLLL;
    public final float LJLLLL;
    public final float LJLLLLLL;
    public final float LJLZ;
    public final float LJZ;
    public final float LJZI;
    public final float LJZL;
    public final float LL;

    public C87216YKu() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, Boolean.valueOf(this.LJLJLJ), Boolean.valueOf(this.LJLJLLL), Boolean.valueOf(this.LJLL), Boolean.valueOf(this.LJLLI), Boolean.valueOf(this.LJLLILLLL), Boolean.valueOf(this.LJLLJ), Boolean.valueOf(this.LJLLL), Float.valueOf(this.LJLLLL), Float.valueOf(this.LJLLLLLL), Float.valueOf(this.LJLZ), Float.valueOf(this.LJZ), Float.valueOf(this.LJZI), Float.valueOf(this.LJZL), Float.valueOf(this.LL)};
    }

    public /* synthetic */ C87216YKu(int i) {
        this(new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), false, false, false, false, false, false, false, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
    }

    public static C87216YKu L(C87216YKu c87216YKu, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, RectF rectF5, RectF rectF6, RectF rectF7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, float f, float f2, float f3, float f4, int i) {
        float f5;
        float f6;
        float f7;
        float f8 = f4;
        float f9 = f3;
        RectF centerHorizontalLine = rectF6;
        RectF centerVerticalLine = rectF5;
        float f10 = f2;
        RectF rightLine = rectF4;
        RectF leftLine = rectF3;
        RectF topLine = rectF;
        RectF bottomLine = rectF2;
        RectF rotationLine = rectF7;
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z3;
        boolean z11 = z4;
        boolean z12 = z5;
        boolean z13 = z6;
        boolean z14 = z7;
        float f11 = f;
        if ((i & 1) != 0) {
            topLine = c87216YKu.LJLIL;
        }
        if ((i & 2) != 0) {
            bottomLine = c87216YKu.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            leftLine = c87216YKu.LJLJI;
        }
        if ((i & 8) != 0) {
            rightLine = c87216YKu.LJLJJI;
        }
        if ((i & 16) != 0) {
            centerVerticalLine = c87216YKu.LJLJJL;
        }
        if ((i & 32) != 0) {
            centerHorizontalLine = c87216YKu.LJLJJLL;
        }
        if ((i & 64) != 0) {
            rotationLine = c87216YKu.LJLJL;
        }
        if ((i & 128) != 0) {
            z8 = c87216YKu.LJLJLJ;
        }
        if ((i & 256) != 0) {
            z9 = c87216YKu.LJLJLLL;
        }
        if ((i & 512) != 0) {
            z10 = c87216YKu.LJLL;
        }
        if ((i & 1024) != 0) {
            z11 = c87216YKu.LJLLI;
        }
        if ((i & 2048) != 0) {
            z12 = c87216YKu.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            z13 = c87216YKu.LJLLJ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z14 = c87216YKu.LJLLL;
        }
        if ((i & 16384) != 0) {
            f11 = c87216YKu.LJLLLL;
        }
        if ((32768 & i) != 0) {
            f10 = c87216YKu.LJLLLLLL;
        }
        if ((65536 & i) != 0) {
            f9 = c87216YKu.LJLZ;
        }
        if ((131072 & i) != 0) {
            f8 = c87216YKu.LJZ;
        }
        if ((262144 & i) != 0) {
            f5 = c87216YKu.LJZI;
        } else {
            f5 = 0.0f;
        }
        if ((524288 & i) != 0) {
            f6 = c87216YKu.LJZL;
        } else {
            f6 = 0.0f;
        }
        if ((i & 1048576) != 0) {
            f7 = c87216YKu.LL;
        } else {
            f7 = 0.0f;
        }
        c87216YKu.getClass();
        o.LJIIIZ(topLine, "topLine");
        o.LJIIIZ(bottomLine, "bottomLine");
        o.LJIIIZ(leftLine, "leftLine");
        o.LJIIIZ(rightLine, "rightLine");
        o.LJIIIZ(centerVerticalLine, "centerVerticalLine");
        o.LJIIIZ(centerHorizontalLine, "centerHorizontalLine");
        o.LJIIIZ(rotationLine, "rotationLine");
        boolean z15 = z8;
        boolean z16 = z9;
        boolean z17 = z10;
        boolean z18 = z11;
        boolean z19 = z12;
        boolean z20 = z13;
        return new C87216YKu(topLine, bottomLine, leftLine, rightLine, centerVerticalLine, centerHorizontalLine, rotationLine, z15, z16, z17, z18, z19, z20, z14, f11, f10, f9, f8, f5, f6, f7);
    }

    public C87216YKu(RectF topLine, RectF bottomLine, RectF leftLine, RectF rightLine, RectF centerVerticalLine, RectF centerHorizontalLine, RectF rotationLine, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        o.LJIIIZ(topLine, "topLine");
        o.LJIIIZ(bottomLine, "bottomLine");
        o.LJIIIZ(leftLine, "leftLine");
        o.LJIIIZ(rightLine, "rightLine");
        o.LJIIIZ(centerVerticalLine, "centerVerticalLine");
        o.LJIIIZ(centerHorizontalLine, "centerHorizontalLine");
        o.LJIIIZ(rotationLine, "rotationLine");
        this.LJLIL = topLine;
        this.LJLILLLLZI = bottomLine;
        this.LJLJI = leftLine;
        this.LJLJJI = rightLine;
        this.LJLJJL = centerVerticalLine;
        this.LJLJJLL = centerHorizontalLine;
        this.LJLJL = rotationLine;
        this.LJLJLJ = z;
        this.LJLJLLL = z2;
        this.LJLL = z3;
        this.LJLLI = z4;
        this.LJLLILLLL = z5;
        this.LJLLJ = z6;
        this.LJLLL = z7;
        this.LJLLLL = f;
        this.LJLLLLLL = f2;
        this.LJLZ = f3;
        this.LJZ = f4;
        this.LJZI = f5;
        this.LJZL = f6;
        this.LL = f7;
    }
}
