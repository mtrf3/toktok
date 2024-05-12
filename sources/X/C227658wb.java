package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;

/* renamed from: X.8wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227658wb extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorCommonStruct, Boolean> {
    public static final C227658wb LJLIL = new C227658wb();

    public C227658wb() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(AnchorCommonStruct anchorCommonStruct) {
        boolean z;
        if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_UGC_TEMPLATE.getTYPE()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
