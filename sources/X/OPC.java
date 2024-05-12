package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.widget.WidgetHost;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OPC extends C08Z {
    public final /* synthetic */ WidgetHost LIZ;

    public OPC(WidgetHost widgetHost) {
        this.LIZ = widgetHost;
    }

    @Override // X.C08Z
    public final void onFragmentViewDestroyed(FragmentManager fm, Fragment f) {
        o.LJIIJ(fm, "fm");
        o.LJIIJ(f, "f");
        if (f == this.LIZ.LJLIL) {
            fm.LJLJJLL(this);
            FragmentManager childFragmentManager = f.getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJJI(this.LIZ);
            c1b3.LJII();
            WidgetHost widgetHost = this.LIZ;
            Iterator<InterfaceC65784Pro<C76800UCe>> it = widgetHost.LJLJJL.iterator();
            while (it.hasNext()) {
                it.next().invoke();
            }
            widgetHost.LJLJJL.clear();
        }
    }
}
