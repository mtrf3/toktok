package X;

import Y.AObserverS75S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.FirstPhotoViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I3x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46009I3x extends AbstractC56012Ht<I4A, I4R> {
    public C46026I4o LJLIL;
    public ViewGroup LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public ViewGroup LJLJJL;
    public TuxTextView LJLJJLL;
    public boolean LJLJL;
    public C46127I8l LJLJLJ;

    public final void LJIJI() {
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            layoutParams2.bottomMargin = C6IB.LIZJ(requireSceneContext) - ((int) C74275TDb.LIZ(104.0f));
            ViewGroup viewGroup2 = this.LJLJJL;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutParams(layoutParams2);
                return;
            } else {
                o.LJIJI("bottomTabContainer");
                throw null;
            }
        }
        o.LJIJI("bottomTabContainer");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.j5i);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.rl_record_tool_bottom)");
        this.LJLJJL = (ViewGroup) requireViewById;
        View requireViewById2 = requireViewById(R.id.b06);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.btn_upload)");
        this.LJLIL = (C46026I4o) requireViewById2;
        View requireViewById3 = requireViewById(R.id.crm);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.effect_container)");
        this.LJLILLLLZI = (ViewGroup) requireViewById3;
        View requireViewById4 = requireViewById(R.id.fbj);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.iv_tool)");
        this.LJLJI = requireViewById4;
        View requireViewById5 = requireViewById(R.id.fbm);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.iv_tool_mark)");
        this.LJLJJI = requireViewById5;
        View requireViewById6 = requireViewById(R.id.moi);
        o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.tv_tool_name)");
        this.LJLJJLL = (TuxTextView) requireViewById6;
        if (C44260HYq.LIZ() || C46029I4r.LIZ()) {
            View view = this.LJLJI;
            if (view != null) {
                int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(40));
                int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(40));
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = LJJIIZ;
                layoutParams.width = LJJIIZ2;
                view.setLayoutParams(layoutParams);
                View view2 = this.LJLJJI;
                if (view2 != null) {
                    int LJJIIZ3 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(40));
                    int LJJIIZ4 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(40));
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    layoutParams2.height = LJJIIZ3;
                    layoutParams2.width = LJJIIZ4;
                    view2.setLayoutParams(layoutParams2);
                } else {
                    o.LJIJI("ivToolMark");
                    throw null;
                }
            } else {
                o.LJIJI("ivTool");
                throw null;
            }
        }
        if (C44260HYq.LIZ()) {
            C46026I4o c46026I4o = this.LJLIL;
            if (c46026I4o != null) {
                c46026I4o.LIZJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
                C46026I4o c46026I4o2 = this.LJLIL;
                if (c46026I4o2 != null) {
                    c46026I4o2.setDefaultIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
                } else {
                    o.LJIJI("uploadButton");
                    throw null;
                }
            } else {
                o.LJIJI("uploadButton");
                throw null;
            }
        }
        if (C46029I4r.LIZ()) {
            C46026I4o c46026I4o3 = this.LJLIL;
            if (c46026I4o3 != null) {
                c46026I4o3.LIZLLL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)));
                C46026I4o c46026I4o4 = this.LJLIL;
                if (c46026I4o4 != null) {
                    c46026I4o4.setDefaultIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
                } else {
                    o.LJIJI("uploadButton");
                    throw null;
                }
            } else {
                o.LJIJI("uploadButton");
                throw null;
            }
        }
        if (L1D.LIZIZ() || L1D.LIZ()) {
            C46026I4o c46026I4o5 = this.LJLIL;
            if (c46026I4o5 != null) {
                C82740Wdc.LIZJ(c46026I4o5);
            } else {
                o.LJIJI("uploadButton");
                throw null;
            }
        }
        LJIJI();
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.I48
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((I4A) obj).LIZLLL);
            }
        }, null, new AqS173S0100000_7(this, 76), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.I49
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((I4A) obj).LJ);
            }
        }, null, new AqS173S0100000_7(this, 77), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.I4B
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((I4A) obj).LJFF);
            }
        }, null, new AqS173S0100000_7(this, 78), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.I4J
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((I4A) obj).LJI;
            }
        }, null, new AqS173S0100000_7(this, 79), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.I4C
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((I4A) obj).LJII);
            }
        }, null, new AqS173S0100000_7(this, 75), 2, null);
        ViewGroup viewGroup = this.LJLILLLLZI;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            boolean LJ = o.LJ(HQC.LIZ().getResourceType(), "effect");
            HQC.LIZ().getClass();
            if (C45429HsH.LIZ() && LJ && o.LJ(getUiStates().LJ.LIZJ.enterFrom, "super_entrance")) {
                z = true;
            } else {
                z = false;
            }
            I40 i40 = C46127I8l.LJLLJ;
            Activity activity = this.mActivity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            View view3 = this.mView;
            o.LJIIIIZZ(view3, "view");
            I0N i0n = getUiStates().LJ.LIZIZ;
            C82622Wbi c82622Wbi = getUiStates().LJ.LIZ;
            AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(this, 80);
            AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(this, 148);
            i40.getClass();
            this.LJLJLJ = I40.LIZ((C29S) activity, this, view3, z, i0n, c82622Wbi, aqS173S0100000_7, aqS157S0100000_7);
            C46026I4o c46026I4o6 = this.LJLIL;
            if (c46026I4o6 != null) {
                c46026I4o6.setText(R.string.thj);
                ShortVideoContext shortVideoContext = (ShortVideoContext) getUiStates().LJ.LIZ.LJIIIIZZ(null, ShortVideoContext.class);
                if (shortVideoContext != null && shortVideoContext.mIsFromDraft) {
                    C46026I4o c46026I4o7 = this.LJLIL;
                    if (c46026I4o7 != null) {
                        c46026I4o7.setVisibility(8);
                    } else {
                        o.LJIJI("uploadButton");
                        throw null;
                    }
                }
                if (this.LJLJL) {
                    return;
                }
                this.LJLJL = true;
                ((FirstPhotoViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(FirstPhotoViewModel.class)).LJLIL.observe(this, new AObserverS75S0100000_7(this, 13));
                C46026I4o c46026I4o8 = this.LJLIL;
                if (c46026I4o8 != null) {
                    c46026I4o8.setOnClickListener(new ViewOnClickListenerC13880ga(new I44(this)));
                    return;
                } else {
                    o.LJIJI("uploadButton");
                    throw null;
                }
            }
            o.LJIJI("uploadButton");
            throw null;
        }
        o.LJIJI("effectContainer");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (L1D.LIZIZ() || L1D.LIZ()) {
            View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ds3, container, false);
            o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
            return (ViewGroup) LLLLIILL;
        }
        View LLLLIILL2 = C16880lQ.LLLLIILL(inflater, R.layout.ds2, container, false);
        o.LJII(LLLLIILL2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) LLLLIILL2;
    }
}
