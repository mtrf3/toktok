package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C223338pd;
import X.C32151Nz;
import X.C68322mC;
import X.C72242sW;
import X.C76800UCe;
import X.C76820UCy;
import X.C76821UCz;
import X.C79162V5a;
import X.C79227V7n;
import X.EF7;
import X.InterfaceC35811ar;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.V6O;
import X.V6P;
import X.V6V;
import X.V71;
import X.V75;
import X.V7I;
import X.V7J;
import Y.ACListenerS47S0200000_13;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide;
import com.bytedance.android.livesdkapi.depend.model.live.match.TaskPeriodConfig;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public class AqS5S0600000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(V6V it) {
        CharSequence charSequence;
        TextView LIZJ;
        o.LJIIIZ(it, "it");
        ((InterfaceC35811ar) this.l3).setValue(it);
        it.setLayoutParams(new RecyclerView.LayoutParams(-1, ((Context) this.l0).getResources().getDimensionPixelSize(R.dimen.lj)));
        TextView LIZJ2 = C79162V5a.LIZJ((InterfaceC35811ar) this.l4);
        if (LIZJ2 != null) {
            LIZJ2.setText(EF7.LIZIZ().getString(R.string.hve));
        }
        TextView LIZJ3 = C79162V5a.LIZJ((InterfaceC35811ar) this.l4);
        if (LIZJ3 != null) {
            LIZJ3.setGravity(17);
        }
        TextView LIZJ4 = C79162V5a.LIZJ((InterfaceC35811ar) this.l4);
        if (LIZJ4 != null) {
            LIZJ4.setTextColor(-16777216);
        }
        it.setLoadMoreListener$mention_video_release((InterfaceC65784Pro) this.l1);
        TextView LIZJ5 = C79162V5a.LIZJ((InterfaceC35811ar) this.l4);
        if (LIZJ5 != null) {
            C16880lQ.LJIJI(LIZJ5, new ACListenerS47S0200000_13((InterfaceC65784Pro) this.l1, it, 51));
        }
        V6P LIZ = ((V6O) this.l2).LIZ();
        V7I v7i = LIZ.LIZIZ;
        if (v7i instanceof V7J) {
            if (LIZ.LIZ == V75.REFRESH) {
                return;
            }
            TextView LIZJ6 = C79162V5a.LIZJ((InterfaceC35811ar) this.l4);
            ViewGroup.LayoutParams layoutParams = null;
            if (LIZJ6 != null) {
                charSequence = LIZJ6.getText();
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(charSequence, ((Context) this.l0).getString(R.string.pj8)) && (LIZJ = C79162V5a.LIZJ((InterfaceC35811ar) this.l4)) != null) {
                LIZJ.setText(R.string.pj8);
            }
            ViewGroup viewGroup = (ViewGroup) ((InterfaceC35811ar) this.l3).getValue();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            ((C223338pd) ((InterfaceC35811ar) this.l5).getValue()).LIZJ();
            ViewGroup viewGroup2 = (ViewGroup) ((InterfaceC35811ar) this.l3).getValue();
            if (viewGroup2 != null) {
                viewGroup2.addView(C79162V5a.LIZJ((InterfaceC35811ar) this.l4));
            }
            TextView LIZJ7 = C79162V5a.LIZJ((InterfaceC35811ar) this.l4);
            if (LIZJ7 != null) {
                layoutParams = LIZJ7.getLayoutParams();
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            it.setWaitingToLoadMore$mention_video_release(true);
            return;
        }
        if (v7i instanceof C79227V7n) {
            ViewGroup viewGroup3 = (ViewGroup) ((InterfaceC35811ar) this.l3).getValue();
            if (viewGroup3 != null) {
                viewGroup3.removeAllViews();
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C32151Nz.LJIIZILJ(32), (int) C32151Nz.LJIIZILJ(32));
            layoutParams2.gravity = 17;
            ((View) ((InterfaceC35811ar) this.l5).getValue()).setLayoutParams(layoutParams2);
            ViewGroup viewGroup4 = (ViewGroup) ((InterfaceC35811ar) this.l3).getValue();
            if (viewGroup4 != null) {
                viewGroup4.addView((View) ((InterfaceC35811ar) this.l5).getValue());
            }
            ((C223338pd) ((InterfaceC35811ar) this.l5).getValue()).LIZIZ();
            return;
        }
        if (!(v7i instanceof V71)) {
            return;
        }
        o.LJII(v7i, "null cannot be cast to non-null type tiktok.compose.paging.PagingLazyState.LoadingState.Success");
        if (((V71) v7i).LIZ || LIZ.LIZ == V75.REFRESH) {
            return;
        }
        it.setLayoutParams(new RecyclerView.LayoutParams(-1, 0));
        it.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS5S0600000_13 aqS5S0600000_13, Object obj) {
        ImageModel imageModel;
        long j;
        C76820UCy setState = (C76820UCy) obj;
        o.LJIIIZ(setState, "$this$setState");
        C76821UCz c76821UCz = ((C76820UCy) aqS5S0600000_13.l0).LJLL;
        long j2 = ((C72242sW) aqS5S0600000_13.l1).element;
        TaskPeriodConfig taskPeriodConfig = ((BattleBonusConfig) aqS5S0600000_13.l2).taskPeriodConfig;
        if (taskPeriodConfig != null) {
            imageModel = taskPeriodConfig.icon;
        } else {
            imageModel = null;
        }
        if (taskPeriodConfig != null) {
            j = taskPeriodConfig.duration;
        } else {
            j = 30;
        }
        return C76820UCy.LIZIZ(setState, null, 0L, 0, null, 0, 0, null, null, null, C76821UCz.LIZ(c76821UCz, j2, j, ((C72242sW) aqS5S0600000_13.l4).element, (BattlePrompt) ((C68322mC) aqS5S0600000_13.l3).element, 0L, imageModel, (BattleTaskGiftAmountGuide) ((C68322mC) aqS5S0600000_13.l5).element, 112), null, 1535);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS5S0600000_13 aqS5S0600000_13, Object obj) {
        aqS5S0600000_13.invoke$0((V6V) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS5S0600000_13(C76820UCy c76820UCy, C76820UCy c76820UCy2, C72242sW c72242sW, BattleBonusConfig battleBonusConfig, C68322mC<BattlePrompt> c68322mC, C72242sW c72242sW2, C68322mC<BattleTaskGiftAmountGuide> c68322mC2) {
        super(1);
        this.$t = c68322mC2;
        this.l0 = c76820UCy;
        this.l1 = c76820UCy2;
        this.l2 = c72242sW;
        this.l3 = battleBonusConfig;
        this.l4 = c68322mC;
        this.l5 = c72242sW2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS5S0600000_13(Context context, Context context2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, V6O<?> v6o, InterfaceC35811ar<V6V> interfaceC35811ar, InterfaceC35811ar<TextView> interfaceC35811ar2, InterfaceC35811ar<C223338pd> interfaceC35811ar3) {
        super(1);
        this.$t = interfaceC35811ar3;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = interfaceC65784Pro;
        this.l3 = v6o;
        this.l4 = interfaceC35811ar;
        this.l5 = interfaceC35811ar2;
    }
}
