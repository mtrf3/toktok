package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XhE, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnFocusChangeListenerC85512XhE implements View.OnFocusChangeListener {
    public final /* synthetic */ C85511XhD LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C85513XhF LJLJI;

    public ViewOnFocusChangeListenerC85512XhE(int i, C85513XhF c85513XhF, C85511XhD c85511XhD) {
        this.LJLIL = c85511XhD;
        this.LJLILLLLZI = i;
        this.LJLJI = c85513XhF;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.LJLIL.LJLILLLLZI.LJJIJIL(this.LJLILLLLZI);
            C85511XhD c85511XhD = this.LJLIL;
            c85511XhD.LJLJJL = view;
            c85511XhD.LJLJJLL = this.LJLILLLLZI;
            this.LJLJI.LJLJJL.setVisibility(0);
            this.LJLJI.LJLJI.setBackgroundColor(EF7.LIZIZ().getResources().getColor(R.color.b2));
            return;
        }
        this.LJLJI.LJLJJL.setVisibility(8);
        this.LJLJI.LJLJJI.setVisibility(8);
        this.LJLJI.LJLJJI.pauseAnimation();
        this.LJLJI.LJLJI.setBackgroundColor(EF7.LIZIZ().getResources().getColor(R.color.yi));
    }
}
