package X;

import Y.ACListenerS24S0100000_4;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AGE extends C25849ACn {
    public final String LJLJJL;
    public final String LJLJJLL;

    @Override // X.C25849ACn
    /* renamed from: LJIIJJI */
    public final C25848ACm LJIIIIZZ() {
        return new C25848ACm(CaptionKevaServiceImpl.LJJJJI().LJJI(), this.LJLJJL, new ACListenerS24S0100000_4(this, 255), false, null, null, null, this.LJLJJLL, false, false, false, null, 64504);
    }

    @Override // X.C25849ACn, X.AG6
    public final /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
        return LJIIIIZZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AGE(Fragment fragment) {
        super(null);
        o.LJIIIZ(fragment, "fragment");
        String string = fragment.getString(R.string.dcn);
        o.LJIIIIZZ(string, "fragment.getString(R.str…fixedbutton_toggle_title)");
        this.LJLJJL = string;
        String string2 = fragment.getString(R.string.dcm);
        o.LJIIIIZZ(string2, "fragment.getString(R.str…afixedbutton_toggle_desc)");
        this.LJLJJLL = string2;
    }
}
