package com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.viewmodel;

import X.ActivityC45651qj;
import X.AnonymousClass960;
import X.C08880Wm;
import X.C48891JGt;
import X.C49759Jfv;
import X.C55230Lly;
import X.C55247LmF;
import X.C73210SoI;
import X.InterfaceC48888JGq;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchHashtagHeaderHelper {
    public static final Map<LifecycleOwner, SearchHashtagHeaderHelper> LIZLLL = new LinkedHashMap();
    public AnonymousClass960 LIZ;
    public C73210SoI LIZIZ;
    public View LIZJ;

    public final void LIZ() {
        AnonymousClass960 anonymousClass960 = this.LIZ;
        if (anonymousClass960 != null) {
            anonymousClass960.setVisibility(8);
        }
        C73210SoI c73210SoI = this.LIZIZ;
        if (c73210SoI != null) {
            c73210SoI.LLFFF(this.LIZ);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* loaded from: classes9.dex */
    public static final class Companion {
        public static SearchHashtagHeaderHelper LIZ(final LifecycleOwner owner) {
            o.LJIIIZ(owner, "owner");
            Map<LifecycleOwner, SearchHashtagHeaderHelper> map = SearchHashtagHeaderHelper.LIZLLL;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            linkedHashMap.get(owner);
            SearchHashtagHeaderHelper searchHashtagHeaderHelper = (SearchHashtagHeaderHelper) linkedHashMap.get(owner);
            if (searchHashtagHeaderHelper == null) {
                SearchHashtagHeaderHelper searchHashtagHeaderHelper2 = new SearchHashtagHeaderHelper();
                map.put(owner, searchHashtagHeaderHelper2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("add ");
                LIZ.append(owner);
                LIZ.append(" and size is");
                LIZ.append(map.size());
                X1D.LIZIZ(LIZ);
                owner.getLifecycle().addObserver(new InterfaceC48888JGq() { // from class: com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.viewmodel.SearchHashtagHeaderHelper$Companion$get$1
                    @Override // X.InterfaceC48888JGq
                    public final void onDestroy() {
                        Map<LifecycleOwner, SearchHashtagHeaderHelper> map2 = SearchHashtagHeaderHelper.LIZLLL;
                        SearchHashtagHeaderHelper searchHashtagHeaderHelper3 = (SearchHashtagHeaderHelper) ((LinkedHashMap) map2).get(LifecycleOwner.this);
                        if (searchHashtagHeaderHelper3 != null) {
                            LifecycleOwner lifecycleOwner = LifecycleOwner.this;
                            if (lifecycleOwner instanceof ActivityC45651qj) {
                                C55247LmF.LJ(C55230Lly.LIZLLL((ActivityC45651qj) lifecycleOwner, null), C49759Jfv.class, "source_default_key");
                            } else if (lifecycleOwner instanceof Fragment) {
                                C55247LmF.LJ(C55230Lly.LIZJ((Fragment) lifecycleOwner, null), C49759Jfv.class, "source_default_key");
                            }
                            if (C08880Wm.LIZ(0, 0, "search_hashtag_memory_leakage", true) == 0) {
                                searchHashtagHeaderHelper3.LIZJ = null;
                                searchHashtagHeaderHelper3.LIZIZ = null;
                            }
                        }
                        map2.remove(LifecycleOwner.this);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("remove ");
                        LIZ2.append(LifecycleOwner.this);
                        LIZ2.append(" and size is");
                        LIZ2.append(map2.size());
                        X1D.LIZIZ(LIZ2);
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
                return searchHashtagHeaderHelper2;
            }
            return searchHashtagHeaderHelper;
        }
    }
}
