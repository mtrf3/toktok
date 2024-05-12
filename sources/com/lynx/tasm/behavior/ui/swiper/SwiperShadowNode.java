package com.lynx.tasm.behavior.ui.swiper;

import X.C61S;
import X.C79690VPi;
import X.C79691VPj;
import X.C79694VPm;
import X.C79696VPo;
import X.EnumC79692VPk;
import X.F5B;
import X.InterfaceC79695VPn;
import X.VPD;
import X.VPR;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.shadow.CustomLayoutShadowNode;
import com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef;
import com.lynx.tasm.behavior.shadow.ShadowNode;

/* loaded from: classes15.dex */
public class SwiperShadowNode extends CustomLayoutShadowNode implements InterfaceC79695VPn {
    public boolean LJJIFFI;
    public int LJIJJ = -1;
    public int LJIJJLI = -1;
    public int LJIL = -1;
    public float LJJ = 1.0f;
    public float LJJI = 1.0f;
    public String LJJII = "normal";

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    public final void LJ(long j) {
        if (this.LJIJI) {
            LJIIJ(this);
        }
        super.LJ(j);
    }

    @VPD(name = "max-x-scale")
    public void setMaxXScale(double d) {
        if (d >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            this.LJJ = (float) d;
        }
        if (this.LJIJI) {
            LJIIIIZZ();
        }
    }

    @VPD(name = "max-y-scale")
    public void setMaxYScale(double d) {
        if (d >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            this.LJJI = (float) d;
        }
        if (this.LJIJI) {
            LJIIIIZZ();
        }
    }

    @VPD(name = "mode")
    public void setMode(String str) {
        this.LJJII = str;
        if (this.LJIJI) {
            LJIIIIZZ();
        }
    }

    @VPD(name = "next-margin")
    public void setNextMargin(F5B f5b) {
        if (f5b.getType() != ReadableType.String) {
            return;
        }
        String asString = f5b.asString();
        if (asString.endsWith("px") || asString.endsWith("rpx")) {
            int LIZIZ = (int) VPR.LIZIZ(asString, -1.0f);
            if (LIZIZ < 0) {
                LIZIZ = -1;
            }
            this.LJIJJLI = LIZIZ;
        }
        if (this.LJIJI) {
            LJIIIIZZ();
        }
    }

    @VPD(name = "page-margin")
    public void setPageMargin(F5B f5b) {
        if (f5b.getType() == ReadableType.String) {
            String asString = f5b.asString();
            if (asString.endsWith("px") || asString.endsWith("rpx")) {
                int LIZIZ = (int) VPR.LIZIZ(asString, 0.0f);
                if (LIZIZ <= 0) {
                    LIZIZ = 0;
                }
                this.LJIL = LIZIZ;
            }
            if (this.LJIJI) {
                LJIIIIZZ();
            }
        }
    }

    @VPD(name = "previous-margin")
    public void setPreviousMargin(F5B f5b) {
        if (f5b.getType() != ReadableType.String) {
            return;
        }
        String asString = f5b.asString();
        if (asString.endsWith("px") || asString.endsWith("rpx")) {
            int LIZIZ = (int) VPR.LIZIZ(asString, -1.0f);
            if (LIZIZ < 0) {
                LIZIZ = -1;
            }
            this.LJIJJ = LIZIZ;
        }
        if (this.LJIJI) {
            LJIIIIZZ();
        }
    }

    @VPD(defaultBoolean = false, name = "vertical")
    public void setVertical(boolean z) {
        this.LJJIFFI = z;
        if (this.LJIJI) {
            LJIIIIZZ();
        }
    }

    @Override // X.InterfaceC79695VPn
    public final void LIZIZ(C61S c61s, C79696VPo c79696VPo) {
        for (int i = 0; i < LJIILJJIL(); i++) {
            ShadowNode LJIILIIL = LJIILIIL(i);
            if (LJIILIIL instanceof NativeLayoutNodeRef) {
                C79696VPo c79696VPo2 = new C79696VPo();
                LJIILIIL.nativeAlignNativeNode(LJIILIIL.LIZ, c79696VPo2.LIZIZ, c79696VPo2.LIZ);
            }
        }
    }

