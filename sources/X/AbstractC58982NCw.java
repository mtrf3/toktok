package X;

import Y.ARunnableS14S0400000_10;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentBusinessAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NCw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC58982NCw implements NC9 {
    public final AnoleComponentModel LJLIL;
    public final Aweme LJLILLLLZI;
    public final InterfaceC58979NCt LJLJI;
    public final Context LJLJJI;
    public final String LJLJJL;
    public C58958NBy LJLJJLL;
    public ViewGroup LJLJL;
    public View LJLJLJ;
    public ND9 LJLJLLL;
    public AnimatorSet LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public InterfaceC58980NCu LJLLL;

    @Override // X.NC9
    public void LIZ() {
    }

    @Override // X.NC9
    public void LIZJ() {
        this.LJLJL = null;
        LJIIJ();
        this.LJLLL = null;
        LJII();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unmount, component_hash: ");
        LIZ.append(hashCode());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.NC9
    public void LJFF() {
    }

    @Override // X.NC9
    public void Q0(NCI event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.NC9
    public void clear() {
    }

    @Override // X.NC9
    public abstract C58983NCx isReady();

    public final void LJIIIZ() {
        InterfaceC58980NCu interfaceC58980NCu;
        if (!this.LJLLI) {
            return;
        }
        this.LJLLI = false;
        View view = this.LJLJLJ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLJLJ;
        if (view2 != null) {
            ND8.LJII(view2);
        }
        this.LJLLJ++;
        AnoleComponentLayoutModel layout = this.LJLIL.getLayout();
        if (layout == null || layout.getLeft() >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || (interfaceC58980NCu = this.LJLLL) == null) {
            return;
        }
        interfaceC58980NCu.LIZ(this.LJLIL.getSlotID(), 0, null, null, null);
    }

    public void LJIIJ() {
        AnimatorSet animatorSet = this.LJLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LJLL = null;
        View view = this.LJLJLJ;
        if (view != null) {
            ND8.LJII(view);
        }
        ViewGroup viewGroup = this.LJLJL;
        if (viewGroup != null && viewGroup.getChildCount() == 0) {
            viewGroup.setVisibility(8);
        }
        LJIIIZ();
        this.LJLJLLL = null;
        this.LJLLILLLL = 0;
        this.LJLLJ = 0;
    }

    public static final Activity LJI() {
        ActivityC45651qj activityC45651qj;
        MainActivityScope LJJLIIIJJI;
        MainBusinessAbility LJIJJLI;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null && (topActivity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) topActivity) != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(activityC45651qj)) != null && (LJIJJLI = C1JD.LJIJJLI(LJJLIIIJJI)) != null && LJIJJLI.D30(activityC45651qj)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getActivity() is this = ");
            LIZ.append(activityC45651qj);
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
            return activityC45651qj;
        }
        C242549fW.LIZ("getActivity() is empty");
        return null;
    }

    @Override // X.NC9
    public final AnoleComponentModel J0() {
        return this.LJLIL;
    }

    @Override // X.NC9
    public void LIZIZ() {
        LJIIJ();
    }

    public String LJII() {
        return this.LJLJJL;
    }

    @Override // X.NC9
    public final void L0(AnoleComponentAppearModel appearModel) {
        View view;
        ViewGroup viewGroup;
        o.LJIIIZ(appearModel, "appearModel");
        if (!this.LJLLI || (view = this.LJLJLJ) == null || (viewGroup = this.LJLJL) == null) {
            return;
        }
        AnimatorSet animatorSet = this.LJLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LJLL = null;
        if (C78950Uyg.LIZJ(appearModel)) {
            viewGroup.post(new ARunnableS14S0400000_10(view, viewGroup, appearModel, this, 7));
        } else {
            LJIIIZ();
        }
        this.LJLJI.LJIIIIZZ(NC3.LIZ, this);
        LJIIIIZZ(appearModel);
        LJII();
        C242549fW.LIZ("hide success");
    }

    public void LIZLLL(AnoleComponentAppearModel appearModel) {
        o.LJIIIZ(appearModel, "appearModel");
        this.LJLJI.LJIIIIZZ(NC4.LIZ, this);
        LJIIIIZZ(appearModel);
        this.LJLLILLLL++;
        LJII();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("show success, component_hash: ");
        LIZ.append(hashCode());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }

    public void LJ(String str) {
        this.LJLJI.LJIIIIZZ(new C58957NBx(str), this);
        this.LJLLILLLL++;
    }

    public final void LJIIIIZZ(AnoleComponentAppearModel anoleComponentAppearModel) {
        List<AnoleComponentBusinessAppearModel> showBusinessComponents = anoleComponentAppearModel.getShowBusinessComponents();
        if (showBusinessComponents == null) {
            showBusinessComponents = C61878OQg.INSTANCE;
        }
        List<AnoleComponentBusinessAppearModel> hideBusinessComponents = anoleComponentAppearModel.getHideBusinessComponents();
        if (hideBusinessComponents == null) {
            hideBusinessComponents = C61878OQg.INSTANCE;
        }
        if (showBusinessComponents.isEmpty() && hideBusinessComponents.isEmpty()) {
            return;
        }
        this.LJLJI.LJIIIIZZ(new C58956NBw(new C76512zP(showBusinessComponents, hideBusinessComponents)), this);
    }

    @Override // X.NC9
    public final boolean M0(AnoleComponentAppearModel appearModel) {
        o.LJIIIZ(appearModel, "appearModel");
        Integer repeatCount = appearModel.getRepeatCount();
        if (repeatCount == null) {
            return false;
        }
        if (this.LJLLJ < repeatCount.intValue()) {
            return false;
        }
        return true;
    }

    @Override // X.NC9
    public final void N0(AnoleComponentAppearModel appearModel) {
        InterfaceC58980NCu interfaceC58980NCu;
        o.LJIIIZ(appearModel, "appearModel");
        if (this.LJLLI) {
            LJII();
            C242549fW.LIZ("show failed because isShowing");
            return;
        }
        ViewGroup viewGroup = this.LJLJL;
        if (viewGroup == null) {
            LJ("mount_view_empty");
            LJII();
            C242549fW.LIZ("show failed because containerView is empty");
            return;
        }
        View view = this.LJLJLJ;
        if (view == null) {
            LJ("content_view_empty");
            LJII();
            C242549fW.LIZ("show failed because contentView is null");
            return;
        }
        C58983NCx isReady = isReady();
        if (!isReady.LIZ) {
            LJ(isReady.LIZIZ);
            LJII();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("show failed because ");
            LIZ.append(isReady.LIZIZ);
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
            return;
        }
        AnimatorSet animatorSet = this.LJLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LJLL = null;
        ND8.LJII(view);
        viewGroup.addView(view);
        viewGroup.setVisibility(0);
        view.setVisibility(8);
        AnoleComponentLayoutModel layout = this.LJLIL.getLayout();
        if (layout != null) {
            double left = layout.getLeft();
            if (left < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && (interfaceC58980NCu = this.LJLLL) != null) {
                interfaceC58980NCu.LIZ(this.LJLIL.getSlotID(), Integer.valueOf((int) left), null, null, null);
            }
        }
        viewGroup.post(new ARunnableS14S0400000_10(view, viewGroup, appearModel, this, 8));
    }

    @Override // X.NC9
    public final void O0(EnumC35488DwK precondition) {
        o.LJIIIZ(precondition, "precondition");
        this.LJLLILLLL++;
        C79057V0z.LJJJLL(this, precondition.getFailReason(), null);
        LJII();
        C242549fW.LIZ("show failed because unfulfilledShowPreconditions");
    }

    @Override // X.NC9
    public final boolean P0(AnoleComponentAppearModel appearModel) {
        o.LJIIIZ(appearModel, "appearModel");
        Integer repeatCount = appearModel.getRepeatCount();
        if (repeatCount == null) {
            return false;
        }
        if (this.LJLLILLLL < repeatCount.intValue()) {
            return false;
        }
        return true;
    }

    @Override // X.NC9
    public void K0(ViewGroup viewGroup, InterfaceC58980NCu interfaceC58980NCu) {
        Object obj;
        this.LJLJL = viewGroup;
        this.LJLLL = interfaceC58980NCu;
        LJII();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mount, containerView.tag:");
        if (viewGroup != null) {
            obj = viewGroup.getTag();
        } else {
            obj = null;
        }
        LIZ.append(obj);
        LIZ.append(", component_hash: ");
        LIZ.append(hashCode());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }

    public AbstractC58982NCw(AnoleComponentModel anoleComponentModel, Aweme awemeModel, InterfaceC58979NCt delegate, Context context) {
        o.LJIIIZ(awemeModel, "awemeModel");
        o.LJIIIZ(delegate, "delegate");
        o.LJIIIZ(context, "context");
        this.LJLIL = anoleComponentModel;
        this.LJLILLLLZI = awemeModel;
        this.LJLJI = delegate;
        this.LJLJJI = context;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnoleComponent,type:");
        LIZ.append(anoleComponentModel.getType());
        this.LJLJJL = X1D.LIZIZ(LIZ);
    }
}
