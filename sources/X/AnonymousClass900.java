package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.900, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass900 extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractPlayListBottomBarAssem, C43I<? extends Integer>, C76800UCe> {
    public static final AnonymousClass900 LJLIL = new AnonymousClass900();

    public AnonymousClass900() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractPlayListBottomBarAssem interactPlayListBottomBarAssem, C43I<? extends Integer> c43i) {
        String str;
        C229238z9 c229238z9;
        InteractPlayListBottomBarAssem selectSubscribe = interactPlayListBottomBarAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            View containerView = selectSubscribe.getContainerView();
            VideoItemParams item = (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe);
            Context context = selectSubscribe.getContext();
            o.LJIIIZ(item, "item");
            if (containerView.getVisibility() == 0 && containerView.isShown()) {
                IMixFeedService LJJIJIIJIL = MixFeedService.LJJIJIIJIL();
                if (LJJIJIIJIL.LJIIZILJ(item.getAweme()) && item.getAweme().getPlaylist_info() != null && item.mEventType != null && !o.LJ(item.mEventType, "playlist")) {
                    PlayListInfo playlist_info = item.getAweme().getPlaylist_info();
                    String str2 = null;
                    if (playlist_info != null) {
                        str = playlist_info.getMixId();
                    } else {
                        str = null;
                    }
                    if (context != null) {
                        M89 LIZ = C2S6.LIZ(context);
                        String playlistSearchId = LIZ.getPlaylistSearchId();
                        Integer valueOf = Integer.valueOf(LIZ.isFromVideo());
                        String searchType = LIZ.getSearchType();
                        java.util.Map<String, String> searchExtraParams = item.getAweme().getSearchExtraParams();
                        if (searchExtraParams != null) {
                            str2 = searchExtraParams.get("search_result_id");
                        }
                        c229238z9 = new C229238z9(playlistSearchId, valueOf, searchType, 0, str2, null, 40, null);
                    } else {
                        c229238z9 = null;
                    }
                    LJJIJIIJIL.LJIIJJI(item.mEventType, str, item.getAweme().getGroupId(), item.getAweme().getAuthorUid(), c229238z9, Integer.valueOf(item.getAweme().getVideo().getDuration()));
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
