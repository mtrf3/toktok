package com.ss.android.ugc.aweme.commerce.tools.sticker;

import X.C42475Glj;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IBEContext implements Serializable, Parcelable {
    public static final Parcelable.Creator<IBEContext> CREATOR = new C42475Glj();

    @InterfaceC65349Pkn("ibe_infos")
    public List<IBEInfo> ibeInfos = C61878OQg.INSTANCE;

    @InterfaceC65349Pkn("ibe_metadata")
    public InteractiveBrandedEffectInfo metadata;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    public final List<IBEInfo> getIbeInfos() {
        return this.ibeInfos;
    }

    public final InteractiveBrandedEffectInfo getMetadata() {
        return this.metadata;
    }

    public final void setIbeInfos(List<IBEInfo> list) {
        o.LJIIIZ(list, "<set-?>");
        this.ibeInfos = list;
    }

    public final void setMetadata(InteractiveBrandedEffectInfo interactiveBrandedEffectInfo) {
        this.metadata = interactiveBrandedEffectInfo;
    }
}
