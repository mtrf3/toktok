package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5zC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152825zC extends AbstractC56012Ht<C152775z7, C73292uD> {
    public ViewGroup LJLIL;
    public LinearLayout LJLILLLLZI;
    public C159006Lw LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.lbz);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.too…center_display_container)");
        this.LJLILLLLZI = (LinearLayout) requireViewById;
        View requireViewById2 = requireViewById(R.id.g80);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.loading_anim_view)");
        this.LJLJI = (C159006Lw) requireViewById2;
        View requireViewById3 = requireViewById(R.id.cc6);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.display_text_item_h1)");
        this.LJLJJI = (TuxTextView) requireViewById3;
        View requireViewById4 = requireViewById(R.id.cc7);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.display_text_item_p1)");
        this.LJLJJL = (TuxTextView) requireViewById4;
        View requireViewById5 = requireViewById(R.id.zj);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.ai_meme_btn_retry)");
        TuxTextView tuxTextView = (TuxTextView) requireViewById5;
        this.LJLJJLL = tuxTextView;
        C146035oF.LIZJ(tuxTextView, new AqS152S0100000_2(this, 69));
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5zA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C152775z7) obj).LJLILLLLZI;
            }
        }, null, new AqS168S0100000_2(this, 49), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5zB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C152775z7) obj).LJLIL;
            }
        }, null, new AqS168S0100000_2(this, 50), 2, null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cbg, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        this.LJLIL = viewGroup2;
        return viewGroup2;
    }
}
