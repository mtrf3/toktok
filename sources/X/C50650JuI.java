package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.JuI */
/* loaded from: classes9.dex */
public final class C50650JuI extends F9E implements Serializable {
    public final C50433Jqn LJLIL;
    public final C50486Jre LJLILLLLZI;
    public final C50469JrN LJLJI;
    public final C50373Jpp LJLJJI;
    public final C49636Jdw LJLJJL;
    public final K5P LJLJJLL;
    public final C51110K4c LJLJL;

    public C50650JuI() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ C50650JuI copy$default(C50650JuI c50650JuI, C50433Jqn c50433Jqn, C50486Jre c50486Jre, C50469JrN c50469JrN, C50373Jpp c50373Jpp, C49636Jdw c49636Jdw, K5P k5p, C51110K4c c51110K4c, int i, Object obj) {
        if ((i & 1) != 0) {
            c50433Jqn = c50650JuI.LJLIL;
        }
        if ((i & 2) != 0) {
            c50486Jre = c50650JuI.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c50469JrN = c50650JuI.LJLJI;
        }
        if ((i & 8) != 0) {
            c50373Jpp = c50650JuI.LJLJJI;
        }
        if ((i & 16) != 0) {
            c49636Jdw = c50650JuI.LJLJJL;
        }
        if ((i & 32) != 0) {
            k5p = c50650JuI.LJLJJLL;
        }
        if ((i & 64) != 0) {
            c51110K4c = c50650JuI.LJLJL;
        }
        return c50650JuI.copy(c50433Jqn, c50486Jre, c50469JrN, c50373Jpp, c49636Jdw, k5p, c51110K4c);
    }

    public final C50650JuI copy(C50433Jqn searchCommonModel, C50486Jre searchInputModel, C50469JrN searchVideoModel, C50373Jpp searchEventModel, C49636Jdw searchSessionModel, K5P searchEcommerceModel, C51110K4c singleSearchEcommerceModel) {
        o.LJIIIZ(searchCommonModel, "searchCommonModel");
        o.LJIIIZ(searchInputModel, "searchInputModel");
        o.LJIIIZ(searchVideoModel, "searchVideoModel");
        o.LJIIIZ(searchEventModel, "searchEventModel");
        o.LJIIIZ(searchSessionModel, "searchSessionModel");
        o.LJIIIZ(searchEcommerceModel, "searchEcommerceModel");
        o.LJIIIZ(singleSearchEcommerceModel, "singleSearchEcommerceModel");
        return new C50650JuI(searchCommonModel, searchInputModel, searchVideoModel, searchEventModel, searchSessionModel, searchEcommerceModel, singleSearchEcommerceModel);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL};
    }

    public final C50433Jqn getSearchCommonModel() {
        return this.LJLIL;
    }

    public final K5P getSearchEcommerceModel() {
        return this.LJLJJLL;
    }

    public final C50373Jpp getSearchEventModel() {
        return this.LJLJJI;
    }

    public final C50486Jre getSearchInputModel() {
        return this.LJLILLLLZI;
    }

    public final C49636Jdw getSearchSessionModel() {
        return this.LJLJJL;
    }

    public final C50469JrN getSearchVideoModel() {
        return this.LJLJI;
    }

    public final C51110K4c getSingleSearchEcommerceModel() {
        return this.LJLJL;
    }

    public C50650JuI(C50433Jqn searchCommonModel, C50486Jre searchInputModel, C50469JrN searchVideoModel, C50373Jpp searchEventModel, C49636Jdw searchSessionModel, K5P searchEcommerceModel, C51110K4c singleSearchEcommerceModel) {
        o.LJIIIZ(searchCommonModel, "searchCommonModel");
        o.LJIIIZ(searchInputModel, "searchInputModel");
        o.LJIIIZ(searchVideoModel, "searchVideoModel");
        o.LJIIIZ(searchEventModel, "searchEventModel");
        o.LJIIIZ(searchSessionModel, "searchSessionModel");
        o.LJIIIZ(searchEcommerceModel, "searchEcommerceModel");
        o.LJIIIZ(singleSearchEcommerceModel, "singleSearchEcommerceModel");
        this.LJLIL = searchCommonModel;
        this.LJLILLLLZI = searchInputModel;
        this.LJLJI = searchVideoModel;
        this.LJLJJI = searchEventModel;
        this.LJLJJL = searchSessionModel;
        this.LJLJJLL = searchEcommerceModel;
        this.LJLJL = singleSearchEcommerceModel;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C50650JuI(X.C50433Jqn r60, X.C50486Jre r61, X.C50469JrN r62, X.C50373Jpp r63, X.C49636Jdw r64, X.K5P r65, X.C51110K4c r66, int r67, kotlin.jvm.internal.DefaultConstructorMarker r68) {
        /*
            r59 = this;
            r41 = r66
            r50 = r61
            r20 = r60
            r32 = r62
            r52 = r63
            r0 = r64
            r3 = r65
            r1 = r67 & 1
            if (r1 == 0) goto L2d
            X.Jqn r20 = new X.Jqn
            r21 = 0
            r23 = 0
            r30 = 511(0x1ff, float:7.16E-43)
            r22 = r21
            r24 = r23
            r25 = r21
            r26 = r21
            r27 = r23
            r28 = r23
            r29 = r23
            r31 = r21
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L2d:
            r1 = r67 & 2
            if (r1 == 0) goto L3d
            X.Jre r50 = new X.Jre
            r5 = 0
            r8 = 7
            r4 = r50
            r6 = r5
            r7 = r5
            r9 = r5
            r4.<init>(r5, r6, r7, r8, r9)
        L3d:
            r1 = r67 & 4
            if (r1 == 0) goto L56
            X.JrN r32 = new X.JrN
            r33 = 0
            r39 = 63
            r34 = r33
            r35 = r33
            r36 = r33
            r37 = r33
            r38 = r33
            r40 = r33
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40)
        L56:
            r1 = r67 & 8
            if (r1 == 0) goto L6b
            X.Jpp r52 = new X.Jpp
            r53 = 0
            r57 = 15
            r54 = r53
            r55 = r53
            r56 = r53
            r58 = r53
            r52.<init>(r53, r54, r55, r56, r57, r58)
        L6b:
            r1 = r67 & 16
            if (r1 == 0) goto L76
            X.Jdw r0 = new X.Jdw
            r2 = 0
            r1 = 1
            r0.<init>(r2, r1, r2)
        L76:
            r1 = r67 & 32
            if (r1 == 0) goto L93
            X.K5P r3 = new X.K5P
            r4 = 0
            r5 = 0
            r18 = 16383(0x3fff, float:2.2957E-41)
            r6 = r4
            r7 = r5
            r8 = r5
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r15 = r4
            r16 = r4
            r17 = r4
            r19 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L93:
            r1 = r67 & 64
            if (r1 == 0) goto Lac
            X.K4c r41 = new X.K4c
            r42 = 0
            r48 = 63
            r43 = r42
            r44 = r42
            r45 = r42
            r46 = r42
            r47 = r42
            r49 = r42
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49)
        Lac:
            r48 = r59
            r49 = r20
            r51 = r32
            r53 = r0
            r54 = r3
            r55 = r41
            r48.<init>(r49, r50, r51, r52, r53, r54, r55)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50650JuI.<init>(X.Jqn, X.Jre, X.JrN, X.Jpp, X.Jdw, X.K5P, X.K4c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
