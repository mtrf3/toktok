package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Mis, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57586Mis extends C8HS<RecUser> {
    public final RecSwipeViewModel LJLIL;
    public final C73318Sq2 LJLILLLLZI;
    public int LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public final C57588Miu LJLLLLLL() {
        return (C57588Miu) this.LJLJJI.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57586Mis(RecSwipeViewModel vm) {
        super(false, 1, null);
        o.LJIIIZ(vm, "vm");
        this.LJLIL = vm;
        this.LJLILLLLZI = new C73318Sq2();
        this.LJLJI = C7MY.LIZIZ(320);
        this.LJLJJI = C221108m2.LIZIZ(C57589Miv.LJLIL);
        this.LJLJJL = C221108m2.LIZIZ(C57587Mit.LJLIL);
        this.LJLJJLL = C221108m2.LIZIZ(C57590Miw.LJLIL);
    }

    public static void LJLZ(View view) {
        int i;
        if (C57626MjW.LIZIZ()) {
            C221018lt.LIZ("RecSwipeCardListAdapter", "set bg for card cell");
            if (C99W.LIZ) {
                i = R.drawable.a5t;
            } else {
                i = R.drawable.a5s;
            }
        } else if (C99W.LIZ) {
            i = R.drawable.a5r;
        } else {
            i = R.drawable.a5q;
        }
        view.setBackgroundResource(i);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.LJLILLLLZI.LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0448  */
    @Override // X.C4II
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r27, int r28) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57586Mis.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ConstraintLayout constraintLayout;
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.cpn, viewGroup, false);
        View findViewById = viewGroup.findViewById(R.id.kwo);
        o.LJIIIIZZ(findViewById, "parent.findViewById(R.id.swipe_rec_user_list)");
        ViewGroup.LayoutParams layoutParams = LIZIZ.getLayoutParams();
        if (((Boolean) this.LJLJJL.getValue()).booleanValue()) {
            C57591Mix c57591Mix = (C57591Mix) this.LJLJJLL.getValue();
            Context context = LIZIZ.getContext();
            o.LJIIIIZZ(context, "view.context");
            layoutParams.width = c57591Mix.LIZ(context);
        } else {
            int measuredWidth = findViewById.getMeasuredWidth() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(80));
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(320));
            if (measuredWidth > LJJIIZ) {
                measuredWidth = LJJIIZ;
            }
            layoutParams.width = measuredWidth;
        }
        LIZIZ.setLayoutParams(layoutParams);
        int LJJIIZ2 = ((layoutParams.width - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)) * 2)) - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)) * 2)) / 3;
        C57381MfZ c57381MfZ = (C57381MfZ) LIZIZ.findViewById(R.id.kwl);
        C57381MfZ c57381MfZ2 = (C57381MfZ) LIZIZ.findViewById(R.id.kwl);
        o.LJIIIIZZ(c57381MfZ2, "view.swipe_big_card_cover_group");
        c57381MfZ.LJI(LJJIIZ2, (LJJIIZ2 * 4) / 3, c57381MfZ2);
        int LJJIIZ3 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(320));
        Context context2 = LIZIZ.getContext();
        o.LJIIIIZZ(context2, "view.context");
        ConstraintLayout constraintLayout2 = null;
        int LJJIIZ4 = C53946LFe.LIZJ(C45804HyK.LJIJJ(context2), null).LIZIZ - O6R.LJJIIZ(C32151Nz.LJIIZILJ(80));
        if (LJJIIZ3 > LJJIIZ4) {
            LJJIIZ3 = LJJIIZ4;
        }
        this.LJLJI = (int) (LJJIIZ3 * LJLLLLLL().LIZJ);
        if (C52342KgU.LIZ()) {
            LIZIZ.findViewById(R.id.cd0).setVisibility(0);
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            boolean z = LIZIZ instanceof ConstraintLayout;
            if (z) {
                constraintLayout = (ConstraintLayout) LIZIZ;
            } else {
                constraintLayout = null;
            }
            anonymousClass064.LJII(constraintLayout);
            anonymousClass064.LJIIIZ(R.id.lm5, 3, R.id.cd0, 4, O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
            anonymousClass064.LJIIIZ(R.id.lma, 3, R.id.cd0, 4, O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
            anonymousClass064.LJIIIZ(R.id.kwl, 3, R.id.cd0, 4, O6R.LJJIIZ(C32151Nz.LJIIZILJ(66)));
            if (z) {
                constraintLayout2 = (ConstraintLayout) LIZIZ;
            }
            anonymousClass064.LIZIZ(constraintLayout2);
        }
        LJLZ(LIZIZ);
        return new C57594Mj0(LIZIZ, this.LJLIL);
    }
}
