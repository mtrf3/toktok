package X;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TGB implements TGP {
    public TE1 LJLIL;
    public InterfaceC74265TCr LJLILLLLZI;
    public C5NP LJLJI;
    public boolean LJLJJI;
    public TH7<THN, Fragment> LJLJJL;
    public TGN LJLJJLL;
    public TF1 LJLJL;
    public final List<T43> LJLJLJ;
    public InterfaceC88472Yns<? super TGD, C76800UCe> LJLJLLL;
    public final TGD LJLL;
    public final TEZ LJLLI;
    public final InterfaceC46204IBk LJLLILLLL;
    public final InterfaceC74343TFr LJLLJ;
    public final InterfaceC74359TGh LJLLL;
    public final TEF LJLLLL;

    @Override // X.TGP
    public final TGC LIZ(C29S activity, FrameLayout rootContainer, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager) {
        TGD tgd;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(rootContainer, "rootContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(fragmentManager, "fragmentManager");
        InterfaceC88472Yns<? super TGD, C76800UCe> interfaceC88472Yns = this.LJLJLLL;
        if (interfaceC88472Yns != null) {
            tgd = new TGD(0, 0, null, 0, 0, 0, false, 0L, null, null, false, false, false, 131071);
            interfaceC88472Yns.invoke(tgd);
        } else {
            tgd = this.LJLL;
            if (tgd == null) {
                tgd = new TGD(0, 0, null, 0, 0, 0, false, 0L, null, null, false, false, false, 131071);
            }
        }
        TF5 tf5 = new TF5(this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL, tgd.LJLLILLLL);
        TEJ tej = new TEJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, tgd.LJLLI.LLFFF, LiveTryModeCountDownThresholdSetting.DEFAULT);
        TH7<THN, Fragment> th7 = this.LJLJJL;
        TGN tgn = this.LJLJJLL;
        boolean z = this.LJLJJI;
        TF1 tf1 = this.LJLJL;
        if (tf1 == null) {
            tf1 = new SearchStickerViewModel(lifecycleOwner, this.LJLLI, this.LJLLILLLL, this.LJLLLL);
        }
        TGC tgc = new TGC(activity, rootContainer, lifecycleOwner, fragmentManager, tgd, tf5, tej, th7, tgn, z, tf1);
        Iterator it = ((ArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            tgc.LJLJLLL.LIZ((T43) it.next());
        }
        return tgc;
    }

    public TGB(TEZ stickerDataManager, InterfaceC46204IBk clickController, InterfaceC74343TFr stickerMobHelper, InterfaceC74359TGh stickerMonitor, TEF stickerTagHandler) {
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(clickController, "clickController");
        o.LJIIIZ(stickerMobHelper, "stickerMobHelper");
        o.LJIIIZ(stickerMonitor, "stickerMonitor");
        o.LJIIIZ(stickerTagHandler, "stickerTagHandler");
        this.LJLLI = stickerDataManager;
        this.LJLLILLLL = clickController;
        this.LJLLJ = stickerMobHelper;
        this.LJLLL = stickerMonitor;
        this.LJLLLL = stickerTagHandler;
        this.LJLJJI = true;
        this.LJLJJLL = new C65314PkE();
        this.LJLJLJ = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TGB(TGD tgd, TEZ stickerDataManager, InterfaceC46204IBk clickController, InterfaceC74343TFr stickerMobHelper, C1E4 c1e4, THA tha) {
        this(stickerDataManager, clickController, stickerMobHelper, c1e4, tha);
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(clickController, "clickController");
        o.LJIIIZ(stickerMobHelper, "stickerMobHelper");
        this.LJLL = tgd;
    }
}
