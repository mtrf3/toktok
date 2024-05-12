package com.ss.android.ugc.aweme.creative.model;

import X.InterfaceC36436ERs;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.LoudnessBalanceModel;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class LoudnessBalanceModel implements Parcelable {
    public static final Parcelable.Creator<LoudnessBalanceModel> CREATOR = new Parcelable.Creator<LoudnessBalanceModel>() { // from class: X.5XY
        @Override // android.os.Parcelable.Creator
        public final LoudnessBalanceModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            double readDouble = parcel.readDouble();
            double readDouble2 = parcel.readDouble();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap.put(parcel.readString(), LoudnessDetectResult.CREATOR.createFromParcel(parcel));
            }
            return new LoudnessBalanceModel(arrayList, readDouble, readDouble2, readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final LoudnessBalanceModel[] newArray(int i) {
            return new LoudnessBalanceModel[i];
        }
    };

    @InterfaceC65349Pkn("loudness_balance_types")
    public List<Integer> balanceTypes;

    @InterfaceC65349Pkn("audio_loudness_result")
    public Map<String, LoudnessDetectResult> loudnessMap;

    @InterfaceC65349Pkn("shooting_bgm_avg_loudness")
    public double shootingBgmAvgLoudness;

    @InterfaceC36436ERs
    @InterfaceC65349Pkn("shooting_bgm_path")
    public String shootingBgmPath;

    @InterfaceC65349Pkn("shooting_bgm_peak_loudness")
    public double shootingBgmPeakLoudness;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LoudnessBalanceModel() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r8 = 31
            r0 = r10
            r4 = r2
            r6 = r1
            r7 = r1
            r9 = r1
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.LoudnessBalanceModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.balanceTypes, out);
        while (LIZJ.hasNext()) {
            out.writeInt(((Number) LIZJ.next()).intValue());
        }
        out.writeDouble(this.shootingBgmAvgLoudness);
        out.writeDouble(this.shootingBgmPeakLoudness);
        out.writeString(this.shootingBgmPath);
        Map<String, LoudnessDetectResult> map = this.loudnessMap;
        out.writeInt(map.size());
        for (Map.Entry<String, LoudnessDetectResult> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            entry.getValue().writeToParcel(out, i);
        }
    }

    public LoudnessBalanceModel(List<Integer> balanceTypes, double d, double d2, String shootingBgmPath, Map<String, LoudnessDetectResult> loudnessMap) {
        o.LJIIIZ(balanceTypes, "balanceTypes");
        o.LJIIIZ(shootingBgmPath, "shootingBgmPath");
        o.LJIIIZ(loudnessMap, "loudnessMap");
        this.balanceTypes = balanceTypes;
        this.shootingBgmAvgLoudness = d;
        this.shootingBgmPeakLoudness = d2;
        this.shootingBgmPath = shootingBgmPath;
        this.loudnessMap = loudnessMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LoudnessBalanceModel(java.util.List r9, double r10, double r12, java.lang.String r14, java.util.Map r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r7 = r15
            r6 = r14
            r1 = r9
            r2 = r10
            r0 = r16 & 1
            if (r0 == 0) goto Ld
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        Ld:
            r0 = r16 & 2
            r4 = 0
            if (r0 == 0) goto L15
            r2 = 0
        L15:
            r0 = r16 & 4
            if (r0 == 0) goto L36
        L19:
            r0 = r16 & 8
            if (r0 == 0) goto L1f
            java.lang.String r6 = ""
        L1f:
            r0 = r16 & 16
            if (r0 == 0) goto L31
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r7 = java.util.Collections.synchronizedMap(r0)
            java.lang.String r0 = "synchronizedMap(LinkedHashMap())"
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r0)
        L31:
            r0 = r8
            r0.<init>(r1, r2, r4, r6, r7)
            return
        L36:
            r4 = r12
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.LoudnessBalanceModel.<init>(java.util.List, double, double, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
