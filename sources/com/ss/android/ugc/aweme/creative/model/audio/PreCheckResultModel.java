package com.ss.android.ugc.aweme.creative.model.audio;

import X.C1FJ;
import X.GPV;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetail;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.creative.model.audio.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.audio.UnavailableReason;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class PreCheckResultModel implements Parcelable {
    public static final Parcelable.Creator<PreCheckResultModel> CREATOR = new Parcelable.Creator<PreCheckResultModel>() { // from class: X.6El
        @Override // android.os.Parcelable.Creator
        public final PreCheckResultModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            boolean z;
            boolean z2;
            o.LJIIIZ(parcel, "parcel");
            Integer num = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = C279117r.LIZIZ(MusicInfo.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = C279117r.LIZIZ(MatchDetail.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = C279117r.LIZIZ(MatchDetailsV1.CREATOR, parcel, arrayList3, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = C279117r.LIZIZ(UnavailableReason.CREATOR, parcel, arrayList4, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new PreCheckResultModel(arrayList, arrayList2, arrayList3, arrayList4, num, readString, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final PreCheckResultModel[] newArray(int i) {
            return new PreCheckResultModel[i];
        }
    };

    @GPV
    public boolean detectPass;

    @GPV
    public boolean hasShowResult;

    @GPV
    @InterfaceC65349Pkn("match_details")
    public final ArrayList<MatchDetail> matchDetails;

    @GPV
    @InterfaceC65349Pkn("match_details_v1")
    public final ArrayList<MatchDetailsV1> matchDetailsV1;

    @GPV
    @InterfaceC65349Pkn("music_infos")
    public final ArrayList<MusicInfo> musicInfos;

    @GPV
    @InterfaceC65349Pkn("pre_check_id")
    public final String preCheckId;

    @GPV
    @InterfaceC65349Pkn("unavailable_reasons")
    public final ArrayList<UnavailableReason> unavailableReasons;

    @GPV
    @InterfaceC65349Pkn("un_availed_reason")
    public final Integer unavailableReasonsV1;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PreCheckResultModel() {
        /*
            r11 = this;
            r1 = 0
            r7 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r8 = r7
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        ArrayList<MusicInfo> arrayList = this.musicInfos;
        if (arrayList == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList.size());
            Iterator<MusicInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(out, i);
            }
        }
        ArrayList<MatchDetail> arrayList2 = this.matchDetails;
        if (arrayList2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList2.size());
            Iterator<MatchDetail> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(out, i);
            }
        }
        ArrayList<MatchDetailsV1> arrayList3 = this.matchDetailsV1;
        if (arrayList3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList3.size());
            Iterator<MatchDetailsV1> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(out, i);
            }
        }
        ArrayList<UnavailableReason> arrayList4 = this.unavailableReasons;
        if (arrayList4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList4.size());
            Iterator<UnavailableReason> it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(out, i);
            }
        }
        Integer num = this.unavailableReasonsV1;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.preCheckId);
        out.writeInt(this.hasShowResult ? 1 : 0);
        out.writeInt(this.detectPass ? 1 : 0);
    }

    public PreCheckResultModel(ArrayList<MusicInfo> arrayList, ArrayList<MatchDetail> arrayList2, ArrayList<MatchDetailsV1> arrayList3, ArrayList<UnavailableReason> arrayList4, Integer num, String str, boolean z, boolean z2) {
        this.musicInfos = arrayList;
        this.matchDetails = arrayList2;
        this.matchDetailsV1 = arrayList3;
        this.unavailableReasons = arrayList4;
        this.unavailableReasonsV1 = num;
        this.preCheckId = str;
        this.hasShowResult = z;
        this.detectPass = z2;
    }

    public /* synthetic */ PreCheckResultModel(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Integer num, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : arrayList2, (i & 4) != 0 ? null : arrayList3, (i & 8) == 0 ? arrayList4 : null, (i & 16) != 0 ? 0 : num, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? false : z, (i & 128) == 0 ? z2 : false);
    }
}
