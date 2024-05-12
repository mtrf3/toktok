package com.ss.android.ugc.aweme.im.sdk.dmfilter;

import X.AnonymousClass316;
import X.AnonymousClass317;
import X.AnonymousClass318;
import X.C162476Zf;
import X.C31B;
import X.C31J;
import X.C32I;
import X.C47261Igj;
import X.C61878OQg;
import X.C62814Ol0;
import X.C69832od;
import X.C69842oe;
import X.C772831o;
import X.C780334l;
import X.C78613UtF;
import X.C85323Wm;
import X.ORZ;
import X.OSZ;
import X.V8H;
import X.XIA;
import X.XKX;
import X.XLM;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public class DmFilterKeywordsViewModel extends ViewModel {
    public final XLM LJLIL;
    public final XLM LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    public DmFilterKeywordsViewModel() {
        this(0);
    }

    public DmFilterKeywordsViewModel(int i) {
        XIA dispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(dispatcher, "dispatcher");
        XLM LIZ = V8H.LIZ(AnonymousClass318.LIZ);
        this.LJLIL = LIZ;
        this.LJLILLLLZI = LIZ;
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), dispatcher, null, new C69832od(this, null), 2);
    }

    public final boolean hv0(String newKeyword) {
        AnonymousClass316 anonymousClass316;
        List<String> list;
        o.LJIIIZ(newKeyword, "newKeyword");
        Object value = this.LJLIL.getValue();
        if ((value instanceof AnonymousClass316) && (anonymousClass316 = (AnonymousClass316) value) != null && (list = anonymousClass316.LIZ) != null && list.contains(newKeyword)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.OQg] */
    public final void jv0(C31J enterMethod) {
        ?? arrayList;
        o.LJIIIZ(enterMethod, "enterMethod");
        if (!this.LJLJJI || !this.LJLJI) {
            return;
        }
        AnonymousClass317 anonymousClass317 = (AnonymousClass317) this.LJLIL.getValue();
        if (anonymousClass317 instanceof AnonymousClass318) {
            arrayList = C61878OQg.INSTANCE;
        } else if (anonymousClass317 instanceof AnonymousClass316) {
            List<String> list = ((AnonymousClass316) anonymousClass317).LIZ;
            ArrayList arrayList2 = new ArrayList();
            for (String str : list) {
                if (!ujb.o.LJJJJJL(s.LLD(str).toString())) {
                    arrayList2.add(str);
                }
            }
            arrayList = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(s.LJZI((String) it.next()).toString());
            }
        } else {
            throw new C162476Zf();
        }
        String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), (Object) arrayList);
        o.LJIIIIZZ(json, "get().gson.toJson(keywords)");
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C69842oe(json, null), 3);
        int size = arrayList.size();
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("save_dm_filtered_keywords", C62814Ol0.LJFF(new OSZ("enter_method", C31B.LIZIZ(enterMethod)), new OSZ("saved_filtered_keywords_cnt", String.valueOf(size))));
    }

    public final void gv0(String newKeyword, C31J enterMethod) {
        Iterable iterable;
        o.LJIIIZ(newKeyword, "newKeyword");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLJI = true;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("add_dm_filtered_keyword", C62814Ol0.LJFF(new OSZ("enter_method", C31B.LIZIZ(enterMethod))));
        AnonymousClass317 anonymousClass317 = (AnonymousClass317) this.LJLIL.getValue();
        if (anonymousClass317 instanceof AnonymousClass318) {
            iterable = C61878OQg.INSTANCE;
        } else if (anonymousClass317 instanceof AnonymousClass316) {
            iterable = ((AnonymousClass316) anonymousClass317).LIZ;
        } else {
            throw new C162476Zf();
        }
        XLM xlm = this.LJLIL;
        do {
        } while (!xlm.compareAndSet(xlm.getValue(), new AnonymousClass316(ORZ.LLIIIZ(iterable, C47261Igj.LJJIJ(newKeyword)))));
    }

    public final void iv0(int i, C31J enterMethod) {
        Object value;
        List LLJILJILJ;
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLJI = true;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("remove_dm_filtered_keyword", C62814Ol0.LJFF(new OSZ("enter_method", C31B.LIZIZ(enterMethod))));
        AnonymousClass317 anonymousClass317 = (AnonymousClass317) this.LJLIL.getValue();
        if (!(anonymousClass317 instanceof AnonymousClass318) && (anonymousClass317 instanceof AnonymousClass316)) {
            XLM xlm = this.LJLIL;
            do {
                value = xlm.getValue();
                LLJILJILJ = ORZ.LLJILJILJ(((AnonymousClass316) anonymousClass317).LIZ);
                ListProtector.remove(LLJILJILJ, i);
            } while (!xlm.compareAndSet(value, new AnonymousClass316(LLJILJILJ)));
        }
    }
}
