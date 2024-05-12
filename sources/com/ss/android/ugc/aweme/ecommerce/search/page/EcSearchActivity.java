package com.ss.android.ugc.aweme.ecommerce.search.page;

import X.AbstractActivityC27434Api;
import X.C16880lQ;
import X.C221108m2;
import X.C2L4;
import X.C35O;
import X.C47261Igj;
import X.C51303KBn;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C76965UIn;
import X.EnumC37184Eia;
import X.InterfaceC18010nF;
import X.InterfaceC45601Hv3;
import X.InterfaceC51123K4p;
import X.ORZ;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.agilelogger.ALog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcSearchActivity extends AbstractActivityC27434Api implements InterfaceC18010nF, InterfaceC45601Hv3, C2L4 {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 52));

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b7349";
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFZ() {
        /*
            r18 = this;
            r6 = r18
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r5 = "searchParam"
            java.io.Serializable r4 = r0.getSerializableExtra(r5)
            com.ss.android.ugc.aweme.search.model.SearchResultParam r4 = (com.ss.android.ugc.aweme.search.model.SearchResultParam) r4
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r3 = "search_enter_param"
            java.io.Serializable r1 = r0.getSerializableExtra(r3)
            android.content.Intent r2 = r6.getIntent()
            java.lang.String r0 = "search_context_source"
            java.io.Serializable r2 = r2.getSerializableExtra(r0)
            X.JuK r2 = (X.C50652JuK) r2
            r10 = 0
            if (r2 == 0) goto L89
            android.content.Intent r0 = r6.getIntent()
            android.os.Bundle r7 = X.C16880lQ.LLJJIJI(r0)
            if (r7 == 0) goto L39
            java.lang.String r0 = "in_single_stack"
            boolean r0 = r7.getBoolean(r0)
            if (r0 != 0) goto L89
        L39:
            android.app.Activity r7 = com.ss.android.ugc.aweme.utils.ActivityStack.getPreviousActivity()
            if (r7 == 0) goto L89
            boolean r0 = r7 instanceof com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity
            if (r0 == 0) goto L89
            boolean r0 = r7.isFinishing()
            if (r0 != 0) goto L89
            X.JuJ r0 = X.C50652JuK.Companion
            androidx.lifecycle.LifecycleOwner r7 = (androidx.lifecycle.LifecycleOwner) r7
            r0.getClass()
            X.JuK r7 = X.C50651JuJ.LJIIJ(r7)
            if (r7 == 0) goto L89
            X.JuI r8 = r2.getImmutableData()
            X.JuI r0 = r7.getImmutableData()
            X.Jqn r9 = r0.getSearchCommonModel()
            X.JuI r0 = r7.getImmutableData()
            X.JrN r11 = r0.getSearchVideoModel()
            X.JuI r0 = r7.getImmutableData()
            X.Jdw r13 = r0.getSearchSessionModel()
            X.JuI r0 = r7.getImmutableData()
            X.K5P r14 = r0.getSearchEcommerceModel()
            r16 = 74
            r12 = r10
            r15 = r10
            r17 = r10
            X.JuI r7 = X.C50650JuI.copy$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 2
            X.JuK r2 = X.C50652JuK.copy$default(r2, r7, r10, r0, r10)
        L89:
            if (r1 != 0) goto La5
            if (r4 == 0) goto L100
            X.Jz6 r1 = r4.getSearchEnterParam()
            if (r1 != 0) goto La5
        L93:
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r0 = "enter_from"
            java.lang.String r8 = X.C16880lQ.LLJJIJIIJIL(r7, r0)
            if (r8 == 0) goto La5
            int r0 = r8.length()
            if (r0 != 0) goto Ldb
        La5:
            if (r2 == 0) goto Lac
            java.lang.Class<X.JuK> r0 = X.C50652JuK.class
            X.C1DH.LIZ(r6, r2, r0)
        Lac:
            if (r4 == 0) goto Lda
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r0.putSerializable(r5, r4)
            r0.putSerializable(r3, r1)
            com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchFragment r3 = new com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchFragment
            r3.<init>()
            r3.setArguments(r0)
            androidx.fragment.app.FragmentManager r1 = r6.getSupportFragmentManager()
            java.lang.String r0 = "supportFragmentManager"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.1B3 r2 = new X.1B3
            r2.<init>(r1)
            r1 = 2131367371(0x7f0a15cb, float:1.8354662E38)
            java.lang.String r0 = "container"
            r2.LJIIJ(r3, r0, r1)
            r2.LJI()
        Lda:
            return
        Ldb:
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "group_id"
            java.lang.String r7 = X.C16880lQ.LLJJIJIIJIL(r1, r0)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "author_id"
            java.lang.String r1 = X.C16880lQ.LLJJIJIIJIL(r1, r0)
            X.JzD r0 = X.C50948Jz6.Companion
            X.Jz5 r0 = r0.newBuilder()
            r0.LIZ = r8
            r0.LJ = r7
            r0.LJFF = r1
            X.Jz6 r1 = r0.LIZIZ()
            goto La5
        L100:
            r1 = r10
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity.LLFZ():void");
    }

    @Override // X.InterfaceC45601Hv3
    public final InterfaceC51123K4p getInflater() {
        return (InterfaceC51123K4p) this.LJLJJI.getValue();
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(ECSearchPageScope.class);
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        Queue<List<EcSearchActivity>> queue = C35O.LIZ;
        if (queue.isEmpty()) {
            return;
        }
        Iterator<List<EcSearchActivity>> it = queue.iterator();
        while (it.hasNext()) {
            List<EcSearchActivity> next = it.next();
            Iterator<EcSearchActivity> it2 = next.iterator();
            while (it2.hasNext()) {
                if (o.LJ(it2.next(), this)) {
                    it2.remove();
                }
            }
            if (next.size() == 0) {
                it.remove();
            }
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle LLJJIJI;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity", "onCreate", true);
        activityConfiguration(new AqS174S0100000_8(this, 15));
        super.onCreate(bundle);
        activityConfiguration(C51303KBn.LJLIL);
        try {
            setContentView(EnumC37184Eia.INSTANCE.getView(this, R.layout.e3, null));
            LLFZ();
            Iterator<T> it = C35O.LIZ.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((List) it.next()).size();
            }
            if (i >= 6) {
                Queue<List<EcSearchActivity>> queue = C35O.LIZ;
                List list = (List) ORZ.LJLLL(queue);
                if (list == null) {
                    list = new ArrayList();
                }
                if (list.isEmpty()) {
                    ((LinkedList) queue).poll();
                } else {
                    Activity activity = (Activity) ListProtector.remove(list, 0);
                    if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                        activity.finish();
                    }
                }
            }
            Queue<List<EcSearchActivity>> queue2 = C35O.LIZ;
            if (queue2.isEmpty() || ((LLJJIJI = C16880lQ.LLJJIJI(getIntent())) != null && LLJJIJI.getBoolean("in_single_stack"))) {
                ((LinkedList) queue2).offer(C47261Igj.LJII(this));
            } else {
                List list2 = (List) ORZ.LLFFF(queue2);
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(this);
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity", "onCreate", false);
        } catch (RuntimeException e) {
            ALog.e("search", e);
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity", "onCreate", false);
        }
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        LLFZ();
    }
}
