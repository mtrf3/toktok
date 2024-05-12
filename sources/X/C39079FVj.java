package X;

import android.util.SparseArray;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* renamed from: X.FVj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39079FVj {
    public static final C39079FVj LIZIZ = new C39079FVj();
    public final SparseArray<InterfaceC39076FVg<FeedItemList>> LIZ;

    public final InterfaceC39076FVg LIZ() {
        InterfaceC39076FVg<FeedItemList> interfaceC39076FVg = this.LIZ.get(4);
        if (interfaceC39076FVg == null) {
            return null;
        }
        return interfaceC39076FVg;
    }

    public C39079FVj() {
        SparseArray<InterfaceC39076FVg<FeedItemList>> sparseArray = new SparseArray<>();
        this.LIZ = sparseArray;
        sparseArray.put(4, new C39080FVk());
    }
}
