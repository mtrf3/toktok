package X;

import Y.ARunnableS46S0100000_10;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OhS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62594OhS extends PopupWindow implements InterfaceC44975Hkx, InterfaceC81305VvZ, LLE {
    public final Activity LJLIL;
    public final C62387Oe7 LJLILLLLZI;
    public final View LJLJI;
    public LinearLayout LJLJJI;
    public final int LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public C62624Ohw LJLJLJ;
    public long LJLJLLL;
    public final DialogC25756A8y LJLL;
    public final ARunnableS46S0100000_10 LJLLI;

    @Override // X.InterfaceC81305VvZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC81305VvZ
    public final void LIZIZ() {
        this.LJLJJLL = false;
        onDismiss();
        C116694i1.LIZ(C45804HyK.LJJIFFI(this.LJLIL)).qv0(this);
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle args, String enterMethod) {
        o.LJIIIZ(args, "args");
        o.LJIIIZ(enterMethod, "enterMethod");
    }

    public final void LIZJ() {
        View decorView = this.LJLIL.getWindow().getDecorView();
        int i = -C63081OpJ.LJJJJLI(this.LJLIL);
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(this));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i2 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                showAtLocation(decorView, 48, 0, i);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i2;
                return;
            } catch (Throwable unused) {
                showAtLocation(decorView, 48, 0, i);
                return;
            }
        }
        showAtLocation(decorView, 48, 0, i);
    }

    @Override // X.InterfaceC44975Hkx
    public final void show() {
        C62624Ohw c62624Ohw = this.LJLJLJ;
        if (c62624Ohw != null) {
            c62624Ohw.LIZIZ();
        }
        if (!isShowing()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.LJLJJL;
            this.LJLJLLL = currentTimeMillis + j;
            C62624Ohw c62624Ohw2 = this.LJLJLJ;
            if (c62624Ohw2 != null) {
                c62624Ohw2.postDelayed(this.LJLLI, j);
            }
            if (getContentView().getParent() != null) {
                ViewParent parent = getContentView().getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                C16880lQ.LJLLL(getContentView(), (ViewGroup) parent);
            }
            try {
                LIZJ();
            } catch (WindowManager.BadTokenException unused) {
            }
        }
    }

    @Override // X.InterfaceC44975Hkx
    public final void onDismiss() {
        if (isShowing() && !this.LJLJJLL) {
            try {
                C62624Ohw c62624Ohw = this.LJLJLJ;
                if (c62624Ohw != null) {
                    c62624Ohw.LIZ(0.0f, true);
                }
                dismiss();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.widget.PopupWindow, X.InterfaceC44975Hkx
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        o.LJIIIZ(onDismissListener, "onDismissListener");
        super.setOnDismissListener(onDismissListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62594OhS(Aweme aweme, Activity context, C62387Oe7 c62387Oe7) {
        super(context);
        ViewStub viewStub;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = c62387Oe7;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.azf, C16880lQ.LLZIL(context), null);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…de_share_popwindow, null)");
        this.LJLJI = LLLZIIL;
        this.LJLJJL = 5000;
        DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(context);
        this.LJLL = dialogC25756A8y;
        this.LJLLI = new ARunnableS46S0100000_10(this, 59);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(LLLZIIL);
        setWidth(KL2.LJIIJJI(context));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.a_l);
        if (c62387Oe7.LJFF) {
            ORS.LJJLIL(new AqS176S0100000_10(this, 73), c62387Oe7.LIZ);
        }
        this.LJLJJI = (LinearLayout) LLLZIIL.findViewById(R.id.j5n);
        C62624Ohw c62624Ohw = (C62624Ohw) LLLZIIL.findViewById(R.id.ig1);
        this.LJLJLJ = c62624Ohw;
        if (c62624Ohw != null) {
            c62624Ohw.LJLJI = this.LJLJJI;
            c62624Ohw.setPullUpListener(this);
        }
        if (C53316KwC.LIZ()) {
            viewStub = (ViewStub) LLLZIIL.findViewById(R.id.juj);
        } else {
            viewStub = (ViewStub) LLLZIIL.findViewById(R.id.juk);
        }
        View findViewById = viewStub.inflate().findViewById(R.id.jui);
        o.LJIIIIZZ(findViewById, "stub.inflate().findViewB…id.share_panel_share_bar)");
        C114014dh c114014dh = (C114014dh) findViewById;
        List<InterfaceC62225ObV> channels = c62387Oe7.LIZ;
        o.LJIIIZ(channels, "channels");
        c114014dh.LJLIL = channels;
        c114014dh.LJLJI.setData(channels);
        c114014dh.LJLILLLLZI = new C62539OgZ(this);
        dialogC25756A8y.LIZIZ(R.string.rjz);
        C62624Ohw c62624Ohw2 = this.LJLJLJ;
        if (c62624Ohw2 != null) {
            c62624Ohw2.setInternalTouchEventListener(new C62599OhX(this));
        }
        C116694i1.LIZ(C45804HyK.LJJIFFI(context)).hv0(this);
    }
}
