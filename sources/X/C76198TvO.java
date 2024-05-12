package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TvO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76198TvO extends AbstractC76213Tvd<C76009TsL> implements InterfaceC75959TrX {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public EnumC75958TrW LJLLJ;
    public final /* synthetic */ C76197TvN LJLLL;

    @Override // X.InterfaceC75959TrX
    public final C2A7 LIZIZ() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-inviteBtn>(...)");
        return (C2A7) value;
    }

    @Override // X.InterfaceC75966Tre
    public final View LJIIIIZZ() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.InterfaceC75966Tre
    public final DataChannel LJIIL() {
        return this.LJLLL.LJ;
    }

    @Override // X.InterfaceC75959TrX
    public final InterfaceC75963Trb LLJLLL() {
        return this.LJLLL.LIZLLL;
    }

    public final ViewGroup N() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-layoutPairingCoHost>(...)");
        return (ViewGroup) value;
    }

    public final C47121t6 P() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-pairingBlockText>(...)");
        return (C47121t6) value;
    }

    public final C47121t6 Q() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-pairingTimeStatus>(...)");
        return (C47121t6) value;
    }

    @Override // X.InterfaceC75959TrX
    public final InterfaceC75964Trc o() {
        return this.LJLLL.LIZJ;
    }

    @Override // X.InterfaceC75959TrX
    public final EnumC75958TrW LLLLL() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC75959TrX
    public final void LJJJLZIJ(EnumC75958TrW state) {
        o.LJIIIZ(state, "state");
        this.LJLLJ = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76198TvO(C76197TvN c76197TvN, View view) {
        super(view);
        this.LJLLL = c76197TvN;
        this.LJLIL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 617));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 615));
        this.LJLJI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 616));
        this.LJLJJI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 611));
        this.LJLJJL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 612));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 614));
        this.LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 610));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(view, 609));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 607));
        this.LJLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 606));
        this.LJLLI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 613));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 608));
        this.LJLLJ = EnumC75958TrW.NORMAL;
    }

    @Override // X.AbstractC76213Tvd
    public final void L(int i, Object obj) {
        C76009TsL data = (C76009TsL) obj;
        o.LJIIIZ(data, "data");
        this.LJLLL.getClass();
        C76197TvN.LJI(this, data, i, false);
    }

    @Override // X.AbstractC76213Tvd
    public final void M(int i, Object obj, List payloads) {
        C76009TsL data = (C76009TsL) obj;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(payloads, "payloads");
        this.LJLLL.getClass();
        C76197TvN.LJI(this, data, i, true);
    }
}
