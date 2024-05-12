package X;

import Y.IDRunnableS0S0201000;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.InX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47683InX extends TextureView implements InterfaceC46937IbV {
    public static int LJLJJLL;
    public static final C47686Ina LJLJL;
    public final String LJLIL;
    public TextureView.SurfaceTextureListener LJLILLLLZI;
    public SurfaceWrapper LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    @Override // X.InterfaceC46937IbV
    public final void LIZ() {
    }

    @Override // X.InterfaceC46937IbV
    public final void LIZLLL(String str, boolean z) {
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        this.LJLJJI = true;
        if (getSurfaceTexture() == null) {
            if (this.LJLJJL) {
                this.LJLJJL = false;
                SimRadar.keyScan("TextureView", o.LJIILLIIL(": reuseSurfaceTexture: noReuse", this.LJLIL), new Object[0]);
            } else {
                C47686Ina c47686Ina = LJLJL;
                java.util.Set<SurfaceTexture> keySet = c47686Ina.LJLJJI.keySet();
                o.LJIIIIZZ(keySet, "textureStore.keys");
                SurfaceTexture surfaceTexture = (SurfaceTexture) ORZ.LJLLL(keySet);
                if (surfaceTexture == null) {
                    surfaceTexture = null;
                } else {
                    c47686Ina.LJLJJI.remove(surfaceTexture);
                }
                SimRadar.keyScan("TextureView", "DTextureView: getSurfaceTexture: " + surfaceTexture + ", store.size = " + c47686Ina.LJLJJI.size(), new Object[0]);
                if (surfaceTexture != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(this.LJLIL);
                    LIZ.append(": reuseSurfaceTexture: ");
                    LIZ.append(surfaceTexture);
                    SimRadar.keyScan("TextureView", X1D.LIZIZ(LIZ), new Object[0]);
                    setSurfaceTexture(surfaceTexture);
                }
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.LJLJJI = false;
        LIZIZ();
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable background) {
        o.LJIIIZ(background, "background");
    }

    static {
        new CopyOnWriteArrayList();
        LJLJL = new C47686Ina();
    }

    public final void LIZIZ() {
        SurfaceWrapper surfaceWrapper = this.LJLJI;
        if (surfaceWrapper == null) {
            return;
        }
        try {
            new AqS158S0100000_8(surfaceWrapper, 536).invoke();
        } catch (Throwable unused) {
        }
        this.LJLJI = null;
    }

    @Override // X.InterfaceC46937IbV
    public final void LJ() {
        LIZIZ();
        post(new IDRunnableS6S0101000(7, this, 26));
    }

    public final Surface getSurface() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47683InX(Context context) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        int i = LJLJJLL;
        LJLJJLL = i + 1;
        this.LJLIL = o.LJIILLIIL(Integer.valueOf(i), "DTextureView#");
        super.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC47684InY(this));
    }

    @Override // android.view.TextureView
    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        o.LJIIIZ(surfaceTexture, "surfaceTexture");
        super.setSurfaceTexture(surfaceTexture);
        post(new IDRunnableS0S0201000(4, this, surfaceTexture, 11));
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.LJLILLLLZI = surfaceTextureListener;
    }
}
