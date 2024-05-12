package com.lynx.tasm.behavior.shadow;

import X.C61S;
import X.C79691VPj;
import X.C79694VPm;
import X.C79696VPo;
import X.C79697VPp;
import X.EnumC79692VPk;
import X.InterfaceC79664VOi;
import X.InterfaceC79695VPn;
import X.QLB;
import com.lynx.tasm.base.LLog;

/* loaded from: classes15.dex */
public class LayoutNode {
    public long LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL = true;
    public InterfaceC79664VOi LJ;
    public InterfaceC79695VPn LJFF;
    public QLB LJI;
    public long LJII;

    private native int nativeGetFlexDirection(long j);

    private native float nativeGetHeight(long j);

    private native int[] nativeGetMargin(long j);

    private native int[] nativeGetPadding(long j);

    private native float nativeGetWidth(long j);

    private native boolean nativeIsDirty(long j);

    private native void nativeMarkDirty(long j);

    private native void nativeSetMeasureFunc(long j);

    public void LJIIIZ() {
    }

    public native void nativeAlignNativeNode(long j, float f, float f2);

    public native long nativeMeasureNativeNode(long j, float f, int i, float f2, int i2, boolean z);

    public native int[] nativeMeasureNativeNodeReturnWithBaseline(long j, float f, int i, float f2, int i2, boolean z);

    private void align() {
        InterfaceC79695VPn interfaceC79695VPn = this.LJFF;
        if (interfaceC79695VPn != null) {
            interfaceC79695VPn.LIZIZ(new C61S(), new C79696VPo());
        }
    }

    public final float LJFF() {
        long j = this.LIZ;
        if (j != 0) {
            return nativeGetHeight(j);
        }
        LLog.LIZLLL(4, "LayoutNode", "A destroyed layout node is visited!!");
        return 0.0f;
    }

    public final int[] LJI() {
        long j = this.LIZ;
        if (j != 0) {
            return nativeGetMargin(j);
        }
        LLog.LIZLLL(4, "LayoutNode", "A destroyed layout node is visited!!");
        return new int[4];
    }

    public final float LJII() {
        long j = this.LIZ;
        if (j != 0) {
            return nativeGetWidth(j);
        }
        LLog.LIZLLL(4, "LayoutNode", "A destroyed layout node is visited!!");
        return 0.0f;
    }

    public void LJIIIIZZ() {
        if (!this.LIZLLL) {
            this.LIZLLL = true;
            nativeMarkDirty(this.LIZ);
        }
    }

    public void LJ(long j) {
        InterfaceC79695VPn interfaceC79695VPn;
        InterfaceC79664VOi interfaceC79664VOi;
        this.LIZ = j;
        this.LJI = new QLB(this);
        if (!this.LIZIZ && (interfaceC79664VOi = this.LJ) != null) {
            LJIIJJI(interfaceC79664VOi);
        } else {
            if (this.LIZJ || (interfaceC79695VPn = this.LJFF) == null) {
                return;
            }
            LJIIJ(interfaceC79695VPn);
        }
    }

    public final void LJIIJ(InterfaceC79695VPn interfaceC79695VPn) {
        this.LJFF = interfaceC79695VPn;
        long j = this.LIZ;
        if (j != 0) {
            this.LIZJ = true;
            nativeSetMeasureFunc(j);
        }
    }

    public final void LJIIJJI(InterfaceC79664VOi interfaceC79664VOi) {
        this.LJ = interfaceC79664VOi;
        long j = this.LIZ;
        if (j != 0) {
            this.LIZIZ = true;
            nativeSetMeasureFunc(j);
        }
    }

    private long measure(float f, int i, float f2, int i2, boolean z) {
        InterfaceC79664VOi interfaceC79664VOi = this.LJ;
        if (interfaceC79664VOi != null) {
            return interfaceC79664VOi.LIZJ(this, f, EnumC79692VPk.fromInt(i), f2, EnumC79692VPk.fromInt(i2));
        }
        if (this.LJFF != null) {
            C79691VPj c79691VPj = new C79691VPj(z);
            C79694VPm c79694VPm = new C79694VPm();
            EnumC79692VPk fromInt = EnumC79692VPk.fromInt(i);
            EnumC79692VPk fromInt2 = EnumC79692VPk.fromInt(i2);
            c79694VPm.LIZ = f;
            c79694VPm.LIZIZ = fromInt;
            c79694VPm.LIZJ = f2;
            c79694VPm.LIZLLL = fromInt2;
            float[] fArr = this.LJFF.LIZLLL(c79691VPj, c79694VPm).LIZ;
            return C79697VPp.LIZ(fArr[0], fArr[1]);
        }
        float f3 = 0;
        return C79697VPp.LIZ(f3, f3);
    }

    private long[] measureWithBaseline(float f, int i, float f2, int i2, boolean z) {
        long[] jArr = new long[2];
        InterfaceC79664VOi interfaceC79664VOi = this.LJ;
        if (interfaceC79664VOi != null) {
            jArr[0] = interfaceC79664VOi.LIZJ(this, f, EnumC79692VPk.fromInt(i), f2, EnumC79692VPk.fromInt(i2));
            jArr[1] = this.LJII;
            return jArr;
        }
        if (this.LJFF != null) {
            C79691VPj c79691VPj = new C79691VPj(z);
            C79694VPm c79694VPm = new C79694VPm();
            EnumC79692VPk fromInt = EnumC79692VPk.fromInt(i);
            EnumC79692VPk fromInt2 = EnumC79692VPk.fromInt(i2);
            c79694VPm.LIZ = f;
            c79694VPm.LIZIZ = fromInt;
            c79694VPm.LIZJ = f2;
            c79694VPm.LIZLLL = fromInt2;
            float[] fArr = this.LJFF.LIZLLL(c79691VPj, c79694VPm).LIZ;
            jArr[0] = C79697VPp.LIZ(fArr[0], fArr[1]);
            jArr[1] = r3.LIZ[2];
        }
        return jArr;
    }
}
