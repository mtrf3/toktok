package q03;

import X.C188727au;
import X.C197377or;
import X.C28677BNh;
import X.C71256Rxs;
import X.C75032x1;
import X.C78928UyK;
import X.C98T;
import X.EnumC228948yg;
import X.FMX;
import X.MB6;
import X.XKX;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.mix.createmix.GuideCreateFragment;
import com.ss.android.ugc.aweme.nows.feed.ui.OfflinePostCell;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDaS481S0100000_1 extends C98T {
    public final int $t;
    public Object l0;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS481S0100000_1(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(IDaS481S0100000_1 iDaS481S0100000_1, View view) {
        if (view != null) {
            AssemViewModel value = ((GuideCreateFragment) iDaS481S0100000_1.l0).LJLIL.getValue();
            EnumC228948yg enumC228948yg = EnumC228948yg.CREATE_NAME;
            o.LJIIIZ(enumC228948yg, "enum");
            value.setState(new AqS167S0100000_1(enumC228948yg, 414));
            GuideCreateFragment guideCreateFragment = (GuideCreateFragment) iDaS481S0100000_1.l0;
            String str = guideCreateFragment.LJLILLLLZI;
            String str2 = guideCreateFragment.LJLJI;
            C188727au LIZ = C78928UyK.LIZ(str, "enterFrom", str2, "enterMethod");
            LIZ.LJIIIZ("enter_from", str);
            LIZ.LJIIIZ("enter_method", str2);
            FMX.LJIIL("start_first_playlist", LIZ.LIZ);
        }
    }

    public static final void LIZ$1(IDaS481S0100000_1 iDaS481S0100000_1, View view) {
        if (view != null) {
            Context context = ((OfflinePostCell) iDaS481S0100000_1.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C197377or.LIZJ(context, "click_post", "homepage_now", null, false, false, null, null, null, null, null, null, 0, null, null, null, 65408);
        }
    }

    public static final void LIZ$2(IDaS481S0100000_1 iDaS481S0100000_1, View view) {
        if (view != null) {
            IFrameSlot.SlotViewModel slotViewModel = ((C71256Rxs) iDaS481S0100000_1.l0).LJLLLLLL;
            if (slotViewModel != null) {
                XKX.LIZIZ(ViewModelKt.getViewModelScope(slotViewModel), (MB6) ((C71256Rxs) iDaS481S0100000_1.l0).LJLLL.getValue(), null, new C28677BNh((C71256Rxs) iDaS481S0100000_1.l0, null), 2);
                IFrameSlot.SlotViewModel slotViewModel2 = ((C71256Rxs) iDaS481S0100000_1.l0).LJLLLLLL;
                if (slotViewModel2 != null) {
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(slotViewModel2), (MB6) ((C71256Rxs) iDaS481S0100000_1.l0).LJLLL.getValue(), null, new C75032x1((C71256Rxs) iDaS481S0100000_1.l0, null), 2);
                    return;
                } else {
                    o.LJIJI("viewModel");
                    throw null;
                }
            }
            o.LJIJI("viewModel");
            throw null;
        }
    }
}
