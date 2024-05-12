package X;

import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BiS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29532BiS extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends C1QC>, C76800UCe> {
    public static final C29532BiS LJLIL = new C29532BiS();

    public C29532BiS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends C1QC> list) {
        List<? extends C1QC> effectPanelList = list;
        o.LJIIIZ(effectPanelList, "effectPanelList");
        C29536BiW.LIZ = effectPanelList;
        C29536BiW.LIZJ = null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1QC c1qc : effectPanelList) {
            if (o.LJ(c1qc.LJLIL, "livestickertext")) {
                arrayList2.add(c1qc);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            List<Object> list2 = ((C1QC) it.next()).LJLILLLLZI;
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<Object> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(String.valueOf(((Sticker) it2.next()).id));
            }
            arrayList.addAll(arrayList3);
        }
        if (!arrayList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size() - 1;
            for (int i = 0; i < size; i = C0EH.LIZIZ(sb, (String) ListProtector.get(arrayList, i), ",", i, 1)) {
            }
            sb.append((String) ORZ.LLFF(arrayList));
            String sb2 = sb.toString();
            if (sb2 != null && sb2.length() != 0 && sb2 != null) {
                C1EW.LIZ(((DecorationApi) C1A.LIZJ(DecorationApi.class)).checkEditable(sb2)).LJJJLIIL(C29533BiT.LJLIL, C28264B7k.LJLIL);
            }
        }
        return C76800UCe.LIZ;
    }
}
