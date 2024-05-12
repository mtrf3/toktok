package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.9d2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C241009d2 extends AbstractC65781Prl implements InterfaceC88471Ynr<C240719cZ, C240949cw, C240719cZ> {
    public static final C241009d2 LJLIL = new C241009d2();

    public C241009d2() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C240719cZ invoke(C240719cZ c240719cZ, C240949cw c240949cw) {
        MusicModel.CollectionType collectionType;
        C240719cZ assemViewModel = c240719cZ;
        C240949cw it = c240949cw;
        o.LJIIIZ(assemViewModel, "$this$assemViewModel");
        o.LJIIIZ(it, "it");
        MusicModel musicModel = assemViewModel.LJLIL;
        if (it.LJLIL) {
            collectionType = MusicModel.CollectionType.COLLECTED;
        } else {
            collectionType = MusicModel.CollectionType.NOT_COLLECTED;
        }
        musicModel.setCollectionType(collectionType);
        assemViewModel.LJLIL.setPinnedVideoStatus(it.LJLILLLLZI.getValue());
        return assemViewModel;
    }
}
