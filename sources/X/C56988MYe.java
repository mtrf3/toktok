package X;

import Y.IDComparatorS341S0100000_9;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.MYe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56988MYe {
    public final HashMap<Integer, Integer> LIZ;
    public final IDComparatorS341S0100000_9 LIZIZ;

    public C56988MYe() {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        this.LIZ = hashMap;
        hashMap.put(6, Integer.valueOf(LiveEffectMusicFadeDurationSetting.DEFAULT));
        if (C53339KwZ.LJ()) {
            hashMap.put(103, Integer.valueOf(LiveCenterDelayLoadSetting.DEFAULT));
            hashMap.put(102, 7000);
            hashMap.put(105, 8500);
            hashMap.put(104, 7500);
            hashMap.put(3, Integer.valueOf(LivePlayerResourceReleaseSetting.ENABLE));
            hashMap.put(4, 3500);
        } else if (L1Y.LIZJ()) {
            hashMap.put(5, 5000);
        } else {
            hashMap.put(5, 7000);
        }
        this.LIZIZ = new IDComparatorS341S0100000_9(this, 0);
    }

    public static String LIZ(InterfaceC57784Mm4 interfaceC57784Mm4) {
        String str;
        User user;
        String uid;
        User user2;
        String uid2;
        if (interfaceC57784Mm4 instanceof C116094h3) {
            CustomBizData customBizData = ((C116074h1) interfaceC57784Mm4).LJLIL.getCustomBizData();
            if (customBizData == null || (user2 = customBizData.getUser()) == null || (uid2 = user2.getUid()) == null) {
                return "";
            }
            return uid2;
        }
        if (interfaceC57784Mm4 instanceof AbstractC54715Ldf) {
            InboxLiveNotice LIZ = ((AbstractC54715Ldf) interfaceC57784Mm4).LIZ();
            if (LIZ == null || (user = LIZ.getUser()) == null || (uid = user.getUid()) == null) {
                return "";
            }
            return uid;
        }
        if (interfaceC57784Mm4 instanceof C116144h8) {
            String uid3 = ((C116144h8) interfaceC57784Mm4).LJLIL.getUid();
            o.LJIIIIZZ(uid3, "powerItem.contact.uid");
            return uid3;
        }
        if (interfaceC57784Mm4 instanceof StoryInboxItem) {
            StoryInboxItem storyInboxItem = (StoryInboxItem) interfaceC57784Mm4;
            if (storyInboxItem.isMe()) {
                return "ignore";
            }
            String authorUid = storyInboxItem.getStoryCollection().getAuthorUid();
            o.LJIIIIZZ(authorUid, "powerItem.storyCollection.authorUid");
            return authorUid;
        }
        if ((interfaceC57784Mm4 instanceof C48710J9u) || (interfaceC57784Mm4 instanceof C56358M9y) || !(interfaceC57784Mm4 instanceof C116114h5) || (str = ((C116114h5) interfaceC57784Mm4).LJLIL.LIZ) == null) {
            return "ignore";
        }
        return str;
    }

    public static int LIZIZ(InterfaceC57784Mm4 powerItem) {
        o.LJIIIZ(powerItem, "powerItem");
        if (powerItem instanceof C116094h3) {
            return ((C116074h1) powerItem).LJLIL.getPriority();
        }
        if (powerItem instanceof AbstractC54715Ldf) {
            InboxLiveNotice LIZ = ((AbstractC54715Ldf) powerItem).LIZ();
            if (LIZ == null) {
                return ImagePreloadExperiment.PRIORITY_DEFAULT;
            }
            return LIZ.getPriority();
        }
        if (powerItem instanceof C116144h8) {
            return ((C116144h8) powerItem).LJLJI;
        }
        if (powerItem instanceof StoryInboxItem) {
            return ((StoryInboxItem) powerItem).getPriority();
        }
        if (powerItem instanceof C56358M9y) {
            return ((C56358M9y) powerItem).LJLJJL;
        }
        if (powerItem instanceof C48710J9u) {
            return ((C48710J9u) powerItem).LJLJJL;
        }
        if (!(powerItem instanceof C116114h5)) {
            return ImagePreloadExperiment.PRIORITY_DEFAULT;
        }
        return ((C116114h5) powerItem).LJLIL.LIZLLL;
    }
}
