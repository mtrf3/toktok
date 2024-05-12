package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UFf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76879UFf extends AbstractC38911fr {
    public final /* synthetic */ SpotlightImageListPreviewDialogFragment LJLILLLLZI;

    @Override // X.AbstractC38911fr
    public final void LJJIII() {
    }

    public C76879UFf(SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment) {
        this.LJLILLLLZI = spotlightImageListPreviewDialogFragment;
    }

    @Override // X.AbstractC38911fr
    public final void LJJIIZ(C76881UFh params) {
        o.LJIIIZ(params, "params");
        ((C81091Vs7) this.LJLILLLLZI._$_findCachedViewById(R.id.f12)).LJI(this.LJLILLLLZI.LJZI);
        SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment = this.LJLILLLLZI;
        ListProtector.set(spotlightImageListPreviewDialogFragment.LJLIL, spotlightImageListPreviewDialogFragment.LJLJLJ, params.LIZIZ);
        this.LJLILLLLZI.Al(params.LIZIZ);
        AbstractC029409q adapter = ((RecyclerView) this.LJLILLLLZI._$_findCachedViewById(R.id.krc)).getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(this.LJLILLLLZI.LJLJLJ);
        }
        if (params.LIZLLL != null) {
            this.LJLILLLLZI.LJZL++;
        }
        SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment2 = this.LJLILLLLZI;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_edit_page_show");
        spotlightImageListPreviewDialogFragment2.xl(LIZ);
        LIZ.LJIJJ(spotlightImageListPreviewDialogFragment2.LJLJL, "show_entrance");
        LIZ.LJIJJ("edit_page", "click_position");
        LIZ.LJIJJ(Integer.valueOf(this.LJLILLLLZI.LJLILLLLZI.size()), "picture_quantity");
        LIZ.LJJIIJZLJL();
    }
}
