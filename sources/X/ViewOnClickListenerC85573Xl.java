package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3Xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC85573Xl extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final EffectDraftSubmissionListViewModel LJLIL;
    public java.util.Map<String, String> LJLILLLLZI;
    public C69192nb LJLJI;
    public final C71897SJp LJLJJI;
    public final TuxTextView LJLJJL;
    public final C62354Oda LJLJJLL;

    public final void L(String str) {
        java.util.Map<String, String> map = this.LJLILLLLZI;
        if (map != null) {
            java.util.Map LJJLIL = C113554cx.LJJLIL(map);
            LJJLIL.put("button_state", str);
            C78897Uxp.LJJJ("post_page_draft_effect_click", LJJLIL);
            return;
        }
        o.LJIJI("mobData");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C69192nb c69192nb = this.LJLJI;
        if (c69192nb != null) {
            if (!c69192nb.LJLILLLLZI.enableSubmission) {
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(R.string.fva);
                C78915Uy7.LJJIJ(itemView, 1011, creativeToastBuilder);
                L("DISABLED");
                return;
            }
            String str = "OFF";
            if (this.LJLJJI.isChecked()) {
                EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel = this.LJLIL;
                effectDraftSubmissionListViewModel.LJLILLLLZI--;
            } else {
                EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel2 = this.LJLIL;
                int i = effectDraftSubmissionListViewModel2.LJLILLLLZI;
                if (i >= 10) {
                    View itemView2 = this.itemView;
                    o.LJIIIIZZ(itemView2, "itemView");
                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                    creativeToastBuilder2.messageRes(R.string.bo5);
                    C78915Uy7.LJJIJ(itemView2, 1011, creativeToastBuilder2);
                    L("OFF");
                    return;
                }
                effectDraftSubmissionListViewModel2.LJLILLLLZI = i + 1;
            }
            this.LJLJJI.performClick();
            C69192nb c69192nb2 = this.LJLJI;
            if (c69192nb2 != null) {
                c69192nb2.LJLIL = this.LJLJJI.isChecked();
                if (this.LJLJJI.isChecked()) {
                    str = "ON";
                }
                L(str);
                return;
            }
            o.LJIJI("data");
            throw null;
        }
        o.LJIJI("data");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC85573Xl(EffectDraftSubmissionListViewModel viewModel, View view) {
        super(view);
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        View findViewById = view.findViewById(R.id.cgk);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…aft_submission_check_box)");
        this.LJLJJI = (C71897SJp) findViewById;
        View findViewById2 = view.findViewById(R.id.cgn);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…ubmission_name_text_view)");
        this.LJLJJL = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.cgl);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…t_submission_effect_icon)");
        this.LJLJJLL = (C62354Oda) findViewById3;
    }
}
