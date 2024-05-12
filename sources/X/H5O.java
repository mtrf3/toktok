package X;

import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H5O extends AbstractC65781Prl implements InterfaceC88472Yns<CreateAnchorInfo, CharSequence> {
    public static final H5O LJLIL = new H5O();

    public H5O() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(CreateAnchorInfo createAnchorInfo) {
        CreateAnchorInfo it = createAnchorInfo;
        o.LJIIIZ(it, "it");
        if (it.getType() == EnumC42934Gt8.LEMON8_GENERAL_ANCHOR.getTYPE()) {
            return "Lemon8 | app";
        }
        return it.getKeyword();
    }
}
