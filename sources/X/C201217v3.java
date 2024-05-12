package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.7v3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201217v3 extends AbstractC65781Prl implements InterfaceC88472Yns<AnonymousClass852<C85M>, Boolean> {
    public static final C201217v3 LJLIL = new C201217v3();

    public C201217v3() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(AnonymousClass852<C85M> anonymousClass852) {
        C85M c85m;
        TextExtraStruct textExtraStruct;
        C85M c85m2;
        TextExtraStruct textExtraStruct2;
        AnonymousClass852<C85M> textComponent = anonymousClass852;
        o.LJIIIZ(textComponent, "textComponent");
        boolean z = false;
        if (C86Z.LIZ && (c85m = textComponent.LJI) != null && (textExtraStruct = c85m.LIZ) != null && textExtraStruct.getType() == 1 && (c85m2 = textComponent.LJI) != null && (textExtraStruct2 = c85m2.LIZ) != null && !textExtraStruct2.isCommerce()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
