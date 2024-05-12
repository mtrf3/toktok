package X;

import android.view.View;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Xkb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85721Xkb extends AbstractC188397aN {
    public final /* synthetic */ InputCodeFragment LJLJJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        if (!C6ZT.LIZ(view) && this.LJLJJI.Ll()) {
            this.LJLJJI.onClick(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85721Xkb(InputCodeFragment inputCodeFragment, int i, int i2) {
        super(i, i2);
        this.LJLJJI = inputCodeFragment;
    }
}
