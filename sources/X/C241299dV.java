package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9dV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C241299dV extends AbstractC65781Prl implements InterfaceC88473Ynt<C99K, C240719cZ, List<? extends Object>, C99K> {
    public static final C241299dV LJLIL = new C241299dV();

    public C241299dV() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C99K invoke(C99K c99k, C240719cZ c240719cZ, List<? extends Object> list) {
        boolean z;
        C99K assemViewModel = c99k;
        C240719cZ item = c240719cZ;
        o.LJIIIZ(assemViewModel, "$this$assemViewModel");
        o.LJIIIZ(item, "item");
        if (item.LJLIL.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
            z = true;
        } else {
            z = false;
        }
        return C99K.LIZ(assemViewModel, z, null, 2);
    }
}
