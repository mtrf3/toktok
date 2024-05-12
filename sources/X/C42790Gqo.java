package X;

import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Gqo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42790Gqo extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorPublishStruct, Boolean> {
    public static final C42790Gqo LJLIL = new C42790Gqo();

    public C42790Gqo() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(AnchorPublishStruct anchorPublishStruct) {
        boolean z;
        AnchorPublishStruct anchor = anchorPublishStruct;
        o.LJIIIZ(anchor, "anchor");
        if (anchor.type != EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE() && anchor.type != EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE() && anchor.type != EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
