package com.ss.android.ugc.aweme.shortvideo.library.model;

import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.aweme.experiment.LibraryCategory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class LibraryCategoryState implements InterfaceC61312at {
    public final LibraryCategory currentCategory;

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryCategoryState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LibraryCategoryState copy$default(LibraryCategoryState libraryCategoryState, LibraryCategory libraryCategory, int i, Object obj) {
        if ((i & 1) != 0) {
            libraryCategory = libraryCategoryState.currentCategory;
        }
        return libraryCategoryState.copy(libraryCategory);
    }

    public final LibraryCategoryState copy(LibraryCategory libraryCategory) {
        return new LibraryCategoryState(libraryCategory);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LibraryCategoryState) && o.LJ(this.currentCategory, ((LibraryCategoryState) obj).currentCategory);
    }

    public int hashCode() {
        LibraryCategory libraryCategory = this.currentCategory;
        if (libraryCategory == null) {
            return 0;
        }
        return libraryCategory.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibraryCategoryState(currentCategory=");
        LIZ.append(this.currentCategory);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final LibraryCategory getCurrentCategory() {
        return this.currentCategory;
    }

    public LibraryCategoryState(LibraryCategory libraryCategory) {
        this.currentCategory = libraryCategory;
    }

    public /* synthetic */ LibraryCategoryState(LibraryCategory libraryCategory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : libraryCategory);
    }
}
