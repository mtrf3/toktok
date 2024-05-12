package X;

import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment;
import com.ss.android.ugc.aweme.kids.liked.favorite.FavoriteGridFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes7.dex */
public final /* synthetic */ class G3Y extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public G3Y(Object obj) {
        super(0, obj, FavoriteGridFragment.class, "tryRefreshList", "tryRefreshList()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        KidsAwemeGridFragment kidsAwemeGridFragment = (KidsAwemeGridFragment) this.receiver;
        if (kidsAwemeGridFragment.isViewValid()) {
            kidsAwemeGridFragment.getContext();
            if (C2NU.LIZ.LIZIZ()) {
                kidsAwemeGridFragment.Hl();
            } else {
                C26045AKb c26045AKb = new C26045AKb(kidsAwemeGridFragment);
                c26045AKb.LJIIIIZZ(R.string.img);
                c26045AKb.LJIIJ();
                kidsAwemeGridFragment.Gl();
            }
        }
        return C76800UCe.LIZ;
    }
}
