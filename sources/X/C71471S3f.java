package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.S3f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71471S3f {
    public Integer LIZ = 0;
    public InterfaceC71474S3i LIZIZ;
    public View.OnClickListener LIZJ;
    public ViewGroup LIZLLL;

    public final C71470S3e LIZ() {
        C71470S3e c71470S3e = new C71470S3e();
        c71470S3e.LJLJLJ = this.LIZJ;
        c71470S3e.LJLJL = this.LIZIZ;
        ViewGroup viewGroup = this.LIZLLL;
        if (viewGroup == null) {
            return null;
        }
        c71470S3e.LJLILLLLZI = viewGroup;
        Integer num = this.LIZ;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                c71470S3e.LJLJI = new C71476S3k();
            }
        } else {
            c71470S3e.LJLJI = new C73040SlY();
        }
        return c71470S3e;
    }
}
