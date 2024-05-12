package X;

import android.os.Bundle;

/* renamed from: X.LEe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53920LEe implements FLT {
    public static final C53920LEe LIZ = new C53920LEe();

    @Override // X.FLT
    public final int LIZ() {
        return C53946LFe.LIZJ(null, null).LJFF ? 1 : 0;
    }

    @Override // X.FLT
    public final String LIZJ() {
        return "tablet";
    }

    @Override // X.FLT
    public final int LIZLLL() {
        return 1;
    }

    @Override // X.FLT
    public final void LIZIZ(Bundle bundle) {
        bundle.putInt("is_pad", 1);
    }
}
