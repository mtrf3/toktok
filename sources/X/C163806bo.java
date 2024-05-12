package X;

import Y.ACListenerS22S0100000_2;
import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.6bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163806bo extends WM7 implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public boolean LJLJL;
    public DialogC254029y2 LJLJLJ;
    public View LJLJLLL;
    public View LJLL;

    static {
        TBT tbt = new TBT(C163806bo.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C163806bo.class, "imageEditPageData", "getImageEditPageData()Lcom/ss/android/ugc/aweme/image/switchmode/ImageEditPageData;", 0, c65351Pkp), C61845OOz.LIZJ(C163806bo.class, "previewApi", "getPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C163806bo.class, "imageModeSwitchApi", "getImageModeSwitchApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageModeSwitchApi;", 0, c65351Pkp), C61845OOz.LIZJ(C163806bo.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp)};
    }

    public final C6FY LLJILJIL() {
        return (C6FY) this.LJLJI.LIZ(this, LJLLI[1]);
    }

    public final InterfaceC150355vD LLJILJILJ() {
        return (InterfaceC150355vD) this.LJLJJL.LIZ(this, LJLLI[3]);
    }

    public final AbstractC42651GoZ LLJJ() {
        return (AbstractC42651GoZ) this.LJLJJLL.LIZ(this, LJLLI[4]);
    }

    public final void LLJJI() {
        DialogC254029y2 dialogC254029y2 = new DialogC254029y2(requireActivity());
        dialogC254029y2.setCancelable(false);
        if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/DmtStatusViewDialog", "show", dialogC254029y2, new Object[0], "void", new C65300Pk0(false, "()V", "-218651632624328873")).LIZ) {
            dialogC254029y2.show();
        }
        this.LJLJLJ = dialogC254029y2;
        C42303Gix.LIZ(1114, GGO.SHOW, EnumC42283Gid.DUAL_BALL, EnumC42282Gic.CLOSE_VISIBLE, null);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LJLILLLLZI.LIZ(this, LJLLI[0]);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C163806bo(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJI = UCI.LJI(diContainer, C6FY.class, null);
        this.LJLJJI = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC150355vD.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, AbstractC42651GoZ.class, null);
    }

    public final void LLJJIII(boolean z) {
        int i;
        Bundle bundle;
        ArrayList parcelableArrayList;
        this.LJLJL = true;
        VideoPublishEditModel editModel = getEditModel();
        AbstractC42651GoZ LJIJ = C86793Y4n.LJIJ(this);
        if (LJIJ != null && (bundle = LJIJ.mArguments) != null && (parcelableArrayList = bundle.getParcelableArrayList("extra_image_model_media_list")) != null) {
            i = parcelableArrayList.size();
        } else {
            i = 0;
        }
        C148325rw.LIZ(i, editModel, "switch_button");
        LLJILJILJ().yI().setValue(Boolean.TRUE);
        View view = this.LJLJLLL;
        if (view != null) {
            view.setSelected(z);
        }
        View view2 = this.LJLL;
        if (view2 == null) {
            return;
        }
        view2.setSelected(!z);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        if (C43863HJj.LIZ() == 1 || C43863HJj.LIZ() == 2 || C43863HJj.LIZ() == 3) {
            View requireViewById = requireViewById(R.id.ho9);
            TuxTextView tuxTextView = (TuxTextView) requireViewById;
            tuxTextView.setSelected(H7R.LJJJJL(getEditModel()));
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS22S0100000_2(this, 25));
            this.LJLJLLL = requireViewById;
            View requireViewById2 = requireViewById(R.id.n6w);
            TuxTextView tuxTextView2 = (TuxTextView) requireViewById2;
            tuxTextView2.setSelected(true ^ H7R.LJJJJL(getEditModel()));
            C16880lQ.LJJJJI(tuxTextView2, new ACListenerS22S0100000_2(this, 26));
            this.LJLL = requireViewById2;
        } else {
            TextView textView = (TextView) requireViewById(R.id.l5n);
            if (H7R.LJJJJL(getEditModel())) {
                i = R.string.fl2;
            } else {
                i = R.string.fl1;
            }
            textView.setText(i);
            C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 27), requireViewById(R.id.kxk));
        }
        ((InterfaceC143655kP) this.LJLJJI.LIZ(this, LJLLI[2])).Zq0().observe(this, new AObserverS70S0100000_2(this, 36));
        LLJILJILJ().Oq0().LIZLLL(this, new AObjectS84S0100000_2(this, 24));
        LLJILJILJ().iZ().LIZLLL(this, new AObjectS84S0100000_2(this, 25));
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        boolean z = true;
        if (C43863HJj.LIZ() != 1 && C43863HJj.LIZ() != 2 && C43863HJj.LIZ() != 3) {
            z = false;
        }
        if (z) {
            View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cdf, container, false);
            o.LJIIIIZZ(LLLLIILL, "{\n            inflater.i…ntainer, false)\n        }");
            return LLLLIILL;
        }
        View LLLLIILL2 = C16880lQ.LLLLIILL(inflater, R.layout.cde, container, false);
        o.LJIIIIZZ(LLLLIILL2, "{\n            inflater.i…ntainer, false)\n        }");
        return LLLLIILL2;
    }
}
