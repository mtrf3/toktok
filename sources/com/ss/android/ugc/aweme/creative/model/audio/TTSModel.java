package com.ss.android.ugc.aweme.creative.model.audio;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.TTSExtraModel;
import com.ss.android.ugc.aweme.creative.model.audio.TTSModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TTSModel implements Parcelable {
    public static final Parcelable.Creator<TTSModel> CREATOR = new Parcelable.Creator<TTSModel>() { // from class: X.5cU
        @Override // android.os.Parcelable.Creator
        public final TTSModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), TTSExtraModel.CREATOR.createFromParcel(parcel));
            }
            return new TTSModel(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TTSModel[] newArray(int i) {
            return new TTSModel[i];
        }
    };

    @InterfaceC65349Pkn("tts_result")
    public Map<String, TTSExtraModel> ttsExtraMap;

    /* JADX WARN: Multi-variable type inference failed */
    public TTSModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Map<String, TTSExtraModel> map = this.ttsExtraMap;
        out.writeInt(map.size());
        for (Map.Entry<String, TTSExtraModel> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            entry.getValue().writeToParcel(out, i);
        }
    }

    public TTSModel(Map<String, TTSExtraModel> ttsExtraMap) {
        o.LJIIIZ(ttsExtraMap, "ttsExtraMap");
        this.ttsExtraMap = ttsExtraMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TTSModel(java.util.Map r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r1 = this;
            r0 = r3 & 1
            if (r0 == 0) goto L12
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r2 = java.util.Collections.synchronizedMap(r0)
            java.lang.String r0 = "synchronizedMap(LinkedHashMap())"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
        L12:
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.audio.TTSModel.<init>(java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
