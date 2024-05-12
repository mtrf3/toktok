package com.ss.android.ugc.aweme.creative.model;

import X.GPV;
import X.H9K;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StreamVoiceConversionModel implements Parcelable {
    public static final Parcelable.Creator<StreamVoiceConversionModel> CREATOR = new H9K();

    @GPV
    public boolean isSVCSelected;

    @InterfaceC65349Pkn("stream_vc_effect_id")
    public String vcEffectId;

    @InterfaceC65349Pkn("stream_vc_effect_name")
    public String vcEffectName;

    @InterfaceC65349Pkn("stream_vc_effect_speaker_id")
    public String vcEffectSpeakerId;

    @InterfaceC65349Pkn("stream_vc_has_apply")
    public boolean vcHasApply;

    @InterfaceC65349Pkn("stream_vc_segment_effect_id_from_map")
    public HashMap<String, String> vcSegmentEffectIdFromMap;

    @InterfaceC65349Pkn("stream_vc_shooting_effect_id")
    public String vcShootingEffectId;

    @InterfaceC65349Pkn("stream_vc_shooting_effect_id_from")
    public String vcShootingEffectIdFrom;

    @InterfaceC65349Pkn("stream_vc_id")
    public String vcVoiceId;

    @InterfaceC65349Pkn("stream_vc_name")
    public String vcVoiceName;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StreamVoiceConversionModel() {
        /*
            r13 = this;
            r1 = 0
            r7 = 0
            r11 = 1023(0x3ff, float:1.434E-42)
            r0 = r13
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r8 = r1
            r9 = r1
            r10 = r7
            r12 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.vcVoiceId);
        out.writeString(this.vcVoiceName);
        out.writeString(this.vcEffectId);
        HashMap<String, String> hashMap = this.vcSegmentEffectIdFromMap;
        out.writeInt(hashMap.size());
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
        out.writeString(this.vcEffectSpeakerId);
        out.writeString(this.vcEffectName);
        out.writeInt(this.vcHasApply ? 1 : 0);
        out.writeString(this.vcShootingEffectId);
        out.writeString(this.vcShootingEffectIdFrom);
        out.writeInt(this.isSVCSelected ? 1 : 0);
    }

    public StreamVoiceConversionModel(String str, String str2, String vcEffectId, HashMap<String, String> vcSegmentEffectIdFromMap, String vcEffectSpeakerId, String vcEffectName, boolean z, String vcShootingEffectId, String vcShootingEffectIdFrom, boolean z2) {
        o.LJIIIZ(vcEffectId, "vcEffectId");
        o.LJIIIZ(vcSegmentEffectIdFromMap, "vcSegmentEffectIdFromMap");
        o.LJIIIZ(vcEffectSpeakerId, "vcEffectSpeakerId");
        o.LJIIIZ(vcEffectName, "vcEffectName");
        o.LJIIIZ(vcShootingEffectId, "vcShootingEffectId");
        o.LJIIIZ(vcShootingEffectIdFrom, "vcShootingEffectIdFrom");
        this.vcVoiceId = str;
        this.vcVoiceName = str2;
        this.vcEffectId = vcEffectId;
        this.vcSegmentEffectIdFromMap = vcSegmentEffectIdFromMap;
        this.vcEffectSpeakerId = vcEffectSpeakerId;
        this.vcEffectName = vcEffectName;
        this.vcHasApply = z;
        this.vcShootingEffectId = vcShootingEffectId;
        this.vcShootingEffectIdFrom = vcShootingEffectIdFrom;
        this.isSVCSelected = z2;
    }

    public /* synthetic */ StreamVoiceConversionModel(String str, String str2, String str3, HashMap hashMap, String str4, String str5, boolean z, String str6, String str7, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) == 0 ? str2 : null, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new HashMap() : hashMap, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? false : z, (i & 128) != 0 ? "" : str6, (i & 256) == 0 ? str7 : "", (i & 512) == 0 ? z2 : false);
    }
}
