package com.lynx.tasm.behavior.shadow;

import X.C79686VPe;
import X.C79687VPf;
import X.C79689VPh;
import X.C79690VPi;
import X.C79691VPj;
import X.C79694VPm;
import X.VNU;
import X.VPD;
import com.lynx.react.bridge.ReadableArray;

/* loaded from: classes15.dex */
public class NativeLayoutNodeRef extends ShadowNode {
    public int LJIJI;
    public int LJIJJ;

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean LJIJ() {
        throw null;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final C79686VPe LJJIFFI() {
        return new C79687VPf(this.LJIIIIZZ, this.LJIILL, this.LJIILLIIL, this.LJIJ, this.LJIIZILJ);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJJLI(VNU vnu) {
        this.LJIIL = vnu;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    @VPD(name = "vertical-align")
    public void setVerticalAlign(ReadableArray readableArray) {
        LJJ(readableArray);
    }

    public final C79690VPi LJJIII(C79691VPj c79691VPj, C79694VPm c79694VPm) {
        C79689VPh c79689VPh = this.LJIILIIL;
        if (c79689VPh != null && c79689VPh.LIZ == 1) {
            int[] nativeMeasureNativeNodeReturnWithBaseline = nativeMeasureNativeNodeReturnWithBaseline(this.LIZ, c79694VPm.LIZ, c79694VPm.LIZIZ.intValue(), c79694VPm.LIZJ, c79694VPm.LIZLLL.intValue(), c79691VPj.LIZ);
            return new C79690VPi(nativeMeasureNativeNodeReturnWithBaseline[0], nativeMeasureNativeNodeReturnWithBaseline[1], nativeMeasureNativeNodeReturnWithBaseline[2]);
        }
        long nativeMeasureNativeNode = nativeMeasureNativeNode(this.LIZ, c79694VPm.LIZ, c79694VPm.LIZIZ.intValue(), c79694VPm.LIZJ, c79694VPm.LIZLLL.intValue(), c79691VPj.LIZ);
        return new C79690VPi(Float.intBitsToFloat((int) ((nativeMeasureNativeNode >> 32) & (-1))), Float.intBitsToFloat((int) (nativeMeasureNativeNode & (-1))));
    }
}
