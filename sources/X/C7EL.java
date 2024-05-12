package X;

import Y.ARunnableS39S0100000_3;
import Y.IDHandlerS16S0100000_3;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.PopupWindow;
import kotlin.jvm.internal.o;

/* renamed from: X.7EL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7EL extends PopupWindow implements ViewTreeObserver.OnGlobalLayoutListener, C72T {
    public final Context LJLIL;
    public final View LJLILLLLZI;
    public final int LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public final Rect LJLJL;
    public final IDHandlerS16S0100000_3 LJLJLJ;
    public InterfaceC178146yw LJLJLLL;

    @Override // X.C72T
    public final void release() {
        Activity activity;
        this.LJLJJLL = 0;
        this.LJLJJL = false;
        this.LJLJLJ.removeMessages(1);
        getContentView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        Context context = this.LJLIL;
        if ((context instanceof Activity) && (activity = (Activity) context) != null && !activity.isFinishing()) {
            dismiss();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z;
        InterfaceC178146yw interfaceC178146yw;
        int LJIIIZ;
        Window window;
        View decorView;
        View findViewById;
        View findViewById2;
        if (this.LJLJJI == 0) {
            Activity LJIJJ = C45804HyK.LJIJJ(this.LJLIL);
            if (LJIJJ != null && (findViewById2 = LJIJJ.findViewById(R.id.content)) != null) {
                LJIIIZ = findViewById2.getHeight();
            } else {
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ != null && (window = LJIIIIZZ.getWindow()) != null && (decorView = window.getDecorView()) != null && (findViewById = decorView.findViewById(R.id.content)) != null) {
                    LJIIIZ = findViewById.getHeight();
                } else {
                    LJIIIZ = KL2.LJIIIZ(C45804HyK.LJIJJ(this.LJLIL));
                }
            }
            this.LJLJJI = LJIIIZ;
        }
        int height = this.LJLILLLLZI.getHeight();
        this.LJLJJI = height;
        getContentView().getWindowVisibleDisplayFrame(this.LJLJL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KeyboardPopupWindow: rb=");
        LIZ.append(this.LJLJL.bottom);
        LIZ.append(", sh=");
        LIZ.append(this.LJLJJI);
        LIZ.append("  commentPageH=");
        LIZ.append(height);
        C71Y.LIZLLL("KeyboardFakePopupWindow", X1D.LIZIZ(LIZ));
        int i = this.LJLJL.bottom;
        if (i > this.LJLJJI) {
            this.LJLJJI = i;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("KeyboardPopupWindow: sh=rb=");
            LIZ2.append(this.LJLJJI);
            C71Y.LIZLLL("KeyboardFakePopupWindow", X1D.LIZIZ(LIZ2));
        }
        int i2 = this.LJLJJI;
        if (i2 != C7EP.LJFF) {
            C7EP.LJFF = i2;
            C7EP.LIZIZ().storeInt("keyboard_container_height", i2);
        }
        int i3 = this.LJLJJI;
        int i4 = i3 - this.LJLJL.bottom;
        if (i4 > i3 * 0.62d) {
            StringBuilder LJ = C7MY.LJ("KeyboardPopupWindow: return kh=", i4, ", sh=");
            LJ.append(this.LJLJJI);
            C71Y.LIZLLL("KeyboardFakePopupWindow", X1D.LIZIZ(LJ));
            return;
        }
        if (((Number) C7EN.LIZ.getValue()).intValue() != 1 ? i4 > this.LJLJJI / this.LJLJI : i4 > 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("KeyboardPopupWindow: vi=");
        LIZ3.append(z);
        LIZ3.append(", kh=");
        LIZ3.append(i4);
        C71Y.LIZLLL("KeyboardFakePopupWindow", X1D.LIZIZ(LIZ3));
        if (!o.LJ(C84763XOl.LJIIIIZZ(), this.LJLIL)) {
            if (!this.LJLJJL || z) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("KeyboardPopupWindow: return ");
                LIZ4.append(this.LJLJJL);
                LIZ4.append(", ");
                LIZ4.append(z);
                C71Y.LIZLLL("KeyboardFakePopupWindow", X1D.LIZIZ(LIZ4));
                return;
            }
        } else if (z) {
            this.LJLJJL = true;
            int i5 = this.LJLJJLL;
            if (i4 != i5 && i4 > i5) {
                Message obtainMessage = this.LJLJLJ.obtainMessage(1);
                o.LJIIIIZZ(obtainMessage, "handler.obtainMessage(MSG_OPEN)");
                obtainMessage.arg1 = i4;
                this.LJLJLJ.removeMessages(1);
                this.LJLJLJ.sendMessageDelayed(obtainMessage, 0L);
            }
            if (this.LJLJJLL != i4 && i4 > 0 && (interfaceC178146yw = this.LJLJLLL) != null) {
                interfaceC178146yw.Yc(i4);
            }
            this.LJLJJLL = i4;
            return;
        }
        if (!this.LJLJJL) {
            return;
        }
        this.LJLJJL = false;
        this.LJLJJLL = 0;
        InterfaceC178146yw interfaceC178146yw2 = this.LJLJLLL;
        if (interfaceC178146yw2 == null) {
            return;
        }
        interfaceC178146yw2.LLIIJLIL();
    }

    @Override // X.C72T
    public final void show() {
        getContentView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.LJLILLLLZI.post(new ARunnableS39S0100000_3(this, 12));
    }

    public C7EL(Context context, View anchorView) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(anchorView, "anchorView");
        this.LJLIL = context;
        this.LJLILLLLZI = anchorView;
        this.LJLJI = 6;
        this.LJLJL = new Rect();
        this.LJLJLJ = new IDHandlerS16S0100000_3(this, C16880lQ.LLJJJJ(), 0);
        setContentView(new View(context));
        setWidth(0);
        setHeight(-1);
        setBackgroundDrawable(new ColorDrawable(0));
        setSoftInputMode(16);
        setInputMethodMode(1);
        if (Build.VERSION.SDK_INT >= 23) {
            setWindowLayoutType(1003);
        }
    }
}
