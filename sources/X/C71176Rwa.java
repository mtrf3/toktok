package X;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.settings.AnchorPinCardConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Rwa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71176Rwa extends AbstractC71187Rwl {
    public final C71185Rwj LLIIL;
    public final C71125Rvl LLIILII;

    @Override // X.AbstractC71187Rwl
    public final boolean LJIJJ() {
        return true;
    }

    @Override // X.AbstractC71187Rwl
    public final boolean LJIJJLI() {
        return false;
    }

    @Override // X.AbstractC71187Rwl
    public final void LJIIJJI() {
        IFrameSlot.SlotViewModel slotViewModel = this.LJLJLJ;
        if (slotViewModel != null) {
            C78897Uxp.LJJJJZI(slotViewModel, false);
        }
        C2U8.LIZ(new C233899Fx(1));
    }

    @Override // X.AbstractC71187Rwl
    public final /* bridge */ /* synthetic */ AbstractC71170RwU LJIIZILJ() {
        return this.LLIILII;
    }

    @Override // X.AbstractC71187Rwl
    public final AbstractC71186Rwk LJIJI() {
        return this.LLIIL;
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC31730Cco.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71176Rwa(Context context) {
        super(context, false);
        o.LJIIIZ(context, "context");
        C71185Rwj c71185Rwj = new C71185Rwj(this, this.LJLJL);
        this.LLIIL = c71185Rwj;
        C71125Rvl c71125Rvl = new C71125Rvl(context, c71185Rwj.LJ, this.LJLJL);
        c71125Rvl.LJLJJI = this;
        this.LLIILII = c71125Rvl;
    }

    @Override // X.AbstractC71187Rwl, X.AbstractC32179Ck3
    public final boolean LJIIIZ(java.util.Map<String, Object> params) {
        o.LJIIIZ(params, "params");
        return super.LJIIIZ(params);
    }

    @Override // X.AbstractC71187Rwl
    public final boolean LJIIL(int i) {
        C71234RxW.LIZ.getClass();
        if (1 == ((AnchorPinCardConfig) C71234RxW.LIZJ.getValue()).show) {
            return true;
        }
        return false;
    }
}
