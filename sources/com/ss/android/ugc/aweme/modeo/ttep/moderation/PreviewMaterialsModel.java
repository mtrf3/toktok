package com.ss.android.ugc.aweme.modeo.ttep.moderation;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PreviewMaterialsModel {

    @InterfaceC65349Pkn("FullBody")
    public final List<String> body;

    @InterfaceC65349Pkn("Face")
    public final PMFaceVideo face;

    @InterfaceC65349Pkn("Hand")
    public final List<String> hand;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewMaterialsModel)) {
            return false;
        }
        PreviewMaterialsModel previewMaterialsModel = (PreviewMaterialsModel) obj;
        return o.LJ(this.face, previewMaterialsModel.face) && o.LJ(this.body, previewMaterialsModel.body) && o.LJ(this.hand, previewMaterialsModel.hand);
    }

    public final int hashCode() {
        PMFaceVideo pMFaceVideo = this.face;
        int hashCode = (pMFaceVideo == null ? 0 : pMFaceVideo.hashCode()) * 31;
        List<String> list = this.body;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.hand;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewMaterialsModel(face=");
        LIZ.append(this.face);
        LIZ.append(", body=");
        LIZ.append(this.body);
        LIZ.append(", hand=");
        return C1NE.LIZIZ(LIZ, this.hand, ')', LIZ);
    }

    public PreviewMaterialsModel(PMFaceVideo pMFaceVideo, List<String> list, List<String> list2) {
        this.face = pMFaceVideo;
        this.body = list;
        this.hand = list2;
    }
}
