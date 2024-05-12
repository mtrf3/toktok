package X;

import android.widget.EditText;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KAF implements K75 {
    public final /* synthetic */ C51254K9q LIZ;

    @Override // X.K75
    public final InterfaceC50796Jwe LIZJ() {
        return null;
    }

    @Override // X.K75
    public final InterfaceC50547Jsd LIZLLL() {
        return null;
    }

    @Override // X.K75
    public final Boolean LJIIIIZZ() {
        return null;
    }

    @Override // X.K75
    public final EditText getEditText() {
        return null;
    }

    @Override // X.K75
    public final InterfaceC50548Jse LIZ() {
        return new KAS(this.LIZ);
    }

    @Override // X.K75
    public final InterfaceC178696zp LIZIZ() {
        return new C51294KBe(this.LIZ);
    }

    @Override // X.K75
    public final InterfaceC51347KDf LJ() {
        return new C51265KAb(this.LIZ);
    }

    @Override // X.K75
    public final InterfaceC51113K4f LJI() {
        return new KAE(this.LIZ);
    }

    @Override // X.K75
    public final KCU LJII() {
        return new C51271KAh(this.LIZ);
    }

    @Override // X.K75
    public final InterfaceC51124K4q getKeyword() {
        return new KC8();
    }

    public KAF(C51254K9q c51254K9q) {
        this.LIZ = c51254K9q;
    }

    @Override // X.K75
    public final void LJFF(Word word, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(word, "word");
        this.LIZ.LIZ.V2(word);
    }
}
