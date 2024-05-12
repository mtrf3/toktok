package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.Qkc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67886Qkc<A, ResultT> {
    public final Feature[] LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;

    public AbstractC67886Qkc() {
    }

    public AbstractC67886Qkc(Feature[] featureArr, boolean z, int i) {
        this.LIZ = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.LIZIZ = z2;
        this.LIZJ = i;
    }

    public abstract void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, C67649Qgn c67649Qgn);
}
