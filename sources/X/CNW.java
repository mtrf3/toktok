package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.container.config.base.CardConfig;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CNW extends FrameLayout implements COW {
    public final String LJLIL;
    public final HybridConfig LJLILLLLZI;
    public CVT LJLJI;
    public InterfaceC25290yz LJLJJI;
    public CNX LJLJJL;

    @Override // X.COW
    public final void LJIL() {
        InterfaceC25290yz interfaceC25290yz = this.LJLJJI;
        if (interfaceC25290yz != null) {
            interfaceC25290yz.LIZLLL(this.LJLILLLLZI.getEngineType().getType());
        }
        CVT cvt = this.LJLJI;
        if (cvt != null) {
            cvt.setVisibility(8);
            if (this.LJLILLLLZI.getEngineType() == CNK.LYNX && this.LJLILLLLZI.getFallbackUrl().length() > 0) {
                this.LJLILLLLZI.setEngineType(CNK.WEB_VIEW);
                View re = this.LJLJJL.re();
                if (re != null) {
                    if (C78996UzQ.LJJIIJZLJL(re)) {
                        C78996UzQ.LJI();
                    }
                    removeView(re);
                }
                this.LJLJJL.release();
                ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(getContext());
                o.LJI(LIZIZ);
                C31240CNw c31240CNw = new C31240CNw(LIZIZ, this.LJLILLLLZI, this.LJLIL, this);
                this.LJLJJL = c31240CNw;
                c31240CNw.LJ();
                O5Z o5z = c31240CNw.LJLJL;
                if (o5z != null) {
                    addView(o5z, 0);
                    c31240CNw.loadUrl(this.LJLILLLLZI.getFallbackUrl());
                }
                InterfaceC25290yz interfaceC25290yz2 = this.LJLJJI;
                if (interfaceC25290yz2 != null) {
                    interfaceC25290yz2.LIZJ();
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("loadingView");
        throw null;
    }

    @Override // X.COW
    public final void LJLLI() {
        InterfaceC25290yz interfaceC25290yz = this.LJLJJI;
        if (interfaceC25290yz != null) {
            interfaceC25290yz.LIZ(this.LJLILLLLZI.getEngineType().getType());
        }
        CVT cvt = this.LJLJI;
        if (cvt != null) {
            cvt.setVisibility(8);
        } else {
            o.LJIJI("loadingView");
            throw null;
        }
    }

    public final CNX getComponent() {
        return this.LJLJJL;
    }

    @Override // X.COW
    public final void LLLLLLL(String str) {
        InterfaceC25290yz interfaceC25290yz = this.LJLJJI;
        if (interfaceC25290yz != null) {
            interfaceC25290yz.LLLLLLL(this.LJLILLLLZI.getEngineType().getType());
        }
    }

    public final void setComponent(CNX cnx) {
        o.LJIIIZ(cnx, "<set-?>");
        this.LJLJJL = cnx;
    }

    public void setHybridLoadListener(InterfaceC25290yz hybridLoadListener) {
        o.LJIIIZ(hybridLoadListener, "hybridLoadListener");
        this.LJLJJI = hybridLoadListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CNW(Context context, String containerId, CardConfig config) {
        super(context, null, 0);
        CNX c31240CNw;
        o.LJIIIZ(containerId, "containerId");
        o.LJIIIZ(config, "config");
        new LinkedHashMap();
        this.LJLIL = containerId;
        this.LJLILLLLZI = config;
        if (config.getEngineType() == CNK.LYNX) {
            ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
            o.LJI(LIZIZ);
            c31240CNw = new C31955CgR(LIZIZ, config, containerId, this);
        } else {
            ActivityC45651qj LIZIZ2 = C29306Beo.LIZIZ(context);
            o.LJI(LIZIZ2);
            c31240CNw = new C31240CNw(LIZIZ2, config, containerId, this);
        }
        this.LJLJJL = c31240CNw;
    }
}
