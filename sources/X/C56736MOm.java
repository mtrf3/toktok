package X;

import Y.ACListenerS29S0100000_9;
import Y.AObserverS77S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.notification.adapter.FilterViewModel;
import com.ss.android.ugc.aweme.notification.adapter.GroupFilterViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MOm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56736MOm extends PopupWindow implements G27 {
    public final Context LJLIL;
    public final InterfaceC56737MOn LJLILLLLZI;
    public SYL LJLJI;
    public View LJLJJI;
    public final FilterViewModel LJLJJL;

    public final void LIZ() {
        SYL syl = this.LJLJI;
        if (syl != null) {
            PowerAdapter powerAdapter = syl.LLLF;
            powerAdapter.getClass();
            powerAdapter.LLIILZL(new SI2(powerAdapter));
            return;
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }

    public final int LIZIZ() {
        ActivityC45651qj activityC45651qj;
        LLQ Xm0;
        int i = C53946LFe.LIZJ(this.LJLIL, null).LIZIZ;
        Context context = this.LJLIL;
        if ((context instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) context) != null && (Xm0 = LNZ.LIZIZ.getHomeTabViewModel(activityC45651qj).Xm0()) != null && !Xm0.LJIILLIIL()) {
            LFH.LIZIZ.LIZLLL().LJIIZILJ();
            return C47135Ieh.LIZ(60, i);
        }
        return i;
    }

    public final void LIZJ(List<C56732MOi> list) {
        o.LJIIIZ(list, "list");
        SYL syl = this.LJLJI;
        if (syl != null) {
            syl.getState().LJIILLIIL(list);
        } else {
            o.LJIJI("mRecyclerView");
            throw null;
        }
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        update(LIZIZ(), -2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56736MOm(Context context, InterfaceC56737MOn listener, AmeBaseFragment fragment) {
        super(context);
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = context;
        this.LJLILLLLZI = listener;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.u6, null, false);
        setContentView(LLLLIILL);
        View findViewById = LLLLIILL.findViewById(R.id.d__);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.filter_recycler)");
        this.LJLJI = (SYL) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.am3);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById(R.id.blank_view)");
        this.LJLJJI = findViewById2;
        setWidth(LIZIZ());
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(C04330Ez.LIZIZ(context, R.color.cz)));
        setFocusable(true);
        setAnimationStyle(R.style.a_v);
        View view = this.LJLJJI;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 116), view);
            SYL syl = this.LJLJI;
            if (syl != null) {
                syl.setLifecycleOwner(fragment);
                SYL syl2 = this.LJLJI;
                if (syl2 != null) {
                    syl2.LLLF.LJZL(GroupFilterViewHolder.class);
                    FilterViewModel filterViewModel = (FilterViewModel) ViewModelProviders.of(fragment).get(FilterViewModel.class);
                    this.LJLJJL = filterViewModel;
                    ((LiveData) filterViewModel.LJLILLLLZI.getValue()).observe(fragment, new AObserverS77S0100000_9(this, 76));
                    C9XU.LIZ(context.hashCode(), this);
                    return;
                }
                o.LJIJI("mRecyclerView");
                throw null;
            }
            o.LJIJI("mRecyclerView");
            throw null;
        }
        o.LJIJI("mBlankView");
        throw null;
    }
}
