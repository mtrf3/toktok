package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Sox, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73251Sox extends C08Z {
    public final /* synthetic */ JediViewHolderProxyHost LIZ;

    public C73251Sox(JediViewHolderProxyHost jediViewHolderProxyHost) {
        this.LIZ = jediViewHolderProxyHost;
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
            JediViewHolderProxyHost jediViewHolderProxyHost = this.LIZ;
            Iterator<InterfaceC65784Pro<C76800UCe>> it = jediViewHolderProxyHost.LJLJI.iterator();
            while (it.hasNext()) {
                it.next().invoke();
            }
            jediViewHolderProxyHost.LJLJI.clear();
        }
    }
}
