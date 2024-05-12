package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.7Yz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187897Yz extends AbstractC65781Prl implements InterfaceC88472Yns<TextExtraStruct, Boolean> {
    public static final C187897Yz LJLIL = new C187897Yz();

    public C187897Yz() {
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
