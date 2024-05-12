package X;

import Y.AfS65S0100000_13;
import Y.IDCSpanS5S0200000_13;
import android.text.SpannableString;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UUD extends C25849ACn implements View.OnClickListener {
    public final BasePage LJLJJL;
    public final C73318Sq2 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;

    public final ActivityC45651qj LJIILIIL() {
        return (ActivityC45651qj) this.LJLJLJ.getValue();
    }

    public final String LJIILJJIL() {
        if (((Boolean) this.LJLL.getValue()).booleanValue()) {
            String string = LJIILIIL().getString(R.string.r1x);
            o.LJIIIIZZ(string, "{\n            context.ge…_contacts_desc)\n        }");
            return string;
        }
        String string2 = LJIILIIL().getString(R.string.rzx);
        o.LJIIIIZZ(string2, "{\n            context.ge…ts_description)\n        }");
        return string2;
    }

    public final FindCtxViewModel LJIILL() {
        return (FindCtxViewModel) this.LJLJL.getValue();
    }

    @Override // X.AG6, X.AG8
    public final void onViewDetachedFromWindow() {
        this.LJLJJLL.LIZLLL();
    }

    @Override // X.C25849ACn, X.AG6
    public final /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
        return LJIIIIZZ();
    }

    @Override // X.C25849ACn
    /* renamed from: LJIIJJI */
    public final C25848ACm LJIIIIZZ() {
        String LJIILJJIL;
        boolean LIZ = L10.LIZ();
        boolean z = LJIILL().LJLIL;
        String string = LJIILIIL().getString(R.string.rzz);
        SpannableString spannableString = null;
        if (LIZ) {
            LJIILJJIL = null;
            ActivityC45651qj LJIILIIL = LJIILIIL();
            o.LJIIIIZZ(LJIILIIL, "this.context");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJIILJJIL());
            LIZ2.append(' ');
            LIZ2.append(C86V.LJFF(R.string.duh));
            spannableString = new SpannableString(X1D.LIZIZ(LIZ2));
            spannableString.setSpan(new IDCSpanS5S0200000_13(this, LJIILIIL, 1), LJIILJJIL().length(), C86V.LJFF(R.string.duh).length() + LJIILJJIL().length() + 1, 33);
        } else {
            LJIILJJIL = LJIILJJIL();
        }
        o.LJIIIIZZ(string, "getString(R.string.sync_contacts_title)");
        boolean z2 = false;
        C2068389v c2068389v = null;
        return new C25848ACm(z, string, this, z2, c2068389v, this, c2068389v, LJIILJJIL, z2, z2, z2, spannableString, 31672);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UUD(BasePage page) {
        super(null);
        o.LJIIIZ(page, "page");
        this.LJLJJL = page;
        this.LJLJJLL = new C73318Sq2();
        this.LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 541));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 540));
        this.LJLJLLL = C221108m2.LIZIZ(UUI.LJLIL);
        this.LJLL = C221108m2.LIZIZ(UUH.LJLIL);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        String uid;
        String uid2;
        o.LJIIIZ(v, "v");
        this.LJLJJLL.LIZLLL();
        if (UC0.LJJIJIIJIL()) {
            C5S1 c5s1 = new C5S1(LJIILIIL());
            c5s1.LIZJ(R.string.q14);
            c5s1.LJ();
            return;
        }
        if (LJFF().LJZI) {
            UUF.LJI(1);
            if (((Boolean) this.LJLJLLL.getValue()).booleanValue()) {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(LJIILL()), null, null, new C77255UTr(this, false, null), 3);
                return;
            }
            ActivityC45651qj LJIILIIL = LJIILIIL();
            if (LJIILIIL == null || (uid2 = ((RBX) HG3.LJIILL()).getCurUser().getUid()) == null) {
                return;
            }
            C78999UzT.LJFF(T3Q.LIZ(LJIILIIL, C77266UUc.LIZIZ.LJIIJJI(), uid2, "click").LJJJJZI(new AfS65S0100000_13(this, 205)), this.LJLJJLL);
            return;
        }
        UUF.LJII(1);
        if (((Boolean) this.LJLJLLL.getValue()).booleanValue()) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(LJIILL()), null, null, new C77255UTr(this, true, null), 3);
            return;
        }
        ActivityC45651qj LJIILIIL2 = LJIILIIL();
        if (LJIILIIL2 == null || (uid = ((RBX) HG3.LJIILL()).getCurUser().getUid()) == null) {
            return;
        }
        C78999UzT.LJFF(T3Q.LIZJ(LJIILIIL2, C77266UUc.LIZIZ.LJIIJJI(), uid, "privacy_setting", "click", true, null).LJJJJZI(new AfS65S0100000_13(this, 206)), this.LJLJJLL);
    }
}
