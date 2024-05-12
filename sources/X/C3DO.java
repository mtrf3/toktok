package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import kotlin.jvm.internal.o;

/* renamed from: X.3DO, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3DO extends AbstractC55082Lja {
    @Override // X.AbstractC55082Lja
    public final String LJJIJLIJ() {
        return "detail_feed";
    }

    @Override // X.AbstractC55082Lja
    public final C55136LkS LJJJ() {
        return new C55136LkS(C3DP.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3DO(Context context, LayoutInflater inflater, InterfaceC72642tA<C50420Jqa> listener, Fragment fragment, View.OnTouchListener tapTouchListener, BaseFeedPageParams baseFeedPageParams, InterfaceC2302191t iHandlePlay) {
        super(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
    }
}
