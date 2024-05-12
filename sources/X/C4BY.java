package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.comment.multipanel.InputViewDelegate;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4BY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4BY extends PagerAdapter {
    public final InterfaceC105344Bm LJLILLLLZI;
    public final VWD LJLJI;
    public final C105244Bc LJLJJI;
    public final LifecycleOwner LJLJJL;
    public final int LJLJJLL;
    public final InputViewDelegate LJLJL;
    public final HashMap<Integer, C3UO> LJLJLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object object) {
        o.LJIIIZ(object, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return view == object;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJI.LJLJJLL.LIZJ();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        View LLIIZ;
        o.LJIIIZ(container, "container");
        C4BX c4bx = this.LJLJJI.LJLJJLL;
        InterfaceC105334Bl interfaceC105334Bl = (InterfaceC105334Bl) ORZ.LJLLLLLL(i, c4bx.LJI);
        if (interfaceC105334Bl != null) {
            if (interfaceC105334Bl.LJ() == 6) {
                LLIIZ = new C4DW(c4bx.LJFF, this.LJLJJL).LLIIZ(container);
                if (container.indexOfChild(LLIIZ) < 0) {
                    container.addView(LLIIZ);
                }
            } else if (interfaceC105334Bl.LIZLLL() && !c4bx.LIZIZ(i).LJIIJJI().isEmpty()) {
                C3UR c3ur = new C3UR() { // from class: X.4Bj
                    @Override // X.C3UR
                    public final void LIZJ(C32V c32v, boolean z) {
                    }

                    @Override // X.C3UR
                    public final void LJ(Context context) {
                    }

                    @Override // X.C3UR
                    public final void LIZIZ() {
                        C4BY.this.LJLILLLLZI.LLLLLZIL();
                    }

                    @Override // X.C3UR
                    public final void LIZLLL(String emojiText) {
                        o.LJIIIZ(emojiText, "emojiText");
                        C4BY.this.LJLJL.Cf(emojiText);
                    }

                    @Override // X.C3UR
                    public final void j2(CommentPersonalizedEmoji emoji) {
                        o.LJIIIZ(emoji, "emoji");
                        C4BY.this.LJLJL.j2(emoji);
                    }

                    @Override // X.C3UR
                    public final void LIZ(View view, C105454Bx emoji) {
                        o.LJIIIZ(view, "view");
                        o.LJIIIZ(emoji, "emoji");
                        C4BY.this.LJLJL.LLLZLZ(emoji);
                    }
                };
                C3UO c3uo = this.LJLJLJ.get(Integer.valueOf(i));
                if (c3uo != null) {
                    LLIIZ = c3uo.LIZJ();
                } else {
                    Context context = container.getContext();
                    o.LJIIIIZZ(context, "container.context");
                    ComponentCallbacks2 LJIJJ = C45804HyK.LJIJJ(context);
                    o.LJII(LJIJJ, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                    C3UO c3uo2 = new C3UO((LifecycleOwner) LJIJJ, container, this.LJLJI, interfaceC105334Bl, new C105534Cf(C7MY.LIZIZ(32), C7MY.LIZIZ(28), 16, AnonymousClass391.LIZJ(32), true, false), this.LJLJJLL, c3ur, null);
                    LLIIZ = c3uo2.LJI(true);
                    c3uo2.LJIIIIZZ(c4bx.LIZIZ(i).LJIIJJI());
                    this.LJLJLJ.put(Integer.valueOf(i), c3uo2);
                }
                if (container.indexOfChild(LLIIZ) < 0) {
                    container.addView(LLIIZ);
                }
            }
            return LLIIZ;
        }
        LLIIZ = new C105324Bk().LLIIZ(container);
        o.LJIIIIZZ(LLIIZ, "extEmojiView.getExtEmojiView(container)");
        if (container.indexOfChild(LLIIZ) < 0) {
            container.addView(LLIIZ);
        }
        return LLIIZ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        C16880lQ.LJLLL((View) object, container);
    }

    public C4BY(InterfaceC105344Bm mInputView, VWD vwd, C105244Bc mEmojiTypeView, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(mInputView, "mInputView");
        o.LJIIIZ(mEmojiTypeView, "mEmojiTypeView");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLILLLLZI = mInputView;
        this.LJLJI = vwd;
        this.LJLJJI = mEmojiTypeView;
        this.LJLJJL = lifecycleOwner;
        this.LJLJJLL = R.attr.cl;
        vwd.getContext();
        this.LJLJL = new InputViewDelegate(mInputView);
        this.LJLJLJ = new LinkedHashMap();
    }
}
