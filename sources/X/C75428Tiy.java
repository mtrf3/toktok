package X;

import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tiy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75428Tiy {
    public final C73318Sq2 LIZ = new C73318Sq2();

    public final void LIZ() {
        this.LIZ.LIZLLL();
    }

    public static List LIZIZ(List list) {
        U8H LJJZZI;
        U8H LJJZZI2;
        C76696U8e LJJIII;
        List<InterfaceC75179Tex> allLayoutWindows;
        U8H LJJZZI3;
        C76696U8e LJJIII2;
        List<InterfaceC75179Tex> allLayoutWindows2;
        ArrayList arrayList = new ArrayList();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 == null || (LJJZZI = R6.LJJZZI()) == null || LJJZZI.LJJIII() == null) {
            return ORZ.LLJILJILJ(C61878OQg.INSTANCE);
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LJJZZI2 = R62.LJJZZI()) != null && (LJJIII = LJJZZI2.LJJIII()) != null && (allLayoutWindows = LJJIII.getAllLayoutWindows()) != null && (!allLayoutWindows.isEmpty())) {
            InterfaceC75441TjB R63 = C8E.LJ().R6();
            if (R63 != null && (LJJZZI3 = R63.LJJZZI()) != null && (LJJIII2 = LJJZZI3.LJJIII()) != null && (allLayoutWindows2 = LJJIII2.getAllLayoutWindows()) != null) {
                int i = -1;
                for (InterfaceC75179Tex interfaceC75179Tex : allLayoutWindows2) {
                    if (list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (o.LJ(((LinkListUser) it.next()).linkMicId, interfaceC75179Tex.LJJ())) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    LinkListUser linkListUser = (LinkListUser) it2.next();
                                    if (o.LJ(linkListUser.linkMicId, interfaceC75179Tex.LJJ())) {
                                        i++;
                                        ListProtector.add(arrayList, i, linkListUser);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }
}
