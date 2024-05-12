package com.ss.android.ugc.aweme.creative.model;

import X.C61878OQg;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VoiceConversionModel implements Parcelable {
    public static final Parcelable.Creator<VoiceConversionModel> CREATOR = new Parcelable.Creator<VoiceConversionModel>() { // from class: X.5Vm
        @Override // android.os.Parcelable.Creator
        public final VoiceConversionModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
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
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(parcel.readString());
            }
            return new VoiceConversionModel(readString, readString2, readString3, createStringArrayList, createStringArrayList2, z, z2, linkedHashSet, parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final VoiceConversionModel[] newArray(int i) {
            return new VoiceConversionModel[i];
        }
    };

    @InterfaceC65349Pkn("has_dub_voice_conversion_param")
    public boolean hasDubVoiceConversion;

    @InterfaceC65349Pkn("has_origin_voice_conversion")
    public boolean hasOriginVoiceConversion;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("original_record_path")
    public String originalRecordPath;

    @InterfaceC65349Pkn("vc_filter_creator_uids")
    public ArrayList<String> vcCreatorIDs;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("voice_conversion_multi_origin_path")
    public List<String> vcMultiOriginPathList;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("voice_conversion_multi_record_path")
    public List<String> vcMultiRecordPathList;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("voice_conversion_origin_path")
    public String vcOriginPath;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("voice_conversion_record_path")
    public String vcRecordPath;

    @InterfaceC65349Pkn("vc_voice_ids")
    public ArrayList<String> vcVoiceIDs;

    @InterfaceC65349Pkn("voice_modify_id")
    public Set<String> voiceModifyIds;

    public VoiceConversionModel() {
        this(null, null, null, null, null, false, false, null, null, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.originalRecordPath);
        out.writeString(this.vcOriginPath);
        out.writeString(this.vcRecordPath);
        out.writeStringList(this.vcMultiRecordPathList);
        out.writeStringList(this.vcMultiOriginPathList);
        out.writeInt(this.hasOriginVoiceConversion ? 1 : 0);
        out.writeInt(this.hasDubVoiceConversion ? 1 : 0);
        Set<String> set = this.voiceModifyIds;
        out.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            out.writeString(it.next());
        }
        out.writeStringList(this.vcVoiceIDs);
        out.writeStringList(this.vcCreatorIDs);
    }

    public VoiceConversionModel(String originalRecordPath, String vcOriginPath, String vcRecordPath, List<String> vcMultiRecordPathList, List<String> vcMultiOriginPathList, boolean z, boolean z2, Set<String> voiceModifyIds, ArrayList<String> vcVoiceIDs, ArrayList<String> vcCreatorIDs) {
        o.LJIIIZ(originalRecordPath, "originalRecordPath");
        o.LJIIIZ(vcOriginPath, "vcOriginPath");
        o.LJIIIZ(vcRecordPath, "vcRecordPath");
        o.LJIIIZ(vcMultiRecordPathList, "vcMultiRecordPathList");
        o.LJIIIZ(vcMultiOriginPathList, "vcMultiOriginPathList");
        o.LJIIIZ(voiceModifyIds, "voiceModifyIds");
        o.LJIIIZ(vcVoiceIDs, "vcVoiceIDs");
        o.LJIIIZ(vcCreatorIDs, "vcCreatorIDs");
        this.originalRecordPath = originalRecordPath;
        this.vcOriginPath = vcOriginPath;
        this.vcRecordPath = vcRecordPath;
        this.vcMultiRecordPathList = vcMultiRecordPathList;
        this.vcMultiOriginPathList = vcMultiOriginPathList;
        this.hasOriginVoiceConversion = z;
        this.hasDubVoiceConversion = z2;
        this.voiceModifyIds = voiceModifyIds;
        this.vcVoiceIDs = vcVoiceIDs;
        this.vcCreatorIDs = vcCreatorIDs;
    }

    public VoiceConversionModel(String str, String str2, String str3, List list, List list2, boolean z, boolean z2, Set set, ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? C61878OQg.INSTANCE : list, (i & 16) != 0 ? C61878OQg.INSTANCE : list2, (i & 32) != 0 ? false : z, (i & 64) == 0 ? z2 : false, (i & 128) != 0 ? new LinkedHashSet() : set, (i & 256) != 0 ? new ArrayList() : arrayList, (i & 512) != 0 ? new ArrayList() : arrayList2);
    }
}
