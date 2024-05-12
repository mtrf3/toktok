package X;

import android.util.LruCache;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KKL {
    public long LJFF;
    public XKQ LJIIIIZZ;
    public long LJIIIZ;
    public final KKN LIZ = new KKN() { // from class: X.9Y3
        public List<String> LIZ;
        public final Object LIZIZ;
        public final int LIZJ;
        public List<String> LIZLLL;
        public String LJ;

        @Override // X.KKN
        public final void LJ() {
            List<String> list = this.LIZ;
            o.LJIIIZ(list, "list");
            C9Y2.LIZ.storeString("qna_suggestion_search_historical_searches", GsonProtectorUtils.toJson(new Gson(), list.toArray(new String[0])));
        }

        @Override // X.KKN
        public final List<String> LIZLLL() {
            ArrayList arrayList;
            synchronized (this.LIZIZ) {
                List<String> list = this.LIZ;
                arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            return arrayList;
        }

        @Override // X.KKN
        public final void LJFF() {
            synchronized (this.LIZIZ) {
                this.LIZ.clear();
            }
        }

        {
            List<String> arrayList;
            List LIZ = C9Y2.LIZ();
            if (LIZ != null) {
                arrayList = ORZ.LLJILJILJ(LIZ);
            } else {
                arrayList = new ArrayList<>();
            }
            this.LIZ = arrayList;
            this.LIZIZ = new Object();
            this.LIZJ = 10;
        }

        @Override // X.KKN
        public final List<String> LIZJ() {
            List<String> arrayList;
            List LIZ = C9Y2.LIZ();
            if (LIZ != null) {
                arrayList = ORZ.LLJILJILJ(LIZ);
            } else {
                arrayList = new ArrayList<>();
            }
            this.LIZ = arrayList;
            return arrayList;
        }

        @Override // X.KKN
        public final String getHistoryList() {
            List<String> LIZLLL = LIZLLL();
            if (o.LJ(this.LIZLLL, LIZLLL)) {
                return this.LJ;
            }
            this.LIZLLL = LIZLLL;
            String encode = android.net.Uri.encode(((ArrayList) LIZLLL()).toArray(new String[0]).toString());
            this.LJ = encode;
            return encode;
        }

        @Override // X.KKN
        public final void LIZ(String str) {
            synchronized (this.LIZIZ) {
                if (this.LIZ.contains(str)) {
                    this.LIZ.remove(str);
                    ListProtector.add(this.LIZ, 0, str);
                } else {
                    this.LIZ.add(0, str);
                    if (this.LIZ.size() > this.LIZJ) {
                        ORS.LJJLL(this.LIZ);
                    }
                }
            }
        }

        @Override // X.KKN
        public final void LIZIZ(String query) {
            o.LJIIIZ(query, "query");
            synchronized (this.LIZIZ) {
                this.LIZ.remove(query);
            }
        }
    };
    public final MutableLiveData<C74100T6i<OSZ<List<KKM>, String>>> LIZIZ = new MutableLiveData<>();
    public final MutableLiveData<C74100T6i<List<C74125T7h>>> LIZJ = new MutableLiveData<>();
    public final MutableLiveData<C74100T6i<C76800UCe>> LIZLLL = new MutableLiveData<>();
    public final MutableLiveData<C74100T6i<OSZ<KKR, String>>> LJ = new MutableLiveData<>();
    public final C73318Sq2 LJI = new C73318Sq2();
    public final LruCache<String, List<KKM>> LJII = new LruCache<>(50);

    public final void LIZ(C74100T6i<? extends OSZ<? extends List<KKM>, String>> c74100T6i) {
        boolean z;
        XKQ xkq = this.LJIIIIZZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJIIIZ < 2000) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIIZ = currentTimeMillis;
        this.LJIIIIZZ = XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new KKJ(z, this, c74100T6i, null), 3);
    }

    public final List<C74125T7h> LIZIZ(boolean z) {
        List<String> LIZLLL;
        if (z) {
            LIZLLL = this.LIZ.LIZJ();
        } else {
            LIZLLL = this.LIZ.LIZLLL();
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZLLL, 10));
        for (String query : LIZLLL) {
            o.LJIIIZ(query, "query");
            arrayList.add(new KKP(query));
        }
        List<C74125T7h> LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        ArrayList arrayList2 = (ArrayList) LLJILJILJ;
        if (arrayList2.size() > 0) {
            arrayList2.add(new C74125T7h(10, "QnaSearchClearAllType"));
        }
        return LLJILJILJ;
    }

    public final void LIZJ(String str, KKR kkr) {
        this.LJ.postValue(new C74100T6i<>(new OSZ(kkr, str)));
    }
}
