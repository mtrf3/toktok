package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.SQp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72079SQp<T> implements InterfaceC64592gB {
    public static final C72079SQp<T> LJLIL = new C72079SQp<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Aweme aweme = (Aweme) obj;
        InterfaceC72081SQr<String> interfaceC72081SQr = C72080SQq.LIZ;
        Aweme aweme2 = interfaceC72081SQr.get(aweme.getAid());
        if ((aweme2 == null || !o.LJ(aweme2, aweme)) && C51630KOc.LIZ() != null) {
            C72076SQm.LJFF(aweme.m114clone(), interfaceC72081SQr);
        }
    }
}
