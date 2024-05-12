package com.bytedance.ies.xelement.overlay.ng;

import X.C61S;
import X.C79690VPi;
import X.C79691VPj;
import X.C79694VPm;
import X.C79696VPo;
import X.EnumC79692VPk;
import X.InterfaceC79695VPn;
import X.QLB;
import android.util.DisplayMetrics;
import com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.utils.DisplayMetricsHolder;

/* loaded from: classes15.dex */
public final class OverlayShadowNodeNG extends ShadowNode implements InterfaceC79695VPn {
    public OverlayShadowNodeNG() {
        LJIIJ(this);
    }

    @Override // X.InterfaceC79695VPn
    public final void LIZIZ(C61S c61s, C79696VPo c79696VPo) {
        float f;
        int[] LIZIZ;
        int[] LIZIZ2;
        if (LJIILJJIL() > 0) {
            ShadowNode LJIILIIL = LJIILIIL(0);
            if (LJIILIIL instanceof NativeLayoutNodeRef) {
                C79696VPo c79696VPo2 = new C79696VPo();
                QLB qlb = LJIILIIL.LJI;
                float f2 = 0.0f;
                if (qlb != null && (LIZIZ2 = qlb.LIZIZ()) != null) {
                    f = LIZIZ2[0];
                } else {
                    f = 0.0f;
                }
                c79696VPo2.LIZ = f;
                QLB qlb2 = LJIILIIL.LJI;
                if (qlb2 != null && (LIZIZ = qlb2.LIZIZ()) != null) {
                    f2 = LIZIZ[1];
                }
                c79696VPo2.LIZIZ = f2;
                LJIILIIL.nativeAlignNativeNode(LJIILIIL.LIZ, f2, c79696VPo2.LIZ);
            }
        }
    }

    @Override // X.InterfaceC79695VPn
    public final C79690VPi LIZLLL(C79691VPj c79691VPj, C79694VPm c79694VPm) {
        float f;
        float f2;
        float f3;
        float f4;
        int[] LIZIZ;
        int[] LIZIZ2;
        int[] LIZIZ3;
        int[] LIZIZ4;
        if (LJIILJJIL() > 0) {
            ShadowNode LJIILIIL = LJIILIIL(0);
            if (LJIILIIL instanceof NativeLayoutNodeRef) {
                DisplayMetrics LIZ = DisplayMetricsHolder.LIZ(this.LJIIL);
                C79694VPm c79694VPm2 = new C79694VPm();
                float f5 = LIZ.heightPixels;
                NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) LJIILIIL;
                QLB qlb = nativeLayoutNodeRef.LJI;
                if (qlb != null && (LIZIZ4 = qlb.LIZIZ()) != null) {
                    f = LIZIZ4[1];
                } else {
                    f = 0.0f;
                }
                float f6 = f5 - f;
                QLB qlb2 = nativeLayoutNodeRef.LJI;
                if (qlb2 != null && (LIZIZ3 = qlb2.LIZIZ()) != null) {
                    f2 = LIZIZ3[3];
                } else {
                    f2 = 0.0f;
                }
                c79694VPm2.LIZJ = f6 - f2;
                float f7 = LIZ.widthPixels;
                QLB qlb3 = nativeLayoutNodeRef.LJI;
                if (qlb3 != null && (LIZIZ2 = qlb3.LIZIZ()) != null) {
                    f3 = LIZIZ2[0];
                } else {
                    f3 = 0.0f;
                }
                float f8 = f7 - f3;
                QLB qlb4 = nativeLayoutNodeRef.LJI;
                if (qlb4 != null && (LIZIZ = qlb4.LIZIZ()) != null) {
                    f4 = LIZIZ[2];
                } else {
                    f4 = 0.0f;
                }
                c79694VPm2.LIZ = f8 - f4;
                EnumC79692VPk enumC79692VPk = EnumC79692VPk.EXACTLY;
                c79694VPm2.LIZIZ = enumC79692VPk;
                c79694VPm2.LIZLLL = enumC79692VPk;
                nativeLayoutNodeRef.LJJIII(c79691VPj, c79694VPm2);
                return new C79690VPi(0.0f, 0.0f);
            }
        }
        return new C79690VPi(0.0f, 0.0f);
    }
}
