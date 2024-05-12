package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;

/* renamed from: X.7SA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7SA extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorCommonStruct, CharSequence> {
    public static final C7SA LJLIL = new C7SA();

    public C7SA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(AnchorCommonStruct anchorCommonStruct) {
        String keyword;
        AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
        if (anchorCommonStruct2 != null && (keyword = anchorCommonStruct2.getKeyword()) != null) {
            return keyword;
        }
        return "";
    }
}
