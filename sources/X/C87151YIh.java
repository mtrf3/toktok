package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* renamed from: X.YIh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87151YIh<T> implements YIV<T> {
    public static final int[] LJIILIIL = new int[0];
    public static final Unsafe LJIILJJIL = C87167YIx.LJIIJ();
    public final int[] LIZ;
    public final Object[] LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final YIH LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final int[] LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final XM6 LJIIJ;
    public final YJH LJIIJJI;
    public final AbstractC87178YJi LJIIL;

    @Override // X.YIV
    public final Object LJ() {
        return ((YIN) this.LJ).LJIIZILJ(4);
    }

    public static C87157YIn LJJI(Object obj) {
        YIN yin = (YIN) obj;
        C87157YIn c87157YIn = yin.zzc;
        if (c87157YIn == C87157YIn.LJFF) {
            C87157YIn LIZIZ = C87157YIn.LIZIZ();
            yin.zzc = LIZIZ;
            return LIZIZ;
        }
        return c87157YIn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (X.C87167YIx.LJIILL(r1, r9) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x019f, code lost:
    
        r6 = 1237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019b, code lost:
    
        if (((java.lang.Boolean) X.C87167YIx.LJIIIZ(r1, r9)).booleanValue() != false) goto L92;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    @Override // X.YIV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87151YIh.LIZ(java.lang.Object):int");
    }

    @Override // X.YIV
    public final void LIZIZ(Object obj) {
        int i;
        int i2 = this.LJIIIIZZ;
        while (true) {
            i = this.LJIIIZ;
            if (i2 >= i) {
                break;
            }
            long LJIIIZ = LJIIIZ(this.LJII[i2]) & 1048575;
            Object LJIIIZ2 = C87167YIx.LJIIIZ(LJIIIZ, obj);
            if (LJIIIZ2 != null) {
                ((C65877PtJ) LJIIIZ2).zzc();
                C87167YIx.LJIILIIL(LJIIIZ, obj, LJIIIZ2);
            }
            i2++;
        }
        int length = this.LJII.length;
        while (i < length) {
            this.LJIIJ.LIZ(this.LJII[i], obj);
            i++;
        }
        this.LJIIJJI.LJI(obj);
        if (this.LJFF) {
            this.LJIIL.LIZIZ(obj);
        }
    }

    @Override // X.YIV
    public final int LIZJ(Object obj) {
        if (this.LJI) {
            return LJJIIJ(obj);
        }
        return LJJIII(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f A[SYNTHETIC] */
    @Override // X.YIV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87151YIh.LJIIIIZZ(java.lang.Object):boolean");
    }

    public final int LJIIIZ(int i) {
        return this.LIZ[i + 1];
    }

    public final YIV LJIIJJI(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.LIZIZ;
        YIV yiv = (YIV) objArr[i3];
        if (yiv != null) {
            return yiv;
        }
        YIV LIZ = C87158YIo.LIZJ.LIZ((Class) objArr[i3 + 1]);
        this.LIZIZ[i3] = LIZ;
        return LIZ;
    }

    public final Object LJIIL(int i) {
        int i2 = i / 3;
        return this.LIZIZ[i2 + i2];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0036. Please report as an issue. */
    public final int LJJIII(Object obj) {
        int i;
        int LJLJL;
        int LJLJL2;
        int LJLJL3;
        int LJLJLJ;
        int LJLJL4;
        int LJLJL5;
        int zzd;
        int LJLJL6;
        int size;
        int LJJIJIIJIL;
        int LLFZ;
        int LJJIJ;
        int size2;
        int LJJIJIIJI;
        int LLFZ2;
        int LJJIFFI;
        int LLFZ3;
        int LJLJL7;
        int i2;
        int LJLJL8;
        int LJLJL9;
        int LJLJL10;
        int LJLJLJ2;
        int LJLJL11;
        int LLFFF;
        int LJLJL12;
        int zzd2;
        int LJLJL13;
        Unsafe unsafe = LJIILJJIL;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i4 < this.LIZ.length) {
            int LJIIIZ = LJIIIZ(i4);
            int[] iArr = this.LIZ;
            int i8 = iArr[i4];
            int i9 = (LJIIIZ >>> 20) & 255;
            if (i9 <= 17) {
                int i10 = iArr[i4 + 2];
                int i11 = i10 & i3;
                i = 1 << (i10 >>> 20);
                if (i11 != i6) {
                    i7 = unsafe.getInt(obj, i11);
                    i6 = i11;
                }
            } else {
                i = 0;
            }
            long j = i3 & LJIIIZ;
            switch (i9) {
                case 0:
                    if ((i7 & i) != 0) {
                        LJLJL = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJL4 = LJLJL + 8;
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i7 & i) != 0) {
                        LJLJL2 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJL4 = LJLJL2 + 4;
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i7 & i) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        LJLJL3 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJLJ = AbstractC87153YIj.LJLJLJ(j2);
                        LJLJL4 = LJLJLJ + LJLJL3;
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i7 & i) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        LJLJL3 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJLJ = AbstractC87153YIj.LJLJLJ(j3);
                        LJLJL4 = LJLJLJ + LJLJL3;
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i7 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        LJLJLJ = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJL3 = AbstractC87153YIj.LLFFF(i12);
                        LJLJL4 = LJLJLJ + LJLJL3;
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i7 & i) != 0) {
                        LJLJL = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJL4 = LJLJL + 8;
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i7 & i) != 0) {
                        LJLJL2 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJL4 = LJLJL2 + 4;
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i7 & i) != 0) {
                        LJLJL4 = AbstractC87153YIj.LJLJL(i8 << 3) + 1;
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i7 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof AbstractC87134YHq) {
                            LJLJL5 = AbstractC87153YIj.LJLJL(i8 << 3);
                            zzd = ((AbstractC87134YHq) object).zzd();
                            LJLJL6 = AbstractC87153YIj.LJLJL(zzd);
                            i5 = AnonymousClass036.LIZIZ(LJLJL6, zzd, LJLJL5, i5);
                            break;
                        } else {
                            LJLJLJ = AbstractC87153YIj.LJLJL(i8 << 3);
                            LJLJL3 = AbstractC87153YIj.LLFII((String) object);
                            LJLJL4 = LJLJLJ + LJLJL3;
                            i5 += LJLJL4;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i7 & i) != 0) {
                        LJLJL4 = C87152YIi.LJJIIJ(i8, LJIIJJI(i4), unsafe.getObject(obj, j));
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i7 & i) != 0) {
                        AbstractC87134YHq abstractC87134YHq = (AbstractC87134YHq) unsafe.getObject(obj, j);
                        LJLJL5 = AbstractC87153YIj.LJLJL(i8 << 3);
                        zzd = abstractC87134YHq.zzd();
                        LJLJL6 = AbstractC87153YIj.LJLJL(zzd);
                        i5 = AnonymousClass036.LIZIZ(LJLJL6, zzd, LJLJL5, i5);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    if ((i7 & i) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        LJLJLJ = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJL3 = AbstractC87153YIj.LJLJL(i13);
                        LJLJL4 = LJLJLJ + LJLJL3;
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i7 & i) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        LJLJLJ = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJL3 = AbstractC87153YIj.LLFFF(i14);
                        LJLJL4 = LJLJLJ + LJLJL3;
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    if ((i7 & i) != 0) {
                        LJLJL2 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJL4 = LJLJL2 + 4;
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i7 & i) != 0) {
                        LJLJL = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJL4 = LJLJL + 8;
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i7 & i) != 0) {
                        int i15 = unsafe.getInt(obj, j);
                        LJLJLJ = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJL3 = AbstractC87153YIj.LJLJL((i15 >> 31) ^ (i15 + i15));
                        LJLJL4 = LJLJLJ + LJLJL3;
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    if ((i & i7) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        LJLJL4 = AbstractC87153YIj.LJLJLJ((j4 >> 63) ^ (j4 + j4)) + AbstractC87153YIj.LJLJL(i8 << 3);
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i7 & i) != 0) {
                        LJLJL4 = AbstractC87153YIj.LLFF(i8, (YIH) unsafe.getObject(obj, j), LJIIJJI(i4));
                        i5 += LJLJL4;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    LJLJL4 = C87152YIi.LJJI(i8, (List) unsafe.getObject(obj, j));
                    i5 += LJLJL4;
                    break;
                case 19:
                    LJLJL4 = C87152YIi.LJIL(i8, (List) unsafe.getObject(obj, j));
                    i5 += LJLJL4;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    if (list.size() != 0) {
                        LJLJL4 = (AbstractC87153YIj.LLFZ(i8) * list.size()) + C87152YIi.LJJIII(list);
                        i5 += LJLJL4;
                        break;
                    }
                    LJLJL4 = 0;
                    i5 += LJLJL4;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    size = list2.size();
                    if (size != 0) {
                        LJJIJIIJIL = C87152YIi.LJJIJIIJIL(list2);
                        LLFZ = AbstractC87153YIj.LLFZ(i8);
                        LJLJL4 = (LLFZ * size) + LJJIJIIJIL;
                        i5 += LJLJL4;
                        break;
                    }
                    LJLJL4 = 0;
                    i5 += LJLJL4;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    size = list3.size();
                    if (size != 0) {
                        LJJIJIIJIL = C87152YIi.LJJII(list3);
                        LLFZ = AbstractC87153YIj.LLFZ(i8);
                        LJLJL4 = (LLFZ * size) + LJJIJIIJIL;
                        i5 += LJLJL4;
                        break;
                    }
                    LJLJL4 = 0;
                    i5 += LJLJL4;
                case 23:
                    LJLJL4 = C87152YIi.LJJI(i8, (List) unsafe.getObject(obj, j));
                    i5 += LJLJL4;
                    break;
                case 24:
                    LJLJL4 = C87152YIi.LJIL(i8, (List) unsafe.getObject(obj, j));
                    i5 += LJLJL4;
                    break;
                case 25:
                    int size3 = ((List) unsafe.getObject(obj, j)).size();
                    if (size3 != 0) {
                        LJLJL4 = (AbstractC87153YIj.LJLJL(i8 << 3) + 1) * size3;
                        i5 += LJLJL4;
                        break;
                    }
                    LJLJL4 = 0;
                    i5 += LJLJL4;
                case 26:
                    LJJIJ = C87152YIi.LJJIJ(i8, (List) unsafe.getObject(obj, j));
                    i5 += LJJIJ;
                    break;
                case 27:
                    LJJIJ = C87152YIi.LJJIIJZLJL(i8, (List) unsafe.getObject(obj, j), LJIIJJI(i4));
                    i5 += LJJIJ;
                    break;
                case 28:
                    LJJIJ = C87152YIi.LJIJJ(i8, (List) unsafe.getObject(obj, j));
                    i5 += LJJIJ;
                    break;
                case 29:
                    List list4 = (List) unsafe.getObject(obj, j);
                    size2 = list4.size();
                    if (size2 != 0) {
                        LJJIJIIJI = C87152YIi.LJJIJIIJI(list4);
                        LLFZ2 = AbstractC87153YIj.LLFZ(i8);
                        LJJIJ = LJJIJIIJI + (LLFZ2 * size2);
                        i5 += LJJIJ;
                        break;
                    }
                    LJJIJ = 0;
                    i5 += LJJIJ;
                case 30:
                    List list5 = (List) unsafe.getObject(obj, j);
                    size2 = list5.size();
                    if (size2 != 0) {
                        LJJIJIIJI = C87152YIi.LJIJJLI(list5);
                        LLFZ2 = AbstractC87153YIj.LLFZ(i8);
                        LJJIJ = LJJIJIIJI + (LLFZ2 * size2);
                        i5 += LJJIJ;
                        break;
                    }
                    LJJIJ = 0;
                    i5 += LJJIJ;
                case 31:
                    LJJIJ = C87152YIi.LJIL(i8, (List) unsafe.getObject(obj, j));
                    i5 += LJJIJ;
                    break;
                case 32:
                    LJJIJ = C87152YIi.LJJI(i8, (List) unsafe.getObject(obj, j));
                    i5 += LJJIJ;
                    break;
                case 33:
                    List list6 = (List) unsafe.getObject(obj, j);
                    size2 = list6.size();
                    if (size2 != 0) {
                        LJJIJIIJI = C87152YIi.LJJIIZ(list6);
                        LLFZ2 = AbstractC87153YIj.LLFZ(i8);
                        LJJIJ = LJJIJIIJI + (LLFZ2 * size2);
                        i5 += LJJIJ;
                        break;
                    }
                    LJJIJ = 0;
                    i5 += LJJIJ;
                case 34:
                    List list7 = (List) unsafe.getObject(obj, j);
                    size2 = list7.size();
                    if (size2 != 0) {
                        LJJIJIIJI = C87152YIi.LJJIIZI(list7);
                        LLFZ2 = AbstractC87153YIj.LLFZ(i8);
                        LJJIJ = LJJIJIIJI + (LLFZ2 * size2);
                        i5 += LJJIJ;
                        break;
                    }
                    LJJIJ = 0;
                    i5 += LJJIJ;
                case 35:
                    LJJIFFI = C87152YIi.LJJIFFI((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    LJJIFFI = C87152YIi.LJJ((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    LJJIFFI = C87152YIi.LJJIII((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    LJJIFFI = C87152YIi.LJJIJIIJIL((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    LJJIFFI = C87152YIi.LJJII((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                    LJJIFFI = C87152YIi.LJJIFFI((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    LJJIFFI = C87152YIi.LJJ((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    LJJIFFI = ((List) unsafe.getObject(obj, j)).size();
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                    LJJIFFI = C87152YIi.LJJIJIIJI((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    LJJIFFI = C87152YIi.LJIJJLI((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    LJJIFFI = C87152YIi.LJJ((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    LJJIFFI = C87152YIi.LJJIFFI((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    LJJIFFI = C87152YIi.LJJIIZ((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                    LJJIFFI = C87152YIi.LJJIIZI((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ3 = AbstractC87153YIj.LLFZ(i8);
                        LJLJL7 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i2 = LJLJL7 + LLFZ3 + LJJIFFI;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case C61447O9r.LJIIJ:
                    List list8 = (List) unsafe.getObject(obj, j);
                    YIV LJIIJJI = LJIIJJI(i4);
                    int size4 = list8.size();
                    if (size4 != 0) {
                        LJJIJ = 0;
                        for (int i16 = 0; i16 < size4; i16++) {
                            LJJIJ += AbstractC87153YIj.LLFF(i8, (YIH) ListProtector.get(list8, i16), LJIIJJI);
                        }
                        i5 += LJJIJ;
                        break;
                    }
                    LJJIJ = 0;
                    i5 += LJJIJ;
                case 50:
                    C65878PtK.LIZ(unsafe.getObject(obj, j), LJIIL(i4));
                    break;
                case 51:
                    if (LJIJJLI(i8, i4, obj)) {
                        LJLJL8 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJJIJ = LJLJL8 + 8;
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (LJIJJLI(i8, i4, obj)) {
                        LJLJL9 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJJIJ = LJLJL9 + 4;
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (LJIJJLI(i8, i4, obj)) {
                        long LJIIJ = LJIIJ(j, obj);
                        LJLJL10 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJLJ2 = AbstractC87153YIj.LJLJLJ(LJIIJ);
                        LJJIJ = LJLJL10 + LJLJLJ2;
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (LJIJJLI(i8, i4, obj)) {
                        long LJIIJ2 = LJIIJ(j, obj);
                        LJLJL10 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJLJLJ2 = AbstractC87153YIj.LJLJLJ(LJIIJ2);
                        LJJIJ = LJLJL10 + LJLJLJ2;
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (LJIJJLI(i8, i4, obj)) {
                        int LJJIIJZLJL = LJJIIJZLJL(j, obj);
                        LJLJL11 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LLFFF = AbstractC87153YIj.LLFFF(LJJIIJZLJL);
                        LJJIJ = LLFFF + LJLJL11;
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (LJIJJLI(i8, i4, obj)) {
                        LJLJL8 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJJIJ = LJLJL8 + 8;
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (LJIJJLI(i8, i4, obj)) {
                        LJLJL9 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJJIJ = LJLJL9 + 4;
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (LJIJJLI(i8, i4, obj)) {
                        LJJIJ = AbstractC87153YIj.LJLJL(i8 << 3) + 1;
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (LJIJJLI(i8, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof AbstractC87134YHq) {
                            LJLJL12 = AbstractC87153YIj.LJLJL(i8 << 3);
                            zzd2 = ((AbstractC87134YHq) object2).zzd();
                            LJLJL13 = AbstractC87153YIj.LJLJL(zzd2);
                            i2 = LJLJL13 + zzd2 + LJLJL12;
                            i5 += i2;
                            break;
                        } else {
                            LJLJL11 = AbstractC87153YIj.LJLJL(i8 << 3);
                            LLFFF = AbstractC87153YIj.LLFII((String) object2);
                            LJJIJ = LLFFF + LJLJL11;
                            i5 += LJJIJ;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (LJIJJLI(i8, i4, obj)) {
                        LJJIJ = C87152YIi.LJJIIJ(i8, LJIIJJI(i4), unsafe.getObject(obj, j));
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (LJIJJLI(i8, i4, obj)) {
                        AbstractC87134YHq abstractC87134YHq2 = (AbstractC87134YHq) unsafe.getObject(obj, j);
                        LJLJL12 = AbstractC87153YIj.LJLJL(i8 << 3);
                        zzd2 = abstractC87134YHq2.zzd();
                        LJLJL13 = AbstractC87153YIj.LJLJL(zzd2);
                        i2 = LJLJL13 + zzd2 + LJLJL12;
                        i5 += i2;
                        break;
                    } else {
                        break;
                    }
                case BaseNotice.CREATOR /* 62 */:
                    if (LJIJJLI(i8, i4, obj)) {
                        int LJJIIJZLJL2 = LJJIIJZLJL(j, obj);
                        LJLJL11 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LLFFF = AbstractC87153YIj.LJLJL(LJJIIJZLJL2);
                        LJJIJ = LLFFF + LJLJL11;
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (LJIJJLI(i8, i4, obj)) {
                        int LJJIIJZLJL3 = LJJIIJZLJL(j, obj);
                        LJLJL11 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LLFFF = AbstractC87153YIj.LLFFF(LJJIIJZLJL3);
                        LJJIJ = LLFFF + LJLJL11;
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (LJIJJLI(i8, i4, obj)) {
                        LJLJL9 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJJIJ = LJLJL9 + 4;
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (LJIJJLI(i8, i4, obj)) {
                        LJLJL8 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LJJIJ = LJLJL8 + 8;
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (LJIJJLI(i8, i4, obj)) {
                        int LJJIIJZLJL4 = LJJIIJZLJL(j, obj);
                        LJLJL11 = AbstractC87153YIj.LJLJL(i8 << 3);
                        LLFFF = AbstractC87153YIj.LJLJL((LJJIIJZLJL4 >> 31) ^ (LJJIIJZLJL4 + LJJIIJZLJL4));
                        LJJIJ = LLFFF + LJLJL11;
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (LJIJJLI(i8, i4, obj)) {
                        long LJIIJ3 = LJIIJ(j, obj);
                        LJJIJ = AbstractC87153YIj.LJLJLJ((LJIIJ3 >> 63) ^ (LJIIJ3 + LJIIJ3)) + AbstractC87153YIj.LJLJL(i8 << 3);
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (LJIJJLI(i8, i4, obj)) {
                        LJJIJ = AbstractC87153YIj.LLFF(i8, (YIH) unsafe.getObject(obj, j), LJIIJJI(i4));
                        i5 += LJJIJ;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            i3 = 1048575;
        }
        YJH yjh = this.LJIIJJI;
        int LIZ = yjh.LIZ(yjh.LIZJ(obj)) + i5;
        if (!this.LJFF) {
            return LIZ;
        }
        this.LJIIL.LIZ(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002a. Please report as an issue. */
    public final int LJJIIJ(Object obj) {
        int LJLJL;
        int LJLJL2;
        int LJLJL3;
        int LJLJLJ;
        int LJLJL4;
        int LLFFF;
        int LJLJL5;
        int LJLJL6;
        int zzd;
        int LJLJL7;
        int LJJIIJ;
        int size;
        int LJJIJIIJIL;
        int LLFZ;
        int LJJIFFI;
        int LLFZ2;
        int LJLJL8;
        int i;
        Unsafe unsafe = LJIILJJIL;
        int i2 = 0;
        for (int i3 = 0; i3 < this.LIZ.length; i3 += 3) {
            int LJIIIZ = LJIIIZ(i3);
            int i4 = (LJIIIZ >>> 20) & 255;
            int i5 = this.LIZ[i3];
            long j = LJIIIZ & 1048575;
            if (i4 >= YPM.zzJ.zza()) {
                YPM.zzW.zza();
            }
            switch (i4) {
                case 0:
                    if (LJIJJ(i3, obj)) {
                        LJLJL = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL + 8;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (LJIJJ(i3, obj)) {
                        LJLJL2 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL2 + 4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (LJIJJ(i3, obj)) {
                        long LJII = C87167YIx.LJII(j, obj);
                        LJLJL3 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJLJLJ = AbstractC87153YIj.LJLJLJ(LJII);
                        LJJIIJ = LJLJLJ + LJLJL3;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (LJIJJ(i3, obj)) {
                        long LJII2 = C87167YIx.LJII(j, obj);
                        LJLJL3 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJLJLJ = AbstractC87153YIj.LJLJLJ(LJII2);
                        LJJIIJ = LJLJLJ + LJLJL3;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (LJIJJ(i3, obj)) {
                        int LJI = C87167YIx.LJI(j, obj);
                        LJLJL4 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LLFFF = AbstractC87153YIj.LLFFF(LJI);
                        LJJIIJ = LLFFF + LJLJL4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (LJIJJ(i3, obj)) {
                        LJLJL = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL + 8;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (LJIJJ(i3, obj)) {
                        LJLJL2 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL2 + 4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (LJIJJ(i3, obj)) {
                        LJLJL5 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL5 + 1;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (LJIJJ(i3, obj)) {
                        Object LJIIIZ2 = C87167YIx.LJIIIZ(j, obj);
                        if (LJIIIZ2 instanceof AbstractC87134YHq) {
                            LJLJL6 = AbstractC87153YIj.LJLJL(i5 << 3);
                            zzd = ((AbstractC87134YHq) LJIIIZ2).zzd();
                            LJLJL7 = AbstractC87153YIj.LJLJL(zzd);
                            i = LJLJL7 + zzd + LJLJL6;
                            i2 += i;
                            break;
                        } else {
                            LJLJL4 = AbstractC87153YIj.LJLJL(i5 << 3);
                            LLFFF = AbstractC87153YIj.LLFII((String) LJIIIZ2);
                            LJJIIJ = LLFFF + LJLJL4;
                            i2 += LJJIIJ;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (LJIJJ(i3, obj)) {
                        LJJIIJ = C87152YIi.LJJIIJ(i5, LJIIJJI(i3), C87167YIx.LJIIIZ(j, obj));
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (LJIJJ(i3, obj)) {
                        AbstractC87134YHq abstractC87134YHq = (AbstractC87134YHq) C87167YIx.LJIIIZ(j, obj);
                        LJLJL6 = AbstractC87153YIj.LJLJL(i5 << 3);
                        zzd = abstractC87134YHq.zzd();
                        LJLJL7 = AbstractC87153YIj.LJLJL(zzd);
                        i = LJLJL7 + zzd + LJLJL6;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    if (LJIJJ(i3, obj)) {
                        int LJI2 = C87167YIx.LJI(j, obj);
                        LJLJL4 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LLFFF = AbstractC87153YIj.LJLJL(LJI2);
                        LJJIIJ = LLFFF + LJLJL4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (LJIJJ(i3, obj)) {
                        int LJI3 = C87167YIx.LJI(j, obj);
                        LJLJL4 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LLFFF = AbstractC87153YIj.LLFFF(LJI3);
                        LJJIIJ = LLFFF + LJLJL4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    if (LJIJJ(i3, obj)) {
                        LJLJL2 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL2 + 4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (LJIJJ(i3, obj)) {
                        LJLJL = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL + 8;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (LJIJJ(i3, obj)) {
                        int LJI4 = C87167YIx.LJI(j, obj);
                        LJLJL4 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LLFFF = AbstractC87153YIj.LJLJL((LJI4 >> 31) ^ (LJI4 + LJI4));
                        LJJIIJ = LLFFF + LJLJL4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    if (LJIJJ(i3, obj)) {
                        long LJII3 = C87167YIx.LJII(j, obj);
                        LJLJL4 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LLFFF = AbstractC87153YIj.LJLJLJ((LJII3 >> 63) ^ (LJII3 + LJII3));
                        LJJIIJ = LLFFF + LJLJL4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (LJIJJ(i3, obj)) {
                        LJJIIJ = AbstractC87153YIj.LLFF(i5, (YIH) C87167YIx.LJIIIZ(j, obj), LJIIJJI(i3));
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    LJJIIJ = C87152YIi.LJJI(i5, (List) C87167YIx.LJIIIZ(j, obj));
                    i2 += LJJIIJ;
                    break;
                case 19:
                    LJJIIJ = C87152YIi.LJIL(i5, (List) C87167YIx.LJIIIZ(j, obj));
                    i2 += LJJIIJ;
                    break;
                case 20:
                    List list = (List) C87167YIx.LJIIIZ(j, obj);
                    if (list.size() != 0) {
                        LJJIIJ = (AbstractC87153YIj.LLFZ(i5) * list.size()) + C87152YIi.LJJIII(list);
                        i2 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i2 += LJJIIJ;
                case 21:
                    List list2 = (List) C87167YIx.LJIIIZ(j, obj);
                    size = list2.size();
                    if (size != 0) {
                        LJJIJIIJIL = C87152YIi.LJJIJIIJIL(list2);
                        LLFZ = AbstractC87153YIj.LLFZ(i5);
                        LJJIIJ = (LLFZ * size) + LJJIJIIJIL;
                        i2 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i2 += LJJIIJ;
                case 22:
                    List list3 = (List) C87167YIx.LJIIIZ(j, obj);
                    size = list3.size();
                    if (size != 0) {
                        LJJIJIIJIL = C87152YIi.LJJII(list3);
                        LLFZ = AbstractC87153YIj.LLFZ(i5);
                        LJJIIJ = (LLFZ * size) + LJJIJIIJIL;
                        i2 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i2 += LJJIIJ;
                case 23:
                    LJJIIJ = C87152YIi.LJJI(i5, (List) C87167YIx.LJIIIZ(j, obj));
                    i2 += LJJIIJ;
                    break;
                case 24:
                    LJJIIJ = C87152YIi.LJIL(i5, (List) C87167YIx.LJIIIZ(j, obj));
                    i2 += LJJIIJ;
                    break;
                case 25:
                    int size2 = ((List) C87167YIx.LJIIIZ(j, obj)).size();
                    if (size2 != 0) {
                        LJJIIJ = size2 * (AbstractC87153YIj.LJLJL(i5 << 3) + 1);
                        i2 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i2 += LJJIIJ;
                case 26:
                    LJJIIJ = C87152YIi.LJJIJ(i5, (List) C87167YIx.LJIIIZ(j, obj));
                    i2 += LJJIIJ;
                    break;
                case 27:
                    LJJIIJ = C87152YIi.LJJIIJZLJL(i5, (List) C87167YIx.LJIIIZ(j, obj), LJIIJJI(i3));
                    i2 += LJJIIJ;
                    break;
                case 28:
                    LJJIIJ = C87152YIi.LJIJJ(i5, (List) C87167YIx.LJIIIZ(j, obj));
                    i2 += LJJIIJ;
                    break;
                case 29:
                    List list4 = (List) C87167YIx.LJIIIZ(j, obj);
                    size = list4.size();
                    if (size != 0) {
                        LJJIJIIJIL = C87152YIi.LJJIJIIJI(list4);
                        LLFZ = AbstractC87153YIj.LLFZ(i5);
                        LJJIIJ = (LLFZ * size) + LJJIJIIJIL;
                        i2 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i2 += LJJIIJ;
                case 30:
                    List list5 = (List) C87167YIx.LJIIIZ(j, obj);
                    size = list5.size();
                    if (size != 0) {
                        LJJIJIIJIL = C87152YIi.LJIJJLI(list5);
                        LLFZ = AbstractC87153YIj.LLFZ(i5);
                        LJJIIJ = (LLFZ * size) + LJJIJIIJIL;
                        i2 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i2 += LJJIIJ;
                case 31:
                    LJJIIJ = C87152YIi.LJIL(i5, (List) C87167YIx.LJIIIZ(j, obj));
                    i2 += LJJIIJ;
                    break;
                case 32:
                    LJJIIJ = C87152YIi.LJJI(i5, (List) C87167YIx.LJIIIZ(j, obj));
                    i2 += LJJIIJ;
                    break;
                case 33:
                    List list6 = (List) C87167YIx.LJIIIZ(j, obj);
                    size = list6.size();
                    if (size != 0) {
                        LJJIJIIJIL = C87152YIi.LJJIIZ(list6);
                        LLFZ = AbstractC87153YIj.LLFZ(i5);
                        LJJIIJ = (LLFZ * size) + LJJIJIIJIL;
                        i2 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i2 += LJJIIJ;
                case 34:
                    List list7 = (List) C87167YIx.LJIIIZ(j, obj);
                    size = list7.size();
                    if (size != 0) {
                        LJJIJIIJIL = C87152YIi.LJJIIZI(list7);
                        LLFZ = AbstractC87153YIj.LLFZ(i5);
                        LJJIIJ = (LLFZ * size) + LJJIJIIJIL;
                        i2 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i2 += LJJIIJ;
                case 35:
                    LJJIFFI = C87152YIi.LJJIFFI((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    LJJIFFI = C87152YIi.LJJ((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    LJJIFFI = C87152YIi.LJJIII((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    LJJIFFI = C87152YIi.LJJIJIIJIL((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    LJJIFFI = C87152YIi.LJJII((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                    LJJIFFI = C87152YIi.LJJIFFI((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    LJJIFFI = C87152YIi.LJJ((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    LJJIFFI = ((List) unsafe.getObject(obj, j)).size();
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                    LJJIFFI = C87152YIi.LJJIJIIJI((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    LJJIFFI = C87152YIi.LJIJJLI((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    LJJIFFI = C87152YIi.LJJ((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    LJJIFFI = C87152YIi.LJJIFFI((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    LJJIFFI = C87152YIi.LJJIIZ((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                    LJJIFFI = C87152YIi.LJJIIZI((List) unsafe.getObject(obj, j));
                    if (LJJIFFI > 0) {
                        LLFZ2 = AbstractC87153YIj.LLFZ(i5);
                        LJLJL8 = AbstractC87153YIj.LJLJL(LJJIFFI);
                        i = LJLJL8 + LLFZ2 + LJJIFFI;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case C61447O9r.LJIIJ:
                    List list8 = (List) C87167YIx.LJIIIZ(j, obj);
                    YIV LJIIJJI = LJIIJJI(i3);
                    int size3 = list8.size();
                    if (size3 != 0) {
                        LJJIIJ = 0;
                        for (int i6 = 0; i6 < size3; i6++) {
                            LJJIIJ += AbstractC87153YIj.LLFF(i5, (YIH) ListProtector.get(list8, i6), LJIIJJI);
                        }
                        i2 += LJJIIJ;
                        break;
                    }
                    LJJIIJ = 0;
                    i2 += LJJIIJ;
                case 50:
                    C65878PtK.LIZ(C87167YIx.LJIIIZ(j, obj), LJIIL(i3));
                    break;
                case 51:
                    if (LJIJJLI(i5, i3, obj)) {
                        LJLJL = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL + 8;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (LJIJJLI(i5, i3, obj)) {
                        LJLJL2 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL2 + 4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (LJIJJLI(i5, i3, obj)) {
                        long LJIIJ = LJIIJ(j, obj);
                        LJLJL3 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJLJLJ = AbstractC87153YIj.LJLJLJ(LJIIJ);
                        LJJIIJ = LJLJLJ + LJLJL3;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (LJIJJLI(i5, i3, obj)) {
                        long LJIIJ2 = LJIIJ(j, obj);
                        LJLJL3 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJLJLJ = AbstractC87153YIj.LJLJLJ(LJIIJ2);
                        LJJIIJ = LJLJLJ + LJLJL3;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (LJIJJLI(i5, i3, obj)) {
                        int LJJIIJZLJL = LJJIIJZLJL(j, obj);
                        LJLJL4 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LLFFF = AbstractC87153YIj.LLFFF(LJJIIJZLJL);
                        LJJIIJ = LLFFF + LJLJL4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (LJIJJLI(i5, i3, obj)) {
                        LJLJL = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL + 8;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (LJIJJLI(i5, i3, obj)) {
                        LJLJL2 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL2 + 4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (LJIJJLI(i5, i3, obj)) {
                        LJLJL5 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL5 + 1;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (LJIJJLI(i5, i3, obj)) {
                        Object LJIIIZ3 = C87167YIx.LJIIIZ(j, obj);
                        if (LJIIIZ3 instanceof AbstractC87134YHq) {
                            LJLJL6 = AbstractC87153YIj.LJLJL(i5 << 3);
                            zzd = ((AbstractC87134YHq) LJIIIZ3).zzd();
                            LJLJL7 = AbstractC87153YIj.LJLJL(zzd);
                            i = LJLJL7 + zzd + LJLJL6;
                            i2 += i;
                            break;
                        } else {
                            LJLJL4 = AbstractC87153YIj.LJLJL(i5 << 3);
                            LLFFF = AbstractC87153YIj.LLFII((String) LJIIIZ3);
                            LJJIIJ = LLFFF + LJLJL4;
                            i2 += LJJIIJ;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (LJIJJLI(i5, i3, obj)) {
                        LJJIIJ = C87152YIi.LJJIIJ(i5, LJIIJJI(i3), C87167YIx.LJIIIZ(j, obj));
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (LJIJJLI(i5, i3, obj)) {
                        AbstractC87134YHq abstractC87134YHq2 = (AbstractC87134YHq) C87167YIx.LJIIIZ(j, obj);
                        LJLJL6 = AbstractC87153YIj.LJLJL(i5 << 3);
                        zzd = abstractC87134YHq2.zzd();
                        LJLJL7 = AbstractC87153YIj.LJLJL(zzd);
                        i = LJLJL7 + zzd + LJLJL6;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case BaseNotice.CREATOR /* 62 */:
                    if (LJIJJLI(i5, i3, obj)) {
                        int LJJIIJZLJL2 = LJJIIJZLJL(j, obj);
                        LJLJL4 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LLFFF = AbstractC87153YIj.LJLJL(LJJIIJZLJL2);
                        LJJIIJ = LLFFF + LJLJL4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (LJIJJLI(i5, i3, obj)) {
                        int LJJIIJZLJL3 = LJJIIJZLJL(j, obj);
                        LJLJL4 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LLFFF = AbstractC87153YIj.LLFFF(LJJIIJZLJL3);
                        LJJIIJ = LLFFF + LJLJL4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (LJIJJLI(i5, i3, obj)) {
                        LJLJL2 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL2 + 4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (LJIJJLI(i5, i3, obj)) {
                        LJLJL = AbstractC87153YIj.LJLJL(i5 << 3);
                        LJJIIJ = LJLJL + 8;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (LJIJJLI(i5, i3, obj)) {
                        int LJJIIJZLJL4 = LJJIIJZLJL(j, obj);
                        LJLJL4 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LLFFF = AbstractC87153YIj.LJLJL((LJJIIJZLJL4 >> 31) ^ (LJJIIJZLJL4 + LJJIIJZLJL4));
                        LJJIIJ = LLFFF + LJLJL4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (LJIJJLI(i5, i3, obj)) {
                        long LJIIJ3 = LJIIJ(j, obj);
                        LJLJL4 = AbstractC87153YIj.LJLJL(i5 << 3);
                        LLFFF = AbstractC87153YIj.LJLJLJ((LJIIJ3 >> 63) ^ (LJIIJ3 + LJIIJ3));
                        LJJIIJ = LLFFF + LJLJL4;
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (LJIJJLI(i5, i3, obj)) {
                        LJJIIJ = AbstractC87153YIj.LLFF(i5, (YIH) C87167YIx.LJIIIZ(j, obj), LJIIJJI(i3));
                        i2 += LJJIIJ;
                        break;
                    } else {
                        break;
                    }
            }
        }
        YJH yjh = this.LJIIJJI;
        return yjh.LIZ(yjh.LIZJ(obj)) + i2;
    }

    public static long LJIIJ(long j, Object obj) {
        return ((Long) C87167YIx.LJIIIZ(j, obj)).longValue();
    }

    public static Field LJIILIIL(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int LJJIIJZLJL(long j, Object obj) {
        return ((Integer) C87167YIx.LJIIIZ(j, obj)).intValue();
    }

    @Override // X.YIV
    public final void LIZLLL(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.LIZ.length; i += 3) {
            int LJIIIZ = LJIIIZ(i);
            long j = 1048575 & LJIIIZ;
            int i2 = this.LIZ[i];
            switch ((LJIIIZ >>> 20) & 255) {
                case 0:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LIZJ.LJ(obj, j, C87167YIx.LJ(j, obj2));
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LIZJ.LJFF(obj, j, C87167YIx.LJFF(j, obj2));
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LIZJ.LJIILJJIL(j, obj, C87167YIx.LJII(j, obj2));
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LIZJ.LJIILJJIL(j, obj, C87167YIx.LJII(j, obj2));
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LJIIL(j, C87167YIx.LJI(j, obj2), obj);
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LIZJ.LJIILJJIL(j, obj, C87167YIx.LJII(j, obj2));
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LJIIL(j, C87167YIx.LJI(j, obj2), obj);
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LIZJ.LIZJ(j, obj, C87167YIx.LJIILL(j, obj2));
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LJIILIIL(j, obj, C87167YIx.LJIIIZ(j, obj2));
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    LJIILJJIL(i, obj, obj2);
                    break;
                case 10:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LJIILIIL(j, obj, C87167YIx.LJIIIZ(j, obj2));
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LJIIL(j, C87167YIx.LJI(j, obj2), obj);
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LJIIL(j, C87167YIx.LJI(j, obj2), obj);
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LJIIL(j, C87167YIx.LJI(j, obj2), obj);
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LIZJ.LJIILJJIL(j, obj, C87167YIx.LJII(j, obj2));
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LJIIL(j, C87167YIx.LJI(j, obj2), obj);
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    if (LJIJJ(i, obj2)) {
                        C87167YIx.LIZJ.LJIILJJIL(j, obj, C87167YIx.LJII(j, obj2));
                        LJIILLIIL(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    LJIILJJIL(i, obj, obj2);
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
                    this.LJIIJ.LIZIZ(j, obj, obj2);
                    break;
                case 50:
                    C65877PtJ c65877PtJ = (C65877PtJ) C87167YIx.LJIIIZ(j, obj);
                    C65877PtJ c65877PtJ2 = (C65877PtJ) C87167YIx.LJIIIZ(j, obj2);
                    if (!c65877PtJ2.isEmpty()) {
                        if (!c65877PtJ.zze()) {
                            c65877PtJ = c65877PtJ.zzb();
                        }
                        c65877PtJ.zzd(c65877PtJ2);
                    }
                    C87167YIx.LJIILIIL(j, obj, c65877PtJ);
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
                    if (LJIJJLI(i2, i, obj2)) {
                        C87167YIx.LJIILIIL(j, obj, C87167YIx.LJIIIZ(j, obj2));
                        LJIIZILJ(i2, i, obj);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    LJIILL(i, obj, obj2);
                    break;
                case 61:
                case BaseNotice.CREATOR /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (LJIJJLI(i2, i, obj2)) {
                        C87167YIx.LJIILIIL(j, obj, C87167YIx.LJIIIZ(j, obj2));
                        LJIIZILJ(i2, i, obj);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    LJIILL(i, obj, obj2);
                    break;
            }
        }
        YJH yjh = this.LJIIJJI;
        yjh.LJII(obj, yjh.LIZLLL(yjh.LIZJ(obj), yjh.LIZJ(obj2)));
        if (!this.LJFF) {
            return;
        }
        this.LJIIL.LIZ(obj2);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0018 A[SYNTHETIC] */
    @Override // X.YIV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87151YIh.LJFF(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // X.YIV
    public final void LJI(Object obj, C87149YIf c87149YIf) {
        if (this.LJI) {
            if (!this.LJFF) {
                int length = this.LIZ.length;
                for (int i = 0; i < length; i += 3) {
                    int LJIIIZ = LJIIIZ(i);
                    int i2 = this.LIZ[i];
                    switch ((LJIIIZ >>> 20) & 255) {
                        case 0:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZ.LJLLL(i2, Double.doubleToRawLongBits(C87167YIx.LJ(LJIIIZ & 1048575, obj)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZ.LJLLILLLL(i2, Float.floatToRawIntBits(C87167YIx.LJFF(LJIIIZ & 1048575, obj)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZ.LLD(i2, C87167YIx.LJII(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZ.LLD(i2, C87167YIx.LJII(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZ.LJLLLLLL(i2, C87167YIx.LJI(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZ.LJLLL(i2, C87167YIx.LJII(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZ.LJLLILLLL(i2, C87167YIx.LJI(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZ.LJLL(i2, C87167YIx.LJIILL(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (LJIJJ(i, obj)) {
                                LJIL(i2, C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZJ(i2, LJIIJJI(i), C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZ(i2, (AbstractC87134YHq) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZ.LJZL(i2, C87167YIx.LJI(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZ.LJLLLLLL(i2, C87167YIx.LJI(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZ.LJLLILLLL(i2, C87167YIx.LJI(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZ.LJLLL(i2, C87167YIx.LJII(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (LJIJJ(i, obj)) {
                                int LJI = C87167YIx.LJI(LJIIIZ & 1048575, obj);
                                c87149YIf.LIZ.LJZL(i2, (LJI >> 31) ^ (LJI + LJI));
                                break;
                            } else {
                                break;
                            }
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            if (LJIJJ(i, obj)) {
                                long LJII = C87167YIx.LJII(LJIIIZ & 1048575, obj);
                                c87149YIf.LIZ.LLD(i2, (LJII >> 63) ^ (LJII + LJII));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (LJIJJ(i, obj)) {
                                c87149YIf.LIZIZ(i2, LJIIJJI(i), C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            C87152YIi.LIZJ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 19:
                            C87152YIi.LJI(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 20:
                            C87152YIi.LJIIIZ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 21:
                            C87152YIi.LJIIZILJ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 22:
                            C87152YIi.LJIIIIZZ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 23:
                            C87152YIi.LJFF(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 24:
                            C87152YIi.LJ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 25:
                            C87152YIi.LIZ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 26:
                            C87152YIi.LJIILL(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf);
                            break;
                        case 27:
                            C87152YIi.LJIIJ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, LJIIJJI(i));
                            break;
                        case 28:
                            C87152YIi.LIZIZ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf);
                            break;
                        case 29:
                            C87152YIi.LJIILLIIL(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 30:
                            C87152YIi.LIZLLL(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 31:
                            C87152YIi.LJIIJJI(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 32:
                            C87152YIi.LJIIL(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 33:
                            C87152YIi.LJIILIIL(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 34:
                            C87152YIi.LJIILJJIL(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, false);
                            break;
                        case 35:
                            C87152YIi.LIZJ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case 36:
                            C87152YIi.LJI(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case 37:
                            C87152YIi.LJIIIZ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case 38:
                            C87152YIi.LJIIZILJ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case 39:
                            C87152YIi.LJIIIIZZ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                            C87152YIi.LJFF(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case 41:
                            C87152YIi.LJ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case 42:
                            C87152YIi.LIZ(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                            C87152YIi.LJIILLIIL(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case 44:
                            C87152YIi.LIZLLL(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case 45:
                            C87152YIi.LJIIJJI(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case 46:
                            C87152YIi.LJIIL(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case 47:
                            C87152YIi.LJIILIIL(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                            C87152YIi.LJIILJJIL(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, true);
                            break;
                        case C61447O9r.LJIIJ:
                            C87152YIi.LJII(i2, (List) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf, LJIIJJI(i));
                            break;
                        case 50:
                            if (C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj) != null) {
                                LJIIL(i);
                                throw null;
                            }
                            break;
                        case 51:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZ.LJLLL(i2, Double.doubleToRawLongBits(((Double) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj)).doubleValue()));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZ.LJLLILLLL(i2, Float.floatToRawIntBits(((Float) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj)).floatValue()));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZ.LLD(i2, LJIIJ(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZ.LLD(i2, LJIIJ(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZ.LJLLLLLL(i2, LJJIIJZLJL(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZ.LJLLL(i2, LJIIJ(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZ.LJLLILLLL(i2, LJJIIJZLJL(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZ.LJLL(i2, ((Boolean) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj)).booleanValue());
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (LJIJJLI(i2, i, obj)) {
                                LJIL(i2, C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj), c87149YIf);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZJ(i2, LJIIJJI(i), C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZ(i2, (AbstractC87134YHq) C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case BaseNotice.CREATOR /* 62 */:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZ.LJZL(i2, LJJIIJZLJL(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZ.LJLLLLLL(i2, LJJIIJZLJL(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZ.LJLLILLLL(i2, LJJIIJZLJL(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZ.LJLLL(i2, LJIIJ(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (LJIJJLI(i2, i, obj)) {
                                int LJJIIJZLJL = LJJIIJZLJL(LJIIIZ & 1048575, obj);
                                c87149YIf.LIZ.LJZL(i2, (LJJIIJZLJL >> 31) ^ (LJJIIJZLJL + LJJIIJZLJL));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (LJIJJLI(i2, i, obj)) {
                                long LJIIJ = LJIIJ(LJIIIZ & 1048575, obj);
                                c87149YIf.LIZ.LLD(i2, (LJIIJ >> 63) ^ (LJIIJ + LJIIJ));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (LJIJJLI(i2, i, obj)) {
                                c87149YIf.LIZIZ(i2, LJIIJJI(i), C87167YIx.LJIIIZ(LJIIIZ & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                YJH yjh = this.LJIIJJI;
                yjh.LJIIIIZZ(yjh.LIZJ(obj), c87149YIf);
                return;
            }
            this.LJIIL.LIZ(obj);
            throw null;
        }
        LJIJ(obj, c87149YIf);
    }

    public final void LJIILLIIL(int i, Object obj) {
        int i2 = this.LIZ[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        C87167YIx.LJIIL(j, (1 << (i2 >>> 20)) | C87167YIx.LJI(j, obj), obj);
    }

    public final void LJIJ(Object obj, C87149YIf c87149YIf) {
        int i;
        if (!this.LJFF) {
            int length = this.LIZ.length;
            Unsafe unsafe = LJIILJJIL;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 1048575;
            int i5 = 0;
            while (i3 < length) {
                int LJIIIZ = LJIIIZ(i3);
                int[] iArr = this.LIZ;
                int i6 = iArr[i3];
                int i7 = (LJIIIZ >>> 20) & 255;
                if (i7 <= 17) {
                    int i8 = iArr[i3 + 2];
                    int i9 = i8 & i2;
                    if (i9 != i4) {
                        i5 = unsafe.getInt(obj, i9);
                        i4 = i9;
                    }
                    i = 1 << (i8 >>> 20);
                } else {
                    i = 0;
                }
                long j = LJIIIZ & i2;
                switch (i7) {
                    case 0:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLL(i6, Double.doubleToRawLongBits(C87167YIx.LJ(j, obj)));
                            break;
                        }
                    case 1:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLILLLL(i6, Float.floatToRawIntBits(C87167YIx.LJFF(j, obj)));
                            break;
                        }
                    case 2:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZ.LLD(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 3:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZ.LLD(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 4:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLLLLL(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 5:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLL(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 6:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLILLLL(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 7:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLL(i6, C87167YIx.LJIILL(j, obj));
                            break;
                        }
                    case 8:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            LJIL(i6, unsafe.getObject(obj, j), c87149YIf);
                            break;
                        }
                    case 9:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZJ(i6, LJIIJJI(i3), unsafe.getObject(obj, j));
                            break;
                        }
                    case 10:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZ(i6, (AbstractC87134YHq) unsafe.getObject(obj, j));
                            break;
                        }
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJZL(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 12:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLLLLL(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLILLLL(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 14:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLL(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 15:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            int i10 = unsafe.getInt(obj, j);
                            c87149YIf.LIZ.LJZL(i6, (i10 >> 31) ^ (i10 + i10));
                            break;
                        }
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        if ((i & i5) == 0) {
                            break;
                        } else {
                            long j2 = unsafe.getLong(obj, j);
                            c87149YIf.LIZ.LLD(i6, (j2 >> 63) ^ (j2 + j2));
                            break;
                        }
                    case 17:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c87149YIf.LIZIZ(i6, LJIIJJI(i3), unsafe.getObject(obj, j));
                            break;
                        }
                    case 18:
                        C87152YIi.LIZJ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 19:
                        C87152YIi.LJI(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 20:
                        C87152YIi.LJIIIZ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 21:
                        C87152YIi.LJIIZILJ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 22:
                        C87152YIi.LJIIIIZZ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 23:
                        C87152YIi.LJFF(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 24:
                        C87152YIi.LJ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 25:
                        C87152YIi.LIZ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 26:
                        C87152YIi.LJIILL(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf);
                        break;
                    case 27:
                        C87152YIi.LJIIJ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, LJIIJJI(i3));
                        break;
                    case 28:
                        C87152YIi.LIZIZ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf);
                        break;
                    case 29:
                        C87152YIi.LJIILLIIL(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 30:
                        C87152YIi.LIZLLL(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 31:
                        C87152YIi.LJIIJJI(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 32:
                        C87152YIi.LJIIL(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 33:
                        C87152YIi.LJIILIIL(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 34:
                        C87152YIi.LJIILJJIL(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, false);
                        break;
                    case 35:
                        C87152YIi.LIZJ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case 36:
                        C87152YIi.LJI(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case 37:
                        C87152YIi.LJIIIZ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case 38:
                        C87152YIi.LJIIZILJ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case 39:
                        C87152YIi.LJIIIIZZ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                        C87152YIi.LJFF(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case 41:
                        C87152YIi.LJ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case 42:
                        C87152YIi.LIZ(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                        C87152YIi.LJIILLIIL(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case 44:
                        C87152YIi.LIZLLL(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case 45:
                        C87152YIi.LJIIJJI(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case 46:
                        C87152YIi.LJIIL(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case 47:
                        C87152YIi.LJIILIIL(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                        C87152YIi.LJIILJJIL(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, true);
                        break;
                    case C61447O9r.LJIIJ:
                        C87152YIi.LJII(this.LIZ[i3], (List) unsafe.getObject(obj, j), c87149YIf, LJIIJJI(i3));
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j) != null) {
                            LJIIL(i3);
                            throw null;
                        }
                        break;
                    case 51:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLL(i6, Double.doubleToRawLongBits(((Double) C87167YIx.LJIIIZ(j, obj)).doubleValue()));
                            break;
                        }
                    case 52:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLILLLL(i6, Float.floatToRawIntBits(((Float) C87167YIx.LJIIIZ(j, obj)).floatValue()));
                            break;
                        }
                    case 53:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZ.LLD(i6, LJIIJ(j, obj));
                            break;
                        }
                    case 54:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZ.LLD(i6, LJIIJ(j, obj));
                            break;
                        }
                    case 55:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLLLLL(i6, LJJIIJZLJL(j, obj));
                            break;
                        }
                    case 56:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLL(i6, LJIIJ(j, obj));
                            break;
                        }
                    case 57:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLILLLL(i6, LJJIIJZLJL(j, obj));
                            break;
                        }
                    case 58:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLL(i6, ((Boolean) C87167YIx.LJIIIZ(j, obj)).booleanValue());
                            break;
                        }
                    case 59:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            LJIL(i6, unsafe.getObject(obj, j), c87149YIf);
                            break;
                        }
                    case 60:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZJ(i6, LJIIJJI(i3), unsafe.getObject(obj, j));
                            break;
                        }
                    case 61:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZ(i6, (AbstractC87134YHq) unsafe.getObject(obj, j));
                            break;
                        }
                    case BaseNotice.CREATOR /* 62 */:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJZL(i6, LJJIIJZLJL(j, obj));
                            break;
                        }
                    case 63:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLLLLL(i6, LJJIIJZLJL(j, obj));
                            break;
                        }
                    case 64:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLILLLL(i6, LJJIIJZLJL(j, obj));
                            break;
                        }
                    case 65:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZ.LJLLL(i6, LJIIJ(j, obj));
                            break;
                        }
                    case 66:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            int LJJIIJZLJL = LJJIIJZLJL(j, obj);
                            c87149YIf.LIZ.LJZL(i6, (LJJIIJZLJL >> 31) ^ (LJJIIJZLJL + LJJIIJZLJL));
                            break;
                        }
                    case 67:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            long LJIIJ = LJIIJ(j, obj);
                            c87149YIf.LIZ.LLD(i6, (LJIIJ >> 63) ^ (LJIIJ + LJIIJ));
                            break;
                        }
                    case 68:
                        if (!LJIJJLI(i6, i3, obj)) {
                            break;
                        } else {
                            c87149YIf.LIZIZ(i6, LJIIJJI(i3), unsafe.getObject(obj, j));
                            break;
                        }
                }
                i3 += 3;
                i2 = 1048575;
            }
            YJH yjh = this.LJIIJJI;
            yjh.LJIIIIZZ(yjh.LIZJ(obj), c87149YIf);
            return;
        }
        this.LJIIL.LIZ(obj);
        throw null;
    }

    public final boolean LJIJJ(int i, Object obj) {
        int i2 = this.LIZ[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int LJIIIZ = LJIIIZ(i);
            long j2 = LJIIIZ & 1048575;
            switch ((LJIIIZ >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(C87167YIx.LJ(j2, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C87167YIx.LJFF(j2, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C87167YIx.LJII(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C87167YIx.LJII(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C87167YIx.LJI(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C87167YIx.LJII(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C87167YIx.LJI(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C87167YIx.LJIILL(j2, obj);
                case 8:
                    Object LJIIIZ2 = C87167YIx.LJIIIZ(j2, obj);
                    if (LJIIIZ2 instanceof String) {
                        if (((String) LJIIIZ2).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (LJIIIZ2 instanceof AbstractC87134YHq) {
                        if (AbstractC87134YHq.zzb.equals(LJIIIZ2)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C87167YIx.LJIIIZ(j2, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC87134YHq.zzb.equals(C87167YIx.LJIIIZ(j2, obj))) {
                        return false;
                    }
                    return true;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    if (C87167YIx.LJI(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C87167YIx.LJI(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    if (C87167YIx.LJI(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C87167YIx.LJII(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C87167YIx.LJI(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    if (C87167YIx.LJII(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C87167YIx.LJIIIZ(j2, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((C87167YIx.LJI(j, obj) & (1 << (i2 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    public final int LJJIJIIJIL(int i, int i2) {
        int length = (this.LIZ.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.LIZ[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public static final void LJIL(int i, Object obj, C87149YIf c87149YIf) {
        if (obj instanceof String) {
            c87149YIf.LIZ.LJZ(i, (String) obj);
        } else {
            c87149YIf.LIZ(i, (AbstractC87134YHq) obj);
        }
    }

    public final void LJIILJJIL(int i, Object obj, Object obj2) {
        long LJIIIZ = LJIIIZ(i) & 1048575;
        if (!LJIJJ(i, obj2)) {
            return;
        }
        Object LJIIIZ2 = C87167YIx.LJIIIZ(LJIIIZ, obj);
        Object LJIIIZ3 = C87167YIx.LJIIIZ(LJIIIZ, obj2);
        if (LJIIIZ2 != null) {
            if (LJIIIZ3 == null) {
                return;
            }
            C87167YIx.LJIILIIL(LJIIIZ, obj, YIG.LIZIZ(LJIIIZ2, LJIIIZ3));
            LJIILLIIL(i, obj);
            return;
        }
        if (LJIIIZ3 == null) {
            return;
        }
        C87167YIx.LJIILIIL(LJIIIZ, obj, LJIIIZ3);
        LJIILLIIL(i, obj);
    }

    public final void LJIILL(int i, Object obj, Object obj2) {
        Object obj3;
        int LJIIIZ = LJIIIZ(i);
        int i2 = this.LIZ[i];
        long j = LJIIIZ & 1048575;
        if (!LJIJJLI(i2, i, obj2)) {
            return;
        }
        if (LJIJJLI(i2, i, obj)) {
            obj3 = C87167YIx.LJIIIZ(j, obj);
        } else {
            obj3 = null;
        }
        Object LJIIIZ2 = C87167YIx.LJIIIZ(j, obj2);
        if (obj3 != null) {
            if (LJIIIZ2 == null) {
                return;
            }
            C87167YIx.LJIILIIL(j, obj, YIG.LIZIZ(obj3, LJIIIZ2));
            LJIIZILJ(i2, i, obj);
            return;
        }
        if (LJIIIZ2 == null) {
            return;
        }
        C87167YIx.LJIILIIL(j, obj, LJIIIZ2);
        LJIIZILJ(i2, i, obj);
    }

    public final void LJIIZILJ(int i, int i2, Object obj) {
        C87167YIx.LJIIL(this.LIZ[i2 + 2] & 1048575, i, obj);
    }

    public final boolean LJIJI(int i, Object obj, Object obj2) {
        if (LJIJJ(i, obj) == LJIJJ(i, obj2)) {
            return true;
        }
        return false;
    }

    public final boolean LJIJJLI(int i, int i2, Object obj) {
        if (C87167YIx.LJI(this.LIZ[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    public final void LJJIIZ(Object obj, int i, long j) {
        C65877PtJ c65877PtJ;
        Unsafe unsafe = LJIILJJIL;
        LJIIL(i);
        C65877PtJ c65877PtJ2 = (C65877PtJ) unsafe.getObject(obj, j);
        if (!c65877PtJ2.zze()) {
            C65877PtJ zzb = C65877PtJ.zza().zzb();
            if (!c65877PtJ2.isEmpty()) {
                if (!zzb.zze()) {
                    c65877PtJ = zzb.zzb();
                } else {
                    c65877PtJ = zzb;
                }
                c65877PtJ.zzd(c65877PtJ2);
            }
            unsafe.putObject(obj, j, zzb);
        }
        throw null;
    }

    public static C87151YIh LJJIFFI(InterfaceC87182YJm interfaceC87182YJm, XM6 xm6, YJH yjh, AbstractC87178YJi abstractC87178YJi, C65878PtK c65878PtK) {
        if (interfaceC87182YJm instanceof YJW) {
            return LJJII((YJW) interfaceC87182YJm, xm6, yjh, abstractC87178YJi, c65878PtK);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C87151YIh LJJII(X.YJW r36, X.XM6 r37, X.YJH r38, X.AbstractC87178YJi r39, X.C65878PtK r40) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87151YIh.LJJII(X.YJW, X.XM6, X.YJH, X.YJi, X.PtK):X.YIh");
    }

    @Override // X.YIV
    public final void LJII(Object obj, byte[] bArr, int i, int i2, C87175YJf c87175YJf) {
        if (this.LJI) {
            LJJIJ(obj, bArr, i, i2, c87175YJf);
        } else {
            LJJ(obj, bArr, i, i2, 0, c87175YJf);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023e, code lost:
    
        if (r8 != r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x020d, code lost:
    
        if (r8 != r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020f, code lost:
    
        r13 = r2;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00a7. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ(java.lang.Object r38, byte[] r39, int r40, int r41, X.C87175YJf r42) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87151YIh.LJJIJ(java.lang.Object, byte[], int, int, X.YJf):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x02b1, code lost:
    
        if (r3 != r4) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02b3, code lost:
    
        r20 = r39;
        r13 = r46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x032e, code lost:
    
        r4 = r3;
        r13 = r46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02e3, code lost:
    
        if (r3 != r4) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005c, code lost:
    
        if (r22 == 1048575) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005e, code lost:
    
        r12.putInt(r49, r22, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0064, code lost:
    
        r6 = r48.LJIIIIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0068, code lost:
    
        if (r6 >= r48.LJIIIZ) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x006a, code lost:
    
        r2 = r48.LJII[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0078, code lost:
    
        if (X.C87167YIx.LJIIIZ(LJIIIZ(r2) & 1048575, r49) != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007d, code lost:
    
        r0 = r2 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0086, code lost:
    
        if (r48.LIZIZ[(r0 + r0) + 1] != null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0348, code lost:
    
        LJIIL(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x034b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007a, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x034e, code lost:
    
        if (r53 != 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0352, code lost:
    
        if (r3 != r28) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0354, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0365, code lost:
    
        throw new X.C87144YIa("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0357, code lost:
    
        if (r3 > r28) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x035d, code lost:
    
        if (r20 != r53) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x036b, code lost:
    
        throw new X.C87144YIa("Failed to parse the message.");
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00ca. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0054 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJ(java.lang.Object r49, byte[] r50, int r51, int r52, int r53, X.C87175YJf r54) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87151YIh.LJJ(java.lang.Object, byte[], int, int, int, X.YJf):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0025. Please report as an issue. */
    public final int LJJIIZI(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C87175YJf c87175YJf) {
        boolean z;
        Object object;
        Object object2;
        int i9 = i;
        Unsafe unsafe = LJIILJJIL;
        long j2 = this.LIZ[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(C87150YIg.LJIILIIL(i9, bArr))));
                    unsafe.putInt(obj, j2, i4);
                    return i9 + 8;
                }
                return i9;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(C87150YIg.LIZIZ(i9, bArr))));
                    unsafe.putInt(obj, j2, i4);
                    return i9 + 4;
                }
                return i9;
            case 53:
            case 54:
                if (i5 == 0) {
                    int LJIIL = C87150YIg.LJIIL(bArr, i9, c87175YJf);
                    unsafe.putObject(obj, j, Long.valueOf(c87175YJf.LIZIZ));
                    unsafe.putInt(obj, j2, i4);
                    return LJIIL;
                }
                return i9;
            case 55:
            case BaseNotice.CREATOR /* 62 */:
                if (i5 == 0) {
                    int LJIIIZ = C87150YIg.LJIIIZ(bArr, i9, c87175YJf);
                    unsafe.putObject(obj, j, Integer.valueOf(c87175YJf.LIZ));
                    unsafe.putInt(obj, j2, i4);
                    return LJIIIZ;
                }
                return i9;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(C87150YIg.LJIILIIL(i9, bArr)));
                    unsafe.putInt(obj, j2, i4);
                    return i9 + 8;
                }
                return i9;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(C87150YIg.LIZIZ(i9, bArr)));
                    unsafe.putInt(obj, j2, i4);
                    return i9 + 4;
                }
                return i9;
            case 58:
                if (i5 == 0) {
                    int LJIIL2 = C87150YIg.LJIIL(bArr, i9, c87175YJf);
                    if (c87175YJf.LIZIZ != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return LJIIL2;
                }
                return i9;
            case 59:
                if (i5 == 2) {
                    i9 = C87150YIg.LJIIIZ(bArr, i9, c87175YJf);
                    int i10 = c87175YJf.LIZ;
                    if (i10 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0) {
                            C64524PUa.LIZ.getClass();
                            if (!AbstractC64527PUd.LIZ(i9, bArr, i9 + i10)) {
                                throw C87144YIa.LIZ();
                            }
                        }
                        unsafe.putObject(obj, j, new String(bArr, i9, i10, YIG.LIZ));
                        i9 += i10;
                    }
                    unsafe.putInt(obj, j2, i4);
                }
                return i9;
            case 60:
                if (i5 == 2) {
                    i9 = C87150YIg.LIZLLL(LJIIJJI(i8), bArr, i9, i2, c87175YJf);
                    if (unsafe.getInt(obj, j2) != i4 || (object = unsafe.getObject(obj, j)) == null) {
                        unsafe.putObject(obj, j, c87175YJf.LIZJ);
                    } else {
                        unsafe.putObject(obj, j, YIG.LIZIZ(object, c87175YJf.LIZJ));
                    }
                    unsafe.putInt(obj, j2, i4);
                }
                return i9;
            case 61:
                if (i5 == 2) {
                    int LIZ = C87150YIg.LIZ(bArr, i9, c87175YJf);
                    unsafe.putObject(obj, j, c87175YJf.LIZJ);
                    unsafe.putInt(obj, j2, i4);
                    return LIZ;
                }
                return i9;
            case 63:
                if (i5 == 0) {
                    i9 = C87150YIg.LJIIIZ(bArr, i9, c87175YJf);
                    int i11 = c87175YJf.LIZ;
                    int i12 = i8 / 3;
                    InterfaceC68354QsA interfaceC68354QsA = (InterfaceC68354QsA) this.LIZIZ[i12 + i12 + 1];
                    if (interfaceC68354QsA == null || interfaceC68354QsA.LIZ(i11)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i11));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        LJJI(obj).LIZJ(i3, Long.valueOf(i11));
                    }
                }
                return i9;
            case 66:
                if (i5 == 0) {
                    int LJIIIZ2 = C87150YIg.LJIIIZ(bArr, i9, c87175YJf);
                    unsafe.putObject(obj, j, Integer.valueOf(YIL.LIZ(c87175YJf.LIZ)));
                    unsafe.putInt(obj, j2, i4);
                    return LJIIIZ2;
                }
                return i9;
            case 67:
                if (i5 == 0) {
                    int LJIIL3 = C87150YIg.LJIIL(bArr, i9, c87175YJf);
                    unsafe.putObject(obj, j, Long.valueOf(YIL.LIZIZ(c87175YJf.LIZIZ)));
                    unsafe.putInt(obj, j2, i4);
                    return LJIIL3;
                }
                return i9;
            case 68:
                if (i5 == 3) {
                    i9 = C87150YIg.LIZJ(LJIIJJI(i8), bArr, i9, i2, (i3 & (-8)) | 4, c87175YJf);
                    if (unsafe.getInt(obj, j2) != i4 || (object2 = unsafe.getObject(obj, j)) == null) {
                        unsafe.putObject(obj, j, c87175YJf.LIZJ);
                    } else {
                        unsafe.putObject(obj, j, YIG.LIZIZ(object2, c87175YJf.LIZJ));
                    }
                    unsafe.putInt(obj, j2, i4);
                }
                return i9;
            default:
                return i9;
        }
    }

    public final int LJJIJIIJI(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C87175YJf c87175YJf) {
        int LJIIJJI;
        boolean z;
        boolean z2;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = i;
        Unsafe unsafe = LJIILJJIL;
        XM7 xm7 = (XM7) unsafe.getObject(obj, j2);
        if (!xm7.LIZIZ()) {
            int size = xm7.size();
            if (size == 0) {
                i12 = 10;
            } else {
                i12 = size + size;
            }
            xm7 = xm7.LJIJI(i12);
            unsafe.putObject(obj, j2, xm7);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    C84687XLn c84687XLn = (C84687XLn) xm7;
                    int LJIIIZ = C87150YIg.LJIIIZ(bArr, i13, c87175YJf);
                    int i14 = c87175YJf.LIZ + LJIIIZ;
                    while (LJIIIZ < i14) {
                        c84687XLn.LJFF(Double.longBitsToDouble(C87150YIg.LJIILIIL(LJIIIZ, bArr)));
                        LJIIIZ += 8;
                    }
                    if (LJIIIZ != i14) {
                        throw C87144YIa.LIZJ();
                    }
                    return LJIIIZ;
                }
                if (i5 == 1) {
                    C84687XLn c84687XLn2 = (C84687XLn) xm7;
                    c84687XLn2.LJFF(Double.longBitsToDouble(C87150YIg.LJIILIIL(i13, bArr)));
                    while (true) {
                        i11 = i13 + 8;
                        if (i11 < i2) {
                            i13 = C87150YIg.LJIIIZ(bArr, i11, c87175YJf);
                            if (i3 == c87175YJf.LIZ) {
                                c84687XLn2.LJFF(Double.longBitsToDouble(C87150YIg.LJIILIIL(i13, bArr)));
                            }
                        }
                    }
                    return i11;
                }
                return i13;
            case 19:
            case 36:
                if (i5 == 2) {
                    C84685XLl c84685XLl = (C84685XLl) xm7;
                    int LJIIIZ2 = C87150YIg.LJIIIZ(bArr, i13, c87175YJf);
                    int i15 = c87175YJf.LIZ + LJIIIZ2;
                    while (LJIIIZ2 < i15) {
                        c84685XLl.LJFF(Float.intBitsToFloat(C87150YIg.LIZIZ(LJIIIZ2, bArr)));
                        LJIIIZ2 += 4;
                    }
                    if (LJIIIZ2 != i15) {
                        throw C87144YIa.LIZJ();
                    }
                    return LJIIIZ2;
                }
                if (i5 == 5) {
                    C84685XLl c84685XLl2 = (C84685XLl) xm7;
                    c84685XLl2.LJFF(Float.intBitsToFloat(C87150YIg.LIZIZ(i13, bArr)));
                    while (true) {
                        i10 = i13 + 4;
                        if (i10 < i2) {
                            i13 = C87150YIg.LJIIIZ(bArr, i10, c87175YJf);
                            if (i3 == c87175YJf.LIZ) {
                                c84685XLl2.LJFF(Float.intBitsToFloat(C87150YIg.LIZIZ(i13, bArr)));
                            }
                        }
                    }
                    return i10;
                }
                return i13;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    C84686XLm c84686XLm = (C84686XLm) xm7;
                    int LJIIIZ3 = C87150YIg.LJIIIZ(bArr, i13, c87175YJf);
                    int i16 = c87175YJf.LIZ + LJIIIZ3;
                    while (LJIIIZ3 < i16) {
                        LJIIIZ3 = C87150YIg.LJIIL(bArr, LJIIIZ3, c87175YJf);
                        c84686XLm.LJFF(c87175YJf.LIZIZ);
                    }
                    if (LJIIIZ3 != i16) {
                        throw C87144YIa.LIZJ();
                    }
                    return LJIIIZ3;
                }
                if (i5 == 0) {
                    C84686XLm c84686XLm2 = (C84686XLm) xm7;
                    int LJIIL = C87150YIg.LJIIL(bArr, i13, c87175YJf);
                    c84686XLm2.LJFF(c87175YJf.LIZIZ);
                    while (LJIIL < i2) {
                        int LJIIIZ4 = C87150YIg.LJIIIZ(bArr, LJIIL, c87175YJf);
                        if (i3 != c87175YJf.LIZ) {
                            return LJIIL;
                        }
                        LJIIL = C87150YIg.LJIIL(bArr, LJIIIZ4, c87175YJf);
                        c84686XLm2.LJFF(c87175YJf.LIZIZ);
                    }
                    return LJIIL;
                }
                return i13;
            case 22:
            case 29:
            case 39:
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                if (i5 == 2) {
                    return C87150YIg.LJFF(bArr, i13, xm7, c87175YJf);
                }
                if (i5 == 0) {
                    return C87150YIg.LJIIJJI(i3, bArr, i13, i2, xm7, c87175YJf);
                }
                return i13;
            case 23:
            case 32:
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
            case 46:
                if (i5 == 2) {
                    C84686XLm c84686XLm3 = (C84686XLm) xm7;
                    int LJIIIZ5 = C87150YIg.LJIIIZ(bArr, i13, c87175YJf);
                    int i17 = c87175YJf.LIZ + LJIIIZ5;
                    while (LJIIIZ5 < i17) {
                        c84686XLm3.LJFF(C87150YIg.LJIILIIL(LJIIIZ5, bArr));
                        LJIIIZ5 += 8;
                    }
                    if (LJIIIZ5 != i17) {
                        throw C87144YIa.LIZJ();
                    }
                    return LJIIIZ5;
                }
                if (i5 == 1) {
                    C84686XLm c84686XLm4 = (C84686XLm) xm7;
                    c84686XLm4.LJFF(C87150YIg.LJIILIIL(i13, bArr));
                    while (true) {
                        i9 = i13 + 8;
                        if (i9 < i2) {
                            i13 = C87150YIg.LJIIIZ(bArr, i9, c87175YJf);
                            if (i3 == c87175YJf.LIZ) {
                                c84686XLm4.LJFF(C87150YIg.LJIILIIL(i13, bArr));
                            }
                        }
                    }
                    return i9;
                }
                return i13;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    C84684XLk c84684XLk = (C84684XLk) xm7;
                    int LJIIIZ6 = C87150YIg.LJIIIZ(bArr, i13, c87175YJf);
                    int i18 = c87175YJf.LIZ + LJIIIZ6;
                    while (LJIIIZ6 < i18) {
                        c84684XLk.LJFF(C87150YIg.LIZIZ(LJIIIZ6, bArr));
                        LJIIIZ6 += 4;
                    }
                    if (LJIIIZ6 != i18) {
                        throw C87144YIa.LIZJ();
                    }
                    return LJIIIZ6;
                }
                if (i5 == 5) {
                    C84684XLk c84684XLk2 = (C84684XLk) xm7;
                    c84684XLk2.LJFF(C87150YIg.LIZIZ(i13, bArr));
                    while (true) {
                        i8 = i13 + 4;
                        if (i8 < i2) {
                            i13 = C87150YIg.LJIIIZ(bArr, i8, c87175YJf);
                            if (i3 == c87175YJf.LIZ) {
                                c84684XLk2.LJFF(C87150YIg.LIZIZ(i13, bArr));
                            }
                        }
                    }
                    return i8;
                }
                return i13;
            case 25:
            case 42:
                if (i5 == 2) {
                    C84683XLj c84683XLj = (C84683XLj) xm7;
                    int LJIIIZ7 = C87150YIg.LJIIIZ(bArr, i13, c87175YJf);
                    int i19 = c87175YJf.LIZ + LJIIIZ7;
                    while (LJIIIZ7 < i19) {
                        LJIIIZ7 = C87150YIg.LJIIL(bArr, LJIIIZ7, c87175YJf);
                        if (c87175YJf.LIZIZ != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c84683XLj.LJFF(z3);
                    }
                    if (LJIIIZ7 != i19) {
                        throw C87144YIa.LIZJ();
                    }
                    return LJIIIZ7;
                }
                if (i5 == 0) {
                    C84683XLj c84683XLj2 = (C84683XLj) xm7;
                    int LJIIL2 = C87150YIg.LJIIL(bArr, i13, c87175YJf);
                    if (c87175YJf.LIZIZ != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c84683XLj2.LJFF(z);
                    while (LJIIL2 < i2) {
                        int LJIIIZ8 = C87150YIg.LJIIIZ(bArr, LJIIL2, c87175YJf);
                        if (i3 != c87175YJf.LIZ) {
                            return LJIIL2;
                        }
                        LJIIL2 = C87150YIg.LJIIL(bArr, LJIIIZ8, c87175YJf);
                        if (c87175YJf.LIZIZ != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c84683XLj2.LJFF(z2);
                    }
                    return LJIIL2;
                }
                return i13;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int LJIIIZ9 = C87150YIg.LJIIIZ(bArr, i13, c87175YJf);
                        int i20 = c87175YJf.LIZ;
                        if (i20 >= 0) {
                            if (i20 == 0) {
                                xm7.add("");
                            } else {
                                xm7.add(new String(bArr, LJIIIZ9, i20, YIG.LIZ));
                                LJIIIZ9 += i20;
                            }
                            while (LJIIIZ9 < i2) {
                                int LJIIIZ10 = C87150YIg.LJIIIZ(bArr, LJIIIZ9, c87175YJf);
                                if (i3 == c87175YJf.LIZ) {
                                    LJIIIZ9 = C87150YIg.LJIIIZ(bArr, LJIIIZ10, c87175YJf);
                                    int i21 = c87175YJf.LIZ;
                                    if (i21 >= 0) {
                                        if (i21 == 0) {
                                            xm7.add("");
                                        } else {
                                            xm7.add(new String(bArr, LJIIIZ9, i21, YIG.LIZ));
                                            LJIIIZ9 += i21;
                                        }
                                    } else {
                                        throw C87144YIa.LIZIZ();
                                    }
                                } else {
                                    return LJIIIZ9;
                                }
                            }
                            return LJIIIZ9;
                        }
                        throw C87144YIa.LIZIZ();
                    }
                    int LJIIIZ11 = C87150YIg.LJIIIZ(bArr, i13, c87175YJf);
                    int i22 = c87175YJf.LIZ;
                    if (i22 >= 0) {
                        if (i22 == 0) {
                            xm7.add("");
                        } else {
                            int i23 = LJIIIZ11 + i22;
                            C64524PUa.LIZ.getClass();
                            if (AbstractC64527PUd.LIZ(LJIIIZ11, bArr, i23)) {
                                xm7.add(new String(bArr, LJIIIZ11, i22, YIG.LIZ));
                                LJIIIZ11 = i23;
                            } else {
                                throw C87144YIa.LIZ();
                            }
                        }
                        while (LJIIIZ11 < i2) {
                            int LJIIIZ12 = C87150YIg.LJIIIZ(bArr, LJIIIZ11, c87175YJf);
                            if (i3 == c87175YJf.LIZ) {
                                LJIIIZ11 = C87150YIg.LJIIIZ(bArr, LJIIIZ12, c87175YJf);
                                int i24 = c87175YJf.LIZ;
                                if (i24 >= 0) {
                                    if (i24 == 0) {
                                        xm7.add("");
                                    } else {
                                        int i25 = LJIIIZ11 + i24;
                                        C64524PUa.LIZ.getClass();
                                        if (AbstractC64527PUd.LIZ(LJIIIZ11, bArr, i25)) {
                                            xm7.add(new String(bArr, LJIIIZ11, i24, YIG.LIZ));
                                            LJIIIZ11 = i25;
                                        } else {
                                            throw C87144YIa.LIZ();
                                        }
                                    }
                                } else {
                                    throw C87144YIa.LIZIZ();
                                }
                            } else {
                                return LJIIIZ11;
                            }
                        }
                        return LJIIIZ11;
                    }
                    throw C87144YIa.LIZIZ();
                }
                return i13;
            case 27:
                if (i5 != 2) {
                    return i13;
                }
                return C87150YIg.LJ(LJIIJJI(i6), i3, bArr, i13, i2, xm7, c87175YJf);
            case 28:
                if (i5 == 2) {
                    int LJIIIZ13 = C87150YIg.LJIIIZ(bArr, i13, c87175YJf);
                    int i26 = c87175YJf.LIZ;
                    if (i26 >= 0) {
                        if (i26 <= bArr.length - LJIIIZ13) {
                            if (i26 == 0) {
                                xm7.add(AbstractC87134YHq.zzb);
                            } else {
                                xm7.add(AbstractC87134YHq.zzl(bArr, LJIIIZ13, i26));
                                LJIIIZ13 += i26;
                            }
                            while (LJIIIZ13 < i2) {
                                int LJIIIZ14 = C87150YIg.LJIIIZ(bArr, LJIIIZ13, c87175YJf);
                                if (i3 != c87175YJf.LIZ) {
                                    return LJIIIZ13;
                                }
                                LJIIIZ13 = C87150YIg.LJIIIZ(bArr, LJIIIZ14, c87175YJf);
                                int i27 = c87175YJf.LIZ;
                                if (i27 >= 0) {
                                    if (i27 <= bArr.length - LJIIIZ13) {
                                        if (i27 == 0) {
                                            xm7.add(AbstractC87134YHq.zzb);
                                        } else {
                                            xm7.add(AbstractC87134YHq.zzl(bArr, LJIIIZ13, i27));
                                            LJIIIZ13 += i27;
                                        }
                                    } else {
                                        throw C87144YIa.LIZJ();
                                    }
                                } else {
                                    throw C87144YIa.LIZIZ();
                                }
                            }
                            return LJIIIZ13;
                        }
                        throw C87144YIa.LIZJ();
                    }
                    throw C87144YIa.LIZIZ();
                }
                return i13;
            case 30:
            case 44:
                if (i5 == 2) {
                    LJIIJJI = C87150YIg.LJFF(bArr, i13, xm7, c87175YJf);
                } else if (i5 == 0) {
                    LJIIJJI = C87150YIg.LJIIJJI(i3, bArr, i13, i2, xm7, c87175YJf);
                } else {
                    return i13;
                }
                YIN yin = (YIN) obj;
                C87157YIn c87157YIn = yin.zzc;
                if (c87157YIn == C87157YIn.LJFF) {
                    c87157YIn = null;
                }
                int i28 = i6 / 3;
                InterfaceC68354QsA interfaceC68354QsA = (InterfaceC68354QsA) this.LIZIZ[i28 + i28 + 1];
                YJH yjh = this.LJIIJJI;
                if (interfaceC68354QsA != null) {
                    if (xm7 instanceof RandomAccess) {
                        int size2 = xm7.size();
                        int i29 = 0;
                        for (int i30 = 0; i30 < size2; i30++) {
                            int intValue = ((Integer) ListProtector.get(xm7, i30)).intValue();
                            if (interfaceC68354QsA.LIZ(intValue)) {
                                if (i30 != i29) {
                                    ListProtector.set(xm7, i29, Integer.valueOf(intValue));
                                }
                                i29++;
                            } else {
                                if (c87157YIn == null) {
                                    c87157YIn = yjh.LJ();
                                }
                                yjh.LJFF(intValue, i4, c87157YIn);
                            }
                        }
                        if (i29 != size2) {
                            xm7.subList(i29, size2).clear();
                        }
                    } else {
                        Iterator it = xm7.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!interfaceC68354QsA.LIZ(intValue2)) {
                                if (c87157YIn == null) {
                                    c87157YIn = yjh.LJ();
                                }
                                yjh.LJFF(intValue2, i4, c87157YIn);
                                it.remove();
                            }
                        }
                    }
                }
                if (c87157YIn != null) {
                    yin.zzc = c87157YIn;
                    return LJIIJJI;
                }
                return LJIIJJI;
            case 33:
            case 47:
                if (i5 == 2) {
                    C84684XLk c84684XLk3 = (C84684XLk) xm7;
                    int LJIIIZ15 = C87150YIg.LJIIIZ(bArr, i13, c87175YJf);
                    int i31 = c87175YJf.LIZ + LJIIIZ15;
                    while (LJIIIZ15 < i31) {
                        LJIIIZ15 = C87150YIg.LJIIIZ(bArr, LJIIIZ15, c87175YJf);
                        c84684XLk3.LJFF(YIL.LIZ(c87175YJf.LIZ));
                    }
                    if (LJIIIZ15 != i31) {
                        throw C87144YIa.LIZJ();
                    }
                    return LJIIIZ15;
                }
                if (i5 == 0) {
                    C84684XLk c84684XLk4 = (C84684XLk) xm7;
                    int LJIIIZ16 = C87150YIg.LJIIIZ(bArr, i13, c87175YJf);
                    c84684XLk4.LJFF(YIL.LIZ(c87175YJf.LIZ));
                    while (LJIIIZ16 < i2) {
                        int LJIIIZ17 = C87150YIg.LJIIIZ(bArr, LJIIIZ16, c87175YJf);
                        if (i3 != c87175YJf.LIZ) {
                            return LJIIIZ16;
                        }
                        LJIIIZ16 = C87150YIg.LJIIIZ(bArr, LJIIIZ17, c87175YJf);
                        c84684XLk4.LJFF(YIL.LIZ(c87175YJf.LIZ));
                    }
                    return LJIIIZ16;
                }
                return i13;
            case 34:
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                if (i5 == 2) {
                    C84686XLm c84686XLm5 = (C84686XLm) xm7;
                    int LJIIIZ18 = C87150YIg.LJIIIZ(bArr, i13, c87175YJf);
                    int i32 = c87175YJf.LIZ + LJIIIZ18;
                    while (LJIIIZ18 < i32) {
                        LJIIIZ18 = C87150YIg.LJIIL(bArr, LJIIIZ18, c87175YJf);
                        c84686XLm5.LJFF(YIL.LIZIZ(c87175YJf.LIZIZ));
                    }
                    if (LJIIIZ18 != i32) {
                        throw C87144YIa.LIZJ();
                    }
                    return LJIIIZ18;
                }
                if (i5 == 0) {
                    C84686XLm c84686XLm6 = (C84686XLm) xm7;
                    int LJIIL3 = C87150YIg.LJIIL(bArr, i13, c87175YJf);
                    c84686XLm6.LJFF(YIL.LIZIZ(c87175YJf.LIZIZ));
                    while (LJIIL3 < i2) {
                        int LJIIIZ19 = C87150YIg.LJIIIZ(bArr, LJIIL3, c87175YJf);
                        if (i3 != c87175YJf.LIZ) {
                            return LJIIL3;
                        }
                        LJIIL3 = C87150YIg.LJIIL(bArr, LJIIIZ19, c87175YJf);
                        c84686XLm6.LJFF(YIL.LIZIZ(c87175YJf.LIZIZ));
                    }
                    return LJIIL3;
                }
                return i13;
            default:
                if (i5 == 3) {
                    YIV LJIIJJI2 = LJIIJJI(i6);
                    int i33 = (i3 & (-8)) | 4;
                    int LIZJ = C87150YIg.LIZJ(LJIIJJI2, bArr, i13, i2, i33, c87175YJf);
                    xm7.add(c87175YJf.LIZJ);
                    while (LIZJ < i2) {
                        int LJIIIZ20 = C87150YIg.LJIIIZ(bArr, LIZJ, c87175YJf);
                        if (i3 != c87175YJf.LIZ) {
                            return LIZJ;
                        }
                        LIZJ = C87150YIg.LIZJ(LJIIJJI2, bArr, LJIIIZ20, i2, i33, c87175YJf);
                        xm7.add(c87175YJf.LIZJ);
                    }
                    return LIZJ;
                }
                return i13;
        }
    }

    public C87151YIh(int[] iArr, Object[] objArr, int i, int i2, YIH yih, boolean z, int[] iArr2, int i3, int i4, XM6 xm6, YJH yjh, AbstractC87178YJi abstractC87178YJi, C65878PtK c65878PtK) {
        boolean z2;
        this.LIZ = iArr;
        this.LIZIZ = objArr;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJI = z;
        if (abstractC87178YJi != null && abstractC87178YJi.LIZJ(yih)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJFF = z2;
        this.LJII = iArr2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = i4;
        this.LJIIJ = xm6;
        this.LJIIJJI = yjh;
        this.LJIIL = abstractC87178YJi;
        this.LJ = yih;
    }
}
