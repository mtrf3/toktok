package X;

import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Gqn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42789Gqn extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorPublishStruct, Boolean> {
    public static final C42789Gqn LJLIL = new C42789Gqn();

    public C42789Gqn() {
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
