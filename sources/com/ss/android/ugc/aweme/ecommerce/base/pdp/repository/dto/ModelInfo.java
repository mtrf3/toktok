package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27508Aqu;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ModelInfo implements Parcelable {
    public static final Parcelable.Creator<ModelInfo> CREATOR = new C27508Aqu();

    @InterfaceC65349Pkn("avatar")
    public final Image avatar;

    @InterfaceC65349Pkn("color_value_id")
    public final String colorValueId;

    @InterfaceC65349Pkn("model_figures")
    public final List<ModelFigure> modelFigures;

    @InterfaceC65349Pkn("wears_size")
    public final String wearsSize;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelInfo)) {
            return false;
        }
        ModelInfo modelInfo = (ModelInfo) obj;
        return o.LJ(this.avatar, modelInfo.avatar) && o.LJ(this.wearsSize, modelInfo.wearsSize) && o.LJ(this.modelFigures, modelInfo.modelFigures) && o.LJ(this.colorValueId, modelInfo.colorValueId);
    }

    public final int hashCode() {
        Image image = this.avatar;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.wearsSize;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ModelFigure> list = this.modelFigures;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.colorValueId;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ModelInfo(avatar=");
        LIZ.append(this.avatar);
        LIZ.append(", wearsSize=");
        LIZ.append(this.wearsSize);
        LIZ.append(", modelFigures=");
        LIZ.append(this.modelFigures);
        LIZ.append(", colorValueId=");
        return q.LIZIZ(LIZ, this.colorValueId, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.avatar, i);
        out.writeString(this.wearsSize);
        List<ModelFigure> list = this.modelFigures;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((ModelFigure) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.colorValueId);
    }

    public ModelInfo(Image image, String str, List<ModelFigure> list, String str2) {
        this.avatar = image;
        this.wearsSize = str;
        this.modelFigures = list;
        this.colorValueId = str2;
    }
}
