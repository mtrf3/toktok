package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.9dW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C241309dW extends AbstractC65781Prl implements InterfaceC88471Ynr<C240719cZ, C99K, C240719cZ> {
    public static final C241309dW LJLIL = new C241309dW();

    public C241309dW() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C240719cZ invoke(C240719cZ c240719cZ, C99K c99k) {
        MusicModel.CollectionType collectionType;
        C240719cZ assemViewModel = c240719cZ;
        C99K it = c99k;
        o.LJIIIZ(assemViewModel, "$this$assemViewModel");
        o.LJIIIZ(it, "it");
        MusicModel musicModel = assemViewModel.LJLIL;
        if (it.LJLIL) {
            collectionType = MusicModel.CollectionType.COLLECTED;
        } else {
            collectionType = MusicModel.CollectionType.NOT_COLLECTED;
        }
        musicModel.setCollectionType(collectionType);
        return assemViewModel;
    }
}