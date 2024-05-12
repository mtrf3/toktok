package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.74j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1799374j extends C7OW {
    @Override // X.C7OW, X.C7OX
    public final C74S LIZIZ(Context context, C1796273e c1796273e) {
        o.LJIIIZ(context, "context");
        final ViewOnClickListenerC226248uK viewOnClickListenerC226248uK = new ViewOnClickListenerC226248uK(context);
        return new C74S<C1796273e>(viewOnClickListenerC226248uK) { // from class: X.74T
            public final ViewOnClickListenerC226248uK LJLIL;

            {
                super(viewOnClickListenerC226248uK);
                this.LJLIL = viewOnClickListenerC226248uK;
            }

            @Override // X.C74S
            public final void L(Context context2, C1796273e c1796273e2) {
                ViewOnClickListenerC226248uK viewOnClickListenerC226248uK2;
                ViewOnClickListenerC226248uK viewOnClickListenerC226248uK3 = this.LJLIL;
                if (viewOnClickListenerC226248uK3 != null) {
                    viewOnClickListenerC226248uK3.setDataCenter(c1796273e2.LIZLLL);
                }
                ViewOnClickListenerC226248uK viewOnClickListenerC226248uK4 = this.LJLIL;
                if (viewOnClickListenerC226248uK4 != null) {
                    LinkData linkData = c1796273e2.LIZ;
                    o.LJI(linkData);
                    Aweme aweme = c1796273e2.LIZIZ;
                    o.LJI(aweme);
                    viewOnClickListenerC226248uK4.LIZ(aweme, linkData);
                }
                C226288uO c226288uO = c1796273e2.LIZJ;
                if (c226288uO != null && (viewOnClickListenerC226248uK2 = this.LJLIL) != null) {
                    viewOnClickListenerC226248uK2.setOnDislikeCommentAdListener(c226288uO);
                }
            }
        };
    }
}
