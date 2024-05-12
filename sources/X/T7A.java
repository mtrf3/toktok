package X;

import Y.IDComparatorS40S0000000_12;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.qna.api.AnswerStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T7A implements InterfaceC74129T7l {
    public final MutableLiveData<C74100T6i<List<C74125T7h>>> LIZ;
    public final MutableLiveData LIZIZ;
    public final MutableLiveData<C74100T6i<KKR>> LIZJ;
    public List<AnswerStruct> LIZLLL;
    public final java.util.Map<String, String> LJ;
    public final java.util.Set<String> LJFF;
    public final C74119T7b LJI;
    public final int LJII;
    public int LJIIIIZZ;
    public final C73318Sq2 LJIIIZ;
    public final Object LJIIJ;
    public final AtomicBoolean LJIIJJI;
    public final AtomicBoolean LJIIL;
    public long LJIILIIL;

    public T7A() {
        MutableLiveData<C74100T6i<List<C74125T7h>>> mutableLiveData = new MutableLiveData<>();
        this.LIZ = mutableLiveData;
        this.LIZIZ = mutableLiveData;
        this.LIZJ = new MutableLiveData<>();
        this.LIZLLL = new ArrayList();
        this.LJ = new HashMap();
        this.LJFF = new HashSet();
        this.LJI = new C74119T7b();
        this.LJII = Q7K.LIZIZ("qna_api_max_query_limit", 30);
        this.LJIIIZ = new C73318Sq2();
        this.LJIIJ = new Object();
        this.LJIIJJI = new AtomicBoolean(false);
        this.LJIIL = new AtomicBoolean(true);
    }

    public static String LIZIZ(AnswerStruct answerStruct) {
        o.LJIIIZ(answerStruct, "answerStruct");
        String str = "";
        for (Aweme aweme : ORZ.LLILII(new IDComparatorS40S0000000_12(2), answerStruct.answers)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(aweme.getAid());
            str = X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(answerStruct.questionId);
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
        return str;
    }

    @Override // X.InterfaceC74129T7l
    public final void LIZ(C69605RTl translationResult) {
        String str;
        o.LJIIIZ(translationResult, "translationResult");
        if (translationResult.LIZ && (str = translationResult.LIZLLL) != null) {
            synchronized (this.LJIIJ) {
                ((HashMap) this.LJ).put(translationResult.LIZIZ, str);
                ((HashSet) this.LJFF).remove(translationResult.LIZIZ);
            }
            LIZJ(C61878OQg.INSTANCE);
        }
    }

    public final void LIZJ(List<AnswerStruct> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.LJIIJ) {
            List<AnswerStruct> list2 = this.LIZLLL;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
            Iterator it = ((ArrayList) list2).iterator();
            while (true) {
                String str = null;
                if (!it.hasNext()) {
                    break;
                }
                AnswerStruct answerStruct = (AnswerStruct) it.next();
                boolean contains = ((HashSet) this.LJFF).contains(String.valueOf(answerStruct.questionId));
                if (((HashMap) this.LJ).keySet().contains(String.valueOf(answerStruct.questionId))) {
                    str = (String) ((HashMap) this.LJ).get(String.valueOf(answerStruct.questionId));
                }
                arrayList2.add(T6W.LIZ(answerStruct, str, contains));
            }
            arrayList.addAll(ORZ.LLJILJILJ(arrayList2));
            List<AnswerStruct> list3 = this.LIZLLL;
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(list3, 10));
            Iterator it2 = ((ArrayList) list3).iterator();
            while (it2.hasNext()) {
                arrayList3.add(LIZIZ((AnswerStruct) it2.next()));
            }
            java.util.Set LLJILLL = ORZ.LLJILLL(arrayList3);
            for (AnswerStruct answerStruct2 : list) {
                String LIZIZ = LIZIZ(answerStruct2);
                if (!LLJILLL.contains(LIZIZ)) {
                    LLJILLL.add(LIZIZ);
                    this.LIZLLL = ORZ.LLIIJI(answerStruct2, this.LIZLLL);
                    arrayList.add(T6W.LIZ(answerStruct2, null, false));
                }
            }
        }
        long j = this.LJIILIIL + 1;
        this.LJIILIIL = j;
        arrayList.add(new C74125T7h(0, String.valueOf(j)));
        if (arrayList.size() > 1) {
            arrayList.add(new C74125T7h(6, "void"));
        }
        this.LIZ.postValue(new C74100T6i<>(arrayList));
    }
}
