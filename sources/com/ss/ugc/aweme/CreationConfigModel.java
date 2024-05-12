package com.ss.ugc.aweme;

import X.HIG;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.EditConfigModel;
import com.ss.ugc.aweme.creation.base.PublishConfigModel;
import com.ss.ugc.aweme.creation.base.RecordConfigModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class CreationConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreationConfigModel> CREATOR = new HIG();

    @InterfaceC65349Pkn("basic")
    public BasicModel basic;

    @InterfaceC65349Pkn("edit")
    public EditConfigModel edit;

    @InterfaceC65349Pkn("page_stack")
    public String pageStack;

    @InterfaceC65349Pkn("publish")
    public PublishConfigModel publish;

    @InterfaceC65349Pkn("record")
    public RecordConfigModel record;

    /* JADX WARN: Multi-variable type inference failed */
    public CreationConfigModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.pageStack);
        parcel.writeParcelable(this.basic, i);
        parcel.writeParcelable(this.publish, i);
        parcel.writeParcelable(this.record, i);
        parcel.writeParcelable(this.edit, i);
    }

    public final BasicModel getBasic() {
        return this.basic;
    }

    public final EditConfigModel getEdit() {
        return this.edit;
    }

    public final String getPageStack() {
        return this.pageStack;
    }

    public final PublishConfigModel getPublish() {
        return this.publish;
    }

    public final RecordConfigModel getRecord() {
        return this.record;
    }

    public final void setBasic(BasicModel basicModel) {
        this.basic = basicModel;
    }

    public final void setEdit(EditConfigModel editConfigModel) {
        this.edit = editConfigModel;
    }

    public final void setPageStack(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.pageStack = str;
    }

    public final void setPublish(PublishConfigModel publishConfigModel) {
        this.publish = publishConfigModel;
    }

    public final void setRecord(RecordConfigModel recordConfigModel) {
        this.record = recordConfigModel;
    }

    public CreationConfigModel(String pageStack, BasicModel basicModel, PublishConfigModel publishConfigModel, RecordConfigModel recordConfigModel, EditConfigModel editConfigModel) {
        o.LJIIIZ(pageStack, "pageStack");
        this.pageStack = pageStack;
        this.basic = basicModel;
        this.publish = publishConfigModel;
        this.record = recordConfigModel;
        this.edit = editConfigModel;
    }

    public /* synthetic */ CreationConfigModel(String str, BasicModel basicModel, PublishConfigModel publishConfigModel, RecordConfigModel recordConfigModel, EditConfigModel editConfigModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : basicModel, (i & 4) != 0 ? null : publishConfigModel, (i & 8) != 0 ? null : recordConfigModel, (i & 16) == 0 ? editConfigModel : null);
    }
}
