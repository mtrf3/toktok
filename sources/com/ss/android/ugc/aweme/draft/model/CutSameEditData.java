package com.ss.android.ugc.aweme.draft.model;

import X.C279017q;
import X.C65232Piu;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import defpackage.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class CutSameEditData implements Parcelable {
    public static final Parcelable.Creator<CutSameEditData> CREATOR = new Parcelable.Creator<CutSameEditData>() { // from class: X.6qr
        @Override // android.os.Parcelable.Creator
        public final CutSameEditData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = C5YW.LIZ(CutSameEditData.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new CutSameEditData(readString, readString2, createStringArrayList, createStringArrayList2, readString3, readString4, arrayList, z, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameEditData[] newArray(int i) {
            return new CutSameEditData[i];
        }
    };

    @InterfaceC65349Pkn("conactFilePath")
    public final String conactFilePath;

    @InterfaceC65349Pkn("conactWorksapceId")
    public final String conactWorksapceId;

    @InterfaceC65349Pkn("cutsame_id")
    public final String cutSameMvId;

    @InterfaceC65349Pkn("is_h5")
    public final boolean isH5From;

    @InterfaceC65349Pkn("lastTextList")
    public final List<String> lastTextList;

    @InterfaceC65349Pkn("music_id")
    public final String musicId;

    @InterfaceC65349Pkn("open_client_key")
    public final String openClientKey;

    @InterfaceC65349Pkn("open_sdk_share_id")
    public final String openSdkShareId;

    @InterfaceC65349Pkn("originTextList")
    public final List<String> originTextList;

    @InterfaceC65349Pkn("src_video_data_list")
    public final List<EditVideoSegment> videoSegmentDataList;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutSameEditData)) {
            return false;
        }
        CutSameEditData cutSameEditData = (CutSameEditData) obj;
        return o.LJ(this.conactFilePath, cutSameEditData.conactFilePath) && o.LJ(this.conactWorksapceId, cutSameEditData.conactWorksapceId) && o.LJ(this.originTextList, cutSameEditData.originTextList) && o.LJ(this.lastTextList, cutSameEditData.lastTextList) && o.LJ(this.cutSameMvId, cutSameEditData.cutSameMvId) && o.LJ(this.musicId, cutSameEditData.musicId) && o.LJ(this.videoSegmentDataList, cutSameEditData.videoSegmentDataList) && this.isH5From == cutSameEditData.isH5From && o.LJ(this.openSdkShareId, cutSameEditData.openSdkShareId) && o.LJ(this.openClientKey, cutSameEditData.openClientKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.conactFilePath;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.conactWorksapceId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.originTextList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.lastTextList;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.cutSameMvId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.musicId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<EditVideoSegment> list3 = this.videoSegmentDataList;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        boolean z = this.isH5From;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode7 + i) * 31;
        String str5 = this.openSdkShareId;
        int hashCode8 = (i2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.openClientKey;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String LIZIZ() {
        JSONObject LIZJ = C65232Piu.LIZJ("infoStickerId", "");
        LIZJ.put("musicId", this.musicId);
        LIZJ.put("os", "android");
        LIZJ.put("product", "lv");
        LIZJ.put("stickerId", this.cutSameMvId);
        LIZJ.put("videoEffectId", "");
        LIZJ.put("videoId", "");
        return LIZJ.toString();
    }

    public final List<String> LIZLLL() {
        List<String> list = this.lastTextList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<String> list2 = this.originTextList;
        if (list2 == null || list2.isEmpty()) {
            return this.lastTextList;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.lastTextList) {
            if (!this.originTextList.contains(str) && !TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutSameEditData(conactFilePath=");
        LIZ.append(this.conactFilePath);
        LIZ.append(", conactWorksapceId=");
        LIZ.append(this.conactWorksapceId);
        LIZ.append(", originTextList=");
        LIZ.append(this.originTextList);
        LIZ.append(", lastTextList=");
        LIZ.append(this.lastTextList);
        LIZ.append(", cutSameMvId=");
        LIZ.append(this.cutSameMvId);
        LIZ.append(", musicId=");
        LIZ.append(this.musicId);
        LIZ.append(", videoSegmentDataList=");
        LIZ.append(this.videoSegmentDataList);
        LIZ.append(", isH5From=");
        LIZ.append(this.isH5From);
        LIZ.append(", openSdkShareId=");
        LIZ.append(this.openSdkShareId);
        LIZ.append(", openClientKey=");
        return q.LIZIZ(LIZ, this.openClientKey, ')', LIZ);
    }

    public final void LIZ(LinkedHashMap<String, String> linkedHashMap) {
        String str;
        String str2 = this.openClientKey;
        if (str2 == null || str2.length() == 0) {
            str = "aw7c4z4ej0o3efzd";
        } else {
            str = this.openClientKey;
        }
        linkedHashMap.put("open_platform_key", str);
        String str3 = this.openSdkShareId;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("open_platform_share_id", str3);
        linkedHashMap.put("open_platform_extra", "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.conactFilePath);
        out.writeString(this.conactWorksapceId);
        out.writeStringList(this.originTextList);
        out.writeStringList(this.lastTextList);
        out.writeString(this.cutSameMvId);
        out.writeString(this.musicId);
        List<EditVideoSegment> list = this.videoSegmentDataList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeParcelable((Parcelable) LIZIZ.next(), i);
            }
        }
        out.writeInt(this.isH5From ? 1 : 0);
        out.writeString(this.openSdkShareId);
        out.writeString(this.openClientKey);
    }

    public CutSameEditData(String str, String str2, List<String> list, List<String> list2, String str3, String str4, List<EditVideoSegment> list3, boolean z, String str5, String str6) {
        this.conactFilePath = str;
        this.conactWorksapceId = str2;
        this.originTextList = list;
        this.lastTextList = list2;
        this.cutSameMvId = str3;
        this.musicId = str4;
        this.videoSegmentDataList = list3;
        this.isH5From = z;
        this.openSdkShareId = str5;
        this.openClientKey = str6;
    }

    public /* synthetic */ CutSameEditData(String str, String str2, List list, List list2, String str3, String str4, List list3, boolean z, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : str5, (i & 512) == 0 ? str6 : null);
    }
}
