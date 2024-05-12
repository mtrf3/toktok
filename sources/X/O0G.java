package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O0G extends O0H {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        View view;
        Context context;
        O0I o0i = (O0I) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            view = interfaceC38263Ezz.getView();
        } else {
            view = null;
        }
        InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
        if (interfaceC38263Ezz2 != null) {
            context = interfaceC38263Ezz2.getContext();
        } else {
            context = null;
        }
        if (view == null || context == null) {
            C31626Cb8.LIZ(c37356ElM, -1, "view is null, or context is null.", 4);
            return;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        ViewParent parent = view.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i < childCount) {
                ViewParent parent2 = view.getParent();
                o.LJII(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                boolean z = ((ViewGroup) parent2).getChildAt(i) instanceof WebKitView;
                i++;
                if (z) {
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        O0F o0f = new O0F(context);
        o0f.setOnClickListener(new ViewOnClickListenerC13880ga(O0L.LJLIL));
        o0f.setLayoutParams(new FrameLayout.LayoutParams(width, height));
        if (i >= 0 && i < viewGroup.getChildCount()) {
            viewGroup.addView(o0f, i);
        } else {
            viewGroup.addView(o0f);
        }
        if (o.LJ(o0i.getShowLoading(), Boolean.TRUE)) {
            Context context2 = o0f.getContext();
            o.LJIIIIZZ(context2, "context");
            C73305Spp c73305Spp = new C73305Spp(context2, null, 6);
            c73305Spp.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            o0f.addView(c73305Spp);
            c73305Spp.LJFF();
        }
        new VGK(width, height).LIZ(view, new AqS141S0200000_10(o0f, c37356ElM, 70), 0, 0);
    }
}
