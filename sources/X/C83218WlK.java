package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WlK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83218WlK implements InterfaceC80692Vlg {
    public final /* synthetic */ C83238Wle LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ ArrayList LJLJI;

    public C83218WlK(C83238Wle c83238Wle, List list, ArrayList arrayList) {
        this.LJLIL = c83238Wle;
        this.LJLILLLLZI = list;
        this.LJLJI = arrayList;
    }

    @Override // X.InterfaceC80692Vlg
    public final void LJFF(C164456cr c164456cr) {
        Object obj;
        InterfaceC83246Wlm interfaceC83246Wlm;
        c164456cr.LIZ();
        Iterator it = this.LJLILLLLZI.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(ListProtector.get(this.LJLJI, c164456cr.LIZJ), ((BeautyCategory) obj).getCategoryResponse().getId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        BeautyCategory beautyCategory = (BeautyCategory) obj;
        if (beautyCategory != null) {
            C83252Wls c83252Wls = this.LJLIL.LJFF;
            C68249QqT c68249QqT = c83252Wls.LIZIZ;
            if (c68249QqT != null && (interfaceC83246Wlm = (InterfaceC83246Wlm) c68249QqT.LIZ) != null) {
                interfaceC83246Wlm.LJFF(beautyCategory);
            }
            InterfaceC83233WlZ interfaceC83233WlZ = c83252Wls.LIZJ;
            if (interfaceC83233WlZ != null) {
                interfaceC83233WlZ.LIZLLL(beautyCategory);
            }
        }
    }
}
