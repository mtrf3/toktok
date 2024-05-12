package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.Iterator;

/* renamed from: X.Ief, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47133Ief implements InterfaceC47667InH {
    public final /* synthetic */ C47132Iee LJLIL;

    @Override // X.InterfaceC47667InH
    public final void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
        String str;
        this.LJLIL.getClass();
        C47132Iee c47132Iee = this.LJLIL;
        c47132Iee.LJLJL = false;
        c47132Iee.LJLJLJ = false;
        c47132Iee.LJLILLLLZI = 0;
        Iterator<OnUIPlayListener> it = c47132Iee.LJLJJL.iterator();
        while (it.hasNext()) {
            OnUIPlayListener next = it.next();
            Aweme aweme = c47132Iee.LJLJJLL;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            next.onPlayStop(str);
        }
    }

    public C47133Ief(C47132Iee c47132Iee) {
        this.LJLIL = c47132Iee;
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        this.LJLIL.getClass();
        C47132Iee c47132Iee = this.LJLIL;
        if (c47132Iee.LJLJL) {
            c47132Iee.LIZJ().setSurface(c47132Iee.LJLJJI.getSurface());
        }
    }
}
