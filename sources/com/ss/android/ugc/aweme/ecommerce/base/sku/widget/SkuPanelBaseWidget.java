package com.ss.android.ugc.aweme.ecommerce.base.sku.widget;

import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class SkuPanelBaseWidget extends JediBaseWidget {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 mViewModel$delegate;

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
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void initSubscribe() {
    }

    public void initView() {
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SkuPanelBaseWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(SkuPanelViewModel.class);
        this.mViewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 79));
    }

    public final SkuPanelViewModel getMViewModel() {
        return (SkuPanelViewModel) this.mViewModel$delegate.getValue();
    }

    @Override // com.bytedance.widget.Widget
    public void onCreate() {
        super.onCreate();
        initView();
        initSubscribe();
    }

    public final <T extends View> T findView(int i) {
        View view = this.contentView;
        o.LJI(view);
        T t = (T) view.findViewById(i);
        o.LJI(t);
        return t;
    }
}
