package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2f5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63912f5 extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public static final C63912f5 LJLIL = new C63912f5();

    public C63912f5() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String str2;
        String pushPayload = str;
        o.LJIIIZ(pushPayload, "pushPayload");
        C3UH.LIZJ(pushPayload);
        List LJLJJL = s.LJLJJL(pushPayload, new String[]{","}, 0, 6);
        if (LJLJJL.size() >= 2) {
            List LJLJJL2 = s.LJLJJL((CharSequence) ListProtector.get(LJLJJL, 0), new String[]{":"}, 0, 6);
            if (LJLJJL2.size() >= 2 && ((String) ListProtector.get(LJLJJL2, 1)).length() >= 2) {
                str2 = ((String) ListProtector.get(LJLJJL2, 1)).substring(1, ((String) ListProtector.get(LJLJJL2, 1)).length() - 1);
                o.LJIIIIZZ(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("receive moderation result from push, vFrameUri is ");
                LIZ.append(str2);
                C3UH.LIZLLL(X1D.LIZIZ(LIZ));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("get push result ");
                LIZ2.append(str2);
                LIZ2.append(", remove it from list and check to cancel process");
                C3UH.LIZLLL(X1D.LIZIZ(LIZ2));
                C3UH.LIZ.remove(str2);
                C3UH.LIZIZ();
                return C76800UCe.LIZ;
            }
        }
        C3UH.LIZLLL("attention, receive moderation result from push but vFrameUri is empty");
        str2 = "";
        StringBuilder LIZ22 = X1D.LIZ();
        LIZ22.append("get push result ");
        LIZ22.append(str2);
        LIZ22.append(", remove it from list and check to cancel process");
        C3UH.LIZLLL(X1D.LIZIZ(LIZ22));
        C3UH.LIZ.remove(str2);
        C3UH.LIZIZ();
        return C76800UCe.LIZ;
    }
}
