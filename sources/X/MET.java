package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class MET implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C81156VtA LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ ShootButtonBottomComponent LJLJI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        this.LJLIL.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.LJLIL.getMeasuredWidth() < this.LJLIL.getPaint().measureText(this.LJLILLLLZI)) {
            ShootButtonBottomComponent shootButtonBottomComponent = this.LJLJI;
            if (!shootButtonBottomComponent.LJLIL && (view = shootButtonBottomComponent.LJLJJL) != null) {
                shootButtonBottomComponent.getClass();
                View findViewById = view.findViewById(R.id.d7n);
                View findViewById2 = view.findViewById(R.id.d8g);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                if (C90193gN.LIZIZ(shootButtonBottomComponent.getContext()) && findViewById2 != null && findViewById != null) {
                    if (shootButtonBottomComponent.LJLILLLLZI == null) {
                        shootButtonBottomComponent.LJLILLLLZI = findViewById.getBackground();
                    }
                    if (shootButtonBottomComponent.LJLJI == null) {
                        shootButtonBottomComponent.LJLJI = findViewById2.getBackground();
                    }
                    findViewById.setBackground(shootButtonBottomComponent.LJLJI);
                    findViewById2.setBackground(shootButtonBottomComponent.LJLILLLLZI);
                }
            }
            this.LJLIL.LIZIZ();
        }
    }

    public MET(C81156VtA c81156VtA, String str, ShootButtonBottomComponent shootButtonBottomComponent) {
        this.LJLIL = c81156VtA;
        this.LJLILLLLZI = str;
        this.LJLJI = shootButtonBottomComponent;
    }
}
