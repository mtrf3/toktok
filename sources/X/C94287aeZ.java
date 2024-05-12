package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.aeZ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94287aeZ extends AbstractC030309z {
    public final /* synthetic */ EffectLayerEditorFragment LJLIL;

    public C94287aeZ(EffectLayerEditorFragment effectLayerEditorFragment) {
        this.LJLIL = effectLayerEditorFragment;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        super.LJ(outRect, view, parent, state);
        RecyclerView.ViewHolder LJJJJJL = parent.LJJJJJL(view);
        o.LJIIIIZZ(LJJJJJL, "parent.getChildViewHolder(view)");
        int adapterPosition = LJJJJJL.getAdapterPosition();
        this.LJLIL.Al().getClass();
        if (adapterPosition < 0) {
            return;
        }
        AbstractC94471ahX abstractC94471ahX = (AbstractC94471ahX) ListProtector.get(this.LJLIL.Al().LJLIL, adapterPosition);
        if (abstractC94471ahX.LJ() == 0) {
            if (abstractC94471ahX.LIZLLL() && abstractC94471ahX.LIZ) {
                outRect.bottom = 0;
            } else {
                outRect.bottom = (int) KL2.LIZJ(this.LJLIL.mo49getActivity(), 4.0f);
            }
            if (adapterPosition == 0) {
                outRect.top = (int) KL2.LIZJ(this.LJLIL.mo49getActivity(), 16.0f);
                return;
            }
            return;
        }
        if (adapterPosition < this.LJLIL.Al().LJLIL.size() - 1 && ((AbstractC94471ahX) ListProtector.get(this.LJLIL.Al().LJLIL, adapterPosition + 1)).LJ() != 0) {
            outRect.bottom = 0;
        } else {
            outRect.bottom = (int) KL2.LIZJ(this.LJLIL.mo49getActivity(), 4.0f);
        }
    }
}
