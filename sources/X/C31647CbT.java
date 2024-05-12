package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.CbT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31647CbT extends F9E {
    public static final C31645CbR LLFFF = new C31645CbR();
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;
    public int LJLJLJ;
    public final int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public final int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public boolean LLD;
    public int LLF;
    public int LLFF;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL), Boolean.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), Integer.valueOf(this.LJLJLLL), Integer.valueOf(this.LJLL), Integer.valueOf(this.LJLLI), Integer.valueOf(this.LJLLILLLL), Integer.valueOf(this.LJLLJ), Integer.valueOf(this.LJLLL), Integer.valueOf(this.LJLLLL), Integer.valueOf(this.LJLLLLLL), Integer.valueOf(this.LJLZ), Boolean.valueOf(this.LJZ), Integer.valueOf(this.LJZI), Integer.valueOf(this.LJZL), Integer.valueOf(this.LL), Boolean.valueOf(this.LLD), Integer.valueOf(this.LLF), Integer.valueOf(this.LLFF)};
    }

    public /* synthetic */ C31647CbT(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? false : z, (i12 & 2) != 0 ? false : z2, (i12 & 4) != 0 ? false : z3, (i12 & 8) != 0 ? false : z4, (i12 & 16) != 0 ? false : z5, (i12 & 32) != 0 ? false : z6, (i12 & 64) != 0 ? false : z7, (i12 & 128) != 0 ? -1 : i, (i12 & 256) != 0 ? -1 : i2, (i12 & 512) != 0 ? -1 : i3, (i12 & 1024) != 0 ? -1 : i4, (i12 & 2048) != 0 ? -1 : i5, (i12 & 4096) != 0 ? -1 : i6, (i12 & FileUtils.BUFFER_SIZE) != 0 ? -1 : i7, (i12 & 16384) != 0 ? -1 : i8, 0, (65536 & i12) != 0 ? -1 : i9, false, 0, 0, (1048576 & i12) != 0 ? -1 : i10, false, (i12 & 4194304) != 0 ? 0 : i11, 0);
    }

    public C31647CbT(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z8, int i11, int i12, int i13, boolean z9, int i14, int i15) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
        this.LJLJJI = z4;
        this.LJLJJL = z5;
        this.LJLJJLL = z6;
        this.LJLJL = z7;
        this.LJLJLJ = i;
        this.LJLJLLL = i2;
        this.LJLL = i3;
        this.LJLLI = i4;
        this.LJLLILLLL = i5;
        this.LJLLJ = i6;
        this.LJLLL = i7;
        this.LJLLLL = i8;
        this.LJLLLLLL = i9;
        this.LJLZ = i10;
        this.LJZ = z8;
        this.LJZI = i11;
        this.LJZL = i12;
        this.LL = i13;
        this.LLD = z9;
        this.LLF = i14;
        this.LLFF = i15;
    }
}
