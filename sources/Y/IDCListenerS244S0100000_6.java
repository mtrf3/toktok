package Y;

import X.C37166EiI;
import X.C59612NaS;
import X.C59613NaT;
import X.C59866NeY;
import X.F1B;
import X.InterfaceC59585Na1;
import android.view.View;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class IDCListenerS244S0100000_6 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(view, "p0");
                return;
            case 1:
                onViewAttachedToWindow$1(this, view);
                return;
            case 2:
                onViewAttachedToWindow$2(this, view);
                return;
            case 3:
                onViewAttachedToWindow$3(this, view);
                return;
            case 4:
                onViewAttachedToWindow$4(this, view);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                return;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                return;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                return;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                return;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                return;
            default:
                return;
        }
    }

    public IDCListenerS244S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$1(IDCListenerS244S0100000_6 iDCListenerS244S0100000_6, View v) {
        F1B LJJIJIIJI;
        o.LJIIIZ(v, "v");
        C59866NeY c59866NeY = ((C59612NaS) iDCListenerS244S0100000_6.l0).LJLZ;
        if (c59866NeY != null && (LJJIJIIJI = c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            LJJIJIIJI.onViewAttachedToWindow();
        }
    }

    public static final void onViewAttachedToWindow$2(IDCListenerS244S0100000_6 iDCListenerS244S0100000_6, View v) {
        F1B LJJIJIIJI;
        o.LJIIIZ(v, "v");
        C59866NeY c59866NeY = ((C59612NaS) iDCListenerS244S0100000_6.l0).LJLZ;
        if (c59866NeY != null && (LJJIJIIJI = c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            LJJIJIIJI.onViewAttachedToWindow();
        }
    }

    public static final void onViewAttachedToWindow$3(IDCListenerS244S0100000_6 iDCListenerS244S0100000_6, View v) {
        F1B LJJIJIIJI;
        o.LJIIIZ(v, "v");
        C59866NeY c59866NeY = ((C59613NaT) iDCListenerS244S0100000_6.l0).monitorSession;
        if (c59866NeY != null && (LJJIJIIJI = c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            LJJIJIIJI.onViewAttachedToWindow();
        }
    }

    public static final void onViewAttachedToWindow$4(IDCListenerS244S0100000_6 iDCListenerS244S0100000_6, View v) {
        F1B LJJIJIIJI;
        o.LJIIIZ(v, "v");
        C59866NeY c59866NeY = ((C59613NaT) iDCListenerS244S0100000_6.l0).monitorSession;
        if (c59866NeY != null && (LJJIJIIJI = c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            LJJIJIIJI.onViewAttachedToWindow();
        }
    }

    public static final void onViewDetachedFromWindow$0(IDCListenerS244S0100000_6 iDCListenerS244S0100000_6, View p0) {
        o.LJIIIZ(p0, "p0");
        WebView webView = (WebView) iDCListenerS244S0100000_6.l0;
        if (webView != null) {
            webView.removeOnAttachStateChangeListener(iDCListenerS244S0100000_6);
        }
        C37166EiI.LIZ();
    }

    public static final void onViewDetachedFromWindow$1(IDCListenerS244S0100000_6 iDCListenerS244S0100000_6, View v) {
        F1B LJJIJIIJI;
        o.LJIIIZ(v, "v");
        C59866NeY c59866NeY = ((C59612NaS) iDCListenerS244S0100000_6.l0).LJLZ;
        if (c59866NeY != null && (LJJIJIIJI = c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            LJJIJIIJI.onViewDetachedFromWindow(null);
        }
        v.removeOnAttachStateChangeListener(iDCListenerS244S0100000_6);
    }

    public static final void onViewDetachedFromWindow$2(IDCListenerS244S0100000_6 iDCListenerS244S0100000_6, View v) {
        F1B LJJIJIIJI;
        o.LJIIIZ(v, "v");
        C59866NeY c59866NeY = ((C59612NaS) iDCListenerS244S0100000_6.l0).LJLZ;
        if (c59866NeY != null && (LJJIJIIJI = c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            LJJIJIIJI.onViewDetachedFromWindow(null);
        }
        v.removeOnAttachStateChangeListener(iDCListenerS244S0100000_6);
    }

    public static final void onViewDetachedFromWindow$3(IDCListenerS244S0100000_6 iDCListenerS244S0100000_6, View v) {
        F1B LJJIJIIJI;
        o.LJIIIZ(v, "v");
        C59866NeY c59866NeY = ((C59613NaT) iDCListenerS244S0100000_6.l0).monitorSession;
        if (c59866NeY != null && (LJJIJIIJI = c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            LJJIJIIJI.onViewDetachedFromWindow(null);
        }
        v.removeOnAttachStateChangeListener(iDCListenerS244S0100000_6);
    }

    public static final void onViewDetachedFromWindow$4(IDCListenerS244S0100000_6 iDCListenerS244S0100000_6, View v) {
        F1B LJJIJIIJI;
        o.LJIIIZ(v, "v");
        C59866NeY c59866NeY = ((C59613NaT) iDCListenerS244S0100000_6.l0).monitorSession;
        if (c59866NeY != null && (LJJIJIIJI = c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            LJJIJIIJI.onViewDetachedFromWindow(null);
        }
        v.removeOnAttachStateChangeListener(iDCListenerS244S0100000_6);
    }
}
