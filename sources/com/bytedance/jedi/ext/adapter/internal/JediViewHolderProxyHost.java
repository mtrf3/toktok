package com.bytedance.jedi.ext.adapter.internal;

import X.C16880lQ;
import X.C73250Sow;
import X.C73252Soy;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes13.dex */
public final class JediViewHolderProxyHost extends Fragment {
    public Fragment LJLIL;
    public final Map<Lifecycle, C73250Sow> LJLILLLLZI = new WeakHashMap();
    public final Set<InterfaceC65784Pro<C76800UCe>> LJLJI = new LinkedHashSet();
    public static final C73252Soy LJLJJL = new C73252Soy();
    public static final String LJLJJI = C16880lQ.LJLLILLLL(JediViewHolderProxyHost.class);

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }
}
