package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R5H extends AbstractC113514ct {
    public final /* synthetic */ Context LJIIIIZZ;
    public final /* synthetic */ LoginMethodListFragment LJIIIZ;

    @Override // X.C0B4
    public final void LJIILL(RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
        AbstractC029409q adapter = ((RecyclerView) this.LJIIIZ._$_findCachedViewById(R.id.gif)).getAdapter();
        o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.rememberaccount.RememberAccountAdapter");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        Context it = this.LJIIIIZZ;
        o.LJIIIIZZ(it, "it");
        ((C85531XhX) adapter).LJZ(absoluteAdapterPosition, it, R.string.j_r, R.string.j_o, R.string.j_q, R.string.j_p, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5H(final Context context, LoginMethodListFragment loginMethodListFragment) {
        new C0B4(context) { // from class: X.4ct
            public final Context LIZLLL;
            public final ColorDrawable LJ = new ColorDrawable();
            public final Integer LJFF;
            public final int LJI;
            public final C2068389v LJII;

            @Override // X.C0B4
            public final float LJFF(RecyclerView.ViewHolder viewHolder) {
                return 0.4f;
            }

            @Override // X.C0B4
            public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                o.LJIIIZ(recyclerView, "recyclerView");
                o.LJIIIZ(viewHolder, "viewHolder");
                return false;
            }

            {
                this.LIZLLL = context;
                this.LJFF = C79045V0n.LJI(R.attr.e7, context);
                Integer LJI = C79045V0n.LJI(R.attr.dj, context);
                this.LJI = 20;
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_trash_bin_fill;
                c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(30));
                c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(30));
                c2068389v.LIZLLL = LJI;
                this.LJII = c2068389v;
            }

            @Override // X.C0B4
            public final int LJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                Integer num;
                o.LJIIIZ(recyclerView, "recyclerView");
                o.LJIIIZ(viewHolder, "viewHolder");
                AbstractC029409q adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    num = Integer.valueOf(adapter.getItemCount());
                } else {
                    num = null;
                }
                if (num != null && viewHolder.getAbsoluteAdapterPosition() > 0 && viewHolder.getAbsoluteAdapterPosition() < num.intValue() - 1) {
                    return C0B4.LJIIIZ(0, 4);
                }
                return C0B4.LJIIIZ(0, 0);
            }

            @Override // X.C0B4
            public final void LJIIJ(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
                o.LJIIIZ(c, "c");
                o.LJIIIZ(recyclerView, "recyclerView");
                o.LJIIIZ(viewHolder, "viewHolder");
                View view = viewHolder.itemView;
                o.LJIIIIZZ(view, "viewHolder.itemView");
                view.getWidth();
                int height = (view.getHeight() - this.LJII.LIZJ) / 2;
                int LIZIZ = C7MY.LIZIZ(this.LJI);
                int top = view.getTop() + height;
                int right = view.getRight() - LIZIZ;
                C2068389v c2068389v = this.LJII;
                int i2 = right - c2068389v.LIZIZ;
                int i3 = c2068389v.LIZJ + top;
                Integer num = this.LJFF;
                if (num != null) {
                    this.LJ.setColor(num.intValue());
                }
                this.LJ.setBounds(view.getRight() + ((int) f), view.getTop(), view.getRight(), view.getBottom());
                this.LJ.draw(c);
                SY9 LIZ = this.LJII.LIZ(this.LIZLLL);
                LIZ.setBounds(i2, top, right, i3);
                LIZ.draw(c);
                super.LJIIJ(c, recyclerView, viewHolder, f, f2, i, z);
            }
        };
        this.LJIIIIZZ = context;
        this.LJIIIZ = loginMethodListFragment;
    }
}
