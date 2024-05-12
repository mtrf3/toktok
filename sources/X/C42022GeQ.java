package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.GeQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42022GeQ implements InterfaceC42033Geb {
    public final Activity LIZ;

    public C42022GeQ(Activity activity) {
        o.LJIIIZ(activity, "activity");
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
