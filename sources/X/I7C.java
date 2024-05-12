package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I7C extends I6H {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public C80261Vej LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final String LJLJL;

    static {
        TBT tbt = new TBT(I7C.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I7C.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC46100I7k
    public final String getTag() {
        return this.LJLJL;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.gl7);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.mode_tab_layout)");
        C80261Vej c80261Vej = (C80261Vej) requireViewById;
        this.LJLJJI = c80261Vej;
        C78856UxA newTab = c80261Vej.newTab();
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        TuxTextView tuxTextView = new TuxTextView(requireActivity, null, 6, 0);
        tuxTextView.setTuxFont(72);
        tuxTextView.setTextColor(tuxTextView.getResources().getColorStateList(R.color.e2));
        tuxTextView.setText(R.string.rp6);
        newTab.LJFF = tuxTextView;
        newTab.LJFF();
        c80261Vej.addTab(newTab);
        C80261Vej c80261Vej2 = this.LJLJJI;
        if (c80261Vej2 != null) {
            C78856UxA newTab2 = c80261Vej2.newTab();
            Activity requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            TuxTextView tuxTextView2 = new TuxTextView(requireActivity2, null, 6, 0);
            tuxTextView2.setTuxFont(72);
            tuxTextView2.setTextColor(tuxTextView2.getResources().getColorStateList(R.color.e2));
            tuxTextView2.setText(R.string.rp9);
            newTab2.LJFF = tuxTextView2;
            newTab2.LJFF();
            c80261Vej2.addTab(newTab2);
            C80261Vej c80261Vej3 = this.LJLJJI;
            if (c80261Vej3 != null) {
                c80261Vej3.addOnTabSelectedListener((LHW) new I7D(this));
                ((BaseJediViewModel) this.LJLJJLL.LIZ(this, LJLJLJ[1])).Iv0(this, new TBT() { // from class: X.I6U
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((EditAdjustClipsBottomViewState) obj).isMusicSyncMode();
                    }
                }, new C73165SnZ(), new AqS173S0100000_7(this, 467));
                return;
            } else {
                o.LJIJI("tabLayout");
                throw null;
            }
        }
        o.LJIJI("tabLayout");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I7C(C82622Wbi diContainer, I6D parentScene) {
        super(diContainer, parentScene, R.id.dha);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJJL = UCI.LJI(this.LJLIL, I6G.class, null);
        this.LJLJJLL = UCI.LJI(this.LJLIL, EditAdjustClipsBottomViewModel.class, null);
        this.LJLJL = "ModeSwitchScene";
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ie, viewGroup, false, "inflater.inflate(R.layou…itcher, container, false)");
    }
}
