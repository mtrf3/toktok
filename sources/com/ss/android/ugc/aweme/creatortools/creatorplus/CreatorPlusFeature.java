package com.ss.android.ugc.aweme.creatortools.creatorplus;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CreatorPlusFeature {

    @InterfaceC65349Pkn("id")
    public final Integer id;

    @InterfaceC65349Pkn("image")
    public final UrlModel image;

    @InterfaceC65349Pkn("is_accessible")
    public final Boolean isAccessible;

    @InterfaceC65349Pkn("modal_info")
    public final ModalInfo modalInfo;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("show_red_dot")
    public final boolean showRedDot;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatorPlusFeature)) {
            return false;
        }
        CreatorPlusFeature creatorPlusFeature = (CreatorPlusFeature) obj;
        return o.LJ(this.id, creatorPlusFeature.id) && o.LJ(this.image, creatorPlusFeature.image) && o.LJ(this.isAccessible, creatorPlusFeature.isAccessible) && o.LJ(this.modalInfo, creatorPlusFeature.modalInfo) && o.LJ(this.name, creatorPlusFeature.name) && o.LJ(this.schema, creatorPlusFeature.schema) && this.showRedDot == creatorPlusFeature.showRedDot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UrlModel urlModel = this.image;
        int hashCode2 = (hashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Boolean bool = this.isAccessible;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ModalInfo modalInfo = this.modalInfo;
        int hashCode4 = (hashCode3 + (modalInfo == null ? 0 : modalInfo.hashCode())) * 31;
        String str = this.name;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.schema;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.showRedDot;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreatorPlusFeature(id=");
        LIZ.append(this.id);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(", isAccessible=");
        LIZ.append(this.isAccessible);
        LIZ.append(", modalInfo=");
        LIZ.append(this.modalInfo);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", showRedDot=");
        return C48339Iy7.LIZJ(LIZ, this.showRedDot, ')', LIZ);
    }

    public CreatorPlusFeature(Integer num, UrlModel urlModel, Boolean bool, ModalInfo modalInfo, String str, String str2, boolean z) {
        this.id = num;
        this.image = urlModel;
        this.isAccessible = bool;
        this.modalInfo = modalInfo;
        this.name = str;
        this.schema = str2;
        this.showRedDot = z;
    }
}
