package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.Zj8, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90726Zj8<T> implements InterfaceC90399Zdr<T> {
    public static final int[] LJIIJJI = new int[0];
    public static final Unsafe LJIIL = C90376ZdU.LJIIJ();
    public final int[] LIZ;
    public final Object[] LIZIZ;
    public final InterfaceC90712Ziu LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int[] LJFF;
    public final int LJI;
    public final int LJII;
    public final AbstractC90235ZbD LJIIIIZZ;
    public final AbstractC90306ZcM<?, ?> LJIIIZ;
    public final AbstractC90234ZbC<?> LJIIJ;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (X.C90376ZdU.LJIILL(r1, r9) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x019e, code lost:
    
        r6 = 1237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x019a, code lost:
    
        if (((java.lang.Boolean) X.C90376ZdU.LJIIIZ(r1, r9)).booleanValue() != false) goto L92;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    @Override // X.InterfaceC90399Zdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ(T r9) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90726Zj8.LIZ(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005f A[SYNTHETIC] */
    @Override // X.InterfaceC90399Zdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(T r14) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90726Zj8.LIZIZ(java.lang.Object):boolean");
    }

    @Override // X.InterfaceC90399Zdr
    public final int LIZJ(T t) {
        if (this.LJ) {
            return LJIILJJIL(t);
        }
        return LJIILIIL(t);
    }

    @Override // X.InterfaceC90399Zdr
    public final void LJ(T t) {
        int i;
        int i2 = this.LJI;
        while (true) {
            i = this.LJII;
            if (i2 >= i) {
                break;
            }
            long LJIILLIIL = LJIILLIIL(this.LJFF[i2]) & 1048575;
            Object LJIIIZ = C90376ZdU.LJIIIZ(LJIILLIIL, t);
            if (LJIIIZ != null) {
                ((C90283Zbz) LJIIIZ).zzb();
                C90376ZdU.LJIILIIL(LJIILLIIL, t, LJIIIZ);
            }
            i2++;
        }
        int length = this.LJFF.length;
        while (i < length) {
            this.LJIIIIZZ.LIZ(this.LJFF[i], t);
            i++;
        }
        this.LJIIIZ.LJ(t);
        if (this.LIZLLL) {
            this.LJIIJ.LIZIZ(t);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0036. Please report as an issue. */
    public final int LJIILIIL(T t) {
        int i;
        int LIZ;
        int LIZ2;
        int LIZ3;
        int LIZIZ;
        int LIZ4;
        int LJIJ;
        int LIZ5;
        int LIZ6;
        int zzd;
        int LIZ7;
        int LJJII;
        int LIZ8;
        int LIZIZ2;
        int size;
        int LJJIJ;
        int LJIJJ;
        int LJIJJ2;
        int LIZ9;
        int i2;
        Unsafe unsafe = LJIIL;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i4 < this.LIZ.length) {
            int LJIILLIIL = LJIILLIIL(i4);
            int[] iArr = this.LIZ;
            int i8 = iArr[i4];
            int i9 = (LJIILLIIL >>> 20) & 255;
            if (i9 <= 17) {
                int i10 = iArr[i4 + 2];
                int i11 = i10 & i3;
                i = 1 << (i10 >>> 20);
                if (i11 != i6) {
                    i7 = unsafe.getInt(t, i11);
                    i6 = i11;
                }
            } else {
                i = 0;
            }
            long j = LJIILLIIL & i3;
            switch (i9) {
                case 0:
                    if ((i7 & i) != 0) {
                        LIZ = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ + 8;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i7 & i) != 0) {
                        LIZ2 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ2 + 4;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i7 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        LIZ3 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LIZIZ = AbstractC90761Zjh.LIZIZ(j2);
                        i5 += LIZ3 + LIZIZ;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i7 & i) != 0) {
                        long j3 = unsafe.getLong(t, j);
                        LIZ3 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LIZIZ = AbstractC90761Zjh.LIZIZ(j3);
                        i5 += LIZ3 + LIZIZ;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i7 & i) != 0) {
                        int i12 = unsafe.getInt(t, j);
                        LIZ4 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJIJ = AbstractC90761Zjh.LJIJ(i12);
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i7 & i) != 0) {
                        LIZ = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ + 8;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i7 & i) != 0) {
                        LIZ2 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ2 + 4;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i7 & i) != 0) {
                        LIZ5 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ5 + 1;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof AbstractC90364ZdI) {
                            LIZ6 = AbstractC90761Zjh.LIZ(i8 << 3);
                            zzd = ((AbstractC90364ZdI) object).zzd();
                            LIZ7 = AbstractC90761Zjh.LIZ(zzd);
                            i2 = LIZ6 + LIZ7 + zzd;
                            i5 += i2;
                            break;
                        } else {
                            LIZ4 = AbstractC90761Zjh.LIZ(i8 << 3);
                            LJIJ = AbstractC90761Zjh.LJIJI((String) object);
                            i2 = LIZ4 + LJIJ;
                            i5 += i2;
                        }
                    }
                case 9:
                    if ((i7 & i) != 0) {
                        LJJII = C90406Zdy.LJJII(i8, LJIJ(i4), unsafe.getObject(t, j));
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i7 & i) != 0) {
                        AbstractC90364ZdI abstractC90364ZdI = (AbstractC90364ZdI) unsafe.getObject(t, j);
                        LIZ6 = AbstractC90761Zjh.LIZ(i8 << 3);
                        zzd = abstractC90364ZdI.zzd();
                        LIZ7 = AbstractC90761Zjh.LIZ(zzd);
                        i2 = LIZ6 + LIZ7 + zzd;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    if ((i7 & i) != 0) {
                        int i13 = unsafe.getInt(t, j);
                        LIZ4 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJIJ = AbstractC90761Zjh.LIZ(i13);
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i7 & i) != 0) {
                        int i14 = unsafe.getInt(t, j);
                        LIZ4 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJIJ = AbstractC90761Zjh.LJIJ(i14);
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    if ((i7 & i) != 0) {
                        LIZ2 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ2 + 4;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i7 & i) != 0) {
                        LIZ = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ + 8;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i7 & i) != 0) {
                        int i15 = unsafe.getInt(t, j);
                        LIZ4 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJIJ = AbstractC90761Zjh.LIZ((i15 >> 31) ^ (i15 + i15));
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    if ((i & i7) != 0) {
                        long j4 = unsafe.getLong(t, j);
                        LIZ8 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LIZIZ2 = AbstractC90761Zjh.LIZIZ((j4 >> 63) ^ (j4 + j4));
                        i5 += LIZ8 + LIZIZ2;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i7 & i) != 0) {
                        LJJII = AbstractC90761Zjh.LJIIZILJ(i8, (InterfaceC90712Ziu) unsafe.getObject(t, j), LJIJ(i4));
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    LJJII = C90406Zdy.LJIL(i8, (List) unsafe.getObject(t, j));
                    i5 += LJJII;
                    break;
                case 19:
                    LJJII = C90406Zdy.LJIJJ(i8, (List) unsafe.getObject(t, j));
                    i5 += LJJII;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(t, j);
                    if (list.size() != 0) {
                        LJJII = C90406Zdy.LJJIFFI(list) + (list.size() * AbstractC90761Zjh.LJIJJ(i8));
                        i5 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i5 += LJJII;
                case 21:
                    List list2 = (List) unsafe.getObject(t, j);
                    size = list2.size();
                    if (size != 0) {
                        LJJIJ = C90406Zdy.LJJIJ(list2);
                        LJIJJ = AbstractC90761Zjh.LJIJJ(i8);
                        LJJII = LJJIJ + (size * LJIJJ);
                        i5 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i5 += LJJII;
                case 22:
                    List list3 = (List) unsafe.getObject(t, j);
                    size = list3.size();
                    if (size != 0) {
                        LJJIJ = C90406Zdy.LJJI(list3);
                        LJIJJ = AbstractC90761Zjh.LJIJJ(i8);
                        LJJII = LJJIJ + (size * LJIJJ);
                        i5 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i5 += LJJII;
                case 23:
                    LJJII = C90406Zdy.LJIL(i8, (List) unsafe.getObject(t, j));
                    i5 += LJJII;
                    break;
                case 24:
                    LJJII = C90406Zdy.LJIJJ(i8, (List) unsafe.getObject(t, j));
                    i5 += LJJII;
                    break;
                case 25:
                    int size2 = ((List) unsafe.getObject(t, j)).size();
                    if (size2 != 0) {
                        LJJII = size2 * (AbstractC90761Zjh.LIZ(i8 << 3) + 1);
                        i5 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i5 += LJJII;
                case 26:
                    LJJII = C90406Zdy.LJJIIZ(i8, (List) unsafe.getObject(t, j));
                    i5 += LJJII;
                    break;
                case 27:
                    LJJII = C90406Zdy.LJJIII(i8, (List) unsafe.getObject(t, j), LJIJ(i4));
                    i5 += LJJII;
                    break;
                case 28:
                    LJJII = C90406Zdy.LJIJ(i8, (List) unsafe.getObject(t, j));
                    i5 += LJJII;
                    break;
                case 29:
                    List list4 = (List) unsafe.getObject(t, j);
                    size = list4.size();
                    if (size != 0) {
                        LJJIJ = C90406Zdy.LJJIIZI(list4);
                        LJIJJ = AbstractC90761Zjh.LJIJJ(i8);
                        LJJII = LJJIJ + (size * LJIJJ);
                        i5 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i5 += LJJII;
                case 30:
                    List list5 = (List) unsafe.getObject(t, j);
                    size = list5.size();
                    if (size != 0) {
                        LJJIJ = C90406Zdy.LJIJI(list5);
                        LJIJJ = AbstractC90761Zjh.LJIJJ(i8);
                        LJJII = LJJIJ + (size * LJIJJ);
                        i5 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i5 += LJJII;
                case 31:
                    LJJII = C90406Zdy.LJIJJ(i8, (List) unsafe.getObject(t, j));
                    i5 += LJJII;
                    break;
                case 32:
                    LJJII = C90406Zdy.LJIL(i8, (List) unsafe.getObject(t, j));
                    i5 += LJJII;
                    break;
                case 33:
                    List list6 = (List) unsafe.getObject(t, j);
                    size = list6.size();
                    if (size != 0) {
                        LJJIJ = C90406Zdy.LJJIIJ(list6);
                        LJIJJ = AbstractC90761Zjh.LJIJJ(i8);
                        LJJII = LJJIJ + (size * LJIJJ);
                        i5 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i5 += LJJII;
                case 34:
                    List list7 = (List) unsafe.getObject(t, j);
                    size = list7.size();
                    if (size != 0) {
                        LJJIJ = C90406Zdy.LJJIIJZLJL(list7);
                        LJIJJ = AbstractC90761Zjh.LJIJJ(i8);
                        LJJII = LJJIJ + (size * LJIJJ);
                        i5 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i5 += LJJII;
                case 35:
                    LJIJ = C90406Zdy.LJJ((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    LJIJ = C90406Zdy.LJIJJLI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    LJIJ = C90406Zdy.LJJIFFI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    LJIJ = C90406Zdy.LJJIJ((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    LJIJ = C90406Zdy.LJJI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                    LJIJ = C90406Zdy.LJJ((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    LJIJ = C90406Zdy.LJIJJLI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    LJIJ = ((List) unsafe.getObject(t, j)).size();
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                    LJIJ = C90406Zdy.LJJIIZI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    LJIJ = C90406Zdy.LJIJI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    LJIJ = C90406Zdy.LJIJJLI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    LJIJ = C90406Zdy.LJJ((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    LJIJ = C90406Zdy.LJJIIJ((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                    LJIJ = C90406Zdy.LJJIIJZLJL((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i8);
                        LIZ9 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ9;
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case C61447O9r.LJIIJ:
                    List list8 = (List) unsafe.getObject(t, j);
                    InterfaceC90399Zdr LJIJ2 = LJIJ(i4);
                    int size3 = list8.size();
                    if (size3 != 0) {
                        LJJII = 0;
                        for (int i16 = 0; i16 < size3; i16++) {
                            LJJII += AbstractC90761Zjh.LJIIZILJ(i8, (InterfaceC90712Ziu) ListProtector.get(list8, i16), LJIJ2);
                        }
                        i5 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i5 += LJJII;
                case 50:
                    Object object2 = unsafe.getObject(t, j);
                    int i17 = i4 / 3;
                    C90289Zc5.LIZ(object2, this.LIZIZ[i17 + i17]);
                    break;
                case 51:
                    if (LJIIIIZZ(i8, i4, t)) {
                        LIZ = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ + 8;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (LJIIIIZZ(i8, i4, t)) {
                        LIZ2 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ2 + 4;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (LJIIIIZZ(i8, i4, t)) {
                        long LJIIZILJ = LJIIZILJ(j, t);
                        LIZ3 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LIZIZ = AbstractC90761Zjh.LIZIZ(LJIIZILJ);
                        i5 += LIZ3 + LIZIZ;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (LJIIIIZZ(i8, i4, t)) {
                        long LJIIZILJ2 = LJIIZILJ(j, t);
                        LIZ3 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LIZIZ = AbstractC90761Zjh.LIZIZ(LJIIZILJ2);
                        i5 += LIZ3 + LIZIZ;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (LJIIIIZZ(i8, i4, t)) {
                        int LJIILL = LJIILL(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJIJ = AbstractC90761Zjh.LJIJ(LJIILL);
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (LJIIIIZZ(i8, i4, t)) {
                        LIZ = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ + 8;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (LJIIIIZZ(i8, i4, t)) {
                        LIZ2 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ2 + 4;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (LJIIIIZZ(i8, i4, t)) {
                        LIZ5 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ5 + 1;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!LJIIIIZZ(i8, i4, t)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(t, j);
                        if (object3 instanceof AbstractC90364ZdI) {
                            LIZ6 = AbstractC90761Zjh.LIZ(i8 << 3);
                            zzd = ((AbstractC90364ZdI) object3).zzd();
                            LIZ7 = AbstractC90761Zjh.LIZ(zzd);
                            i2 = LIZ6 + LIZ7 + zzd;
                            i5 += i2;
                            break;
                        } else {
                            LIZ4 = AbstractC90761Zjh.LIZ(i8 << 3);
                            LJIJ = AbstractC90761Zjh.LJIJI((String) object3);
                            i2 = LIZ4 + LJIJ;
                            i5 += i2;
                        }
                    }
                case 60:
                    if (LJIIIIZZ(i8, i4, t)) {
                        LJJII = C90406Zdy.LJJII(i8, LJIJ(i4), unsafe.getObject(t, j));
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (LJIIIIZZ(i8, i4, t)) {
                        AbstractC90364ZdI abstractC90364ZdI2 = (AbstractC90364ZdI) unsafe.getObject(t, j);
                        LIZ6 = AbstractC90761Zjh.LIZ(i8 << 3);
                        zzd = abstractC90364ZdI2.zzd();
                        LIZ7 = AbstractC90761Zjh.LIZ(zzd);
                        i2 = LIZ6 + LIZ7 + zzd;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case BaseNotice.CREATOR /* 62 */:
                    if (LJIIIIZZ(i8, i4, t)) {
                        int LJIILL2 = LJIILL(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJIJ = AbstractC90761Zjh.LIZ(LJIILL2);
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (LJIIIIZZ(i8, i4, t)) {
                        int LJIILL3 = LJIILL(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJIJ = AbstractC90761Zjh.LJIJ(LJIILL3);
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (LJIIIIZZ(i8, i4, t)) {
                        LIZ2 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ2 + 4;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (LJIIIIZZ(i8, i4, t)) {
                        LIZ = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJJII = LIZ + 8;
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (LJIIIIZZ(i8, i4, t)) {
                        int LJIILL4 = LJIILL(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LJIJ = AbstractC90761Zjh.LIZ((LJIILL4 >> 31) ^ (LJIILL4 + LJIILL4));
                        i2 = LIZ4 + LJIJ;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (LJIIIIZZ(i8, i4, t)) {
                        long LJIIZILJ3 = LJIIZILJ(j, t);
                        LIZ8 = AbstractC90761Zjh.LIZ(i8 << 3);
                        LIZIZ2 = AbstractC90761Zjh.LIZIZ((LJIIZILJ3 >> 63) ^ (LJIIZILJ3 + LJIIZILJ3));
                        i5 += LIZ8 + LIZIZ2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (LJIIIIZZ(i8, i4, t)) {
                        LJJII = AbstractC90761Zjh.LJIIZILJ(i8, (InterfaceC90712Ziu) unsafe.getObject(t, j), LJIJ(i4));
                        i5 += LJJII;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            i3 = 1048575;
        }
        AbstractC90306ZcM<?, ?> abstractC90306ZcM = this.LJIIIZ;
        int LIZ10 = i5 + abstractC90306ZcM.LIZ(abstractC90306ZcM.LIZJ(t));
        if (!this.LIZLLL) {
            return LIZ10;
        }
        this.LJIIJ.LIZ(t);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002a. Please report as an issue. */
    public final int LJIILJJIL(T t) {
        int LIZ;
        int LIZ2;
        int LIZ3;
        int LIZIZ;
        int LIZ4;
        int LJIJ;
        int LIZ5;
        int LIZ6;
        int zzd;
        int LIZ7;
        int LJJII;
        int size;
        int LJJIJ;
        int LJIJJ;
        int LJIJJ2;
        int LIZ8;
        int i;
        Unsafe unsafe = LJIIL;
        int i2 = 0;
        for (int i3 = 0; i3 < this.LIZ.length; i3 += 3) {
            int LJIILLIIL = LJIILLIIL(i3);
            int i4 = (LJIILLIIL >>> 20) & 255;
            int i5 = this.LIZ[i3];
            long j = LJIILLIIL & 1048575;
            if (i4 >= EnumC90275Zbr.zzJ.zza()) {
                EnumC90275Zbr.zzW.zza();
            }
            switch (i4) {
                case 0:
                    if (LJII(i3, t)) {
                        LIZ = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ + 8;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (LJII(i3, t)) {
                        LIZ2 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ2 + 4;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (LJII(i3, t)) {
                        long LJII = C90376ZdU.LJII(j, t);
                        LIZ3 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LIZIZ = AbstractC90761Zjh.LIZIZ(LJII);
                        i2 += LIZ3 + LIZIZ;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (LJII(i3, t)) {
                        long LJII2 = C90376ZdU.LJII(j, t);
                        LIZ3 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LIZIZ = AbstractC90761Zjh.LIZIZ(LJII2);
                        i2 += LIZ3 + LIZIZ;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (LJII(i3, t)) {
                        int LJI = C90376ZdU.LJI(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJIJ = AbstractC90761Zjh.LJIJ(LJI);
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (LJII(i3, t)) {
                        LIZ = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ + 8;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (LJII(i3, t)) {
                        LIZ2 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ2 + 4;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (LJII(i3, t)) {
                        LIZ5 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ5 + 1;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!LJII(i3, t)) {
                        break;
                    } else {
                        Object LJIIIZ = C90376ZdU.LJIIIZ(j, t);
                        if (LJIIIZ instanceof AbstractC90364ZdI) {
                            LIZ6 = AbstractC90761Zjh.LIZ(i5 << 3);
                            zzd = ((AbstractC90364ZdI) LJIIIZ).zzd();
                            LIZ7 = AbstractC90761Zjh.LIZ(zzd);
                            i = LIZ6 + LIZ7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            LIZ4 = AbstractC90761Zjh.LIZ(i5 << 3);
                            LJIJ = AbstractC90761Zjh.LJIJI((String) LJIIIZ);
                            i = LIZ4 + LJIJ;
                            i2 += i;
                        }
                    }
                case 9:
                    if (LJII(i3, t)) {
                        LJJII = C90406Zdy.LJJII(i5, LJIJ(i3), C90376ZdU.LJIIIZ(j, t));
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (LJII(i3, t)) {
                        AbstractC90364ZdI abstractC90364ZdI = (AbstractC90364ZdI) C90376ZdU.LJIIIZ(j, t);
                        LIZ6 = AbstractC90761Zjh.LIZ(i5 << 3);
                        zzd = abstractC90364ZdI.zzd();
                        LIZ7 = AbstractC90761Zjh.LIZ(zzd);
                        i = LIZ6 + LIZ7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    if (LJII(i3, t)) {
                        int LJI2 = C90376ZdU.LJI(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJIJ = AbstractC90761Zjh.LIZ(LJI2);
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (LJII(i3, t)) {
                        int LJI3 = C90376ZdU.LJI(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJIJ = AbstractC90761Zjh.LJIJ(LJI3);
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    if (LJII(i3, t)) {
                        LIZ2 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ2 + 4;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (LJII(i3, t)) {
                        LIZ = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ + 8;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (LJII(i3, t)) {
                        int LJI4 = C90376ZdU.LJI(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJIJ = AbstractC90761Zjh.LIZ((LJI4 >> 31) ^ (LJI4 + LJI4));
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    if (LJII(i3, t)) {
                        long LJII3 = C90376ZdU.LJII(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJIJ = AbstractC90761Zjh.LIZIZ((LJII3 >> 63) ^ (LJII3 + LJII3));
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (LJII(i3, t)) {
                        LJJII = AbstractC90761Zjh.LJIIZILJ(i5, (InterfaceC90712Ziu) C90376ZdU.LJIIIZ(j, t), LJIJ(i3));
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    LJJII = C90406Zdy.LJIL(i5, (List) C90376ZdU.LJIIIZ(j, t));
                    i2 += LJJII;
                    break;
                case 19:
                    LJJII = C90406Zdy.LJIJJ(i5, (List) C90376ZdU.LJIIIZ(j, t));
                    i2 += LJJII;
                    break;
                case 20:
                    List list = (List) C90376ZdU.LJIIIZ(j, t);
                    if (list.size() != 0) {
                        LJJII = C90406Zdy.LJJIFFI(list) + (list.size() * AbstractC90761Zjh.LJIJJ(i5));
                        i2 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i2 += LJJII;
                case 21:
                    List list2 = (List) C90376ZdU.LJIIIZ(j, t);
                    size = list2.size();
                    if (size != 0) {
                        LJJIJ = C90406Zdy.LJJIJ(list2);
                        LJIJJ = AbstractC90761Zjh.LJIJJ(i5);
                        LJJII = LJJIJ + (size * LJIJJ);
                        i2 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i2 += LJJII;
                case 22:
                    List list3 = (List) C90376ZdU.LJIIIZ(j, t);
                    size = list3.size();
                    if (size != 0) {
                        LJJIJ = C90406Zdy.LJJI(list3);
                        LJIJJ = AbstractC90761Zjh.LJIJJ(i5);
                        LJJII = LJJIJ + (size * LJIJJ);
                        i2 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i2 += LJJII;
                case 23:
                    LJJII = C90406Zdy.LJIL(i5, (List) C90376ZdU.LJIIIZ(j, t));
                    i2 += LJJII;
                    break;
                case 24:
                    LJJII = C90406Zdy.LJIJJ(i5, (List) C90376ZdU.LJIIIZ(j, t));
                    i2 += LJJII;
                    break;
                case 25:
                    int size2 = ((List) C90376ZdU.LJIIIZ(j, t)).size();
                    if (size2 != 0) {
                        LJJII = size2 * (AbstractC90761Zjh.LIZ(i5 << 3) + 1);
                        i2 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i2 += LJJII;
                case 26:
                    LJJII = C90406Zdy.LJJIIZ(i5, (List) C90376ZdU.LJIIIZ(j, t));
                    i2 += LJJII;
                    break;
                case 27:
                    LJJII = C90406Zdy.LJJIII(i5, (List) C90376ZdU.LJIIIZ(j, t), LJIJ(i3));
                    i2 += LJJII;
                    break;
                case 28:
                    LJJII = C90406Zdy.LJIJ(i5, (List) C90376ZdU.LJIIIZ(j, t));
                    i2 += LJJII;
                    break;
                case 29:
                    List list4 = (List) C90376ZdU.LJIIIZ(j, t);
                    size = list4.size();
                    if (size != 0) {
                        LJJIJ = C90406Zdy.LJJIIZI(list4);
                        LJIJJ = AbstractC90761Zjh.LJIJJ(i5);
                        LJJII = LJJIJ + (size * LJIJJ);
                        i2 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i2 += LJJII;
                case 30:
                    List list5 = (List) C90376ZdU.LJIIIZ(j, t);
                    size = list5.size();
                    if (size != 0) {
                        LJJIJ = C90406Zdy.LJIJI(list5);
                        LJIJJ = AbstractC90761Zjh.LJIJJ(i5);
                        LJJII = LJJIJ + (size * LJIJJ);
                        i2 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i2 += LJJII;
                case 31:
                    LJJII = C90406Zdy.LJIJJ(i5, (List) C90376ZdU.LJIIIZ(j, t));
                    i2 += LJJII;
                    break;
                case 32:
                    LJJII = C90406Zdy.LJIL(i5, (List) C90376ZdU.LJIIIZ(j, t));
                    i2 += LJJII;
                    break;
                case 33:
                    List list6 = (List) C90376ZdU.LJIIIZ(j, t);
                    size = list6.size();
                    if (size != 0) {
                        LJJIJ = C90406Zdy.LJJIIJ(list6);
                        LJIJJ = AbstractC90761Zjh.LJIJJ(i5);
                        LJJII = LJJIJ + (size * LJIJJ);
                        i2 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i2 += LJJII;
                case 34:
                    List list7 = (List) C90376ZdU.LJIIIZ(j, t);
                    size = list7.size();
                    if (size != 0) {
                        LJJIJ = C90406Zdy.LJJIIJZLJL(list7);
                        LJIJJ = AbstractC90761Zjh.LJIJJ(i5);
                        LJJII = LJJIJ + (size * LJIJJ);
                        i2 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i2 += LJJII;
                case 35:
                    LJIJ = C90406Zdy.LJJ((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    LJIJ = C90406Zdy.LJIJJLI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    LJIJ = C90406Zdy.LJJIFFI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    LJIJ = C90406Zdy.LJJIJ((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    LJIJ = C90406Zdy.LJJI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                    LJIJ = C90406Zdy.LJJ((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    LJIJ = C90406Zdy.LJIJJLI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    LJIJ = ((List) unsafe.getObject(t, j)).size();
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                    LJIJ = C90406Zdy.LJJIIZI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    LJIJ = C90406Zdy.LJIJI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    LJIJ = C90406Zdy.LJIJJLI((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    LJIJ = C90406Zdy.LJJ((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    LJIJ = C90406Zdy.LJJIIJ((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                    LJIJ = C90406Zdy.LJJIIJZLJL((List) unsafe.getObject(t, j));
                    if (LJIJ > 0) {
                        LJIJJ2 = AbstractC90761Zjh.LJIJJ(i5);
                        LIZ8 = AbstractC90761Zjh.LIZ(LJIJ);
                        LIZ4 = LJIJJ2 + LIZ8;
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case C61447O9r.LJIIJ:
                    List list8 = (List) C90376ZdU.LJIIIZ(j, t);
                    InterfaceC90399Zdr LJIJ2 = LJIJ(i3);
                    int size3 = list8.size();
                    if (size3 != 0) {
                        LJJII = 0;
                        for (int i6 = 0; i6 < size3; i6++) {
                            LJJII += AbstractC90761Zjh.LJIIZILJ(i5, (InterfaceC90712Ziu) ListProtector.get(list8, i6), LJIJ2);
                        }
                        i2 += LJJII;
                        break;
                    }
                    LJJII = 0;
                    i2 += LJJII;
                case 50:
                    Object LJIIIZ2 = C90376ZdU.LJIIIZ(j, t);
                    int i7 = i3 / 3;
                    C90289Zc5.LIZ(LJIIIZ2, this.LIZIZ[i7 + i7]);
                    break;
                case 51:
                    if (LJIIIIZZ(i5, i3, t)) {
                        LIZ = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ + 8;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (LJIIIIZZ(i5, i3, t)) {
                        LIZ2 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ2 + 4;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (LJIIIIZZ(i5, i3, t)) {
                        long LJIIZILJ = LJIIZILJ(j, t);
                        LIZ3 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LIZIZ = AbstractC90761Zjh.LIZIZ(LJIIZILJ);
                        i2 += LIZ3 + LIZIZ;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (LJIIIIZZ(i5, i3, t)) {
                        long LJIIZILJ2 = LJIIZILJ(j, t);
                        LIZ3 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LIZIZ = AbstractC90761Zjh.LIZIZ(LJIIZILJ2);
                        i2 += LIZ3 + LIZIZ;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (LJIIIIZZ(i5, i3, t)) {
                        int LJIILL = LJIILL(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJIJ = AbstractC90761Zjh.LJIJ(LJIILL);
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (LJIIIIZZ(i5, i3, t)) {
                        LIZ = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ + 8;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (LJIIIIZZ(i5, i3, t)) {
                        LIZ2 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ2 + 4;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (LJIIIIZZ(i5, i3, t)) {
                        LIZ5 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ5 + 1;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!LJIIIIZZ(i5, i3, t)) {
                        break;
                    } else {
                        Object LJIIIZ3 = C90376ZdU.LJIIIZ(j, t);
                        if (LJIIIZ3 instanceof AbstractC90364ZdI) {
                            LIZ6 = AbstractC90761Zjh.LIZ(i5 << 3);
                            zzd = ((AbstractC90364ZdI) LJIIIZ3).zzd();
                            LIZ7 = AbstractC90761Zjh.LIZ(zzd);
                            i = LIZ6 + LIZ7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            LIZ4 = AbstractC90761Zjh.LIZ(i5 << 3);
                            LJIJ = AbstractC90761Zjh.LJIJI((String) LJIIIZ3);
                            i = LIZ4 + LJIJ;
                            i2 += i;
                        }
                    }
                case 60:
                    if (LJIIIIZZ(i5, i3, t)) {
                        LJJII = C90406Zdy.LJJII(i5, LJIJ(i3), C90376ZdU.LJIIIZ(j, t));
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (LJIIIIZZ(i5, i3, t)) {
                        AbstractC90364ZdI abstractC90364ZdI2 = (AbstractC90364ZdI) C90376ZdU.LJIIIZ(j, t);
                        LIZ6 = AbstractC90761Zjh.LIZ(i5 << 3);
                        zzd = abstractC90364ZdI2.zzd();
                        LIZ7 = AbstractC90761Zjh.LIZ(zzd);
                        i = LIZ6 + LIZ7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case BaseNotice.CREATOR /* 62 */:
                    if (LJIIIIZZ(i5, i3, t)) {
                        int LJIILL2 = LJIILL(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJIJ = AbstractC90761Zjh.LIZ(LJIILL2);
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (LJIIIIZZ(i5, i3, t)) {
                        int LJIILL3 = LJIILL(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJIJ = AbstractC90761Zjh.LJIJ(LJIILL3);
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (LJIIIIZZ(i5, i3, t)) {
                        LIZ2 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ2 + 4;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (LJIIIIZZ(i5, i3, t)) {
                        LIZ = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJJII = LIZ + 8;
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (LJIIIIZZ(i5, i3, t)) {
                        int LJIILL4 = LJIILL(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJIJ = AbstractC90761Zjh.LIZ((LJIILL4 >> 31) ^ (LJIILL4 + LJIILL4));
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (LJIIIIZZ(i5, i3, t)) {
                        long LJIIZILJ3 = LJIIZILJ(j, t);
                        LIZ4 = AbstractC90761Zjh.LIZ(i5 << 3);
                        LJIJ = AbstractC90761Zjh.LIZIZ((LJIIZILJ3 >> 63) ^ (LJIIZILJ3 + LJIIZILJ3));
                        i = LIZ4 + LJIJ;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (LJIIIIZZ(i5, i3, t)) {
                        LJJII = AbstractC90761Zjh.LJIIZILJ(i5, (InterfaceC90712Ziu) C90376ZdU.LJIIIZ(j, t), LJIJ(i3));
                        i2 += LJJII;
                        break;
                    } else {
                        break;
                    }
            }
        }
        AbstractC90306ZcM<?, ?> abstractC90306ZcM = this.LJIIIZ;
        return i2 + abstractC90306ZcM.LIZ(abstractC90306ZcM.LIZJ(t));
    }

    public final int LJIILLIIL(int i) {
        return this.LIZ[i + 1];
    }

    public final InterfaceC90399Zdr LJIJ(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.LIZIZ;
        InterfaceC90399Zdr interfaceC90399Zdr = (InterfaceC90399Zdr) objArr[i3];
        if (interfaceC90399Zdr != null) {
            return interfaceC90399Zdr;
        }
        InterfaceC90399Zdr<T> LIZ = C90375ZdT.LIZJ.LIZ((Class) objArr[i3 + 1]);
        this.LIZIZ[i3] = LIZ;
        return LIZ;
    }

    public static int LJIILL(long j, Object obj) {
        return ((Integer) C90376ZdU.LJIIIZ(j, obj)).intValue();
    }

    public static long LJIIZILJ(long j, Object obj) {
        return ((Long) C90376ZdU.LJIIIZ(j, obj)).longValue();
    }

    public static Field LJIJI(Class<?> cls, String str) {
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
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // X.InterfaceC90399Zdr
    public final void LIZLLL(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.LIZ.length; i += 3) {
            int LJIILLIIL = LJIILLIIL(i);
            long j = 1048575 & LJIILLIIL;
            int i2 = this.LIZ[i];
            switch ((LJIILLIIL >>> 20) & 255) {
                case 0:
                    if (LJII(i, t2)) {
                        C90376ZdU.LIZJ.LJ(t, j, C90376ZdU.LJ(j, t2));
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (LJII(i, t2)) {
                        C90376ZdU.LIZJ.LJFF(t, j, C90376ZdU.LJFF(j, t2));
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (LJII(i, t2)) {
                        C90376ZdU.LIZJ.LJIILJJIL(j, t, C90376ZdU.LJII(j, t2));
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (LJII(i, t2)) {
                        C90376ZdU.LIZJ.LJIILJJIL(j, t, C90376ZdU.LJII(j, t2));
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (LJII(i, t2)) {
                        C90376ZdU.LJIIL(j, C90376ZdU.LJI(j, t2), t);
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (LJII(i, t2)) {
                        C90376ZdU.LIZJ.LJIILJJIL(j, t, C90376ZdU.LJII(j, t2));
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (LJII(i, t2)) {
                        C90376ZdU.LJIIL(j, C90376ZdU.LJI(j, t2), t);
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (LJII(i, t2)) {
                        C90376ZdU.LIZJ.LIZJ(j, t, C90376ZdU.LJIILL(j, t2));
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (LJII(i, t2)) {
                        C90376ZdU.LJIILIIL(j, t, C90376ZdU.LJIIIZ(j, t2));
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    LJIJJ(i, t, t2);
                    break;
                case 10:
                    if (LJII(i, t2)) {
                        C90376ZdU.LJIILIIL(j, t, C90376ZdU.LJIIIZ(j, t2));
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    if (LJII(i, t2)) {
                        C90376ZdU.LJIIL(j, C90376ZdU.LJI(j, t2), t);
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (LJII(i, t2)) {
                        C90376ZdU.LJIIL(j, C90376ZdU.LJI(j, t2), t);
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    if (LJII(i, t2)) {
                        C90376ZdU.LJIIL(j, C90376ZdU.LJI(j, t2), t);
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (LJII(i, t2)) {
                        C90376ZdU.LIZJ.LJIILJJIL(j, t, C90376ZdU.LJII(j, t2));
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (LJII(i, t2)) {
                        C90376ZdU.LJIIL(j, C90376ZdU.LJI(j, t2), t);
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    if (LJII(i, t2)) {
                        C90376ZdU.LIZJ.LJIILJJIL(j, t, C90376ZdU.LJII(j, t2));
                        LJIL(i, t);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    LJIJJ(i, t, t2);
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
                    this.LJIIIIZZ.LIZIZ(j, t, t2);
                    break;
                case 50:
                    C90283Zbz c90283Zbz = (C90283Zbz) C90376ZdU.LJIIIZ(j, t);
                    C90283Zbz c90283Zbz2 = (C90283Zbz) C90376ZdU.LJIIIZ(j, t2);
                    if (!c90283Zbz2.isEmpty()) {
                        if (!c90283Zbz.zzd()) {
                            c90283Zbz = c90283Zbz.zza();
                        }
                        c90283Zbz.zzc(c90283Zbz2);
                    }
                    C90376ZdU.LJIILIIL(j, t, c90283Zbz);
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
                    if (LJIIIIZZ(i2, i, t2)) {
                        C90376ZdU.LJIILIIL(j, t, C90376ZdU.LJIIIZ(j, t2));
                        LJJ(i2, i, t);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    LJIJJLI(i, t, t2);
                    break;
                case 61:
                case BaseNotice.CREATOR /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (LJIIIIZZ(i2, i, t2)) {
                        C90376ZdU.LJIILIIL(j, t, C90376ZdU.LJIIIZ(j, t2));
                        LJJ(i2, i, t);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    LJIJJLI(i, t, t2);
                    break;
            }
        }
        AbstractC90306ZcM<?, ?> abstractC90306ZcM = this.LJIIIZ;
        abstractC90306ZcM.LJFF(t, abstractC90306ZcM.LIZLLL(abstractC90306ZcM.LIZJ(t), abstractC90306ZcM.LIZJ(t2)));
        if (!this.LIZLLL) {
            return;
        }
        this.LJIIJ.LIZ(t2);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0018 A[SYNTHETIC] */
    @Override // X.InterfaceC90399Zdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90726Zj8.LJFF(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // X.InterfaceC90399Zdr
    public final void LJI(T t, C90405Zdx c90405Zdx) {
        if (this.LJ) {
            if (!this.LIZLLL) {
                int length = this.LIZ.length;
                for (int i = 0; i < length; i += 3) {
                    int LJIILLIIL = LJIILLIIL(i);
                    int i2 = this.LIZ[i];
                    switch ((LJIILLIIL >>> 20) & 255) {
                        case 0:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ.LJII(i2, Double.doubleToRawLongBits(C90376ZdU.LJ(LJIILLIIL & 1048575, t)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ.LJFF(i2, Float.floatToRawIntBits(C90376ZdU.LJFF(LJIILLIIL & 1048575, t)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ.LJIILL(i2, C90376ZdU.LJII(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ.LJIILL(i2, C90376ZdU.LJII(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ.LJIIIZ(i2, C90376ZdU.LJI(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ.LJII(i2, C90376ZdU.LJII(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ.LJFF(i2, C90376ZdU.LJI(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ.LIZLLL(i2, C90376ZdU.LJIILL(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (LJII(i, t)) {
                                LJIIJ(i2, C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZIZ(i2, LJIJ(i), C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ.LJ(i2, (AbstractC90364ZdI) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ.LJIILIIL(i2, C90376ZdU.LJI(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ.LJIIIZ(i2, C90376ZdU.LJI(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ.LJFF(i2, C90376ZdU.LJI(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ.LJII(i2, C90376ZdU.LJII(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (LJII(i, t)) {
                                int LJI = C90376ZdU.LJI(LJIILLIIL & 1048575, t);
                                c90405Zdx.LIZ.LJIILIIL(i2, (LJI >> 31) ^ (LJI + LJI));
                                break;
                            } else {
                                break;
                            }
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            if (LJII(i, t)) {
                                long LJII = C90376ZdU.LJII(LJIILLIIL & 1048575, t);
                                c90405Zdx.LIZ.LJIILL(i2, (LJII >> 63) ^ (LJII + LJII));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (LJII(i, t)) {
                                c90405Zdx.LIZ(i2, LJIJ(i), C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            C90406Zdy.LIZLLL(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 19:
                            C90406Zdy.LJII(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 20:
                            C90406Zdy.LJIIIZ(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 21:
                            C90406Zdy.LJIILLIIL(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 22:
                            C90406Zdy.LJIIIIZZ(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 23:
                            C90406Zdy.LJI(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 24:
                            C90406Zdy.LJFF(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 25:
                            C90406Zdy.LIZIZ(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 26:
                            C90406Zdy.LJIILJJIL(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx);
                            break;
                        case 27:
                            List list = (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t);
                            InterfaceC90399Zdr LJIJ = LJIJ(i);
                            if (list != null && !list.isEmpty()) {
                                for (int i3 = 0; i3 < list.size(); i3++) {
                                    c90405Zdx.LIZIZ(i2, LJIJ, ListProtector.get(list, i3));
                                }
                                break;
                            }
                            break;
                        case 28:
                            C90406Zdy.LIZJ(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx);
                            break;
                        case 29:
                            C90406Zdy.LJIILL(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 30:
                            C90406Zdy.LJ(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 31:
                            C90406Zdy.LJIIJ(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 32:
                            C90406Zdy.LJIIJJI(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 33:
                            C90406Zdy.LJIIL(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 34:
                            C90406Zdy.LJIILIIL(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, false);
                            break;
                        case 35:
                            C90406Zdy.LIZLLL(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case 36:
                            C90406Zdy.LJII(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case 37:
                            C90406Zdy.LJIIIZ(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case 38:
                            C90406Zdy.LJIILLIIL(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case 39:
                            C90406Zdy.LJIIIIZZ(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                            C90406Zdy.LJI(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case 41:
                            C90406Zdy.LJFF(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case 42:
                            C90406Zdy.LIZIZ(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                            C90406Zdy.LJIILL(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case 44:
                            C90406Zdy.LJ(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case 45:
                            C90406Zdy.LJIIJ(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case 46:
                            C90406Zdy.LJIIJJI(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case 47:
                            C90406Zdy.LJIIL(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                            C90406Zdy.LJIILIIL(i2, (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx, true);
                            break;
                        case C61447O9r.LJIIJ:
                            List list2 = (List) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t);
                            InterfaceC90399Zdr LJIJ2 = LJIJ(i);
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i4 = 0; i4 < list2.size(); i4++) {
                                    c90405Zdx.LIZ(i2, LJIJ2, ListProtector.get(list2, i4));
                                }
                                break;
                            }
                            break;
                        case 50:
                            if (C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t) != null) {
                                throw null;
                            }
                            break;
                        case 51:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ.LJII(i2, Double.doubleToRawLongBits(((Double) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t)).doubleValue()));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ.LJFF(i2, Float.floatToRawIntBits(((Float) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t)).floatValue()));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ.LJIILL(i2, LJIIZILJ(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ.LJIILL(i2, LJIIZILJ(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ.LJIIIZ(i2, LJIILL(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ.LJII(i2, LJIIZILJ(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ.LJFF(i2, LJIILL(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ.LIZLLL(i2, ((Boolean) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t)).booleanValue());
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (LJIIIIZZ(i2, i, t)) {
                                LJIIJ(i2, C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t), c90405Zdx);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZIZ(i2, LJIJ(i), C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ.LJ(i2, (AbstractC90364ZdI) C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case BaseNotice.CREATOR /* 62 */:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ.LJIILIIL(i2, LJIILL(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ.LJIIIZ(i2, LJIILL(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ.LJFF(i2, LJIILL(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ.LJII(i2, LJIIZILJ(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (LJIIIIZZ(i2, i, t)) {
                                int LJIILL = LJIILL(LJIILLIIL & 1048575, t);
                                c90405Zdx.LIZ.LJIILIIL(i2, (LJIILL >> 31) ^ (LJIILL + LJIILL));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (LJIIIIZZ(i2, i, t)) {
                                long LJIIZILJ = LJIIZILJ(LJIILLIIL & 1048575, t);
                                c90405Zdx.LIZ.LJIILL(i2, (LJIIZILJ >> 63) ^ (LJIIZILJ + LJIIZILJ));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (LJIIIIZZ(i2, i, t)) {
                                c90405Zdx.LIZ(i2, LJIJ(i), C90376ZdU.LJIIIZ(LJIILLIIL & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                AbstractC90306ZcM<?, ?> abstractC90306ZcM = this.LJIIIZ;
                abstractC90306ZcM.LIZJ(t);
                abstractC90306ZcM.LJI();
                return;
            }
            this.LJIIJ.LIZ(t);
            throw null;
        }
        LJIIIZ(t, c90405Zdx);
    }

    public final boolean LJII(int i, Object obj) {
        int i2 = this.LIZ[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int LJIILLIIL = LJIILLIIL(i);
            long j2 = LJIILLIIL & 1048575;
            switch ((LJIILLIIL >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(C90376ZdU.LJ(j2, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C90376ZdU.LJFF(j2, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C90376ZdU.LJII(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C90376ZdU.LJII(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C90376ZdU.LJI(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C90376ZdU.LJII(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C90376ZdU.LJI(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C90376ZdU.LJIILL(j2, obj);
                case 8:
                    Object LJIIIZ = C90376ZdU.LJIIIZ(j2, obj);
                    if (LJIIIZ instanceof String) {
                        if (((String) LJIIIZ).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (LJIIIZ instanceof AbstractC90364ZdI) {
                        if (AbstractC90364ZdI.zzb.equals(LJIIIZ)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C90376ZdU.LJIIIZ(j2, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC90364ZdI.zzb.equals(C90376ZdU.LJIIIZ(j2, obj))) {
                        return false;
                    }
                    return true;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    if (C90376ZdU.LJI(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C90376ZdU.LJI(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    if (C90376ZdU.LJI(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C90376ZdU.LJII(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C90376ZdU.LJI(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    if (C90376ZdU.LJII(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C90376ZdU.LJIIIZ(j2, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((C90376ZdU.LJI(j, obj) & (1 << (i2 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    public final void LJIIIZ(T t, C90405Zdx c90405Zdx) {
        int i;
        if (!this.LIZLLL) {
            int length = this.LIZ.length;
            Unsafe unsafe = LJIIL;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 1048575;
            int i5 = 0;
            while (i3 < length) {
                int LJIILLIIL = LJIILLIIL(i3);
                int[] iArr = this.LIZ;
                int i6 = iArr[i3];
                int i7 = (LJIILLIIL >>> 20) & 255;
                if (i7 <= 17) {
                    int i8 = iArr[i3 + 2];
                    int i9 = i8 & i2;
                    if (i9 != i4) {
                        i5 = unsafe.getInt(t, i9);
                        i4 = i9;
                    }
                    i = 1 << (i8 >>> 20);
                } else {
                    i = 0;
                }
                long j = LJIILLIIL & i2;
                switch (i7) {
                    case 0:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ.LJII(i6, Double.doubleToRawLongBits(C90376ZdU.LJ(j, t)));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ.LJFF(i6, Float.floatToRawIntBits(C90376ZdU.LJFF(j, t)));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ.LJIILL(i6, unsafe.getLong(t, j));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ.LJIILL(i6, unsafe.getLong(t, j));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ.LJIIIZ(i6, unsafe.getInt(t, j));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ.LJII(i6, unsafe.getLong(t, j));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ.LJFF(i6, unsafe.getInt(t, j));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ.LIZLLL(i6, C90376ZdU.LJIILL(j, t));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if ((i5 & i) != 0) {
                            LJIIJ(i6, unsafe.getObject(t, j), c90405Zdx);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZIZ(i6, LJIJ(i3), unsafe.getObject(t, j));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ.LJ(i6, (AbstractC90364ZdI) unsafe.getObject(t, j));
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ.LJIILIIL(i6, unsafe.getInt(t, j));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ.LJIIIZ(i6, unsafe.getInt(t, j));
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ.LJFF(i6, unsafe.getInt(t, j));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ.LJII(i6, unsafe.getLong(t, j));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if ((i5 & i) != 0) {
                            int i10 = unsafe.getInt(t, j);
                            c90405Zdx.LIZ.LJIILIIL(i6, (i10 >> 31) ^ (i10 + i10));
                            break;
                        } else {
                            break;
                        }
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        if ((i & i5) != 0) {
                            long j2 = unsafe.getLong(t, j);
                            c90405Zdx.LIZ.LJIILL(i6, (j2 >> 63) ^ (j2 + j2));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if ((i5 & i) != 0) {
                            c90405Zdx.LIZ(i6, LJIJ(i3), unsafe.getObject(t, j));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        C90406Zdy.LIZLLL(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 19:
                        C90406Zdy.LJII(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 20:
                        C90406Zdy.LJIIIZ(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 21:
                        C90406Zdy.LJIILLIIL(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 22:
                        C90406Zdy.LJIIIIZZ(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 23:
                        C90406Zdy.LJI(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 24:
                        C90406Zdy.LJFF(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 25:
                        C90406Zdy.LIZIZ(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 26:
                        C90406Zdy.LJIILJJIL(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx);
                        break;
                    case 27:
                        int i11 = this.LIZ[i3];
                        List list = (List) unsafe.getObject(t, j);
                        InterfaceC90399Zdr LJIJ = LJIJ(i3);
                        if (list != null && !list.isEmpty()) {
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                c90405Zdx.LIZIZ(i11, LJIJ, ListProtector.get(list, i12));
                            }
                            break;
                        }
                        break;
                    case 28:
                        C90406Zdy.LIZJ(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx);
                        break;
                    case 29:
                        C90406Zdy.LJIILL(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 30:
                        C90406Zdy.LJ(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 31:
                        C90406Zdy.LJIIJ(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 32:
                        C90406Zdy.LJIIJJI(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 33:
                        C90406Zdy.LJIIL(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 34:
                        C90406Zdy.LJIILIIL(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, false);
                        break;
                    case 35:
                        C90406Zdy.LIZLLL(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case 36:
                        C90406Zdy.LJII(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case 37:
                        C90406Zdy.LJIIIZ(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case 38:
                        C90406Zdy.LJIILLIIL(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case 39:
                        C90406Zdy.LJIIIIZZ(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                        C90406Zdy.LJI(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case 41:
                        C90406Zdy.LJFF(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case 42:
                        C90406Zdy.LIZIZ(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                        C90406Zdy.LJIILL(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case 44:
                        C90406Zdy.LJ(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case 45:
                        C90406Zdy.LJIIJ(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case 46:
                        C90406Zdy.LJIIJJI(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case 47:
                        C90406Zdy.LJIIL(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                        C90406Zdy.LJIILIIL(this.LIZ[i3], (List) unsafe.getObject(t, j), c90405Zdx, true);
                        break;
                    case C61447O9r.LJIIJ:
                        int i13 = this.LIZ[i3];
                        List list2 = (List) unsafe.getObject(t, j);
                        InterfaceC90399Zdr LJIJ2 = LJIJ(i3);
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i14 = 0; i14 < list2.size(); i14++) {
                                c90405Zdx.LIZ(i13, LJIJ2, ListProtector.get(list2, i14));
                            }
                            break;
                        }
                        break;
                    case 50:
                        if (unsafe.getObject(t, j) != null) {
                            throw null;
                        }
                        break;
                    case 51:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ.LJII(i6, Double.doubleToRawLongBits(((Double) C90376ZdU.LJIIIZ(j, t)).doubleValue()));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ.LJFF(i6, Float.floatToRawIntBits(((Float) C90376ZdU.LJIIIZ(j, t)).floatValue()));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ.LJIILL(i6, LJIIZILJ(j, t));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ.LJIILL(i6, LJIIZILJ(j, t));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ.LJIIIZ(i6, LJIILL(j, t));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ.LJII(i6, LJIIZILJ(j, t));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ.LJFF(i6, LJIILL(j, t));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ.LIZLLL(i6, ((Boolean) C90376ZdU.LJIIIZ(j, t)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (LJIIIIZZ(i6, i3, t)) {
                            LJIIJ(i6, unsafe.getObject(t, j), c90405Zdx);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZIZ(i6, LJIJ(i3), unsafe.getObject(t, j));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ.LJ(i6, (AbstractC90364ZdI) unsafe.getObject(t, j));
                            break;
                        } else {
                            break;
                        }
                    case BaseNotice.CREATOR /* 62 */:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ.LJIILIIL(i6, LJIILL(j, t));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ.LJIIIZ(i6, LJIILL(j, t));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ.LJFF(i6, LJIILL(j, t));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ.LJII(i6, LJIIZILJ(j, t));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (LJIIIIZZ(i6, i3, t)) {
                            int LJIILL = LJIILL(j, t);
                            c90405Zdx.LIZ.LJIILIIL(i6, (LJIILL >> 31) ^ (LJIILL + LJIILL));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (LJIIIIZZ(i6, i3, t)) {
                            long LJIIZILJ = LJIIZILJ(j, t);
                            c90405Zdx.LIZ.LJIILL(i6, (LJIIZILJ >> 63) ^ (LJIIZILJ + LJIIZILJ));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (LJIIIIZZ(i6, i3, t)) {
                            c90405Zdx.LIZ(i6, LJIJ(i3), unsafe.getObject(t, j));
                            break;
                        } else {
                            break;
                        }
                }
                i3 += 3;
                i2 = 1048575;
            }
            AbstractC90306ZcM<?, ?> abstractC90306ZcM = this.LJIIIZ;
            abstractC90306ZcM.LIZJ(t);
            abstractC90306ZcM.LJI();
            return;
        }
        this.LJIIJ.LIZ(t);
        throw null;
    }

    public final void LJIL(int i, Object obj) {
        int i2 = this.LIZ[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        C90376ZdU.LJIIL(j, (1 << (i2 >>> 20)) | C90376ZdU.LJI(j, obj), obj);
    }

    public static final void LJIIJ(int i, Object obj, C90405Zdx c90405Zdx) {
        if (obj instanceof String) {
            c90405Zdx.LIZ.LJIIJJI(i, (String) obj);
        } else {
            c90405Zdx.LIZ.LJ(i, (AbstractC90364ZdI) obj);
        }
    }

    public final boolean LJIIIIZZ(int i, int i2, Object obj) {
        if (C90376ZdU.LJI(this.LIZ[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    public final void LJIJJ(int i, Object obj, Object obj2) {
        long LJIILLIIL = LJIILLIIL(i) & 1048575;
        if (!LJII(i, obj2)) {
            return;
        }
        Object LJIIIZ = C90376ZdU.LJIIIZ(LJIILLIIL, obj);
        Object LJIIIZ2 = C90376ZdU.LJIIIZ(LJIILLIIL, obj2);
        if (LJIIIZ != null) {
            if (LJIIIZ2 == null) {
                return;
            }
            C90376ZdU.LJIILIIL(LJIILLIIL, obj, C90359ZdD.LIZIZ(LJIIIZ, LJIIIZ2));
            LJIL(i, obj);
            return;
        }
        if (LJIIIZ2 == null) {
            return;
        }
        C90376ZdU.LJIILIIL(LJIILLIIL, obj, LJIIIZ2);
        LJIL(i, obj);
    }

    public final void LJIJJLI(int i, Object obj, Object obj2) {
        Object obj3;
        int LJIILLIIL = LJIILLIIL(i);
        int i2 = this.LIZ[i];
        long j = LJIILLIIL & 1048575;
        if (!LJIIIIZZ(i2, i, obj2)) {
            return;
        }
        if (LJIIIIZZ(i2, i, obj)) {
            obj3 = C90376ZdU.LJIIIZ(j, obj);
        } else {
            obj3 = null;
        }
        Object LJIIIZ = C90376ZdU.LJIIIZ(j, obj2);
        if (obj3 != null) {
            if (LJIIIZ == null) {
                return;
            }
            C90376ZdU.LJIILIIL(j, obj, C90359ZdD.LIZIZ(obj3, LJIIIZ));
            LJJ(i2, i, obj);
            return;
        }
        if (LJIIIZ == null) {
            return;
        }
        C90376ZdU.LJIILIIL(j, obj, LJIIIZ);
        LJJ(i2, i, obj);
    }

    public final void LJJ(int i, int i2, Object obj) {
        C90376ZdU.LJIIL(this.LIZ[i2 + 2] & 1048575, i, obj);
    }

    public final boolean LJJI(int i, Object obj, Object obj2) {
        if (LJII(i, obj) == LJII(i, obj2)) {
            return true;
        }
        return false;
    }

    public static C90726Zj8 LJIIJJI(InterfaceC90305ZcL interfaceC90305ZcL, AbstractC90235ZbD abstractC90235ZbD, AbstractC90306ZcM abstractC90306ZcM, AbstractC90234ZbC abstractC90234ZbC, C90289Zc5 c90289Zc5) {
        if (interfaceC90305ZcL instanceof C90758Zje) {
            return LJIIL((C90758Zje) interfaceC90305ZcL, abstractC90235ZbD, abstractC90306ZcM, abstractC90234ZbC, c90289Zc5);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C90726Zj8 LJIIL(X.C90758Zje r29, X.AbstractC90235ZbD r30, X.AbstractC90306ZcM r31, X.AbstractC90234ZbC r32, X.C90289Zc5 r33) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90726Zj8.LJIIL(X.Zje, X.ZbD, X.ZcM, X.ZbC, X.Zc5):X.Zj8");
    }

    public C90726Zj8(int[] iArr, Object[] objArr, InterfaceC90712Ziu interfaceC90712Ziu, boolean z, int[] iArr2, int i, int i2, AbstractC90235ZbD abstractC90235ZbD, AbstractC90306ZcM abstractC90306ZcM, AbstractC90234ZbC abstractC90234ZbC, C90289Zc5 c90289Zc5) {
        boolean z2;
        this.LIZ = iArr;
        this.LIZIZ = objArr;
        this.LJ = z;
        if (abstractC90234ZbC != null && abstractC90234ZbC.LIZJ(interfaceC90712Ziu)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZLLL = z2;
        this.LJFF = iArr2;
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = abstractC90235ZbD;
        this.LJIIIZ = abstractC90306ZcM;
        this.LJIIJ = abstractC90234ZbC;
        this.LIZJ = interfaceC90712Ziu;
    }
}
