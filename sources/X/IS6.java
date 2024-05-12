package X;

import android.content.DialogInterface;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IS6 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C70756Rpo LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ DialogC70776Rq8 LJLJI;
    public final /* synthetic */ C70770Rq2 LJLJJI;

    public IS6(C70756Rpo c70756Rpo, int i, DialogC70776Rq8 dialogC70776Rq8, C70770Rq2 c70770Rq2) {
        this.LJLIL = c70756Rpo;
        this.LJLILLLLZI = i;
        this.LJLJI = dialogC70776Rq8;
        this.LJLJJI = c70770Rq2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ynr, X.Prl] */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        TextureView textureView;
        SurfaceTexture surfaceTexture;
        ?? r2 = this.LJLIL.LJLLLL;
        if (r2 != 0) {
            r2.invoke(Boolean.FALSE, Integer.valueOf(this.LJLILLLLZI));
        }
        DialogC70776Rq8 dialogC70776Rq8 = this.LJLJI;
        C70770Rq2 listener = this.LJLJJI;
        dialogC70776Rq8.getClass();
        o.LJIIIZ(listener, "listener");
        ((ArrayList) dialogC70776Rq8.LJLJLJ).remove(listener);
        C73044Slc c73044Slc = this.LJLIL.LLFF;
        if (c73044Slc != null && (textureView = (TextureView) c73044Slc.findViewById(R.id.n8n)) != null && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
            C70756Rpo c70756Rpo = this.LJLIL;
            c70756Rpo.LJLL.LJI(new Surface(surfaceTexture));
            c70756Rpo.LJLL.LIZ = surfaceTexture;
        }
        C70756Rpo c70756Rpo2 = this.LJLIL;
        c70756Rpo2.LLFFF = true;
        C73044Slc c73044Slc2 = c70756Rpo2.LLFF;
        if (c73044Slc2 != null) {
            c73044Slc2.LJIIJ();
        }
    }
}
