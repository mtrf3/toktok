package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.MCe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC56416MCe implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C81156VtA LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ ShootFeedPanel LJLJI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        this.LJLIL.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int measuredWidth = this.LJLIL.getMeasuredWidth();
        if (this.LJLILLLLZI != null && measuredWidth < this.LJLIL.getPaint().measureText(this.LJLILLLLZI)) {
            ShootFeedPanel shootFeedPanel = this.LJLJI;
            if (!shootFeedPanel.LLJJJJJIL && (view = shootFeedPanel.LLJJJIL) != null) {
                shootFeedPanel.getClass();
                View findViewById = view.findViewById(R.id.d7n);
                View findViewById2 = view.findViewById(R.id.d8g);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                if (C90193gN.LIZIZ(shootFeedPanel.getContext()) && findViewById2 != null && findViewById != null) {
                    if (shootFeedPanel.LLJJJJLIIL == null) {
                        shootFeedPanel.LLJJJJLIIL = findViewById.getBackground();
                    }
                    if (shootFeedPanel.LLJJL == null) {
                        shootFeedPanel.LLJJL = findViewById2.getBackground();
                    }
                    findViewById.setBackground(shootFeedPanel.LLJJL);
                    findViewById2.setBackground(shootFeedPanel.LLJJJJLIIL);
                }
            }
            this.LJLIL.LIZIZ();
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC56416MCe(ShootFeedPanel shootFeedPanel, C81156VtA c81156VtA, String str) {
        this.LJLJI = shootFeedPanel;
        this.LJLIL = c81156VtA;
        this.LJLILLLLZI = str;
    }
}
