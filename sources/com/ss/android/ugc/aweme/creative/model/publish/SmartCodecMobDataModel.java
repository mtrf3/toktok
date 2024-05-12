package com.ss.android.ugc.aweme.creative.model.publish;

import X.C43574H8g;
import X.F9E;
import X.GPV;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SmartCodecMobDataModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<SmartCodecMobDataModel> CREATOR = new C43574H8g();

    @GPV
    public boolean isUseSmartCodec;

    @GPV
    public String notUseSmartCodecReason;

    public SmartCodecMobDataModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isUseSmartCodec), this.notUseSmartCodecReason};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isUseSmartCodec ? 1 : 0);
        out.writeString(this.notUseSmartCodecReason);
    }

    public /* synthetic */ SmartCodecMobDataModel(int i) {
        this(false, "");
    }

    public SmartCodecMobDataModel(boolean z, String notUseSmartCodecReason) {
        o.LJIIIZ(notUseSmartCodecReason, "notUseSmartCodecReason");
        this.isUseSmartCodec = z;
        this.notUseSmartCodecReason = notUseSmartCodecReason;
    }
}
