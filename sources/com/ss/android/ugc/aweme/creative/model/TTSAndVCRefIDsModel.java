package com.ss.android.ugc.aweme.creative.model;

import X.C58462Re;
import X.H8N;
import X.H8R;
import X.InterfaceC65349Pkn;
import X.ORZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TTSAndVCRefIDsModel implements Parcelable {

    @InterfaceC65349Pkn("tts_voice_ids")
    public ArrayList<String> ttsVoiceIDs;

    @InterfaceC65349Pkn("tts_voice_ref_ids")
    public ArrayList<String> ttsVoiceRefIDs;

    @InterfaceC65349Pkn("vc_voice_ids")
    public ArrayList<String> vcVoiceIDs;

    @InterfaceC65349Pkn("vc_voice_ref_ids")
    public ArrayList<String> vcVoiceRefIDs;
    public static final H8R Companion = new H8R();
    public static final Parcelable.Creator<TTSAndVCRefIDsModel> CREATOR = new H8N();

    /* JADX WARN: Multi-variable type inference failed */
    public TTSAndVCRefIDsModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeStringList(this.ttsVoiceIDs);
        out.writeStringList(this.ttsVoiceRefIDs);
        out.writeStringList(this.vcVoiceIDs);
        out.writeStringList(this.vcVoiceRefIDs);
    }

    public static final String LIZ(List<String> list) {
        Companion.getClass();
        if (list != null) {
            return ORZ.LLD(list, null, null, null, C58462Re.LJLIL, 31);
        }
        return "";
    }

    public TTSAndVCRefIDsModel(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4) {
        this.ttsVoiceIDs = arrayList;
        this.ttsVoiceRefIDs = arrayList2;
        this.vcVoiceIDs = arrayList3;
        this.vcVoiceRefIDs = arrayList4;
    }

    public /* synthetic */ TTSAndVCRefIDsModel(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : arrayList2, (i & 4) != 0 ? null : arrayList3, (i & 8) != 0 ? null : arrayList4);
    }
}
