package com.ss.android.ugc.aweme.library;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LibraryMaterialInfo implements Serializable {

    @InterfaceC65349Pkn("author")
    public final String author;

    @InterfaceC65349Pkn("cover")
    public UrlModel cover;

    @InterfaceC65349Pkn("end_time")
    public Long endTime;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("name")
    public final String materialName;

    @InterfaceC65349Pkn("material_provider")
    public final LibraryMaterialProvider materialProvider;

    @InterfaceC65349Pkn("material_type")
    public final LibraryMaterialType materialType;

    @InterfaceC65349Pkn("preview_webp")
    public final String preview;

    @InterfaceC65349Pkn("start_time")
    public Long startTime;

    @InterfaceC65349Pkn("used_count")
    public final Long usedCount;

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryMaterialInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LibraryMaterialInfo copy$default(LibraryMaterialInfo libraryMaterialInfo, String str, LibraryMaterialProvider libraryMaterialProvider, LibraryMaterialType libraryMaterialType, UrlModel urlModel, String str2, Long l, String str3, Long l2, Long l3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = libraryMaterialInfo.id;
        }
        if ((i & 2) != 0) {
            libraryMaterialProvider = libraryMaterialInfo.materialProvider;
        }
        if ((i & 4) != 0) {
            libraryMaterialType = libraryMaterialInfo.materialType;
        }
        if ((i & 8) != 0) {
            urlModel = libraryMaterialInfo.cover;
        }
        if ((i & 16) != 0) {
            str2 = libraryMaterialInfo.preview;
        }
        if ((i & 32) != 0) {
            l = libraryMaterialInfo.usedCount;
        }
        if ((i & 64) != 0) {
            str3 = libraryMaterialInfo.materialName;
        }
        if ((i & 128) != 0) {
            l2 = libraryMaterialInfo.startTime;
        }
        if ((i & 256) != 0) {
            l3 = libraryMaterialInfo.endTime;
        }
        if ((i & 512) != 0) {
            str4 = libraryMaterialInfo.author;
        }
        return libraryMaterialInfo.copy(str, libraryMaterialProvider, libraryMaterialType, urlModel, str2, l, str3, l2, l3, str4);
    }

    public final LibraryMaterialInfo copy(String str, LibraryMaterialProvider libraryMaterialProvider, LibraryMaterialType libraryMaterialType, UrlModel urlModel, String str2, Long l, String str3, Long l2, Long l3, String str4) {
        return new LibraryMaterialInfo(str, libraryMaterialProvider, libraryMaterialType, urlModel, str2, l, str3, l2, l3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryMaterialInfo)) {
            return false;
        }
        LibraryMaterialInfo libraryMaterialInfo = (LibraryMaterialInfo) obj;
        return o.LJ(this.id, libraryMaterialInfo.id) && this.materialProvider == libraryMaterialInfo.materialProvider && this.materialType == libraryMaterialInfo.materialType && o.LJ(this.cover, libraryMaterialInfo.cover) && o.LJ(this.preview, libraryMaterialInfo.preview) && o.LJ(this.usedCount, libraryMaterialInfo.usedCount) && o.LJ(this.materialName, libraryMaterialInfo.materialName) && o.LJ(this.startTime, libraryMaterialInfo.startTime) && o.LJ(this.endTime, libraryMaterialInfo.endTime) && o.LJ(this.author, libraryMaterialInfo.author);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LibraryMaterialProvider libraryMaterialProvider = this.materialProvider;
        int hashCode2 = (hashCode + (libraryMaterialProvider == null ? 0 : libraryMaterialProvider.hashCode())) * 31;
        LibraryMaterialType libraryMaterialType = this.materialType;
        int hashCode3 = (hashCode2 + (libraryMaterialType == null ? 0 : libraryMaterialType.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        int hashCode4 = (hashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str2 = this.preview;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.usedCount;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.materialName;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.startTime;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.endTime;
        int hashCode9 = (hashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str4 = this.author;
        return hashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibraryMaterialInfo(id=");
        LIZ.append(this.id);
        LIZ.append(", materialProvider=");
        LIZ.append(this.materialProvider);
        LIZ.append(", materialType=");
        LIZ.append(this.materialType);
        LIZ.append(", cover=");
        LIZ.append(this.cover);
        LIZ.append(", preview=");
        LIZ.append(this.preview);
        LIZ.append(", usedCount=");
        LIZ.append(this.usedCount);
        LIZ.append(", materialName=");
        LIZ.append(this.materialName);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", endTime=");
        LIZ.append(this.endTime);
        LIZ.append(", author=");
        return q.LIZIZ(LIZ, this.author, ')', LIZ);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMaterialName() {
        return this.materialName;
    }

    public final LibraryMaterialProvider getMaterialProvider() {
        return this.materialProvider;
    }

    public final LibraryMaterialType getMaterialType() {
        return this.materialType;
    }

    public final String getPreview() {
        return this.preview;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final Long getUsedCount() {
        return this.usedCount;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setEndTime(Long l) {
        this.endTime = l;
    }

    public final void setStartTime(Long l) {
        this.startTime = l;
    }

    public LibraryMaterialInfo(String str, LibraryMaterialProvider libraryMaterialProvider, LibraryMaterialType libraryMaterialType, UrlModel urlModel, String str2, Long l, String str3, Long l2, Long l3, String str4) {
        this.id = str;
        this.materialProvider = libraryMaterialProvider;
        this.materialType = libraryMaterialType;
        this.cover = urlModel;
        this.preview = str2;
        this.usedCount = l;
        this.materialName = str3;
        this.startTime = l2;
        this.endTime = l3;
        this.author = str4;
    }

    public /* synthetic */ LibraryMaterialInfo(String str, LibraryMaterialProvider libraryMaterialProvider, LibraryMaterialType libraryMaterialType, UrlModel urlModel, String str2, Long l, String str3, Long l2, Long l3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? LibraryMaterialProvider.NONE : libraryMaterialProvider, (i & 4) != 0 ? LibraryMaterialType.NONE : libraryMaterialType, (i & 8) != 0 ? null : urlModel, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? 0L : l, (i & 64) == 0 ? str3 : "", (i & 128) != 0 ? 0L : l2, (i & 256) != 0 ? 0L : l3, (i & 512) == 0 ? str4 : null);
    }
}
