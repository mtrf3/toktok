package com.ss.ugc.android.editor.base.fragment;

import X.C125594wN;
import X.C221108m2;
import X.C55J;
import X.C55K;
import X.C62822Ol8;
import X.C79057V0z;
import Y.AObserverS70S0100000_2;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.ugc.android.editor.base.fragment.BaseUndoRedoFragment;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class BaseUndoRedoFragment<VM extends ViewModel> extends BasePanelFragment {
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C55K.LJLIL);
    public final C55J LJLJLLL = new C125594wN(this) { // from class: X.55J
        public final /* synthetic */ BaseUndoRedoFragment<VM> LIZ;

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
                this.LIZ.Dl();
            }
        }
    };

    public abstract void Dl();

    public abstract VM Gl();

    @Override // com.ss.ugc.android.editor.base.fragment.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.55J] */
    public BaseUndoRedoFragment() {
        C221108m2.LIZIZ(new AqS152S0100000_2((BaseUndoRedoFragment) this, 608));
    }

    public final EditorProContext Al() {
        return (EditorProContext) this.LJLJLJ.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C79057V0z.LJJIL(Al(), this.LJLJLLL);
    }

    @Override // com.ss.ugc.android.editor.base.fragment.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C79057V0z.LJJJJL(Al(), "is_bottom_panel_showing", Boolean.FALSE);
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C79057V0z.LJFF(Al(), this.LJLJLLL);
        MutableLiveData LJII = C79057V0z.LJII(Al(), "common_close_panel_event");
        if (LJII != null) {
            LJII.observe(this, new AObserverS70S0100000_2(this, 185));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C79057V0z.LJJJJL(Al(), "is_bottom_panel_showing", Boolean.TRUE);
    }
}
