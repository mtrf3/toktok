package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.LEu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC53936LEu {
    public final String LIZ;

    public final int LIZ() {
        Keva keva;
        try {
            if (C53939LEx.LIZ == null) {
                try {
                    keva = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "tablet_cache", 0);
                } catch (UnsatisfiedLinkError unused) {
                    keva = null;
                }
                C53939LEx.LIZ = keva;
            }
            Keva keva2 = C53939LEx.LIZ;
            if (keva2 != null) {
                return keva2.getInt(this.LIZ, 0);
            }
            return 0;
        } catch (UnsatisfiedLinkError unused2) {
            return 0;
        }
    }

    public AbstractC53936LEu(String str) {
        this.LIZ = str;
    }

    public final void LIZIZ(int i) {
        Keva keva;
        try {
            if (C53939LEx.LIZ == null) {
                try {
                    keva = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "tablet_cache", 0);
                } catch (UnsatisfiedLinkError unused) {
                    keva = null;
                }
                C53939LEx.LIZ = keva;
            }
            Keva keva2 = C53939LEx.LIZ;
            if (keva2 != null) {
                keva2.storeInt(this.LIZ, i);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }
}
