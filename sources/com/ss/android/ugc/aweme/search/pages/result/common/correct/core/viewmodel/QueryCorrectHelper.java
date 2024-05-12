package com.ss.android.ugc.aweme.search.pages.result.common.correct.core.viewmodel;

import X.ActivityC45651qj;
import X.C48891JGt;
import X.C49817Jgr;
import X.C50137Jm1;
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
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class QueryCorrectHelper {
    public static final Map<LifecycleOwner, QueryCorrectHelper> LJI = new LinkedHashMap();
    public QueryCorrectInfo LIZ;
    public QueryCorrectComponentInfo LIZIZ;
    public C50137Jm1 LIZJ;
    public C73210SoI LIZLLL;
    public View LJ;
    public View LJFF;

    /* loaded from: classes9.dex */
    public static final class Companion {
        public static QueryCorrectHelper LIZ(final LifecycleOwner owner) {
            o.LJIIIZ(owner, "owner");
            Map<LifecycleOwner, QueryCorrectHelper> map = QueryCorrectHelper.LJI;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            linkedHashMap.get(owner);
            QueryCorrectHelper queryCorrectHelper = (QueryCorrectHelper) linkedHashMap.get(owner);
            if (queryCorrectHelper == null) {
                QueryCorrectHelper queryCorrectHelper2 = new QueryCorrectHelper();
                map.put(owner, queryCorrectHelper2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("add ");
                LIZ.append(owner);
                LIZ.append(" and size is");
                LIZ.append(map.size());
                X1D.LIZIZ(LIZ);
                owner.getLifecycle().addObserver(new InterfaceC48888JGq() { // from class: com.ss.android.ugc.aweme.search.pages.result.common.correct.core.viewmodel.QueryCorrectHelper$Companion$get$1
                    @Override // X.InterfaceC48888JGq
                    public final void onDestroy() {
                        Map<LifecycleOwner, QueryCorrectHelper> map2 = QueryCorrectHelper.LJI;
                        if (((LinkedHashMap) map2).get(LifecycleOwner.this) != null) {
                            LifecycleOwner lifecycleOwner = LifecycleOwner.this;
                            if (lifecycleOwner instanceof ActivityC45651qj) {
                                C55247LmF.LJ(C55230Lly.LIZLLL((ActivityC45651qj) lifecycleOwner, null), C49817Jgr.class, "source_default_key");
                            } else if (lifecycleOwner instanceof Fragment) {
                                C55247LmF.LJ(C55230Lly.LIZJ((Fragment) lifecycleOwner, null), C49817Jgr.class, "source_default_key");
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
                return queryCorrectHelper2;
            }
            return queryCorrectHelper;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0056 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0059 A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.String LIZIZ(com.ss.android.ugc.aweme.discover.model.SearchApiResult r5) {
            /*
                r4 = 0
                if (r5 == 0) goto L6b
                java.util.List<com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo> r0 = r5.components
                if (r0 == 0) goto L62
                java.util.Iterator r3 = r0.iterator()
            Lb:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L5e
                java.lang.Object r2 = r3.next()
                r0 = r2
                com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo r0 = (com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo) r0
                java.lang.String r1 = r0.type
                java.lang.String r0 = "header"
                boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
                if (r0 == 0) goto Lb
            L22:
                com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo r2 = (com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo) r2
                if (r2 == 0) goto L62
                java.util.List<com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo> r0 = r2.components
                if (r0 == 0) goto L62
                java.util.Iterator r3 = r0.iterator()
            L2e:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L5c
                java.lang.Object r2 = r3.next()
                r0 = r2
                com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo r0 = (com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo) r0
                java.lang.String r1 = r0.type
                java.lang.String r0 = "query_correct_info"
                boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
                if (r0 == 0) goto L2e
            L45:
                com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo r2 = (com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo) r2
                if (r2 == 0) goto L62
                com.ss.android.ugc.aweme.search.arch.v2.docker.components.BizData r0 = r2.bizData
                if (r0 == 0) goto L62
                com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo r0 = r0.queryCorrectInfo
                if (r0 == 0) goto L60
                int r1 = r0.correctLevel
            L53:
                r0 = 2
                if (r1 != r0) goto L59
                java.lang.String r0 = "strong"
            L58:
                return r0
            L59:
                java.lang.String r0 = "weak"
                goto L58
            L5c:
                r2 = r4
                goto L45
            L5e:
                r2 = r4
                goto L22
            L60:
                if (r5 == 0) goto L6b
            L62:
                com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo r0 = r5.queryCorrectInfo
                if (r0 == 0) goto L6b
                int r1 = r0.getCorrectedLevel()
                goto L53
            L6b:
                java.lang.String r0 = "none"
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.correct.core.viewmodel.QueryCorrectHelper.Companion.LIZIZ(com.ss.android.ugc.aweme.discover.model.SearchApiResult):java.lang.String");
        }
    }
}
