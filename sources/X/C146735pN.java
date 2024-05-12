package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5pN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146735pN implements HPI {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ C146855pZ LIZIZ;

    public C146735pN(Activity activity, C146855pZ c146855pZ) {
        this.LIZ = activity;
        this.LIZIZ = c146855pZ;
    }

    @Override // X.HPI
    public final void LIZ(int[] iArr, String[] strArr) {
        if (strArr == null || iArr == null || strArr.length == 0 || iArr.length == 0) {
            C5S1 c5s1 = new C5S1(this.LIZ);
            c5s1.LIZJ(R.string.e2q);
            c5s1.LJ();
        } else {
            if (iArr[0] == 0) {
                C146855pZ c146855pZ = this.LIZIZ;
                c146855pZ.LLJZIJLIL().U2(false, false, false);
                InterfaceC146715pL interfaceC146715pL = c146855pZ.LJLJLJ;
                if (interfaceC146715pL != null) {
                    interfaceC146715pL.show();
                    return;
                }
                return;
            }
            C5S1 c5s12 = new C5S1(this.LIZ);
            c5s12.LIZJ(R.string.e2q);
            c5s12.LJ();
        }
    }
}
