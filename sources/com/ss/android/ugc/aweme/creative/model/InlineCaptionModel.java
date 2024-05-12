package com.ss.android.ugc.aweme.creative.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class InlineCaptionModel implements Parcelable {
    public static final Parcelable.Creator<InlineCaptionModel> CREATOR = new Parcelable.Creator<InlineCaptionModel>() { // from class: X.6Au
        @Override // android.os.Parcelable.Creator
        public final InlineCaptionModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = C5YW.LIZ(InlineCaptionModel.class, parcel, arrayList, i, 1);
                }
            }
            return new InlineCaptionModel(readString, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final InlineCaptionModel[] newArray(int i) {
            return new InlineCaptionModel[i];
        }
    };

    @InterfaceC65349Pkn("audio_uri")
    public String audioUri;

    @InterfaceC65349Pkn("r")
    public float rotation;

    @InterfaceC65349Pkn("s")
    public float scale;

    @InterfaceC65349Pkn("select_language")
    public String selectLanguage;

    @InterfaceC65349Pkn("select_language_code")
    public String selectLanguageCode;

    @InterfaceC65349Pkn("task_id")
    public String taskId;

    @InterfaceC65349Pkn("utterance_list")
    public ArrayList<StickerItemModel> utterances;

    @InterfaceC65349Pkn("x")
    public float x;

    @InterfaceC65349Pkn("y")
    public float y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InlineCaptionModel() {
        /*
            r12 = this;
            r1 = 0
            r6 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r6
            r8 = r6
            r9 = r6
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.InlineCaptionModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.audioUri);
        ArrayList<StickerItemModel> arrayList = this.utterances;
        if (arrayList == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList.size());
            Iterator<StickerItemModel> it = arrayList.iterator();
            while (it.hasNext()) {
                out.writeParcelable(it.next(), i);
            }
        }
        out.writeString(this.selectLanguageCode);
        out.writeString(this.selectLanguage);
        out.writeString(this.taskId);
        out.writeFloat(this.x);
        out.writeFloat(this.y);
        out.writeFloat(this.rotation);
        out.writeFloat(this.scale);
    }

    public InlineCaptionModel(String str, ArrayList<StickerItemModel> arrayList, String str2, String str3, String str4, float f, float f2, float f3, float f4) {
        this.audioUri = str;
        this.utterances = arrayList;
        this.selectLanguageCode = str2;
        this.selectLanguage = str3;
        this.taskId = str4;
        this.x = f;
        this.y = f2;
        this.rotation = f3;
        this.scale = f4;
    }

    public /* synthetic */ InlineCaptionModel(String str, ArrayList arrayList, String str2, String str3, String str4, float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : arrayList, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? 0.0f : f, (i & 64) != 0 ? 0.0f : f2, (i & 128) != 0 ? 0.0f : f3, (i & 256) == 0 ? f4 : 0.0f);
    }
}
