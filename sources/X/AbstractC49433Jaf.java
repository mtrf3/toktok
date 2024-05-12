package X;

import X.InterfaceC49435Jah;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jaf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC49433Jaf<T extends InterfaceC49435Jah<T>> extends AbstractC51037K1h<Aweme, T> {
    public abstract AbstractC73672Svk<T> LJIIJ();

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        List<Aweme> LIZLLL;
        InterfaceC49435Jah interfaceC49435Jah = (InterfaceC49435Jah) this.mData;
        if (interfaceC49435Jah == null || (LIZLLL = interfaceC49435Jah.LIZLLL()) == null) {
            return new ArrayList();
        }
        return LIZLLL;
    }

    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        InterfaceC49435Jah interfaceC49435Jah = (InterfaceC49435Jah) this.mData;
        if (interfaceC49435Jah == null || interfaceC49435Jah.LIZ() != 1) {
            return false;
        }
        return true;
    }

    public final void LJIIIZ() {
        AbstractC73638SvC.LJIIZILJ(LJIIJ()).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZ(new C49434Jag(this));
    }

    @Override // X.C8BS
    /* renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public void handleData(T t) {
        List<Aweme> list;
        List<Aweme> arrayList;
        InterfaceC49435Jah interfaceC49435Jah;
        String str;
        if (t != null) {
            list = t.LIZLLL();
        } else {
            list = null;
        }
        InterfaceC49435Jah interfaceC49435Jah2 = (InterfaceC49435Jah) this.mData;
        if (interfaceC49435Jah2 == null || (arrayList = interfaceC49435Jah2.LIZLLL()) == null) {
            arrayList = new ArrayList<>();
        }
        if (list == null || list.isEmpty()) {
            if (this.mListQueryType == 1) {
                this.mData = t;
                if (t != null) {
                    t.LIZIZ();
                }
            }
            if (this.mListQueryType != 2 && (interfaceC49435Jah = (InterfaceC49435Jah) this.mData) != null) {
                interfaceC49435Jah.LIZIZ();
                return;
            }
            return;
        }
        if (this.mListQueryType != 1) {
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                if (arrayList.indexOf(it.next()) >= 0) {
                    it.remove();
                }
            }
        }
        int i = this.mListQueryType;
        if (i != 1) {
            if (i == 4) {
                List<Aweme> LIZLLL = ((InterfaceC49435Jah) this.mData).LIZLLL();
                if (LIZLLL != null) {
                    LIZLLL.addAll(list);
                }
                ((InterfaceC49435Jah) this.mData).LIZJ(t);
            }
        } else {
            T t2 = this.mData;
            if (t2 != 0) {
                List<Aweme> LIZLLL2 = ((InterfaceC49435Jah) t2).LIZLLL();
                if (LIZLLL2 != null) {
                    LIZLLL2.clear();
                    LIZLLL2.addAll(list);
                }
                ((InterfaceC49435Jah) this.mData).LIZJ(t);
            } else {
                this.mData = t;
            }
        }
        for (Aweme aweme : list) {
            C50652JuK.Companion.getClass();
            C50321Joz LIZIZ = C50651JuJ.LIZIZ();
            if (LIZIZ == null || (str = LIZIZ.getSearchId()) == null) {
                str = "";
            }
            aweme.setRequestId(str);
        }
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        LJIIIZ();
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        LJIIIZ();
    }
}
