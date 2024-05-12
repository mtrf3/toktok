package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.83o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2052083o extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDescAssem, Y1Y, C76800UCe> {
    public static final C2052083o LJLIL = new C2052083o();

    public C2052083o() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDescAssem videoDescAssem, Y1Y y1y) {
        Integer num;
        int i;
        VideoDescAssem selectSubscribe = videoDescAssem;
        Y1Y state = y1y;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        boolean z = !o.LJ(state, Y1X.LIZIZ);
        if (selectSubscribe.LLIIJLIL == null) {
            ViewGroup.LayoutParams layoutParams = selectSubscribe.getContainerView().getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.bottomMargin;
            } else {
                i = 0;
            }
            selectSubscribe.LLIIJLIL = Integer.valueOf(i);
        }
        if (C52951KqJ.LIZ() && (num = selectSubscribe.LLIIJLIL) != null) {
            int intValue = num.intValue();
            if (z) {
                C26338AVi.LJI(selectSubscribe.getContainerView(), null, null, null, Integer.valueOf(intValue - O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), false, 23);
            } else {
                C26338AVi.LJI(selectSubscribe.getContainerView(), null, null, null, Integer.valueOf(intValue), false, 23);
            }
        }
        selectSubscribe.r4().LLIIII = state;
        if (selectSubscribe.LLIL != null) {
            return C76800UCe.LIZ;
        }
        o.LJIJI("videoDescDelegate");
        throw null;
    }
}
