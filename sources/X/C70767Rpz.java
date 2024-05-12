package X;

import android.graphics.drawable.Animatable;
import android.util.LruCache;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderDisplayImageOpt;
import kotlin.jvm.internal.o;

/* renamed from: X.Rpz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70767Rpz implements InterfaceC70769Rq1 {
    public final /* synthetic */ InterfaceC70769Rq1 LJLIL;
    public final /* synthetic */ HeaderDisplayImageOpt LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
        String pid = this.LJLILLLLZI.LIZIZ;
        String str = this.LJLJI;
        o.LJIIIZ(pid, "pid");
        LruCache<String, C70663RoJ> lruCache = C70660RoG.LIZJ.get(pid);
        if (lruCache != null) {
            lruCache.remove(str);
        }
        this.LJLIL.LJLLLLLL(uri);
    }

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
        this.LJLIL.D1(uri, c2047581v);
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
        this.LJLIL.LLZZJLIL(uri, th);
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        this.LJLIL.T1(uri, smartImageView);
    }

    public C70767Rpz(C70766Rpy c70766Rpy, HeaderDisplayImageOpt headerDisplayImageOpt, String str) {
        this.LJLIL = c70766Rpy;
        this.LJLILLLLZI = headerDisplayImageOpt;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        this.LJLIL.s2(uri, view, th);
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        this.LJLIL.U0(uri, view, c2047581v, animatable);
    }
}
