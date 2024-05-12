package Y;

import X.C169786lS;
import X.C169816lV;
import X.C55096Ljo;
import X.C56760MPk;
import X.C57738MlK;
import X.C6FS;
import X.C83621Wrp;
import X.C8BS;
import X.GGS;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.MVV;
import X.ViewOnClickListenerC56908MVc;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ability.IDubbingAbility;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AObjectS54S0101000_9 implements InterfaceC65784Pro {
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
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS54S0101000_9 aObjectS54S0101000_9) {
        boolean z;
        switch (aObjectS54S0101000_9.i1) {
            case 0:
                return ((DetailFragmentPanel) aObjectS54S0101000_9.l0).LJJLJ();
            case 1:
                VideoViewCell videoViewCell = (VideoViewCell) aObjectS54S0101000_9.l0;
                if (videoViewCell.LLLLLILLIL == null) {
                    InterfaceC55235Lm3 vScope = videoViewCell.LLLLIILLL;
                    o.LJIIIZ(vScope, "vScope");
                    videoViewCell.LLLLLILLIL = (IDubbingAbility) C55096Ljo.LIZ(vScope, IDubbingAbility.class, null);
                }
                if (videoViewCell.LLLLLILLIL != null && videoViewCell.LLLLLILLIL.Pe()) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                C169786lS c169786lS = (C169786lS) aObjectS54S0101000_9.l0;
                return Boolean.valueOf(C169816lV.LIZJ(c169786lS.LJIJI, c169786lS.LJJIJIIJI, c169786lS.LJIL()));
            case 3:
                Fragment fragment = (Fragment) aObjectS54S0101000_9.l0;
                if (fragment.mo49getActivity() != null) {
                    fragment.mo49getActivity().onBackPressed();
                }
                return null;
            default:
                ((C6FS) aObjectS54S0101000_9.l0).g40();
                return null;
        }
    }

    public static final Object invoke$1(AObjectS54S0101000_9 aObjectS54S0101000_9) {
        switch (aObjectS54S0101000_9.i1) {
            case 0:
                MVV mvv = (MVV) aObjectS54S0101000_9.l0;
                String accountType = mvv.mMTBaseNotice.getAccountType();
                int i = ((ViewOnClickListenerC56908MVc) mvv).mPosition;
                String str = mvv.mTimelineTypeStr;
                int az = mvv.vm.az();
                BaseNotice baseNotice = mvv.mMTBaseNotice;
                C56760MPk.LJII(accountType, i, str, az, baseNotice.nid, Integer.valueOf(baseNotice.hasRead ? 1 : 0), null, mvv.mMTBaseNotice.templateId, mvv.vm.Kg0());
                return null;
            case 1:
                aObjectS54S0101000_9.l0.getClass();
                return GGS.LIZJ;
            default:
                return Boolean.valueOf(((VideoPublishContainerScene) aObjectS54S0101000_9.l0).LLLLLILLIL());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AObjectS54S0101000_9 aObjectS54S0101000_9) {
        boolean z;
        switch (aObjectS54S0101000_9.i1) {
            case 0:
                aObjectS54S0101000_9.l0.getClass();
                return GGS.LJFF;
            case 1:
                C8BS c8bs = (C8BS) aObjectS54S0101000_9.l0;
                T t = c8bs.mData;
                if (t != 0 && ((FeedItemList) t).getItems() != null && !((FeedItemList) c8bs.mData).getItems().isEmpty()) {
                    Iterator<Aweme> it = ((FeedItemList) c8bs.mData).getItems().iterator();
                    while (it.hasNext()) {
                        if (C57738MlK.LIZIZ.LJIIL().LJIIIIZZ(it.next())) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                return C83621Wrp.e((C83621Wrp) aObjectS54S0101000_9.l0);
        }
    }

    public AObjectS54S0101000_9(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
