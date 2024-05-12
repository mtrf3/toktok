package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.8oz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222938oz extends C3DO {
    public final SparseArray<ConcurrentLinkedQueue<View>> LLI;

    @Override // X.AbstractC55082Lja, X.AbstractC48746JBe
    public final View LJJIIZ(int i, View view, ViewGroup parent) {
        View poll;
        o.LJIIIZ(parent, "parent");
        if (view == null) {
            ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.LLI.get(LJJIII(i));
            if (concurrentLinkedQueue != null && (poll = concurrentLinkedQueue.poll()) != null) {
                C221018lt.LIZ("PreCreateAdapter", "preloaded cache hit.");
                return super.LJJIIZ(i, poll, parent);
            }
        }
        return super.LJJIIZ(i, view, parent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C222938oz(Context context, LayoutInflater inflater, InterfaceC72642tA<C50420Jqa> listener, Fragment fragment, View.OnTouchListener tapTouchListener, BaseFeedPageParams baseFeedPageParams, InterfaceC2302191t iHandlePlay) {
        super(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        this.LLI = new SparseArray<>();
    }
}
