package X;

import android.view.View;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Y8s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86902Y8s extends C86898Y8o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86902Y8s(AwemePagerVM pagerVM) {
        super(pagerVM);
        o.LJIIIZ(pagerVM, "pagerVM");
    }

    @Override // X.C86898Y8o
    public final void LIZ(C79236V7w profileTabData, View view) {
        Y4F y4f;
        o.LJIIIZ(profileTabData, "profileTabData");
        LJI((int) C44384HbQ.LJJJLL(13), (int) C44384HbQ.LJJJLL(13), view);
        if (this.LIZ.LJLJI) {
            LJFF(view);
        } else {
            if (!(view instanceof Y4F) || (y4f = (Y4F) view) == null) {
                return;
            }
            y4f.setAdditionViewVisibility(8);
        }
    }
}
