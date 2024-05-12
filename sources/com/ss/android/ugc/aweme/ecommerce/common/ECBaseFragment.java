package com.ss.android.ugc.aweme.ecommerce.common;

import X.AbstractActivityC27434Api;
import X.C16880lQ;
import X.C238659Yf;
import X.C70567Rml;
import X.C70853RrN;
import X.C70858RrS;
import X.C78929UyL;
import X.C79234V7u;
import X.InterfaceC27438Apm;
import X.InterfaceC71003Rtn;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ECBaseFragment extends AmeBaseFragment implements InterfaceC27438Apm {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public long enterTime = SystemClock.elapsedRealtime();

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

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    private final boolean shouldDowngrade() {
        if (downgrade()) {
            C238659Yf.LIZ.getClass();
            if (C238659Yf.LIZ()) {
                return true;
            }
        }
        return false;
    }

    public String getPageName() {
        return C16880lQ.LJLLJ(getClass());
    }

    public final long getStayDuration() {
        return SystemClock.elapsedRealtime() - this.enterTime;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onStart() {
        DialogFragment dialogFragment;
        Dialog dialog;
        Window window;
        if (shouldDowngrade()) {
            Fragment parentFragment = getParentFragment();
            if ((parentFragment instanceof DialogFragment) && (dialogFragment = (DialogFragment) parentFragment) != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
                window.setWindowAnimations(R.style.a61);
            }
        }
        this.enterTime = SystemClock.elapsedRealtime();
        super.onStart();
    }

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
