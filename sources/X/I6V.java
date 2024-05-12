package X;

import Y.ACListenerS27S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I6V extends I6H {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public C42880GsG LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final String LJLJL;

    static {
        TBT tbt = new TBT(I6V.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I6V.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC46100I7k
    public final String getTag() {
        return this.LJLJL;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((BaseJediViewModel) this.LJLJJLL.LIZ(this, LJLJLJ[1])).Iv0(this, new TBT() { // from class: X.I6W
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((EditAdjustClipsBottomViewState) obj).getStickPointStatus());
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 466));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I6V(C82622Wbi diContainer, I6D parentScene) {
        super(diContainer, parentScene, R.id.dci);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJJL = UCI.LJI(this.LJLIL, I6G.class, null);
        this.LJLJJLL = UCI.LJI(this.LJLIL, EditAdjustClipsBottomViewModel.class, null);
        this.LJLJL = "StickPointStatusScene";
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        C42880GsG c42880GsG = new C42880GsG(requireSceneContext(), null);
        c42880GsG.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.kp, C16880lQ.LLZIL(this.mActivity), null);
        C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 199), LLLZIIL.findViewById(R.id.mhr));
        ((TextView) LLLZIIL.findViewById(R.id.mhs)).setText(R.string.im9);
        C42881GsH LIZ = C42881GsH.LIZ(requireSceneContext());
        I6X i6x = new I6X(LIZ.LIZ);
        i6x.LIZ.LIZ = i6x.LIZIZ.getString(R.string.im9);
        I6Y i6y = i6x.LIZ;
        i6y.LIZIZ = true;
        IAY iay = new IAY(LIZ.LIZ);
        iay.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        iay.setStatus(i6y);
        LIZ.LIZJ = iay;
        LIZ.LIZLLL = LLLZIIL;
        C278517l.LIZIZ(-1, -1, LLLZIIL);
        LIZ.LJ = 1;
        c42880GsG.setBuilder(LIZ);
        this.LJLJJI = c42880GsG;
        return c42880GsG;
    }
}
