package X;

import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Wbt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82633Wbt implements InterfaceC83883Ww3 {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC83883Ww3
    public final String LIZ() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC83883Ww3
    public final boolean LIZIZ() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC83883Ww3
    public final boolean LIZJ() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC83883Ww3
    public final int LIZLLL() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC83883Ww3
    public final int LJI() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC83883Ww3
    public final String LJIIIIZZ() {
        return this.LJLILLLLZI;
    }

    public C82633Wbt(CameraComponentModel cameraComponentModel) {
        boolean z;
        o.LJIIIZ(cameraComponentModel, "cameraComponentModel");
        if (cameraComponentModel.gameDuetResource != null) {
            z = true;
        } else {
            z = false;
        }
        this.LJLIL = z;
        DuetContext duetContext = cameraComponentModel.duetContext;
        String str = duetContext.duetAudioPath;
        this.LJLILLLLZI = str == null ? "" : str;
        String str2 = duetContext.duetVideoPath;
        this.LJLJI = str2 != null ? str2 : "";
        this.LJLJJI = duetContext.duetVideoWidth;
        this.LJLJJL = duetContext.duetVideoHeight;
    }
}
