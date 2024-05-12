package X;

import android.view.ViewTreeObserver;
import com.zhiliaoapp.musically.R;

/* renamed from: X.WfY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC82860WfY implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ViewOnTouchListenerC82857WfV LJLJI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f;
        this.LJLJI.LLIIIZ.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.LJLJI.LLIIJI.setBackgroundResource(R.color.wd);
        this.LJLJI.LLIIJI.setVisibility(0);
        this.LJLJI.LLIIIZ.setVisibility(0);
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJLJI;
        UIS uis = viewOnTouchListenerC82857WfV.LLIIIZ;
        float audioStartTranslationX = viewOnTouchListenerC82857WfV.getAudioStartTranslationX();
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV2 = this.LJLJI;
        int i = this.LJLIL;
        float f2 = i;
        float f3 = this.LJLILLLLZI;
        if (f2 >= f3) {
            f = f3 / viewOnTouchListenerC82857WfV2.LLIIII.LJ;
        } else {
            f = f2 / viewOnTouchListenerC82857WfV2.LLIIII.LJ;
        }
        uis.getViewTreeObserver().addOnGlobalLayoutListener(new UIT(uis, i, f, audioStartTranslationX));
    }

    public ViewTreeObserverOnGlobalLayoutListenerC82860WfY(ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV, int i, int i2) {
        this.LJLJI = viewOnTouchListenerC82857WfV;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
