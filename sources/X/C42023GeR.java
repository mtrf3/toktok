package X;

import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* renamed from: X.GeR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42023GeR implements InterfaceC42033Geb {
    public final Fragment LIZ;

    public C42023GeR(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = fragment;
    }

    @Override // X.InterfaceC42033Geb
    public final <T extends View> T LIZ(int i) {
        T t;
        View view = this.LIZ.getView();
        if (view != null && (t = (T) view.findViewById(i)) != null) {
            return t;
        }
        try {
            String resourceName = this.LIZ.getResources().getResourceName(i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(' ');
            LIZ.append(resourceName);
            LIZ.append(" view not found");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        } catch (Resources.NotFoundException unused) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(' ');
            LIZ2.append(i);
            LIZ2.append(" view not found");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
        }
    }
}
