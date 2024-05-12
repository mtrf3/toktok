package com.ss.android.ugc.aweme.library.viewmodel;

import X.AbstractC26082ALm;
import X.C26092ALw;
import X.F9E;
import X.InterfaceC61312at;
import com.ss.android.ugc.aweme.model.library.LibraryDetailResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class LibraryDetailState extends F9E implements InterfaceC61312at {
    public final AbstractC26082ALm<LibraryDetailResponse> libraryDetail;

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryDetailState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LibraryDetailState copy$default(LibraryDetailState libraryDetailState, AbstractC26082ALm abstractC26082ALm, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC26082ALm = libraryDetailState.libraryDetail;
        }
        return libraryDetailState.copy(abstractC26082ALm);
    }

    public final LibraryDetailState copy(AbstractC26082ALm<LibraryDetailResponse> libraryDetail) {
        o.LJIIIZ(libraryDetail, "libraryDetail");
        return new LibraryDetailState(libraryDetail);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.libraryDetail};
    }

    public final AbstractC26082ALm<LibraryDetailResponse> getLibraryDetail() {
        return this.libraryDetail;
    }

    public LibraryDetailState(AbstractC26082ALm<LibraryDetailResponse> libraryDetail) {
        o.LJIIIZ(libraryDetail, "libraryDetail");
        this.libraryDetail = libraryDetail;
    }

    public /* synthetic */ LibraryDetailState(AbstractC26082ALm abstractC26082ALm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C26092ALw.LIZ : abstractC26082ALm);
    }
}
