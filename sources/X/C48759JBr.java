package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import com.zhiliaoapp.musically.R;

/* renamed from: X.JBr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48759JBr implements InterfaceC54260LRg {
    public final /* synthetic */ AutoScrollComponent LIZ;
    public final /* synthetic */ ActivityC45651qj LIZIZ;

    @Override // X.InterfaceC54260LRg
    public final void LIZ() {
    }

    @Override // X.InterfaceC54260LRg
    public final void LIZIZ() {
        TuxTextView tuxTextView;
        AutoScrollComponent autoScrollComponent = this.LIZ;
        if (autoScrollComponent.LJLLJ == EnumC223268pW.AUTO_SCROLL_STATE_STOP || (tuxTextView = autoScrollComponent.LJLJJLL) == null) {
            return;
        }
        tuxTextView.setText(this.LIZIZ.getResources().getString(R.string.by_));
    }

    public C48759JBr(AutoScrollComponent autoScrollComponent, ActivityC45651qj activityC45651qj) {
        this.LIZ = autoScrollComponent;
        this.LIZIZ = activityC45651qj;
    }
}
