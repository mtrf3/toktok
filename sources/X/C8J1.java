package X;

import com.ss.android.ugc.aweme.feed.assem.contentclassificationmask.ContentClassificationMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.contentclassificationmask.ContentClassificationMaskVM;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8J1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8J1 extends AbstractC65781Prl implements InterfaceC88471Ynr<ContentClassificationMaskAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C8J1 LJLIL = new C8J1();

    public C8J1() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(ContentClassificationMaskAssem contentClassificationMaskAssem, C43I<? extends Boolean> c43i) {
        ContentClassificationMaskAssem selectSubscribe = contentClassificationMaskAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (!C53324KwK.LIZ() || ((Boolean) it.LIZ).booleanValue()) {
            ContentClassificationMaskVM p4 = selectSubscribe.p4();
            p4.getClass();
            p4.withState(new AqS169S0100000_3(p4, 933));
        }
        return C76800UCe.LIZ;
    }
}
