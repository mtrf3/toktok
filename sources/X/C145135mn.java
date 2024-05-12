package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145135mn extends WM7 implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final InterfaceC152085y0 LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public C145155mp LJLJI;
    public final C82632Wbs LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C82631Wbr LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C145145mo LJLJLLL;

    static {
        TBT tbt = new TBT(C145135mn.class, "editGestureApi", "getEditGestureApi()Lcom/ss/android/ugc/gamora/editor/gesture/EditGestureApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C145135mn.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145135mn.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C145155mp c145155mp = this.LJLJI;
        if (c145155mp != null) {
            c145155mp.LIZIZ = null;
        } else {
            o.LJIJI("stickerPanelGestureAdapter");
            throw null;
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public final void LLJILJIL(boolean z) {
        if (H7R.LJJLIIIJJIZ((VideoPublishEditModel) this.LJLJLJ.LIZ(this, LJLL[2])) || C78541Us5.LIZJ()) {
            return;
        }
        ((InterfaceC146235oZ) this.LJLJJL.getValue()).Yn0(z);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        InterfaceC65784Pro<Rect> interfaceC65784Pro;
        super.onActivityCreated(bundle);
        ((InterfaceC143655kP) this.LJLJJLL.getValue()).Zq0().observe(this, new AObserverS70S0100000_2(this, 81));
        C82632Wbs c82632Wbs = this.LJLJJI;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLL;
        ((InterfaceC140305f0) c82632Wbs.LIZ(this, interfaceC74236TBoArr[0])).xp().LIZIZ(this, new AObjectS84S0100000_2(this, 101));
        ((InterfaceC140305f0) this.LJLJJI.LIZ(this, interfaceC74236TBoArr[0])).r60().LIZLLL(this, new AObjectS84S0100000_2(this, 102));
        ((InterfaceC140305f0) this.LJLJJI.LIZ(this, interfaceC74236TBoArr[0])).hI().LIZLLL(this, new AObjectS84S0100000_2(this, 103));
        InterfaceC152085y0 interfaceC152085y0 = this.LJLIL;
        InterfaceC147865rC interfaceC147865rC = (InterfaceC147865rC) this.LJLJL.LIZ(this, interfaceC74236TBoArr[1]);
        if (interfaceC147865rC != null) {
            interfaceC65784Pro = interfaceC147865rC.dS();
        } else {
            interfaceC65784Pro = null;
        }
        C145155mp c145155mp = new C145155mp(interfaceC152085y0, interfaceC65784Pro);
        this.LJLJI = c145155mp;
        c145155mp.LIZIZ = this.LJLJLLL;
    }

    public C145135mn(InterfaceC152085y0 interfaceC152085y0, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = interfaceC152085y0;
        this.LJLILLLLZI = diContainer;
        this.LJLJJI = UCI.LJI(diContainer, InterfaceC140305f0.class, null);
        this.LJLJJL = C269113v.LIZ(this, InterfaceC146235oZ.class);
        this.LJLJJLL = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLJL = UCI.LJII(diContainer, InterfaceC147865rC.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJLLL = new C145145mo(this);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        return new View(requireSceneContext());
    }
}
