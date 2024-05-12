package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9cx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240959cx extends AbstractC65781Prl implements InterfaceC88473Ynt<C240949cw, C240719cZ, List<? extends Object>, C240949cw> {
    public static final C240959cx LJLIL = new C240959cx();

    public C240959cx() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C240949cw invoke(C240949cw c240949cw, C240719cZ c240719cZ, List<? extends Object> list) {
        boolean z;
        C240949cw assemViewModel = c240949cw;
        C240719cZ item = c240719cZ;
        o.LJIIIZ(assemViewModel, "$this$assemViewModel");
        o.LJIIIZ(item, "item");
        if (item.LJLIL.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
            z = true;
        } else {
            z = false;
        }
        return C240949cw.LIZ(assemViewModel, z, C44384HbQ.LLILLJJLI(item.LJLIL.getPinnedVideoStatus()), null, 4);
    }
}
