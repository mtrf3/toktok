package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JAh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48723JAh extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends Integer>, C76800UCe> {
    public static final C48723JAh LJLIL = new C48723JAh();

    public C48723JAh() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MidAdCellComponent midAdCellComponent, C43I<? extends Integer> c43i) {
        EnumC223268pW enumC223268pW;
        Activity LJIJJ;
        View findViewById;
        MidAdCellComponent selectSubscribe = midAdCellComponent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            Aweme m114clone = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().m114clone();
            o.LJIIIIZZ(m114clone, "item.aweme.clone()");
            if ((C1DJ.LJIJJLI(m114clone) && !JAY.LIZ(m114clone.getAid())) || C1DJ.LJJ(m114clone)) {
                selectSubscribe.A4().kv0(m114clone);
            }
            if (C1DJ.LJIJJLI(m114clone) && JAY.LIZ(m114clone.getAid())) {
                selectSubscribe.B4();
            }
            IMidAdAbility z4 = selectSubscribe.z4();
            if (z4 != null) {
                z4.mC(m114clone);
            }
            ViewGroup.LayoutParams layoutParams = selectSubscribe.r4().getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            IAutoAScrollAbility iAutoAScrollAbility = (IAutoAScrollAbility) selectSubscribe.LLIIIILZ.getValue();
            if (iAutoAScrollAbility != null) {
                enumC223268pW = iAutoAScrollAbility.dl();
            } else {
                enumC223268pW = null;
            }
            if (enumC223268pW == EnumC223268pW.AUTO_SCROLL_STATE_START && !selectSubscribe.LLIIZ) {
                Context context = selectSubscribe.getContext();
                if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && (findViewById = LJIJJ.findViewById(R.id.aan)) != null) {
                    layoutParams2.topMargin = findViewById.getHeight() + ((int) KL2.LIZJ(selectSubscribe.getContext(), 8.0f)) + layoutParams2.topMargin;
                }
                selectSubscribe.LLIIZ = true;
            }
            selectSubscribe.r4().setLayoutParams(layoutParams2);
        }
        return C76800UCe.LIZ;
    }
}
