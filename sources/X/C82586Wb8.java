package X;

import Y.ACListenerS34S0100000_14;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wb8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82586Wb8 extends AbstractC163776bl<FTCEditAudioEffectViewModel> implements InterfaceC135635Tz {
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final C62822Ol8 LJLLI;
    public final AqS164S0100000_14 LJLLILLLL;

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        WMH wmh;
        C82584Wb6 c82584Wb6 = (C82584Wb6) this.LJLLI.getValue();
        WM7 wm7 = c82584Wb6.mParentScene;
        FrameLayout frameLayout = null;
        if ((wm7 instanceof WMH) && (wmh = (WMH) wm7) != null) {
            wmh.show(c82584Wb6);
        }
        c82584Wb6.LJLLILLLL = ((InterfaceC143655kP) c82584Wb6.LJLLLLLL.getValue()).Kh().getValue();
        FrameLayout frameLayout2 = c82584Wb6.LJLLJ;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
            Activity activity = c82584Wb6.mActivity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            FrameLayout frameLayout3 = c82584Wb6.LJLLJ;
            if (frameLayout3 != null) {
                if (c82584Wb6.LJLILLLLZI == null) {
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(activity), R.layout.kb, frameLayout3, false);
                    c82584Wb6.LJLILLLLZI = LLLLIILL;
                    if (LLLLIILL != null) {
                        LLLLIILL.findViewById(R.id.m63);
                    }
                    View view = c82584Wb6.LJLILLLLZI;
                    if (view != null) {
                        frameLayout = (FrameLayout) view.findViewById(R.id.fkp);
                    }
                    c82584Wb6.LJLLI = new C81589W0j(frameLayout);
                    View view2 = c82584Wb6.LJLILLLLZI;
                    o.LJI(view2);
                    c82584Wb6.LJLJI = view2.findViewById(R.id.ndi);
                    View view3 = c82584Wb6.LJLILLLLZI;
                    o.LJI(view3);
                    C16880lQ.LJIIJ(new ACListenerS34S0100000_14(c82584Wb6, 96), view3.findViewById(R.id.ndy));
                    View view4 = c82584Wb6.LJLILLLLZI;
                    o.LJI(view4);
                    c82584Wb6.LJLJJI = (RecyclerView) view4.findViewById(R.id.ndr);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
                    c82584Wb6.LJLJLJ = linearLayoutManager;
                    RecyclerView recyclerView = c82584Wb6.LJLJJI;
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(linearLayoutManager);
                    }
                    Activity activity2 = c82584Wb6.mActivity;
                    o.LJII(activity2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    C82585Wb7 c82585Wb7 = new C82585Wb7((C29S) activity2, c82584Wb6.LJLLILLLL, c82584Wb6.LLJILJIL(), c82584Wb6.LLJILJIL().veAudioEffectParam, (InterfaceC143655kP) c82584Wb6.LJLLLLLL.getValue());
                    c82584Wb6.LJLJL = c82585Wb7;
                    c82585Wb7.LJLLILLLL = c82584Wb6;
                    RecyclerView recyclerView2 = c82584Wb6.LJLJJI;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(c82585Wb7);
                    }
                    c82584Wb6.LLJJ(C149905uU.LIZ(), false);
                    C166696gT.LIZ().LIZIZ(new C82598WbK(c82584Wb6));
                    View view5 = c82584Wb6.LJLILLLLZI;
                    o.LJI(view5);
                    View view6 = c82584Wb6.LJLJI;
                    o.LJI(view6);
                    C82946Wgw c82946Wgw = new C82946Wgw(frameLayout3, view5, view6);
                    c82584Wb6.LJLJJL = c82946Wgw;
                    c82946Wgw.LJLIL = new C82600WbM(c82584Wb6);
                } else {
                    c82584Wb6.LLJJ(C149905uU.LIZ(), false);
                    C166696gT.LIZ().LIZIZ(new C82598WbK(c82584Wb6));
                }
                View view7 = c82584Wb6.LJLILLLLZI;
                if (view7 != null) {
                    view7.setVisibility(4);
                }
                C82946Wgw c82946Wgw2 = c82584Wb6.LJLJJL;
                if (c82946Wgw2 != null) {
                    c82946Wgw2.LIZIZ(new C82597WbJ(c82584Wb6));
                    return;
                }
                return;
            }
            o.LJIJI("parentLayout");
            throw null;
        }
        o.LJIJI("parentLayout");
        throw null;
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<FTCEditAudioEffectViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C82586Wb8(C82622Wbi diContainer, WMH parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = R.id.fns;
        this.LJLLI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 396));
        this.LJLLILLLL = new AqS164S0100000_14(this, 397);
    }
}
