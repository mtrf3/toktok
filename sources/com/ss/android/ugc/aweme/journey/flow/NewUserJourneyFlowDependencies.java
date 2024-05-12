package com.ss.android.ugc.aweme.journey.flow;

import X.C40770FzK;
import X.C76800UCe;
import X.G0J;
import X.InterfaceC65784Pro;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NewUserJourneyFlowDependencies extends ViewModel {
    public ComponentDependencies LJLIL;
    public MutableLiveData<Boolean> LJLILLLLZI;
    public InterfaceC65784Pro<C76800UCe> LJLJI;
    public final G0J LJLJJI = new G0J();
    public InterfaceC65784Pro<? extends WeakReference<Context>> LJLJJL = C40770FzK.LJLIL;

    public final ComponentDependencies gv0() {
        if (this.LJLIL == null) {
            this.LJLIL = new ComponentDependencies();
        }
        ComponentDependencies componentDependencies = this.LJLIL;
        if (componentDependencies != null) {
            return componentDependencies;
        }
        o.LJIJI("componentDependencies");
        throw null;
    }
}
