package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.discover.model.Banner;

/* renamed from: X.OGo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class ViewOnAttachStateChangeListenerC61626OGo implements View.OnAttachStateChangeListener, Runnable {
    public boolean LJLIL;
    public final /* synthetic */ C61627OGp LJLILLLLZI;

    public final void LIZ() {
        if (this.LJLILLLLZI.LJLJJL != null) {
            Rect rect = new Rect();
            View view = this.LJLILLLLZI.itemView;
            if (view != null && C16330kX.LIZIZ(view)) {
                while (view.getVisibility() == 0 && view.getAlpha() >= 1.0E-6f) {
                    if (view.getId() != 16908290) {
                        Object parent = view.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                    if (this.LJLILLLLZI.itemView.getGlobalVisibleRect(rect) && !rect.isEmpty() && this.LJLILLLLZI.itemView.isShown() && !this.LJLIL) {
                        C61627OGp c61627OGp = this.LJLILLLLZI;
                        Banner banner = c61627OGp.LJLJJL;
                        int i = c61627OGp.LJLJJLL;
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("enter_from", "change_music_page");
                        c188727au.LJIIIZ("banner_id", banner.getBid());
                        c188727au.LJIIIZ("client_order", Integer.toString(i));
                        int i2 = C61628OGq.LIZIZ[banner.getSchemaType().ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                c188727au.LJI("category_id", banner.getCategoryId());
                            }
                        } else {
                            c188727au.LJI("music_id", banner.getMusicId());
                        }
                        if (XVF.LIZJ()) {
                            c188727au.LJI("is_commercial", "1");
                        }
                        FMX.LJIIL("banner_show", c188727au.LIZ);
                        this.LJLILLLLZI.itemView.removeCallbacks(this);
                        this.LJLIL = true;
                    }
                }
            }
        }
        this.LJLILLLLZI.itemView.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ViewOnAttachStateChangeListenerC61626OGo(C61627OGp c61627OGp) {
        this.LJLILLLLZI = c61627OGp;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.LJLIL = false;
        this.LJLILLLLZI.itemView.removeCallbacks(this);
        run();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.LJLIL = false;
        this.LJLILLLLZI.itemView.removeCallbacks(this);
    }
}
