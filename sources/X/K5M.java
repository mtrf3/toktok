package X;

import android.widget.EditText;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class K5M implements K75 {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.K75
    public final InterfaceC50548Jse LIZ() {
        return this.LIZ.LLIILZL;
    }

    @Override // X.K75
    public final InterfaceC178696zp LIZIZ() {
        return this.LIZ.LLIIZ;
    }

    @Override // X.K75
    public final InterfaceC50796Jwe LIZJ() {
        return this.LIZ.LLIIIJ;
    }

    @Override // X.K75
    public final InterfaceC50547Jsd LIZLLL() {
        return this.LIZ.LLIILII;
    }

    @Override // X.K75
    public final InterfaceC51347KDf LJ() {
        return this.LIZ.LLILIL;
    }

    @Override // X.K75
    public final InterfaceC51113K4f LJI() {
        return this.LIZ.LLIIL;
    }

    @Override // X.K75
    public final KCU LJII() {
        return this.LIZ.LLIIJI;
    }

    @Override // X.K75
    public final Boolean LJIIIIZZ() {
        return Boolean.valueOf(this.LIZ.LLFZ.LJLJI);
    }

    @Override // X.K75
    public final EditText getEditText() {
        return this.LIZ.LJLJJL;
    }

    @Override // X.K75
    public final InterfaceC51124K4q getKeyword() {
        return this.LIZ.LLIIJLIL;
    }

    public K5M(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.K75
    public final void LJFF(Word word, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str;
        String charSequence;
        o.LJIIIZ(word, "word");
        C50948Jz6 LIZIZ = JTO.LIZIZ(this.LIZ.mo49getActivity());
        String Kl = this.LIZ.Kl();
        CharSequence hint = this.LIZ.LJLJJL.getHint();
        if (hint != null && (charSequence = hint.toString()) != null) {
            str = s.LJZI(charSequence).toString();
        } else {
            str = null;
        }
        if (o.LJ(Kl, str) && C78685UuP.LJJJZ(word.getWord()) && LIZIZ != null && LIZIZ.isSetHintBySugWord()) {
            K5V k5v = this.LIZ.LLIIIJ;
            if (k5v != null) {
                k5v.LIZ(word);
            }
            interfaceC65784Pro.invoke();
        }
    }
}
