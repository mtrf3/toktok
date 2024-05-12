package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sr3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73381Sr3 extends MK7 {
    public final C85193Vz LJLIL;
    public final List<C3W5> LJLILLLLZI;
    public final AqS194S0100000_12 LJLJI;

    @Override // X.C4II
    public final int getBasicItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public C73381Sr3(C85193Vz viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        registerAdapterDataObserver(new C73380Sr2(this));
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new AqS194S0100000_12(this, 2);
    }

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        return ((C3W5) ListProtector.get(this.LJLILLLLZI, i)).LIZIZ;
    }

    public final void setData(List<C3W5> data) {
        o.LJIIIZ(data, "data");
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLILLLLZI).addAll(data);
        notifyDataSetChanged();
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C73382Sr4 c73382Sr4;
        String nickname;
        if (getItemViewType(i) == 3 && (viewHolder instanceof C73382Sr4) && (c73382Sr4 = (C73382Sr4) viewHolder) != null) {
            C3W5 model = (C3W5) ListProtector.get(this.LJLILLLLZI, i);
            o.LJIIIZ(model, "model");
            User user = model.LIZ;
            TextView textView = c73382Sr4.LJLJI;
            String remarkName = user.getRemarkName();
            if (remarkName == null || remarkName.length() == 0) {
                nickname = user.getNickname();
            } else {
                nickname = user.getRemarkName();
            }
            textView.setText(nickname);
            c73382Sr4.LJLJJI.setText(user.getUniqueId());
            C78764Uvg.LJI(c73382Sr4.LJLJJL, user.getAvatarThumb(), -1, -1);
            ViewGroup.LayoutParams layoutParams = c73382Sr4.LJLJJLL.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(((Number) c73382Sr4.LJLJL.getValue()).intValue());
            marginLayoutParams.leftMargin = ((Number) c73382Sr4.LJLJL.getValue()).intValue();
            c73382Sr4.LJLJJLL.setLayoutParams(marginLayoutParams);
            List<C3W5> value = c73382Sr4.LJLIL.LIZIZ.getValue();
            if (value == null) {
                value = C61878OQg.INSTANCE;
            }
            c73382Sr4.LJLJJLL.setChecked(value.contains(model));
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.lg, viewGroup, false);
        C85193Vz c85193Vz = this.LJLIL;
        o.LJIIIIZZ(view, "view");
        C73382Sr4 c73382Sr4 = new C73382Sr4(c85193Vz, view);
        c73382Sr4.LJLILLLLZI = this.LJLJI;
        return c73382Sr4;
    }
}
