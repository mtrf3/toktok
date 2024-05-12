package com.ss.android.ugc.aweme.feed.assem.friendstab;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C17N;
import X.C188787b0;
import X.C19N;
import X.C2068389v;
import X.C210288Nc;
import X.C214348b8;
import X.C29701Eo;
import X.C32151Nz;
import X.C45804HyK;
import X.C51029K0z;
import X.C54029LIj;
import X.C5H3;
import X.C61447O9r;
import X.C65352Pkq;
import X.C72972SkS;
import X.C7MY;
import X.C8YN;
import X.FMX;
import X.LFH;
import X.LJK;
import X.LXS;
import X.LXU;
import X.O6R;
import X.OSZ;
import X.QD3;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS61S0000000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class BackToFYPGuideAssem extends FeedBaseAssem<BackToFYPGuideAssem> {
    public final C5H3 LLFFF;
    public C29701Eo LLFII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ab3;
    }

    public BackToFYPGuideAssem() {
        new LinkedHashMap();
        this.LLFFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C210288Nc.INSTANCE);
    }

    public final void LJLLL() {
        if (getContainerView().getVisibility() == 0) {
            C54029LIj.LIZIZ.LJJIII();
            C29701Eo c29701Eo = this.LLFII;
            if (c29701Eo != null) {
                c29701Eo.cancelAnimation();
            }
            C17N.LJJIIJZLJL(getContainerView());
            LXS LIZ = LXU.LIZ();
            if (LIZ == null) {
                return;
            }
            LIZ.LIZLLL(false);
        }
    }

    public final boolean p4() {
        String str;
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        return o.LJ(str, C54029LIj.LIZIZ.LJ());
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem, X.C8XO
    public final void unBind() {
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        o.LJIIIZ(item, "item");
        EventBus.LIZJ().LJIILJJIL(this);
        View containerView = getContainerView();
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 205), getContainerView());
        View findViewById = containerView.findViewById(R.id.n25);
        if (findViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            Integer LIZIZ = C19N.LIZIZ(findViewById, "context", R.attr.d4);
            if (LIZIZ != null) {
                i = LIZIZ.intValue();
            } else {
                i = 0;
            }
            gradientDrawable.setColors(new int[]{0, i});
            findViewById.setBackground(gradientDrawable);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) containerView.findViewById(R.id.bc_);
        if (constraintLayout != null) {
            C16880lQ.LJIL(constraintLayout, new ACListenerS38S0200000_3(this, containerView, 64));
        }
        TuxTextView tuxTextView = (TuxTextView) containerView.findViewById(R.id.auy);
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS38S0200000_3(this, containerView, 65));
            if (C54029LIj.LIZIZ.LJJIJL()) {
                tuxTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_arrow_left_ltr;
                c2068389v.LIZIZ = C7MY.LIZIZ(18);
                c2068389v.LIZJ = C7MY.LIZIZ(18);
                c2068389v.LIZLLL = C72972SkS.LIZJ(tuxTextView, "context", R.attr.do);
                Context context = tuxTextView.getContext();
                o.LJIIIIZZ(context, "context");
                tuxTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(c2068389v.LIZ(context), (Drawable) null, (Drawable) null, (Drawable) null);
                tuxTextView.setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            }
        }
        if (C61447O9r.LJIIIZ || LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL() != 0) {
            int i2 = C61447O9r.LJIIJ;
            ViewGroup.LayoutParams layoutParams = containerView.findViewById(R.id.g6h).getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i2 + 16)));
            }
        }
        C29701Eo c29701Eo = (C29701Eo) containerView.findViewById(R.id.g_z);
        this.LLFII = c29701Eo;
        if (c29701Eo == null) {
            return;
        }
        c29701Eo.setRepeatCount(-1);
    }

    @QD3
    public final void onRefreshEvent(LJK event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 3) {
            LJLLL();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (!(getContainerView() instanceof FrameLayout)) {
            return;
        }
        C8YN.LJII(this, (AssemViewModel) this.LLFFF.getValue(), new TBT() { // from class: X.8sM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, new AqS61S0000000_3(this, 0), 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFFF.getValue(), new TBT() { // from class: X.8sN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, new AqS61S0000000_3(this, 1), 6);
    }

    public final void q4(String str) {
        OSZ osz;
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("homepage_friends", "enter_from");
        oszArr[1] = new OSZ(str, "action_type");
        if (C54029LIj.LIZIZ.LJJIJL()) {
            osz = new OSZ(1, "is_top_tab");
        } else {
            osz = new OSZ(0, "is_top_tab");
        }
        oszArr[2] = osz;
        FMX.LJIILL("homepage_return_guide", oszArr);
    }

    public final void r4(View view) {
        LJLLL();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            C188787b0 c188787b0 = Hox.LJLLI;
            Hox LIZ = c188787b0.LIZ(LJJIFFI);
            Bundle bundle = new Bundle();
            bundle.putString("fromStart", "MainPage");
            LIZ.Cv0(bundle, "HOME");
            Hox LIZ2 = c188787b0.LIZ(LJJIFFI);
            Bundle bundle2 = new Bundle();
            bundle2.putString("fromStart", "MainPage");
            LIZ2.Cv0(bundle2, "For You");
        }
        q4("click_button");
    }
}
