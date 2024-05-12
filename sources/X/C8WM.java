package X;

import X.C8WM;
import X.C8WO;
import X.C8WT;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.8WM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8WM implements C70G {
    public static final C8WM LIZ = new C8WM();
    public static final C8WO LIZIZ = new C8WO();

    @Override // X.C70G
    public final void LIZJ(boolean z) {
        LIZIZ.LIZJ(z);
    }

    @Override // X.C70G
    public final void LIZLLL(java.util.Set<String> set) {
        LIZIZ.LIZLLL(set);
    }

    @Override // X.C70G
    public final void LJFF(C1794472m c1794472m) {
        LIZIZ.LJFF(c1794472m);
    }

    @Override // X.C70G
    public final void LJI(int i) {
        LIZIZ.LJI(i);
    }

    @Override // X.C70G
    public final void LIZ(int i, Editable editable) {
        LIZIZ.LIZ(i, editable);
    }

    @Override // X.C70G
    public final String LIZIZ(int i, Editable editable, boolean z) {
        return C118264kY.LIZ(i, editable, z);
    }

    @Override // X.C70G
    public final C8WT LJ(final Context context, ViewGroup container, C70R c70r) {
        Lifecycle lifecycle;
        o.LJIIIZ(container, "container");
        LifecycleOwner LIZIZ2 = C57434MgQ.LIZIZ(context);
        if (LIZIZ2 != null && (lifecycle = LIZIZ2.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.mention.bridge.CommentMentionManagerV0$initView$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    Context context2;
                    Context context3 = context;
                    C8WO c8wo = C8WM.LIZIZ;
                    C8WT c8wt = c8wo.LIZIZ;
                    if (c8wt != null) {
                        context2 = c8wt.getContext();
                    } else {
                        context2 = null;
                    }
                    if (o.LJ(context2, context3)) {
                        c8wo.LIZIZ = null;
                    }
                }
            });
        }
        return LIZIZ.LJ(context, container, c70r);
    }

    @Override // X.C70G
    public final void LJII(Context context, Fragment fragment, java.util.Set<String> set, View.OnClickListener onClickListener, InterfaceC88472Yns<? super User, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super User, ? super Integer, ? super String, ? super Boolean, Boolean> interfaceC88474Ynu, InterfaceC88472Yns<? super String, Boolean> interfaceC88472Yns2) {
        o.LJIIIZ(fragment, "fragment");
        LIZIZ.LJII(context, fragment, set, onClickListener, interfaceC88472Yns, interfaceC88474Ynu, interfaceC88472Yns2);
    }
}
