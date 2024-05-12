package com.ss.ugc.android.editor.components.base.panel;

import X.C125594wN;
import X.C1JI;
import X.C221108m2;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.ss.ugc.android.editor.components.base.panel.NLEPanelFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class NLEPanelFragment<VM extends ViewModel> extends BasePanelFragment {
    public final C1JI LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    public abstract VM Al();

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public NLEPanelFragment() {
        C221108m2.LIZIZ(new AqS152S0100000_2((NLEPanelFragment) this, 617));
        this.LJLILLLLZI = new C1JI();
        new C125594wN(this) { // from class: X.55I
            public final /* synthetic */ NLEPanelFragment<VM> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC126664y6
            public final void LIZIZ(EnumC126674y7 op, boolean z) {
                o.LJIIIZ(op, "op");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("BaseUndoRedoFragment::UndoRedoListener::succeed=");
                LIZ.append(z);
                LIZ.append(", Operation=");
                LIZ.append(op);
                C131935Ft.LIZ(X1D.LIZIZ(LIZ));
                if (z) {
                    this.LIZ.LJLILLLLZI.getClass();
                }
            }
        };
        C221108m2.LIZIZ(new AqS152S0100000_2((NLEPanelFragment) this, 618));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
