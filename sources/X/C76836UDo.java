package X;

import Y.AfS65S0100000_13;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;
import java.util.concurrent.TimeUnit;

/* renamed from: X.UDo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76836UDo extends FrameLayout {
    public int LJLIL;
    public InterfaceC92693kP LJLILLLLZI;

    public final int getCombo() {
        return this.LJLIL;
    }

    public final InterfaceC92693kP getDisposable() {
        return this.LJLILLLLZI;
    }

    public final void LIZ(int i) {
        this.LJLIL = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 1315) {
                    return;
                }
                LIZIZ(1000L);
                return;
            }
            LIZIZ(2000L);
            return;
        }
        InterfaceC92693kP interfaceC92693kP = this.LJLILLLLZI;
        if (interfaceC92693kP == null) {
            return;
        }
        interfaceC92693kP.dispose();
    }

    public final void LIZIZ(long j) {
        InterfaceC92693kP interfaceC92693kP = this.LJLILLLLZI;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LJLILLLLZI = TMC.LJIL(0L, j, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new AfS65S0100000_13(this, 83), C76838UDq.LJLIL, C76839UDr.LIZ);
    }

    public final void setCombo(int i) {
        this.LJLIL = i;
    }

    public final void setDisposable(InterfaceC92693kP interfaceC92693kP) {
        this.LJLILLLLZI = interfaceC92693kP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76836UDo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
