package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;

/* renamed from: X.Ggb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42157Ggb implements InterfaceC42033Geb {
    public final Activity LIZ;

    public C42157Ggb(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.InterfaceC42033Geb
    public final <T extends View> T LIZ(int i) {
        T t = (T) this.LIZ.findViewById(i);
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
