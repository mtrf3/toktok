package X;

import Y.AfS65S0100000_13;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UUC extends C25849ACn implements View.OnClickListener {
    public final BasePage LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C73318Sq2 LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C25849ACn
    /* renamed from: LJIIJJI */
    public final C25848ACm LJIIIIZZ() {
        boolean z = LJIILJJIL().LJLILLLLZI;
        String string = LJIILIIL().getString(R.string.r1z);
        String string2 = LJIILIIL().getString(R.string.rx4);
        o.LJIIIIZZ(string, "getString(R.string.settings_sync_fb_title_update)");
        boolean z2 = false;
        return new C25848ACm(z, string, this, z2, null, this, 0 == true ? 1 : 0, string2, z2, z2, z2, 0 == true ? 1 : 0, 64440);
    }

    public final ActivityC45651qj LJIILIIL() {
        return (ActivityC45651qj) this.LJLJL.getValue();
    }

    public final FindCtxViewModel LJIILJJIL() {
        return (FindCtxViewModel) this.LJLJJLL.getValue();
    }

    @Override // X.AG6, X.AG8
    public final void onViewDetachedFromWindow() {
        this.LJLJLJ.LIZLLL();
    }

    @Override // X.C25849ACn, X.AG6
    public final /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
        return LJIIIIZZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UUC(BasePage page) {
        super(null);
        o.LJIIIZ(page, "page");
        this.LJLJJL = page;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 543));
        this.LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 542));
        this.LJLJLJ = new C73318Sq2();
        this.LJLJLLL = C221108m2.LIZIZ(UUJ.LJLIL);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        String uid;
        String uid2;
        o.LJIIIZ(v, "v");
        this.LJLJLJ.LIZLLL();
        if (UC0.LJJIIZ()) {
            C5S1 c5s1 = new C5S1(LJIILIIL());
            c5s1.LIZJ(R.string.q14);
            c5s1.LJ();
            return;
        }
        if (LJFF().LJZI) {
            UUF.LJI(2);
            if (((Boolean) this.LJLJLLL.getValue()).booleanValue()) {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(LJIILJJIL()), null, null, new C77261UTx(this, false, null), 3);
                return;
            }
            ActivityC45651qj LJIILIIL = LJIILIIL();
            if (LJIILIIL == null || (uid2 = ((RBX) HG3.LJIILL()).getCurUser().getUid()) == null) {
                return;
            }
            C78999UzT.LJFF(T3Q.LIZ(LJIILIIL, C77266UUc.LIZIZ.LJJIJIIJI(), uid2, "click").LJJJJZI(new AfS65S0100000_13(this, 208)), this.LJLJLJ);
            return;
        }
        UUF.LJII(2);
        if (((Boolean) this.LJLJLLL.getValue()).booleanValue()) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(LJIILJJIL()), null, null, new C77261UTx(this, true, null), 3);
            return;
        }
        ActivityC45651qj LJIILIIL2 = LJIILIIL();
        if (LJIILIIL2 == null || (uid = ((RBX) HG3.LJIILL()).getCurUser().getUid()) == null) {
            return;
        }
        C78999UzT.LJFF(T3Q.LIZJ(LJIILIIL2, C77266UUc.LIZIZ.LJJIJIIJI(), uid, "privacy_setting", "click", true, null).LJJJJZI(new AfS65S0100000_13(this, 209)), this.LJLJLJ);
    }
}
