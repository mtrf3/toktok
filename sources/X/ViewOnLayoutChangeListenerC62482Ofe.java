package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;

/* renamed from: X.Ofe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnLayoutChangeListenerC62482Ofe implements View.OnLayoutChangeListener {
    public final /* synthetic */ FrameLayout LJLIL;
    public final /* synthetic */ SkeletonSharePanelFragment LJLILLLLZI;

    public ViewOnLayoutChangeListenerC62482Ofe(FrameLayout frameLayout, SkeletonSharePanelFragment skeletonSharePanelFragment) {
        this.LJLIL = frameLayout;
        this.LJLILLLLZI = skeletonSharePanelFragment;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String str;
        String valueOf;
        Context context = this.LJLIL.getContext();
        String str2 = "error ";
        if (context == null || (str = String.valueOf(C32151Nz.LJJIJIIJI(context, i3 - i))) == null) {
            str = "error ";
        }
        Context context2 = this.LJLIL.getContext();
        if (context2 != null && (valueOf = String.valueOf(C32151Nz.LJJIJIIJI(context2, i4 - i2))) != null) {
            str2 = valueOf;
        }
        TuxTextView tuxTextView = this.LJLILLLLZI.LJLJI;
        if (tuxTextView != null) {
            tuxTextView.setText(UPJ.LIZIZ("w=", str, "dp\nh=", str2, "dp"));
        }
    }
}
