package com.ss.android.ugc.aweme.notification.creator.vm;

import X.C221108m2;
import X.C33R;
import X.C33X;
import X.C62822Ol8;
import X.C78613UtF;
import X.MQ2;
import X.MT7;
import X.MT8;
import X.MT9;
import X.MTD;
import X.MTG;
import X.MTK;
import X.MTN;
import X.MTQ;
import X.MU6;
import X.XKX;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorNoticeTabVM extends AssemViewModel<MT8> {
    public List<NoticeTabModel> LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(MU6.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final MT8 defaultState() {
        return new MT8(null, 0, C33X.LIZ, null, MQ2.SUCCESS);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((LinkedHashMap) MTD.LIZIZ).clear();
        C33R c33r = (C33R) MTD.LIZJ.getValue();
        C33X c33x = C33X.LIZ;
        c33r.setValue(c33x);
        MTD.LIZLLL = c33x;
    }

    public final void gv0(MT7 requestType) {
        o.LJIIIZ(requestType, "requestType");
        setState(MTQ.LJLIL);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C78613UtF.LIZJ, null, new MTG(requestType, this, null), 2);
    }

    public final void hv0(MTK mtk) {
        List<NoticeTabModel> list;
        ArrayList arrayList;
        int type;
        int i;
        int i2;
        int i3;
        MTK tabListResult = mtk;
        o.LJIIIZ(tabListResult, "tabListResult");
        List<NoticeTabModel> list2 = this.LJLIL;
        boolean z = true;
        if (list2 != null && !list2.isEmpty() && (list = tabListResult.LIZJ) != null && list2.size() == list.size()) {
            List<NoticeTabModel> list3 = tabListResult.LIZJ;
            if (list3 != null) {
                switch (MT9.LIZ[tabListResult.LIZ.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        type = MTN.CHANGE_WALL_TIME.getType() | MTN.CHANGE_UNREAD_COUNT.getType() | MTN.CHANGE_LAST_READ_TIME.getType();
                        break;
                    case 4:
                        type = MTN.CHANGE_UNREAD_COUNT_DECREASE.getType();
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        type = MTN.NO_CHANGE.getType();
                        break;
                    default:
                        type = MTN.NO_CHANGE.getType();
                        break;
                }
                int i4 = tabListResult.LIZIZ;
                MT7 mt7 = tabListResult.LIZ;
                if (mt7 != MT7.FIRST_REQUEST && mt7 != MT7.REFRESH_ALL) {
                    z = false;
                }
                arrayList = new ArrayList();
                int size = list3.size();
                for (int i5 = 0; i5 < size; i5++) {
                    NoticeTabModel noticeTabModel = (NoticeTabModel) ListProtector.get(list3, i5);
                    NoticeTabModel noticeTabModel2 = (NoticeTabModel) ListProtector.get(list2, i5);
                    if (z || noticeTabModel.tabId == i4) {
                        MTN mtn = MTN.CHANGE_WALL_TIME;
                        if ((mtn.getType() & type) == mtn.getType()) {
                            i = noticeTabModel.wallTime;
                        } else {
                            i = noticeTabModel2.wallTime;
                        }
                        MTN mtn2 = MTN.CHANGE_UNREAD_COUNT;
                        if ((mtn2.getType() & type) == mtn2.getType()) {
                            i2 = noticeTabModel.unReadCount;
                        } else {
                            MTN mtn3 = MTN.CHANGE_UNREAD_COUNT_DECREASE;
                            i2 = (mtn3.getType() & type) == mtn3.getType() ? noticeTabModel2.unReadCount - 1 : noticeTabModel2.unReadCount;
                        }
                        MTN mtn4 = MTN.CHANGE_LAST_READ_TIME;
                        if ((mtn4.getType() & type) == mtn4.getType()) {
                            i3 = noticeTabModel.lastReadTime;
                        } else {
                            i3 = noticeTabModel2.lastReadTime;
                        }
                        noticeTabModel2 = NoticeTabModel.copy$default(noticeTabModel, 0, 0, null, i2, false, false, null, null, i3, i, null, 0, false, 0, 15607, null);
                    }
                    arrayList.add(noticeTabModel2);
                }
            } else {
                arrayList = null;
            }
            tabListResult = new MTK(tabListResult.LIZIZ, tabListResult.LIZ, arrayList);
        }
        this.LJLIL = tabListResult.LIZJ;
        setState(new AqS175S0100000_9(tabListResult, 163));
    }
}
