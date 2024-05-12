package X;

import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import com.ss.android.ugc.aweme.share.base.model.TargetComponentInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Od9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62327Od9 extends AbstractC65781Prl implements InterfaceC65784Pro<List<String>> {
    public static final C62327Od9 LJLIL = new C62327Od9();

    public C62327Od9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<String> invoke() {
        List<Integer> list;
        TargetComponentInfo targetComponentInfo;
        List<Integer> list2;
        List<ShareChannelInfo> list3 = C62324Od6.LIZIZ;
        if (list3 != null) {
            ArrayList arrayList = new ArrayList();
            for (ShareChannelInfo shareChannelInfo : list3) {
                ShareChannelInfo shareChannelInfo2 = shareChannelInfo;
                TargetComponentInfo targetComponentInfo2 = shareChannelInfo2.targetComponentInfo;
                if (targetComponentInfo2 != null && (list = targetComponentInfo2.shareModes) != null && list.size() == 1 && (targetComponentInfo = shareChannelInfo2.targetComponentInfo) != null && (list2 = targetComponentInfo.shareModes) != null && list2.contains(0)) {
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
