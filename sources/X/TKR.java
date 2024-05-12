package X;

import android.app.Activity;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TKR extends F9E {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final int LJLJJL;
    public final float LJLJJLL;
    public final float LJLJL;
    public final float LJLJLJ;
    public final float LJLJLLL;
    public final float LJLL;
    public final float LJLLI;
    public final float LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;
    public final float LJLLLL;
    public final boolean LJLLLLLL;
    public final InterfaceC88472Yns<? super C74462TKg, C76800UCe> LJLZ;
    public final boolean LJZ;
    public final boolean LJZI;
    public final int LJZL;
    public final int LL;
    public final int LLD;
    public final int LLF;
    public final boolean LLFF;
    public final boolean LLFFF;
    public final int LLFII;
    public final int LLFZ;
    public final boolean LLI;
    public final boolean LLIFFJFJJ;
    public final String LLII;
    public final boolean LLIIII;
    public final boolean LLIIIILZ;
    public final boolean LLIIIJ;
    public final boolean LLIIIL;
    public final boolean LLIIIZ;
    public final boolean LLIIJI;
    public final int LLIIJLIL;
    public final InterfaceC65784Pro<Boolean> LLIIL;
    public final InterfaceC65784Pro<C76800UCe> LLIILII;
    public final boolean LLIILZL;
    public final InterfaceC88471Ynr<? super Integer, ? super Activity, ? extends ViewGroup> LLIIZ;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Float.valueOf(this.LJLJI), Float.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Float.valueOf(this.LJLJJLL), Float.valueOf(this.LJLJL), Float.valueOf(this.LJLJLJ), Float.valueOf(this.LJLJLLL), Float.valueOf(this.LJLL), Float.valueOf(this.LJLLI), Float.valueOf(this.LJLLILLLL), Integer.valueOf(this.LJLLJ), Integer.valueOf(this.LJLLL), Float.valueOf(this.LJLLLL), Boolean.valueOf(this.LJLLLLLL), this.LJLZ, Boolean.valueOf(this.LJZ), Boolean.valueOf(this.LJZI), Integer.valueOf(this.LJZL), Integer.valueOf(this.LL), Integer.valueOf(this.LLD), Integer.valueOf(this.LLF), Boolean.valueOf(this.LLFF), Boolean.valueOf(this.LLFFF), Integer.valueOf(this.LLFII), Integer.valueOf(this.LLFZ), Boolean.valueOf(this.LLI), Boolean.valueOf(this.LLIFFJFJJ), this.LLII, Boolean.valueOf(this.LLIIII), Boolean.valueOf(this.LLIIIILZ), Boolean.valueOf(this.LLIIIJ), Boolean.valueOf(this.LLIIIL), Boolean.valueOf(this.LLIIIZ), Boolean.valueOf(this.LLIIJI), Integer.valueOf(this.LLIIJLIL), this.LLIIL, this.LLIILII, Boolean.valueOf(this.LLIILZL), this.LLIIZ};
    }

    public TKR(int i, float f, float f2, float f3, float f4, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, int i2, int i3) {
        float f5;
        int i4;
        float f6;
        float f7;
        float f8;
        float f9;
        int i5;
        int i6;
        boolean z7;
        int i7;
        int i8;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        int i11;
        C34354De2 c34354De2;
        TKY getPreloadNitaView;
        boolean z10 = z6;
        boolean z11 = z5;
        boolean z12 = z4;
        String dynamicStickerIconKey = str;
        float f10 = f2;
        float f11 = f4;
        boolean z13 = z3;
        boolean z14 = z;
        boolean z15 = z2;
        int i12 = (i2 & 2) != 0 ? R.color.tm : i;
        if ((i2 & 4) != 0) {
            f5 = 8.0f;
        } else {
            f5 = 0.0f;
        }
        float f12 = (i2 & 8) == 0 ? f : 8.0f;
        if ((i2 & 16) != 0) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        f10 = (i2 & 32) != 0 ? 54.0f : f10;
        float f13 = (i2 & 64) == 0 ? f3 : 54.0f;
        if ((i2 & 128) != 0) {
            f6 = -2;
        } else {
            f6 = 0.0f;
        }
        if ((i2 & 256) != 0) {
            f7 = -2;
        } else {
            f7 = 0.0f;
        }
        if ((i2 & 512) != 0) {
            f8 = -1;
        } else {
            f8 = 0.0f;
        }
        if ((i2 & 1024) != 0) {
            f9 = -2;
        } else {
            f9 = 0.0f;
        }
        float f14 = (i2 & 2048) != 0 ? 2.0f : 0.0f;
        if ((i2 & 4096) != 0) {
            i5 = R.drawable.c97;
        } else {
            i5 = 0;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            i6 = R.drawable.c98;
        } else {
            i6 = 0;
        }
        f11 = (i2 & 16384) != 0 ? 1.1f : f11;
        if ((32768 & i2) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        z14 = (131072 & i2) != 0 ? false : z14;
        z15 = (262144 & i2) != 0 ? false : z15;
        if ((524288 & i2) != 0) {
            i7 = 12;
        } else {
            i7 = 0;
        }
        if ((1048576 & i2) != 0) {
            i8 = 20;
        } else {
            i8 = 0;
        }
        if ((2097152 & i2) != 0) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        if ((8388608 & i2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        z13 = (16777216 & i2) != 0 ? false : z13;
        if ((67108864 & i2) != 0) {
            i10 = R.color.wl;
        } else {
            i10 = 0;
        }
        if ((134217728 & i2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        dynamicStickerIconKey = (536870912 & i2) != 0 ? "dynamic_icon" : dynamicStickerIconKey;
        z12 = (1073741824 & i2) != 0 ? false : z12;
        z11 = (i2 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? false : z11;
        z10 = (i3 & 2) != 0 ? false : z10;
        if ((i3 & 16) != 0) {
            i11 = 5;
        } else {
            i11 = 0;
        }
        if ((i3 & 32) != 0) {
            c34354De2 = C34354De2.LJLIL;
        } else {
            c34354De2 = null;
        }
        if ((i3 & 256) != 0) {
            getPreloadNitaView = TKY.LJLIL;
        } else {
            getPreloadNitaView = null;
        }
        o.LJIIIZ(dynamicStickerIconKey, "dynamicStickerIconKey");
        C34354De2 needSetParentBackGround = c34354De2;
        o.LJIIIZ(needSetParentBackGround, "needSetParentBackGround");
        o.LJIIIZ(getPreloadNitaView, "getPreloadNitaView");
        this.LJLIL = false;
        this.LJLILLLLZI = i12;
        this.LJLJI = f5;
        this.LJLJJI = f12;
        this.LJLJJL = i4;
        this.LJLJJLL = f10;
        this.LJLJL = f13;
        this.LJLJLJ = f6;
        this.LJLJLLL = f7;
        this.LJLL = f8;
        this.LJLLI = f9;
        this.LJLLILLLL = f14;
        this.LJLLJ = i5;
        this.LJLLL = i6;
        this.LJLLLL = f11;
        this.LJLLLLLL = z7;
        this.LJLZ = null;
        this.LJZ = z14;
        this.LJZI = z15;
        this.LJZL = i7;
        this.LL = i8;
        this.LLD = i9;
        this.LLF = 0;
        this.LLFF = z8;
        this.LLFFF = z13;
        this.LLFII = 0;
        this.LLFZ = i10;
        this.LLI = z9;
        this.LLIFFJFJJ = false;
        this.LLII = dynamicStickerIconKey;
        this.LLIIII = z12;
        this.LLIIIILZ = z11;
        this.LLIIIJ = false;
        this.LLIIIL = z10;
        this.LLIIIZ = false;
        this.LLIIJI = false;
        this.LLIIJLIL = i11;
        this.LLIIL = c34354De2;
        this.LLIILII = null;
        this.LLIILZL = false;
        this.LLIIZ = getPreloadNitaView;
    }
}
