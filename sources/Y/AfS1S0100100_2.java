package Y;

import X.C173306r8;
import X.C76800UCe;
import X.InterfaceC64592gB;
import X.InterfaceC88471Ynr;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;

/* loaded from: classes3.dex */
public class AfS1S0100100_2 implements InterfaceC64592gB {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS1S0100100_2 afS1S0100100_2, Object obj) {
        AddYoursStickerTopicRepo addYoursStickerTopicRepo = (AddYoursStickerTopicRepo) afS1S0100100_2.l0;
        int currentTimeMillis = (int) (System.currentTimeMillis() - afS1S0100100_2.j1);
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "";
        }
        addYoursStickerTopicRepo.getClass();
        AddYoursStickerTopicRepo.LIZ(currentTimeMillis, "1", message);
    }

    public static final void accept$1(AfS1S0100100_2 afS1S0100100_2, Object obj) {
        Throwable th = (Throwable) obj;
        C173306r8.LIZ(-1, th.getMessage(), "", false, afS1S0100100_2.j1);
        String message = th.getMessage();
        if (message != null) {
            ((InterfaceC88471Ynr) afS1S0100100_2.l0).invoke(message, "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:Y.AfS1S0100100_2) (LINE:50331651) Y.AfS1S0100100_2.j1 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.Object), (r0 I:Y.AfS1S0100100_2) (LINE:50331653) Y.AfS1S0100100_2.l0 java.lang.Object, block:B:1:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.AfS1S0100100_2, java.lang.Object] */
    public AfS1S0100100_2(long j, long j2, InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr) {
        long j3;
        Object obj;
        r1.$t = interfaceC88471Ynr;
        r1.j1 = j3;
        r1.l0 = obj;
        ?? obj2 = new Object();
    }
}
