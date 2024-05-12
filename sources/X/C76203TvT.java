package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TvT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76203TvT extends AbstractC76856UEi<C75981Trt> implements InterfaceC76140TuS {
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public EnumC76138TuQ LLIIIILZ;
    public final /* synthetic */ C76204TvU LLIIIJ;

    @Override // X.InterfaceC75966Tre
    public final DataChannel LJIIL() {
        return this.LLIIIJ.LJFF;
    }

    @Override // X.InterfaceC76136TuO
    public final C47121t6 LJJ() {
        Object value = this.LLI.getValue();
        o.LJIIIIZZ(value, "<get-multiGuestBlockText>(...)");
        return (C47121t6) value;
    }

    @Override // X.InterfaceC76136TuO
    public final ViewGroup LJJIII() {
        Object value = this.LLIFFJFJJ.getValue();
        o.LJIIIIZZ(value, "<get-layoutReservedRemind>(...)");
        return (ViewGroup) value;
    }

    @Override // X.AbstractC76213Tvd
    public final void LJJJJIZL() {
        C76132TuK.LJLJJLL.getClass();
        C76132TuK.LJJIII(this);
    }

    @Override // X.InterfaceC76136TuO
    public final C47121t6 LJJJJL() {
        Object value = this.LLII.getValue();
        o.LJIIIIZZ(value, "<get-reservedRemindText>(...)");
        return (C47121t6) value;
    }

    @Override // X.InterfaceC76140TuS
    public final C2A7 LLFF() {
        Object value = this.LLFZ.getValue();
        o.LJIIIIZZ(value, "<get-reserveBtn>(...)");
        return (C2A7) value;
    }

    @Override // X.InterfaceC76140TuS
    public final InterfaceC76141TuT LLJJIJIIJIL() {
        return this.LLIIIJ.LJ;
    }

    @Override // X.InterfaceC75959TrX
    public final InterfaceC75963Trb LLJLLL() {
        return this.LLIIIJ.LIZLLL;
    }

    @Override // X.AbstractC76856UEi, X.InterfaceC76136TuO
    public final C41081jM LLZILL() {
        return (C41081jM) this.LLIIII.getValue();
    }

    @Override // X.InterfaceC75959TrX
    public final InterfaceC75964Trc o() {
        return this.LLIIIJ.LIZJ;
    }

    @Override // X.AbstractC76213Tvd
    public final void onViewDetachedFromWindow() {
        C76132TuK.LJLJJLL.getClass();
        C76132TuK.LJJIII(this);
    }

    @Override // X.InterfaceC76140TuS
    public final EnumC76138TuQ LLJLILLLLZIIL() {
        return this.LLIIIILZ;
    }

    @Override // X.InterfaceC76140TuS
    public final void p(EnumC76138TuQ state) {
        o.LJIIIZ(state, "state");
        this.LLIIIILZ = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76203TvT(C76204TvU c76204TvU, View view) {
        super(view);
        this.LLIIIJ = c76204TvU;
        this.LLFZ = C221108m2.LIZIZ(new AqS163S0100000_13(view, 724));
        this.LLI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 723));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS163S0100000_13(view, 722));
        this.LLII = C221108m2.LIZIZ(new AqS163S0100000_13(view, 726));
        this.LLIIII = C221108m2.LIZIZ(new AqS163S0100000_13(view, 725));
        this.LLIIIILZ = EnumC76138TuQ.RESERVABLE;
    }

    @Override // X.AbstractC76213Tvd
    public final void L(int i, Object obj) {
        C75981Trt data = (C75981Trt) obj;
        o.LJIIIZ(data, "data");
        C75953TrR.LJJ(this, data);
        C76137TuP.LJIL(this, data);
        C76132TuK.LJLJJLL.LJJIIJZLJL(this, data);
    }

    @Override // X.AbstractC76213Tvd
    public final void M(int i, Object obj, List payloads) {
        C75981Trt data = (C75981Trt) obj;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(payloads, "payloads");
        C75953TrR.LJLJJLL.LJIJJ(this, data, i, payloads);
        C76137TuP.LJLJJLL.LJIJJ(this, data, i, payloads);
        C76132TuK.LJLJJLL.LJJIIZ(this, data, i, payloads);
    }
}
