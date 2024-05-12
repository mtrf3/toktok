package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WT8 extends AbstractC82618Wbe<C82334WTa> {
    public final /* synthetic */ C275416g LIZIZ;
    public final /* synthetic */ WMH LIZJ;
    public final /* synthetic */ boolean LIZLLL;

    @Override // X.AbstractC82618Wbe
    public final C82334WTa LIZIZ(C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        WMH wmh = this.LIZJ;
        View requireViewById = wmh.requireViewById(R.id.iri);
        o.LJIIIIZZ(requireViewById, "minorScene.requireViewBy…R.id.record_normal_scene)");
        C82334WTa c82334WTa = new C82334WTa(wmh, container, C77318UWc.LJ((ViewGroup) requireViewById), EnumC06840Oq.HIDE, this.LIZLLL);
        this.LIZIZ.getClass();
        c82334WTa.afterInit$als_release(uptimeMillis);
        return c82334WTa;
    }

    public WT8(C275416g c275416g, C275516h c275516h, WMH wmh, boolean z) {
        this.LIZIZ = c275416g;
        this.LIZJ = wmh;
        this.LIZLLL = z;
    }
}
