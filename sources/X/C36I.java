package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.36I, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36I extends AbstractC65781Prl implements InterfaceC88472Yns<IMUser, String> {
    public static final C36I LJLIL = new C36I();

    public C36I() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(IMUser iMUser) {
        IMUser it = iMUser;
        o.LJIIIZ(it, "it");
        String uid = it.getUid();
        o.LJIIIIZZ(uid, "it.uid");
        return uid;
    }
}
