package X;

import Y.ACListenerS35S0100000_15;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Xo3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85935Xo3 extends C25849ACn {
    public final String LJLJJL;
    public final String LJLJJLL;

    @Override // X.C25849ACn
    /* renamed from: LJIIJJI */
    public final C25848ACm LJIIIIZZ() {
        String str = this.LJLJJL;
        String str2 = this.LJLJJLL;
        boolean z = true;
        if (a.LJFF().LJJIJIIJI() != 1) {
            z = false;
        }
        return new C25848ACm(z, str, new ACListenerS35S0100000_15(this, 212), false, null, null, null, str2, false, false, false, null, 64504);
    }

    @Override // X.C25849ACn, X.AG6
    public final /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
        return LJIIIIZZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85935Xo3(Fragment fragment) {
        super(null);
        o.LJIIIZ(fragment, "fragment");
        String string = fragment.getString(R.string.jlw);
        o.LJIIIIZZ(string, "fragment.getString(R.str…sensitive_settings_title)");
        this.LJLJJL = string;
        String string2 = fragment.getString(R.string.jlu);
        o.LJIIIIZZ(string2, "fragment.getString(R.str…osensitive_settings_body)");
        this.LJLJJLL = string2;
    }
}
