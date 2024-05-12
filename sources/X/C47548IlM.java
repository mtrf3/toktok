package X;

import defpackage.i0;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.IlM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47548IlM implements InterfaceC47128Iea {
    public final WeakReference<IDP> LIZIZ;
    public boolean LIZ = true;
    public final WeakReference<C47554IlS> LIZJ = new WeakReference<>(new C47554IlS());

    @Override // X.InterfaceC47128Iea
    public final void LIZ() {
        this.LIZ = true;
        C47554IlS c47554IlS = this.LIZJ.get();
        if (c47554IlS == null) {
            return;
        }
        C46303IFf.LIZ("checkAudioCloseAndReport");
        if (!c47554IlS.LJIIIIZZ) {
            return;
        }
        C47549IlN c47549IlN = new C47549IlN();
        c47549IlN.LIZIZ = 4;
        c47554IlS.LJ(c47549IlN);
        C46303IFf.LIZ("getSamiCoreCheckResultAndReport  end");
    }

    @Override // X.InterfaceC47128Iea
    public final void LIZIZ() {
    }

    public C47548IlM(IDP idp) {
        this.LIZIZ = new WeakReference<>(idp);
    }

    @Override // X.InterfaceC47128Iea
    public final void LIZJ(ByteBuffer[] inout, int i, long j) {
        C47554IlS c47554IlS = this.LIZJ.get();
        if (c47554IlS == null) {
            return;
        }
        o.LJIIIZ(inout, "inout");
        if (!c47554IlS.LJIIIIZZ) {
            return;
        }
        C47549IlN c47549IlN = new C47549IlN();
        c47549IlN.LIZIZ = 1;
        ArrayList<float[]> arrayList = new ArrayList<>();
        for (ByteBuffer byteBuffer : inout) {
            if (byteBuffer != null) {
                FloatBuffer LJI = i0.LJI(byteBuffer);
                float[] fArr = new float[LJI.capacity()];
                LJI.get(fArr);
                arrayList.add(fArr);
            }
        }
        c47549IlN.LJIIIIZZ = arrayList;
        c47549IlN.LJI = i;
        c47549IlN.LJII = j;
        c47554IlS.LJ(c47549IlN);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    @Override // X.InterfaceC47128Iea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47548IlM.LIZLLL(int, int, int):void");
    }
}
