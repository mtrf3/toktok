package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.C71575S7f;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.S7Y;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateListData extends F9E implements Parcelable {

    @InterfaceC65349Pkn("templates_list")
    public final List<RespTemplateItem> templateList;
    public static final C71575S7f Companion = new C71575S7f();
    public static final Parcelable.Creator<TemplateListData> CREATOR = new S7Y();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.templateList};
    }

    public TemplateListData(List<RespTemplateItem> templateList) {
        o.LJIIIZ(templateList, "templateList");
        this.templateList = templateList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.templateList, out);
        while (LIZJ.hasNext()) {
            ((RespTemplateItem) LIZJ.next()).writeToParcel(out, i);
        }
    }
}
