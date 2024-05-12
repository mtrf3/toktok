package com.ss.android.ugc.aweme.model.library;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.library.LibraryMaterialInfo;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class LibraryDetailResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("library_material_info")
    public LibraryMaterialInfo libraryMaterialInfo;

    public final LibraryMaterialInfo getLibraryMaterialInfo() {
        return this.libraryMaterialInfo;
    }

    public final void setLibraryMaterialInfo(LibraryMaterialInfo libraryMaterialInfo) {
        this.libraryMaterialInfo = libraryMaterialInfo;
    }
}
