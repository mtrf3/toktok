package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Sng, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73172Sng extends AbstractC65781Prl implements InterfaceC88471Ynr<List<? extends NewFaceStickerBean>, List<? extends NewFaceStickerBean>, List<? extends NewFaceStickerBean>> {
    public static final C73172Sng LJLIL = new C73172Sng();

    public C73172Sng() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final List<? extends NewFaceStickerBean> invoke(List<? extends NewFaceStickerBean> list, List<? extends NewFaceStickerBean> refresh) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(refresh, "refresh");
        return refresh;
    }
}
