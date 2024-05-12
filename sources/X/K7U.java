package X;

import android.widget.EditText;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class K7U implements K75 {
    public final /* synthetic */ EcSearchResultFragmentNew LIZ;

    @Override // X.K75
    public final InterfaceC51347KDf LJ() {
        return null;
    }

    @Override // X.K75
    public final InterfaceC50548Jse LIZ() {
        return this.LIZ.LLIIII;
    }

    @Override // X.K75
    public final InterfaceC178696zp LIZIZ() {
        return this.LIZ.LLIIIILZ;
    }

    @Override // X.K75
    public final InterfaceC50796Jwe LIZJ() {
        return this.LIZ.LLFFF;
    }

    @Override // X.K75
    public final InterfaceC50547Jsd LIZLLL() {
        return this.LIZ.LLII;
    }

    @Override // X.K75
    public final InterfaceC51113K4f LJI() {
        return this.LIZ.LLIFFJFJJ;
    }

    @Override // X.K75
    public final KCU LJII() {
        return this.LIZ.LLFZ;
    }

    @Override // X.K75
    public final Boolean LJIIIIZZ() {
        return Boolean.valueOf(this.LIZ.LJLZ.LJLILLLLZI);
    }

    @Override // X.K75
    public final EditText getEditText() {
        return this.LIZ.LJLJI;
    }

    @Override // X.K75
    public final InterfaceC51124K4q getKeyword() {
        return this.LIZ.LLI;
    }

    public K7U(EcSearchResultFragmentNew ecSearchResultFragmentNew) {
        this.LIZ = ecSearchResultFragmentNew;
    }

    @Override // X.K75
    public final void LJFF(Word word, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str;
        String charSequence;
        o.LJIIIZ(word, "word");
        C50948Jz6 LIZIZ = JTO.LIZIZ(this.LIZ.mo49getActivity());
        String Il = this.LIZ.Il();
        CharSequence hint = this.LIZ.LJLJI.getHint();
        if (hint != null && (charSequence = hint.toString()) != null) {
            str = s.LJZI(charSequence).toString();
        } else {
            str = null;
        }
        if (o.LJ(Il, str) && C78685UuP.LJJJZ(word.getWord()) && LIZIZ != null && LIZIZ.isSetHintBySugWord()) {
            K7Y k7y = this.LIZ.LLFFF;
            if (k7y != null) {
                k7y.LIZ(word);
            }
            interfaceC65784Pro.invoke();
        }
    }
}
