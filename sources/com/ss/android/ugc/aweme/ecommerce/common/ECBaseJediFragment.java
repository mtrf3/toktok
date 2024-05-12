package com.ss.android.ugc.aweme.ecommerce.common;

import X.AbstractActivityC27434Api;
import X.C16880lQ;
import X.C70567Rml;
import X.C70853RrN;
import X.C70858RrS;
import X.C78929UyL;
import X.C79234V7u;
import X.InterfaceC27438Apm;
import X.InterfaceC71003Rtn;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ECBaseJediFragment extends JediBaseFragment implements InterfaceC27438Apm {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public long enterTime = SystemClock.elapsedRealtime();

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment
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

    @Override // X.InterfaceC37828Esy
    public String getPageNameKey() {
        return "page_name";
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public String getPageName() {
        return C16880lQ.LJLLJ(getClass());
    }

    public final long getStayDuration() {
        return SystemClock.elapsedRealtime() - this.enterTime;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onStart() {
        this.enterTime = SystemClock.elapsedRealtime();
        super.onStart();
    }

    @Override // X.InterfaceC71003Rtn
    public InterfaceC71003Rtn preTrackNode() {
        InterfaceC71003Rtn LJIILL = C79234V7u.LJIILL(this);
        if (LJIILL == null) {
            Context context = getContext();
            if (context instanceof AbstractActivityC27434Api) {
                return (AbstractActivityC27434Api) context;
            }
            return null;
        }
        return LJIILL;
    }

    @Override // X.InterfaceC37828Esy
    public Map<String, String> getMapRule() {
        return C70567Rml.LIZIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public List<String> getRegisteredLane() {
        return C70567Rml.LIZ;
    }

    public void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C78929UyL.LJIJI(this);
    }

    public boolean onDetectBlank(Map<String, String> params) {
        o.LJIIIZ(params, "params");
        return false;
    }

    public void trackFirstScreen(View view) {
        o.LJIIIZ(view, "view");
        C70853RrN.LIZJ(this, view);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C70853RrN.LIZIZ(this, view, null, 2);
        trackFirstScreen(view);
    }

    @Override // X.InterfaceC27538ArO
    public void setupTrack(View view, LifecycleOwner lifecycleOwner) {
        C70853RrN.LIZ(this, view, lifecycleOwner);
    }
}
