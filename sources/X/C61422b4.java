package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.2b4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61422b4 extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C61422b4 LJLIL = new C61422b4();

    public C61422b4() {
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