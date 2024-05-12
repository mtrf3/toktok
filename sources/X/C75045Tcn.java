package X;

import com.bytedance.android.live.liveinteract.multilive.model.InRoomMultiGuestBanner;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tcn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75045Tcn extends F9E {
    public final List<InRoomMultiGuestBanner> LJLIL;
    public final C35955E9f<String, String> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public final InRoomMultiGuestBanner L() {
        InRoomMultiGuestBanner inRoomMultiGuestBanner;
        Iterator<InRoomMultiGuestBanner> it = this.LJLIL.iterator();
        while (true) {
            if (it.hasNext()) {
                inRoomMultiGuestBanner = it.next();
                if (!this.LJLILLLLZI.containsKey(String.valueOf(inRoomMultiGuestBanner.id))) {
                    break;
                }
            } else {
                inRoomMultiGuestBanner = null;
                break;
            }
        }
        return inRoomMultiGuestBanner;
    }

    public C75045Tcn(List<InRoomMultiGuestBanner> bannerList, C35955E9f<String, String> c35955E9f) {
        o.LJIIIZ(bannerList, "bannerList");
        this.LJLIL = bannerList;
        this.LJLILLLLZI = c35955E9f;
    }
}
