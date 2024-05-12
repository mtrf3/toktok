package X;

import Y.ACListenerS27S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedInitParam;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Ht0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45474Ht0 extends FrameLayout {
    public final Keva LJLIL;
    public boolean LJLILLLLZI;
    public VideoImageMixedInitParam LJLJI;
    public View LJLJJI;
    public RecyclerView LJLJJL;
    public TextView LJLJJLL;
    public TuxIconView LJLJL;
    public SY4 LJLJLJ;
    public TextView LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public C71897SJp LJLLJ;
    public C45765Hxh LJLLL;
    public C58C LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public View LJZ;
    public final ARunnableS43S0100000_7 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public volatile boolean LLD;

    private final ObjectAnimator getMultiSelectHideAnim() {
        Object value = this.LL.getValue();
        o.LJIIIIZZ(value, "<get-multiSelectHideAnim>(...)");
        return (ObjectAnimator) value;
    }

    private final ObjectAnimator getMultiSelectShowAnim() {
        Object value = this.LJZL.getValue();
        o.LJIIIIZZ(value, "<get-multiSelectShowAnim>(...)");
        return (ObjectAnimator) value;
    }

    public final boolean LIZIZ() {
        C71897SJp c71897SJp = this.LJLLJ;
        if (c71897SJp != null && c71897SJp.isChecked()) {
            return true;
        }
        VideoImageMixedInitParam videoImageMixedInitParam = this.LJLJI;
        if (videoImageMixedInitParam != null && videoImageMixedInitParam.isAIGCPath()) {
            return true;
        }
        return false;
    }

    public final void LIZLLL() {
        if (this.LLD) {
            return;
        }
        this.LLD = true;
        C71897SJp c71897SJp = this.LJLLJ;
        if (c71897SJp != null) {
            c71897SJp.setChecked(true ^ C43327GzT.LIZ());
        }
        if (C43326GzS.LIZ() && !this.LJLLLLLL && !this.LJLZ) {
            TextView textView = this.LJLJLLL;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = this.LJLL;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.LJLLILLLL;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.LJLLI;
            if (view3 != null) {
                C16880lQ.LJIIJ(new C45522Htm(this), view3);
                return;
            }
            return;
        }
        TextView textView2 = this.LJLJLLL;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        View view4 = this.LJLL;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        View view5 = this.LJLLILLLL;
        if (view5 == null) {
            return;
        }
        view5.setVisibility(8);
    }

    public final void LJI() {
        C58C c58c = this.LJLLLL;
        if (c58c != null) {
            c58c.LIZ();
        }
        View view = this.LJLL;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public final RecyclerView getMediaSelectRecyclerView() {
        RecyclerView recyclerView = this.LJLJJL;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("mediaSelectRecyclerView");
        throw null;
    }

    public final C45765Hxh getAutoCutBtn() {
        return this.LJLLL;
    }

    public final C58C getEditorProBtn() {
        return this.LJLLLL;
    }

    public final C71897SJp getMultiSelectCheckBox() {
        return this.LJLLJ;
    }

    public final TuxIconView getNewStyleSureTextView() {
        return this.LJLJL;
    }

    public final TextView getSureTextView() {
        return this.LJLJJLL;
    }

    public final void LIZ(int i) {
        View view;
        if (i < 0) {
            return;
        }
        RecyclerView recyclerView = this.LJLJJL;
        if (recyclerView != null) {
            RecyclerView.ViewHolder LJJIZ = recyclerView.LJJIZ(i);
            if (LJJIZ != null) {
                view = LJJIZ.itemView;
            } else {
                view = null;
            }
            int i2 = 0;
            if (view == null) {
                RecyclerView recyclerView2 = this.LJLJJL;
                if (recyclerView2 != null) {
                    int i3 = i - 1;
                    if (i3 > 0) {
                        i2 = i3;
                    }
                    recyclerView2.LJLI(i2);
                    return;
                }
                o.LJIJI("mediaSelectRecyclerView");
                throw null;
            }
            RecyclerView recyclerView3 = this.LJLJJL;
            if (recyclerView3 != null) {
                int i4 = i - 1;
                if (i4 > 0) {
                    i2 = i4;
                }
                recyclerView3.LJLIL(i2);
                return;
            }
            o.LJIJI("mediaSelectRecyclerView");
            throw null;
        }
        o.LJIJI("mediaSelectRecyclerView");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedInitParam r8) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45474Ht0.LIZJ(com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedInitParam):void");
    }

    public final void LJII(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoImageMixedView showOrHideMediaRecyclerView ");
        LIZ.append(z);
        H78.LJI(X1D.LIZIZ(LIZ));
        if (z && LIZIZ()) {
            RecyclerView recyclerView = this.LJLJJL;
            if (recyclerView != null) {
                recyclerView.postDelayed(new ARunnableS43S0100000_7(this, 40), 250L);
                return;
            } else {
                o.LJIJI("mediaSelectRecyclerView");
                throw null;
            }
        }
        RecyclerView recyclerView2 = this.LJLJJL;
        if (recyclerView2 != null) {
            recyclerView2.post(new ARunnableS43S0100000_7(this, 41));
        } else {
            o.LJIJI("mediaSelectRecyclerView");
            throw null;
        }
    }

    public final void LJIIIIZZ(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (z) {
            TuxIconView tuxIconView = this.LJLJL;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
            }
            C45765Hxh c45765Hxh = this.LJLLL;
            if (c45765Hxh != null) {
                layoutParams2 = c45765Hxh.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2;
            } else {
                marginLayoutParams3 = null;
            }
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                C45765Hxh c45765Hxh2 = this.LJLLL;
                if (c45765Hxh2 != null) {
                    c45765Hxh2.setLayoutParams(marginLayoutParams3);
                }
            }
            C58C c58c = this.LJLLLL;
            if (c58c != null) {
                layoutParams3 = c58c.getLayoutParams();
            }
            if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams4.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                C58C c58c2 = this.LJLLLL;
                if (c58c2 == null) {
                    return;
                }
                c58c2.setLayoutParams(marginLayoutParams4);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LJLJL;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(8);
        }
        C45765Hxh c45765Hxh3 = this.LJLLL;
        if (c45765Hxh3 != null) {
            layoutParams = c45765Hxh3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams2.setMarginEnd(0);
            C45765Hxh c45765Hxh4 = this.LJLLL;
            if (c45765Hxh4 != null) {
                c45765Hxh4.setLayoutParams(marginLayoutParams2);
            }
        }
        C58C c58c3 = this.LJLLLL;
        if (c58c3 != null) {
            layoutParams3 = c58c3.getLayoutParams();
        }
        if (!(layoutParams3 instanceof LinearLayout.LayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) == null) {
            return;
        }
        marginLayoutParams.setMarginStart(0);
        C58C c58c4 = this.LJLLLL;
        if (c58c4 == null) {
            return;
        }
        c58c4.setLayoutParams(marginLayoutParams);
    }

    public final void LJIIIZ(boolean z) {
        if (z) {
            TextView textView = this.LJLJJLL;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        TextView textView2 = this.LJLJJLL;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    public final void setMultiSelectCheckBox(boolean z) {
        C71897SJp c71897SJp = this.LJLLJ;
        if (c71897SJp == null) {
            return;
        }
        c71897SJp.setChecked(z);
    }

    public final void setSureOnClickListener(View.OnClickListener listener) {
        o.LJIIIZ(listener, "listener");
        SY4 sy4 = this.LJLJLJ;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS27S0100000_7(listener, 48));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45474Ht0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        a1.LJFF(context, "context");
        this.LJLIL = Keva.getRepo("repo_mixed_sound_sync_tip");
        this.LJZI = new ARunnableS43S0100000_7(this, 42);
        this.LJZL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 259));
        this.LL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 258));
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bob, C16880lQ.LLZIL(context), this);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…_mixed_bottom_view, this)");
        this.LJLJJI = LLLZIIL;
        Integer LJI = C79045V0n.LJI(R.attr.cl, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = -1;
        }
        LLLZIIL.setBackgroundColor(i);
        setOutlineProvider(new C45523Htn());
        setClipToOutline(true);
        setElevation(C170576mj.LIZ(context, 16.0f));
    }

    public final void LJ(String str, boolean z) {
        TextView textView;
        if (TextUtils.isEmpty(str)) {
            if (!z || (textView = this.LJLJLLL) == null) {
                return;
            }
            textView.setText("");
            return;
        }
        TextView textView2 = this.LJLJLLL;
        if (textView2 == null) {
            return;
        }
        textView2.setText(str);
    }

    public final void LJFF(boolean z, boolean z2) {
        int i;
        int i2 = 8;
        if (!z2) {
            C45765Hxh c45765Hxh = this.LJLLL;
            if (c45765Hxh != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                c45765Hxh.setVisibility(i);
            }
            C45765Hxh c45765Hxh2 = this.LJLLL;
            if (c45765Hxh2 != null) {
                c45765Hxh2.setAlpha(1.0f);
            }
            View view = this.LJLL;
            if (view == null) {
                return;
            }
            if (!z) {
                i2 = 0;
            }
            view.setVisibility(i2);
            return;
        }
        if (z) {
            C45765Hxh c45765Hxh3 = this.LJLLL;
            if (c45765Hxh3 != null) {
                c45765Hxh3.LJFF();
            }
        } else {
            C45765Hxh c45765Hxh4 = this.LJLLL;
            if (c45765Hxh4 != null) {
                c45765Hxh4.LIZLLL();
            }
        }
        if (!z) {
            if (getMultiSelectShowAnim().isRunning()) {
                return;
            }
            if (getMultiSelectHideAnim().isRunning()) {
                getMultiSelectHideAnim().cancel();
            } else {
                View view2 = this.LJLL;
                if (view2 != null && view2.getVisibility() == 0) {
                    return;
                }
            }
            View view3 = this.LJLL;
            if (view3 != null) {
                view3.setAlpha(0.0f);
            }
            View view4 = this.LJLL;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            getMultiSelectShowAnim().start();
            return;
        }
        if (getMultiSelectHideAnim().isRunning()) {
            return;
        }
        if (getMultiSelectShowAnim().isRunning()) {
            getMultiSelectShowAnim().cancel();
        } else {
            View view5 = this.LJLL;
            if (view5 != null && view5.getVisibility() == 8) {
                return;
            }
        }
        getMultiSelectHideAnim().start();
    }
}
