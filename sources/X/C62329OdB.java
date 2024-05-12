package X;

import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import com.ss.android.ugc.aweme.share.base.model.TargetComponentInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OdB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62329OdB extends AbstractC65781Prl implements InterfaceC65784Pro<List<String>> {
    public static final C62329OdB LJLIL = new C62329OdB();

    public C62329OdB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<String> invoke() {
        List<Integer> list;
        List<ShareChannelInfo> list2 = C62324Od6.LIZIZ;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (ShareChannelInfo shareChannelInfo : list2) {
                TargetComponentInfo targetComponentInfo = shareChannelInfo.targetComponentInfo;
                if (targetComponentInfo != null && (list = targetComponentInfo.shareModes) != null && list.contains(7)) {
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
