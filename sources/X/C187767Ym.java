package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;

/* renamed from: X.7Ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187767Ym extends AbstractC65781Prl implements InterfaceC88472Yns<TextExtraStruct, Boolean> {
    public static final C187767Ym LJLIL = new C187767Ym();

    public C187767Ym() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(TextExtraStruct textExtraStruct) {
        TextExtraStruct textExtraStruct2 = textExtraStruct;
        boolean z = true;
        if (textExtraStruct2.getType() != 1 || textExtraStruct2.isCommerce()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
