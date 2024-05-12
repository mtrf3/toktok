package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailVideoListAssem;

/* renamed from: X.A3k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25612A3k extends AbstractC85293Wj {
    public final /* synthetic */ PaidContentCollectionDetailVideoListAssem LJLIL;
    public final /* synthetic */ C73306Spq LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap != null) {
            PaidContentCollectionDetailVideoListAssem paidContentCollectionDetailVideoListAssem = this.LJLIL;
            C73306Spq c73306Spq = this.LJLILLLLZI;
            C73305Spp c73305Spp = paidContentCollectionDetailVideoListAssem.LJLJJLL;
            if (c73305Spp != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                c73306Spq.LIZJ = 0;
                c73306Spq.LIZ = bitmapDrawable;
                c73305Spp.setStatus(c73306Spq);
            }
        }
    }

    public C25612A3k(PaidContentCollectionDetailVideoListAssem paidContentCollectionDetailVideoListAssem, C73306Spq c73306Spq) {
        this.LJLIL = paidContentCollectionDetailVideoListAssem;
        this.LJLILLLLZI = c73306Spq;
    }
}
