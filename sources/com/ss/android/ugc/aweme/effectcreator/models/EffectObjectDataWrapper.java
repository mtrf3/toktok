package com.ss.android.ugc.aweme.effectcreator.models;

import X.C61878OQg;
import X.ESS;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EffectObjectDataWrapper extends F9E implements Parcelable {
    public static final Parcelable.Creator<EffectObjectDataWrapper> CREATOR = new ESS();
    public String assetId;
    public final String distortionStatus;
    public final String featureId;
    public final String featureName;
    public final List<String> liquifyStatus;
    public final String textureFrom;
    public final String textureType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.featureId, this.distortionStatus, this.liquifyStatus, this.featureName, this.textureFrom, this.textureType, this.assetId};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.featureId);
        out.writeString(this.distortionStatus);
        out.writeStringList(this.liquifyStatus);
        out.writeString(this.featureName);
        out.writeString(this.textureFrom);
        out.writeString(this.textureType);
        out.writeString(this.assetId);
    }

    public EffectObjectDataWrapper() {
        this("", "", "", "", "", "", C61878OQg.INSTANCE);
    }

    public EffectObjectDataWrapper(String featureId, String distortionStatus, String featureName, String textureFrom, String textureType, String assetId, List liquifyStatus) {
        o.LJIIIZ(featureId, "featureId");
        o.LJIIIZ(distortionStatus, "distortionStatus");
        o.LJIIIZ(liquifyStatus, "liquifyStatus");
        o.LJIIIZ(featureName, "featureName");
        o.LJIIIZ(textureFrom, "textureFrom");
        o.LJIIIZ(textureType, "textureType");
        o.LJIIIZ(assetId, "assetId");
        this.featureId = featureId;
        this.distortionStatus = distortionStatus;
        this.liquifyStatus = liquifyStatus;
        this.featureName = featureName;
        this.textureFrom = textureFrom;
        this.textureType = textureType;
        this.assetId = assetId;
    }
}
