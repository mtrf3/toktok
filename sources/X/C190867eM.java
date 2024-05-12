package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;

/* renamed from: X.7eM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190867eM extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorCommonStruct, CharSequence> {
    public static final C190867eM LJLIL = new C190867eM();

    public C190867eM() {
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
        return C190847eK.LIZJ(str, "anchor_id");
    }
}
