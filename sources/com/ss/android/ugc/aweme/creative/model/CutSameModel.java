package com.ss.android.ugc.aweme.creative.model;

import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CutSameMediaItem;
import com.ss.android.ugc.aweme.creative.model.CutSameModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CutSameModel implements Parcelable {
    public static final Parcelable.Creator<CutSameModel> CREATOR = new Parcelable.Creator<CutSameModel>() { // from class: X.6qy
        @Override // android.os.Parcelable.Creator
        public final CutSameModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(CutSameMediaItem.CREATOR, parcel, arrayList, i, 1);
            }
            return new CutSameModel(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameModel[] newArray(int i) {
            return new CutSameModel[i];
        }
    };

    @InterfaceC65349Pkn("cut_same_selected_template")
    public String selectedTemplate;

    @InterfaceC65349Pkn("cut_same_selected_template_media_item_list")
    public List<CutSameMediaItem> selectedTemplateMediaItemList;

    /* JADX WARN: Multi-variable type inference failed */
    public CutSameModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CutSameModel(String str, List<CutSameMediaItem> selectedTemplateMediaItemList) {
        o.LJIIIZ(selectedTemplateMediaItemList, "selectedTemplateMediaItemList");
        this.selectedTemplate = str;
        this.selectedTemplateMediaItemList = selectedTemplateMediaItemList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.selectedTemplate);
        Iterator LIZJ = UC7.LIZJ(this.selectedTemplateMediaItemList, out);
        while (LIZJ.hasNext()) {
            ((CutSameMediaItem) LIZJ.next()).writeToParcel(out, i);
        }
    }

    public /* synthetic */ CutSameModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
