package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEWaterMarkPosition;
import com.ss.android.vesdk.VEWatermarkParam;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HOV {
    public static int LIZ;
    public static int LIZIZ;
    public static VEUtils.VEVideoFileInfo LIZJ;

    public static final boolean LIZJ(int i, int i2) {
        if (Math.abs((i / (i2 * 1.0d)) - 1.7777777777777777d) < 0.001d) {
            return true;
        }
        return false;
    }

    public static final HOW LIZIZ(CreativeInfo creativeInfo, int i, String str, boolean z, int[] iArr) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        if (z) {
            return new HN9(creativeInfo, str, iArr[0], iArr[1], i);
        }
        if (i == 16 || i == 17) {
            return new HN8(creativeInfo, str, iArr[0], iArr[1]);
        }
        return new HNA(creativeInfo, str, iArr[0], iArr[1], i);
    }

    public static final VEWatermarkParam LIZ(HOW how, InterfaceC45930I0w interfaceC45930I0w, int[] iArr, boolean z, String str, boolean z2, String str2) {
        float f;
        int i;
        int i2;
        double d;
        double d2;
        VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity;
        VEWatermarkParam.VEWatermarkEntity[] vEWatermarkEntityArr;
        double d3;
        VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity2;
        int i3;
        int i4;
        VEWatermarkParam.VEWatermarkEntity[] vEWatermarkEntityArr2;
        double d4;
        if (how instanceof HNA) {
            String[] LJFF = how.LJFF(true, interfaceC45930I0w);
            String[] LJFF2 = how.LJFF(false, interfaceC45930I0w);
            String[] LIZJ2 = how.LIZJ(str2, interfaceC45930I0w);
            HNB LIZLLL = how.LIZLLL();
            CreativeInfo LIZIZ2 = how.LIZIZ();
            o.LJIIIIZZ(LIZIZ2, "provider.creativeInfo");
            if (LJFF != null && LJFF.length != 0 && LIZLLL != null) {
                VEWatermarkParam vEWatermarkParam = new VEWatermarkParam();
                int i5 = iArr[0];
                int i6 = iArr[1];
                if (i6 > i5) {
                    d3 = i5;
                } else {
                    d3 = i6;
                }
                double d5 = 10;
                int i7 = (int) ((d3 / 750.0d) * d5);
                int[] LIZ2 = C5LB.LIZ(LJFF[0]);
                int i8 = LIZ2[0];
                int i9 = LIZ2[1];
                VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity3 = new VEWatermarkParam.VEWatermarkEntity();
                vEWatermarkEntity3.images = LJFF;
                vEWatermarkEntity3.interval = 2;
                vEWatermarkEntity3.width = i8;
                vEWatermarkEntity3.height = i9;
                vEWatermarkEntity3.xOffset = i7;
                vEWatermarkEntity3.yOffset = LIZIZ + i7;
                vEWatermarkEntity3.position = VEWaterMarkPosition.TL;
                int i10 = LIZ;
                if (i10 == 0 || z) {
                    vEWatermarkEntity3.sequenceIn = -1L;
                    vEWatermarkEntity3.sequenceOut = -1L;
                } else {
                    vEWatermarkEntity3.sequenceIn = 0L;
                    vEWatermarkEntity3.sequenceOut = (long) (i10 / 2.0d);
                }
                VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity4 = new VEWatermarkParam.VEWatermarkEntity();
                vEWatermarkEntity4.images = LJFF2;
                vEWatermarkEntity4.interval = 2;
                vEWatermarkEntity4.width = i8;
                vEWatermarkEntity4.height = i9;
                vEWatermarkEntity4.xOffset = i7;
                vEWatermarkEntity4.yOffset = i7 + LIZIZ;
                vEWatermarkEntity4.position = VEWaterMarkPosition.BR;
                int i11 = LIZ;
                if (i11 == 0 || z) {
                    vEWatermarkEntity4.sequenceIn = -1L;
                    vEWatermarkEntity4.sequenceOut = -1L;
                } else {
                    vEWatermarkEntity4.sequenceIn = (long) ((i11 / 2.0d) + 1);
                    vEWatermarkEntity4.sequenceOut = i11;
                }
                if (LIZJ2 == null || LIZJ2.length == 0) {
                    vEWatermarkEntity2 = null;
                } else {
                    int[] LIZ3 = C5LB.LIZ(LIZJ2[0]);
                    vEWatermarkEntity2 = new VEWatermarkParam.VEWatermarkEntity();
                    vEWatermarkEntity2.images = LIZJ2;
                    vEWatermarkEntity2.interval = 2;
                    vEWatermarkEntity2.width = LIZ3[0];
                    vEWatermarkEntity2.height = LIZ3[1];
                    vEWatermarkEntity2.xOffset = 0;
                    vEWatermarkEntity2.yOffset = 0;
                    vEWatermarkEntity2.position = VEWaterMarkPosition.BL;
                    int i12 = LIZ;
                    if (i12 == 0 || z) {
                        vEWatermarkEntity2.sequenceIn = 0L;
                        vEWatermarkEntity2.sequenceOut = 2147483647L;
                    } else {
                        vEWatermarkEntity2.sequenceIn = 0L;
                        vEWatermarkEntity2.sequenceOut = i12;
                    }
                }
                VEUtils.VEVideoFileInfo vEVideoFileInfo = LIZJ;
                if (vEVideoFileInfo != null) {
                    i3 = vEVideoFileInfo.height;
                    i4 = vEVideoFileInfo.width;
                } else {
                    i3 = i6;
                    i4 = i5;
                }
                if (i4 / (i3 * 1.0d) < 0.8d) {
                    if (i6 > i5) {
                        d4 = i5;
                    } else {
                        d4 = i6;
                    }
                    vEWatermarkEntity3.yOffset = (i6 - vEWatermarkEntity3.height) / 2;
                    vEWatermarkEntity4.yOffset = (int) ((d5 * (d4 / 750.0d)) + ((i6 - (i5 * 1.25d)) / 2.0d));
                }
                if (vEWatermarkEntity2 == null) {
                    vEWatermarkEntityArr2 = new VEWatermarkParam.VEWatermarkEntity[]{vEWatermarkEntity3, vEWatermarkEntity4};
                } else {
                    vEWatermarkEntityArr2 = new VEWatermarkParam.VEWatermarkEntity[]{vEWatermarkEntity3, vEWatermarkEntity4, vEWatermarkEntity2};
                }
                vEWatermarkParam.setEntities(vEWatermarkEntityArr2);
                H7B.LIZ("WaterMarkPositionConfig2 config.xOffset:" + LIZLLL.xOffset + " config.yOffset:" + LIZLLL.yOffset + "xOffset:" + vEWatermarkParam.xOffset + " yOffset:" + vEWatermarkParam.yOffset + " position:" + vEWatermarkParam.position);
                if (z && str.length() > 0) {
                    vEWatermarkParam.needExtFile = true;
                    vEWatermarkParam.extFile = str;
                }
                if (C19N.LJ("enable_water_bg_mask", false) && !z2) {
                    VEWatermarkParam.VEWatermarkMask vEWatermarkMask = new VEWatermarkParam.VEWatermarkMask();
                    vEWatermarkMask.maskImage = C17N.LJJJIL(LIZIZ2, !LIZJ(i6, i5));
                    vEWatermarkMask.xOffset = 0;
                    vEWatermarkMask.yOffset = 0;
                    vEWatermarkMask.width = i5;
                    vEWatermarkMask.height = i6;
                    if (LIZJ(i6, i5)) {
                        vEWatermarkMask.yOffset = ((((int) (i5 * 1.7777777777777777d)) - i6) / 2) + vEWatermarkMask.yOffset;
                    }
                    vEWatermarkParam.mask = vEWatermarkMask;
                }
                LIZ = 0;
                LIZIZ = 0;
                LIZJ = null;
                return vEWatermarkParam;
            }
        } else if (how instanceof HN9) {
            String[] LJFF3 = how.LJFF(true, interfaceC45930I0w);
            String[] LJFF4 = how.LJFF(false, interfaceC45930I0w);
            String[] LIZJ3 = how.LIZJ(str2, interfaceC45930I0w);
            HNB LIZLLL2 = how.LIZLLL();
            if (LJFF3 != null && LJFF3.length != 0 && LIZLLL2 != null) {
                VEWatermarkParam vEWatermarkParam2 = new VEWatermarkParam();
                int i13 = iArr[0];
                int i14 = iArr[1];
                if (i14 > i13) {
                    d2 = i13;
                } else {
                    d2 = i14;
                }
                int i15 = (int) ((d2 / 750.0d) * 10);
                int[] LIZ4 = C5LB.LIZ(LJFF3[0]);
                int i16 = LIZ4[0];
                int i17 = LIZ4[1];
                VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity5 = new VEWatermarkParam.VEWatermarkEntity();
                vEWatermarkEntity5.images = LJFF3;
                vEWatermarkEntity5.interval = 2;
                vEWatermarkEntity5.width = i16;
                vEWatermarkEntity5.height = i17;
                vEWatermarkEntity5.xOffset = i15;
                vEWatermarkEntity5.yOffset = i15;
                vEWatermarkEntity5.position = VEWaterMarkPosition.TL;
                int i18 = LIZ;
                if (i18 == 0 || z) {
                    vEWatermarkEntity5.sequenceIn = -1L;
                    vEWatermarkEntity5.sequenceOut = -1L;
                } else {
                    vEWatermarkEntity5.sequenceIn = 0L;
                    vEWatermarkEntity5.sequenceOut = (long) (i18 / 2.0d);
                }
                VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity6 = new VEWatermarkParam.VEWatermarkEntity();
                vEWatermarkEntity6.images = LJFF4;
                vEWatermarkEntity6.interval = 2;
                vEWatermarkEntity6.width = i16;
                vEWatermarkEntity6.height = i17;
                vEWatermarkEntity6.xOffset = i15;
                vEWatermarkEntity6.yOffset = i15;
                vEWatermarkEntity6.position = VEWaterMarkPosition.BR;
                int i19 = LIZ;
                if (i19 == 0 || z) {
                    vEWatermarkEntity6.sequenceIn = -1L;
                    vEWatermarkEntity6.sequenceOut = -1L;
                } else {
                    vEWatermarkEntity6.sequenceIn = (long) ((i19 / 2.0d) + 1);
                    vEWatermarkEntity6.sequenceOut = i19;
                }
                if (LIZJ3 == null || LIZJ3.length == 0) {
                    vEWatermarkEntity = null;
                } else {
                    int[] LIZ5 = C5LB.LIZ(LIZJ3[0]);
                    vEWatermarkEntity = new VEWatermarkParam.VEWatermarkEntity();
                    vEWatermarkEntity.images = LIZJ3;
                    vEWatermarkEntity.interval = 2;
                    vEWatermarkEntity.width = LIZ5[0];
                    vEWatermarkEntity.height = LIZ5[1];
                    vEWatermarkEntity.xOffset = 0;
                    vEWatermarkEntity.yOffset = 0;
                    vEWatermarkEntity.position = VEWaterMarkPosition.BL;
                    int i20 = LIZ;
                    if (i20 == 0 || z) {
                        vEWatermarkEntity.sequenceIn = 0L;
                        vEWatermarkEntity.sequenceOut = 2147483647L;
                    } else {
                        vEWatermarkEntity.sequenceIn = 0L;
                        vEWatermarkEntity.sequenceOut = i20;
                    }
                }
                if (vEWatermarkEntity == null) {
                    vEWatermarkEntityArr = new VEWatermarkParam.VEWatermarkEntity[]{vEWatermarkEntity5, vEWatermarkEntity6};
                } else {
                    vEWatermarkEntityArr = new VEWatermarkParam.VEWatermarkEntity[]{vEWatermarkEntity5, vEWatermarkEntity6, vEWatermarkEntity};
                }
                vEWatermarkParam2.setEntities(vEWatermarkEntityArr);
                H7B.LIZ("WaterMarkPositionConfig2 config.xOffset:" + LIZLLL2.xOffset + " config.yOffset:" + LIZLLL2.yOffset + "xOffset:" + vEWatermarkParam2.xOffset + " yOffset:" + vEWatermarkParam2.yOffset + " position:" + vEWatermarkParam2.position);
                if (z && str.length() > 0) {
                    vEWatermarkParam2.needExtFile = true;
                    vEWatermarkParam2.extFile = str;
                }
                LIZ = 0;
                LIZIZ = 0;
                LIZJ = null;
                return vEWatermarkParam2;
            }
        } else if (how instanceof HN8) {
            String[] LJFF5 = how.LJFF(true, interfaceC45930I0w);
            HNB LIZLLL3 = how.LIZLLL();
            CreativeInfo creativeInfo = how.LIZIZ();
            if (LJFF5 != null && LJFF5.length != 0 && LIZLLL3 != null) {
                VEWatermarkParam vEWatermarkParam3 = new VEWatermarkParam();
                int i21 = iArr[0];
                int i22 = iArr[1];
                if (i22 > i21) {
                    f = i21;
                } else {
                    f = i22;
                }
                int i23 = (int) ((f / 1440.0f) * 40);
                int[] LIZ6 = C5LB.LIZ(LJFF5[0]);
                int i24 = LIZ6[0];
                int i25 = LIZ6[1];
                VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity7 = new VEWatermarkParam.VEWatermarkEntity();
                vEWatermarkEntity7.images = LJFF5;
                vEWatermarkEntity7.interval = 2;
                vEWatermarkEntity7.width = i24;
                vEWatermarkEntity7.height = i25;
                vEWatermarkEntity7.xOffset = i23;
                vEWatermarkEntity7.yOffset = i23;
                vEWatermarkEntity7.position = VEWaterMarkPosition.BR;
                int i26 = LIZ;
                if (i26 == 0 || z) {
                    vEWatermarkEntity7.sequenceIn = -1L;
                    vEWatermarkEntity7.sequenceOut = -1L;
                } else {
                    vEWatermarkEntity7.sequenceIn = 0L;
                    vEWatermarkEntity7.sequenceOut = i26;
                }
                if (z2) {
                    VEUtils.VEVideoFileInfo vEVideoFileInfo2 = LIZJ;
                    if (vEVideoFileInfo2 != null) {
                        i2 = vEVideoFileInfo2.height;
                        i = vEVideoFileInfo2.width;
                    } else {
                        i = i21;
                        i2 = i22;
                    }
                    if (i / (i2 * 1.0d) < 0.8d) {
                        if (i22 > i21) {
                            d = i21;
                        } else {
                            d = i22;
                        }
                        vEWatermarkEntity7.yOffset = (int) (((i22 - (i21 * 1.25d)) / 2.0d) - (10 * (d / 750.0d)));
                    }
                }
                vEWatermarkParam3.setEntities(new VEWatermarkParam.VEWatermarkEntity[]{vEWatermarkEntity7});
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("NowWaterMarkPositionConfig config.xOffset:");
                LIZ7.append(LIZLLL3.xOffset);
                LIZ7.append(" config.yOffset:");
                LIZ7.append(LIZLLL3.yOffset);
                LIZ7.append("xOffset:");
                LIZ7.append(vEWatermarkParam3.xOffset);
                LIZ7.append(" yOffset:");
                LIZ7.append(vEWatermarkParam3.yOffset);
                LIZ7.append(" position:");
                LIZ7.append(vEWatermarkParam3.position);
                H7B.LIZ(X1D.LIZIZ(LIZ7));
                if (z && str.length() > 0) {
                    vEWatermarkParam3.needExtFile = true;
                    vEWatermarkParam3.extFile = str;
                }
                if (C19N.LJ("enable_water_bg_mask", false) && !z2) {
                    VEWatermarkParam.VEWatermarkMask vEWatermarkMask2 = new VEWatermarkParam.VEWatermarkMask();
                    o.LJIIIIZZ(creativeInfo, "creativeInfo");
                    vEWatermarkMask2.maskImage = C17N.LJJJIL(creativeInfo, !LIZJ(i22, i21));
                    vEWatermarkMask2.xOffset = 0;
                    vEWatermarkMask2.yOffset = 0;
                    vEWatermarkMask2.width = i21;
                    vEWatermarkMask2.height = i22;
                    if (LIZJ(i22, i21)) {
                        vEWatermarkMask2.yOffset = ((((int) (i21 * 1.7777777777777777d)) - i22) / 2) + vEWatermarkMask2.yOffset;
                    }
                    vEWatermarkParam3.mask = vEWatermarkMask2;
                }
                LIZ = 0;
                LIZIZ = 0;
                LIZJ = null;
                return vEWatermarkParam3;
            }
        }
        return null;
    }
}
