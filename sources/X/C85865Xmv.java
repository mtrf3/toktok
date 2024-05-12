package X;

import Y.ACListenerS35S0100000_15;
import Y.IDrS15S0200000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xmv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85865Xmv extends AbstractC56012Ht<C85871Xn1, C85864Xmu> {
    public LinearLayout LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public ImageView LJLJJLL;
    public TuxTextView LJLJL;
    public RecyclerView LJLJLJ;
    public TuxIconView LJLJLLL;
    public C45268Hpg LJLL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.aq7);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.bottom_layout)");
        this.LJLIL = (LinearLayout) requireViewById;
        View requireViewById2 = requireViewById(R.id.dp8);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.full_layout)");
        this.LJLILLLLZI = requireViewById2;
        View requireViewById3 = requireViewById(R.id.b3r);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.cancel_btn)");
        this.LJLJI = requireViewById3;
        View requireViewById4 = requireViewById(R.id.jam);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.save_btn)");
        this.LJLJJI = requireViewById4;
        View requireViewById5 = requireViewById(R.id.n6e);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.video_layout)");
        this.LJLJJL = requireViewById5;
        View requireViewById6 = requireViewById(R.id.f8p);
        o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.iv_play)");
        this.LJLJJLL = (ImageView) requireViewById6;
        View requireViewById7 = requireViewById(R.id.e0d);
        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.guidance_txt)");
        this.LJLJL = (TuxTextView) requireViewById7;
        View requireViewById8 = requireViewById(R.id.h2w);
        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.none)");
        this.LJLJLLL = (TuxIconView) requireViewById8;
        View requireViewById9 = requireViewById(R.id.l68);
        o.LJIIIIZZ(requireViewById9, "requireViewById(R.id.theme_recyclerview)");
        this.LJLJLJ = (RecyclerView) requireViewById9;
        C45268Hpg c45268Hpg = new C45268Hpg(new AqS181S0100000_15(this, 147), new AqS197S0100000_15(this, 31));
        this.LJLL = c45268Hpg;
        RecyclerView recyclerView = this.LJLJLJ;
        if (recyclerView != null) {
            recyclerView.setAdapter(c45268Hpg);
            requireSceneContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.LLJJIII(0);
            RecyclerView recyclerView2 = this.LJLJLJ;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(linearLayoutManager);
                RecyclerView recyclerView3 = this.LJLJLJ;
                if (recyclerView3 != null) {
                    recyclerView3.LJIIJJI(new IDrS15S0200000_15(this, linearLayoutManager, 0));
                    AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.Xmy
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C85871Xn1) obj).LIZLLL;
                        }
                    }, null, new AqS181S0100000_15(this, 143), 2, null);
                    AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.Xn5
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C85871Xn1) obj).LIZ;
                        }
                    }, null, new AqS181S0100000_15(this, 144), 2, null);
                    AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Xn3
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C85871Xn1) obj).LIZIZ;
                        }
                    }, null, new AqS181S0100000_15(this, 145), 2, null);
                    AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.Xmx
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Boolean.valueOf(((C85871Xn1) obj).LIZJ);
                        }
                    }, null, new AqS181S0100000_15(this, 146), 2, null);
                    AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Xn4
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C85871Xn1) obj).LJ;
                        }
                    }, null, new AqS181S0100000_15(this, 148), 2, null);
                    AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.Xmz
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C85871Xn1) obj).LJII;
                        }
                    }, null, new AqS181S0100000_15(this, 149), 2, null);
                    AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Xn0
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C85871Xn1) obj).LJI;
                        }
                    }, null, new AqS181S0100000_15(this, 141), 2, null);
                    AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.Xn2
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C85871Xn1) obj).LJFF;
                        }
                    }, null, new AqS181S0100000_15(this, 142), 2, null);
                    View view = this.LJLJI;
                    if (view != null) {
                        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 131), view);
                        View view2 = this.LJLJJI;
                        if (view2 != null) {
                            C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 132), view2);
                            View view3 = this.LJLJJL;
                            if (view3 != null) {
                                C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 133), view3);
                                TuxIconView tuxIconView = this.LJLJLLL;
                                if (tuxIconView != null) {
                                    C16880lQ.LJJJ(tuxIconView, new ACListenerS35S0100000_15(this, 134));
                                    return;
                                } else {
                                    o.LJIJI("noneBtn");
                                    throw null;
                                }
                            }
                            o.LJIJI("videoLayout");
                            throw null;
                        }
                        o.LJIJI("saveBtn");
                        throw null;
                    }
                    o.LJIJI("cancelBtn");
                    throw null;
                }
                o.LJIJI("themeRecyclerView");
                throw null;
            }
            o.LJIJI("themeRecyclerView");
            throw null;
        }
        o.LJIJI("themeRecyclerView");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.la, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
