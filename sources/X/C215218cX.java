package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.8cX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215218cX extends AbstractC65781Prl implements InterfaceC88471Ynr<C3C8, String, C76800UCe> {
    public static final C215218cX LJLIL = new C215218cX();

    public C215218cX() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C3C8 selectSubscribe, String str) {
        List arrayList;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        String rawString = C215298cf.LIZLLL.getString("key_visit_card", "");
        if (rawString == null || rawString.length() == 0) {
            arrayList = new ArrayList();
        } else {
            o.LJIIIIZZ(rawString, "rawString");
            arrayList = ORZ.LLJILJILJ(s.LJLJJL(rawString, new String[]{","}, 0, 6));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.length() > 0 && System.currentTimeMillis() - CastLongProtector.parseLong(str2) > 172800000) {
                it.remove();
            }
        }
        arrayList.add(String.valueOf(System.currentTimeMillis()));
        C215298cf.LIZLLL.storeString("key_visit_card", ORZ.LLD(arrayList, ",", null, null, null, 62));
        return C76800UCe.LIZ;
    }
}
