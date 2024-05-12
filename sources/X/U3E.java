package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class U3E implements UHN {
    public final /* synthetic */ U3D LIZ;

    public U3E(U3D u3d) {
        this.LIZ = u3d;
    }

    @Override // X.UHN
    public final void LIZ(String str) {
        Integer LJJIL;
        this.LIZ.LJJIIZ(0);
        if (str != null && (LJJIL = C38350F3i.LJJIL(str)) != null) {
            int intValue = LJJIL.intValue();
            C2A7 c2a7 = this.LIZ.LJLLL;
            if (c2a7 != null) {
                c2a7.setText(C15380j0.LJIILL(R.string.ndo, Integer.valueOf(intValue)));
            }
            U3D u3d = this.LIZ;
            u3d.LL = intValue;
            u3d.LJJIJ();
        }
    }
}
