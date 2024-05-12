package X;

import android.app.Activity;
import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xso, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86230Xso implements InterfaceC86247Xt5 {
    public final WeakReference<Activity> LIZ;
    public final InterfaceC86245Xt3 LIZIZ;

    public C86230Xso(WeakReference weakReference, C86233Xsr c86233Xsr) {
        this.LIZ = weakReference;
        this.LIZIZ = c86233Xsr;
    }

    @Override // X.InterfaceC86247Xt5
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 700) {
            if (i2 == 0 || intent == null) {
                this.LIZIZ.LIZ(-7, "User cancelled");
                return;
            }
            Activity activity = this.LIZ.get();
            if (activity == null) {
                this.LIZIZ.LIZ(0, "Activity not found");
                return;
            }
            android.net.Uri data = intent.getData();
            if (data == null || C38354F3m.LJ(data.toString())) {
                this.LIZIZ.LIZ(0, "Video doesn't exist");
                return;
            }
            String uri = data.toString();
            o.LJIIIIZZ(uri, "uri.toString()");
            List<C86241Xsz> LJJIJ = C47261Igj.LJJIJ(new C86241Xsz(C268613q.LJIIIZ(activity, data), uri, "video"));
            InterfaceC86245Xt3 interfaceC86245Xt3 = this.LIZIZ;
            C86242Xt0 c86242Xt0 = new C86242Xt0();
            c86242Xt0.LIZ = LJJIJ;
            interfaceC86245Xt3.LIZIZ(c86242Xt0);
        }
    }
}