    @Override // X.InterfaceC79695VPn
    public final C79690VPi LIZLLL(C79691VPj c79691VPj, C79694VPm c79694VPm) {
        float f;
        float f2;
        float f3;
        float f4;
        C79694VPm c79694VPm2 = null;
        for (int i = 0; i < LJIILJJIL(); i++) {
            ShadowNode LJIILIIL = LJIILIIL(i);
            if (LJIILIIL instanceof NativeLayoutNodeRef) {
                NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) LJIILIIL;
                if (c79694VPm2 != null) {
                    nativeLayoutNodeRef.LJJIII(c79691VPj, c79694VPm2);
                } else {
                    c79694VPm2 = new C79694VPm();
                    float f5 = 0.0f;
                    if (this.LJJII.equals("coverflow") || this.LJJII.equals("flat-coverflow")) {
                        float f6 = (this.LJIL * 2) + this.LJIJJ + this.LJIJJLI;
                        float f7 = c79694VPm.LIZ;
                        boolean z = this.LJJIFFI;
                        if (z) {
                            f = 0.0f;
                        } else {
                            f = f6;
                        }
                        float f8 = f7 - f;
                        EnumC79692VPk enumC79692VPk = c79694VPm.LIZIZ;
                        float f9 = c79694VPm.LIZJ;
                        if (z) {
                            f5 = f6;
                        }
                        EnumC79692VPk enumC79692VPk2 = c79694VPm.LIZLLL;
                        c79694VPm2.LIZ = f8;
                        c79694VPm2.LIZIZ = enumC79692VPk;
                        c79694VPm2.LIZJ = f9 - f5;
                        c79694VPm2.LIZLLL = enumC79692VPk2;
                    } else if (this.LJJII.equals("carousel")) {
                        if (this.LJJIFFI) {
                            f3 = (float) (c79694VPm.LIZJ * 0.8d);
                            f4 = c79694VPm.LIZ;
                        } else {
                            f3 = c79694VPm.LIZJ;
                            f4 = (float) (c79694VPm.LIZ * 0.8d);
                        }
                        EnumC79692VPk enumC79692VPk3 = c79694VPm.LIZIZ;
                        EnumC79692VPk enumC79692VPk4 = c79694VPm.LIZLLL;
                        c79694VPm2.LIZ = f4;
                        c79694VPm2.LIZIZ = enumC79692VPk3;
                        c79694VPm2.LIZJ = f3;
                        c79694VPm2.LIZLLL = enumC79692VPk4;
                    } else if (this.LJJII.equals("carry")) {
                        float f10 = (this.LJIL * 2) + this.LJIJJ + this.LJIJJLI;
                        float f11 = c79694VPm.LIZ;
                        boolean z2 = this.LJJIFFI;
                        if (z2) {
                            f2 = 0.0f;
                        } else {
                            f2 = f10;
                        }
                        float f12 = (f11 - f2) * this.LJJ;
                        EnumC79692VPk enumC79692VPk5 = c79694VPm.LIZIZ;
                        float f13 = c79694VPm.LIZJ;
                        if (z2) {
                            f5 = f10;
                        }
                        float f14 = (f13 - f5) * this.LJJI;
                        EnumC79692VPk enumC79692VPk6 = c79694VPm.LIZLLL;
                        c79694VPm2.LIZ = f12;
                        c79694VPm2.LIZIZ = enumC79692VPk5;
                        c79694VPm2.LIZJ = f14;
                        c79694VPm2.LIZLLL = enumC79692VPk6;
                    } else {
                        float f15 = c79694VPm.LIZ;
                        EnumC79692VPk enumC79692VPk7 = c79694VPm.LIZIZ;
                        float f16 = c79694VPm.LIZJ;
                        EnumC79692VPk enumC79692VPk8 = c79694VPm.LIZLLL;
                        c79694VPm2.LIZ = f15;
                        c79694VPm2.LIZIZ = enumC79692VPk7;
                        c79694VPm2.LIZJ = f16;
                        c79694VPm2.LIZLLL = enumC79692VPk8;
                    }
                    nativeLayoutNodeRef.LJJIII(c79691VPj, c79694VPm2);
                }
            }
        }
        return new C79690VPi(c79694VPm.LIZ, c79694VPm.LIZJ);
    }
}
