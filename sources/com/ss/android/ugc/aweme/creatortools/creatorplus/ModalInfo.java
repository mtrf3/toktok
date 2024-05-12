package com.ss.android.ugc.aweme.creatortools.creatorplus;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ModalInfo {

    @InterfaceC65349Pkn("image")
    public final UrlModel image;

    @InterfaceC65349Pkn("message_key")
    public final String messageKey;

    @InterfaceC65349Pkn("title_key")
    public final String titleKey;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalInfo)) {
            return false;
        }
        ModalInfo modalInfo = (ModalInfo) obj;
        return o.LJ(this.image, modalInfo.image) && o.LJ(this.messageKey, modalInfo.messageKey) && o.LJ(this.titleKey, modalInfo.titleKey);
    }

    public final int hashCode() {
        UrlModel urlModel = this.image;
        int hashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        String str = this.messageKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleKey;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ModalInfo(image=");
        LIZ.append(this.image);
        LIZ.append(", messageKey=");
        LIZ.append(this.messageKey);
        LIZ.append(", titleKey=");
        return q.LIZIZ(LIZ, this.titleKey, ')', LIZ);
    }

    public ModalInfo(UrlModel urlModel, String str, String str2) {
        this.image = urlModel;
        this.messageKey = str;
        this.titleKey = str2;
    }
}
