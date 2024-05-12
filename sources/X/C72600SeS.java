package X;

import Y.ARunnableS13S1100000_12;
import android.opengl.GLSurfaceView;
import com.ss.android.ugc.aweme.view.autocreation.ProfileNaviAutoCreationCameraContainerFragment;
import com.zhiliaoapp.musically.R;
import java.util.Date;

/* renamed from: X.SeS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72600SeS extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ProfileNaviAutoCreationCameraContainerFragment LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72600SeS(int i, int i2, ProfileNaviAutoCreationCameraContainerFragment profileNaviAutoCreationCameraContainerFragment, String str) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = profileNaviAutoCreationCameraContainerFragment;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (this.LJLIL == 8193) {
            String valueOf = String.valueOf(new Date().getTime());
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("end_time", valueOf);
            c188727au.LJIIIZ("enter_from", "avatar_hub");
            c188727au.LJIIIZ("enter_method", "click");
            FMX.LJIIL("capture_auto_avatar_scan", c188727au.LIZ);
            int i = this.LJLILLLLZI;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        this.LJLJI.vl(R.string.gqr);
                    } else {
                        this.LJLJI.vl(R.string.c0_);
                    }
                } else {
                    this.LJLJI.vl(R.string.c0a);
                }
            } else {
                ProfileNaviAutoCreationCameraContainerFragment profileNaviAutoCreationCameraContainerFragment = this.LJLJI;
                String str = this.LJLJJI;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) profileNaviAutoCreationCameraContainerFragment._$_findCachedViewById(R.id.i7o);
                if (gLSurfaceView != null) {
                    gLSurfaceView.queueEvent(new ARunnableS13S1100000_12(profileNaviAutoCreationCameraContainerFragment, str, 0));
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
