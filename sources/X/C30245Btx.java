package X;

import Y.AObserverS69S0200000_5;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Btx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30245Btx implements InterfaceC30266BuI {
    public final C30252Bu4 LIZ;
    public final java.util.Set<EnumC30241Btt> LIZIZ = new LinkedHashSet();
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C30236Bto.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 360));
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 359));
    public final List<EnumC30241Btt> LJFF = new ArrayList();

    public final void LIZJ() {
        int size = this.LIZIZ.size() * C15380j0.LIZ(((Number) C30246Bty.LIZ(this.LIZ).getFirst()).floatValue());
        EnumC30254Bu6 enumC30254Bu6 = EnumC30254Bu6.PORTRAIT;
        EnumC30206BtK enumC30206BtK = EnumC30206BtK.LEFT;
        int LIZ = C15380j0.LIZ(C30246Bty.LIZLLL(enumC30254Bu6, enumC30206BtK, true)) + size;
        EnumC30206BtK enumC30206BtK2 = EnumC30206BtK.RIGHT;
        int LIZ2 = C15380j0.LIZ(C30246Bty.LIZLLL(enumC30254Bu6, enumC30206BtK2, true)) + C15380j0.LIZ(C30246Bty.LIZLLL(enumC30254Bu6, enumC30206BtK, false)) + C15380j0.LIZ(C30246Bty.LIZLLL(enumC30254Bu6, enumC30206BtK2, false)) + LIZ;
        if (this.LIZIZ.size() > ((Number) this.LIZJ.getValue()).intValue() || LIZ2 > C15380j0.LJIIL()) {
            EnumC30241Btt enumC30241Btt = (EnumC30241Btt) ORZ.LJLLLL(ORZ.LLIIIILZ((Iterable) this.LJ.getValue(), ORZ.LLJJ(this.LJFF)));
            if (enumC30241Btt == null) {
                return;
            }
            ((ArrayList) this.LJFF).add(enumC30241Btt);
            this.LIZIZ.remove(enumC30241Btt);
            TBViewModel viewModel = enumC30241Btt.getViewModel(this.LIZ.LIZJ);
            if (viewModel != null) {
                viewModel.hv0(false, false);
                return;
            }
            return;
        }
        if (this.LIZIZ.size() < ((Number) this.LIZJ.getValue()).intValue() && (!((ArrayList) this.LJFF).isEmpty())) {
            EnumC30241Btt enumC30241Btt2 = (EnumC30241Btt) ORZ.LLFF(this.LJFF);
            ((ArrayList) this.LJFF).remove(enumC30241Btt2);
            this.LIZIZ.add(enumC30241Btt2);
            TBViewModel viewModel2 = enumC30241Btt2.getViewModel(this.LIZ.LIZJ);
            if (viewModel2 != null) {
                viewModel2.hv0(true, false);
            }
        }
    }

    public C30245Btx(C30252Bu4 c30252Bu4) {
        this.LIZ = c30252Bu4;
    }

    @Override // X.InterfaceC30266BuI
    public final boolean LIZ(EnumC30241Btt enumC30241Btt) {
        if (C28509BGv.LJI((LiveMode) this.LIZLLL.getValue()) && ((ArrayList) this.LJFF).contains(enumC30241Btt)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC30266BuI
    public final void LIZIZ(EnumC30241Btt button, TBViewModel tBViewModel) {
        o.LJIIIZ(button, "button");
        tBViewModel.LJLJL.observe(this.LIZ.LIZIZ, new AObserverS69S0200000_5((Object) this, (User) button, (InterfaceC88472Yns<? super User, C76800UCe>) 38));
    }
}
