package X;

import Y.AgS127S0100000_10;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.share.api.ShareQRCodeApi;
import defpackage.a1;
import kotlin.jvm.internal.o;
import o53.IDdS476S0100000_10;

/* renamed from: X.Oam, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C62180Oam extends C62846OlW {
    public String LJLIL;
    public boolean LJLILLLLZI;
    public String LJLJI;
    public long LJLJJI;
    public final IDdS476S0100000_10 LJLJJL;

    public final void LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJI;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("qr_code_type", "general");
        c188727au.LJIIIZ("enter_from", this.LJLIL);
        c188727au.LJIIIZ("load_duration", String.valueOf(currentTimeMillis));
        FMX.LJIIL("qr_code_generate", c188727au.LIZ);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final W4V<InterfaceC81599W0t> getImageLoadListener() {
        return this.LJLJJL;
    }

    public final String getQrCodeUrl() {
        return this.LJLJI;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C62180Oam(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62180Oam(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJI = "";
        this.LJLJJL = new IDdS476S0100000_10(this, 3);
    }

    public final void LJ(int i, String str, String str2) {
        this.LJLIL = str2;
        this.LJLJJI = System.currentTimeMillis();
        C62183Oap c62183Oap = new C62183Oap(this);
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str3 = EFJ.LIZJ;
        ((ShareQRCodeApi.RealApi) C770830u.LIZJ(str3, "API_URL_PREFIX_SI", LIZLLL, str3).LIZ.LIZ(ShareQRCodeApi.RealApi.class)).getUserQRCodeInfo(i, str).LIZLLL(new AgS127S0100000_10(c62183Oap, 12));
    }
}
