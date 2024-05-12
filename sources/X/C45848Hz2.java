package X;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.VideoRecordFirstFramePerformanceMonitor;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Hz2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45848Hz2 extends WLW implements InterfaceC144185lG {
    public final InterfaceC82086WJm LJLJJI;
    public View LJLJJL;
    public final ShortVideoContext LJLJJLL;
    public C82622Wbi LJLJL;
    public final InterfaceC44312HaG LJLJLJ;
    public final C82622Wbi LJLJLLL;

    @Override // X.WLW, com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.WLW
    public final C82622Wbi getDiContainer() {
        if (this.LJLJL == null) {
            this.LJLJL = C44384HbQ.LJJLIIIJJI(this);
        }
        return this.LJLJL;
    }

    public final boolean LLJJI() {
        C81521Vz3 c81521Vz3;
        if (!getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) || (c81521Vz3 = (C81521Vz3) findSceneByTag("RecordBottomTabScene")) == null) {
            return false;
        }
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = c81521Vz3.LJLJJI;
        if (viewOnTouchListenerC81419VxP != null) {
            if (!TextUtils.equals((CharSequence) viewOnTouchListenerC81419VxP.LIZLLL(viewOnTouchListenerC81419VxP.getCurrentIndex()), getString(R.string.pwa))) {
                return false;
            }
            return true;
        }
        o.LJIJI("tabHost");
        throw null;
    }

    @Override // X.WM7
    public final void onAttach() {
        super.onAttach();
        H7B.LJ("planC onAttach");
        C45685HwP.LIZIZ(requireApplicationContext());
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
        C163756bj.LIZIZ(this).unRegisterActivityResultListener(this);
        H7B.LJ("planC onDestroy");
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("planC onDestroy\n");
        LIZ.append(android.util.Log.getStackTraceString(new Exception()));
        H7B.LJ(X1D.LIZIZ(LIZ));
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        H7B.LJ("planC onResume");
        if (C45869HzN.LIZ()) {
            G8G.LIZ.step(VideoRecordFirstFramePerformanceMonitor.INSTANCE, "PlanC onResume");
        } else {
            G8G.LIZ.end(CameraFirstFramePerformanceMonitor.INSTANCE, "PlanC onResume");
        }
        C45857HzB.LIZIZ(EnumC45860HzE.RECORD_ON_UI_SHOW);
    }

    @Override // X.WM7
    public final void onStart() {
        super.onStart();
        H7B.LJ("planC onStart");
    }

    @Override // X.WLW
    public final C82622Wbi LLJILJIL() {
        return this.LJLJLLL;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        String tag;
        super.onActivityCreated(bundle);
        H7B.LIZ("planC initChildScene");
        V8O scope = C78923UyF.LJIILLIIL(this).getScope();
        C45850Hz4 c45850Hz4 = new C45850Hz4((I37) this.LJLJLLL.LJ(I37.class, null));
        c45850Hz4.LIZIZ = this;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.mActivity;
        o.LJIIIZ(activityC45651qj, "<set-?>");
        c45850Hz4.LIZJ = activityC45651qj;
        ShortVideoContext shortVideoContext = LLJILJILJ().LJLIL;
        o.LJIIIZ(shortVideoContext, "<set-?>");
        c45850Hz4.LIZLLL = shortVideoContext;
        InterfaceC83865Wvl mediaController = ((WLT) this.LJLJLLL.LJ(InterfaceC82086WJm.class, null)).e8().getMediaController();
        o.LJIIIZ(mediaController, "<set-?>");
        c45850Hz4.LJ = mediaController;
        c45850Hz4.LJFF = (InterfaceC82086WJm) this.LJLJLLL.LJ(InterfaceC82086WJm.class, null);
        c45850Hz4.LJI = (I3X) this.LJLJLLL.LJ(I3X.class, null);
        c45850Hz4.LJII = new C45853Hz7(this);
        c45850Hz4.LJIIIIZZ = (WRP) this.LJLJLLL.LJ(WRP.class, null);
        C83576Wr6 e20 = ((WRQ) this.LJLJLLL.LJ(WRQ.class, null)).e20();
        o.LJIIIZ(e20, "<set-?>");
        c45850Hz4.LJIIIZ = e20;
        InterfaceC36571c5 LJIJ = C86793Y4n.LJIJ(this);
        if (LJIJ != null) {
            if (LJIJ instanceof HXW) {
                tag = ((HXW) LJIJ).getTag();
            }
            tag = "";
        } else {
            ComponentCallbacks2 componentCallbacks2 = this.mActivity;
            if (componentCallbacks2 instanceof HXW) {
                tag = ((HXW) componentCallbacks2).getTag();
            }
            tag = "";
        }
        o.LJIIIZ(tag, "<set-?>");
        c45850Hz4.LJIIJ = tag;
        ((HashMap) scope.LIZLLL).put("record_env_context", c45850Hz4);
        C78923UyF.LJIILLIIL(this).LLJILJIL(this, new C45852Hz6(this));
        this.LJLJLJ.LIZ(this);
        C44172HVg.LJIILLIIL.getClass();
        if (!IAX.LIZIZ() && !this.LJLJJLL.LJJIJIIJI()) {
            ((InterfaceC45979I2t) getDiContainer().LJ(InterfaceC45979I2t.class, null)).showBottomTab(false);
        }
        if (AnonymousClass668.LIZ()) {
            AnonymousClass668.LIZIZ().LIZJ(C81184Vtc.LIZJ(this.mActivity));
        }
        AbstractC42651GoZ LJIJ2 = C86793Y4n.LJIJ(this);
        if (LJIJ2 != null) {
            ((BaseScreenAdaptScene) LJIJ2).LLLFFI();
        } else {
            ((AbstractActivityC162676Zz) requireActivity()).LLIILII();
        }
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

    @Override // X.WLW, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        H7B.LIZ("planC => onCreateView start");
        ViewGroup viewGroup2 = (ViewGroup) C16880lQ.LLLLIILL(layoutInflater, R.layout.axb, viewGroup, false);
        this.LJLJJL = viewGroup2.findViewById(R.id.j83);
        C163756bj.LIZIZ(this).registerActivityResultListener(this);
        C45857HzB.LIZ(new FIM());
        G8G.LIZ.step("av_video_record_init", "PlanC onCreateView");
        H7B.LIZ("planC => onCreateView end");
        return viewGroup2;
    }

    public C45848Hz2(ShortVideoContext shortVideoContext, Bundle bundle, C82622Wbi c82622Wbi, InterfaceC44312HaG interfaceC44312HaG) {
        this.LJLJJLL = shortVideoContext;
        this.LJLJJI = (InterfaceC82086WJm) c82622Wbi.LJ(InterfaceC82086WJm.class, null);
        this.LJLJLLL = c82622Wbi;
        this.LJLJLJ = interfaceC44312HaG;
        if (bundle != null) {
            this.mArguments = bundle;
        }
    }
}
