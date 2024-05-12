package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SystemNoticeData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SystemNoticeResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UnsubscribeSettingMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MOH extends AbstractC51036K1g<SystemNoticeData, SystemNoticeResponse> {
    public int LJLJI;
    public int LJLJJI;
    public boolean LJLJJLL;
    public boolean LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public boolean LJLLI;
    public SystemNoticeData LJLLJ;
    public UnsubscribeSettingMetadata LJLLLLLL;
    public List<GroupUnsubscribeSetting> LJLZ;
    public String LJLIL = "";
    public int LJLILLLLZI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LJLJJL = "all";
    public final List<SystemNoticeData> LJLJL = new ArrayList();
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(MON.LJLIL);
    public final List<C56732MOi> LJLLL = new ArrayList();
    public final MutableLiveData<Boolean> LJLLLL = new MutableLiveData<>();

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    public final void LJIIIZ() {
        List<NoticeChannelInfo> channelList;
        this.LJLLLL.postValue(Boolean.FALSE);
        SystemNoticeData systemNoticeData = this.LJLLJ;
        if (systemNoticeData != null && (channelList = systemNoticeData.getChannelList()) != null) {
            Iterator<NoticeChannelInfo> it = channelList.iterator();
            while (it.hasNext()) {
                it.next().hasRead = true;
            }
        }
    }

    public final String LJIIJ() {
        if (this.LJLJJLL) {
            return "official_account_page";
        }
        return "official_message_mix";
    }

    @Override // X.AbstractC51036K1g
    public final List<SystemNoticeData> getItems() {
        return this.LJLJL;
    }

    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        return this.LJLJLJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        boolean z;
        boolean z2;
        List<GroupUnsubscribeSetting> list;
        SystemNoticeData systemNoticeData;
        List<NoticeChannelInfo> channelList;
        NoticeItems noticeItem;
        List<MusNotice> items;
        SystemNoticeResponse systemNoticeResponse = (SystemNoticeResponse) obj;
        super.handleData(systemNoticeResponse);
        int i = 1;
        boolean z3 = false;
        if (systemNoticeResponse != null && (noticeItem = systemNoticeResponse.getNoticeItem()) != null && (items = noticeItem.getItems()) != null && (!items.isEmpty())) {
            z = false;
        } else {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        if (systemNoticeResponse == null) {
            return;
        }
        NoticeItems noticeItem2 = systemNoticeResponse.getNoticeItem();
        if (noticeItem2 != null) {
            z2 = noticeItem2.getHasMore();
        } else {
            z2 = false;
        }
        this.LJLJLJ = z2;
        MusNotice musNotice = null;
        if (this.mListQueryType == 1) {
            ((ArrayList) this.LJLJL).clear();
            List<NoticeChannelInfo> channelList2 = systemNoticeResponse.getChannelList();
            if (channelList2 != null) {
                this.LJLLJ = new SystemNoticeData(musNotice, ORZ.LLILII(new MOJ(new MOJ(new MOM(), new MOK()), new MOL()), channelList2), i, null == true ? 1 : 0);
                ((ArrayList) this.LJLLL).clear();
                SystemNoticeData systemNoticeData2 = this.LJLLJ;
                if (systemNoticeData2 != null && (channelList = systemNoticeData2.getChannelList()) != null) {
                    boolean z4 = false;
                    for (NoticeChannelInfo channelInfo : channelList) {
                        List<C56732MOi> list2 = this.LJLLL;
                        o.LJIIIZ(channelInfo, "channelInfo");
                        ((ArrayList) list2).add(new C56732MOi(channelInfo.group, 0, 0, 0, 0, 0, LiveLayoutPreloadThreadPriority.DEFAULT, channelInfo));
                        if (!channelInfo.hasRead) {
                            z4 = true;
                        }
                    }
                    z3 = z4;
                }
                if (!o.LJ(this.LJLLLL.getValue(), Boolean.valueOf(z3))) {
                    this.LJLLLL.postValue(Boolean.valueOf(z3));
                }
            }
            if (!this.LJLJJLL && !C53363Kwx.LIZIZ() && (systemNoticeData = this.LJLLJ) != null) {
                ((ArrayList) this.LJLJL).add(systemNoticeData);
            }
            this.LJLLLLLL = systemNoticeResponse.getUnsubscribeSetting();
            List<GroupUnsubscribeSetting> groupUnsubscribeSettings = systemNoticeResponse.getGroupUnsubscribeSettings();
            if (groupUnsubscribeSettings != null) {
                list = ORZ.LLJILJILJ(groupUnsubscribeSettings);
            } else {
                list = null;
            }
            this.LJLZ = list;
            if (!this.LJLJJLL) {
                MDJ.LIZ = list;
            }
        }
        NoticeItems noticeItem3 = systemNoticeResponse.getNoticeItem();
        if (noticeItem3 == null) {
            return;
        }
        List<MusNotice> items2 = noticeItem3.getItems();
        if (items2 != null) {
            Iterator<MusNotice> it = items2.iterator();
            while (it.hasNext()) {
                ((ArrayList) this.LJLJL).add(new SystemNoticeData(it.next(), null == true ? 1 : 0, 2, null == true ? 1 : 0));
            }
        }
        this.LJLJLLL = noticeItem3.getMaxTime();
        this.LJLL = noticeItem3.getMinTime();
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        int i = 0;
        String group = C75792yF.LIZJ(new MultiNotice(this.LJLJI, this.LJLJLLL, this.LJLL, i, i, 24, null));
        o.LJIIIIZZ(group, "group");
        FGR.LIZIZ().LIZ(this.mHandler, new MOI(group, 0, null), 1001);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        int i;
        o.LJIIIZ(params, "params");
        ((CopyOnWriteArraySet) this.LJLLILLLL.getValue()).clear();
        long j = 0;
        int i2 = 0;
        String group = C75792yF.LIZJ(new MultiNotice(this.LJLJI, j, j, i2, i2, 30, null));
        g gVar = new g();
        if (C53371Kx5.LIZIZ()) {
            m mVar = new m();
            mVar.LJJIIZ("key", "system_notice_unsubscribe_experiment");
            mVar.LJJIIZ("value", "1");
            gVar.LJJII(mVar);
        }
        if (((Boolean) C53371Kx5.LIZIZ.getValue()).booleanValue() && !this.LJLJJLL) {
            m mVar2 = new m();
            mVar2.LJJIIZ("key", "need_unsubscribe_settings");
            mVar2.LJJIIZ("value", "1");
            gVar.LJJII(mVar2);
        } else if (((Boolean) C53371Kx5.LIZJ.getValue()).booleanValue()) {
            if (this.LJLJJLL) {
                m mVar3 = new m();
                mVar3.LJJIIZ("key", "need_unsubscribe_settings");
                mVar3.LJJIIZ("value", "2");
                gVar.LJJII(mVar3);
            } else {
                m mVar4 = new m();
                mVar4.LJJIIZ("key", "need_empty_notice_channel_info");
                mVar4.LJJIIZ("value", "1");
                gVar.LJJII(mVar4);
            }
        }
        boolean z = C54316LTk.LIZIZ;
        if (z) {
            m mVar5 = new m();
            mVar5.LJJIIZ("key", "inbox_tts_entrance_v3");
            mVar5.LJJIIZ("value", "1");
            gVar.LJJII(mVar5);
        }
        o.LJIIIIZZ(group, "group");
        if (this.LJLJJLL) {
            i = 0;
        } else if (C53363Kwx.LIZIZ()) {
            i = 2;
        } else {
            i = 1;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new MOI(group, i, gVar.toString()), 1001);
        if (z) {
            C54262LRi c54262LRi = new C54262LRi(-99999);
            c54262LRi.LIZLLL(-999999, -1);
            c54262LRi.post();
        }
    }
}
