package X;

import Y.ARunnableS0S0100001_2;
import Y.ARunnableS1S1201000_2;
import com.bytedance.ies.nle.editor_jni.KeyframeType;

/* renamed from: X.5Nk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133925Nk implements InterfaceC132785Ja {
    public final /* synthetic */ C5N0 LIZ;

    @Override // X.InterfaceC132785Ja
    public final void LIZ(String str, long j, String str2, KeyframeType keyframeType) {
    }

    public C133925Nk(C5N0 c5n0) {
        this.LIZ = c5n0;
    }

    @Override // X.InterfaceC132785Ja
    public final void LIZIZ(final int i, final int i2, final float f, final String str) {
        C5N0 c5n0 = this.LIZ;
        final InterfaceC133955Nn interfaceC133955Nn = c5n0.LJ;
        if (interfaceC133955Nn != null) {
            c5n0.LIZ().post(new Runnable() { // from class: X.5Nl
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        InterfaceC133955Nn.this.onCompileError(i, i2, f, str);
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC132785Ja
    public final void LIZJ(int i, int i2, float f, String str) {
        C5N0 c5n0;
        InterfaceC133955Nn interfaceC133955Nn;
        if (i == 4103) {
            C5N0 c5n02 = this.LIZ;
            InterfaceC133955Nn interfaceC133955Nn2 = c5n02.LJ;
            if (interfaceC133955Nn2 != null) {
                c5n02.LIZ().post(new ARunnableS1S1201000_2(interfaceC133955Nn2, this, i2, str, 1));
                return;
            }
            return;
        }
        if (i != 4105 || (interfaceC133955Nn = (c5n0 = this.LIZ).LJ) == null) {
            return;
        }
        c5n0.LIZ().post(new ARunnableS0S0100001_2(interfaceC133955Nn, f, 4));
    }
}
