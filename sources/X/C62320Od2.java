package X;

import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Od2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62320Od2 extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C62320Od2 LJLIL = new C62320Od2();

    public C62320Od2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        List<ShareChannelInfo> LJI = C62494Ofq.LJ.LJI();
        if (LJI != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJI, 10));
            Iterator<ShareChannelInfo> it = LJI.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().channelKey);
            }
            return arrayList;
        }
        return null;
    }
}
