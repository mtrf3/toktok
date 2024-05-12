package X;

import android.widget.TextSwitcher;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallToolBarAssem;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallToolBarAssem$getSuggestSearchData$1$3", f = "MallToolBarAssem.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KH9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<Word> LJLIL;
    public final /* synthetic */ MallToolBarAssem LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KH9(List<Word> list, MallToolBarAssem mallToolBarAssem, InterfaceC67352kd<? super KH9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = mallToolBarAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KH9(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.size() > 0) {
            this.LJLILLLLZI.LJLLILLLL = 0;
            this.LJLILLLLZI.LJLLJ = true;
            ((ArrayList) this.LJLILLLLZI.LJLLL).addAll(this.LJLIL);
            MallToolBarAssem mallToolBarAssem = this.LJLILLLLZI;
            Word word = (Word) ListProtector.get(mallToolBarAssem.LJLLL, mallToolBarAssem.LJLLILLLL);
            MallToolBarAssem mallToolBarAssem2 = this.LJLILLLLZI;
            String word2 = word.getWord();
            String str = "";
            if (word2 == null) {
                word2 = "";
            }
            mallToolBarAssem2.LJLL = word2;
            ((TextSwitcher) this.LJLILLLLZI._$_findCachedViewById(R.id.lly)).setText(this.LJLILLLLZI.LJLL);
            MallToolBarAssem mallToolBarAssem3 = this.LJLILLLLZI;
            OSZ[] oszArr = new OSZ[4];
            String id = word.getId();
            if (id != null) {
                str = id;
            }
            oszArr[0] = new OSZ("hint_group_id", str);
            oszArr[1] = new OSZ("hint_imp_id", this.LJLILLLLZI.LJLLI);
            oszArr[2] = new OSZ("hint_position", String.valueOf(this.LJLILLLLZI.LJLLILLLL));
            oszArr[3] = new OSZ("traffic_source_list", new JSONArray((Collection) C47261Igj.LJJIJ(new Integer(6))).toString());
            mallToolBarAssem3.LJLLLL = C113554cx.LJJL(oszArr);
            this.LJLILLLLZI.H3(word);
            this.LJLILLLLZI.L3();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
