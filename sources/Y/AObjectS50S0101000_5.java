package Y;

import X.BJ9;
import X.BJP;
import X.C24540xm;
import X.C28151B3b;
import X.C31996Ch6;
import X.C42796Gqu;
import X.C76800UCe;
import X.C83621Wrp;
import X.GGS;
import X.InterfaceC65784Pro;
import X.WM7;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class AObjectS50S0101000_5 implements InterfaceC65784Pro {
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
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS50S0101000_5 aObjectS50S0101000_5) {
        LiveRecyclableWidget lambda$loadInitWidgetsP0$34;
        switch (aObjectS50S0101000_5.i1) {
            case 0:
                lambda$loadInitWidgetsP0$34 = ((AbsAudienceInteractionFragment) aObjectS50S0101000_5.l0).lambda$loadInitWidgetsP0$34();
                return lambda$loadInitWidgetsP0$34;
            case 1:
                ((ProfilePageFragment) aObjectS50S0101000_5.l0).nm();
                return null;
            default:
                return ((C42796Gqu) aObjectS50S0101000_5.l0).LJII();
        }
    }

    public static final Object invoke$1(AObjectS50S0101000_5 aObjectS50S0101000_5) {
        switch (aObjectS50S0101000_5.i1) {
            case 0:
                Fragment fragment = (Fragment) ((LifecycleOwner) aObjectS50S0101000_5.l0);
                if (fragment.mo49getActivity() != null) {
                    fragment.mo49getActivity().finishAndRemoveTask();
                    C28151B3b.LIZ().LIZIZ();
                    return null;
                }
                return null;
            default:
                return C83621Wrp.n((C83621Wrp) ((LifecycleOwner) aObjectS50S0101000_5.l0));
        }
    }

    public static final Object invoke$2(AObjectS50S0101000_5 aObjectS50S0101000_5) {
        switch (aObjectS50S0101000_5.i1) {
            case 0:
                MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment = ((GuestMediaManageFragment) aObjectS50S0101000_5.l0).LLIIIL;
                if (multiGuestEffectSwitchFragment != null) {
                    return Integer.valueOf(multiGuestEffectSwitchFragment.LJZL);
                }
                return 0;
            case 1:
                BJ9 bj9 = ((LivePlayFragment) aObjectS50S0101000_5.l0).LLIIII;
                bj9.getClass();
                long elapsedRealtime = (SystemClock.elapsedRealtime() - bj9.LJIILLIIL) - bj9.LJJIFFI;
                if (BJP.LIZ()) {
                    Long l = 0L;
                    Iterator it = ((ArrayList) LivePlayFragment.A).iterator();
                    while (it.hasNext()) {
                        Long l2 = (Long) it.next();
                        l = Long.valueOf(l2.longValue() + l.longValue());
                    }
                    elapsedRealtime += l.longValue();
                }
                return Long.valueOf(elapsedRealtime);
            case 2:
                ((VideoViewCell) aObjectS50S0101000_5.l0).LLIIJLIL().TD("others");
                return C76800UCe.LIZ;
            case 3:
                aObjectS50S0101000_5.l0.getClass();
                return GGS.LJFF;
            default:
                C24540xm.LIZ(R.string.dq, ((WM7) aObjectS50S0101000_5.l0).requireActivity(), 2007);
                return null;
        }
    }

    public static final Object invoke$3(AObjectS50S0101000_5 aObjectS50S0101000_5) {
        switch (aObjectS50S0101000_5.i1) {
            case 0:
                ((PublicScreenWidget) ((LifecycleOwner) aObjectS50S0101000_5.l0)).LLIIII.LIZJ();
                return C76800UCe.LIZ;
            default:
                return Boolean.valueOf(((VideoPublishContainerScene) ((LifecycleOwner) aObjectS50S0101000_5.l0)).LLLLLILLIL());
        }
    }

    public static final Object invoke$4(AObjectS50S0101000_5 aObjectS50S0101000_5) {
        switch (aObjectS50S0101000_5.i1) {
            case 0:
                C31996Ch6 c31996Ch6 = (C31996Ch6) aObjectS50S0101000_5.l0;
                ArrayList arrayList = new ArrayList();
                ImageModel avatarThumb = c31996Ch6.LJI.getAvatarThumb();
                ImageModel imageModel = null;
                if (avatarThumb == null) {
                    avatarThumb = null;
                }
                arrayList.add(avatarThumb);
                ImageModel avatarThumb2 = c31996Ch6.LJII.getAvatarThumb();
                if (avatarThumb2 != null) {
                    imageModel = avatarThumb2;
                }
                arrayList.add(imageModel);
                return arrayList;
            default:
                aObjectS50S0101000_5.l0.getClass();
                return GGS.LIZJ;
        }
    }

    public AObjectS50S0101000_5(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
