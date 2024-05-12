package com.bytedance.assem.arch.reused;

import X.C16880lQ;
import X.C214368bA;
import X.C3C8;
import X.C76800UCe;
import X.C8V8;
import X.C8WI;
import X.InterfaceC65784Pro;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class ReusedUIAssem<RECEIVER extends C3C8> extends ReusedAssem<RECEIVER> {
    public View LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final CopyOnWriteArrayList<InterfaceC65784Pro<C76800UCe>> LJLLLLLL = new CopyOnWriteArrayList<>();

    public void N3(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.C8W0
    public final void handleOnParentViewCreated$assem_release() {
    }

    public abstract void onCreateView();

    @Override // X.C8W0
    public final void onParentViewCreated() {
    }

    public abstract void onViewCreated(View view);

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void H3() {
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3((ReusedUIAssem) this, 35);
        if (this.LJLLLL) {
            aqS153S0100000_3.invoke();
        } else {
            this.LJLLLLLL.add(aqS153S0100000_3);
        }
    }

    public View getContainerView() {
        View view = this.LJLLJ;
        if (view != null) {
            return view;
        }
        o.LJIJI("containerView");
        throw null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        C8WI.LIZ(new AqS153S0100000_3((ReusedUIAssem) this, 34));
        this.LJLLL = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        this.LJLLL = false;
    }

    public final void M3(View view) {
        o.LJIIIZ(view, "view");
        C8V8 c8v8 = C214368bA.LJII;
        if (c8v8 != null) {
            C16880lQ.LJLLJ(getClass());
            c8v8.LIZIZ("assem_createView_");
        }
        C8WI.LIZ(new AqS150S0200000_3(view, this, 14));
        this.LJLLLL = true;
        Iterator<InterfaceC65784Pro<C76800UCe>> it = this.LJLLLLLL.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        this.LJLLLLLL.clear();
        C8V8 c8v82 = C214368bA.LJII;
        if (c8v82 != null) {
            c8v82.end(C16880lQ.LJLLJ(getClass()), "assem_createView_");
        }
    }

    public void setContainerView(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJLLJ = view;
    }
}
