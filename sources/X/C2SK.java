package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.2SK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2SK extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C2SK LJLIL = new C2SK();

    public C2SK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String param) {
        o.LJIIIZ(param, "param");
        return Boolean.valueOf(o.LJ(param, CardStruct.IStatusCode.DEFAULT));
    }
}
