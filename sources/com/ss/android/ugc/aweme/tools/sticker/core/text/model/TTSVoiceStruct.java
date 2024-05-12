package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.H7Q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TTSVoiceStruct implements Serializable, Parcelable {
    public static final Parcelable.Creator<TTSVoiceStruct> CREATOR = new H7Q();

    @InterfaceC65349Pkn("icon_url")
    public final String effectIconUrl;

    @InterfaceC65349Pkn("effect_id")
    public final String ttsVoiceId;

    @InterfaceC65349Pkn("resource_id")
    public final String ttsVoiceResourceId;

    /* JADX WARN: Multi-variable type inference failed */
    public TTSVoiceStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TTSVoiceStruct copy$default(TTSVoiceStruct tTSVoiceStruct, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tTSVoiceStruct.ttsVoiceId;
        }
        if ((i & 2) != 0) {
            str2 = tTSVoiceStruct.effectIconUrl;
        }
        if ((i & 4) != 0) {
            str3 = tTSVoiceStruct.ttsVoiceResourceId;
        }
        return tTSVoiceStruct.copy(str, str2, str3);
    }

    public final TTSVoiceStruct copy(String str, String str2, String str3) {
        return new TTSVoiceStruct(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTSVoiceStruct)) {
            return false;
        }
        TTSVoiceStruct tTSVoiceStruct = (TTSVoiceStruct) obj;
        return o.LJ(this.ttsVoiceId, tTSVoiceStruct.ttsVoiceId) && o.LJ(this.effectIconUrl, tTSVoiceStruct.effectIconUrl) && o.LJ(this.ttsVoiceResourceId, tTSVoiceStruct.ttsVoiceResourceId);
    }

    public int hashCode() {
        String str = this.ttsVoiceId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.effectIconUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ttsVoiceResourceId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.ttsVoiceId);
        out.writeString(this.effectIconUrl);
        out.writeString(this.ttsVoiceResourceId);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTSVoiceStruct(ttsVoiceId=");
        LIZ.append(this.ttsVoiceId);
        LIZ.append(", effectIconUrl=");
        LIZ.append(this.effectIconUrl);
        LIZ.append(", ttsVoiceResourceId=");
        return q.LIZIZ(LIZ, this.ttsVoiceResourceId, ')', LIZ);
    }

    public final String getEffectIconUrl() {
        return this.effectIconUrl;
    }

    public final String getTtsVoiceId() {
        return this.ttsVoiceId;
    }

    public final String getTtsVoiceResourceId() {
        return this.ttsVoiceResourceId;
    }

    public TTSVoiceStruct(String str, String str2, String str3) {
        this.ttsVoiceId = str;
        this.effectIconUrl = str2;
        this.ttsVoiceResourceId = str3;
    }

    public /* synthetic */ TTSVoiceStruct(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
