package X;

import Y.AgS85S0101000_2;
import android.app.Activity;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.TimeEffectTabFragment;
import com.ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectState;
import com.ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5tG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149145tG extends AbstractC163776bl<FTCEditEffectViewModel> implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final C82632Wbs LJLLI;
    public final C5H3 LJLLILLLL;
    public final C149165tI LJLLJ;
    public C169766lQ LJLLL;

    static {
        TBT tbt = new TBT(C149145tG.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJJIZ() {
        C169766lQ c169766lQ = this.LJLLL;
        if (c169766lQ != null) {
            c169766lQ.LLJILJIL().LJJJJJL.mv0().setValue(Boolean.FALSE);
        }
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        if (this.LJLLL == null) {
            C169766lQ c169766lQ = new C169766lQ();
            Activity activity = this.LJLJLLL.mActivity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C135625Ty c135625Ty = new C135625Ty((ActivityC45651qj) activity, this);
            C169786lS LLJILJIL = c169766lQ.LLJILJIL();
            LLJILJIL.LJJJJL = c135625Ty;
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) C165706es.LJFF(c135625Ty.LIZLLL()).get(EditEffectVideoModel.class);
            LLJILJIL.LJJJJJL = editEffectVideoModel;
            InterfaceC169856lZ interfaceC169856lZ = LLJILJIL.LJJJJL;
            editEffectVideoModel.getClass();
            o.LJIIIZ(interfaceC169856lZ, "<set-?>");
            editEffectVideoModel.LJLJJLL = interfaceC169856lZ;
            this.LJLJLLL.add(this.LJLL, c169766lQ, "FTCEditEffectScene");
            this.LJLLL = c169766lQ;
        }
        C169766lQ c169766lQ2 = this.LJLLL;
        if (c169766lQ2 != null) {
            C169786lS LLJILJIL2 = c169766lQ2.LLJILJIL();
            LLJILJIL2.LJJJJJL.mv0().setValue(Boolean.TRUE);
            if (LLJILJIL2.LIZ.isMultiVideoEdit() && (LLJILJIL2.LJJIJIIJI.LJLL instanceof TimeEffectTabFragment)) {
                LLJILJIL2.LIZIZ.prepare().LJ(new AgS85S0101000_2(0, LLJILJIL2, 1), C10K.LJIIIIZZ, null);
            }
        }
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onCreate() {
        super.onCreate();
        C73156SnQ.LJIIIIZZ(this, LJJLIIIJJI(), new TBT() { // from class: X.5tH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditEffectState) obj).getRemoveTimeEffect();
            }
        }, new AqS184S0100000_2(this, 75));
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<FTCEditEffectViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C149145tG(C82622Wbi diContainer, WMH parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = R.id.fns;
        this.LJLLI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLLILLLL = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLLJ = C149165tI.LJLIL;
    }
}
