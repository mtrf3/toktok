package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.Gjc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42344Gjc implements InterfaceC42346Gje {
    public final /* synthetic */ C42343Gjb LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C42343Gjb LJLJI;

    @Override // X.InterfaceC42346Gje
    public final void LJ(Bitmap bitmap) {
        if (o.LJ(this.LJLIL.LJLIL.getTag(), this.LJLILLLLZI)) {
            this.LJLJI.LJLIL.setImageBitmap(bitmap);
            Bitmap bitmap2 = this.LJLJI.LJLILLLLZI;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.LJLJI.LJLILLLLZI = bitmap;
        }
    }

    public C42344Gjc(C42343Gjb c42343Gjb, String str, C42343Gjb c42343Gjb2) {
        this.LJLIL = c42343Gjb;
        this.LJLILLLLZI = str;
        this.LJLJI = c42343Gjb2;
    }
}
