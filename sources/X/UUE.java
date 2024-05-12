package X;

import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UUE extends C25849ACn implements View.OnClickListener {
    public final BasePage LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C73318Sq2 LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C25849ACn
    /* renamed from: LJIIJJI */
    public final C25848ACm LJIIIIZZ() {
        boolean z = LJIILIIL().LJLJI;
        String string = this.LJLJJL.getString(R.string.i6s);
        String string2 = this.LJLJJL.getString(R.string.i6r);
        o.LJIIIIZZ(string, "getString(R.string.mlbb_…tings_mlbb_section_title)");
        boolean z2 = false;
        return new C25848ACm(z, string, this, z2, null, this, 0 == true ? 1 : 0, string2, z2, z2, z2, 0 == true ? 1 : 0, 64440);
    }

    public final FindCtxViewModel LJIILIIL() {
        return (FindCtxViewModel) this.LJLJJLL.getValue();
    }

    @Override // X.AG6, X.AG8
    public final void onViewDetachedFromWindow() {
        this.LJLJL.LIZLLL();
    }

    @Override // X.C25849ACn, X.AG6
    public final /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
        return LJIIIIZZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UUE(BasePage page) {
        super(null);
        o.LJIIIZ(page, "page");
        this.LJLJJL = page;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 539));
        this.LJLJL = new C73318Sq2();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LJLJL.LIZLLL();
        if (UC0.LJJIJIIJI()) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLJJL);
            c26045AKb.LJIIIIZZ(R.string.q14);
            c26045AKb.LJIIJ();
        } else if (LJFF().LJZI) {
            UUF.LJI(6);
            XKX.LIZLLL(ViewModelKt.getViewModelScope(LJIILIIL()), null, null, new UU2(this, null), 3);
        } else {
            UUF.LJII(6);
            XKX.LIZLLL(ViewModelKt.getViewModelScope(LJIILIIL()), null, null, new UU1(this, null), 3);
        }
    }
}
