package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.918, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass918 extends AbstractC65781Prl implements InterfaceC88471Ynr<CellStickerManagerComponent, C43I<? extends C76800UCe>, C76800UCe> {
    public static final AnonymousClass918 LJLIL = new AnonymousClass918();

    public AnonymousClass918() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(CellStickerManagerComponent cellStickerManagerComponent, C43I<? extends C76800UCe> c43i) {
        Fragment fragment;
        CellStickerManagerComponent selectSubscribe = cellStickerManagerComponent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            BaseFeedPageParams baseFeedPageParams = selectSubscribe.a1().LJ;
            if (baseFeedPageParams != null && !baseFeedPageParams.isPlayListCleanMode()) {
                selectSubscribe.c4().LJIIJJI(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme());
                C245639kV c4 = selectSubscribe.c4();
                Context context = selectSubscribe.getContext();
                C222588oQ c222588oQ = selectSubscribe.a1().LIZLLL;
                if (c222588oQ != null) {
                    fragment = c222588oQ.LIZJ;
                } else {
                    fragment = null;
                }
                c4.LJIIJ(context, fragment);
            }
            selectSubscribe.b4();
        }
        return C76800UCe.LIZ;
    }
}
