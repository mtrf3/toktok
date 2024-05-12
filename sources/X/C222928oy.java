package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.8oy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222928oy extends AbstractC55082Lja {
    public final SparseArray<ConcurrentLinkedQueue<View>> LLI;

    @Override // X.AbstractC55082Lja
    public final String LJJIJLIJ() {
        return "story_feed";
    }

    @Override // X.AbstractC55082Lja
    public final C55136LkS LJJJ() {
        return new C55136LkS(C222468oE.LJLIL);
    }

    public final void LJJJJL(ViewGroup parent) {
        VideoBaseCell videoBaseCell;
        o.LJIIIZ(parent, "parent");
        ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.LLI.get(18);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
            this.LLI.put(18, concurrentLinkedQueue);
        }
        View LJJIJIL = LJJIJIL(18, 0, 0, parent);
        if (C222978p3.LIZ().preCreateCellAssemEnabled) {
            C2MA LJJJI = AbstractC55082Lja.LJJJI(LJJIJIL);
            if ((LJJJI instanceof VideoViewCell) && (videoBaseCell = (VideoBaseCell) LJJJI) != null) {
                C221018lt.LIZ("StoryFeedListAdapter", "pre create assems");
                VideoItemParams videoItemParams = new VideoItemParams();
                Aweme aweme = new Aweme();
                aweme.setAid("FAKE_STORY");
                videoItemParams.setAweme(aweme);
                videoItemParams.setEventType(this.LJLL.eventType);
                videoBaseCell.LJLJLLL(0, videoItemParams);
            }
        }
        concurrentLinkedQueue.offer(LJJIJIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preloaded inner cell of type: ");
        LIZ.append(18);
        C221018lt.LIZ("StoryFeedListAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC55082Lja, X.AbstractC48746JBe
    public final View LJJIIZ(int i, View view, ViewGroup parent) {
        View poll;
        o.LJIIIZ(parent, "parent");
        if (view == null) {
            ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.LLI.get(LJJIII(i));
            if (concurrentLinkedQueue != null && (poll = concurrentLinkedQueue.poll()) != null) {
                C221018lt.LIZ("StoryFeedListAdapter", "preloaded cache hit.");
                return super.LJJIIZ(i, poll, parent);
            }
        }
        return super.LJJIIZ(i, view, parent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C222928oy(Context context, LayoutInflater layoutInflater, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, Fragment fragment, View.OnTouchListener tapTouchListener, BaseFeedPageParams baseFeedPageParams, InterfaceC2302191t iHandlePlay) {
        super(context, layoutInflater, interfaceC72642tA, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        this.LLI = new SparseArray<>();
    }
}
