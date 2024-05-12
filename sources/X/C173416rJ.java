package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6rJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173416rJ extends WM7 implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final C82622Wbi LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public RecyclerView LJLJJI;
    public C82946Wgw LJLJJL;
    public C173476rP LJLJJLL;
    public C173396rH LJLJL;
    public LinearLayoutManager LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public C81589W0j LJLLI;
    public InterfaceC153045zY LJLLILLLL;
    public FrameLayout LJLLJ;
    public final C82632Wbs LJLLL;
    public final C82632Wbs LJLLLL;
    public final C5H3 LJLLLLLL;

    static {
        TBT tbt = new TBT(C173416rJ.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C173416rJ.class, "audioEffectViewModel", "getAudioEffectViewModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/EditAudioEffectApi;", 0, c65351Pkp)};
    }

    public final VideoPublishEditModel LLJILJIL() {
        return (VideoPublishEditModel) this.LJLLL.LIZ(this, LJLZ[0]);
    }

    @Override // X.WM7
    public final void onDestroy() {
        InterfaceC81592W0m interfaceC81592W0m;
        super.onDestroy();
        C166696gT.LIZ().getClass();
        ((C43523H6h) C169416kr.LJ.getValue()).LIZ.LJIIIIZZ(1);
        C81589W0j c81589W0j = this.LJLLI;
        if (c81589W0j != null && (interfaceC81592W0m = c81589W0j.LIZJ) != null) {
            interfaceC81592W0m.LJJLIIIJL(true);
        }
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C166696gT.LIZ().getClass();
        InterfaceC84498XEg LIZIZ = C166696gT.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.destroy();
        }
        C169416kr.LIZLLL = null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C173416rJ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLLLL = UCI.LJI(diContainer, InterfaceC145875nz.class, null);
        this.LJLLLLLL = C269113v.LIZ(this, InterfaceC143655kP.class);
    }

    public final void LLJILJILJ(Effect effect) {
        C81589W0j c81589W0j = this.LJLLI;
        if (c81589W0j != null) {
            c81589W0j.LIZ(effect);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.6rP] */
    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLJILJIL();
        ((InterfaceC143655kP) this.LJLLLLLL.getValue()).sP().observe(this, new AObserverS70S0100000_2(this, 244));
        this.LJLJJLL = new C82604WbQ() { // from class: X.6rP
            @Override // X.C82604WbQ, X.InterfaceC82947Wgx
            public final void LJII() {
                ((InterfaceC143655kP) C173416rJ.this.LJLLLLLL.getValue()).U2(true, false, true);
            }
        };
        ((InterfaceC145875nz) this.LJLLLL.LIZ(this, LJLZ[1])).j50().LIZLLL(this, new AObjectS84S0100000_2(this, 279));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
    
        if (android.text.TextUtils.equals(r1, r0) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJ(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173416rJ.LLJJ(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel, boolean):void");
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cc6, viewGroup, false, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.LJLLJ = frameLayout;
        return frameLayout;
    }
}
