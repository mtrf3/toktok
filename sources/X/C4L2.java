package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import djb.IDaS20S0000000_1;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.4L2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4L2 implements InterfaceC83893Qz, View.OnTouchListener {
    public static C4S6 LJLILLLLZI;
    public static SharePanelViewModel LJLJI;
    public static SharePackage LJLJJI;
    public static InterfaceC65784Pro<? extends InterfaceC62225ObV> LJLJJL;
    public static InterfaceC65784Pro<? extends InterfaceC62225ObV> LJLJJLL;
    public static XKQ LJLJLJ;
    public static final C4L2 LJLIL = new C4L2();
    public static final C64962gm LJLJL = C48841JEv.LIZ(C78613UtF.LIZ.plus(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 21)));
    public static final C5H3 LJLJLLL = C221108m2.LIZ(EnumC221088m0.NONE, C4L4.LJLIL);

    @Override // X.InterfaceC83893Qz
    public final boolean HY(IMContact contact, boolean z) {
        o.LJIIIZ(contact, "contact");
        return false;
    }

    @Override // X.InterfaceC83893Qz
    public final void Ql(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC83893Qz
    public final void nG(IMContact iMContact) {
    }

    @Override // X.InterfaceC83893Qz
    public final void sz(long j, boolean z, int i, boolean z2, int i2) {
    }

    public static final void LIZ() {
        Context context;
        LifecycleOwner LIZIZ;
        SharePanelViewModel sharePanelViewModel;
        C4S6 c4s6 = LJLILLLLZI;
        if (c4s6 != null && (context = c4s6.getContext()) != null && (LIZIZ = C57434MgQ.LIZIZ(context)) != null && (sharePanelViewModel = LJLJI) != null) {
            sharePanelViewModel.onDestroy(LIZIZ);
        }
        LJLILLLLZI = null;
        LJLJI = null;
        LJLJJI = null;
        LJLJJL = null;
        LJLJJLL = null;
        XKQ xkq = LJLJLJ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC83893Qz
    public final void ks(List<? extends IMContact> list) {
        o.LJIIIZ(list, "list");
        C4S6 c4s6 = LJLILLLLZI;
        if (c4s6 != null) {
            LJLJLJ = XKX.LIZLLL(LJLJL, null, null, new C4L3(c4s6, list, null), 3);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        C4S6 c4s6 = LJLILLLLZI;
        if (c4s6 == null || !c4s6.isShowing()) {
            return false;
        }
        v.getParent().requestDisallowInterceptTouchEvent(true);
        int actionMasked = event.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return false;
                }
            } else {
                c4s6.LJIJJ(c4s6.LJLLI, event.getX(), event.getY());
                return true;
            }
        }
        c4s6.LJIJJLI();
        return true;
    }

    @Override // X.InterfaceC83893Qz
    public final void xN(Throwable e, List list) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(e, "e");
        C4S6 c4s6 = LJLILLLLZI;
        if (c4s6 != null) {
            c4s6.dismiss();
        }
    }
}
