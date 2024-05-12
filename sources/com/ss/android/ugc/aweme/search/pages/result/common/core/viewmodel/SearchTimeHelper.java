package com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel;

import X.C48891JGt;
import X.InterfaceC48888JGq;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchTimeHelper {
    public static final Map<LifecycleOwner, SearchTimeHelper> LIZIZ = new LinkedHashMap();
    public long LIZ;

    /* loaded from: classes9.dex */
    public static final class Companion {
        public static SearchTimeHelper LIZ(final LifecycleOwner owner) {
            o.LJIIIZ(owner, "owner");
            Map<LifecycleOwner, SearchTimeHelper> map = SearchTimeHelper.LIZIZ;
            SearchTimeHelper searchTimeHelper = (SearchTimeHelper) ((LinkedHashMap) map).get(owner);
            if (searchTimeHelper == null) {
                SearchTimeHelper searchTimeHelper2 = new SearchTimeHelper();
                map.put(owner, searchTimeHelper2);
                owner.getLifecycle().addObserver(new InterfaceC48888JGq() { // from class: com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.SearchTimeHelper$Companion$get$1
                    @Override // X.InterfaceC48888JGq
                    public final void onDestroy() {
                        SearchTimeHelper.LIZIZ.remove(LifecycleOwner.this);
                    }

                    @Override // X.InterfaceC48888JGq
                    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
                    public void onCreate() {
                        C48891JGt.onCreate(this);
                    }

                    @Override // X.InterfaceC48888JGq
                    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                    public void onPause() {
                        C48891JGt.onPause(this);
                    }

                    @Override // X.InterfaceC48888JGq
                    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                    public void onResume() {
                        C48891JGt.onResume(this);
                    }

                    @Override // X.InterfaceC48888JGq
                    @OnLifecycleEvent(Lifecycle.Event.ON_START)
                    public void onStart() {
                        C48891JGt.onStart(this);
                    }

                    @Override // X.InterfaceC48888JGq
                    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                    public void onStop() {
                        C48891JGt.onStop(this);
                    }
                });
                return searchTimeHelper2;
            }
            return searchTimeHelper;
        }
    }
}
