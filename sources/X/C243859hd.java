package X;

import android.text.TextUtils;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9hd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243859hd extends AbstractC65781Prl implements InterfaceC88473Ynt<ProfileComponents, User, Boolean, C76800UCe> {
    public static final C243859hd LJLIL = new C243859hd();

    public C243859hd() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(ProfileComponents profileComponents, User user, Boolean bool) {
        m mVar;
        m mVar2;
        m mVar3;
        ProfileComponents first = profileComponents;
        User user2 = user;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(first, "first");
        o.LJIIIZ(user2, "user");
        List<? extends ProfileComponents> list = first.components;
        if (list != null) {
            for (ProfileComponents profileComponents2 : list) {
                C244699iz.LIZIZ = profileComponents2.bizData;
                String str = profileComponents2.componentName;
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1812764903) {
                        if (hashCode != -1403948337) {
                            if (hashCode == 2110357576 && str.equals("cta_add_friends") && (mVar = profileComponents2.bizData) != null) {
                                mVar.LJJJ("maf_count");
                                mVar.LJJIIJ("maf_count", Integer.valueOf(user2.mafRedCount));
                            }
                        } else if (str.equals("cta_social_interaction") && !booleanValue && (mVar2 = profileComponents2.bizData) != null) {
                            mVar2.LJJJ("can_message_follow_status_list");
                            g gVar = new g();
                            List<Integer> canMessageFollowStatusList = user2.getCanMessageFollowStatusList();
                            if (canMessageFollowStatusList != null) {
                                Iterator<Integer> it = canMessageFollowStatusList.iterator();
                                while (it.hasNext()) {
                                    gVar.LJJIII(it.next());
                                }
                            }
                            mVar2.LJJII("can_message_follow_status_list", gVar);
                            mVar2.LJJJ("show_messaging_entrance_on_profile");
                            mVar2.LJJIII(Boolean.valueOf(user2.isShowMessageEntrance), "show_messaging_entrance_on_profile");
                        }
                    } else if (str.equals("cta_social_entrance") && (mVar3 = profileComponents2.bizData) != null) {
                        m mVar4 = new m();
                        if (!TextUtils.isEmpty(user2.getInsId())) {
                            mVar4.LJJIIZ("ins_id", user2.getInsId());
                        }
                        if (!TextUtils.isEmpty(user2.getYoutubeChannelId())) {
                            mVar4.LJJIIZ("youtube_channel_id", user2.getYoutubeChannelId());
                        }
                        if (!TextUtils.isEmpty(user2.getYoutubeChannelTitle())) {
                            mVar4.LJJIIZ("youtube_channel_title", user2.getYoutubeChannelTitle());
                        }
                        if (!TextUtils.isEmpty(user2.getTwitterId())) {
                            mVar4.LJJIIZ("twitter_id", user2.getTwitterId());
                        }
                        if (!TextUtils.isEmpty(user2.getTwitterName())) {
                            mVar4.LJJIIZ("twitter_name", user2.getTwitterName());
                        }
                        mVar3.LJJJ("social_connect");
                        mVar3.LJJII("social_connect", mVar4);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
