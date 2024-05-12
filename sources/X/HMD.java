package X;

import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class HMD extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final HMD LJLIL = new HMD();

    public HMD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        List<ShareChannelInfo> list = HME.LIZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<ShareChannelInfo> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().channelKey);
            }
            return arrayList;
        }
        return null;
    }
}
