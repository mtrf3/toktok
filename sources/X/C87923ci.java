package X;

import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.3ci, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87923ci extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C87933cj, C76800UCe> {
    public static final C87923ci LJLIL = new C87923ci();

    public C87923ci() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem selectSubscribe, C87933cj c87933cj) {
        String str;
        String str2;
        C87933cj c87933cj2 = c87933cj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c87933cj2 != null) {
            if (c87933cj2.LJLJI > 0) {
                if (c87933cj2.LJLJL > 0) {
                    str = "normal";
                } else {
                    str = "recent";
                }
            } else if (c87933cj2.LJLJL > 0) {
                str = "suggested";
            } else {
                str = "empty";
            }
            long currentTimeMillis = System.currentTimeMillis() - c87933cj2.LJLJLJ;
            if (c87933cj2.LJLJJL) {
                str2 = "cache";
            } else {
                str2 = "network";
            }
            boolean z = C87943ck.LIZ;
            long j = c87933cj2.LJLIL;
            long j2 = c87933cj2.LJLILLLLZI;
            int i = c87933cj2.LJLJI;
            C3QD.LIZLLL("default", str, z, currentTimeMillis, Long.valueOf(c87933cj2.LJLJJI), str2, Long.valueOf(c87933cj2.LJLJJLL), Integer.valueOf(c87933cj2.LJLJL), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), null, null, 14336);
            C87943ck.LIZ = false;
        }
        return C76800UCe.LIZ;
    }
}
