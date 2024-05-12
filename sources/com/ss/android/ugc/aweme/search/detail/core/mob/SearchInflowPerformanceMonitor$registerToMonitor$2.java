package com.ss.android.ugc.aweme.search.detail.core.mob;

import X.C09G;
import X.JQP;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchInflowPerformanceMonitor$registerToMonitor$2 implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final /* synthetic */ Map<String, String> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ IViewPagerComponentAbility LJLJI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        String str;
        o.LJIIIZ(owner, "owner");
        JQP jqp = new JQP();
        jqp.LJIIZILJ("search_id", this.LJLIL.get("search_id"));
        jqp.LJIIZILJ("search_keyword", this.LJLIL.get("search_keyword"));
        jqp.LJIJI(this.LJLILLLLZI);
        Aweme currentAweme = this.LJLJI.getCurrentAweme();
        if (currentAweme == null || (str = currentAweme.getAid()) == null) {
            str = this.LJLIL.get("search_result_id");
        }
        jqp.LJIJ("search_result_id", str);
        jqp.LJIILIIL();
    }

    public SearchInflowPerformanceMonitor$registerToMonitor$2(Map<String, String> map, String str, IViewPagerComponentAbility iViewPagerComponentAbility) {
        this.LJLIL = map;
        this.LJLILLLLZI = str;
        this.LJLJI = iViewPagerComponentAbility;
    }
}
