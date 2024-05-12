package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.ss.android.ugc.aweme.experiment.LibraryCategory;

/* renamed from: X.S3t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71485S3t extends AbstractC72439Sbr {
    public final /* synthetic */ C71487S3v LJLIL;
    public final /* synthetic */ LibraryCategory LJLILLLLZI;

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
    }

    public C71485S3t(C71487S3v c71487S3v, LibraryCategory libraryCategory) {
        this.LJLIL = c71487S3v;
        this.LJLILLLLZI = libraryCategory;
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        this.LJLIL.LJLJLJ.setText(this.LJLILLLLZI.getTitle());
    }
}
