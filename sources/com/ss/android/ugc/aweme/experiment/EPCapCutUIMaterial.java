package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EPCapCutUIMaterial {

    @InterfaceC65349Pkn("video_confirm_text")
    public final String confirmText;

    @InterfaceC65349Pkn("video_content_text")
    public final String contentText;

    @InterfaceC65349Pkn("video_res_list")
    public final List<VideoResource> videoRes;

    /* JADX WARN: Multi-variable type inference failed */
    public EPCapCutUIMaterial() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EPCapCutUIMaterial)) {
            return false;
        }
        EPCapCutUIMaterial ePCapCutUIMaterial = (EPCapCutUIMaterial) obj;
        return o.LJ(this.videoRes, ePCapCutUIMaterial.videoRes) && o.LJ(this.contentText, ePCapCutUIMaterial.contentText) && o.LJ(this.confirmText, ePCapCutUIMaterial.confirmText);
    }

    public final int hashCode() {
        List<VideoResource> list = this.videoRes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.contentText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.confirmText;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EPCapCutUIMaterial(videoRes=");
        LIZ.append(this.videoRes);
        LIZ.append(", contentText=");
        LIZ.append(this.contentText);
        LIZ.append(", confirmText=");
        return q.LIZIZ(LIZ, this.confirmText, ')', LIZ);
    }

    public EPCapCutUIMaterial(List<VideoResource> list, String str, String str2) {
        this.videoRes = list;
        this.contentText = str;
        this.confirmText = str2;
    }

    public /* synthetic */ EPCapCutUIMaterial(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
