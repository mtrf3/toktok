package com.ss.android.ugc.aweme.sticker;

import X.EST;
import X.F9E;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SavePhotoStickerInfo extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<SavePhotoStickerInfo> CREATOR = new EST();

    @InterfaceC65349Pkn(alternate = {"c"}, value = "capturedPhotoDir")
    public String capturedPhotoDir;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn(alternate = {"a"}, value = "capturedPhotoPaths")
    public List<String> capturedPhotoPaths;

    @InterfaceC65349Pkn(alternate = {"d"}, value = "shouldRemoveLabel")
    public Boolean shouldRemoveLabel;

    @InterfaceC65349Pkn(alternate = {"b"}, value = "stickerToast")
    public final String stickerToast;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavePhotoStickerInfo copy$default(SavePhotoStickerInfo savePhotoStickerInfo, List list, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = savePhotoStickerInfo.capturedPhotoPaths;
        }
        if ((i & 2) != 0) {
            str = savePhotoStickerInfo.stickerToast;
        }
        if ((i & 4) != 0) {
            str2 = savePhotoStickerInfo.capturedPhotoDir;
        }
        if ((i & 8) != 0) {
            bool = savePhotoStickerInfo.shouldRemoveLabel;
        }
        return savePhotoStickerInfo.copy(list, str, str2, bool);
    }

    public final SavePhotoStickerInfo copy(List<String> list, String str, String str2, Boolean bool) {
        return new SavePhotoStickerInfo(list, str, str2, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.capturedPhotoPaths, this.stickerToast, this.capturedPhotoDir, this.shouldRemoveLabel};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        o.LJIIIZ(parcel, "parcel");
        parcel.writeStringList(this.capturedPhotoPaths);
        parcel.writeString(this.stickerToast);
        parcel.writeString(this.capturedPhotoDir);
        Boolean bool = this.shouldRemoveLabel;
        if (bool != null) {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public final String getCapturedPhotoDir() {
        return this.capturedPhotoDir;
    }

    public final List<String> getCapturedPhotoPaths() {
        return this.capturedPhotoPaths;
    }

    public final Boolean getShouldRemoveLabel() {
        return this.shouldRemoveLabel;
    }

    public final String getStickerToast() {
        return this.stickerToast;
    }

    public final void setCapturedPhotoDir(String str) {
        this.capturedPhotoDir = str;
    }

    public final void setCapturedPhotoPaths(List<String> list) {
        this.capturedPhotoPaths = list;
    }

    public final void setShouldRemoveLabel(Boolean bool) {
        this.shouldRemoveLabel = bool;
    }

    public SavePhotoStickerInfo(List<String> list, String str, String str2, Boolean bool) {
        this.capturedPhotoPaths = list;
        this.stickerToast = str;
        this.capturedPhotoDir = str2;
        this.shouldRemoveLabel = bool;
    }
}
