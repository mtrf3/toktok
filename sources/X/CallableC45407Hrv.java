package X;

import Y.AgS124S0100000_7;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import java.util.concurrent.Callable;

/* renamed from: X.Hrv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC45407Hrv<V> implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ C45411Hrz LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ CompletionBlock<InterfaceC45408Hrw> LJLJLLL;

    public CallableC45407Hrv(int i, int i2, int i3, int i4, View view, C45411Hrz c45411Hrz, int i5, boolean z, C37356ElM c37356ElM) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = view;
        this.LJLJJLL = c45411Hrz;
        this.LJLJL = i5;
        this.LJLJLJ = z;
        this.LJLJLLL = c37356ElM;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bitmap createBitmap = Bitmap.createBitmap(this.LJLIL, this.LJLILLLLZI, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-this.LJLJI, -this.LJLJJI);
        C39214FaE c39214FaE = C37203Eit.LIZJ;
        View view = this.LJLJJL;
        c39214FaE.getClass();
        C39214FaE.LIZ(view, canvas);
        C45411Hrz c45411Hrz = this.LJLJJLL;
        int i = this.LJLJL;
        boolean z = this.LJLJLJ;
        CompletionBlock<InterfaceC45408Hrw> completionBlock = this.LJLJLLL;
        c45411Hrz.getClass();
        C10K.LIZIZ(new CallableC45401Hrp(createBitmap, i, c45411Hrz, z), C10K.LJI, null).LJ(new AgS124S0100000_7(completionBlock, 33), C10K.LJIIIIZZ, null);
        return Boolean.TRUE;
    }
}
