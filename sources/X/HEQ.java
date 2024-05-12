package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HEQ implements InterfaceC80245VeT {
    public final /* synthetic */ MvChoosePhotoActivity LIZ;

    public HEQ(MvChoosePhotoActivity mvChoosePhotoActivity) {
        this.LIZ = mvChoosePhotoActivity;
    }

    @Override // X.InterfaceC80245VeT
    public final WM7 LIZ(ClassLoader classLoader, String className) {
        o.LJIIIZ(classLoader, "<anonymous parameter 0>");
        o.LJIIIZ(className, "className");
        if (!TextUtils.equals("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene", className)) {
            return null;
        }
        MvChoosePhotoActivity mvChoosePhotoActivity = this.LIZ;
        MvChoosePhotoScene mvChoosePhotoScene = new MvChoosePhotoScene();
        Bundle LLJJIJI = C16880lQ.LLJJIJI(this.LIZ.getIntent());
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        mvChoosePhotoScene.mArguments = LLJJIJI;
        mvChoosePhotoActivity.LJLJI = mvChoosePhotoScene;
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ.LJLJI;
        if (mvChoosePhotoScene2 != null) {
            return mvChoosePhotoScene2;
        }
        o.LJIJI("rootScene");
        throw null;
    }
}
