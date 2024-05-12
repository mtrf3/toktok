package com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel;

import X.C48891JGt;
import X.C49133JQb;
import X.C50166JmU;
import X.InterfaceC48888JGq;
import android.util.ArrayMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchResultStayHelper {
    public static final ArrayMap<LifecycleOwner, SearchResultStayHelper> LJII = new ArrayMap<>();
    public long LIZ = -1;
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public String LJI = "";

    public final void LIZ() {
        if (this.LIZ <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", this.LIZIZ);
        arrayMap.put("enter_method", this.LIZJ);
        arrayMap.put("search_type", this.LIZLLL);
        arrayMap.put("search_id", this.LJ);
        arrayMap.put("search_keyword", this.LJFF);
        arrayMap.put("group_id", this.LJI);
        arrayMap.put("duration", String.valueOf(currentTimeMillis));
        C50166JmU c50166JmU = new C50166JmU();
        c50166JmU.LJIILLIIL(arrayMap);
        c50166JmU.LJIILIIL();
        this.LIZ = -1L;
    }

    /* loaded from: classes9.dex */
    public static final class Companion {
        public static SearchResultStayHelper LIZ(final LifecycleOwner owner) {
            o.LJIIIZ(owner, "owner");
            ArrayMap<LifecycleOwner, SearchResultStayHelper> arrayMap = SearchResultStayHelper.LJII;
            SearchResultStayHelper searchResultStayHelper = arrayMap.get(owner);
            if (searchResultStayHelper == null) {
                SearchResultStayHelper searchResultStayHelper2 = new SearchResultStayHelper();
                arrayMap.put(owner, searchResultStayHelper2);
                owner.getLifecycle().addObserver(new InterfaceC48888JGq() { // from class: com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.SearchResultStayHelper$Companion$get$1
                    @Override // X.InterfaceC48888JGq
                    public final void onDestroy() {
                        SearchResultStayHelper.LJII.remove(LifecycleOwner.this);
                        C49133JQb.LIZ("SRSH", new Object[0]);
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
                return searchResultStayHelper2;
            }
            return searchResultStayHelper;
        }
    }
}
