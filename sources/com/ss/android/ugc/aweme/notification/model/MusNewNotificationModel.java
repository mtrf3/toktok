package com.ss.android.ugc.aweme.notification.model;

import X.AbstractC118224kU;
import X.AbstractC51036K1g;
import X.C10I;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C32I;
import X.C38333F2r;
import X.C3C5;
import X.C40675Fxn;
import X.C46604IQu;
import X.C56702MNe;
import X.C56760MPk;
import X.C57053MaH;
import X.C66851QLn;
import X.C76800UCe;
import X.C78842Uww;
import X.C79004UzY;
import X.C8BT;
import X.MOU;
import X.ORZ;
import android.os.Message;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UnsubscribeSettingMetadata;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MusNewNotificationModel extends AbstractC51036K1g<MusNotice, MessageResponse> {
    public String lastGroupApiLogId;
    public boolean mHasMore;
    public long mLastReadTime;
    public long mMaxTime;
    public long mMinTime;
    public int mTotal;
    public UnsubscribeSettingMetadata unsubscribeSetting;
    public int currentType = C56702MNe.LIZ;
    public final Map<Integer, List<MusNotice>> mDataMap = new LinkedHashMap();
    public final MutableLiveData<NoticeCombineDatas> liveData = new MutableLiveData<>();
    public final MutableLiveData<LiveNoticeMessageResponse> updateLiveData = new MutableLiveData<>();
    public final List<NoticeItems> collapseNotices = new ArrayList();

    @Override // X.AbstractC51036K1g
    public List<MusNotice> getItems() {
        return getItemsFromGroup(this.currentType);
    }

    public final void startFetchLive() {
        if (!C46604IQu.LJ()) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            MusNotificationApiManager.LJFF().LJIILL(new C10I() { // from class: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$startFetchLive$1
                /* renamed from: then, reason: collision with other method in class */
                public final void m146then(C10K<LiveNoticeMessageResponse> c10k) {
                    MusNewNotificationModel.this.updateLiveData.postValue(c10k.LJIIJJI());
                    C56760MPk.LJI(c10k.LJIIJJI(), SystemClock.elapsedRealtime() - elapsedRealtime);
                }

                @Override // X.C10I
                public /* bridge */ /* synthetic */ Object then(C10K c10k) {
                    m146then((C10K<LiveNoticeMessageResponse>) c10k);
                    return C76800UCe.LIZ;
                }
            });
        }
    }

    @Override // X.AbstractC51036K1g
    public boolean isHasMore() {
        return this.mHasMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleCombineResponse(Message message) {
        BaseNotice baseNotice;
        List<NoticeItems> notices;
        if (message == null) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof NoticeListsResponse) {
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse");
            NoticeListsResponse noticeListsResponse = (NoticeListsResponse) obj;
            List<NoticeItems> list = this.collapseNotices;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<NoticeItems> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().getGroup()));
            }
            List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
            List<NoticeItems> collapseNotices = noticeListsResponse.getCollapseNotices();
            if (collapseNotices != null) {
                ArrayList arrayList2 = new ArrayList();
                for (NoticeItems noticeItems : collapseNotices) {
                    if (!((ArrayList) LLJILJILJ).contains(Integer.valueOf(noticeItems.getGroup()))) {
                        arrayList2.add(noticeItems);
                    }
                }
                this.collapseNotices.addAll(arrayList2);
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((NoticeItems) it2.next()).getGroup()));
                }
                ((ArrayList) LLJILJILJ).addAll(arrayList3);
            }
            int i = message.what;
            NoticeItems noticeItems2 = null;
            if (i == C56702MNe.LIZ) {
                if (this.mListQueryType == 1 && (notices = noticeListsResponse.getNotices()) != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (NoticeItems noticeItems3 : notices) {
                        if (noticeItems3.getGroup() != C56702MNe.LIZ) {
                            arrayList4.add(noticeItems3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (!((ArrayList) LLJILJILJ).contains(Integer.valueOf(((NoticeItems) next).getGroup()))) {
                            arrayList5.add(next);
                        }
                    }
                    this.collapseNotices.addAll(arrayList5);
                }
                List<NoticeItems> notices2 = noticeListsResponse.getNotices();
                if (notices2 != null) {
                    Iterator<NoticeItems> it4 = notices2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        NoticeItems next2 = it4.next();
                        if (next2.getGroup() == message.what) {
                            noticeItems2 = next2;
                            break;
                        }
                    }
                    noticeItems2 = noticeItems2;
                }
            } else if (i == 37) {
                ArrayList arrayList6 = new ArrayList();
                List<NoticeItems> notices3 = noticeListsResponse.getNotices();
                if (notices3 != null) {
                    for (NoticeItems noticeItems4 : notices3) {
                        List<MusNotice> items = noticeItems4.getItems();
                        if (items != null && (baseNotice = (BaseNotice) ORZ.LJLLLL(items)) != null) {
                            arrayList6.add(baseNotice);
                            GeneralTemplateNotice generalTemplateNotice = baseNotice.templateNotice;
                            if (generalTemplateNotice != null) {
                                generalTemplateNotice.LIZ = noticeItems4.getGroup();
                            }
                        }
                    }
                }
                long j = 0;
                noticeItems2 = new NoticeItems(arrayList6, false, 0 == true ? 1 : 0, j, j, j, message.what, 0 == true ? 1 : 0, j, 446, null);
            } else {
                List<NoticeItems> notices4 = noticeListsResponse.getNotices();
                if (notices4 != null) {
                    Iterator<NoticeItems> it5 = notices4.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        NoticeItems next3 = it5.next();
                        if (next3.getGroup() == message.what) {
                            noticeItems2 = next3;
                            break;
                        }
                    }
                    noticeItems2 = noticeItems2;
                }
            }
            message.obj = new MessageResponse(new MessageItem(noticeItems2), noticeListsResponse.getLobPb());
            this.unsubscribeSetting = noticeListsResponse.getUnsubscribeSetting();
        }
    }

    private final void handleExtractLogId(Message message) {
        this.lastGroupApiLogId = null;
        Object obj = message.obj;
        try {
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
            this.lastGroupApiLogId = ((BaseResponse) obj).extra.logid;
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        Object obj2 = message.obj;
        try {
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
            Object rawResponse = ((C38333F2r) obj2).getRawResponse();
            o.LJII(rawResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
            this.lastGroupApiLogId = ((BaseResponse) rawResponse).extra.logid;
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
    }

    private final void sortByTime(List<MusNotice> list) {
        if (C79004UzY.LJJIFFI(list)) {
            return;
        }
        C40675Fxn.LJJLIIIJ(list, new Comparator() { // from class: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$sortByTime$1
            @Override // java.util.Comparator
            public final int compare(MusNotice musNotice, MusNotice musNotice2) {
                long j = musNotice2.createTime - musNotice.createTime;
                if (j > 0) {
                    return 1;
                }
                if (j < 0) {
                    return -1;
                }
                return 0;
            }
        });
    }

    private final void tryChangePositionForce(int i) {
        List<MusNotice> itemsFromGroup;
        Integer num;
        if (i != C56702MNe.LIZ || (itemsFromGroup = getItemsFromGroup(i)) == null || itemsFromGroup.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = C78842Uww.LJIILLIIL(itemsFromGroup.size() - 1, 0).iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC118224kU) it).nextInt();
            if (((BaseNotice) ListProtector.get(itemsFromGroup, nextInt)).needForceInsert()) {
                arrayList.add(ListProtector.get(itemsFromGroup, nextInt));
                ListProtector.remove(itemsFromGroup, nextInt);
            }
        }
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new Comparator() { // from class: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$tryChangePositionForce$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C66851QLn.LJFF(Integer.valueOf(((BaseNotice) t).lowestPosition), Integer.valueOf(((BaseNotice) t2).lowestPosition));
                }
            });
        }
        Iterator<Integer> it2 = C78842Uww.LJJ(0, arrayList.size()).iterator();
        while (it2.hasNext()) {
            BaseNotice baseNotice = (BaseNotice) ListProtector.get(arrayList, ((AbstractC118224kU) it2).nextInt());
            int min = Math.min(baseNotice.lowestPosition - 1, itemsFromGroup.size());
            Iterator<Integer> it3 = C78842Uww.LJJ(0, min).iterator();
            while (true) {
                if (it3.hasNext()) {
                    num = it3.next();
                    int intValue = num.intValue();
                    if (((BaseNotice) ListProtector.get(itemsFromGroup, intValue)).lowestPosition == 0 && ((BaseNotice) ListProtector.get(itemsFromGroup, intValue)).createTime < baseNotice.createTime) {
                        break;
                    }
                } else {
                    num = null;
                    break;
                }
            }
            Integer num2 = num;
            if (num2 != null) {
                min = num2.intValue();
            }
            ListProtector.add(itemsFromGroup, min, baseNotice);
        }
    }

    @Override // X.C8BS
    public boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length <= 5) {
            return true;
        }
        return false;
    }

    public final List<MusNotice> getItemsFromGroup(int i) {
        List<MusNotice> list = this.mDataMap.get(Integer.valueOf(i));
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.mDataMap.put(Integer.valueOf(i), arrayList);
            return arrayList;
        }
        return list;
    }

    @Override // X.C8BS, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        BaseResponse baseResponse;
        String str;
        Exception exc;
        this.mIsLoading = false;
        if (message == null) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof BaseResponse) {
            baseResponse = (BaseResponse) obj;
        } else {
            baseResponse = null;
        }
        C57053MaH.LIZJ(baseResponse);
        handleExtractLogId(message);
        Object obj2 = message.obj;
        if (obj2 instanceof Exception) {
            o.LJII(obj2, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
            C16880lQ.LLLLIIL((Exception) obj2);
            List<C8BT> list = this.mNotifyListeners;
            if (list != null) {
                for (C8BT c8bt : list) {
                    Object obj3 = message.obj;
                    o.LJII(obj3, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
                    c8bt.onFailed((Exception) obj3);
                }
            }
            MOU.LIZIZ(message.what, null, message.obj.toString());
            return;
        }
        int i = message.what;
        Long l = MOU.LIZJ;
        if (l != null) {
            MOU.LIZ(Integer.valueOf(i), System.currentTimeMillis() - l.longValue(), "notice_type_list_net");
        }
        MOU.LIZJ = null;
        handleCombineResponse(message);
        Object obj4 = message.obj;
        if (!(obj4 instanceof MessageResponse)) {
            List<C8BT> list2 = this.mNotifyListeners;
            if (list2 != null) {
                for (C8BT c8bt2 : list2) {
                    Object obj5 = message.obj;
                    if (obj5 instanceof Exception) {
                        exc = (Exception) obj5;
                    } else {
                        exc = null;
                    }
                    c8bt2.onFailed(exc);
                }
            }
            int i2 = message.what;
            Object obj6 = message.obj;
            if (obj6 != null) {
                str = obj6.toString();
            } else {
                str = null;
            }
            MOU.LIZIZ(i2, null, str);
            return;
        }
        if (message.what == this.currentType) {
            o.LJII(obj4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse");
            handleData((MessageResponse) obj4, message.what, true);
            List<C8BT> list3 = this.mNotifyListeners;
            if (list3 != null) {
                Iterator<C8BT> it = list3.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess();
                }
                return;
            }
            return;
        }
        o.LJII(obj4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse");
        handleData((MessageResponse) obj4, message.what, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0047, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r6, java.lang.Boolean.TRUE) != false) goto L8;
     */
    @Override // X.AbstractC51036K1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadMoreList(java.lang.Object... r19) {
        /*
            r18 = this;
            java.lang.String r0 = "params"
            r2 = r19
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.MOU.LIZJ = r0
            r1 = 1
            r3 = r2[r1]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.o.LJII(r3, r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r9 = r3.intValue()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice r8 = new com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice
            r4 = r18
            long r10 = r4.mMaxTime
            long r12 = r4.mMinTime
            r14 = 0
            r16 = 24
            r17 = 0
            r15 = r14
            r8.<init>(r9, r10, r12, r14, r15, r16, r17)
            int r0 = r2.length
            r5 = 0
            r7 = 4
            if (r0 < r7) goto L73
            r0 = 3
            r6 = r2[r0]
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L70
        L41:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            if (r0 == 0) goto L73
        L49:
            r8.mayWithMergedTTShopArg(r1)
            r3.add(r8)
            int r1 = r2.length
            r0 = 5
            if (r1 < r0) goto L61
            r1 = r2[r7]
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L61
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L61
            int r5 = r1.intValue()
        L61:
            X.FGR r2 = X.FGR.LIZIZ()
            com.bytedance.common.utility.collection.WeakHandler r1 = r4.mHandler
            com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$loadMoreList$1 r0 = new com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$loadMoreList$1
            r0.<init>()
            r2.LIZ(r1, r0, r9)
            return
        L70:
            r6 = r17
            goto L41
        L73:
            r1 = 0
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel.loadMoreList(java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, java.lang.Boolean.TRUE) != false) goto L8;
     */
    @Override // X.AbstractC51036K1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void refreshList(java.lang.Object... r18) {
        /*
            r17 = this;
            java.lang.String r0 = "params"
            r2 = r18
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.MOU.LIZJ = r0
            r5 = 1
            r1 = r2[r5]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.o.LJII(r1, r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r8 = r1.intValue()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice r7 = new com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice
            r9 = 0
            r13 = 0
            r15 = 30
            r16 = 0
            r11 = r9
            r14 = r13
            r7.<init>(r8, r9, r11, r13, r14, r15, r16)
            int r0 = r2.length
            r4 = 0
            r6 = 4
            if (r0 < r6) goto L72
            r0 = 3
            r1 = r2[r0]
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L6f
        L3e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L72
        L46:
            r7.mayWithMergedTTShopArg(r5)
            r3.add(r7)
            int r1 = r2.length
            r0 = 5
            if (r1 < r0) goto L5e
            r1 = r2[r6]
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L5e
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L5e
            int r4 = r1.intValue()
        L5e:
            X.FGR r2 = X.FGR.LIZIZ()
            r5 = r17
            com.bytedance.common.utility.collection.WeakHandler r1 = r5.mHandler
            com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$refreshList$1 r0 = new com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$refreshList$1
            r0.<init>()
            r2.LIZ(r1, r0, r8)
            return
        L6f:
            r1 = r16
            goto L3e
        L72:
            r5 = 0
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel.refreshList(java.lang.Object[]):void");
    }

    public final void setCurrentNoticeGroup(int i) {
        this.collapseNotices.clear();
        this.currentType = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleCombineData(int i, NoticeItems noticeItems, List<MusNotice> list) {
        BaseNotice baseNotice;
        BaseNotice baseNotice2;
        if (noticeItems == null || !noticeItems.getHasMore()) {
            for (NoticeItems noticeItems2 : this.collapseNotices) {
                List<MusNotice> items = noticeItems2.getItems();
                if (items != null && (baseNotice = (BaseNotice) ORZ.LJLLLL(items)) != null) {
                    list.add(baseNotice);
                    baseNotice.noticeListType = noticeItems2.getListType();
                    GeneralTemplateNotice generalTemplateNotice = baseNotice.templateNotice;
                    if (generalTemplateNotice != null) {
                        generalTemplateNotice.LIZ = noticeItems2.getGroup();
                    }
                }
            }
            this.collapseNotices.clear();
            return;
        }
        Iterator<NoticeItems> it = this.collapseNotices.iterator();
        while (it.hasNext()) {
            NoticeItems next = it.next();
            List<MusNotice> items2 = next.getItems();
            if (items2 != null && (baseNotice2 = (BaseNotice) ORZ.LJLLLL(items2)) != null && (baseNotice2.createTime >= noticeItems.getMaxTime() || (next.getListType() == 2 && !baseNotice2.hasRead))) {
                list.add(baseNotice2);
                baseNotice2.noticeListType = next.getListType();
                GeneralTemplateNotice generalTemplateNotice2 = baseNotice2.templateNotice;
                if (generalTemplateNotice2 != null) {
                    generalTemplateNotice2.LIZ = next.getGroup();
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void handleData(MessageResponse messageResponse, int i, boolean z) {
        String str;
        String str2;
        LogPbBean mLogPbBean;
        MessageItem item;
        boolean z2;
        NoticeItems notices;
        List<MusNotice> items;
        NoticeItems notices2;
        NoticeItems notices3;
        LogPbBean mLogPbBean2;
        MessageItem item2;
        NoticeItems notices4;
        List<MusNotice> items2;
        long j;
        NoticeItems notices5;
        NoticeItems notices6;
        NoticeItems notices7;
        LogPbBean mLogPbBean3;
        NoticeItems noticeItems = null;
        r2 = null;
        String str3 = null;
        NoticeItems noticeItems2 = null;
        r2 = null;
        String str4 = null;
        if (messageResponse == null || messageResponse.status_code != 0) {
            if (messageResponse != null && (mLogPbBean = messageResponse.getMLogPbBean()) != null) {
                str = mLogPbBean.getImprId();
            } else {
                str = null;
                if (messageResponse == null) {
                    str2 = null;
                    MOU.LIZIZ(i, str, str2);
                }
            }
            str2 = messageResponse.status_msg;
            MOU.LIZIZ(i, str, str2);
        }
        if (messageResponse == null) {
            List<NoticeItems> list = this.collapseNotices;
            if (list == null || list.isEmpty()) {
                this.mIsNewDataEmpty = true;
                return;
            }
            item = null;
        } else {
            item = messageResponse.getItem();
        }
        List<NoticeItems> list2 = this.collapseNotices;
        if ((list2 == null || list2.isEmpty()) && (item == null || (notices = item.getNotices()) == null || (items = notices.getItems()) == null || items.isEmpty())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mIsNewDataEmpty = z2;
        int i2 = this.mListQueryType;
        if (i2 == 1) {
            if (z2) {
                if (item != null && (notices7 = item.getNotices()) != null && notices7.getHasMore()) {
                    if (messageResponse != null && (mLogPbBean3 = messageResponse.getMLogPbBean()) != null) {
                        str3 = mLogPbBean3.getImprId();
                    }
                    MOU.LIZIZ(i, str3, "hasMore = true but data is Empty");
                }
                getItemsFromGroup(i).clear();
                return;
            }
            List<MusNotice> itemsFromGroup = getItemsFromGroup(i);
            if (item != null && (notices6 = item.getNotices()) != null) {
                j = notices6.getLastReadTime();
            } else {
                j = 0;
            }
            this.mLastReadTime = j;
            itemsFromGroup.clear();
            if (item != null) {
                noticeItems2 = item.getNotices();
            }
            handleCombineData(i, noticeItems2, itemsFromGroup);
            if (item != null && (notices5 = item.getNotices()) != null) {
                Iterator it = getItems().iterator();
                while (it.hasNext()) {
                    ((BaseNotice) it.next()).lastReadTime = this.mLastReadTime;
                }
                if (z) {
                    this.mHasMore = notices5.getHasMore();
                    this.mMaxTime = notices5.getMaxTime();
                    this.mMinTime = notices5.getMinTime();
                    this.mTotal = notices5.getTotal();
                }
                Collection<? extends MusNotice> items3 = notices5.getItems();
                if (items3 != null) {
                    itemsFromGroup.addAll(items3);
                }
            }
            Iterator<MusNotice> it2 = itemsFromGroup.iterator();
            while (it2.hasNext()) {
                it2.next().lastReadTime = this.mLastReadTime;
            }
        } else if (i2 == 4) {
            if (z2) {
                if (item != null && (notices3 = item.getNotices()) != null && notices3.getHasMore()) {
                    if (messageResponse != null && (mLogPbBean2 = messageResponse.getMLogPbBean()) != null) {
                        str4 = mLogPbBean2.getImprId();
                    }
                    MOU.LIZIZ(i, str4, "hasMore = true but data is Empty");
                }
                if (z) {
                    this.mHasMore = false;
                    return;
                }
                return;
            }
            List<MusNotice> itemsFromGroup2 = getItemsFromGroup(i);
            if (item != null) {
                noticeItems = item.getNotices();
            }
            handleCombineData(i, noticeItems, itemsFromGroup2);
            if (item != null && (notices2 = item.getNotices()) != null) {
                if (z) {
                    this.mHasMore = notices2.getHasMore();
                    this.mMaxTime = notices2.getMaxTime();
                    this.mMinTime = notices2.getMinTime();
                    this.mTotal = notices2.getTotal();
                }
                Iterator it3 = getItems().iterator();
                while (it3.hasNext()) {
                    ((BaseNotice) it3.next()).lastReadTime = this.mLastReadTime;
                }
                List<MusNotice> items4 = notices2.getItems();
                if (items4 != null) {
                    if (i == C56702MNe.LIZ) {
                        ArrayList arrayList = new ArrayList();
                        for (MusNotice musNotice : items4) {
                            MusNotice musNotice2 = musNotice;
                            if (!(itemsFromGroup2 instanceof Collection) || !itemsFromGroup2.isEmpty()) {
                                Iterator it4 = itemsFromGroup2.iterator();
                                while (it4.hasNext()) {
                                    if (o.LJ(((BaseNotice) it4.next()).nid, musNotice2.nid)) {
                                        break;
                                    }
                                }
                            }
                            arrayList.add(musNotice);
                        }
                        Iterator it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            BaseNotice baseNotice = (BaseNotice) it5.next();
                            int i3 = baseNotice.type;
                            if (i3 == 1 || i3 == 2) {
                                Iterator it6 = itemsFromGroup2.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        if (baseNotice.type == ((BaseNotice) it6.next()).type) {
                                            break;
                                        }
                                    } else {
                                        itemsFromGroup2.add(baseNotice);
                                        break;
                                    }
                                }
                            } else {
                                itemsFromGroup2.add(baseNotice);
                            }
                        }
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (MusNotice musNotice3 : items4) {
                            MusNotice musNotice4 = musNotice3;
                            if (!(itemsFromGroup2 instanceof Collection) || !itemsFromGroup2.isEmpty()) {
                                Iterator it7 = itemsFromGroup2.iterator();
                                while (it7.hasNext()) {
                                    if (o.LJ(((BaseNotice) it7.next()).nid, musNotice4.nid)) {
                                        break;
                                    }
                                }
                            }
                            arrayList2.add(musNotice3);
                        }
                        Iterator it8 = arrayList2.iterator();
                        while (it8.hasNext()) {
                            itemsFromGroup2.add(it8.next());
                        }
                    }
                }
            }
        }
        if (messageResponse != null && (item2 = messageResponse.getItem()) != null && (notices4 = item2.getNotices()) != null && (items2 = notices4.getItems()) != null) {
            Iterator<MusNotice> it9 = items2.iterator();
            while (it9.hasNext()) {
                it9.next().logPbBean = messageResponse.getMLogPbBean();
            }
        }
        sortByTime(getItemsFromGroup(i));
    }
}
