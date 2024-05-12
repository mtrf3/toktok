package Y;

import X.AbstractC42651GoZ;
import X.C17N;
import X.C51421KGb;
import X.C51465KHt;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.RunnableC51616KNo;
import X.T5T;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.detailpage.ui.CommentInputFragment;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;

/* loaded from: classes9.dex */
public class AObjectS53S0101000_8 implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS53S0101000_8 aObjectS53S0101000_8) {
        switch (aObjectS53S0101000_8.i1) {
            case 0:
                EcBaseDiscoverAndSearchFragmentNew ecBaseDiscoverAndSearchFragmentNew = (EcBaseDiscoverAndSearchFragmentNew) aObjectS53S0101000_8.l0;
                if (!ecBaseDiscoverAndSearchFragmentNew.mStatusDestroyed) {
                    KeyboardUtils.LIZLLL(ecBaseDiscoverAndSearchFragmentNew.LJLJI);
                    C51421KGb.LIZ();
                    T5T t5t = ecBaseDiscoverAndSearchFragmentNew.LJLJI;
                    if (t5t != null) {
                        t5t.post(new ARunnableS10S0101000_6(4, ecBaseDiscoverAndSearchFragmentNew, 13));
                    }
                }
                return null;
            case 1:
                ((StickerPropDetailFragment) aObjectS53S0101000_8.l0).Ol(null);
                return null;
            case 2:
                return ((VideoEditContainerScene) aObjectS53S0101000_8.l0).LLIILII.LLJJI();
            default:
                return ((ExteriorVideoRecordScene) aObjectS53S0101000_8.l0).LLILLL;
        }
    }

    public static final Object invoke$1(AObjectS53S0101000_8 aObjectS53S0101000_8) {
        switch (aObjectS53S0101000_8.i1) {
            case 0:
                ((CommentInputFragment) aObjectS53S0101000_8.l0).LLD.LL = false;
                return C76800UCe.LIZ;
            case 1:
                BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew = (BaseDiscoverAndSearchFragmentNew) aObjectS53S0101000_8.l0;
                if (!baseDiscoverAndSearchFragmentNew.mStatusDestroyed && !baseDiscoverAndSearchFragmentNew.LLFZ.LJLJI) {
                    baseDiscoverAndSearchFragmentNew.LJLJJL.setCursorVisible(true);
                    baseDiscoverAndSearchFragmentNew.LJLJJL.post(new RunnableC51616KNo(5, baseDiscoverAndSearchFragmentNew));
                    baseDiscoverAndSearchFragmentNew.LLFZ.LJLIL = true;
                    C17N.LJJJJJL(baseDiscoverAndSearchFragmentNew).j4(new C51465KHt());
                }
                return null;
            case 2:
                return ((VideoEditContainerScene) aObjectS53S0101000_8.l0).LLIILII.LLJJI();
            case 3:
                ((AbstractC42651GoZ) aObjectS53S0101000_8.l0).LLJJI();
                return null;
            default:
                VideoBitRateABManager videoBitRateABManager = (VideoBitRateABManager) aObjectS53S0101000_8.l0;
                videoBitRateABManager.LJIIIIZZ(videoBitRateABManager.LJ);
                return null;
        }
    }

    public AObjectS53S0101000_8(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
