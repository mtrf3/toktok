package X;

import com.ss.android.vesdk.faceinfo.VESkeleton;
import com.ss.android.vesdk.faceinfo.VESkeletonInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.WyY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84038WyY implements X0K {
    public final /* synthetic */ WSW LIZ;

    public C84038WyY(WSU wsu) {
        this.LIZ = wsu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.X0K
    public final void LIZ(VESkeletonInfo vESkeletonInfo) {
        VESkeleton[] info;
        C124344uM[] c124344uMArr = 0;
        c124344uMArr = 0;
        c124344uMArr = 0;
        if (vESkeletonInfo != null && (info = vESkeletonInfo.getInfo()) != null) {
            if (info.length != 0) {
                int length = info.length;
                c124344uMArr = new C124344uM[length];
                for (int i = 0; i < length; i++) {
                    VESkeleton vESkeleton = info[i];
                    o.LJIIIIZZ(vESkeleton, "it[index]");
                    final int id = vESkeleton.getID();
                    c124344uMArr[i] = new F9E(id) { // from class: X.4uM
                        public final int LJLIL;

                        @Override // X.F9E
                        public final Object[] getObjects() {
                            return new Object[]{Integer.valueOf(this.LJLIL)};
                        }

                        {
                            this.LJLIL = id;
                        }
                    };
                }
            }
        }
        this.LIZ.LIZ(c124344uMArr);
    }
}
