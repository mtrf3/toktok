package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ct, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62552ct extends F9E implements InterfaceC57784Mm4 {
    public final List<Aweme> LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C62552ct)) {
            return false;
        }
        C62552ct c62552ct = (C62552ct) interfaceC57784Mm4;
        if (this.LJLILLLLZI != c62552ct.LJLILLLLZI || this.LJLJI != c62552ct.LJLJI) {
            return false;
        }
        List<Aweme> list = this.LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<Aweme> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAid());
        }
        java.util.Set LLJJ = ORZ.LLJJ(arrayList);
        Iterator<Aweme> it2 = c62552ct.LJLIL.iterator();
        while (it2.hasNext()) {
            if (!LLJJ.contains(it2.next().getAid())) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C62552ct)) {
            return false;
        }
        C62552ct c62552ct = (C62552ct) interfaceC57784Mm4;
        if (this.LJLILLLLZI != c62552ct.LJLILLLLZI || this.LJLJI != c62552ct.LJLJI || this.LJLIL.size() != c62552ct.LJLIL.size()) {
            return false;
        }
        return true;
    }

    public C62552ct(List<Aweme> list, int i, int i2) {
        this.LJLIL = list;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
