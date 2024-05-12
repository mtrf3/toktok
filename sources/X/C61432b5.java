package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.2b5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61432b5 extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C61432b5 LJLIL = new C61432b5();

    public C61432b5() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String param) {
        boolean z;
        o.LJIIIZ(param, "param");
        if (o.LJ(param, CardStruct.IStatusCode.DEFAULT) || o.LJ(param, "false")) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
