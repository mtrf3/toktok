package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZF extends PagerAdapter {
    public final /* synthetic */ VerticalMusicView LJLILLLLZI;
    public final /* synthetic */ XZH LJLJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        if (C146615pB.LIZ()) {
            return 3;
        }
        return 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        int i2;
        int LIZ = C00F.LIZ(31744, 0, "show_recently_used_music_tab", true);
        if (LIZ == 1 || LIZ != 2) {
            i2 = R.string.puj;
        } else {
            i2 = R.string.puk;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return this.LJLJI.LIZLLL.getString(R.string.evj);
                }
                return this.LJLJI.LIZLLL.getString(i2);
            }
            return this.LJLJI.LIZLLL.getString(R.string.pdz);
        }
        return this.LJLJI.LIZLLL.getString(R.string.evj);
    }

    public XZF(VerticalMusicView verticalMusicView, XZH xzh) {
        this.LJLILLLLZI = verticalMusicView;
        this.LJLJI = xzh;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        FrameLayout frameLayout;
        o.LJIIIZ(container, "container");
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    frameLayout = new FrameLayout(container.getContext());
                } else {
                    frameLayout = this.LJLILLLLZI.LLIIII;
                    if (frameLayout != null) {
                        C78996UzQ.LJJJJL(frameLayout);
                    } else {
                        o.LJIJI("viewGroupRecent");
                        throw null;
                    }
                }
            } else {
                frameLayout = this.LJLILLLLZI.LLF;
                if (frameLayout != null) {
                    C78996UzQ.LJJJJL(frameLayout);
                } else {
                    o.LJIJI("viewGroupCollect");
                    throw null;
                }
            }
        } else {
            frameLayout = this.LJLILLLLZI.LJZI;
            if (frameLayout != null) {
                C78996UzQ.LJJJJL(frameLayout);
            } else {
                o.LJIJI("viewGroupAI");
                throw null;
            }
        }
        container.addView(frameLayout);
        return frameLayout;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return o.LJ(view, object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        View view;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        if (object instanceof View) {
            view = (View) object;
        } else {
            view = null;
        }
        C16880lQ.LJLLL(view, container);
    }
}
