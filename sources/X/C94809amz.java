package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.effectcreator.text.TextEditActivity;
import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.text.TextEditActivity$update$1", f = "TextEditActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.amz, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94809amz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ TextEditActivity LJLIL;
    public final /* synthetic */ C94441ah3 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94809amz(TextEditActivity textEditActivity, C94441ah3 c94441ah3, String str, int i, String str2, int i2, int i3, InterfaceC67352kd<? super C94809amz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = textEditActivity;
        this.LJLILLLLZI = c94441ah3;
        this.LJLJI = str;
        this.LJLJJI = i;
        this.LJLJJL = str2;
        this.LJLJJLL = i2;
        this.LJLJL = i3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94809amz(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        float f;
        C141335gf.LIZJ(obj);
        TextEditActivity textEditActivity = this.LJLIL;
        C94441ah3 c94441ah3 = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJI.hashCode());
        LIZ.append(".png");
        String LIZIZ = X1D.LIZIZ(LIZ);
        textEditActivity.getClass();
        try {
            c94441ah3.measure(View.MeasureSpec.makeMeasureSpec(c94441ah3.getWidth(), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(1073741823, LiveLayoutPreloadThreadPriority.DEFAULT));
            c94441ah3.layout(0, 0, c94441ah3.getMeasuredWidth(), c94441ah3.getMeasuredHeight());
            if (c94441ah3.getHeight() > 1280) {
                f = 1280.0f / c94441ah3.getHeight();
            } else {
                f = 1.0f;
            }
            Bitmap createBitmap = Bitmap.createBitmap((int) (c94441ah3.getWidth() * f), (int) (c94441ah3.getHeight() * f), Bitmap.Config.ARGB_4444);
            createBitmap.setDensity(textEditActivity.getResources().getDisplayMetrics().densityDpi);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(f, f, 0.0f, 0.0f);
            C37203Eit.LIZJ.getClass();
            C39214FaE.LIZ(c94441ah3, canvas);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(textEditActivity.LJLLI);
            LIZ2.append('/');
            LIZ2.append(LIZIZ);
            str = X1D.LIZIZ(LIZ2);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("textPath: ");
            LIZ3.append(str);
            H78.LIZIZ("CKE-TextEditActivity", X1D.LIZIZ(LIZ3));
            C44687HgJ.LJFF(str, true);
            C42299Git.LJFF(createBitmap, new File(str), 100, Bitmap.CompressFormat.PNG);
            C42299Git.LJ(createBitmap);
        } catch (Exception e) {
            H78.LIZIZ("CKE-TextEditActivity", "gen text png error");
            H78.LIZLLL("CKE-TextEditActivity", e);
            str = null;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C94808amy(this.LJLIL, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, str, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
