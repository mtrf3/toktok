package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import java.io.File;

/* renamed from: X.ah6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94444ah6 extends AbstractC72439Sbr {
    public final /* synthetic */ ImageView LJLIL;
    public final /* synthetic */ File LJLILLLLZI;

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
    }

    public C94444ah6(ImageView imageView, File file) {
        this.LJLIL = imageView;
        this.LJLILLLLZI = file;
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        this.LJLIL.setTag(R.id.nme, this.LJLILLLLZI.getPath());
    }
}
