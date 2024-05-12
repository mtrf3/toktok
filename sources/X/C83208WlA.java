package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.IDaS92S0000000_14;
import o3.h0;

/* renamed from: X.WlA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83208WlA extends FrameLayout implements InterfaceC83283WmN {
    public View LJLIL;
    public final View LJLILLLLZI;
    public final TDX LJLJI;
    public C83209WlB LJLJJI;
    public View.OnClickListener LJLJJL;
    public ViewGroup LJLJJLL;
    public final ViewGroup LJLJL;
    public C83232WlY LJLJLJ;
    public InterfaceC65784Pro<? extends View> LJLJLLL;

    public final void LIZ() {
        TDX tdx = this.LJLJI;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        this.LJLJLJ.LJFF.getClass();
        tdx.LIZ(C74275TDb.LIZIZ(context, 12.0f));
        TDX tdx2 = this.LJLJI;
        this.LJLJLJ.LJFF.getClass();
        tdx2.getClass();
    }

    public ViewGroup getContainer() {
        return this.LJLJJLL;
    }

    @Override // android.view.View, android.view.ViewParent
    public final ViewGroup getParent() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC83283WmN
    public View getRoot() {
        return this.LJLIL;
    }

    public final InterfaceC65784Pro<View> getRootProvider() {
        return this.LJLJLLL;
    }

    public final C83232WlY getViewConfig() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC83283WmN
    public void setContainer(ViewGroup value) {
        o.LJIIIZ(value, "value");
        this.LJLJJLL = value;
        this.LJLJJI = new C83209WlB(value, this, getRoot());
    }

    @Override // X.InterfaceC83283WmN
    public void setDismissViewClickListener(View.OnClickListener listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJL = listener;
        if (this.LJLJLJ.LIZIZ) {
            C16880lQ.LJIIJ(listener, this.LJLILLLLZI);
            return;
        }
        View outsideTouch = this.LJLILLLLZI;
        o.LJIIIIZZ(outsideTouch, "outsideTouch");
        outsideTouch.setClickable(false);
    }

    public void setRoot(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJLIL = view;
    }

    public final void setRootProvider(InterfaceC65784Pro<? extends View> interfaceC65784Pro) {
        this.LJLJLLL = interfaceC65784Pro;
    }

    public final void setViewConfig(C83232WlY c83232WlY) {
        o.LJIIIZ(c83232WlY, "<set-?>");
        this.LJLJLJ = c83232WlY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83208WlA(Context context, ViewGroup parent, C83232WlY viewConfig) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewConfig, "viewConfig");
        this.LJLJL = parent;
        this.LJLJLJ = viewConfig;
        this.LJLJLLL = null;
        int i = viewConfig.LJFF.LIZ;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), i == 0 ? R.layout.kd : i, this, true);
        o.LJIIIIZZ(LLLLIILL, "viewConfig.let {\n       …this, true)\n            }");
        this.LJLIL = LLLLIILL;
        View findViewById = getRoot().findViewById(R.id.n20);
        findViewById.setImportantForAccessibility(1);
        h0.LJIJI(findViewById, new IDaS92S0000000_14(1));
        this.LJLILLLLZI = findViewById;
        this.LJLJI = (TDX) getRoot().findViewById(R.id.dd3);
        this.LJLJJLL = parent;
    }
}
