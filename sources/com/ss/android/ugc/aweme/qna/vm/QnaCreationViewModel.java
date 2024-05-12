package com.ss.android.ugc.aweme.qna.vm;

import X.C113554cx;
import X.C118904la;
import X.C118984li;
import X.C119034ln;
import X.C119054lp;
import X.C119064lq;
import X.C119084ls;
import X.C119094lt;
import X.C119104lu;
import X.C119114lv;
import X.C119164m0;
import X.C119194m3;
import X.C14Q;
import X.C184077Kh;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C32I;
import X.C38350F3i;
import X.C47261Igj;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C78926UyI;
import X.C79146V4k;
import X.EnumC118964lg;
import X.FMX;
import X.InterfaceC92693kP;
import X.JBR;
import X.OJ4;
import X.OJD;
import X.X1D;
import X.XKX;
import Y.AObserverS69S0100000_1;
import android.os.SystemClock;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.settings.QnaCategoriesList;
import com.ss.android.ugc.aweme.qna.settings.QnaCategoryListItem;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.JobSupport;

/* loaded from: classes2.dex */
public final class QnaCreationViewModel extends AssemViewModel<C118904la> {
    public static final C62822Ol8 LJZI = C221108m2.LIZIZ(C119104lu.LJLIL);
    public static final C62822Ol8 LJZL = C221108m2.LIZIZ(C119094lt.LJLIL);
    public static final C62822Ol8 LL = C221108m2.LIZIZ(C119114lv.LJLIL);
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public final MutableLiveData<List<C119054lp>> LJLJLJ;
    public final LiveData<List<String>> LJLJLLL;
    public Map<String, String> LJLL;
    public final Set<String> LJLLI;
    public final MutableLiveData<EnumC118964lg> LJLLILLLL;
    public final LiveData<String> LJLLJ;
    public final LinkedHashMap<String, InterfaceC92693kP> LJLLL;
    public long LJLLLL;
    public String LJLLLLLL;
    public JobSupport LJLZ;
    public List<String> LJZ;
    public final C119194m3 LJLIL = new C119194m3();
    public final C214378bB LJLILLLLZI = new C214378bB(C65352Pkq.LIZ(QnaCreationSharedViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C119084ls.INSTANCE, null, null);
    public String LJLJJLL = "";
    public final String LJLJL = SettingServiceImpl.LIZ().getAppLanguage();

    public final void hv0() {
        if (this.LJLJI == null && o.LJ(this.LJLJL, "en")) {
            List LJJIJLIJ = C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJJLL(OJD.findAll$default((OJD) LL.getValue(), this.LJLJJLL, 0, 2, null), C119064lq.LJLIL)));
            if (LJJIJLIJ.size() > 2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LJLJJLL);
                LIZ.append('|');
                LIZ.append(this.LJLJL);
                String LIZIZ = X1D.LIZIZ(LIZ);
                if (o.LJ(this.LJLLLLLL, LIZIZ) || this.LJLLL.containsKey(LIZIZ)) {
                    return;
                }
                long elapsedRealtime = this.LJLLLL + (500 - SystemClock.elapsedRealtime());
                this.LJLLLL = SystemClock.elapsedRealtime();
                this.LJLZ.LIZIZ(null);
                this.LJLZ = XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C118984li(LJJIJLIJ, this, elapsedRealtime, LIZIZ, null), 3);
            }
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C118904la defaultState() {
        return new C118904la(0);
    }

    public final String getEnterFrom() {
        String str = this.LJLJJI;
        if (str != null) {
            return str;
        }
        o.LJIJI("enterFrom");
        throw null;
    }

    public final boolean iv0() {
        if (((Boolean) C119164m0.LIZ.getValue()).booleanValue() && o.LJ(this.LJLJL, "en")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public QnaCreationViewModel() {
        Object obj;
        EnumC118964lg enumC118964lg;
        List<QnaCategoryListItem> list;
        C119034ln.LIZ.getClass();
        QnaCategoriesList qnaCategoriesList = (QnaCategoriesList) C119034ln.LIZJ.getValue();
        if (qnaCategoriesList != null && (list = qnaCategoriesList.categories) != null) {
            obj = new ArrayList(C32I.LJJL(list, 10));
            for (QnaCategoryListItem qnaCategoryListItem : list) {
                obj.add(new C119054lp(qnaCategoryListItem.categoryId, qnaCategoryListItem.categoryName));
            }
        } else {
            obj = C61878OQg.INSTANCE;
        }
        MutableLiveData<List<C119054lp>> mutableLiveData = new MutableLiveData<>(obj);
        this.LJLJLJ = mutableLiveData;
        LiveData<List<String>> map = Transformations.map(mutableLiveData, new C14Q() { // from class: X.4lk
            @Override // X.C14Q
            public final Object apply(Object obj2) {
                List list2 = (List) obj2;
                o.LJIIIIZZ(list2, "list");
                ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C119054lp) it.next()).LJLILLLLZI);
                }
                return arrayList;
            }
        });
        o.LJIIIIZZ(map, "map(_categoriesList) { l…egoryName\n        }\n    }");
        this.LJLJLLL = map;
        this.LJLL = C113554cx.LJJJLIIL();
        this.LJLLI = new LinkedHashSet();
        if (iv0()) {
            enumC118964lg = EnumC118964lg.QA_ASK_TOPIC_STATIC_HINT_VISIBILITY;
        } else {
            enumC118964lg = EnumC118964lg.QA_ASK_TOPIC_STATIC_HINT;
        }
        MutableLiveData<EnumC118964lg> mutableLiveData2 = new MutableLiveData<>(enumC118964lg);
        this.LJLLILLLL = mutableLiveData2;
        LiveData<String> map2 = Transformations.map(mutableLiveData2, new C14Q() { // from class: X.4ll
            @Override // X.C14Q
            public final Object apply(Object obj2) {
                return EF7.LIZIZ().getString(((EnumC118964lg) obj2).getResId());
            }
        });
        o.LJIIIIZZ(map2, "map(\n        _hintText,\n…getString(it.resId)\n    }");
        this.LJLLJ = map2;
        this.LJLLL = new LinkedHashMap<>();
        this.LJLLLL = -500L;
        this.LJLLLLLL = "";
        this.LJLZ = C79146V4k.LJIILIIL();
        this.LJZ = C61878OQg.INSTANCE;
        mutableLiveData.observeForever(new AObserverS69S0100000_1(this, 59));
    }

    public static String jv0(List list) {
        ArrayList arrayList;
        Gson gson = new Gson();
        if (list != null) {
            arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String uid = ((User) it.next()).getUid();
                o.LJIIIIZZ(uid, "it.uid");
                arrayList.add(C38350F3i.LJJIZ(uid));
            }
        } else {
            arrayList = null;
        }
        return GsonProtectorUtils.toJson(gson, arrayList);
    }

    public final void gv0(String str) {
        this.LJLJI = this.LJLL.get(str);
        if (str == null) {
            hv0();
        } else {
            FMX.LJIIL("qa_category_select", JBR.LJIIIIZZ("enter_from", getEnterFrom(), "question_category_by_user", this.LJLJI).LIZ);
        }
    }
}
