package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;

/* renamed from: X.HtK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45494HtK extends TMN {
    public final /* synthetic */ MvChoosePhotoScene LIZ;

    @Override // X.TMN
    public final void LIZ(View view) {
    }

    public C45494HtK(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LIZ = mvChoosePhotoScene;
    }

    @Override // X.TMN
    public final void LIZIZ(int i, View view) {
        if (i == 5) {
            C151535x7 c151535x7 = C151535x7.LIZ;
            CreativeInfo creativeInfo = this.LIZ.LLLLLZ;
            c151535x7.getClass();
            C151535x7.LIZ(creativeInfo);
            InterfaceC45242HpG interfaceC45242HpG = this.LIZ.LLLLL;
            if (interfaceC45242HpG != null) {
                interfaceC45242HpG.LJIJJLI();
            }
            this.LIZ.LLLIILIL();
            Activity activity = this.LIZ.mActivity;
            if (activity != null) {
                activity.overridePendingTransition(0, 0);
            }
        }
    }
}
