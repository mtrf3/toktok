package com.ss.android.ugc.aweme.ecommerce.base.common;

import X.C16880lQ;
import X.C238659Yf;
import X.C70567Rml;
import X.C70853RrN;
import X.C70858RrS;
import X.C79234V7u;
import X.InterfaceC27538ArO;
import X.InterfaceC71003Rtn;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ECAnimDowngradeFragment extends Fragment implements InterfaceC27538ArO {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public boolean downgrade() {
        return false;
    }

    @Override // X.InterfaceC37828Esy
    public String getPageNameKey() {
        return "page_name";
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC37828Esy
    public String getPageName() {
        return C16880lQ.LJLLJ(getClass());
    }

    @Override // X.InterfaceC71003Rtn
    public InterfaceC71003Rtn preTrackNode() {
        return C79234V7u.LJIILL(this);
    }

    public final boolean shouldDowngrade() {
        if (downgrade()) {
            C238659Yf.LIZ.getClass();
            if (C238659Yf.LIZ()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC37828Esy
    public Map<String, String> getMapRule() {
        return C70567Rml.LIZIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public List<String> getRegisteredLane() {
        return C70567Rml.LIZ;
    }

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
    }

    public void trackFirstScreen(View view) {
        C70853RrN.LIZJ(this, view);
    }

    @Override // X.InterfaceC27538ArO
    public void setupTrack(View view, LifecycleOwner lifecycleOwner) {
        C70853RrN.LIZ(this, view, lifecycleOwner);
    }
}
