package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WT7 extends AbstractC82618Wbe<C82334WTa> {
    public final /* synthetic */ C275416g LIZIZ;
    public final /* synthetic */ WMH LIZJ;
    public final /* synthetic */ I23 LIZLLL;
    public final /* synthetic */ boolean LJ;

    @Override // X.AbstractC82618Wbe
    public final C82334WTa LIZIZ(C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        WMH wmh = this.LIZJ;
        I23 i23 = this.LIZLLL;
        View requireViewById = wmh.requireViewById(R.id.iri);
        o.LJIIIIZZ(requireViewById, "parentScene.requireViewB…R.id.record_normal_scene)");
        i23.getClass();
        C82334WTa c82334WTa = new C82334WTa(wmh, container, I23.LIZIZ((ViewGroup) requireViewById), EnumC06840Oq.HIDE, this.LJ);
        this.LIZIZ.getClass();
        c82334WTa.afterInit$als_release(uptimeMillis);
        return c82334WTa;
    }

    public WT7(C275416g c275416g, C275516h c275516h, WMH wmh, I23 i23, boolean z) {
        this.LIZIZ = c275416g;
        this.LIZJ = wmh;
        this.LIZLLL = i23;
        this.LJ = z;
    }
}
