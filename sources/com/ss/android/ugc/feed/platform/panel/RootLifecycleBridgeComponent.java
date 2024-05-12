package com.ss.android.ugc.feed.platform.panel;

import X.C212428Vi;
import X.C8W0;
import X.KR6;
import X.KR7;
import X.KUD;
import X.X1D;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class RootLifecycleBridgeComponent extends BasePanelUIComponent implements KR7 {
    public BaseListFragmentPanel LJLJJI;

    @Override // X.KR6
    public final void v() {
    }

    public RootLifecycleBridgeComponent() {
        new LinkedHashMap();
    }

    @Override // X.KR6
    public final void LJLLILLLL() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJJI;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onDestroyView();
        }
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).LJLLILLLL();
            }
        }
    }

    @Override // X.KR6
    public final void LLJILJIL() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJJI;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onStart();
        }
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).LLJILJIL();
            }
        }
    }

    @Override // X.KR6
    public final void LLJLLL() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJJI;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onPause();
        }
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).LLJLLL();
            }
        }
    }

    @Override // X.KR6
    public final void LLLIL() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJJI;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onDestroy();
        }
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).LLLIL();
            }
        }
    }

    @Override // X.KR6
    public final void LLLLZLLLI() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJJI;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onStop();
        }
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).LLLLZLLLI();
            }
        }
    }

    @Override // X.KR6
    public final void W1() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJJI;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onDetach();
        }
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).W1();
            }
        }
    }

    @Override // X.KR6
    public final void d5() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJJI;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onResume();
        }
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).d5();
            }
        }
    }

    @Override // X.KR6
    public final void LLIIIJ(Configuration newConfig) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        o.LJIIIZ(newConfig, "newConfig");
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJJI;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onConfigurationChanged(newConfig);
        }
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).LLIIIJ(newConfig);
            }
        }
    }

    @Override // X.KR6
    public final void LLLII(Bundle outState) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        o.LJIIIZ(outState, "outState");
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJJI;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onSaveInstanceState(outState);
        }
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).LLLII(outState);
            }
        }
    }

    @Override // X.KR6
    public final void LLLLLZ(Bundle bundle) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJJI;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onViewStateRestored(bundle);
        }
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).LLLLLZ(bundle);
            }
        }
    }

    @Override // X.KR6
    public void N1(Bundle bundle) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreate():");
        LIZ.append(getPanelContext().LJ);
        KUD.LIZJ(X1D.LIZIZ(LIZ), null);
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJJI;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onCreate(bundle);
        }
    }

    @Override // X.KR6
    public void LJJJJI(View view, Bundle bundle) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJJI;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onViewCreated(view, bundle);
        }
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).LJJJJI(view, bundle);
            }
        }
    }

    @Override // X.KR6
    public void j(Activity context, Fragment fragment) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(fragment, "fragment");
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJJI;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onAttach(context, fragment);
        }
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).j(context, fragment);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[LOOP:2: B:35:0x0061->B:37:0x0067, LOOP_END] */
    @Override // X.KR7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LLJLL(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            com.bytedance.assem.arch.core.AssemSupervisor r0 = X.C212428Vi.LIZJ(r5)
            if (r0 == 0) goto L37
            java.util.concurrent.CopyOnWriteArrayList<X.8W0> r0 = r0.LJLLI
            if (r0 == 0) goto L37
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L18:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.KR7
            if (r0 == 0) goto L18
            r3.add(r1)
            goto L18
        L2a:
            java.lang.Object r0 = X.ORZ.LJLLLL(r3)
            X.KR7 r0 = (X.KR7) r0
            if (r0 == 0) goto L37
            android.view.View r4 = r0.LLJLL(r6, r7, r8)
            goto L38
        L37:
            r4 = 0
        L38:
            com.bytedance.assem.arch.core.AssemSupervisor r0 = X.C212428Vi.LIZJ(r5)
            if (r0 == 0) goto L71
            java.util.concurrent.CopyOnWriteArrayList<X.8W0> r0 = r0.LJLLI
            if (r0 == 0) goto L71
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L4b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.KR6
            if (r0 == 0) goto L4b
            r3.add(r1)
            goto L4b
        L5d:
            java.util.Iterator r1 = r3.iterator()
        L61:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r1.next()
            X.KR6 r0 = (X.KR6) r0
            r0.v()
            goto L61
        L71:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.RootLifecycleBridgeComponent.LLJLL(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
