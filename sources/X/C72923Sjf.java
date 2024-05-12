package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS178S0100000_12;

/* renamed from: X.Sjf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72923Sjf<T> implements InterfaceC86003Zc {
    public final /* synthetic */ U8Q LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    public C72923Sjf(U8Q u8q, float f) {
        this.LJLIL = u8q;
        this.LJLILLLLZI = f;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Bitmap> interfaceC73573Su9) {
        U8Q u8q = this.LJLIL;
        float f = 192;
        OSZ osz = new OSZ(Integer.valueOf((int) (f / this.LJLILLLLZI)), Integer.valueOf((int) (f / this.LJLILLLLZI)));
        u8q.getClass();
        OSZ LIZIZ = U8Q.LIZIZ(osz);
        U8Q u8q2 = this.LJLIL;
        int intValue = ((Number) LIZIZ.getFirst()).intValue();
        int intValue2 = ((Number) LIZIZ.getSecond()).intValue();
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12((C73433Srt) interfaceC73573Su9, 688);
        u8q2.getClass();
        android.net.Uri build = new Uri.Builder().scheme("res").path(String.valueOf(R.drawable.d7r)).build();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadCoverFromResId resId = ");
        LIZ.append(R.drawable.d7r);
        LIZ.append(" uri = ");
        LIZ.append(build);
        C0NB.LIZIZ("def_mask", X1D.LIZIZ(LIZ));
        if (build == null) {
            return;
        }
        W6J LIZ2 = W5I.LIZ();
        W5P LIZLLL = W5P.LIZLLL(build);
        LIZLLL.LIZJ = new C79238V7y(intValue, intValue2);
        ((AbstractC48384Iyq) LIZ2.LJ(LIZLLL.LIZ(), null)).LJ(new C72924Sjg(build, aqS178S0100000_12), C79561VKj.LJLIL);
    }
}
