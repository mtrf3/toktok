package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.servicimpl.PageFactoryDelegate;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Hz3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45849Hz3 extends WLX implements InterfaceC144185lG {
    public View LJLJJI;
    public C82622Wbi LJLJJL;

    @Override // X.WLX, com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final LiveData<Float> getZoomEvent() {
        return null;
    }

    @Override // X.WLX
    public final C82622Wbi getDiContainer() {
        if (this.LJLJJL == null) {
            this.LJLJJL = C44384HbQ.LJJLIIIJJI(this);
        }
        return this.LJLJJL;
    }

    @Override // X.WM7
    public final void onAttach() {
        super.onAttach();
        C45685HwP.LIZIZ(requireApplicationContext());
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
        ((FTCVideoRecordNewActivity) requireActivity()).unRegisterActivityResultListener(this);
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        G8G.LIZ.end("av_video_record_init", "PlanC onResume");
        C45857HzB.LIZIZ(EnumC45860HzE.RECORD_ON_UI_SHOW);
    }

    public C45849Hz3(Intent intent) {
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null) {
            this.mArguments = LLJJIJI;
        }
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        V8O scope = C78923UyF.LJIILLIIL(this).getScope();
        Activity activity = this.mActivity;
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) activity;
        C45850Hz4 c45850Hz4 = new C45850Hz4(fTCVideoRecordNewActivity.LLIILII);
        c45850Hz4.LIZIZ = this;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) activity;
        o.LJIIIZ(activityC45651qj, "<set-?>");
        c45850Hz4.LIZJ = activityC45651qj;
        if (this.LJLIL == null) {
            this.LJLIL = (ShortVideoContextViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class);
        }
        ShortVideoContext shortVideoContext = this.LJLIL.LJLIL;
        o.LJIIIZ(shortVideoContext, "<set-?>");
        c45850Hz4.LIZLLL = shortVideoContext;
        InterfaceC83865Wvl mediaController = fTCVideoRecordNewActivity.LLIIJI.e8().getMediaController();
        o.LJIIIZ(mediaController, "<set-?>");
        c45850Hz4.LJ = mediaController;
        WRQ wrq = fTCVideoRecordNewActivity.LLIIJI;
        o.LJIIIZ(wrq, "<set-?>");
        c45850Hz4.LJFF = wrq;
        I3X i3x = fTCVideoRecordNewActivity.LLIIJLIL;
        o.LJIIIZ(i3x, "<set-?>");
        c45850Hz4.LJI = i3x;
        c45850Hz4.LJII = new HZK(fTCVideoRecordNewActivity);
        c45850Hz4.LJIIIIZZ = (WRP) fTCVideoRecordNewActivity.LJLLI.LJ(WRP.class, null);
        C83576Wr6 c83576Wr6 = fTCVideoRecordNewActivity.LJLLLLLL;
        o.LJIIIZ(c83576Wr6, "<set-?>");
        c45850Hz4.LJIIIZ = c83576Wr6;
        c45850Hz4.LJIIJ = "VideoRecordNewActivity";
        ((HashMap) scope.LIZLLL).put("record_env_context", c45850Hz4);
        C78923UyF.LJIILLIIL(this).LLJILJIL(this, new C45851Hz5(this));
        InterfaceC45854Hz8 LIZ = PageFactoryDelegate.LIZIZ().LIZ(null);
        if (LIZ != null) {
            LIZ.LIZ(this);
        }
        ((AbstractActivityC162676Zz) requireActivity()).LLIILII();
    }

    @Override // X.InterfaceC144185lG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        InterfaceC45999I3n interfaceC45999I3n = (InterfaceC45999I3n) getDiContainer().LJIIIIZZ(null, InterfaceC45999I3n.class);
        if (interfaceC45999I3n != null) {
            interfaceC45999I3n.onActivityResult(i, i2, intent);
            return false;
        }
        return false;
    }

    @Override // X.WLX, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        H7B.LIZ("planC => onCreateView start");
        ViewGroup viewGroup2 = (ViewGroup) C16880lQ.LLLLIILL(layoutInflater, R.layout.az1, viewGroup, false);
        this.LJLJJI = viewGroup2.findViewById(R.id.j83);
        ((FTCVideoRecordNewActivity) this.mActivity).registerActivityResultListener(this);
        G8G.LIZ.step("av_video_record_init", "PlanC onCreateView");
        H7B.LIZ("planC => onCreateView end");
        return viewGroup2;
    }
}
