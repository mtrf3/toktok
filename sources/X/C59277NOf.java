package X;

import android.os.Bundle;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.NOf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59277NOf extends AbstractC59249NNd {
    public final int LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.AbstractC59248NNc
    public final boolean LIZIZ() {
        if (!TextUtils.isEmpty(this.LIZLLL) && this.LIZJ == 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC59249NNd
    public final C59289NOr LIZJ() {
        if (C59280NOi.LIZIZ.LJII(this.LJ, this.LIZIZ)) {
            return new C59289NOr(true);
        }
        return new C59289NOr(false, "handle light web failed");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59277NOf(InterfaceC59247NNb taskContext, Bundle bundle) {
        super(taskContext, bundle);
        o.LJIIIZ(taskContext, "taskContext");
        this.LIZJ = bundle.getInt("webview_type");
        this.LIZLLL = bundle.getString("light_page_web_url");
        this.LJ = bundle.getInt("click_from");
    }
}
