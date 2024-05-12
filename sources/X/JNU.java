package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class JNU extends RecyclerView.ViewHolder implements InterfaceC49280JVs, View.OnAttachStateChangeListener, JW1 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final C62822Ol8 LJLIL;
    public final JNV LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;

    static {
        TBV tbv = new TBV(JNU.class, "_itemMobParam", "get_itemMobParam()Lcom/ss/android/ugc/aweme/search/mob/ItemMobParam;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbv};
    }

    public void N() {
    }

    @Override // X.InterfaceC49280JVs
    public final JQA LJLJL() {
        JQA LIZ = this.LJLILLLLZI.LIZ(this, LJLJJLL[0]);
        if (LIZ == null) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            return JY2.LIZ(itemView);
        }
        return LIZ;
    }

    public final SearchGlobalViewModel M() {
        return (SearchGlobalViewModel) this.LJLIL.getValue();
    }

    public final Context getContext() {
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        return context;
    }

    public View getView() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    public ActivityC45651qj getActivity() {
        Activity LIZIZ = C27740Aue.LIZIZ(getView());
        o.LJII(LIZIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (ActivityC45651qj) LIZIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JNU(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        itemView.addOnAttachStateChangeListener(this);
        this.LJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(itemView, 553));
        C221108m2.LIZIZ(new AqS158S0100000_8(itemView, 552));
        this.LJLILLLLZI = new JNV(this);
    }

    @Override // X.JW1
    public final void LJZ(String str) {
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC49280JVs
    public void LLLLIIIILLL(JQA param) {
        o.LJIIIZ(param, "param");
        this.LJLILLLLZI.LIZIZ(LJLJJLL[0], this, param);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        JY2.LIZIZ(itemView, LJLJL());
    }

    public void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        JY2.LIZIZ(itemView, LJLJL());
        this.LJLJI = true;
    }

    public void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        JY2.LIZJ(itemView);
        C49621Jdh.LIZ(null);
        this.LJLJI = false;
    }

    public final void L(View view, View view2, JYG jyg, View.OnTouchListener onTouchListener) {
        o.LJIIIZ(view, "view");
        C48961JJl c48961JJl = new C48961JJl(view2, this, view.getContext());
        if (this.LJLJJL) {
            c48961JJl.LJLJLJ = new C48962JJm(this, jyg);
        }
        c48961JJl.LJLJLLL = onTouchListener;
        view.setOnTouchListener(c48961JJl);
    }
}
