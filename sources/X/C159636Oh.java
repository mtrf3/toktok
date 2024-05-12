package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6Oh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159636Oh extends F9E {
    public final EnumC157656Gr LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;
    public final List<Integer> LJLJLJ;
    public final boolean LJLJLLL;
    public final String LJLL;
    public final OSZ<Float, Float> LJLLI;
    public final boolean LJLLILLLL;
    public final boolean LJLLJ;
    public final boolean LJLLL;
    public final boolean LJLLLL;
    public final boolean LJLLLLLL;
    public final boolean LJLZ;

    public C159636Oh() {
        this((EnumC157656Gr) null, 0, false, false, false, false, false, (List) null, false, (String) null, (OSZ) null, false, false, false, false, false, 131071);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL), Boolean.valueOf(this.LJLJL), this.LJLJLJ, Boolean.valueOf(this.LJLJLLL), this.LJLL, this.LJLLI, Boolean.valueOf(this.LJLLILLLL), Boolean.valueOf(this.LJLLJ), Boolean.valueOf(this.LJLLL), Boolean.valueOf(this.LJLLLL), Boolean.valueOf(this.LJLLLLLL), Boolean.valueOf(this.LJLZ)};
    }

    public static C159636Oh L(C159636Oh c159636Oh, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, boolean z6, int i) {
        EnumC157656Gr stickerType;
        int i2;
        boolean z7;
        String noticeMessage;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = z6;
        boolean z14 = z2;
        boolean z15 = z;
        boolean z16 = z3;
        boolean z17 = z4;
        boolean z18 = z5;
        List bubbleList = list;
        OSZ<Float, Float> scaleLimit = null;
        if ((i & 1) != 0) {
            stickerType = c159636Oh.LJLIL;
        } else {
            stickerType = null;
        }
        if ((i & 2) != 0) {
            i2 = c159636Oh.LJLILLLLZI;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            z15 = c159636Oh.LJLJI;
        }
        if ((i & 8) != 0) {
            z14 = c159636Oh.LJLJJI;
        }
        if ((i & 16) != 0) {
            z16 = c159636Oh.LJLJJL;
        }
        if ((i & 32) != 0) {
            z17 = c159636Oh.LJLJJLL;
        }
        if ((i & 64) != 0) {
            z18 = c159636Oh.LJLJL;
        }
        if ((i & 128) != 0) {
            bubbleList = c159636Oh.LJLJLJ;
        }
        if ((i & 256) != 0) {
            z7 = c159636Oh.LJLJLLL;
        } else {
            z7 = false;
        }
        if ((i & 512) != 0) {
            noticeMessage = c159636Oh.LJLL;
        } else {
            noticeMessage = null;
        }
        if ((i & 1024) != 0) {
            scaleLimit = c159636Oh.LJLLI;
        }
        if ((i & 2048) != 0) {
            z13 = c159636Oh.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            z8 = c159636Oh.LJLLJ;
        } else {
            z8 = false;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z9 = c159636Oh.LJLLL;
        } else {
            z9 = false;
        }
        if ((i & 16384) != 0) {
            z10 = c159636Oh.LJLLLL;
        } else {
            z10 = false;
        }
        if ((32768 & i) != 0) {
            z11 = c159636Oh.LJLLLLLL;
        } else {
            z11 = false;
        }
        if ((i & 65536) != 0) {
            z12 = c159636Oh.LJLZ;
        } else {
            z12 = false;
        }
        c159636Oh.getClass();
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(bubbleList, "bubbleList");
        o.LJIIIZ(noticeMessage, "noticeMessage");
        o.LJIIIZ(scaleLimit, "scaleLimit");
        return new C159636Oh(stickerType, i2, z15, z14, z16, z17, z18, (List<Integer>) bubbleList, z7, noticeMessage, scaleLimit, z13, z8, z9, z10, z11, z12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C159636Oh(X.EnumC157656Gr r21, int r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, java.util.List r28, boolean r29, java.lang.String r30, X.OSZ r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, int r37) {
        /*
            r20 = this;
            r19 = r36
            r6 = r24
            r5 = r23
            r7 = r25
            r3 = r21
            r4 = r22
            r9 = r27
            r10 = r28
            r11 = r29
            r8 = r26
            r13 = r31
            r12 = r30
            r14 = r32
            r15 = r33
            r16 = r34
            r18 = r35
            r0 = r37
            r1 = r0 & 1
            if (r1 == 0) goto L28
            X.6Gr r3 = X.EnumC157656Gr.NONE
        L28:
            r1 = r0 & 2
            if (r1 == 0) goto L2d
            r4 = -1
        L2d:
            r1 = r0 & 4
            if (r1 == 0) goto L32
            r5 = 1
        L32:
            r1 = r0 & 8
            if (r1 == 0) goto L37
            r6 = 1
        L37:
            r1 = r0 & 16
            if (r1 == 0) goto L3c
            r7 = 1
        L3c:
            r1 = r0 & 32
            if (r1 == 0) goto L41
            r8 = 1
        L41:
            r1 = r0 & 64
            if (r1 == 0) goto L46
            r9 = 0
        L46:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L4f
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L4f:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L54
            r11 = 0
        L54:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L5a
            java.lang.String r12 = ""
        L5a:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L6d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.OSZ r13 = new X.OSZ
            r13.<init>(r2, r1)
        L6d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L72
            r14 = 1
        L72:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L77
            r15 = 0
        L77:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L7d
            r16 = 0
        L7d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L98
            r17 = 1
        L83:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L8b
            r18 = 0
        L8b:
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L92
            r19 = 0
        L92:
            r2 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L98:
            r17 = 0
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159636Oh.<init>(X.6Gr, int, boolean, boolean, boolean, boolean, boolean, java.util.List, boolean, java.lang.String, X.OSZ, boolean, boolean, boolean, boolean, boolean, int):void");
    }

    public C159636Oh(EnumC157656Gr stickerType, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List<Integer> bubbleList, boolean z6, String noticeMessage, OSZ<Float, Float> scaleLimit, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(bubbleList, "bubbleList");
        o.LJIIIZ(noticeMessage, "noticeMessage");
        o.LJIIIZ(scaleLimit, "scaleLimit");
        this.LJLIL = stickerType;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = z3;
        this.LJLJJLL = z4;
        this.LJLJL = z5;
        this.LJLJLJ = bubbleList;
        this.LJLJLLL = z6;
        this.LJLL = noticeMessage;
        this.LJLLI = scaleLimit;
        this.LJLLILLLL = z7;
        this.LJLLJ = z8;
        this.LJLLL = z9;
        this.LJLLLL = z10;
        this.LJLLLLLL = z11;
        this.LJLZ = z12;
    }
}
