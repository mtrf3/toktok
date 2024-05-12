package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JCr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48785JCr extends C48788JCu {
    public final /* synthetic */ C48774JCg LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
    }

    public C48785JCr(C48774JCg c48774JCg, Aweme aweme) {
        this.LJLIL = c48774JCg;
        this.LJLILLLLZI = aweme;
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        C48774JCg c48774JCg = this.LJLIL;
        String aid = this.LJLILLLLZI.getAid();
        o.LJIIIIZZ(aid, "it.aid");
        c48774JCg.LJZI = aid;
    }
}
