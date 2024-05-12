package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model;

import X.C43118Gw6;
import X.C43966HNi;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MyMediaModel extends MediaModel {
    public static final C43966HNi Companion = new C43966HNi();
    public boolean canClip;
    public long clipDuration;
    public int copiedCount;
    public MyMediaModel copiedFromModel;
    public boolean isCorrectedResolution;
    public boolean isFromRecord;
    public int mediaIndex;
    public String mediaRatio;
    public int originIndex;
    public int selectIndex;

    public final MyMediaModel LJIIIIZZ() {
        String str = this.id;
        o.LJIIIIZZ(str, "this.id");
        MyMediaModel myMediaModel = new MyMediaModel(str);
        myMediaModel.fileLocalUriPath = this.fileLocalUriPath;
        myMediaModel.relativePath = this.relativePath;
        myMediaModel.fileName = this.fileName;
        myMediaModel.localUri = this.localUri;
        myMediaModel.albumClass = this.albumClass;
        myMediaModel.date = this.date;
        myMediaModel.type = this.type;
        myMediaModel.duration = this.duration;
        myMediaModel.fileSize = this.fileSize;
        myMediaModel.mimeType = this.mimeType;
        myMediaModel.thumbnail = this.thumbnail;
        myMediaModel.width = this.width;
        myMediaModel.height = this.height;
        myMediaModel.modify = this.modify;
        myMediaModel.originIndex = this.originIndex;
        myMediaModel.mediaIndex = this.mediaIndex;
        MyMediaModel myMediaModel2 = this.copiedFromModel;
        if (myMediaModel2 == null) {
            myMediaModel2 = this;
        }
        myMediaModel.copiedFromModel = myMediaModel2;
        myMediaModel.libraryState = this.libraryState;
        myMediaModel.isCorrectedResolution = this.isCorrectedResolution;
        return myMediaModel;
    }

    public final String LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.id);
        LIZ.append(this.selectIndex);
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.helper.MediaModel
    public final int hashCode() {
        if (C43118Gw6.LIZ()) {
            return LJII().hashCode();
        }
        return super.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.helper.MediaModel
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MyMediaModel(originIndex=");
        LIZ.append(this.originIndex);
        LIZ.append(", selectIndex=");
        LIZ.append(this.selectIndex);
        LIZ.append(", mediaIndex=");
        LIZ.append(this.mediaIndex);
        LIZ.append(", mediaRatio=");
        LIZ.append(this.mediaRatio);
        LIZ.append(", copiedCount=");
        LIZ.append(this.copiedCount);
        LIZ.append(", isCorrectedResolution=");
        LIZ.append(this.isCorrectedResolution);
        LIZ.append(", clipDuration=");
        LIZ.append(this.clipDuration);
        LIZ.append(", isFromRecord=");
        LIZ.append(this.isFromRecord);
        LIZ.append(", canClip=");
        LIZ.append(this.canClip);
        LIZ.append(") ");
        LIZ.append(super.toString());
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyMediaModel(String id) {
        super(id);
        o.LJIIIZ(id, "id");
        this.originIndex = -1;
        this.selectIndex = -1;
        this.mediaIndex = -1;
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.helper.MediaModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyMediaModel)) {
            return false;
        }
        if (C43118Gw6.LIZ()) {
            return TextUtils.equals(LJII(), ((MyMediaModel) obj).LJII());
        }
        return o.LJ(this.id, ((MediaModel) obj).id);
    }
}
