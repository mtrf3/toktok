package X;

import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I1H extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final I1H LJLIL = new I1H();

    public I1H() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(o.LJ(FaceStickerBean.sCurPropSource, "qa_prop"));
    }
}
