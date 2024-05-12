package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Oa0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62132Oa0 extends View {
    public float LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public final Paint LJLJJL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        Paint paint = this.LJLJJL;
        Context context = getContext();
        o.LJIIIIZZ(context, "this.context");
        paint.setColor(AnonymousClass636.LJIIIIZZ(R.attr.ee, context));
        this.LJLJJL.setAntiAlias(true);
        int LIZIZ = C60996Nwm.LIZIZ(getContext());
        int LJ = C60996Nwm.LJ(getContext());
        float f = this.LJLIL - 0.0f;
        float f2 = this.LJLILLLLZI + 0.0f;
        float f3 = this.LJLJI - 0.0f;
        float f4 = this.LJLJJI + 0.0f;
        float f5 = LIZIZ;
        canvas.drawRect(0.0f, 0.0f, f5, f, this.LJLJJL);
        float f6 = 1;
        float f7 = f2 + f6;
        canvas.drawRect(0.0f, f, f3, f7, this.LJLJJL);
        canvas.drawRect(f4 + f6, f, f5, f7, this.LJLJJL);
        canvas.drawRect(0.0f, f7, f5, LJ, this.LJLJJL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62132Oa0(ScanQRCodeActivityV2 scanQRCodeActivityV2, float f, float f2, float f3, float f4) {
        super(scanQRCodeActivityV2);
        new LinkedHashMap();
        this.LJLIL = f2;
        this.LJLILLLLZI = f4;
        this.LJLJI = f;
        this.LJLJJI = f3;
        this.LJLJJL = new Paint();
    }
}
