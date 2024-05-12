package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WlL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83219WlL implements InterfaceC80707Vlv {
    public final /* synthetic */ C83238Wle LIZ;
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ ArrayList LIZJ;

    @Override // X.InterfaceC80707Vlv
    public final void LIZ(C164456cr c164456cr) {
    }

    @Override // X.InterfaceC80707Vlv
    public final void LIZIZ(C164456cr c164456cr) {
    }

    @Override // X.InterfaceC80707Vlv
    public final void LIZJ(C164456cr tab, boolean z) {
        Object obj;
        o.LJIIIZ(tab, "tab");
        Iterator it = this.LIZIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(ListProtector.get(this.LIZJ, tab.LIZJ), ((BeautyCategory) obj).getCategoryResponse().getId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        BeautyCategory beautyCategory = (BeautyCategory) obj;
        if (beautyCategory != null) {
            C83252Wls c83252Wls = this.LIZ.LJFF;
            c83252Wls.getClass();
            c83252Wls.LIZ.d8(beautyCategory);
            c83252Wls.LIZLLL.LJIIJJI(beautyCategory);
        }
    }

    public C83219WlL(C83238Wle c83238Wle, List list, ArrayList arrayList) {
        this.LIZ = c83238Wle;
        this.LIZIZ = list;
        this.LIZJ = arrayList;
    }
}
