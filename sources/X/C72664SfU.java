package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import java.io.File;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SfU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72664SfU extends AbstractC65781Prl implements InterfaceC88472Yns<Bitmap, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ ProfileNaviServiceImpl LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ InterfaceC72668SfY LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72664SfU(long j, String str, Activity activity, ProfileNaviServiceImpl profileNaviServiceImpl, String str2, InterfaceC72668SfY interfaceC72668SfY, AqS162S0100000_12 aqS162S0100000_12) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = activity;
        this.LJLJJI = profileNaviServiceImpl;
        this.LJLJJL = str2;
        this.LJLJJLL = interfaceC72668SfY;
        this.LJLJL = aqS162S0100000_12;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Bitmap bitmap) {
        Bitmap transparentBitmap = bitmap;
        o.LJIIIZ(transparentBitmap, "transparentBitmap");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetched bitmap ");
        LIZ.append(System.currentTimeMillis() - this.LJLIL);
        LIZ.append("ms");
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ));
        String backgroundHex = this.LJLILLLLZI;
        o.LJIIIZ(backgroundHex, "backgroundHex");
        Bitmap LIZ2 = C72712SgG.LIZ(512, transparentBitmap);
        Bitmap bitmap2 = Bitmap.createBitmap(LIZ2.getWidth(), LIZ2.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmap2).drawColor(ColorProtector.parseColor(backgroundHex));
        o.LJIIIIZZ(bitmap2, "bitmap");
        Bitmap cs = Bitmap.createBitmap(Math.max(bitmap2.getWidth(), LIZ2.getWidth()), Math.max(bitmap2.getHeight(), LIZ2.getHeight()), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(cs);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(LIZ2, 0.0f, 0.0f, (Paint) null);
        o.LJIIIIZZ(cs, "cs");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("merged bitmap ");
        LIZ3.append(System.currentTimeMillis() - this.LJLIL);
        LIZ3.append("ms");
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ3));
        Activity context = this.LJLJI;
        C72665SfV c72665SfV = new C72665SfV(this.LJLIL, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        o.LJIIIZ(context, "context");
        File LIZIZ = C44118HTe.LIZIZ(context, cs);
        if (LIZIZ != null) {
            C41400GMq.LIZ(LIZIZ, new AqS178S0100000_12(c72665SfV, 440));
        }
        return C76800UCe.LIZ;
    }
}
