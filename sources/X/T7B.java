package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.question.ForumStruct;
import defpackage.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T7B implements InterfaceC74129T7l {
    public final MutableLiveData<C74100T6i<List<C74125T7h>>> LIZ;
    public final MutableLiveData LIZIZ;
    public final MutableLiveData<C74100T6i<KKR>> LIZJ;
    public final MutableLiveData<C74100T6i<KKR>> LIZLLL;
    public final MutableLiveData LJ;
    public final MutableLiveData<C74100T6i<Long>> LJFF;
    public final MutableLiveData LJI;
    public List<ForumStruct> LJII;
    public final java.util.Map<String, String> LJIIIIZZ;
    public final java.util.Set<String> LJIIIZ;
    public final C74119T7b LJIIJ;
    public final int LJIIJJI;
    public int LJIIL;
    public final C73318Sq2 LJIILIIL;
    public final Object LJIILJJIL;
    public final AtomicBoolean LJIILL;
    public final AtomicBoolean LJIILLIIL;
    public long LJIIZILJ;

    public T7B() {
        int LIZIZ;
        MutableLiveData<C74100T6i<List<C74125T7h>>> mutableLiveData = new MutableLiveData<>();
        this.LIZ = mutableLiveData;
        this.LIZIZ = mutableLiveData;
        this.LIZJ = new MutableLiveData<>();
        this.LIZLLL = new MutableLiveData<>();
        this.LJ = new MutableLiveData();
        MutableLiveData<C74100T6i<Long>> mutableLiveData2 = new MutableLiveData<>();
        this.LJFF = mutableLiveData2;
        this.LJI = mutableLiveData2;
        this.LJII = new ArrayList();
        this.LJIIIIZZ = new HashMap();
        this.LJIIIZ = new HashSet();
        this.LJIIJ = new C74119T7b();
        if (e1.LIZ(31744, "public_qna_analytics_tab", true, false)) {
            LIZIZ = 1;
        } else {
            LIZIZ = Q7K.LIZIZ("qna_api_max_query_limit", 30);
        }
        this.LJIIJJI = LIZIZ;
        this.LJIILIIL = new C73318Sq2();
        this.LJIILJJIL = new Object();
        this.LJIILL = new AtomicBoolean(false);
        this.LJIILLIIL = new AtomicBoolean(true);
    }

    @Override // X.InterfaceC74129T7l
    public final void LIZ(C69605RTl translationResult) {
        o.LJIIIZ(translationResult, "translationResult");
        if (translationResult.LIZ) {
            String str = translationResult.LIZLLL;
            if (str != null) {
                synchronized (this.LJIILJJIL) {
                    ((HashMap) this.LJIIIIZZ).put(translationResult.LIZIZ, str);
                    ((HashSet) this.LJIIIZ).remove(translationResult.LIZIZ);
                }
                LIZJ(this, C61878OQg.INSTANCE, null, false, false, 30);
                return;
            }
            return;
        }
        synchronized (this.LJIILJJIL) {
            ((HashSet) this.LJIIIZ).remove(translationResult.LIZIZ);
        }
    }

    public final void LIZIZ(String str, boolean z, boolean z2, List list) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new C74124T7g(str));
        }
        synchronized (this.LJIILJJIL) {
            List<ForumStruct> list2 = this.LJII;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
            Iterator it = ((ArrayList) list2).iterator();
            while (true) {
                String str2 = null;
                if (!it.hasNext()) {
                    break;
                }
                ForumStruct forumStruct = (ForumStruct) it.next();
                boolean contains = ((HashSet) this.LJIIIZ).contains(String.valueOf(forumStruct.getId()));
                if (((HashMap) this.LJIIIIZZ).keySet().contains(String.valueOf(forumStruct.getId()))) {
                    str2 = (String) ((HashMap) this.LJIIIIZZ).get(String.valueOf(forumStruct.getId()));
                }
                arrayList2.add(T6W.LIZIZ(forumStruct, str2, contains));
            }
            arrayList.addAll(ORZ.LLJILJILJ(arrayList2));
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((C74125T7h) it2.next()).LIZIZ);
            }
            java.util.Set LLJILLL = ORZ.LLJILLL(arrayList3);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ForumStruct forumStruct2 = (ForumStruct) it3.next();
                if (!LLJILLL.contains(String.valueOf(forumStruct2.getId()))) {
                    LLJILLL.add(String.valueOf(forumStruct2.getId()));
                    this.LJII = ORZ.LLJILJILJ(ORZ.LLIIJI(forumStruct2, this.LJII));
                    arrayList.add(T6W.LIZIZ(forumStruct2, null, false));
                }
            }
        }
        if (z2) {
            this.LJIIZILJ++;
        }
        arrayList.add(new C74125T7h(0, String.valueOf(this.LJIIZILJ)));
        if (arrayList.size() > 1) {
            arrayList.add(new C74125T7h(6, "void"));
        }
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new KMN(this, arrayList, null), 3);
    }

    public static /* synthetic */ void LIZJ(T7B t7b, List list, String str, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        boolean z3 = false;
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z3 = true;
        }
        t7b.LIZIZ(str, z, z3, list);
    }
}
