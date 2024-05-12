package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Snf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73171Snf extends AbstractC65781Prl implements InterfaceC88471Ynr<List<? extends NewFaceStickerBean>, List<? extends NewFaceStickerBean>, List<? extends NewFaceStickerBean>> {
    public static final C73171Snf LJLIL = new C73171Snf();

    public C73171Snf() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final List<? extends NewFaceStickerBean> invoke(List<? extends NewFaceStickerBean> list, List<? extends NewFaceStickerBean> list2) {
        List<? extends NewFaceStickerBean> list3 = list;
        List<? extends NewFaceStickerBean> loadMore = list2;
        o.LJIIIZ(list3, "list");
        o.LJIIIZ(loadMore, "loadMore");
        return ORZ.LLIIIZ(loadMore, list3);
    }
}
