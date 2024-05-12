package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SGj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71813SGj extends AbstractC028509h {
    public final /* synthetic */ RecyclerView LJ;
    public final /* synthetic */ EffectTemplateCategoryFragment LJFF;
    public final /* synthetic */ C76732zl LJI;
    public final /* synthetic */ C76732zl LJII;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        Integer num;
        AbstractC029409q adapter = this.LJ.getAdapter();
        if (adapter != null) {
            num = Integer.valueOf(adapter.getItemViewType(i));
        } else {
            num = null;
        }
        if (ORY.LJJIJIIJIL(num, new Integer[]{Integer.valueOf(R.layout.atf), Integer.valueOf(R.layout.ate), Integer.valueOf(this.LJFF.Hl().getItemViewType(0)), Integer.valueOf(this.LJFF.Hl().getItemViewType(this.LJFF.Hl().getItemCount() - 1))})) {
            return 20;
        }
        EffectTemplateCategoryFragment effectTemplateCategoryFragment = this.LJFF;
        if (i >= 1) {
            if (i < effectTemplateCategoryFragment.Hl().getItemCount() + 1) {
                return this.LJI.element;
            }
        } else {
            effectTemplateCategoryFragment.getClass();
        }
        return this.LJII.element;
    }

    public C71813SGj(RecyclerView recyclerView, EffectTemplateCategoryFragment effectTemplateCategoryFragment, C76732zl c76732zl, C76732zl c76732zl2) {
        this.LJ = recyclerView;
        this.LJFF = effectTemplateCategoryFragment;
        this.LJI = c76732zl;
        this.LJII = c76732zl2;
    }
}
