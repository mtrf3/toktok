package X;

import Y.AfS60S0100000_8;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallToolBarAssem;
import com.ss.android.ugc.aweme.legacy.api.SearchSuggestWordsApi;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallToolBarAssem$getSuggestSearchData$1", f = "MallToolBarAssem.kt", l = {561, 325}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KH8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ MallToolBarAssem LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KH8(MallToolBarAssem mallToolBarAssem, InterfaceC67352kd<? super KH8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = mallToolBarAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KH8(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        TypeWords typeWords;
        List<Word> list;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (List) this.LJLIL;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            C62822Ol8 LIZIZ = C221108m2.LIZIZ(KF3.LJLIL);
            arrayList = new ArrayList();
            AbstractC73672Svk LJJIIJZLJL = SearchSuggestWordsApi.LIZ((KF2) LIZIZ.getValue()).LJJIIJZLJL();
            o.LJIIIIZZ(LJJIIJZLJL, "SearchSuggestWordsApi.fe…uestParam).toObservable()");
            this.LJLIL = arrayList;
            this.LJLILLLLZI = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            xks.LJIILIIL(new AqS174S0100000_8(LJJIIJZLJL.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS60S0100000_8(xks, 23), new AfS60S0100000_8(xks, 24)), 237));
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        SuggestWordResponse suggestWordResponse = (SuggestWordResponse) obj;
        if (suggestWordResponse != null) {
            String str = suggestWordResponse.logId;
            if (str != null) {
                this.LJLJI.LJLLI = str;
            }
            List<TypeWords> list2 = suggestWordResponse.data;
            if (list2 != null && (typeWords = (TypeWords) ORZ.LJLLLL(list2)) != null && (list = typeWords.words) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Word word : list) {
                    if (C78685UuP.LJJJZ(word.getWord())) {
                        arrayList2.add(word);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add((Word) it.next());
                }
            }
        }
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        KH9 kh9 = new KH9(arrayList, this.LJLJI, null);
        this.LJLIL = null;
        this.LJLILLLLZI = 2;
        if (XKX.LJI(abstractC78621UtN, kh9, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
