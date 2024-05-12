package X;

import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G8Y extends AbstractC65781Prl implements InterfaceC88472Yns<CreateAnchorInfo, Boolean> {
    public static final G8Y LJLIL = new G8Y();

    public G8Y() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(CreateAnchorInfo createAnchorInfo) {
        boolean z;
        CreateAnchorInfo it = createAnchorInfo;
        o.LJIIIZ(it, "it");
        if (it.getType() != EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE() && it.getType() != EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE() && it.getType() != EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
