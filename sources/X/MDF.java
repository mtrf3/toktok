package X;

import Y.ARunnableS2S1100000_1;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import com.ss.android.ugc.aweme.notification.bean.UnSubscribeSettingsData;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class MDF extends TBS implements InterfaceC88473Ynt<Integer, Integer, Boolean, C76800UCe> {
    public MDF(C56818MRq c56818MRq) {
        super(3, c56818MRq, C56818MRq.class, "onUnsubscribeSuccess", "onUnsubscribeSuccess(IIZ)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Integer num, Integer num2, Boolean bool) {
        int i;
        String str;
        String str2;
        Integer num3;
        GroupUnsubscribeSetting groupUnsubscribeSetting;
        NoticeChannelInfo noticeChannelInfo;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        boolean booleanValue = bool.booleanValue();
        C56818MRq c56818MRq = (C56818MRq) this.receiver;
        c56818MRq.getClass();
        if (booleanValue) {
            i = R.string.ijj;
        } else {
            i = R.string.ijk;
        }
        C26045AKb c26045AKb = new C26045AKb(c56818MRq.LJLIL);
        c26045AKb.LJIIIIZZ(i);
        c26045AKb.LJIIJ();
        if (booleanValue) {
            str = "system_notification_unsubscribe_toast";
        } else {
            str = "system_notification_resubscribe_toast";
        }
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("enter_from", "notification_page");
        oszArr[1] = new OSZ("category_type", String.valueOf(intValue2));
        MusNotice musNotice = c56818MRq.LJLJJL;
        if (musNotice == null || (noticeChannelInfo = musNotice.channelInfo) == null || (str2 = noticeChannelInfo.accountType) == null) {
            str2 = "";
        }
        oszArr[2] = new OSZ("account_type", str2);
        FMX.LIZIZ().execute(new ARunnableS2S1100000_1(C113554cx.LJJLIIIIJ(oszArr), str, 7));
        List<GroupUnsubscribeSetting> list = c56818MRq.LJLILLLLZI.LJLZ;
        if (list == null) {
            list = MDJ.LIZ;
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("onUnsubscribeSuccess group = ", intValue, ", category = ", intValue2, ", isUnsubscribe = ");
        LIZJ.append(booleanValue);
        LIZJ.append(", settings = ");
        Integer num4 = null;
        if (list != null) {
            num3 = Integer.valueOf(list.size());
        } else {
            num3 = null;
        }
        LIZJ.append(num3);
        C221018lt.LJFF("NoticeCardAdapter", X1D.LIZIZ(LIZJ));
        if (list != null) {
            Iterator<GroupUnsubscribeSetting> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    groupUnsubscribeSetting = it.next();
                    if (groupUnsubscribeSetting.group == intValue) {
                        break;
                    }
                } else {
                    groupUnsubscribeSetting = null;
                    break;
                }
            }
            GroupUnsubscribeSetting groupUnsubscribeSetting2 = groupUnsubscribeSetting;
            if (groupUnsubscribeSetting2 != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onUnsubscribeSuccess find group = ");
                LIZ.append(groupUnsubscribeSetting2.group);
                LIZ.append(", categoryList = ");
                List<UnSubscribeSettingsData> list2 = groupUnsubscribeSetting2.unsubscribeCategoryList;
                if (list2 != null) {
                    num4 = Integer.valueOf(list2.size());
                }
                LIZ.append(num4);
                LIZ.append('}');
                C221018lt.LJFF("NoticeCardAdapter", X1D.LIZIZ(LIZ));
                List<UnSubscribeSettingsData> list3 = groupUnsubscribeSetting2.unsubscribeCategoryList;
                if (list3 != null) {
                    Iterator<UnSubscribeSettingsData> it2 = list3.iterator();
                    int i2 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            Integer num5 = it2.next().label;
                            if (num5 != null && num5.intValue() == intValue2) {
                                break;
                            }
                            i2++;
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    StringBuilder LJ = C7MY.LJ("index = ", i2, ", size = ");
                    LJ.append(list3.size());
                    C221018lt.LJFF("NoticeCardAdapter", X1D.LIZIZ(LJ));
                    if (i2 >= 0) {
                        UnSubscribeSettingsData unSubscribeSettingsData = (UnSubscribeSettingsData) ListProtector.get(list3, i2);
                        StringBuilder LIZJ2 = C06460Ne.LIZJ("update unsubscribe data group = ", intValue, ", category = ", intValue2, ", isUnsubscribe = ");
                        LIZJ2.append(booleanValue);
                        LIZJ2.append(", oldUnsubscribe = ");
                        LIZJ2.append(unSubscribeSettingsData.isUnsubscribe);
                        C221018lt.LJFF("NoticeCardAdapter", X1D.LIZIZ(LIZJ2));
                        ListProtector.set(list3, i2, UnSubscribeSettingsData.LIZ(unSubscribeSettingsData, booleanValue));
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
