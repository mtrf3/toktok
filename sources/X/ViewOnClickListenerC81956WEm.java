package X;

import android.view.View;

/* renamed from: X.WEm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC81956WEm implements View.OnClickListener {
    public final /* synthetic */ WET LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C81947WEd LJLJI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WET wet = this.LJLIL;
        if (wet.LLFF != 0.0f || wet.LLFFF != 1.0f || wet.getTranslationX() != 0.0f || wet.getTranslationY() != 0.0f) {
            WET wet2 = this.LJLIL;
            wet2.LJLJL.reset();
            wet2.LJFF();
            wet2.LLFFF = 1.0f;
            wet2.LLFII = 0;
            wet2.LLFZ = 0;
            return;
        }
        this.LJLJI.LIZIZ(this.LJLILLLLZI);
    }

    public ViewOnClickListenerC81956WEm(C81947WEd c81947WEd, WET wet, int i) {
        this.LJLJI = c81947WEd;
        this.LJLIL = wet;
        this.LJLILLLLZI = i;
    }
}
