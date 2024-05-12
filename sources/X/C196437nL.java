package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.nows.feed.homepage.NowListFragmentPanel;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.AqS13S2100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7nL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196437nL {
    public static AbstractC193937jJ LIZ(String str) {
        if (o.LJ(str, "homepage_friends")) {
            return C194487kC.LIZ;
        }
        return C194127jc.LIZ;
    }

    public final synchronized NowListFragmentPanel LIZIZ(Fragment fragment, InterfaceC55062LjG interfaceC55062LjG, String enterFrom, String str) {
        NowListFragmentPanel nowListFragmentPanel;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (fragment.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED && fragment.mo49getActivity() != null) {
            C62822Ol8 c62822Ol8 = NowListFragmentPanel.LJLJLLL;
            WeakReference weakReference = (WeakReference) ((HashMap) c62822Ol8.getValue()).get(Integer.valueOf(fragment.hashCode()));
            if (weakReference != null && (nowListFragmentPanel = (NowListFragmentPanel) weakReference.get()) != null) {
                return nowListFragmentPanel;
            }
            NowListFragmentPanel nowListFragmentPanel2 = new NowListFragmentPanel(fragment, interfaceC55062LjG, enterFrom);
            ((HashMap) c62822Ol8.getValue()).put(Integer.valueOf(fragment.hashCode()), new WeakReference(nowListFragmentPanel2));
            fragment.getLifecycle().addObserver(nowListFragmentPanel2);
            C8VV.LIZ(fragment, false, new AqS13S2100000_3(fragment, enterFrom, str, 2));
            return nowListFragmentPanel2;
        }
        return null;
    }
}
