package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8oQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222588oQ implements InterfaceC209388Jq {
    public final View LIZ;
    public final InterfaceC72642tA<C50420Jqa> LIZIZ;
    public final Fragment LIZJ;
    public final View.OnTouchListener LIZLLL;
    public final BaseFeedPageParams LJ;
    public final InterfaceC2302191t LJFF;
    public final C224238r5 LJI;
    public final View.OnTouchListener LJII;
    public final C92D LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final long LJIIJJI;
    public final InterfaceC55100Ljs LJIIL;
    public final String LJIILIIL;
    public final int LJIILJJIL;
    public final InterfaceC212878Xb<VideoBaseCell, VideoItemParams> LJIILL;
    public final java.util.Map<Integer, InterfaceC212878Xb<?, ?>> LJIILLIIL;
    public final InterfaceC88472Yns<String, View> LJIIZILJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C222588oQ(View view, InterfaceC72642tA<C50420Jqa> listener, Fragment fragment, View.OnTouchListener tapTouchListener, BaseFeedPageParams baseFeedPageParams, InterfaceC2302191t iHandlePlay, C224238r5 feedAllScreenHelper, View.OnTouchListener titleTouchListener, C92D onLongPressAwemeListener, String eventType, int i, long j, InterfaceC55100Ljs interfaceC55100Ljs, String str, int i2, InterfaceC212878Xb<VideoBaseCell, VideoItemParams> proxyer, java.util.Map<Integer, ? extends InterfaceC212878Xb<?, ?>> specialProxyersMap, InterfaceC88472Yns<? super String, ? extends View> interfaceC88472Yns) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        o.LJIIIZ(feedAllScreenHelper, "feedAllScreenHelper");
        o.LJIIIZ(titleTouchListener, "titleTouchListener");
        o.LJIIIZ(onLongPressAwemeListener, "onLongPressAwemeListener");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(proxyer, "proxyer");
        o.LJIIIZ(specialProxyersMap, "specialProxyersMap");
        this.LIZ = view;
        this.LIZIZ = listener;
        this.LIZJ = fragment;
        this.LIZLLL = tapTouchListener;
        this.LJ = baseFeedPageParams;
        this.LJFF = iHandlePlay;
        this.LJI = feedAllScreenHelper;
        this.LJII = titleTouchListener;
        this.LJIIIIZZ = onLongPressAwemeListener;
        this.LJIIIZ = eventType;
        this.LJIIJ = i;
        this.LJIIJJI = j;
        this.LJIIL = interfaceC55100Ljs;
        this.LJIILIIL = str;
        this.LJIILJJIL = i2;
        this.LJIILL = proxyer;
        this.LJIILLIIL = specialProxyersMap;
        this.LJIIZILJ = interfaceC88472Yns;
    }
}
