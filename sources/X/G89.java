package X;

import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class G89 implements OnActivityResultCallback {
    public final /* synthetic */ C41051G9f LJLIL;

    public G89(C41051G9f c41051G9f) {
        this.LJLIL = c41051G9f;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.getBooleanExtra("need_update", false)) {
            VideoPublishEditModel videoPublishEditModel = this.LJLIL.LJZ;
            if (videoPublishEditModel != null) {
                videoPublishEditModel.tagUserList = (ArrayList) intent.getSerializableExtra("tagged_user_list");
                this.LJLIL.LLJILJILJ();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }
}
