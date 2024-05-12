package X;

import Y.AObserverS76S0100000_8;
import Y.ARunnableS1S0100001_8;
import Y.IDObjectS329S0100000_8;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.KPx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51677KPx implements C8T1 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final EventCenter LIZ;
    public final View LIZIZ;
    public final AObserverS76S0100000_8 LIZJ;

    @Override // X.C8T1
    public final void LIZ() {
        Float f = (Float) this.LIZ.get("search.filter.drawer.ratio");
        if (f != null) {
            this.LIZIZ.post(new ARunnableS1S0100001_8(this, f.floatValue(), 0));
        }
    }

    @Override // X.C8T1
    public final void release() {
        this.LIZ.kv0(this.LIZJ);
    }

    public final void LIZIZ(float f) {
        ViewGroup viewGroup;
        this.LIZIZ.setAlpha(f);
        View view = this.LIZIZ;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            Iterator it = new IDObjectS329S0100000_8(viewGroup, 1).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setAlpha(f);
            }
        }
    }

    public C51677KPx(EventCenter eventCenter, View view) {
        o.LJIIIZ(eventCenter, "eventCenter");
        this.LIZ = eventCenter;
        this.LIZIZ = view;
        AObserverS76S0100000_8 aObserverS76S0100000_8 = new AObserverS76S0100000_8(this, 81);
        this.LIZJ = aObserverS76S0100000_8;
        eventCenter.iv0("search.filter.drawer.ratio", aObserverS76S0100000_8, false);
    }
}
