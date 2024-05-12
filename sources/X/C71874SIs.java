package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ECommerceLiveServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.SIs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71874SIs extends FrameLayout {
    public InterfaceC86353Xun LJLIL;
    public InterfaceC71877SIv LJLILLLLZI;
    public InterfaceC32188CkC LJLJI;
    public boolean LJLJJI;
    public volatile Long LJLJJL;
    public volatile Long LJLJJLL;

    public B4L getTextureView() {
        C28185B4j l;
        InterfaceC86353Xun interfaceC86353Xun = this.LJLIL;
        if (interfaceC86353Xun == null || (l = interfaceC86353Xun.l()) == null) {
            return null;
        }
        return l.LIZIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        EventBus.LIZJ().LJIILJJIL(this);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.LIZJ().LJIJ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71874SIs(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ar0, this, true);
    }

    public final void LIZ(C71875SIt c71875SIt) {
        InterfaceC86353Xun interfaceC86353Xun = this.LJLIL;
        if (interfaceC86353Xun == null) {
            return;
        }
        if (!this.LJLJJI) {
            interfaceC86353Xun.LLZZLLIL();
        }
        ECommerceLiveServiceImpl.LJFF().LIZ().LIZLLL(c71875SIt);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void liveCardJump(C2UP jumpEvent) {
        o.LJIIIZ(jumpEvent, "jumpEvent");
        this.LJLJJLL = jumpEvent.LJLIL;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.LJLJJLL = null;
        }
    }

    public void setMute(boolean z) {
        InterfaceC86353Xun interfaceC86353Xun = this.LJLIL;
        if (interfaceC86353Xun == null) {
            return;
        }
        interfaceC86353Xun.setMute(z);
    }

    public final void LIZIZ(String str, VCA vca) {
        InterfaceC86353Xun interfaceC86353Xun;
        if (str == null || ujb.o.LJJJJJL(str) || (interfaceC86353Xun = this.LJLIL) == null) {
            return;
        }
        interfaceC86353Xun.switchResolution(str, vca);
    }
}
