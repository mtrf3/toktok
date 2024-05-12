package com.ss.android.ugc.aweme.creative.model.publish;

import X.C41339GKh;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CaptionModel implements Parcelable {
    public static final Parcelable.Creator<CaptionModel> CREATOR = new C41339GKh();

    @InterfaceC65349Pkn("chain")
    public String chain;

    @InterfaceC65349Pkn("disable_delete_chain")
    public boolean disableDeleteChain;

    @InterfaceC65349Pkn("markup_extra")
    public List<AVTextExtraStruct> markupExtra;

    @InterfaceC65349Pkn("markup_text")
    public String markupText;

    public CaptionModel() {
        this(null, null, null, false, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.markupText);
        Iterator LIZJ = UC7.LIZJ(this.markupExtra, out);
        while (LIZJ.hasNext()) {
            ((AVTextExtraStruct) LIZJ.next()).writeToParcel(out, i);
        }
        out.writeString(this.chain);
        out.writeInt(this.disableDeleteChain ? 1 : 0);
    }

    public CaptionModel(String str, List<AVTextExtraStruct> markupExtra, String str2, boolean z) {
        o.LJIIIZ(markupExtra, "markupExtra");
        this.markupText = str;
        this.markupExtra = markupExtra;
        this.chain = str2;
        this.disableDeleteChain = z;
    }

    public CaptionModel(String str, List list, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z);
    }
}
