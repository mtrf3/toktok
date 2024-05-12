package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQX<T> implements InterfaceC64592gB<List<? extends C82268WQm>> {
    public final /* synthetic */ WQW LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public WQX(WQW wqw, List list, int i) {
        this.LJLIL = wqw;
        this.LJLILLLLZI = list;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(List<? extends C82268WQm> list) {
        C82268WQm c82268WQm;
        List<? extends C82268WQm> infoList = list;
        WQW wqw = this.LJLIL;
        List list2 = this.LJLILLLLZI;
        o.LJIIIIZZ(infoList, "infoList");
        int i = this.LJLJI;
        wqw.getClass();
        ArrayList arrayList = new ArrayList();
        for (C82268WQm c82268WQm2 : infoList) {
            C82268WQm LIZIZ = wqw.LJLJJI.LIZIZ(Integer.valueOf(c82268WQm2.LJLIL));
            if (LIZIZ == null || LIZIZ.LJLILLLLZI == EnumC82260WQe.FILTER_STATE_UNKNOWN) {
                arrayList.add(c82268WQm2);
            }
        }
        wqw.LLLZLL(arrayList);
        if (!wqw.LJLLLLLL) {
            return;
        }
        if (i == -1) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                C79155V4t c79155V4t = (C79155V4t) obj;
                Iterator<? extends C82268WQm> it = infoList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c82268WQm = it.next();
                        if (c82268WQm.LJLIL == c79155V4t.LIZ) {
                            break;
                        }
                    } else {
                        c82268WQm = null;
                        break;
                    }
                }
                C82268WQm c82268WQm3 = c82268WQm;
                if (c82268WQm3 == null || c82268WQm3.LJLILLLLZI != EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS) {
                    arrayList2.add(obj);
                }
            }
            wqw.LLLLZLLIL(arrayList2);
            return;
        }
        if (list2.size() <= i) {
            wqw.LLLLZLLIL(list2);
        } else {
            wqw.LLLLZLLIL(list2.subList(0, i));
        }
    }
}
