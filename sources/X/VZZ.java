package X;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public abstract class VZZ extends FrameLayout {
    public VZY LJLIL;
    public InterfaceC79946VZe LJLILLLLZI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        VZY vzy = this.LJLIL;
        if (vzy != null) {
            vzy.LJIIIIZZ();
        }
        InterfaceC79946VZe interfaceC79946VZe = this.LJLILLLLZI;
        if (interfaceC79946VZe != null) {
            interfaceC79946VZe.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VZY vzy = this.LJLIL;
        if (vzy != null) {
            vzy.LJJIIJZLJL();
        }
        InterfaceC79946VZe interfaceC79946VZe = this.LJLILLLLZI;
        if (interfaceC79946VZe != null) {
            interfaceC79946VZe.onDetachedFromWindow();
        }
    }

    public final InterfaceC79946VZe getLifecycle() {
        return this.LJLILLLLZI;
    }

    public final VZY getPlayer() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VZZ(Context context) {
        super(context, null, 0);
        o.LJIIJ(context, "context");
    }

    public final void setLifecycle(InterfaceC79946VZe interfaceC79946VZe) {
        this.LJLILLLLZI = interfaceC79946VZe;
    }

    public final void setPlayer(VZY vzy) {
        this.LJLIL = vzy;
    }
}
