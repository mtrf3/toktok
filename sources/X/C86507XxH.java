package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.ui.InnerPushPopupWindow;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS104S0300000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XxH, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86507XxH implements InterfaceC112564bM {
    public static final /* synthetic */ int LIZIZ = 0;
    public WeakReference<InnerPushPopupWindow> LIZ;

    public final boolean LIZJ() {
        InnerPushPopupWindow innerPushPopupWindow;
        InnerPushMessage innerPushMessage;
        WeakReference<InnerPushPopupWindow> weakReference = this.LIZ;
        if (weakReference == null || (innerPushPopupWindow = weakReference.get()) == null || !innerPushPopupWindow.isShowing() || (innerPushMessage = innerPushPopupWindow.LJLILLLLZI) == null || innerPushMessage.getType() != 21) {
            return false;
        }
        return true;
    }

    public final boolean LIZLLL(boolean z) {
        InnerPushPopupWindow innerPushPopupWindow;
        WeakReference<InnerPushPopupWindow> weakReference = this.LIZ;
        if (weakReference == null || (innerPushPopupWindow = weakReference.get()) == null || !innerPushPopupWindow.isShowing()) {
            if (z) {
                return false;
            }
            if (!C86512XxM.LIZIZ && !C86512XxM.LIZ) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC112564bM
    public final void LIZ(InnerPushMessage innerPushMessage, int[] iArr) {
        C57419MgB.LJI(new AqS104S0300000_15(this, innerPushMessage, iArr, 5));
    }

    @Override // X.InterfaceC112564bM
    public final void LIZIZ(String reason, boolean z) {
        o.LJIIIZ(reason, "reason");
        C57419MgB.LJI(new C86522XxW(z, this, reason));
    }
}
