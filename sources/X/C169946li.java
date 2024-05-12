package X;

import android.view.TextureView;
import com.ss.android.vesdk.VEEditor;

/* renamed from: X.6li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169946li implements InterfaceC170196m7 {
    public final C133765Mu LIZ;
    public long LIZIZ;
    public long LIZJ;
    public double LIZLLL = 1.0d;

    public C169946li(String str, TextureView textureView) {
        this.LIZ = new C133765Mu(str, textureView);
    }

    public final void LIZ(long j, long j2) {
        boolean z;
        if (this.LIZ.getState() == VEEditor.VEState.STARTED) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZ.LLLFZ(((int) j) / 2, ((int) j2) / 2);
        this.LIZ.LLJJJIL((int) (j / this.LIZLLL), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing);
        if (z) {
            this.LIZ.play();
        }
    }
}
