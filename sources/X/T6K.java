package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.library.viewmodel.LibraryDetailState;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T6K extends AbstractC65781Prl implements InterfaceC88471Ynr<LibraryDetailState, Bundle, LibraryDetailState> {
    public static final T6K INSTANCE = new T6K();

    public T6K() {
        super(2);
    }

    public final LibraryDetailState invoke(LibraryDetailState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ LibraryDetailState invoke(LibraryDetailState libraryDetailState, Bundle bundle) {
        LibraryDetailState libraryDetailState2 = libraryDetailState;
        invoke(libraryDetailState2, bundle);
        return libraryDetailState2;
    }
}
