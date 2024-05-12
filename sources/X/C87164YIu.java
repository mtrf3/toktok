package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: X.YIu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87164YIu<T> implements YIU<T> {
    public static final int[] LJIILIIL = new int[0];
    public static final Unsafe LJIILJJIL = C87166YIw.LJ();
    public final int[] LIZ;
    public final Object[] LIZIZ;
    public final YIZ LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int[] LJFF;
    public final int LJI;
    public final int LJII;
    public final VKO LJIIIIZZ;
    public final AbstractC84699XLz LJIIIZ;
    public final YJA<?, ?> LJIIJ;
    public final YJ7<?> LJIIJJI;
    public final InterfaceC87176YJg LJIIL;

    /* JADX WARN: Failed to find 'out' block for switch in B:282:0x0550. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002f. Please report as an issue. */
    @Override // X.YIU
    public final int LJ(T t) {
        int i;
        int LJIJJ;
        int LJIJJ2;
        int LJIJJ3;
        int LJIILLIIL;
        int LJIJJ4;
        int LJIJJLI;
        int LJJIIJ;
        int LJIJJ5;
        int size;
        int LJFF;
        int LJIJJ6;
        int LJIIL;
        int LJIJJ7;
        int LJIL;
        int LJIJJ8;
        int LJIJJ9;
        int LJIJJ10;
        int LJIILLIIL2;
        int LJIJJ11;
        int LJIJJLI2;
        int LJJIIJ2;
        int LJIJJ12;
        int size2;
        int LJFF2;
        int LJIJJ13;
        int LJIIL2;
        int LJIJJ14;
        int LJIL2;
        int i2 = 267386880;
        int i3 = 1;
        int i4 = 1048575;
        if (this.LJ) {
            Unsafe unsafe = LJIILJJIL;
            int i5 = 0;
            for (int i6 = 0; i6 < this.LIZ.length; i6 += 3) {
                int LJIJJLI3 = LJIJJLI(i6);
                int i7 = (LJIJJLI3 & 267386880) >>> 20;
                int i8 = this.LIZ[i6];
                long j = LJIJJLI3 & 1048575;
                if (i7 >= YPN.zzfxr.id()) {
                    YPN.zzfye.id();
                }
                switch (i7) {
                    case 0:
                        if (LJIIZILJ(i6, t)) {
                            LJIJJ8 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = LJIJJ8 + 8;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (LJIIZILJ(i6, t)) {
                            LJIJJ9 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = LJIJJ9 + 4;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (LJIIZILJ(i6, t)) {
                            long LJIIL3 = C87166YIw.LJIIL(j, t);
                            LJIJJ10 = AbstractC87156YIm.LJIJJ(i8);
                            LJIILLIIL2 = AbstractC87156YIm.LJIILLIIL(LJIIL3);
                            LJJIIJ2 = LJIILLIIL2 + LJIJJ10;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (LJIIZILJ(i6, t)) {
                            long LJIIL4 = C87166YIw.LJIIL(j, t);
                            LJIJJ10 = AbstractC87156YIm.LJIJJ(i8);
                            LJIILLIIL2 = AbstractC87156YIm.LJIILLIIL(LJIIL4);
                            LJJIIJ2 = LJIILLIIL2 + LJIJJ10;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (LJIIZILJ(i6, t)) {
                            int LJIIJ = C87166YIw.LJIIJ(j, t);
                            LJIJJ11 = AbstractC87156YIm.LJIJJ(i8);
                            LJIJJLI2 = AbstractC87156YIm.LJIJJLI(LJIIJ);
                            LJJIIJ2 = LJIJJLI2 + LJIJJ11;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (LJIIZILJ(i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJJIIJ(i8);
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (LJIIZILJ(i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJI(i8);
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (LJIIZILJ(i6, t)) {
                            LJIJJ12 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = LJIJJ12 + 1;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!LJIIZILJ(i6, t)) {
                            break;
                        } else {
                            Object LJIIZILJ = C87166YIw.LJIIZILJ(j, t);
                            if (LJIIZILJ instanceof AbstractC87141YHx) {
                                LJJIIJ2 = AbstractC87156YIm.LJIIJ(i8, (AbstractC87141YHx) LJIIZILJ);
                                i5 += LJJIIJ2;
                                break;
                            } else {
                                LJIJJ11 = AbstractC87156YIm.LJIJJ(i8);
                                LJIJJLI2 = AbstractC87156YIm.LJJ((String) LJIIZILJ);
                                LJJIIJ2 = LJIJJLI2 + LJIJJ11;
                                i5 += LJJIIJ2;
                            }
                        }
                    case 9:
                        if (LJIIZILJ(i6, t)) {
                            LJJIIJ2 = C87163YIt.LJIIZILJ(i8, LJIJJ(i6), C87166YIw.LJIIZILJ(j, t));
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (LJIIZILJ(i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJIIJ(i8, (AbstractC87141YHx) C87166YIw.LJIIZILJ(j, t));
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        if (LJIIZILJ(i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJ(i8, C87166YIw.LJIIJ(j, t));
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (LJIIZILJ(i6, t)) {
                            int LJIIJ2 = C87166YIw.LJIIJ(j, t);
                            LJIJJ11 = AbstractC87156YIm.LJIJJ(i8);
                            LJIJJLI2 = AbstractC87156YIm.LJIJJLI(LJIIJ2);
                            LJJIIJ2 = LJIJJLI2 + LJIJJ11;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        if (LJIIZILJ(i6, t)) {
                            LJIJJ9 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = LJIJJ9 + 4;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (LJIIZILJ(i6, t)) {
                            LJIJJ8 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = LJIJJ8 + 8;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (LJIIZILJ(i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJFF(i8, C87166YIw.LJIIJ(j, t));
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        if (LJIIZILJ(i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJJIII(i8, C87166YIw.LJIIL(j, t));
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (LJIIZILJ(i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJIIJJI(i8, (YIZ) C87166YIw.LJIIZILJ(j, t), LJIJJ(i6));
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        LJJIIJ2 = C87163YIt.LJJIJIL(i8, LJIJ(j, t));
                        i5 += LJJIIJ2;
                        break;
                    case 19:
                        LJJIIJ2 = C87163YIt.LJJIJIIJIL(i8, LJIJ(j, t));
                        i5 += LJJIIJ2;
                        break;
                    case 20:
                        List LJIJ = LJIJ(j, t);
                        if (LJIJ.size() != 0) {
                            LJJIIJ2 = (AbstractC87156YIm.LJIJJ(i8) * LJIJ.size()) + C87163YIt.LJ(LJIJ);
                            i5 += LJJIIJ2;
                            break;
                        }
                        LJJIIJ2 = 0;
                        i5 += LJJIIJ2;
                    case 21:
                        List LJIJ2 = LJIJ(j, t);
                        size2 = LJIJ2.size();
                        if (size2 != 0) {
                            LJFF2 = C87163YIt.LJFF(LJIJ2);
                            LJIJJ13 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = (LJIJJ13 * size2) + LJFF2;
                            i5 += LJJIIJ2;
                            break;
                        }
                        LJJIIJ2 = 0;
                        i5 += LJJIIJ2;
                    case 22:
                        List LJIJ3 = LJIJ(j, t);
                        size2 = LJIJ3.size();
                        if (size2 != 0) {
                            LJFF2 = C87163YIt.LJIIIIZZ(LJIJ3);
                            LJIJJ13 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = (LJIJJ13 * size2) + LJFF2;
                            i5 += LJJIIJ2;
                            break;
                        }
                        LJJIIJ2 = 0;
                        i5 += LJJIIJ2;
                    case 23:
                        LJJIIJ2 = C87163YIt.LJJIJIL(i8, LJIJ(j, t));
                        i5 += LJJIIJ2;
                        break;
                    case 24:
                        LJJIIJ2 = C87163YIt.LJJIJIIJIL(i8, LJIJ(j, t));
                        i5 += LJJIIJ2;
                        break;
                    case 25:
                        int size3 = LJIJ(j, t).size();
                        if (size3 != 0) {
                            LJJIIJ2 = size3 * (AbstractC87156YIm.LJIJJ(i8) + 1);
                            i5 += LJJIIJ2;
                            break;
                        }
                        LJJIIJ2 = 0;
                        i5 += LJJIIJ2;
                    case 26:
                        LJJIIJ2 = C87163YIt.LJIJ(i8, LJIJ(j, t));
                        i5 += LJJIIJ2;
                        break;
                    case 27:
                        LJJIIJ2 = C87163YIt.LJIJI(i8, LJIJ(j, t), LJIJJ(i6));
                        i5 += LJJIIJ2;
                        break;
                    case 28:
                        LJJIIJ2 = C87163YIt.LJIJJLI(i8, LJIJ(j, t));
                        i5 += LJJIIJ2;
                        break;
                    case 29:
                        List LJIJ4 = LJIJ(j, t);
                        size2 = LJIJ4.size();
                        if (size2 != 0) {
                            LJFF2 = C87163YIt.LJIIIZ(LJIJ4);
                            LJIJJ13 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = (LJIJJ13 * size2) + LJFF2;
                            i5 += LJJIIJ2;
                            break;
                        }
                        LJJIIJ2 = 0;
                        i5 += LJJIIJ2;
                    case 30:
                        List LJIJ5 = LJIJ(j, t);
                        size2 = LJIJ5.size();
                        if (size2 != 0) {
                            LJFF2 = C87163YIt.LJII(LJIJ5);
                            LJIJJ13 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = (LJIJJ13 * size2) + LJFF2;
                            i5 += LJJIIJ2;
                            break;
                        }
                        LJJIIJ2 = 0;
                        i5 += LJJIIJ2;
                    case 31:
                        LJJIIJ2 = C87163YIt.LJJIJIIJIL(i8, LJIJ(j, t));
                        i5 += LJJIIJ2;
                        break;
                    case 32:
                        LJJIIJ2 = C87163YIt.LJJIJIL(i8, LJIJ(j, t));
                        i5 += LJJIIJ2;
                        break;
                    case 33:
                        List LJIJ6 = LJIJ(j, t);
                        size2 = LJIJ6.size();
                        if (size2 != 0) {
                            LJFF2 = C87163YIt.LJIIJ(LJIJ6);
                            LJIJJ13 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = (LJIJJ13 * size2) + LJFF2;
                            i5 += LJJIIJ2;
                            break;
                        }
                        LJJIIJ2 = 0;
                        i5 += LJJIIJ2;
                    case 34:
                        List LJIJ7 = LJIJ(j, t);
                        size2 = LJIJ7.size();
                        if (size2 != 0) {
                            LJFF2 = C87163YIt.LJI(LJIJ7);
                            LJIJJ13 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = (LJIJJ13 * size2) + LJFF2;
                            i5 += LJJIIJ2;
                            break;
                        }
                        LJJIIJ2 = 0;
                        i5 += LJJIIJ2;
                    case 35:
                        LJIIL2 = C87163YIt.LJIIL((List) unsafe.getObject(t, j));
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        LJIIL2 = C87163YIt.LJIIJJI((List) unsafe.getObject(t, j));
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        LJIIL2 = C87163YIt.LJ((List) unsafe.getObject(t, j));
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        LJIIL2 = C87163YIt.LJFF((List) unsafe.getObject(t, j));
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        LJIIL2 = C87163YIt.LJIIIIZZ((List) unsafe.getObject(t, j));
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                        LJIIL2 = C87163YIt.LJIIL((List) unsafe.getObject(t, j));
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        LJIIL2 = C87163YIt.LJIIJJI((List) unsafe.getObject(t, j));
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        LJIIL2 = ((List) unsafe.getObject(t, j)).size();
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                        LJIIL2 = C87163YIt.LJIIIZ((List) unsafe.getObject(t, j));
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        LJIIL2 = C87163YIt.LJII((List) unsafe.getObject(t, j));
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        LJIIL2 = C87163YIt.LJIIJJI((List) unsafe.getObject(t, j));
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        LJIIL2 = C87163YIt.LJIIL((List) unsafe.getObject(t, j));
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        LJIIL2 = C87163YIt.LJIIJ((List) unsafe.getObject(t, j));
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                        LJIIL2 = C87163YIt.LJI((List) unsafe.getObject(t, j));
                        if (LJIIL2 > 0) {
                            LJIJJ14 = AbstractC87156YIm.LJIJJ(i8);
                            LJIL2 = AbstractC87156YIm.LJIL(LJIIL2);
                            i5 = AnonymousClass036.LIZIZ(LJIL2, LJIJJ14, LJIIL2, i5);
                            break;
                        } else {
                            break;
                        }
                    case C61447O9r.LJIIJ:
                        List LJIJ8 = LJIJ(j, t);
                        YIU LJIJJ15 = LJIJJ(i6);
                        int size4 = LJIJ8.size();
                        if (size4 != 0) {
                            LJJIIJ2 = 0;
                            for (int i9 = 0; i9 < size4; i9++) {
                                LJJIIJ2 += AbstractC87156YIm.LJIIJJI(i8, (YIZ) ListProtector.get(LJIJ8, i9), LJIJJ15);
                            }
                            i5 += LJJIIJ2;
                            break;
                        }
                        LJJIIJ2 = 0;
                        i5 += LJJIIJ2;
                    case 50:
                        this.LJIIL.LIZ(C87166YIw.LJIIZILJ(j, t));
                        LJJIIJ2 = 0;
                        i5 += LJJIIJ2;
                        break;
                    case 51:
                        if (LJIIL(i8, i6, t)) {
                            LJIJJ8 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = LJIJJ8 + 8;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (LJIIL(i8, i6, t)) {
                            LJIJJ9 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = LJIJJ9 + 4;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (LJIIL(i8, i6, t)) {
                            long LJJ = LJJ(j, t);
                            LJIJJ10 = AbstractC87156YIm.LJIJJ(i8);
                            LJIILLIIL2 = AbstractC87156YIm.LJIILLIIL(LJJ);
                            LJJIIJ2 = LJIILLIIL2 + LJIJJ10;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (LJIIL(i8, i6, t)) {
                            long LJJ2 = LJJ(j, t);
                            LJIJJ10 = AbstractC87156YIm.LJIJJ(i8);
                            LJIILLIIL2 = AbstractC87156YIm.LJIILLIIL(LJJ2);
                            LJJIIJ2 = LJIILLIIL2 + LJIJJ10;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (LJIIL(i8, i6, t)) {
                            int LJIL3 = LJIL(j, t);
                            LJIJJ11 = AbstractC87156YIm.LJIJJ(i8);
                            LJIJJLI2 = AbstractC87156YIm.LJIJJLI(LJIL3);
                            LJJIIJ2 = LJIJJLI2 + LJIJJ11;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (LJIIL(i8, i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJJIIJ(i8);
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (LJIIL(i8, i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJI(i8);
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (LJIIL(i8, i6, t)) {
                            LJIJJ12 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = LJIJJ12 + 1;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!LJIIL(i8, i6, t)) {
                            break;
                        } else {
                            Object LJIIZILJ2 = C87166YIw.LJIIZILJ(j, t);
                            if (LJIIZILJ2 instanceof AbstractC87141YHx) {
                                LJJIIJ2 = AbstractC87156YIm.LJIIJ(i8, (AbstractC87141YHx) LJIIZILJ2);
                                i5 += LJJIIJ2;
                                break;
                            } else {
                                LJIJJ11 = AbstractC87156YIm.LJIJJ(i8);
                                LJIJJLI2 = AbstractC87156YIm.LJJ((String) LJIIZILJ2);
                                LJJIIJ2 = LJIJJLI2 + LJIJJ11;
                                i5 += LJJIIJ2;
                            }
                        }
                    case 60:
                        if (LJIIL(i8, i6, t)) {
                            LJJIIJ2 = C87163YIt.LJIIZILJ(i8, LJIJJ(i6), C87166YIw.LJIIZILJ(j, t));
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (LJIIL(i8, i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJIIJ(i8, (AbstractC87141YHx) C87166YIw.LJIIZILJ(j, t));
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case BaseNotice.CREATOR /* 62 */:
                        if (LJIIL(i8, i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJ(i8, LJIL(j, t));
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (LJIIL(i8, i6, t)) {
                            int LJIL4 = LJIL(j, t);
                            LJIJJ11 = AbstractC87156YIm.LJIJJ(i8);
                            LJIJJLI2 = AbstractC87156YIm.LJIJJLI(LJIL4);
                            LJJIIJ2 = LJIJJLI2 + LJIJJ11;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (LJIIL(i8, i6, t)) {
                            LJIJJ9 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = LJIJJ9 + 4;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (LJIIL(i8, i6, t)) {
                            LJIJJ8 = AbstractC87156YIm.LJIJJ(i8);
                            LJJIIJ2 = LJIJJ8 + 8;
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (LJIIL(i8, i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJFF(i8, LJIL(j, t));
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (LJIIL(i8, i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJJIII(i8, LJJ(j, t));
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (LJIIL(i8, i6, t)) {
                            LJJIIJ2 = AbstractC87156YIm.LJIIJJI(i8, (YIZ) C87166YIw.LJIIZILJ(j, t), LJIJJ(i6));
                            i5 += LJJIIJ2;
                            break;
                        } else {
                            break;
                        }
                }
            }
            YJA<?, ?> yja = this.LJIIJ;
            return yja.LIZIZ(yja.LIZJ(t)) + i5;
        }
        Unsafe unsafe2 = LJIILJJIL;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < this.LIZ.length) {
            int LJIJJLI4 = LJIJJLI(i11);
            int[] iArr = this.LIZ;
            int i14 = iArr[i11];
            int i15 = (i2 & LJIJJLI4) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i11 + 2];
                int i17 = i16 & i4;
                i = i3 << (i16 >>> 20);
                if (i17 != i10) {
                    i13 = unsafe2.getInt(t, i17);
                    i10 = i17;
                }
            } else {
                i = 0;
            }
            long j2 = LJIJJLI4 & 1048575;
            switch (i15) {
                case 0:
                    if ((i13 & i) != 0) {
                        LJIJJ = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJIJJ + 8;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i13 & i) != 0) {
                        LJIJJ2 = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJIJJ2 + 4;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i & i13) != 0) {
                        long j3 = unsafe2.getLong(t, j2);
                        LJIJJ3 = AbstractC87156YIm.LJIJJ(i14);
                        LJIILLIIL = AbstractC87156YIm.LJIILLIIL(j3);
                        LJJIIJ = LJIILLIIL + LJIJJ3;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i & i13) != 0) {
                        long j4 = unsafe2.getLong(t, j2);
                        LJIJJ3 = AbstractC87156YIm.LJIJJ(i14);
                        LJIILLIIL = AbstractC87156YIm.LJIILLIIL(j4);
                        LJJIIJ = LJIILLIIL + LJIJJ3;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i & i13) != 0) {
                        int i18 = unsafe2.getInt(t, j2);
                        LJIJJ4 = AbstractC87156YIm.LJIJJ(i14);
                        LJIJJLI = AbstractC87156YIm.LJIJJLI(i18);
                        LJJIIJ = LJIJJLI + LJIJJ4;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i13 & i) != 0) {
                        LJJIIJ = AbstractC87156YIm.LJJIIJ(i14);
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i13 & i) != 0) {
                        LJJIIJ = AbstractC87156YIm.LJI(i14);
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i13 & i) != 0) {
                        LJIJJ5 = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJIJJ5 + 1;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe2.getObject(t, j2);
                        if (object instanceof AbstractC87141YHx) {
                            LJJIIJ = AbstractC87156YIm.LJIIJ(i14, (AbstractC87141YHx) object);
                            i12 += LJJIIJ;
                            break;
                        } else {
                            LJIJJ4 = AbstractC87156YIm.LJIJJ(i14);
                            LJIJJLI = AbstractC87156YIm.LJJ((String) object);
                            LJJIIJ = LJIJJLI + LJIJJ4;
                            i12 += LJJIIJ;
                        }
                    }
                case 9:
                    if ((i13 & i) != 0) {
                        LJJIIJ = C87163YIt.LJIIZILJ(i14, LJIJJ(i11), unsafe2.getObject(t, j2));
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i13 & i) != 0) {
                        LJJIIJ = AbstractC87156YIm.LJIIJ(i14, (AbstractC87141YHx) unsafe2.getObject(t, j2));
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    if ((i13 & i) != 0) {
                        LJJIIJ = AbstractC87156YIm.LJ(i14, unsafe2.getInt(t, j2));
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i13 & i) != 0) {
                        int i19 = unsafe2.getInt(t, j2);
                        LJIJJ4 = AbstractC87156YIm.LJIJJ(i14);
                        LJIJJLI = AbstractC87156YIm.LJIJJLI(i19);
                        LJJIIJ = LJIJJLI + LJIJJ4;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    if ((i13 & i) != 0) {
                        LJIJJ2 = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJIJJ2 + 4;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i13 & i) != 0) {
                        LJIJJ = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJIJJ + 8;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i13 & i) != 0) {
                        LJJIIJ = AbstractC87156YIm.LJFF(i14, unsafe2.getInt(t, j2));
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    if ((i13 & i) != 0) {
                        LJJIIJ = AbstractC87156YIm.LJJIII(i14, unsafe2.getLong(t, j2));
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i13 & i) != 0) {
                        LJJIIJ = AbstractC87156YIm.LJIIJJI(i14, (YIZ) unsafe2.getObject(t, j2), LJIJJ(i11));
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    LJJIIJ = C87163YIt.LJJIJIL(i14, (List) unsafe2.getObject(t, j2));
                    i12 += LJJIIJ;
                    break;
                case 19:
                    LJJIIJ = C87163YIt.LJJIJIIJIL(i14, (List) unsafe2.getObject(t, j2));
                    i12 += LJJIIJ;
                    break;
                case 20:
                    List list = (List) unsafe2.getObject(t, j2);
                    if (list.size() != 0) {
                        LJJIIJ = (AbstractC87156YIm.LJIJJ(i14) * list.size()) + C87163YIt.LJ(list);
                        i12 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i12 += LJJIIJ;
                case 21:
                    List list2 = (List) unsafe2.getObject(t, j2);
                    size = list2.size();
                    if (size != 0) {
                        LJFF = C87163YIt.LJFF(list2);
                        LJIJJ6 = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJFF + (LJIJJ6 * size);
                        i12 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i12 += LJJIIJ;
                case 22:
                    List list3 = (List) unsafe2.getObject(t, j2);
                    size = list3.size();
                    if (size != 0) {
                        LJFF = C87163YIt.LJIIIIZZ(list3);
                        LJIJJ6 = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJFF + (LJIJJ6 * size);
                        i12 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i12 += LJJIIJ;
                case 23:
                    LJJIIJ = C87163YIt.LJJIJIL(i14, (List) unsafe2.getObject(t, j2));
                    i12 += LJJIIJ;
                    break;
                case 24:
                    LJJIIJ = C87163YIt.LJJIJIIJIL(i14, (List) unsafe2.getObject(t, j2));
                    i12 += LJJIIJ;
                    break;
                case 25:
                    int size5 = ((List) unsafe2.getObject(t, j2)).size();
                    if (size5 != 0) {
                        LJJIIJ = size5 * (AbstractC87156YIm.LJIJJ(i14) + 1);
                        i12 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i12 += LJJIIJ;
                case 26:
                    LJJIIJ = C87163YIt.LJIJ(i14, (List) unsafe2.getObject(t, j2));
                    i12 += LJJIIJ;
                    break;
                case 27:
                    LJJIIJ = C87163YIt.LJIJI(i14, (List) unsafe2.getObject(t, j2), LJIJJ(i11));
                    i12 += LJJIIJ;
                    break;
                case 28:
                    LJJIIJ = C87163YIt.LJIJJLI(i14, (List) unsafe2.getObject(t, j2));
                    i12 += LJJIIJ;
                    break;
                case 29:
                    List list4 = (List) unsafe2.getObject(t, j2);
                    size = list4.size();
                    if (size != 0) {
                        LJFF = C87163YIt.LJIIIZ(list4);
                        LJIJJ6 = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJFF + (LJIJJ6 * size);
                        i12 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i12 += LJJIIJ;
                case 30:
                    List list5 = (List) unsafe2.getObject(t, j2);
                    size = list5.size();
                    if (size != 0) {
                        LJFF = C87163YIt.LJII(list5);
                        LJIJJ6 = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJFF + (LJIJJ6 * size);
                        i12 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i12 += LJJIIJ;
                case 31:
                    LJJIIJ = C87163YIt.LJJIJIIJIL(i14, (List) unsafe2.getObject(t, j2));
                    i12 += LJJIIJ;
                    break;
                case 32:
                    LJJIIJ = C87163YIt.LJJIJIL(i14, (List) unsafe2.getObject(t, j2));
                    i12 += LJJIIJ;
                    break;
                case 33:
                    List list6 = (List) unsafe2.getObject(t, j2);
                    size = list6.size();
                    if (size != 0) {
                        LJFF = C87163YIt.LJIIJ(list6);
                        LJIJJ6 = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJFF + (LJIJJ6 * size);
                        i12 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i12 += LJJIIJ;
                case 34:
                    List list7 = (List) unsafe2.getObject(t, j2);
                    size = list7.size();
                    if (size != 0) {
                        LJFF = C87163YIt.LJI(list7);
                        LJIJJ6 = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJFF + (LJIJJ6 * size);
                        i12 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i12 += LJJIIJ;
                case 35:
                    LJIIL = C87163YIt.LJIIL((List) unsafe2.getObject(t, j2));
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    LJIIL = C87163YIt.LJIIJJI((List) unsafe2.getObject(t, j2));
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    LJIIL = C87163YIt.LJ((List) unsafe2.getObject(t, j2));
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    LJIIL = C87163YIt.LJFF((List) unsafe2.getObject(t, j2));
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    LJIIL = C87163YIt.LJIIIIZZ((List) unsafe2.getObject(t, j2));
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                    LJIIL = C87163YIt.LJIIL((List) unsafe2.getObject(t, j2));
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    LJIIL = C87163YIt.LJIIJJI((List) unsafe2.getObject(t, j2));
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    LJIIL = ((List) unsafe2.getObject(t, j2)).size();
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                    LJIIL = C87163YIt.LJIIIZ((List) unsafe2.getObject(t, j2));
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    LJIIL = C87163YIt.LJII((List) unsafe2.getObject(t, j2));
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    LJIIL = C87163YIt.LJIIJJI((List) unsafe2.getObject(t, j2));
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    LJIIL = C87163YIt.LJIIL((List) unsafe2.getObject(t, j2));
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    LJIIL = C87163YIt.LJIIJ((List) unsafe2.getObject(t, j2));
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                    LJIIL = C87163YIt.LJI((List) unsafe2.getObject(t, j2));
                    if (LJIIL > 0) {
                        LJIJJ7 = AbstractC87156YIm.LJIJJ(i14);
                        LJIL = AbstractC87156YIm.LJIL(LJIIL);
                        i12 = AnonymousClass036.LIZIZ(LJIL, LJIJJ7, LJIIL, i12);
                        break;
                    } else {
                        break;
                    }
                case C61447O9r.LJIIJ:
                    List list8 = (List) unsafe2.getObject(t, j2);
                    YIU LJIJJ16 = LJIJJ(i11);
                    int size6 = list8.size();
                    if (size6 != 0) {
                        LJJIIJ = 0;
                        for (int i20 = 0; i20 < size6; i20++) {
                            LJJIIJ += AbstractC87156YIm.LJIIJJI(i14, (YIZ) ListProtector.get(list8, i20), LJIJJ16);
                        }
                        i12 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i12 += LJJIIJ;
                case 50:
                    this.LJIIL.LIZ(unsafe2.getObject(t, j2));
                    LJJIIJ = 0;
                    i12 += LJJIIJ;
                    break;
                case 51:
                    if (LJIIL(i14, i11, t)) {
                        LJIJJ = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJIJJ + 8;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (LJIIL(i14, i11, t)) {
                        LJIJJ2 = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJIJJ2 + 4;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (LJIIL(i14, i11, t)) {
                        long LJJ3 = LJJ(j2, t);
                        LJIJJ3 = AbstractC87156YIm.LJIJJ(i14);
                        LJIILLIIL = AbstractC87156YIm.LJIILLIIL(LJJ3);
                        LJJIIJ = LJIILLIIL + LJIJJ3;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (LJIIL(i14, i11, t)) {
                        long LJJ4 = LJJ(j2, t);
                        LJIJJ3 = AbstractC87156YIm.LJIJJ(i14);
                        LJIILLIIL = AbstractC87156YIm.LJIILLIIL(LJJ4);
                        LJJIIJ = LJIILLIIL + LJIJJ3;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (LJIIL(i14, i11, t)) {
                        int LJIL5 = LJIL(j2, t);
                        LJIJJ4 = AbstractC87156YIm.LJIJJ(i14);
                        LJIJJLI = AbstractC87156YIm.LJIJJLI(LJIL5);
                        LJJIIJ = LJIJJLI + LJIJJ4;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (LJIIL(i14, i11, t)) {
                        LJJIIJ = AbstractC87156YIm.LJJIIJ(i14);
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (LJIIL(i14, i11, t)) {
                        LJJIIJ = AbstractC87156YIm.LJI(i14);
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (LJIIL(i14, i11, t)) {
                        LJIJJ5 = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJIJJ5 + 1;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!LJIIL(i14, i11, t)) {
                        break;
                    } else {
                        Object object2 = unsafe2.getObject(t, j2);
                        if (object2 instanceof AbstractC87141YHx) {
                            LJJIIJ = AbstractC87156YIm.LJIIJ(i14, (AbstractC87141YHx) object2);
                            i12 += LJJIIJ;
                            break;
                        } else {
                            LJIJJ4 = AbstractC87156YIm.LJIJJ(i14);
                            LJIJJLI = AbstractC87156YIm.LJJ((String) object2);
                            LJJIIJ = LJIJJLI + LJIJJ4;
                            i12 += LJJIIJ;
                        }
                    }
                case 60:
                    if (LJIIL(i14, i11, t)) {
                        LJJIIJ = C87163YIt.LJIIZILJ(i14, LJIJJ(i11), unsafe2.getObject(t, j2));
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (LJIIL(i14, i11, t)) {
                        LJJIIJ = AbstractC87156YIm.LJIIJ(i14, (AbstractC87141YHx) unsafe2.getObject(t, j2));
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case BaseNotice.CREATOR /* 62 */:
                    if (LJIIL(i14, i11, t)) {
                        LJJIIJ = AbstractC87156YIm.LJ(i14, LJIL(j2, t));
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (LJIIL(i14, i11, t)) {
                        int LJIL6 = LJIL(j2, t);
                        LJIJJ4 = AbstractC87156YIm.LJIJJ(i14);
                        LJIJJLI = AbstractC87156YIm.LJIJJLI(LJIL6);
                        LJJIIJ = LJIJJLI + LJIJJ4;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (LJIIL(i14, i11, t)) {
                        LJIJJ2 = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJIJJ2 + 4;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (LJIIL(i14, i11, t)) {
                        LJIJJ = AbstractC87156YIm.LJIJJ(i14);
                        LJJIIJ = LJIJJ + 8;
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (LJIIL(i14, i11, t)) {
                        LJJIIJ = AbstractC87156YIm.LJFF(i14, LJIL(j2, t));
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (LJIIL(i14, i11, t)) {
                        LJJIIJ = AbstractC87156YIm.LJJIII(i14, LJJ(j2, t));
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (LJIIL(i14, i11, t)) {
                        LJJIIJ = AbstractC87156YIm.LJIIJJI(i14, (YIZ) unsafe2.getObject(t, j2), LJIJJ(i11));
                        i12 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
            }
            i11 += 3;
            i2 = 267386880;
            i3 = 1;
            i4 = 1048575;
        }
        YJA<?, ?> yja2 = this.LJIIJ;
        int LIZIZ = yja2.LIZIZ(yja2.LIZJ(t)) + i12;
        if (this.LIZLLL) {
            C87165YIv<?> LIZLLL = this.LJIIJJI.LIZLLL(t);
            int i21 = 0;
            for (int i22 = 0; i22 < LIZLLL.LIZ.LIZLLL(); i22++) {
                Map.Entry LJIIIIZZ = LIZLLL.LIZ.LJIIIIZZ(i22);
                i21 += C87165YIv.LJ((YJB) LJIIIIZZ.getKey(), LJIIIIZZ.getValue());
            }
            for (Map.Entry entry : LIZLLL.LIZ.LJ()) {
                i21 += C87165YIv.LJ((YJB) entry.getKey(), entry.getValue());
            }
            return LIZIZ + i21;
        }
        return LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0066 A[SYNTHETIC] */
    @Override // X.YIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(T r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87164YIu.LJI(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (X.C87166YIw.LJIILJJIL(r1, r9) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01a0, code lost:
    
        r6 = 1237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019c, code lost:
    
        if (((java.lang.Boolean) X.C87166YIw.LJIIZILJ(r1, r9)).booleanValue() != false) goto L92;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // X.YIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJII(T r9) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87164YIu.LJII(java.lang.Object):int");
    }

    @Override // X.YIU
    public final void LJIIIIZZ(YIO yio) {
        int i;
        int i2 = this.LJI;
        while (true) {
            i = this.LJII;
            if (i2 >= i) {
                break;
            }
            long LJIJJLI = LJIJJLI(this.LJFF[i2]) & 1048575;
            Object LJIIZILJ = C87166YIw.LJIIZILJ(LJIJJLI, yio);
            if (LJIIZILJ != null) {
                this.LJIIL.LIZLLL(LJIIZILJ);
                C87166YIw.LIZIZ(LJIJJLI, yio, LJIIZILJ);
            }
            i2++;
        }
        int length = this.LJFF.length;
        while (i < length) {
            this.LJIIIZ.LIZIZ(this.LJFF[i], yio);
            i++;
        }
        this.LJIIJ.LJII(yio);
        if (this.LIZLLL) {
            this.LJIIJJI.LJFF(yio);
        }
    }

    public final YIU LJIJJ(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.LIZIZ;
        YIU yiu = (YIU) objArr[i2];
        if (yiu != null) {
            return yiu;
        }
        YIU<T> LIZ = C87169YIz.LIZJ.LIZ((Class) objArr[i2 + 1]);
        this.LIZIZ[i2] = LIZ;
        return LIZ;
    }

    public final int LJIJJLI(int i) {
        return this.LIZ[i + 1];
    }

    public static Field LIZIZ(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + name.length() + String.valueOf(str).length() + 40);
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(AnonymousClass073.LIZIZ(sb, " not found. Known fields are ", arrays));
        }
    }

    public static List LJIJ(long j, Object obj) {
        return (List) C87166YIw.LJIIZILJ(j, obj);
    }

    public static int LJIL(long j, Object obj) {
        return ((Integer) C87166YIw.LJIIZILJ(j, obj)).intValue();
    }

    public static long LJJ(long j, Object obj) {
        return ((Long) C87166YIw.LJIIZILJ(j, obj)).longValue();
    }

    @Override // X.YIU
    public final void LIZLLL(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.LIZ.length; i += 3) {
            int LJIJJLI = LJIJJLI(i);
            long j = 1048575 & LJIJJLI;
            int i2 = this.LIZ[i];
            switch ((LJIJJLI & 267386880) >>> 20) {
                case 0:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LIZLLL.LIZJ(t, j, C87166YIw.LJIILLIIL(j, t2));
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LIZLLL.LIZLLL(t, j, C87166YIw.LJIILL(j, t2));
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LIZLLL.LIZ(j, t, C87166YIw.LJIIL(j, t2));
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LIZLLL.LIZ(j, t, C87166YIw.LJIIL(j, t2));
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LJI(j, C87166YIw.LJIIJ(j, t2), t);
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LIZLLL.LIZ(j, t, C87166YIw.LJIIL(j, t2));
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LJI(j, C87166YIw.LJIIJ(j, t2), t);
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LIZLLL.LIZIZ(j, t, C87166YIw.LJIILJJIL(j, t2));
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LIZIZ(j, t, C87166YIw.LJIIZILJ(j, t2));
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    LJIIJ(i, t, t2);
                    break;
                case 10:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LIZIZ(j, t, C87166YIw.LJIIZILJ(j, t2));
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LJI(j, C87166YIw.LJIIJ(j, t2), t);
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LJI(j, C87166YIw.LJIIJ(j, t2), t);
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LJI(j, C87166YIw.LJIIJ(j, t2), t);
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LIZLLL.LIZ(j, t, C87166YIw.LJIIL(j, t2));
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LJI(j, C87166YIw.LJIIJ(j, t2), t);
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    if (LJIIZILJ(i, t2)) {
                        C87166YIw.LIZLLL.LIZ(j, t, C87166YIw.LJIIL(j, t2));
                        LJIJI(i, t);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    LJIIJ(i, t, t2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                case 41:
                case 42:
                case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                case 44:
                case 45:
                case 46:
                case 47:
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                case C61447O9r.LJIIJ:
                    this.LJIIIZ.LIZ(j, t, t2);
                    break;
                case 50:
                    C87166YIw.LIZIZ(j, t, this.LJIIL.LIZJ(C87166YIw.LJIIZILJ(j, t), C87166YIw.LJIIZILJ(j, t2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (LJIIL(i2, i, t2)) {
                        C87166YIw.LIZIZ(j, t, C87166YIw.LJIIZILJ(j, t2));
                        LJIILIIL(i2, i, t);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    LJIILJJIL(i, t, t2);
                    break;
                case 61:
                case BaseNotice.CREATOR /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (LJIIL(i2, i, t2)) {
                        C87166YIw.LIZIZ(j, t, C87166YIw.LJIIZILJ(j, t2));
                        LJIILIIL(i2, i, t);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    LJIILJJIL(i, t, t2);
                    break;
            }
        }
        if (!this.LJ) {
            YJA<?, ?> yja = this.LJIIJ;
            yja.LJFF(t, yja.LJI(yja.LIZJ(t), yja.LIZJ(t2)));
            if (this.LIZLLL) {
                C87163YIt.LIZLLL(this.LJIIJJI, t, t2);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x001a A[SYNTHETIC] */
    @Override // X.YIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(T r9, T r10) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87164YIu.LJFF(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0594  */
    @Override // X.YIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.Object r18, X.YJ8 r19) {
        /*
            Method dump skipped, instructions count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87164YIu.LJIIIZ(java.lang.Object, X.YJ8):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.lang.Object r19, X.YJ8 r20) {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87164YIu.LJIILL(java.lang.Object, X.YJ8):void");
    }

    public final boolean LJIIZILJ(int i, Object obj) {
        if (this.LJ) {
            int LJIJJLI = LJIJJLI(i);
            long j = LJIJJLI & 1048575;
            switch ((LJIJJLI & 267386880) >>> 20) {
                case 0:
                    if (C87166YIw.LJIILLIIL(j, obj) == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        return false;
                    }
                    return true;
                case 1:
                    if (C87166YIw.LJIILL(j, obj) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C87166YIw.LJIIL(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C87166YIw.LJIIL(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C87166YIw.LJIIJ(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C87166YIw.LJIIL(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C87166YIw.LJIIJ(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C87166YIw.LJIILJJIL(j, obj);
                case 8:
                    Object LJIIZILJ = C87166YIw.LJIIZILJ(j, obj);
                    if (LJIIZILJ instanceof String) {
                        if (((String) LJIIZILJ).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (LJIIZILJ instanceof AbstractC87141YHx) {
                        if (AbstractC87141YHx.zzfuo.equals(LJIIZILJ)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C87166YIw.LJIIZILJ(j, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC87141YHx.zzfuo.equals(C87166YIw.LJIIZILJ(j, obj))) {
                        return false;
                    }
                    return true;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    if (C87166YIw.LJIIJ(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C87166YIw.LJIIJ(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    if (C87166YIw.LJIIJ(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C87166YIw.LJIIL(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C87166YIw.LJIIJ(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    if (C87166YIw.LJIIL(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C87166YIw.LJIIZILJ(j, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((C87166YIw.LJIIJ(r1 & 1048575, obj) & (1 << (this.LIZ[i + 2] >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    public final void LJIJI(int i, Object obj) {
        if (this.LJ) {
            return;
        }
        int i2 = this.LIZ[i + 2];
        int i3 = 1 << (i2 >>> 20);
        long j = i2 & 1048575;
        C87166YIw.LJI(j, C87166YIw.LJIIJ(j, obj) | i3, obj);
    }

    public static void LIZJ(int i, Object obj, YJ8 yj8) {
        if (obj instanceof String) {
            yj8.LIZ.LJIILIIL(i, (String) obj);
        } else {
            yj8.LIZ(i, (AbstractC87141YHx) obj);
        }
    }

    public final void LJIIJ(int i, Object obj, Object obj2) {
        long LJIJJLI = LJIJJLI(i) & 1048575;
        if (!LJIIZILJ(i, obj2)) {
            return;
        }
        Object LJIIZILJ = C87166YIw.LJIIZILJ(LJIJJLI, obj);
        Object LJIIZILJ2 = C87166YIw.LJIIZILJ(LJIJJLI, obj2);
        if (LJIIZILJ != null) {
            if (LJIIZILJ2 != null) {
                C87166YIw.LIZIZ(LJIJJLI, obj, ((YIZ) LJIIZILJ).LIZJ().LJFF((YIZ) LJIIZILJ2).LJII());
                LJIJI(i, obj);
                return;
            }
            return;
        }
        if (LJIIZILJ2 != null) {
            C87166YIw.LIZIZ(LJIJJLI, obj, LJIIZILJ2);
            LJIJI(i, obj);
        }
    }

    public final boolean LJIIL(int i, int i2, Object obj) {
        if (C87166YIw.LJIIJ(this.LIZ[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    public final void LJIILIIL(int i, int i2, Object obj) {
        C87166YIw.LJI(this.LIZ[i2 + 2] & 1048575, i, obj);
    }

    public final void LJIILJJIL(int i, Object obj, Object obj2) {
        int LJIJJLI = LJIJJLI(i);
        int i2 = this.LIZ[i];
        long j = LJIJJLI & 1048575;
        if (!LJIIL(i2, i, obj2)) {
            return;
        }
        Object LJIIZILJ = C87166YIw.LJIIZILJ(j, obj);
        Object LJIIZILJ2 = C87166YIw.LJIIZILJ(j, obj2);
        if (LJIIZILJ != null) {
            if (LJIIZILJ2 != null) {
                C87166YIw.LIZIZ(j, obj, ((YIZ) LJIIZILJ).LIZJ().LJFF((YIZ) LJIIZILJ2).LJII());
                LJIILIIL(i2, i, obj);
                return;
            }
            return;
        }
        if (LJIIZILJ2 != null) {
            C87166YIw.LIZIZ(j, obj, LJIIZILJ2);
            LJIILIIL(i2, i, obj);
        }
    }

    public final boolean LJIILLIIL(int i, Object obj, Object obj2) {
        if (LJIIZILJ(i, obj) == LJIIZILJ(i, obj2)) {
            return true;
        }
        return false;
    }

    public final void LJIIJJI(YJ8 yj8, int i, Object obj, int i2) {
        if (obj != null) {
            this.LJIIL.LIZIZ();
            C65874PtG LJ = this.LJIIL.LJ(obj);
            yj8.getClass();
            Iterator it = LJ.entrySet().iterator();
            if (!it.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            yj8.LIZ.LJJIIJZLJL(i, 2);
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static C87164YIu LIZ(InterfaceC87181YJl interfaceC87181YJl, VKO vko, AbstractC84699XLz abstractC84699XLz, YJA yja, YJ7 yj7, InterfaceC87176YJg interfaceC87176YJg) {
        boolean z;
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int[] iArr;
        int i2;
        int i3;
        char charAt5;
        int i4;
        char charAt6;
        int i5;
        char charAt7;
        int i6;
        char charAt8;
        int i7;
        int i8;
        int i9;
        char charAt9;
        int i10;
        char charAt10;
        int i11;
        int objectFieldOffset;
        int i12;
        int i13;
        Field LIZIZ;
        char charAt11;
        int i14;
        int i15;
        int i16;
        int i17;
        Field LIZIZ2;
        Field LIZIZ3;
        int i18;
        char charAt12;
        int i19;
        char charAt13;
        int i20;
        char charAt14;
        int i21;
        char charAt15;
        char charAt16;
        if (interfaceC87181YJl instanceof YJK) {
            YJK yjk = (YJK) interfaceC87181YJl;
            if (yjk.LIZIZ() == 2) {
                z = true;
            } else {
                z = false;
            }
            String str = yjk.LIZIZ;
            int length = str.length();
            int charAt17 = str.charAt(0);
            if (charAt17 >= 55296) {
                int i22 = charAt17 & 8191;
                int i23 = 1;
                int i24 = 13;
                while (true) {
                    i = i23 + 1;
                    charAt16 = str.charAt(i23);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i22 |= (charAt16 & 8191) << i24;
                    i24 += 13;
                    i23 = i;
                }
                charAt17 = i22 | (charAt16 << i24);
            } else {
                i = 1;
            }
            int i25 = i + 1;
            int charAt18 = str.charAt(i);
            if (charAt18 >= 55296) {
                int i26 = charAt18 & 8191;
                int i27 = 13;
                while (true) {
                    i21 = i25 + 1;
                    charAt15 = str.charAt(i25);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i26 |= (charAt15 & 8191) << i27;
                    i27 += 13;
                    i25 = i21;
                }
                charAt18 = i26 | (charAt15 << i27);
                i25 = i21;
            }
            if (charAt18 == 0) {
                iArr = LJIILIIL;
                charAt = 0;
                charAt2 = 0;
                charAt3 = 0;
                charAt4 = 0;
                i2 = 0;
            } else {
                int i28 = i25 + 1;
                charAt = str.charAt(i25);
                if (charAt >= 55296) {
                    int i29 = charAt & 8191;
                    int i30 = 13;
                    while (true) {
                        i10 = i28 + 1;
                        charAt10 = str.charAt(i28);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i29 |= (charAt10 & 8191) << i30;
                        i30 += 13;
                        i28 = i10;
                    }
                    charAt = i29 | (charAt10 << i30);
                    i28 = i10;
                }
                int i31 = i28 + 1;
                int charAt19 = str.charAt(i28);
                if (charAt19 >= 55296) {
                    int i32 = charAt19 & 8191;
                    int i33 = 13;
                    while (true) {
                        i9 = i31 + 1;
                        charAt9 = str.charAt(i31);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i32 |= (charAt9 & 8191) << i33;
                        i33 += 13;
                        i31 = i9;
                    }
                    charAt19 = i32 | (charAt9 << i33);
                    i31 = i9;
                }
                int i34 = i31 + 1;
                if (str.charAt(i31) >= 55296) {
                    while (true) {
                        i8 = i34 + 1;
                        if (str.charAt(i34) < 55296) {
                            break;
                        }
                        i34 = i8;
                    }
                    i34 = i8;
                }
                int i35 = i34 + 1;
                if (str.charAt(i34) >= 55296) {
                    while (true) {
                        i7 = i35 + 1;
                        if (str.charAt(i35) < 55296) {
                            break;
                        }
                        i35 = i7;
                    }
                    i35 = i7;
                }
                int i36 = i35 + 1;
                charAt2 = str.charAt(i35);
                if (charAt2 >= 55296) {
                    int i37 = charAt2 & 8191;
                    int i38 = 13;
                    while (true) {
                        i6 = i36 + 1;
                        charAt8 = str.charAt(i36);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i37 |= (charAt8 & 8191) << i38;
                        i38 += 13;
                        i36 = i6;
                    }
                    charAt2 = i37 | (charAt8 << i38);
                    i36 = i6;
                }
                int i39 = i36 + 1;
                charAt3 = str.charAt(i36);
                if (charAt3 >= 55296) {
                    int i40 = charAt3 & 8191;
                    int i41 = 13;
                    while (true) {
                        i5 = i39 + 1;
                        charAt7 = str.charAt(i39);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i40 |= (charAt7 & 8191) << i41;
                        i41 += 13;
                        i39 = i5;
                    }
                    charAt3 = i40 | (charAt7 << i41);
                    i39 = i5;
                }
                int i42 = i39 + 1;
                int charAt20 = str.charAt(i39);
                if (charAt20 >= 55296) {
                    int i43 = charAt20 & 8191;
                    int i44 = 13;
                    while (true) {
                        i4 = i42 + 1;
                        charAt6 = str.charAt(i42);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i43 |= (charAt6 & 8191) << i44;
                        i44 += 13;
                        i42 = i4;
                    }
                    charAt20 = i43 | (charAt6 << i44);
                    i42 = i4;
                }
                i25 = i42 + 1;
                charAt4 = str.charAt(i42);
                if (charAt4 >= 55296) {
                    int i45 = charAt4 & 8191;
                    int i46 = 13;
                    while (true) {
                        i3 = i25 + 1;
                        charAt5 = str.charAt(i25);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i45 |= (charAt5 & 8191) << i46;
                        i46 += 13;
                        i25 = i3;
                    }
                    charAt4 = i45 | (charAt5 << i46);
                    i25 = i3;
                }
                iArr = new int[charAt4 + charAt3 + charAt20];
                i2 = (charAt << 1) + charAt19;
            }
            Unsafe unsafe = LJIILJJIL;
            Object[] objArr = yjk.LIZJ;
            Class<?> cls = yjk.LIZ.getClass();
            int[] iArr2 = new int[charAt2 * 3];
            Object[] objArr2 = new Object[charAt2 << 1];
            int i47 = charAt3 + charAt4;
            int i48 = i47;
            int i49 = charAt4;
            int i50 = 0;
            int i51 = 0;
            while (i25 < length) {
                int i52 = i25 + 1;
                int charAt21 = str.charAt(i25);
                if (charAt21 >= 55296) {
                    int i53 = charAt21 & 8191;
                    int i54 = 13;
                    while (true) {
                        i20 = i52 + 1;
                        charAt14 = str.charAt(i52);
                        if (charAt14 < 55296) {
                            break;
                        }
                        i53 |= (charAt14 & 8191) << i54;
                        i54 += 13;
                        i52 = i20;
                    }
                    charAt21 = i53 | (charAt14 << i54);
                    i52 = i20;
                }
                i25 = i52 + 1;
                int charAt22 = str.charAt(i52);
                if (charAt22 >= 55296) {
                    int i55 = charAt22 & 8191;
                    int i56 = 13;
                    while (true) {
                        i19 = i25 + 1;
                        charAt13 = str.charAt(i25);
                        if (charAt13 < 55296) {
                            break;
                        }
                        i55 |= (charAt13 & 8191) << i56;
                        i56 += 13;
                        i25 = i19;
                    }
                    charAt22 = i55 | (charAt13 << i56);
                    i25 = i19;
                }
                int i57 = charAt22 & 255;
                if ((charAt22 & 1024) != 0) {
                    iArr[i50] = i51;
                    i50++;
                }
                if (i57 >= 51) {
                    int i58 = i25 + 1;
                    int charAt23 = str.charAt(i25);
                    if (charAt23 >= 55296) {
                        int i59 = charAt23 & 8191;
                        int i60 = 13;
                        while (true) {
                            i18 = i58 + 1;
                            charAt12 = str.charAt(i58);
                            if (charAt12 < 55296) {
                                break;
                            }
                            i59 |= (charAt12 & 8191) << i60;
                            i60 += 13;
                            i58 = i18;
                        }
                        charAt23 = i59 | (charAt12 << i60);
                        i58 = i18;
                    }
                    int i61 = i57 - 51;
                    if (i61 == 9 || i61 == 17) {
                        i17 = 1;
                        objArr2[((i51 / 3) << 1) + 1] = objArr[i2];
                        i2++;
                    } else {
                        if (i61 == 12 && (charAt17 & 1) == 1) {
                            objArr2[((i51 / 3) << 1) + 1] = objArr[i2];
                            i2++;
                        }
                        i17 = 1;
                    }
                    int i62 = charAt23 << i17;
                    Object obj = objArr[i62];
                    if (obj instanceof Field) {
                        LIZIZ2 = (Field) obj;
                    } else {
                        LIZIZ2 = LIZIZ(cls, (String) obj);
                        objArr[i62] = LIZIZ2;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(LIZIZ2);
                    int i63 = i62 + 1;
                    Object obj2 = objArr[i63];
                    if (obj2 instanceof Field) {
                        LIZIZ3 = (Field) obj2;
                    } else {
                        LIZIZ3 = LIZIZ(cls, (String) obj2);
                        objArr[i63] = LIZIZ3;
                    }
                    i13 = (int) unsafe.objectFieldOffset(LIZIZ3);
                    i11 = i2;
                    i25 = i58;
                    i12 = 0;
                } else {
                    i11 = i2 + 1;
                    Field LIZIZ4 = LIZIZ(cls, (String) objArr[i2]);
                    if (i57 == 9 || i57 == 17) {
                        objArr2[((i51 / 3) << 1) + 1] = LIZIZ4.getType();
                    } else {
                        if (i57 == 27 || i57 == 49) {
                            i14 = i11 + 1;
                            objArr2[((i51 / 3) << 1) + 1] = objArr[i11];
                        } else if (i57 == 12 || i57 == 30 || i57 == 44) {
                            if ((charAt17 & 1) == 1) {
                                i14 = i11 + 1;
                                objArr2[((i51 / 3) << 1) + 1] = objArr[i11];
                            }
                        } else if (i57 == 50) {
                            int i64 = i49 + 1;
                            iArr[i49] = i51;
                            int i65 = (i51 / 3) << 1;
                            int i66 = i11 + 1;
                            objArr2[i65] = objArr[i11];
                            if ((charAt22 & 2048) != 0) {
                                i11 = i66 + 1;
                                objArr2[i65 + 1] = objArr[i66];
                            } else {
                                i11 = i66;
                            }
                            i49 = i64;
                        }
                        i11 = i14;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(LIZIZ4);
                    if ((charAt17 & 1) == 1 && i57 <= 17) {
                        int i67 = i25 + 1;
                        int charAt24 = str.charAt(i25);
                        if (charAt24 >= 55296) {
                            int i68 = charAt24 & 8191;
                            int i69 = 13;
                            while (true) {
                                i25 = i67 + 1;
                                charAt11 = str.charAt(i67);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i68 |= (charAt11 & 8191) << i69;
                                i69 += 13;
                                i67 = i25;
                            }
                            charAt24 = i68 | (charAt11 << i69);
                        } else {
                            i25 = i67;
                        }
                        int i70 = (charAt24 / 32) + (charAt << 1);
                        Object obj3 = objArr[i70];
                        if (obj3 instanceof Field) {
                            LIZIZ = (Field) obj3;
                        } else {
                            LIZIZ = LIZIZ(cls, (String) obj3);
                            objArr[i70] = LIZIZ;
                        }
                        i13 = (int) unsafe.objectFieldOffset(LIZIZ);
                        i12 = charAt24 % 32;
                    } else {
                        i12 = 0;
                        i13 = 0;
                        if (i57 >= 18 && i57 <= 49) {
                            iArr[i48] = objectFieldOffset;
                            i48++;
                        }
                    }
                }
                int i71 = i51 + 1;
                iArr2[i51] = charAt21;
                int i72 = i71 + 1;
                if ((charAt22 & 512) != 0) {
                    i15 = 536870912;
                } else {
                    i15 = 0;
                }
                if ((charAt22 & 256) != 0) {
                    i16 = 268435456;
                } else {
                    i16 = 0;
                }
                iArr2[i71] = i16 | i15 | (i57 << 20) | objectFieldOffset;
                i51 = i72 + 1;
                iArr2[i72] = (i12 << 20) | i13;
                i2 = i11;
            }
            return new C87164YIu(iArr2, objArr2, yjk.LIZ, z, iArr, charAt4, i47, vko, abstractC84699XLz, yja, yj7, interfaceC87176YJg);
        }
        ((C87180YJk) interfaceC87181YJl).LIZIZ();
        throw null;
    }

    public C87164YIu(int[] iArr, Object[] objArr, YIZ yiz, boolean z, int[] iArr2, int i, int i2, VKO vko, AbstractC84699XLz abstractC84699XLz, YJA yja, YJ7 yj7, InterfaceC87176YJg interfaceC87176YJg) {
        boolean z2;
        this.LIZ = iArr;
        this.LIZIZ = objArr;
        this.LJ = z;
        if (yj7 != null && yj7.LIZJ(yiz)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZLLL = z2;
        this.LJFF = iArr2;
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = vko;
        this.LJIIIZ = abstractC84699XLz;
        this.LJIIJ = yja;
        this.LJIIJJI = yj7;
        this.LIZJ = yiz;
        this.LJIIL = interfaceC87176YJg;
    }
}
