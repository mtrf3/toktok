package X;

import com.ss.android.ugc.aweme.feed.assem.contentclassificationmask.ContentClassificationMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.contentclassificationmask.ContentClassificationMaskVM;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8J2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8J2 extends AbstractC65781Prl implements InterfaceC88471Ynr<ContentClassificationMaskAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C8J2 LJLIL = new C8J2();

    public C8J2() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(ContentClassificationMaskAssem contentClassificationMaskAssem, C43I<? extends Integer> c43i) {
        ContentClassificationMaskAssem selectSubscribe = contentClassificationMaskAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            ContentClassificationMaskVM p4 = selectSubscribe.p4();
            p4.getClass();
            p4.setState(new AqS169S0100000_3(p4, 932));
        }
        return C76800UCe.LIZ;
    }
}