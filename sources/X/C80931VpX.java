package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.ss.android.ugc.aweme.vision.background.CropImageWindowViewModel;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import kotlin.jvm.internal.o;

/* renamed from: X.VpX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80931VpX<T> implements InterfaceC86003Zc {
    public final /* synthetic */ PhotoSearchEnterParams LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ CropImageWindowViewModel LJLJI;
    public final /* synthetic */ String LJLJJI;

    public C80931VpX(PhotoSearchEnterParams photoSearchEnterParams, Context context, CropImageWindowViewModel cropImageWindowViewModel, String str, int i) {
        this.LJLIL = photoSearchEnterParams;
        this.LJLILLLLZI = context;
        this.LJLJI = cropImageWindowViewModel;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<OSZ<Bitmap, Bitmap>> interfaceC73573Su9) {
        Bitmap bitmap;
        PhotoSearchEnterParams photoSearchEnterParams = this.LJLIL;
        android.net.Uri uri = null;
        if (photoSearchEnterParams != null) {
            uri = photoSearchEnterParams.getLocalPathUri();
        }
        Bitmap LJIILL = C78897Uxp.LJIILL(this.LJLILLLLZI, uri);
        if (LJIILL != null) {
            if (this.LJLJI.LJLIL != null) {
                RectF LJIIJJI = KHZ.LJIIJJI(LJIILL.getWidth(), LJIILL.getHeight(), this.LJLJJI);
                if (LJIIJJI != null) {
                    float width = LJIIJJI.width() + LJIIJJI.left;
                    float height = LJIIJJI.height() + LJIIJJI.top;
                    if (width > LJIILL.getWidth()) {
                        LJIIJJI.right = LJIILL.getWidth() - LJIIJJI.left;
                    }
                    if (height > LJIILL.getHeight()) {
                        LJIIJJI.bottom = LJIILL.getHeight() - LJIIJJI.top;
                    }
                    LJIILL.getWidth();
                    LJIILL.getHeight();
                    Matrix matrix = new Matrix();
                    matrix.postScale(0.5f, 0.5f);
                    Bitmap createBitmap = Bitmap.createBitmap(LJIILL, (int) LJIIJJI.left, (int) LJIIJJI.top, (int) LJIIJJI.width(), (int) LJIIJJI.height(), matrix, false);
                    if (createBitmap != null) {
                        Context context = this.LJLILLLLZI;
                        try {
                            bitmap = Bitmap.createBitmap(createBitmap);
                            RenderScript create = RenderScript.create(context);
                            o.LJIIIIZZ(create, "create(context)");
                            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                            o.LJIIIIZZ(create2, "create(rs, Element.U8_4(rs))");
                            Allocation createFromBitmap = Allocation.createFromBitmap(create, createBitmap);
                            o.LJIIIIZZ(createFromBitmap, "createFromBitmap(rs, inputBitmap)");
                            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, bitmap);
                            o.LJIIIIZZ(createFromBitmap2, "createFromBitmap(rs, outputBitmap)");
                            create2.setRadius(10.0f);
                            create2.setInput(createFromBitmap);
                            create2.forEach(createFromBitmap2);
                            createFromBitmap2.copyTo(bitmap);
                        } catch (Exception unused) {
                            bitmap = createBitmap;
                        }
                        interfaceC73573Su9.onNext(new OSZ<>(createBitmap, bitmap));
                        return;
                    }
                }
            }
            interfaceC73573Su9.onError(new Throwable());
            return;
        }
        interfaceC73573Su9.onError(new Throwable());
    }
}
