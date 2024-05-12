package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokPublishGroupSceneFragment;
import java.util.List;

/* loaded from: classes8.dex */
public final class G5K {
    public final Fragment LIZ;
    public final G74 LIZIZ;
    public C41017G7x LIZLLL;
    public InterfaceC30795C6t LJ;
    public VideoPublishEditModel LJI;
    public PermissionConfigure LJFF = new PermissionConfigure();
    public final int LIZJ = 0;

    public final int LIZ() {
        return this.LIZIZ.getPermission();
    }

    public final void LIZJ(InterfaceC30795C6t interfaceC30795C6t) {
        C41017G7x c41017G7x = this.LIZLLL;
        if (c41017G7x == null) {
            return;
        }
        c41017G7x.getClass();
        this.LIZLLL.LIZ = interfaceC30795C6t;
    }

    public G5K(TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment, G74 g74) {
        this.LIZ = tikTokPublishGroupSceneFragment;
        this.LIZIZ = g74;
    }

    public final void LIZLLL(String str, boolean z) {
        this.LJFF = new PermissionConfigure(this.LIZJ, this.LIZIZ.getPermission(), this.LIZIZ.LJLLI, this.LJI, new PostBtnConfigure(z, ""), str);
    }

    public final void LIZIZ(List list, int i, int i2, boolean z) {
        G74 g74 = this.LIZIZ;
        g74.LJLLI = z;
        g74.LJLL = i2;
        g74.LIZLLL(i, i2, list);
    }
}
