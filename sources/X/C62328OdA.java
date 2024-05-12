package X;

import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import com.ss.android.ugc.aweme.share.base.model.TargetComponentInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OdA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62328OdA extends AbstractC65781Prl implements InterfaceC65784Pro<List<String>> {
    public static final C62328OdA LJLIL = new C62328OdA();

    public C62328OdA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<String> invoke() {
        TargetComponentInfo targetComponentInfo;
        TargetComponentInfo targetComponentInfo2;
        List<Integer> list;
        TargetComponentInfo targetComponentInfo3;
        List<Integer> list2;
        TargetComponentInfo targetComponentInfo4;
        List<Integer> list3;
        List<Integer> list4;
        TargetComponentInfo targetComponentInfo5;
        List<Integer> list5;
        List<Integer> list6;
        TargetComponentInfo targetComponentInfo6;
        List<Integer> list7;
        List<ShareChannelInfo> list8 = C62324Od6.LIZIZ;
        if (list8 != null) {
            ArrayList arrayList = new ArrayList();
            for (ShareChannelInfo shareChannelInfo : list8) {
                ShareChannelInfo shareChannelInfo2 = shareChannelInfo;
                TargetComponentInfo targetComponentInfo7 = shareChannelInfo2.targetComponentInfo;
                if ((targetComponentInfo7 != null && (list6 = targetComponentInfo7.shareModes) != null && list6.size() == 1 && (targetComponentInfo6 = shareChannelInfo2.targetComponentInfo) != null && (list7 = targetComponentInfo6.shareModes) != null && list7.contains(4)) || (((targetComponentInfo = shareChannelInfo2.targetComponentInfo) != null && (list4 = targetComponentInfo.shareModes) != null && list4.size() == 1 && (targetComponentInfo5 = shareChannelInfo2.targetComponentInfo) != null && (list5 = targetComponentInfo5.shareModes) != null && list5.contains(1)) || ((targetComponentInfo2 = shareChannelInfo2.targetComponentInfo) != null && (list = targetComponentInfo2.shareModes) != null && list.size() == 2 && (targetComponentInfo3 = shareChannelInfo2.targetComponentInfo) != null && (list2 = targetComponentInfo3.shareModes) != null && list2.contains(1) && (targetComponentInfo4 = shareChannelInfo2.targetComponentInfo) != null && (list3 = targetComponentInfo4.shareModes) != null && list3.contains(4)))) {
                    arrayList.add(shareChannelInfo);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ShareChannelInfo) it.next()).channelKey);
            }
            return ORZ.LLJILJILJ(arrayList2);
        }
        return null;
    }
}
