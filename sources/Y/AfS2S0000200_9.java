package Y;

import X.ActivityC45651qj;
import X.C36203EIt;
import X.C36207EIx;
import X.C53976LGi;
import X.C78685UuP;
import X.EnumC36206EIw;
import X.InterfaceC36202EIs;
import X.InterfaceC64592gB;
import X.LHM;
import X.LX1;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabRedDotOptimizationSettings;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.service.IFriendsTabDebugService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AfS2S0000200_9 implements InterfaceC64592gB {
    public final int $t;
    public long j0;
    public long j1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS2S0000200_9 afS2S0000200_9, Object obj) {
        LX1.LIZ(afS2S0000200_9.j0, SystemClock.elapsedRealtime() - afS2S0000200_9.j1, FriendsTabRedDotOptimizationSettings.LIZ().expireTimeSeconds, true);
    }

    public static final void accept$1(AfS2S0000200_9 afS2S0000200_9, Object obj) {
        LX1.LIZ(afS2S0000200_9.j0, SystemClock.elapsedRealtime() - afS2S0000200_9.j1, FriendsTabRedDotOptimizationSettings.LIZ().expireTimeSeconds, false);
    }

    public static final void accept$2(AfS2S0000200_9 afS2S0000200_9, Object obj) {
        ArrayList<UserNewContent> arrayList;
        List<ISocialTabProtocol> arrayList2;
        SocialFeedRedDotResponse LJJIJ;
        ISocial2TabProtocolAbility LJFF;
        ArrayList<String> arrayList3;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        NewContentResponse newContentResponse = (NewContentResponse) obj;
        long j = afS2S0000200_9.j0;
        long j2 = afS2S0000200_9.j1;
        C36203EIt.LIZJ = newContentResponse;
        String str = null;
        if (newContentResponse != null && (friendsFeedResponse = newContentResponse.getFriendsFeedResponse()) != null) {
            arrayList = friendsFeedResponse.getGuideButtonAuthors();
        } else {
            arrayList = null;
        }
        C36203EIt.LJI = arrayList;
        InterfaceC36202EIs interfaceC36202EIs = (InterfaceC36202EIs) C36203EIt.LJFF.getValue();
        if (interfaceC36202EIs != null) {
            interfaceC36202EIs.LIZIZ(newContentResponse, j, j2);
        }
        if (LHM.LIZIZ.LIZIZ().redDotLogic().PT()) {
            SocialFeedRedDotResponse LJJIJ2 = C78685UuP.LJJIJ(newContentResponse);
            if (LJJIJ2 == null || (arrayList3 = LJJIJ2.getRedDotList()) == null) {
                arrayList3 = new ArrayList<>();
            }
            IFriendsTabDebugService iFriendsTabDebugService = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
            if (iFriendsTabDebugService != null) {
                iFriendsTabDebugService.LIZ(arrayList3);
            }
            Set<String> set = C36203EIt.LJIIIIZZ;
            set.clear();
            set.addAll(arrayList3);
            Set<String> set2 = C36203EIt.LJII;
            set2.clear();
            set2.addAll(arrayList3);
        }
        if (newContentResponse != null) {
            BaseResponse.ServerTimeExtra serverTimeExtra = newContentResponse.extra;
            if (serverTimeExtra != null) {
                str = serverTimeExtra.logid;
            }
            C36203EIt.LIZ = str;
            EnumC36206EIw enumC36206EIw = C36203EIt.LIZIZ;
            ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
            if (LIZLLL == null || (LJFF = C53976LGi.LJFF(LIZLLL)) == null || (arrayList2 = LJFF.NL()) == null) {
                arrayList2 = new ArrayList<>();
            }
            for (ISocialTabProtocol iSocialTabProtocol : arrayList2) {
                if (o.LJ(iSocialTabProtocol.getTag(), "FRIENDS_FEED") && (LJJIJ = C78685UuP.LJJIJ(newContentResponse)) != null) {
                    if (LJJIJ.checkResponseValid()) {
                        iSocialTabProtocol.a0(LJJIJ, enumC36206EIw);
                    } else {
                        LJJIJ.getStatusCode();
                        LJJIJ.getStatusMessage();
                    }
                }
            }
            C36207EIx.LIZ().Ng0(newContentResponse, C36203EIt.LIZIZ);
        }
    }

    public AfS2S0000200_9(long j, long j2, int i) {
        this.$t = i;
        this.j0 = j;
        this.j1 = j2;
    }
}
