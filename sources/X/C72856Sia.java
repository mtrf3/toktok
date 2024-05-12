package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Sia, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72856Sia implements InterfaceC72860Sie {
    public final ShortVideoContext LJLIL;
    public final InterfaceC72852SiW LJLILLLLZI;
    public final List<InterfaceC72860Sie> LJLJI;
    public C72851SiV LJLJJI;
    public C72854SiY LJLJJL;

    @Override // X.InterfaceC72860Sie
    public final void LIZ() {
        C72854SiY c72854SiY = this.LJLJJL;
        if (c72854SiY != null) {
            c72854SiY.LIZIZ(0, null);
        }
        C72851SiV c72851SiV = this.LJLJJI;
        if (c72851SiV != null) {
            c72851SiV.LIZ(null);
        }
    }

    @Override // X.InterfaceC72860Sie
    public final EnumC72858Sic priority() {
        return EnumC72858Sic.CommerceStickerInfoHandlerPriority;
    }

    @Override // X.InterfaceC72860Sie
    public final void LIZJ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        View findViewById = stickerView.findViewById(R.id.boc);
        o.LJIIIIZZ(findViewById, "stickerView.findViewById…ommerce_sticker_brand_ll)");
        InterfaceC72852SiW interfaceC72852SiW = this.LJLILLLLZI;
        List<InterfaceC72860Sie> list = this.LJLJI;
        Context context = stickerView.getContext();
        o.LJIIIIZZ(context, "stickerView.context");
        this.LJLJJL = new C72854SiY((LinearLayout) findViewById, interfaceC72852SiW, list, context);
        ShortVideoContext shortVideoContext = this.LJLIL;
        View findViewById2 = stickerView.findViewById(R.id.boe);
        o.LJIIIIZZ(findViewById2, "stickerView.findViewById…d.commerce_sticker_goods)");
        this.LJLJJI = new C72851SiV(shortVideoContext, (LinearLayout) findViewById2, this.LJLILLLLZI);
    }

    @Override // X.InterfaceC72860Sie
    public final boolean LIZIZ(T4Q session, InterfaceC72857Sib interfaceC72857Sib) {
        o.LJIIIZ(session, "session");
        Effect effect = session.LIZ;
        int i = session.LIZIZ;
        C72851SiV c72851SiV = this.LJLJJI;
        if (c72851SiV != null && c72851SiV.LIZ(effect)) {
            return true;
        }
        C72854SiY c72854SiY = this.LJLJJL;
        if (c72854SiY == null) {
            return false;
        }
        return c72854SiY.LIZIZ(i, effect);
    }

    public C72856Sia(ShortVideoContext shortVideoContext, C43284Gym c43284Gym, List list) {
        this.LJLIL = shortVideoContext;
        this.LJLILLLLZI = c43284Gym;
        this.LJLJI = list;
    }
}
