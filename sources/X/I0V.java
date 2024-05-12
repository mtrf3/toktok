package X;

import Y.AObjectS86S0100000_7;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class I0V implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public final ActivityC45651qj LJLIL;
    public final InterfaceC83624Wrs LJLILLLLZI;
    public final I0N LJLJI;
    public final C83576Wr6 LJLJJI;
    public final C45922I0o LJLJJL;
    public final C82622Wbi LJLJJLL;
    public final LifecycleOwner LJLJL;
    public final C82632Wbs LJLJLJ;
    public boolean LJLJLLL;
    public Effect LJLL;
    public int LJLLI;
    public final InterfaceC82086WJm LJLLILLLL;
    public String LJLLJ;
    public final C73318Sq2 LJLLL;
    public final AObjectS86S0100000_7 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final I0Y LJZ;

    static {
        TBT tbt = new TBT(I0V.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJLL;
    }

    public static boolean LIZ(Effect effect) {
        boolean z = false;
        if (effect == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(effect.getSdkExtra());
            z = jSONObject.optBoolean("effect_exclusive", false);
            C45911I0d c45911I0d = InterfaceC45921I0n.LJJZZI;
            int optInt = jSONObject.optInt("appearance_duration", 3000);
            c45911I0d.getClass();
            C45911I0d.LIZIZ = optInt;
            return z;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return z;
        }
    }

    public final void LIZIZ(int i, Effect effect) {
        String str;
        if (((WLT) this.LJLJJLL.LJ(InterfaceC82086WJm.class, null)).zZ().mDurings.size() == 0) {
            DuetContext duetContext = ((ShortVideoContextViewModel) ((ViewModelProvider) this.LJLLLLLL.getValue()).get(ShortVideoContextViewModel.class)).LJLIL.cameraComponentModel.duetContext;
            DuetLayoutBean LIZIZ = EHI.LIZIZ(effect);
            if (LIZIZ == null || LIZIZ.safetyStatus.size() <= i) {
                str = "";
            } else {
                str = (String) ListProtector.get(LIZIZ.safetyStatus, i);
            }
            duetContext.duetLayout = str;
            duetContext.duetLayoutMode = EHI.LIZJ(effect);
            duetContext.layoutDirection = i;
        }
    }

    public static void LIZJ(I0V i0v, BaseJediViewModel baseJediViewModel, LifecycleOwner lifecycleOwner, TBT tbt, InterfaceC88472Yns interfaceC88472Yns) {
        i0v.LJLLL.LIZ(baseJediViewModel.Iv0(lifecycleOwner, tbt, new C73165SnZ(), interfaceC88472Yns));
    }

    public I0V(ActivityC45651qj activity, InterfaceC83624Wrs asCameraView, I0N i0n, C83576Wr6 videoRecorder, C45922I0o c45922I0o, C82622Wbi diContainer, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(asCameraView, "asCameraView");
        o.LJIIIZ(videoRecorder, "videoRecorder");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = activity;
        this.LJLILLLLZI = asCameraView;
        this.LJLJI = i0n;
        this.LJLJJI = videoRecorder;
        this.LJLJJL = c45922I0o;
        this.LJLJJLL = diContainer;
        this.LJLJL = lifecycleOwner;
        this.LJLJLJ = UCI.LJI(diContainer, WLB.class, null);
        this.LJLLILLLL = (InterfaceC82086WJm) diContainer.LJ(InterfaceC82086WJm.class, null);
        this.LJLLJ = "";
        this.LJLLL = new C73318Sq2();
        this.LJLLLL = new AObjectS86S0100000_7(this, 264);
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 713));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 714));
        this.LJLZ = LIZIZ;
        this.LJZ = new I0Y(this);
        JediViewModel LIZ = ((C165626ek) LIZIZ.getValue()).LIZ(ChangeDuetLayoutViewModel.class);
        o.LJIIIIZZ(LIZ, "jediViewModelProvider.ge…outViewModel::class.java)");
        LIZJ(this, (BaseJediViewModel) LIZ, lifecycleOwner, new TBT() { // from class: X.I0b
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ChangeDuetLayoutState) obj).getEffect();
            }
        }, new AqS173S0100000_7(this, 409));
        JediViewModel LIZ2 = ((C165626ek) LIZIZ.getValue()).LIZ(ChangeDuetLayoutViewModel.class);
        o.LJIIIIZZ(LIZ2, "jediViewModelProvider.ge…outViewModel::class.java)");
        LIZJ(this, (BaseJediViewModel) LIZ2, lifecycleOwner, new TBT() { // from class: X.I0f
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ChangeDuetLayoutState) obj).getLayoutDirection();
            }
        }, new AqS173S0100000_7(this, 410));
        JediViewModel LIZ3 = ((C165626ek) LIZIZ.getValue()).LIZ(ChangeDuetLayoutViewModel.class);
        o.LJIIIIZZ(LIZ3, "jediViewModelProvider\n  …outViewModel::class.java)");
        LIZJ(this, (BaseJediViewModel) LIZ3, lifecycleOwner, new TBT() { // from class: X.I0h
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ChangeDuetLayoutState) obj).getExitDuetMode();
            }
        }, new AqS173S0100000_7(this, 407));
    }
}
