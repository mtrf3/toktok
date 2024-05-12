package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.LowResolutionImageCache;
import com.ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache;

/* renamed from: X.OOw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61842OOw extends AbstractC72439Sbr {
    public final /* synthetic */ AbstractC72439Sbr LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.AbstractC72439Sbr, X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        AbstractC72439Sbr abstractC72439Sbr = this.LJLIL;
        if (abstractC72439Sbr != null) {
            abstractC72439Sbr.T1(uri, smartImageView);
        }
    }

    public C61842OOw(AbstractC72439Sbr abstractC72439Sbr, String str, String str2) {
        this.LJLIL = abstractC72439Sbr;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        C36746EbW.LIZ(4, "loadImg onFailed");
        AbstractC72439Sbr abstractC72439Sbr = this.LJLIL;
        if (abstractC72439Sbr != null) {
            abstractC72439Sbr.s2(uri, view, th);
        }
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        ILowResolutionImageCache iLowResolutionImageCache;
        C36746EbW.LIZ(4, "loadImg onComplete");
        AbstractC72439Sbr abstractC72439Sbr = this.LJLIL;
        if (abstractC72439Sbr != null) {
            abstractC72439Sbr.U0(uri, view, c2047581v, animatable);
        }
        Object LIZ = C58096Mr6.LIZ(ILowResolutionImageCache.class, false);
        if (LIZ != null) {
            iLowResolutionImageCache = (ILowResolutionImageCache) LIZ;
        } else {
            if (C58096Mr6.N == null) {
                synchronized (ILowResolutionImageCache.class) {
                    if (C58096Mr6.N == null) {
                        C58096Mr6.N = new LowResolutionImageCache();
                    }
                }
            }
            iLowResolutionImageCache = C58096Mr6.N;
        }
        iLowResolutionImageCache.LIZ(this.LJLILLLLZI, this.LJLJI);
    }
}
