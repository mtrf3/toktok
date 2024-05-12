package Y;

import X.C10I;
import X.C10K;
import X.C16880lQ;
import X.C50650JuI;
import X.C50695Jv1;
import X.C50699Jv5;
import X.C50706JvC;
import X.C50708JvE;
import X.C50742Jvm;
import X.C50764Jw8;
import X.C50768JwC;
import X.C50843JxP;
import X.C76800UCe;
import X.DYB;
import X.ORZ;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SuggestWordsViewModel;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class AgS16S0310000_8 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c0, code lost:
    
        if (r1.length() > 0) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$0(Y.AgS16S0310000_8 r12, X.C10K r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS16S0310000_8.then$0(Y.AgS16S0310000_8, X.10K):java.lang.Object");
    }

    public static final Object then$1(AgS16S0310000_8 agS16S0310000_8, C10K c10k) {
        List<TypeWords> list;
        TypeWords typeWords;
        List<Word> list2;
        Word word;
        Word word2;
        C50768JwC.LIZ.LIZIZ(c10k.LJIIJJI());
        if (agS16S0310000_8.z3) {
            C50699Jv5 c50699Jv5 = (C50699Jv5) agS16S0310000_8.l0;
            c50699Jv5.getClass();
            c50699Jv5.LIZIZ(new C50708JvE(false));
            C50699Jv5 c50699Jv52 = (C50699Jv5) agS16S0310000_8.l0;
            c50699Jv52.getClass();
            c50699Jv52.LIZIZ(new C50706JvC());
        }
        if (c10k.LJIILIIL()) {
            String str = (String) c10k.LJIIJJI();
            if (!TextUtils.isEmpty(str)) {
                ((SuggestWordsViewModel) agS16S0310000_8.l1).LJLJI.setValue(new C50764Jw8<>(str));
                try {
                    SuggestWordResponse suggestWordResponse = (SuggestWordResponse) new Gson().LJI(str, SuggestWordResponse.class);
                    Word word3 = null;
                    if (suggestWordResponse == null || (list = suggestWordResponse.data) == null || (typeWords = (TypeWords) ORZ.LJLLLL(list)) == null || (list2 = typeWords.words) == null) {
                        return null;
                    }
                    SuggestWordsViewModel suggestWordsViewModel = (SuggestWordsViewModel) agS16S0310000_8.l1;
                    C50650JuI c50650JuI = (C50650JuI) agS16S0310000_8.l2;
                    if (((Number) C50843JxP.LIZ.getValue()).intValue() != 1 && DYB.LIZ()) {
                        Iterator<Word> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Word next = it.next();
                            if (o.LJ(next.getShowPosition(), "UNDER_BOX")) {
                                word3 = next;
                                break;
                            }
                        }
                        word = word3;
                        if (word == null) {
                            word = (Word) ORZ.LJLLLL(list2);
                        }
                    } else {
                        word = (Word) ORZ.LJLLLL(list2);
                    }
                    if (!list2.isEmpty()) {
                        if (word != null) {
                            String str2 = suggestWordResponse.logId;
                            if (str2 == null) {
                                str2 = "";
                            }
                            word.setImplId(str2);
                        }
                        NextLiveData<Word> nextLiveData = suggestWordsViewModel.LJLIL;
                        if (word == null) {
                            word2 = new Word();
                        } else {
                            word2 = word;
                        }
                        nextLiveData.setValue(word2);
                        if (word == null) {
                            word = new Word();
                        }
                        C50742Jvm.LIZ(new C50695Jv1(word), c50650JuI);
                    }
                    return C76800UCe.LIZ;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return C76800UCe.LIZ;
                }
            }
            NextLiveData<C50764Jw8<String>> nextLiveData2 = ((SuggestWordsViewModel) agS16S0310000_8.l1).LJLJI;
            c10k.LJIIJ();
            nextLiveData2.setValue(new C50764Jw8<>());
            return C76800UCe.LIZ;
        }
        if (c10k.LJIILJJIL()) {
            NextLiveData<C50764Jw8<String>> nextLiveData3 = ((SuggestWordsViewModel) agS16S0310000_8.l1).LJLJI;
            c10k.LJIIJ();
            nextLiveData3.setValue(new C50764Jw8<>());
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS16S0310000_8(Object obj, AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew, boolean z, SearchSugResponse searchSugResponse, Map<String, String> map) {
        this.$t = map;
        this.l0 = obj;
        this.z3 = abstractSearchIntermediateFragmentNew;
        this.l1 = z;
        this.l2 = searchSugResponse;
    }
}
