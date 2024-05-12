package X;

import Y.AUListenerS101S0100000_14;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewConfiguration;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WdZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82737WdZ extends C82733WdV {
    public static final /* synthetic */ int LLFF = 0;
    public int LL;
    public final ValueAnimator LLD;
    public final View LLF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82737WdZ(C145255mz musicPanelViewHolderParam, View view, InterfaceC82738Wda callBackListener) {
        super(musicPanelViewHolderParam, view, callBackListener, false, false);
        o.LJIIIZ(musicPanelViewHolderParam, "musicPanelViewHolderParam");
        o.LJIIIZ(callBackListener, "callBackListener");
        this.LL = -1;
        ValueAnimator ofArgb = ValueAnimator.ofArgb(0, C78609UtB.LJJJ(R.attr.d2, view.getContext()));
        ofArgb.setDuration(ViewConfiguration.getLongPressTimeout());
        ofArgb.addUpdateListener(new AUListenerS101S0100000_14(view, 39));
        this.LLD = ofArgb;
        new C16230kN(view.getContext(), new C82736WdY(this, callBackListener, view));
        View findViewById = view.findViewById(R.id.eva);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.item_tooltip_anchor)");
        this.LLF = findViewById;
    }
}
