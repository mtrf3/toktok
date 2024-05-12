package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WlM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83220WlM implements InterfaceC80692Vlg {
    public final /* synthetic */ C83207Wl9 LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ ArrayList LJLJI;

    public C83220WlM(C83207Wl9 c83207Wl9, List list, ArrayList arrayList) {
        this.LJLIL = c83207Wl9;
        this.LJLILLLLZI = list;
        this.LJLJI = arrayList;
    }

    @Override // X.InterfaceC80692Vlg
    public final void LJFF(C164456cr c164456cr) {
        Object obj;
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
            InterfaceC83246Wlm beautyBuried = this.LJLIL.getBeautyBuried();
            if (beautyBuried != null) {
                beautyBuried.LJFF(beautyCategory);
            }
            InterfaceC83233WlZ beautyOnInteractListener = this.LJLIL.getBeautyOnInteractListener();
            if (beautyOnInteractListener != null) {
                beautyOnInteractListener.LIZLLL(beautyCategory);
            }
        }
    }
}
