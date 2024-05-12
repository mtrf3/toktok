package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5LM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LM {
    public static boolean LIZ(VideoEditContainerScene rootScene, VideoPublishEditModel videoPublishEditModel) {
        String str;
        boolean z;
        EditorProModel editorProModel;
        o.LJIIIZ(rootScene, "rootScene");
        Bundle bundle = rootScene.mArguments;
        if (bundle != null) {
            str = bundle.getString("editor_pro_anchor_type");
        } else {
            str = null;
        }
        Bundle bundle2 = rootScene.LLILZIL;
        if (bundle2 != null && bundle2.containsKey("editor_pro_init_data")) {
            z = true;
        } else {
            z = false;
        }
        if (!C78685UuP.LJJJZ(str) && !z && (videoPublishEditModel == null || (editorProModel = videoPublishEditModel.getEditorProModel()) == null || !editorProModel.getFromEditorProEntranceInAlbum() || H7R.LJJJI(videoPublishEditModel))) {
            return false;
        }
        return true;
    }
}
