package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.7Z0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7Z0 extends AbstractC65781Prl implements InterfaceC88472Yns<TextExtraStruct, Boolean> {
    public static final C7Z0 LJLIL = new C7Z0();

    public C7Z0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(TextExtraStruct textExtraStruct) {
        TextExtraStruct it = textExtraStruct;
        o.LJIIIZ(it, "it");
        boolean z = true;
        if (it.getType() != 1 || it.isCommerce()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
