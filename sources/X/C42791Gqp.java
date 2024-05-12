package X;

import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Gqp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42791Gqp extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorPublishStruct, Boolean> {
    public static final C42791Gqp LJLIL = new C42791Gqp();

    public C42791Gqp() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(AnchorPublishStruct anchorPublishStruct) {
        boolean z;
        AnchorPublishStruct it = anchorPublishStruct;
        o.LJIIIZ(it, "it");
        if (it.type != EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE() && it.type != EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE() && it.type != EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
