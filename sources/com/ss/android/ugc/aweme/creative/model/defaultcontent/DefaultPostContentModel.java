package com.ss.android.ugc.aweme.creative.model.defaultcontent;

import X.C61878OQg;
import X.F9E;
import X.GLB;
import X.GPV;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.model.TransAnchorData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DefaultPostContentModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<DefaultPostContentModel> CREATOR = new GLB();

    @InterfaceC65349Pkn("default_post_anchors")
    public final List<TransAnchorData> defaultAnchors;

    @GPV
    public final String defaultDescription;

    @GPV
    public final String defaultTitle;

    public DefaultPostContentModel() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.defaultTitle, this.defaultDescription, this.defaultAnchors};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.defaultTitle);
        out.writeString(this.defaultDescription);
        Iterator LIZJ = UC7.LIZJ(this.defaultAnchors, out);
        while (LIZJ.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ.next(), i);
        }
    }

    public DefaultPostContentModel(String defaultTitle, String defaultDescription, List<TransAnchorData> defaultAnchors) {
        o.LJIIIZ(defaultTitle, "defaultTitle");
        o.LJIIIZ(defaultDescription, "defaultDescription");
        o.LJIIIZ(defaultAnchors, "defaultAnchors");
        this.defaultTitle = defaultTitle;
        this.defaultDescription = defaultDescription;
        this.defaultAnchors = defaultAnchors;
    }

    public DefaultPostContentModel(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C61878OQg.INSTANCE : list);
    }
}
