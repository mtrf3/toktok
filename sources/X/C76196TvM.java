package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TvM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76196TvM extends AbstractC76856UEi<C76036Tsm> {
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final /* synthetic */ C76195TvL LLII;

    @Override // X.InterfaceC76136TuO
    public final C47121t6 LJJ() {
        return null;
    }

    @Override // X.InterfaceC76136TuO
    public final ViewGroup LJJIII() {
        return null;
    }

    @Override // X.InterfaceC76136TuO
    public final C47121t6 LJJJJL() {
        return null;
    }

    @Override // X.InterfaceC75966Tre
    public final DataChannel LJIIL() {
        return this.LLII.LJ;
    }

    @Override // X.AbstractC76213Tvd
    public final void LJJJJIZL() {
        C76132TuK.LJLJJLL.getClass();
        C76132TuK.LJJIII(this);
    }

    @Override // X.InterfaceC75959TrX
    public final InterfaceC75963Trb LLJLLL() {
        return this.LLII.LIZLLL;
    }

    public final C47121t6 N() {
        Object value = this.LLIFFJFJJ.getValue();
        o.LJIIIIZZ(value, "<get-pairingItemStatus>(...)");
        return (C47121t6) value;
    }

    @Override // X.InterfaceC75959TrX
    public final InterfaceC75964Trc o() {
        return this.LLII.LIZJ;
    }

    @Override // X.AbstractC76213Tvd
    public final void onViewDetachedFromWindow() {
        C76132TuK.LJLJJLL.getClass();
        C76132TuK.LJJIII(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76196TvM(C76195TvL c76195TvL, View view) {
        super(view);
        this.LLII = c76195TvL;
        this.LLFZ = C221108m2.LIZIZ(new AqS163S0100000_13(view, 731));
        this.LLI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 730));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS163S0100000_13(view, 729));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    @Override // X.AbstractC76213Tvd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(int r15, java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76196TvM.L(int, java.lang.Object):void");
    }

    @Override // X.AbstractC76213Tvd
    public final void M(int i, Object obj, List payloads) {
        C75981Trt data = (C75981Trt) obj;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(payloads, "payloads");
        C75953TrR.LJLJJLL.LJIJJ(this, data, i, payloads);
        C76132TuK.LJLJJLL.LJJIIZ(this, data, i, payloads);
    }
}
