package X;

import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H54 extends AbstractC65781Prl implements InterfaceC88472Yns<CreateAnchorInfo, CharSequence> {
    public static final H54 LJLIL = new H54();

    public H54() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(CreateAnchorInfo createAnchorInfo) {
        CreateAnchorInfo it = createAnchorInfo;
        o.LJIIIZ(it, "it");
        return C42891GsR.LIZ(it.getType());
    }
}