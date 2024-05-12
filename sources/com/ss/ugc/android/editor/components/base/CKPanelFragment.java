package com.ss.ugc.android.editor.components.base;

import X.C1280550v;
import X.C1291054w;
import X.C57D;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModel;
import com.ss.ugc.android.editor.components.base.panel.NLEPanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class CKPanelFragment<VM extends ViewModel> extends NLEPanelFragment<VM> {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.ugc.android.editor.components.base.panel.NLEPanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.NLEPanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final int vl() {
        return R.layout.w1;
    }

    public CKPanelFragment() {
        C1291054w.LIZ();
        C57D c57d = C1280550v.LIZ().LIZ().LIZ;
        if (c57d != null) {
            c57d.getResourceConfig();
        }
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final ViewGroup wl(View view) {
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.bc1);
        }
        return null;
    }
}
