package com.ss.android.ugc.aweme.sticker.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.TextStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TextStruct extends F9E implements Parcelable {
    public static final Parcelable.Creator<TextStruct> CREATOR = new Parcelable.Creator<TextStruct>() { // from class: X.8qe
        @Override // android.os.Parcelable.Creator
        public final TextStruct createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(CreateAnchorInfo.CREATOR, parcel, arrayList, i, 1);
            }
            return new TextStruct(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final TextStruct[] newArray(int i) {
            return new TextStruct[i];
        }
    };

    @InterfaceC65349Pkn("anchors")
    public final List<CreateAnchorInfo> anchors;

    /* JADX WARN: Multi-variable type inference failed */
    public TextStruct() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextStruct copy$default(TextStruct textStruct, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = textStruct.anchors;
        }
        return textStruct.copy(list);
    }

    public final TextStruct copy(List<CreateAnchorInfo> anchors) {
        o.LJIIIZ(anchors, "anchors");
        return new TextStruct(anchors);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.anchors};
    }

    public final List<CreateAnchorInfo> getAnchors() {
        return this.anchors;
    }

    public TextStruct(List<CreateAnchorInfo> anchors) {
        o.LJIIIZ(anchors, "anchors");
        this.anchors = anchors;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.anchors, out);
        while (LIZJ.hasNext()) {
            ((CreateAnchorInfo) LIZJ.next()).writeToParcel(out, i);
        }
    }

    public /* synthetic */ TextStruct(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
