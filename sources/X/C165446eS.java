package X;

import Y.AObjectS84S0100000_2;
import androidx.lifecycle.LiveData;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.views.InterceptorFrameLayout;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.6eS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165446eS extends AbstractC48231ut<C6E4, C165496eX, C165506eY, TMC> implements InterfaceC135635Tz, C6E4 {
    public static final C165516eZ LJLZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZ;
    public final InterceptorFrameLayout LJLL;
    public final C82622Wbi LJLLI;
    public final InterfaceC65784Pro<C165506eY> LJLLILLLL;
    public final InterfaceC65784Pro<TMC> LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public boolean LJLLLLLL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.6eZ] */
    static {
        TBT tbt = new TBT(C165446eS.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJZ = new InterfaceC74236TBo[]{tbt, new TBT(C165446eS.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};
        LJLZ = new Object() { // from class: X.6eZ
        };
    }

    private final VideoPublishEditModel LJLZ() {
        return (VideoPublishEditModel) this.LJLLL.LIZ(this, LJZ[0]);
    }

    private final InterfaceC143655kP LJZI() {
        return (InterfaceC143655kP) this.LJLLLL.LIZ(this, LJZ[1]);
    }

    @Override // X.C6E4
    public boolean Km0() {
        Keva repo = Keva.getRepo("recommend_effect_guide_keva");
        if (repo.contains("recommend_effect_guide_count") && repo.getBoolean("recommend_effect_guide_count", false)) {
            return false;
        }
        return true;
    }

    @Override // X.C6E4
    public void re0() {
        Keva.getRepo("recommend_effect_guide_keva").storeBoolean("recommend_effect_guide_count", true);
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        LiveData<OSJ<Boolean, Boolean, Boolean>> Zq0;
        super.onCreate();
        InterceptorFrameLayout interceptorFrameLayout = this.LJLL;
        if (interceptorFrameLayout != null) {
            interceptorFrameLayout.setInterceptListener(new AqS168S0100000_2(this, 251));
        }
        InterfaceC143655kP LJZI = LJZI();
        if (LJZI != null && (Zq0 = LJZI.Zq0()) != null) {
            Zq0.observe(this, new AObjectS84S0100000_2(this, 148));
        }
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C165506eY> LJJLIIIJJI() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<TMC> LJJLIIIJJIZ() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    @Override // X.C6E4
    public void Ke0(boolean z) {
        if (this.LJLLLLLL) {
            LJJZZI(new AqS7S0010000_2(z, 29));
            if (z) {
                Keva.getRepo("recommend_effect_guide_keva").storeBoolean("recommend_effect_guide_count", true);
                VideoPublishEditModel model = LJLZ();
                o.LJIIIZ(model, "model");
                C77357UXp.LJJIL("swipe_for_more_effects_popup", C77357UXp.LJIIIIZZ(model));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165446eS(WMH parentScene, InterceptorFrameLayout interceptorFrameLayout, C82622Wbi diContainer, InterfaceC65784Pro<C165506eY> defaultStates, InterfaceC65784Pro<TMC> sceneActions) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(defaultStates, "defaultStates");
        o.LJIIIZ(sceneActions, "sceneActions");
        this.LJLL = interceptorFrameLayout;
        this.LJLLI = diContainer;
        this.LJLLILLLL = defaultStates;
        this.LJLLJ = sceneActions;
        this.LJLLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLLLL = UCI.LJII(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLLLLLL = true;
    }

    public /* synthetic */ C165446eS(WMH wmh, InterceptorFrameLayout interceptorFrameLayout, C82622Wbi c82622Wbi, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wmh, (i & 2) != 0 ? null : interceptorFrameLayout, c82622Wbi, (i & 8) != 0 ? C165466eU.LJLIL : interfaceC65784Pro, (i & 16) != 0 ? C165456eT.LJLIL : interfaceC65784Pro2);
    }
}
