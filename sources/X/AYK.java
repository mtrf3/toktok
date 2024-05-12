package X;

import Y.ACListenerS24S0100000_4;
import android.text.Html;
import com.ss.android.ugc.aweme.setting.model.AuthorizedStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AYK extends C25860ACy {
    public final AuthorizedStruct LJLJJL;
    public final AYJ LJLJJLL;

    @Override // X.C25860ACy
    /* renamed from: LJIIJJI */
    public final C25859ACx LJIIIIZZ() {
        String name = this.LJLJJL.getName();
        if (name == null) {
            name = "";
        }
        return new C25859ACx(Html.fromHtml(name).toString(), null, new ACListenerS24S0100000_4(this, 264), null, false, null, null, null, true, false, null, null, false, false, null, null, null, 8388346);
    }

    @Override // X.C25860ACy, X.AG6
    public final /* bridge */ /* synthetic */ C25859ACx LJIIIIZZ() {
        return LJIIIIZZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AYK(AuthorizedStruct authorizedStruct, AYJ ayj) {
        super(null);
        o.LJIIIZ(authorizedStruct, "authorizedStruct");
        this.LJLJJL = authorizedStruct;
        this.LJLJJLL = ayj;
    }
}
