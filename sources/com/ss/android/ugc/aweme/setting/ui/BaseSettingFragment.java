package com.ss.android.ugc.aweme.setting.ui;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class BaseSettingFragment extends BaseFragment {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public View cacheView;
    public boolean isInit;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
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

    public final View wrapOnCreateView(InterfaceC65784Pro<? extends View> action) {
        ViewGroup viewGroup;
        o.LJIIIZ(action, "action");
        View view = this.cacheView;
        if (view == null) {
            this.cacheView = action.invoke();
        } else {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.endViewTransition(this.cacheView);
            }
        }
        View view2 = this.cacheView;
        o.LJI(view2);
        return view2;
    }

    public final void wrapOnViewCreated(InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(action, "action");
        if (!this.isInit) {
            this.isInit = true;
            action.invoke();
        }
    }
}
