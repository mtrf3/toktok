package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;

/* renamed from: X.7eO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190887eO extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorCommonStruct, CharSequence> {
    public static final C190887eO LJLIL = new C190887eO();

    public C190887eO() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(AnchorCommonStruct anchorCommonStruct) {
        String str;
        AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
        if (anchorCommonStruct2 != null) {
            str = anchorCommonStruct2.getLogExtra();
        } else {
            str = null;
        }
        return C190847eK.LIZJ(str, "anchor_type");
    }
}
