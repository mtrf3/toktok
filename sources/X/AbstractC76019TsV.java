package X;

import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.TsV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC76019TsV extends InteractDialogFragmentBaseContract$AbsPresenter<MultiCoHostInviteListContract$AbsView> {
    public boolean LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public CJ2 LJLLILLLL;
    public CJ2 LJLLJ;
    public int LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public EnumC55972Lxw LJZ;

    public abstract void LIZJ(C75981Trt c75981Trt, EnumC75614Tly enumC75614Tly, boolean z);

    public abstract void LIZLLL(Room room);

    public abstract void LJ(Room room);

    public abstract void LJFF(int i);

    public void LJI(int i) {
    }

    public int LJII() {
        return 0;
    }

    public abstract void LJIIIIZZ(C75981Trt c75981Trt, EnumC75614Tly enumC75614Tly, boolean z);

    public void LJIIIZ(int i) {
    }

    public abstract void LJIIJ();

    public abstract void LJIIJJI();

    public abstract void LJIIL();

    public abstract void LJIILIIL(C75981Trt c75981Trt);

    public void LJIILJJIL(int i) {
    }

    public abstract void LJIILL(EnumC76039Tsp enumC76039Tsp);

    public abstract void LJIILLIIL(EnumC76039Tsp enumC76039Tsp);

    public AbstractC76019TsV(BaseMultiHostInviteListFragment baseMultiHostInviteListFragment) {
        super(baseMultiHostInviteListFragment);
        this.LJLJJI = true;
        this.LJLJJLL = -1;
        this.LJLJL = true;
        this.LJLJLLL = -1;
        this.LJLLI = -1;
        this.LJLLILLLL = new CJ2();
        this.LJLLJ = new CJ2();
        this.LJLLLL = true;
        this.LJZ = EnumC55972Lxw.OLD;
    }
}
