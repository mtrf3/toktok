package X;

import android.content.Context;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MlG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57734MlG extends EdgeEffect {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ RecyclerView LIZIZ;

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        RecyclerView recyclerView = this.LIZIZ;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder LJJJJJL = recyclerView.LJJJJJL(recyclerView.getChildAt(i));
            if (LJJJJJL != null) {
                ((C57594Mj0) LJJJJJL).LJLIL.LJIIIZ();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeRecyclerViewHolder");
            }
        }
    }

    public final void LIZ(float f) {
        int i;
        if (this.LIZ == 2) {
            i = -1;
        } else {
            i = 1;
        }
        float height = this.LIZIZ.getHeight() * i * f * 0.2f;
        RecyclerView recyclerView = this.LIZIZ;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView.ViewHolder LJJJJJL = recyclerView.LJJJJJL(recyclerView.getChildAt(i2));
            if (LJJJJJL != null) {
                C57594Mj0 c57594Mj0 = (C57594Mj0) LJJJJJL;
                c57594Mj0.LJLIL.LIZLLL();
                View view = c57594Mj0.itemView;
                view.setTranslationX(view.getTranslationX() + height);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeRecyclerViewHolder");
            }
        }
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        int i2;
        super.onAbsorb(i);
        if (this.LIZ == 2) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        float f = i2 * i * 0.5f;
        RecyclerView recyclerView = this.LIZIZ;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView.ViewHolder LJJJJJL = recyclerView.LJJJJJL(recyclerView.getChildAt(i3));
            if (LJJJJJL != null) {
                C39661h4 c39661h4 = ((C57594Mj0) LJJJJJL).LJLIL;
                c39661h4.LIZ = f;
                c39661h4.LJIIIZ();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeRecyclerViewHolder");
            }
        }
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        super.onPull(f);
        LIZ(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        super.onPull(f, f2);
        LIZ(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57734MlG(int i, RecyclerView recyclerView, Context context) {
        super(context);
        this.LIZ = i;
        this.LIZIZ = recyclerView;
    }
}
