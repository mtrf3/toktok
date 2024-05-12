package X;

import com.ss.android.ugc.aweme.library.viewmodel.LibraryDetailState;
import com.ss.android.ugc.aweme.model.library.LibraryDetailResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T6L extends AbstractC65781Prl implements InterfaceC88471Ynr<LibraryDetailState, AbstractC26082ALm<? extends LibraryDetailResponse>, LibraryDetailState> {
    public static final T6L LJLIL = new T6L();

    public T6L() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final LibraryDetailState invoke(LibraryDetailState libraryDetailState, AbstractC26082ALm<? extends LibraryDetailResponse> abstractC26082ALm) {
        LibraryDetailState execute = libraryDetailState;
        AbstractC26082ALm<? extends LibraryDetailResponse> state = abstractC26082ALm;
        o.LJIIIZ(execute, "$this$execute");
        o.LJIIIZ(state, "state");
        return execute.copy(state);
    }
}
