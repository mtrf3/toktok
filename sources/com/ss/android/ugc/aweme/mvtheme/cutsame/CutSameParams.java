package com.ss.android.ugc.aweme.mvtheme.cutsame;

import X.C36474ETe;
import X.C36475ETf;
import X.F9E;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CutSameParams extends F9E implements Parcelable {
    public String enterFrom;
    public int enterStyle;
    public Bundle extraBundle;
    public ArrayList<String> inputPathList;
    public boolean isEnterEditActivity;
    public String templateId;
    public static final C36475ETf Companion = new C36475ETf();
    public static final Parcelable.Creator<CutSameParams> CREATOR = new C36474ETe();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.templateId, this.enterFrom, Integer.valueOf(this.enterStyle), this.inputPathList, Boolean.valueOf(this.isEnterEditActivity), this.extraBundle};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.templateId);
        parcel.writeString(this.enterFrom);
        parcel.writeInt(this.enterStyle);
        ArrayList<String> arrayList = this.inputPathList;
        if (arrayList != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.isEnterEditActivity ? 1 : 0);
        parcel.writeBundle(this.extraBundle);
    }

    public CutSameParams(String str, String str2, int i, ArrayList<String> arrayList, boolean z, Bundle extraBundle) {
        o.LJIIIZ(extraBundle, "extraBundle");
        this.templateId = str;
        this.enterFrom = str2;
        this.enterStyle = i;
        this.inputPathList = arrayList;
        this.isEnterEditActivity = z;
        this.extraBundle = extraBundle;
    }
}
