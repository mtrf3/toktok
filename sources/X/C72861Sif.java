package X;

import Y.ACListenerS46S0200000_12;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Sif, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72861Sif implements InterfaceC72860Sie {
    public Effect LJLIL;
    public ACListenerS46S0200000_12 LJLILLLLZI;

    @Override // X.InterfaceC72860Sie
    public final void LIZ() {
        this.LJLIL = null;
    }

    @Override // X.InterfaceC72860Sie
    public final EnumC72858Sic priority() {
        return EnumC72858Sic.BlockStickerInfoHandlerPriority;
    }

    @Override // X.InterfaceC72860Sie
    public final void LIZJ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        LinearLayout linearLayout = (LinearLayout) stickerView.findViewById(R.id.fme);
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, this.LJLILLLLZI);
        }
    }

    @Override // X.InterfaceC72860Sie
    public final boolean LIZIZ(T4Q session, InterfaceC72857Sib interfaceC72857Sib) {
        o.LJIIIZ(session, "session");
        this.LJLIL = session.LIZ;
        return false;
    }
}
