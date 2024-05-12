package X;

import Y.IDLListenerS188S0100000;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.ss.android.ugc.aweme.player.sdk.api.IReflect;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J8W implements InterfaceC85311Xdz, InterfaceC75414Tik, InterfaceC48038ItG, J8Y {
    public static Field LJLIL;
    public static final J8W LJLILLLLZI = new J8W();
    public static final J8W LJLJI = new J8W();

    @Override // X.InterfaceC85311Xdz
    public void LIZJ() {
        LJ6.LIZ.storeLong(LJ6.LIZJ("nearby_gps_permission_dialog_show_time"), System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1 == true) goto L8;
     */
    @Override // X.InterfaceC48038ItG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r3) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.favorites.business.collection.CollectionAllFavoritesResponse r3 = (com.ss.android.ugc.aweme.favorites.business.collection.CollectionAllFavoritesResponse) r3
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail r0 = r3.detail
            if (r0 == 0) goto L19
            com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail$Statistic r0 = r0.statistic
            if (r0 == 0) goto L19
            boolean r1 = r0.hasVideos
            r0 = 1
            if (r1 != r0) goto L19
        L14:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L19:
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J8W.apply(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC75414Tik
    public void onSuccess(Object value) {
        o.LJIIIZ(value, "value");
    }

    public static final void LIZLLL(java.util.Map map, java.util.Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                Object key = entry.getKey();
                TreeSet treeSet = new TreeSet();
                ORY.LJJLIIIJLLLLLLLZ(treeSet, new String[0]);
                map.put(key, treeSet);
            }
            SortedSet sortedSet = (SortedSet) ((LinkedHashMap) map).get(entry.getKey());
            if (sortedSet != null) {
                sortedSet.addAll((Collection) entry.getValue());
            }
        }
    }

    public static void LJFF(String str, Surface surface) {
        IReflect iReflect = (IReflect) InjectedConfigManager.getConfig(IReflect.class);
        if (iReflect == null) {
            return;
        }
        try {
            if (LJLIL == null) {
                LJLIL = iReflect.getField(Surface.class, "mName");
            }
            if (LJLIL != null) {
                Object value = IZ8.LJII.getValue();
                o.LJIIIIZZ(value, "<get-isEnableUpdateSurfaceName>(...)");
                if (((Boolean) value).booleanValue()) {
                    iReflect.updateField(surface, LJLIL, str);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.J8Y
    public void LIZ(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String str;
        String str2;
        String str3;
        String str4;
        C198517qh c198517qh = new C198517qh();
        if (renderProcessGoneDetail.didCrash()) {
            str = "crash";
        } else {
            str = "system kill";
        }
        c198517qh.LIZLLL("exit_type", str);
        c198517qh.LIZIZ(Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()), "renderer_priority");
        c198517qh.LIZLLL("WebView", C16880lQ.LJLLILLLL(webView.getClass()));
        if (webView.getOriginalUrl() != null) {
            str2 = webView.getOriginalUrl();
        } else {
            str2 = "original_url is null";
        }
        c198517qh.LIZLLL("original_url", str2);
        if (webView.getUrl() != null) {
            str3 = webView.getUrl();
        } else {
            str3 = "url is null";
        }
        c198517qh.LIZLLL("url", str3);
        if (webView.getTitle() != null) {
            str4 = webView.getTitle();
        } else {
            str4 = "title is null";
        }
        c198517qh.LIZLLL("title", str4);
        boolean didCrash = renderProcessGoneDetail.didCrash();
        C09900aA.LJIIJJI("aweme_webview_render_exception", didCrash ? 1 : 0, c198517qh.LJ());
    }

    @Override // X.InterfaceC75414Tik
    public void LJ(LinkCoreError error, Throwable th) {
        String str;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("auto replyInvite error = ");
        LIZ.append(error);
        LIZ.append(", throwable.message=");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        JBR.LJIIJ(LIZ, str, LIZ, "MultiRefuseManager");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0lm] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0lk] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0ll] */
    public static void LIZIZ(C17040lg c17040lg, final InterfaceC65784Pro interfaceC65784Pro, final InterfaceC65784Pro interfaceC65784Pro2) {
        final InterfaceC65784Pro interfaceC65784Pro3 = null;
        final IDLListenerS188S0100000 iDLListenerS188S0100000 = new IDLListenerS188S0100000(null, 5);
        final ?? r4 = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0lm
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro3;
                if (interfaceC65784Pro4 != null) {
                    interfaceC65784Pro4.invoke();
                }
            }
        };
        final Object[] objArr = 0 == true ? 1 : 0;
        final ?? r5 = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0lk
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = objArr;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(Boolean.valueOf(z));
                }
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final ?? r6 = new ViewTreeObserver.OnDrawListener() { // from class: X.0ll
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = objArr2;
                if (interfaceC65784Pro4 != null) {
                    interfaceC65784Pro4.invoke();
                }
            }
        };
        View view = c17040lg.getViewRef().get();
        if (view != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0lj
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(final View v) {
                    o.LJIIIZ(v, "v");
                    final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = iDLListenerS188S0100000;
                    final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = r4;
                    final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = r5;
                    final ViewTreeObserver.OnDrawListener onDrawListener = r6;
                    v.post(new Runnable() { // from class: X.0lh
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ;
                            try {
                                ViewTreeObserver viewTreeObserver = v.getViewTreeObserver();
                                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = onGlobalLayoutListener;
                                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener2 = onScrollChangedListener;
                                ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener2 = onWindowFocusChangeListener;
                                ViewTreeObserver.OnDrawListener onDrawListener2 = onDrawListener;
                                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener2);
                                viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener2);
                                viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListener2);
                                viewTreeObserver.addOnDrawListener(onDrawListener2);
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    });
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = InterfaceC65784Pro.this;
                    if (interfaceC65784Pro4 != null) {
                        interfaceC65784Pro4.invoke();
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(final View v) {
                    o.LJIIIZ(v, "v");
                    final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = iDLListenerS188S0100000;
                    final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = r5;
                    final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = r4;
                    final ViewTreeObserver.OnDrawListener onDrawListener = r6;
                    v.post(new Runnable() { // from class: X.0li
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ;
                            try {
                                ViewTreeObserver viewTreeObserver = v.getViewTreeObserver();
                                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = onGlobalLayoutListener;
                                ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener2 = onWindowFocusChangeListener;
                                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener2 = onScrollChangedListener;
                                ViewTreeObserver.OnDrawListener onDrawListener2 = onDrawListener;
                                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener2);
                                viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListener2);
                                viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener2);
                                viewTreeObserver.removeOnDrawListener(onDrawListener2);
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    });
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro2;
                    if (interfaceC65784Pro4 != null) {
                        interfaceC65784Pro4.invoke();
                    }
                }
            });
        }
    }
}
