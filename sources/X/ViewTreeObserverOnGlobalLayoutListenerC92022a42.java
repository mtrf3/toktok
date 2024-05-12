package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberAssem;
import com.zhiliaoapp.musically.R;

/* renamed from: X.a42, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC92022a42 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ PhoneNumberAssem LJLIL;

    public ViewTreeObserverOnGlobalLayoutListenerC92022a42(PhoneNumberAssem phoneNumberAssem) {
        this.LJLIL = phoneNumberAssem;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Window window;
        View decorView;
        Rect rect = new Rect();
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ(this.LJLIL);
        if (LJIIIIZZ != null && (window = LJIIIIZZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        int height = rect.height();
        if (height - this.LJLIL.LJLJI < 0) {
            C018905p c018905p = new C018905p(-1, -2);
            c018905p.topToBottom = R.id.fn;
            c018905p.setMargins(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)), ((this.LJLIL._$_findCachedViewById(R.id.fl).getTop() - this.LJLIL._$_findCachedViewById(R.id.fn).getBottom()) - this.LJLIL._$_findCachedViewById(R.id.fa).getHeight()) / 2, O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)), 0);
            this.LJLIL._$_findCachedViewById(R.id.fa).setLayoutParams(c018905p);
        }
        this.LJLIL.LJLJI = height;
    }
}
