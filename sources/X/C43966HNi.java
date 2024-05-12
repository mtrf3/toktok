package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HNi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43966HNi {
    public static MediaModel LIZ(MyMediaModel model) {
        o.LJIIIZ(model, "model");
        MediaModel mediaModel = new MediaModel(model.id);
        mediaModel.fileLocalUriPath = model.fileLocalUriPath;
        mediaModel.relativePath = model.relativePath;
        mediaModel.fileName = model.fileName;
        mediaModel.localUri = model.localUri;
        mediaModel.albumClass = model.albumClass;
        mediaModel.date = model.date;
        mediaModel.type = model.type;
        mediaModel.duration = model.duration;
        mediaModel.fileSize = model.fileSize;
        mediaModel.mimeType = model.mimeType;
        mediaModel.thumbnail = model.thumbnail;
        mediaModel.width = model.width;
        mediaModel.height = model.height;
        mediaModel.modify = model.modify;
        return mediaModel;
    }

    public static MyMediaModel LIZIZ(MediaModel model) {
        o.LJIIIZ(model, "model");
        String str = model.id;
        o.LJIIIIZZ(str, "model.id");
        MyMediaModel myMediaModel = new MyMediaModel(str);
        myMediaModel.fileLocalUriPath = model.fileLocalUriPath;
        myMediaModel.relativePath = model.relativePath;
        myMediaModel.fileName = model.fileName;
        myMediaModel.localUri = model.localUri;
        myMediaModel.albumClass = model.albumClass;
        myMediaModel.date = model.date;
        myMediaModel.type = model.type;
        myMediaModel.duration = model.duration;
        myMediaModel.fileSize = model.fileSize;
        myMediaModel.mimeType = model.mimeType;
        myMediaModel.thumbnail = model.thumbnail;
        myMediaModel.width = model.width;
        myMediaModel.height = model.height;
        myMediaModel.modify = model.modify;
        myMediaModel.libraryState = model.libraryState;
        return myMediaModel;
    }
}
