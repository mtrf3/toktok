package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.story.inbox.view.StoryOnThisDayInboxCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.M9p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56349M9p extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ StoryOnThisDayInboxCell LIZIZ;

    public C56349M9p(StoryOnThisDayInboxCell storyOnThisDayInboxCell) {
        this.LIZIZ = storyOnThisDayInboxCell;
    }

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        TuxIconView tuxIconView = this.LIZIZ.LJLILLLLZI;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(4);
        } else {
            o.LJIJI("loadSuccessCover");
            throw null;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        if (C48708J9s.LIZ() == 1) {
            if (C48709J9t.LIZ) {
                StoryOnThisDayInboxCell storyOnThisDayInboxCell = this.LIZIZ;
                TuxIconView tuxIconView = storyOnThisDayInboxCell.LJLILLLLZI;
                if (tuxIconView != null) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_replay_fill;
                    c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32));
                    c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32));
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    SY9 LIZJ = C025908h.LIZJ(storyOnThisDayInboxCell.itemView, "itemView.context", c2068389v);
                    C71899SJr c71899SJr = new C71899SJr();
                    c71899SJr.LIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(64));
                    c71899SJr.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(64));
                    c71899SJr.LIZLLL = Integer.valueOf(R.attr.d4);
                    c71899SJr.LJ = Float.valueOf(0.25f);
                    c71899SJr.LJFF = Float.valueOf(0.0f);
                    c71899SJr.LJI = EnumC71803SFz.RADIAL;
                    c71899SJr.LJII = EnumC71900SJs.EASE_IN_OUT;
                    Context context = storyOnThisDayInboxCell.itemView.getContext();
                    o.LJIIIIZZ(context, "itemView.context");
                    tuxIconView.setBackground(C26338AVi.LJIIJ(LIZJ, c71899SJr.LIZ(context)));
                } else {
                    o.LJIJI("loadSuccessCover");
                    throw null;
                }
            } else {
                StoryOnThisDayInboxCell storyOnThisDayInboxCell2 = this.LIZIZ;
                TuxIconView tuxIconView2 = storyOnThisDayInboxCell2.LJLILLLLZI;
                if (tuxIconView2 != null) {
                    C2068389v c2068389v2 = new C2068389v();
                    c2068389v2.LIZ = R.raw.icon_replay_fill;
                    c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(26));
                    c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(26));
                    c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                    SY9 LIZJ2 = C025908h.LIZJ(storyOnThisDayInboxCell2.itemView, "itemView.context", c2068389v2);
                    C71899SJr c71899SJr2 = new C71899SJr();
                    c71899SJr2.LIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(56));
                    c71899SJr2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(56));
                    c71899SJr2.LIZLLL = Integer.valueOf(R.attr.d4);
                    c71899SJr2.LJ = Float.valueOf(0.25f);
                    c71899SJr2.LJFF = Float.valueOf(0.0f);
                    c71899SJr2.LJI = EnumC71803SFz.RADIAL;
                    c71899SJr2.LJII = EnumC71900SJs.EASE_IN_OUT;
                    Context context2 = storyOnThisDayInboxCell2.itemView.getContext();
                    o.LJIIIIZZ(context2, "itemView.context");
                    tuxIconView2.setBackground(C26338AVi.LJIIJ(LIZJ2, c71899SJr2.LIZ(context2)));
                } else {
                    o.LJIJI("loadSuccessCover");
                    throw null;
                }
            }
        }
        TuxIconView tuxIconView3 = this.LIZIZ.LJLILLLLZI;
        if (tuxIconView3 != null) {
            tuxIconView3.setVisibility(0);
        } else {
            o.LJIJI("loadSuccessCover");
            throw null;
        }
    }
}
