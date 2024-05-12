package X;

import Y.ACallableS118S0100000_15;
import android.widget.ImageView;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseDiscoverMusicFragment;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;

/* renamed from: X.XWj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C84969XWj implements Observer {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i;
        switch (this.LJLIL) {
            case 0:
                final BaseDiscoverMusicFragment baseDiscoverMusicFragment = (BaseDiscoverMusicFragment) this.LJLILLLLZI;
                baseDiscoverMusicFragment.getClass();
                if (obj == XWD.LIZ) {
                    C10K.LIZIZ(new ACallableS118S0100000_15(baseDiscoverMusicFragment, 11), C10K.LJIIIIZZ, null);
                    new C84972XWm(new InterfaceC85024XYm() { // from class: X.XYY
                        @Override // X.InterfaceC85024XYm
                        public final void LIZ() {
                            BaseDiscoverMusicFragment.this.LJIIJJI();
                        }
                    }, 5).LIZ(baseDiscoverMusicFragment.LJLIL);
                    return;
                }
                return;
            default:
                ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) this.LJLILLLLZI;
                chooseCoverActivity.LJLZ = true;
                ImageView imageView = chooseCoverActivity.LJLJLJ;
                if (((Boolean) obj).booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
        }
    }

    public /* synthetic */ C84969XWj(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
