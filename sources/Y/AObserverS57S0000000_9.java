package Y;

import X.ActivityC45651qj;
import X.C54029LIj;
import X.C54137LMn;
import X.C54139LMp;
import X.InterfaceC36571c5;
import X.InterfaceC56322M8o;
import androidx.lifecycle.Observer;
import com.bytedance.hox.Hox;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;

/* loaded from: classes10.dex */
public class AObserverS57S0000000_9 implements Observer {
    public final int $t;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public AObserverS57S0000000_9(int i) {
        this.$t = i;
    }

    public static final void onChanged$0(AObserverS57S0000000_9 aObserverS57S0000000_9, Object obj) {
        InterfaceC56322M8o interfaceC56322M8o;
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            C54137LMn.LJLIL.LJIIIIZZ();
            if (C54137LMn.LJLILLLLZI) {
                InterfaceC36571c5 Ja = Hox.LJLLI.LIZ(LIZLLL).Ja("FRIENDS_FEED");
                if ((Ja instanceof InterfaceC56322M8o) && (interfaceC56322M8o = (InterfaceC56322M8o) Ja) != null) {
                    PopupManager.LJIIL(new C54139LMp(interfaceC56322M8o));
                    C54137LMn.LJLILLLLZI = false;
                }
            }
        }
    }

    public static final void onChanged$1(AObserverS57S0000000_9 aObserverS57S0000000_9, Object obj) {
        ActivityC45651qj LIZLLL;
        if (C54029LIj.LIZIZ.LIZ() && (LIZLLL = StateOwner.LJLIL.LIZLLL()) != null) {
            MainPageFragmentImpl.LJI().LJFF(LIZLLL);
        }
    }
}
