package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.acQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94154acQ implements InterfaceC70769Rq1 {
    public final /* synthetic */ ImageView LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns LJLJI;

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
    }

    public C94154acQ(ImageView imageView, String str, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = imageView;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        InterfaceC88472Yns interfaceC88472Yns = this.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        o.LJIIIZ(uri, "uri");
        this.LJLIL.setTag(R.id.nme, this.LJLILLLLZI);
        InterfaceC88472Yns interfaceC88472Yns = this.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
    }
}
