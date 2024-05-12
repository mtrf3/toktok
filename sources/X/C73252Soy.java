package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost;
import kotlin.jvm.internal.o;

/* renamed from: X.Soy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73252Soy {
    public static JediViewHolderProxyHost LIZ(ActivityC45651qj activityC45651qj, Fragment fragment) {
        FragmentManager childFragmentManager;
        FragmentManager fragmentManager;
        Fragment fragment2 = null;
        if (activityC45651qj == null || (childFragmentManager = activityC45651qj.getSupportFragmentManager()) == null) {
            if (fragment != null) {
                childFragmentManager = fragment.getChildFragmentManager();
                o.LJFF(childFragmentManager, "fragment!!.childFragmentManager");
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        String str = JediViewHolderProxyHost.LJLJJI;
        Fragment LJJJIL = childFragmentManager.LJJJIL(str);
        if (LJJJIL instanceof JediViewHolderProxyHost) {
            fragment2 = LJJJIL;
        }
        JediViewHolderProxyHost jediViewHolderProxyHost = (JediViewHolderProxyHost) fragment2;
        if (jediViewHolderProxyHost == null) {
            jediViewHolderProxyHost = new JediViewHolderProxyHost();
            jediViewHolderProxyHost.LJLIL = fragment;
            if (fragment != null && (fragmentManager = fragment.getFragmentManager()) != null) {
                fragmentManager.LJJLIL(new C73251Sox(jediViewHolderProxyHost), false);
            }
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJIIIIZZ(0, 1, jediViewHolderProxyHost, str);
            c1b3.LJII();
        }
        return jediViewHolderProxyHost;
    }
}
