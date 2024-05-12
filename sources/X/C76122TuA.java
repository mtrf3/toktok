package X;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkFixFeedLinkmicLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostFeedRemoveOptSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.TuA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76122TuA extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ FrameLayout LJLIL;
    public final /* synthetic */ C76120Tu8 LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76122TuA(FrameLayout frameLayout, C76120Tu8 c76120Tu8, int i, int i2, int i3) {
        super(0);
        this.LJLIL = frameLayout;
        this.LJLILLLLZI = c76120Tu8;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        FrameLayout frameLayout;
        ViewTreeObserver viewTreeObserver;
        FrameLayout frameLayout2;
        ViewTreeObserver viewTreeObserver2;
        C76120Tu8 c76120Tu8;
        InterfaceC75579TlP interfaceC75579TlP;
        if (!o.LJ(this.LJLIL, this.LJLILLLLZI.LJLJLJ)) {
            C76120Tu8 c76120Tu82 = this.LJLILLLLZI;
            InterfaceC75579TlP interfaceC75579TlP2 = c76120Tu82.LJLJL;
            if (interfaceC75579TlP2 != null) {
                interfaceC75579TlP2.m1(c76120Tu82);
            }
            InterfaceC75579TlP interfaceC75579TlP3 = this.LJLILLLLZI.LJLJL;
            if (interfaceC75579TlP3 != null) {
                interfaceC75579TlP3.B1(this.LJLJI);
            }
            this.LJLILLLLZI.LJZL = new OSZ<>(Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL));
            if (!LiveCoHostFeedRemoveOptSetting.INSTANCE.isEnable() && (interfaceC75579TlP = (c76120Tu8 = this.LJLILLLLZI).LJLJL) != null) {
                interfaceC75579TlP.n1(this.LJLIL, null, c76120Tu8.LJZL);
            }
            LivesdkFixFeedLinkmicLayoutSetting livesdkFixFeedLinkmicLayoutSetting = LivesdkFixFeedLinkmicLayoutSetting.INSTANCE;
            if (livesdkFixFeedLinkmicLayoutSetting.getValue() && (frameLayout2 = this.LJLILLLLZI.LJLJLJ) != null && (viewTreeObserver2 = frameLayout2.getViewTreeObserver()) != null) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.LJLILLLLZI.LLFF);
            }
            C76120Tu8 c76120Tu83 = this.LJLILLLLZI;
            c76120Tu83.LJLJLJ = this.LJLIL;
            c76120Tu83.LJLLLL = this.LJLJI;
            if (livesdkFixFeedLinkmicLayoutSetting.getValue() && (frameLayout = this.LJLILLLLZI.LJLJLJ) != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.LJLILLLLZI.LLFF);
            }
        }
        C76120Tu8 c76120Tu84 = this.LJLILLLLZI;
        int i = c76120Tu84.LJLLLL;
        int i2 = this.LJLJI;
        if (i != i2) {
            InterfaceC75579TlP interfaceC75579TlP4 = c76120Tu84.LJLJL;
            if (interfaceC75579TlP4 != null) {
                interfaceC75579TlP4.z1(i2);
            }
            this.LJLILLLLZI.LJLLLL = this.LJLJI;
        }
        return C76800UCe.LIZ;
    }
}
