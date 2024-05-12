package com.ss.android.ugc.aweme.detail.prefab;

import X.AbstractC73672Svk;
import X.AnonymousClass636;
import X.C00F;
import X.C16880lQ;
import X.C16950lX;
import X.C188727au;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C73411SrX;
import X.C73969T1h;
import X.C7W1;
import X.C89V;
import X.C8BK;
import X.EV9;
import X.FMX;
import X.HG3;
import X.InterfaceC55235Lm3;
import X.KL2;
import X.O6R;
import X.RBX;
import X.W5F;
import X.W5U;
import X.YAX;
import Y.AfS55S0100000_3;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public class ShootAssem extends DynamicAssem implements PageHeaderScrollAbility {
    public final C62822Ol8 LJLJLLL;
    public YAX LJLL;
    public TuxIconView LJLLI;
    public TextView LJLLILLLL;
    public ViewGroup LJLLJ;
    public View LJLLL;
    public C73411SrX LJLLLL;

    public boolean L3() {
        return false;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.akx;
    }

    public ShootAssem() {
        new LinkedHashMap();
        this.LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 191));
    }

    public final ViewGroup M3() {
        ViewGroup viewGroup = this.LJLLJ;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("startRecordBtn");
        throw null;
    }

    public final TextView N3() {
        TextView textView = this.LJLLILLLL;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("startRecordText");
        throw null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        YAX yax = this.LJLL;
        if (yax != null) {
            yax.stop();
        }
        C73411SrX c73411SrX = this.LJLLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility
    public final void SQ(int i) {
        C73411SrX c73411SrX = this.LJLLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLLLL = (C73411SrX) AbstractC73672Svk.LJJIJIL(Integer.valueOf(i)).LJIIL(300L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS55S0100000_3(this, 11));
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        View view2;
        SmartImageView smartImageView;
        View view3;
        View view4;
        TuxTextView tuxTextView;
        View findViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TextView textView;
        o.LJIIIZ(view, "view");
        assembleChildren();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C7W1 c7w1 = new C7W1(context, C16880lQ.LLZIL(view.getContext()), R.string.dwp);
        ViewGroup viewGroup = (ViewGroup) view;
        View LIZ = C16950lX.LIZ(viewGroup.getContext(), R.layout.biy, viewGroup, false, -1);
        c7w1.LIZLLL = LIZ;
        if (LIZ != null && (textView = (TextView) LIZ.findViewById(R.id.kdj)) != null) {
            textView.setText(c7w1.LIZ.getString(c7w1.LIZJ));
        }
        c7w1.LJ(c7w1.LIZLLL);
        viewGroup.addView(c7w1.LIZLLL);
        if (L3()) {
            String avatarUrl = ((RBX) HG3.LJIILL()).getAvatarUrl();
            o.LJIIIIZZ(avatarUrl, "userService().avatarUrl");
            View view5 = c7w1.LIZLLL;
            if (view5 != null) {
                view2 = view5.findViewById(R.id.jv8);
            } else {
                view2 = null;
            }
            View view6 = c7w1.LIZLLL;
            if (view6 != null) {
                smartImageView = (SmartImageView) view6.findViewById(R.id.jsr);
            } else {
                smartImageView = null;
            }
            View view7 = c7w1.LIZLLL;
            if (view7 != null) {
                view3 = view7.findViewById(R.id.jtc);
            } else {
                view3 = null;
            }
            View view8 = c7w1.LIZLLL;
            if (view8 != null) {
                view4 = view8.findViewById(R.id.abp);
            } else {
                view4 = null;
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view9 = c7w1.LIZLLL;
            if (view9 != null && (findViewById = view9.findViewById(R.id.c8t)) != null) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMargins(0, 0, 0, (int) KL2.LIZJ(c7w1.LIZ, 36.0f));
                } else {
                    marginLayoutParams = null;
                }
                findViewById.setLayoutParams(marginLayoutParams);
            }
            View view10 = c7w1.LIZLLL;
            if (view10 != null && (tuxTextView = (TuxTextView) view10.findViewById(R.id.kdj)) != null) {
                tuxTextView.setTuxFont(102);
            }
            if (C00F.LIZ(31744, 1, "music_share_story_entrance_style", true) == 2) {
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            } else {
                if (smartImageView != null) {
                    smartImageView.setVisibility(0);
                }
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                W5F LJIIIIZZ = W5U.LJIIIIZZ(avatarUrl);
                LJIIIIZZ.LJJIIJ = smartImageView;
                C16880lQ.LLJJJ(LJIIIIZZ);
            }
            int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.dj, c7w1.LIZ);
            C89V c89v = new C89V(KL2.LIZJ(c7w1.LIZ, 4.0f), BlurMaskFilter.Blur.NORMAL, KL2.LIZJ(c7w1.LIZ, 2.0f), AnonymousClass636.LJIIIIZZ(R.attr.ei, c7w1.LIZ));
            if (view2 != null) {
                view2.setBackground(new C8BK(LJIIIIZZ2, c89v));
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "single_song");
            FMX.LJIIL("share_to_story_show", c188727au.LIZ);
        }
        YAX yax = (YAX) c7w1.LIZ((ViewGroup) view);
        this.LJLL = yax;
        yax.start();
        View findViewById2 = view.findViewById(R.id.kdk);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.start_record_video_img)");
        this.LJLLI = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.kdj);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.start_record_title)");
        this.LJLLILLLL = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.kdb);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.start_record)");
        this.LJLLJ = (ViewGroup) findViewById4;
        View findViewById5 = view.findViewById(R.id.jv8);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.share_to_story)");
        this.LJLLL = findViewById5;
        view.setPadding(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(50)));
        N3().setText((String) this.LJLJLLL.getValue());
        TextView N3 = N3();
        N3.measure(0, 0);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJJIII(10));
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJJIII(1));
        int measuredWidth = (N3.getMeasuredWidth() - N3.getPaddingStart()) - N3.getPaddingEnd();
        float textSize = N3.getTextSize();
        for (float measureText = N3.getPaint().measureText(N3.getText().toString()); measureText > measuredWidth && textSize > LJJIIZ; measureText = N3.getPaint().measureText(N3.getText().toString())) {
            N3.setTextSize(0, textSize - LJJIIZ2);
            textSize = N3.getTextSize();
        }
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 0, 42), M3());
        View view11 = this.LJLLL;
        if (view11 != null) {
            C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 1, 42), view11);
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
                C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ, PageHeaderScrollAbility.class, null);
                if (LIZ2 == null) {
                    C55096Ljo.LJIIJJI(LIZJ, this, PageHeaderScrollAbility.class, null);
                    return;
                }
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ2);
                    if (invocationHandler instanceof EV9) {
                        ((EV9) invocationHandler).LIZ.add(this);
                        return;
                    }
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                } catch (IllegalArgumentException unused) {
                    EV9 ev9 = new EV9();
                    ev9.LIZ.add(this);
                    ev9.LIZ.add(LIZ2);
                    Object newProxyInstance = Proxy.newProxyInstance(PageHeaderScrollAbility.class.getClassLoader(), new Class[]{PageHeaderScrollAbility.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, PageHeaderScrollAbility.class, null);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility");
                }
            }
            return;
        }
        o.LJIJI("shareToStoryButton");
        throw null;
    }
}
