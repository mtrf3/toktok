package X;

import Y.ACListenerS22S0100000_2;
import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5rE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147885rE extends C146435ot {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJJJJJIL;
    public final C82631Wbr LLJJIJI;
    public final C82631Wbr LLJJIJIIJIL;
    public final C82631Wbr LLJJIJIL;
    public final C82631Wbr LLJJJ;
    public boolean LLJJJIL;
    public final C62822Ol8 LLJJJJ;

    static {
        TBT tbt = new TBT(C147885rE.class, "editToolBarApi", "getEditToolBarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLJJJJJIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C147885rE.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0, c65351Pkp), C61845OOz.LIZJ(C147885rE.class, "titlebarApi", "getTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C147885rE.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0, c65351Pkp)};
    }

    @Override // X.C63C
    public final C1545664u LLJJI() {
        View inflate = ((ViewStub) requireViewById(R.id.nch)).inflate();
        o.LJII(inflate, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.text.TextModeStickerInputLayout");
        C1551967f c1551967f = (C1551967f) inflate;
        c1551967f.setBackEventCallBack(new ACListenerS22S0100000_2(this, 54));
        return c1551967f;
    }

    @Override // X.C63C, X.InterfaceC150315v9
    public final boolean LLZZ() {
        boolean LLZZ = super.LLZZ();
        if (!LLZZ && LLLF().LJIIL()) {
            return true;
        }
        return LLZZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C147885rE(C82622Wbi diContainer) {
        super(diContainer);
        o.LJIIIZ(diContainer, "diContainer");
        this.LLJJIJI = UCI.LJII(this.LJLIL, InterfaceC153275zv.class, null);
        this.LLJJIJIIJIL = UCI.LJII(this.LJLIL, ActivityC45651qj.class, null);
        this.LLJJIJIL = UCI.LJII(this.LJLIL, InterfaceC153185zm.class, null);
        this.LLJJJ = UCI.LJII(this.LJLIL, InterfaceC146235oZ.class, null);
        this.LLJJJJ = C221108m2.LIZIZ(C147895rF.LJLIL);
    }

    @Override // X.C63C
    public final void LLJILJILJ(int i) {
        C67Q c67q;
        LLLF().LIZIZ(i);
        C67P LLLFZ = LLLFZ();
        if ((LLLFZ instanceof C67Q) && (c67q = (C67Q) LLLFZ) != null) {
            c67q.setStickerTextColor(i);
        }
    }

    public final void LLLLIILLL(boolean z) {
        InterfaceC153275zv interfaceC153275zv;
        if (C6N3.LIZ() && (interfaceC153275zv = (InterfaceC153275zv) this.LLJJIJI.LIZ(this, LLJJJJJIL[0])) != null) {
            interfaceC153275zv.Jf(23, z);
        }
        InterfaceC153275zv interfaceC153275zv2 = (InterfaceC153275zv) this.LLJJIJI.LIZ(this, LLJJJJJIL[0]);
        if (interfaceC153275zv2 != null) {
            interfaceC153275zv2.Jl(z);
        }
    }

    @Override // X.C63C, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        C0IB<Boolean> H3;
        super.onActivityCreated(bundle);
        getEditPreviewApi().wf0().observe(this, new AObserverS70S0100000_2(this, 104));
        C63D c63d = this.LLJI;
        if (c63d != null && (H3 = c63d.H3()) != null) {
            H3.LIZIZ(this, new AObjectS84S0100000_2(this, 180));
        }
    }
}
