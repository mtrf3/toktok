package X;

import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.Gga, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42156Gga implements InterfaceC42033Geb {
    public final Fragment LIZ;

    public C42156Gga(Fragment fragment) {
        this.LIZ = fragment;
    }

    @Override // X.InterfaceC42033Geb
    public final <T extends View> T LIZ(int i) {
        T t = (T) this.LIZ.getView().findViewById(i);
        if (t != null) {
            return t;
        }
        try {
            String resourceName = this.LIZ.getResources().getResourceName(i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" ");
            LIZ.append(resourceName);
            LIZ.append(" view not found");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(C0NY.LIZIZ(" ", i, " view not found"));
        }
    }
}
