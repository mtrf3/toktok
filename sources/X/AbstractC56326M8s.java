package X;

import com.bytedance.poplayer.BasePopupTask;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS140S0200000_9;

/* renamed from: X.M8s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC56326M8s<Popup> extends BasePopupTask<Popup> implements InterfaceC56316M8i {
    public final AtomicBoolean LJLIL;
    public final AtomicBoolean LJLILLLLZI;
    public final XK4 LJLJI;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJJI;

    @Override // X.InterfaceC56316M8i
    public final void LIZ() {
    }

    public AbstractC56326M8s() {
        super(C56319M8l.LJLIL);
        this.LJLIL = new AtomicBoolean(false);
        this.LJLILLLLZI = new AtomicBoolean(false);
        this.LJLJI = C78934UyQ.LIZJ(0, null, 7);
    }

    @Override // X.InterfaceC56316M8i
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZIZ() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC56316M8i
    public final XK4 LJ() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC56316M8i
    public final AtomicBoolean LJFF() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC56316M8i
    public final AtomicBoolean LJII() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC56316M8i
    public final void LIZJ(AqS140S0200000_9 aqS140S0200000_9) {
        this.LJLJJI = aqS140S0200000_9;
    }
}
