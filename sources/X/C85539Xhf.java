package X;

import Y.ACListenerS35S0100000_15;
import Y.ACListenerS55S0000000_15;
import Y.ARunnableS33S0200000_14;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import o3.IDaS471S0100000_14;
import o3.h0;

/* renamed from: X.Xhf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85539Xhf extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<C85542Xhi> LJLIL;
    public int LJLILLLLZI;
    public final boolean LJLJI;
    public final SignupViewModel LJLJJI;
    public InterfaceC85563Xi3 LJLJJL;
    public final java.util.Set<Integer> LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        EnumC85544Xhk enumC85544Xhk;
        C85542Xhi c85542Xhi = (C85542Xhi) ORZ.LJLLLLLL(i, this.LJLIL);
        if (o.LJ(c85542Xhi, C85554Xhu.LJIIJ)) {
            return 0;
        }
        if (o.LJ(c85542Xhi, C85548Xho.LJIIJ)) {
            return 11;
        }
        if (o.LJ(c85542Xhi, C85550Xhq.LJIIJ)) {
            return 12;
        }
        if (o.LJ(c85542Xhi, C85556Xhw.LJIIJ)) {
            return 14;
        }
        if (o.LJ(c85542Xhi, C85552Xhs.LJIIJ)) {
            return 15;
        }
        if (o.LJ(c85542Xhi, C85555Xhv.LJIIJ)) {
            return 4;
        }
        if (o.LJ(c85542Xhi, C85547Xhn.LJIIJ)) {
            return 3;
        }
        if (o.LJ(c85542Xhi, C85557Xhx.LJIIJ)) {
            return 2;
        }
        if (o.LJ(c85542Xhi, C85558Xhy.LJIIJ)) {
            return 13;
        }
        if (o.LJ(c85542Xhi, C85551Xhr.LJIIJ)) {
            return 5;
        }
        if (o.LJ(c85542Xhi, C85549Xhp.LJIIJ)) {
            return 6;
        }
        if (o.LJ(c85542Xhi, C85553Xht.LJIIJ)) {
            return 10;
        }
        if (c85542Xhi instanceof C85541Xhh) {
            return 7;
        }
        if (c85542Xhi != null && (enumC85544Xhk = c85542Xhi.LJFF) != null) {
            int i2 = C85543Xhj.LIZ[enumC85544Xhk.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return 8;
                }
            } else {
                return 9;
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        int i2;
        o.LJIIIZ(holder, "holder");
        int i3 = 0;
        if (getItemViewType(i) == 1) {
            C85540Xhg c85540Xhg = (C85540Xhg) holder;
            C85542Xhi loginItem = (C85542Xhi) ListProtector.get(this.LJLIL, i);
            II3 ii3 = new II3(this.LJLJJLL.contains(Integer.valueOf(i)), ((i - this.LJLILLLLZI) - 1) * 50);
            o.LJIIIZ(loginItem, "loginItem");
            TuxIconView tuxIconView = c85540Xhg.LJLILLLLZI;
            int i4 = loginItem.LIZ;
            if (i4 == R.raw.icon_person_fill) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = i4;
                c2068389v.LIZIZ = C7MY.LIZIZ(18);
                c2068389v.LIZJ = C7MY.LIZIZ(18);
                tuxIconView.setTuxIcon(c2068389v);
            } else {
                tuxIconView.setIconRes(i4);
            }
            C16880lQ.LJIIJ(loginItem.LJIIIIZZ, c85540Xhg.LJLIL);
            h0.LJIJI(c85540Xhg.LJLIL, new IDaS471S0100000_14(c85540Xhg, 5));
            if (ii3.LJLIL) {
                c85540Xhg.LJLIL.setAlpha(0.0f);
            } else {
                c85540Xhg.LJLIL.setAlpha(1.0f);
            }
            if (loginItem.LJII) {
                c85540Xhg.LJLJI.setBackground(C04270Et.LIZIZ(c85540Xhg.LJLIL.getContext(), R.drawable.wh));
            }
            if (loginItem.LIZLLL) {
                TextView textView = c85540Xhg.LJLJJI;
                Context context = c85540Xhg.LJLIL.getContext();
                o.LJIIIIZZ(context, "item.context");
                textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, context));
                c85540Xhg.LJLILLLLZI.setColorFilter(C1EU.LIZ(c85540Xhg.LJLIL, "item.context", R.attr.cl), PorterDuff.Mode.SRC_IN);
                if (!(c85540Xhg.LJLJI.getLayoutParams() instanceof RecyclerView.LayoutParams)) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = c85540Xhg.LJLJI.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
                if (loginItem.LJII) {
                    c85540Xhg.LJLJI.setBackground(C04270Et.LIZIZ(c85540Xhg.LJLIL.getContext(), R.drawable.wx));
                } else {
                    c85540Xhg.LJLJI.setBackground(C04270Et.LIZIZ(c85540Xhg.LJLIL.getContext(), R.drawable.ww));
                }
            }
            String string = c85540Xhg.LJLIL.getContext().getString(loginItem.LIZJ);
            o.LJIIIIZZ(string, "item.context.getString(loginItem.txtRes)");
            c85540Xhg.LJLJJI.setText(string);
            if (KL2.LIZJ(c85540Xhg.LJLIL.getContext(), 96.0f) + c85540Xhg.LJLJJI.getPaint().measureText(string) > c85540Xhg.LJLJJLL) {
                ViewGroup.LayoutParams layoutParams2 = c85540Xhg.LJLJJI.getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                C018905p c018905p = (C018905p) layoutParams2;
                c018905p.matchConstraintDefaultHeight = 0;
                if (loginItem.LIZ == 0) {
                    c018905p.startToStart = 0;
                } else {
                    c018905p.startToEnd = R.id.e_q;
                    c018905p.startToStart = -1;
                }
                c018905p.setMarginStart((int) KL2.LIZJ(c85540Xhg.LJLIL.getContext(), 12.0f));
                C023107f.LIZIZ(c85540Xhg.LJLJJI, 11, 15, 1, 1);
            }
            TextView textView2 = c85540Xhg.LJLJJI;
            textView2.setLayoutParams(textView2.getLayoutParams());
            if (ii3.LJLIL) {
                if (c85540Xhg.LJLIL.getAlpha() == 1.0f) {
                    return;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c85540Xhg.LJLIL, "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setStartDelay(ii3.LJLILLLLZI);
                ofFloat.start();
            } else {
                c85540Xhg.LJLIL.setAlpha(1.0f);
            }
            if (!loginItem.LJI) {
                return;
            }
            int i5 = C36237EKb.LIZ[c85540Xhg.LJLJL.LIZIZ().ordinal()];
            String str = "";
            if (i5 != 1) {
                if (i5 != 2) {
                    c85540Xhg.LJLJJL.setVisibility(8);
                    return;
                }
                TuxTextView tuxTextView = c85540Xhg.LJLJJL;
                tuxTextView.setVisibility(0);
                tuxTextView.setTuxFont(72);
                tuxTextView.setTextSize(12.0f);
                Context context2 = tuxTextView.getContext();
                o.LJIIIIZZ(context2, "context");
                tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context2));
                tuxTextView.setBackground(tuxTextView.getContext().getDrawable(R.drawable.wj));
                TuxTextView tuxTextView2 = c85540Xhg.LJLJJL;
                String str2 = (String) c85540Xhg.LJLJL.getPlatform().getValue();
                if (str2 != null) {
                    str = str2;
                }
                tuxTextView2.setText(c85540Xhg.L(str));
                tuxTextView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), C7MY.LIZIZ(6), O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
                ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
                o.LJII(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((C018905p) layoutParams3).bottomToTop = R.id.b9m;
                tuxTextView.setTranslationY(KL2.LIZJ(c85540Xhg.LJLIL.getContext(), -4.0f));
                tuxTextView.post(new ARunnableS33S0200000_14(tuxTextView, c85540Xhg, 101));
                return;
            }
            TuxTextView tuxTextView3 = c85540Xhg.LJLJJL;
            tuxTextView3.setVisibility(0);
            tuxTextView3.setTuxFont(61);
            tuxTextView3.setTextSize(13.0f);
            Context context3 = tuxTextView3.getContext();
            o.LJIIIIZZ(context3, "context");
            tuxTextView3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gx, context3));
            TuxTextView tuxTextView4 = c85540Xhg.LJLJJL;
            String str3 = (String) c85540Xhg.LJLJL.getPlatform().getValue();
            if (str3 != null) {
                str = str3;
            }
            tuxTextView4.setText(c85540Xhg.L(str));
            ViewGroup.LayoutParams layoutParams4 = tuxTextView3.getLayoutParams();
            o.LJII(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C018905p c018905p2 = (C018905p) layoutParams4;
            c018905p2.startToStart = R.id.b9m;
            c018905p2.endToEnd = R.id.b9m;
            c018905p2.topToBottom = R.id.b9m;
            C023107f.LIZIZ(c85540Xhg.LJLJJL, 12, 13, 1, 1);
            ViewGroup.LayoutParams layoutParams5 = c85540Xhg.LJLJJI.getLayoutParams();
            o.LJII(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((C018905p) layoutParams5).bottomToBottom = -1;
            return;
        }
        if (getItemViewType(i) == 2 || getItemViewType(i) == 13) {
            C87K c87k = (C87K) holder;
            InterfaceC85563Xi3 interfaceC85563Xi3 = this.LJLJJL;
            c87k.getClass();
            c87k.L().setContentDescription(EF7.LIZIZ().getString(R.string.b1p));
            C16880lQ.LJIIJ(new ACListenerS35S0100000_15(interfaceC85563Xi3, 281), c87k.L());
            return;
        }
        if (getItemViewType(i) == 3) {
            C85564Xi4 c85564Xi4 = (C85564Xi4) holder;
            Context context4 = c85564Xi4.itemView.getContext();
            Object value = c85564Xi4.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value, "<get-container>(...)");
            C16880lQ.LJIL((ConstraintLayout) value, new ACListenerS55S0000000_15(3));
            Object value2 = c85564Xi4.LJLJI.getValue();
            o.LJIIIIZZ(value2, "<get-channelName>(...)");
            ((TextView) value2).setText(context4.getString(R.string.gz9));
            Object value3 = c85564Xi4.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value3, "<get-container>(...)");
            View view = (View) value3;
            Integer LIZIZ = C19N.LIZIZ(c85564Xi4.itemView, "itemView.context", R.attr.ct);
            if (LIZIZ != null) {
                i2 = LIZIZ.intValue();
            } else {
                i2 = 0;
            }
            view.setBackgroundColor(i2);
            Object value4 = c85564Xi4.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value4, "<get-container>(...)");
            ((View) value4).setBackground(C04270Et.LIZIZ(c85564Xi4.itemView.getContext(), R.drawable.wg));
            Object value5 = c85564Xi4.LJLJI.getValue();
            o.LJIIIIZZ(value5, "<get-channelName>(...)");
            TextView textView3 = (TextView) value5;
            Integer LIZIZ2 = C19N.LIZIZ(c85564Xi4.itemView, "itemView.context", R.attr.go);
            if (LIZIZ2 != null) {
                i3 = LIZIZ2.intValue();
            }
            textView3.setTextColor(i3);
            Object value6 = c85564Xi4.LJLIL.getValue();
            o.LJIIIIZZ(value6, "<get-icon>(...)");
            ((ImageView) value6).setVisibility(8);
            return;
        }
        if (getItemViewType(i) == 7) {
            Object obj = ListProtector.get(this.LJLIL, i);
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.adapter.CircleList");
            C9YL c9yl = ((C9YO) holder).LJLILLLLZI;
            List<C85542Xhi> items = ((C85541Xhh) obj).LJIIJ;
            c9yl.getClass();
            o.LJIIIZ(items, "items");
            ((ArrayList) c9yl.LJLIL).clear();
            ((ArrayList) c9yl.LJLIL).addAll(items);
            c9yl.notifyDataSetChanged();
            return;
        }
        if (getItemViewType(i) == 8) {
            C85545Xhl c85545Xhl = (C85545Xhl) holder;
            C85542Xhi loginItem2 = (C85542Xhi) ListProtector.get(this.LJLIL, i);
            o.LJIIIZ(loginItem2, "loginItem");
            C16880lQ.LJIIJ(loginItem2.LJIIIIZZ, c85545Xhl.LJLILLLLZI);
            c85545Xhl.LJLJI.setText(c85545Xhl.LJLIL.getContext().getString(loginItem2.LIZJ));
            return;
        }
        if (getItemViewType(i) != 9) {
            return;
        }
        C85546Xhm c85546Xhm = (C85546Xhm) holder;
        C85542Xhi loginItem3 = (C85542Xhi) ListProtector.get(this.LJLIL, i);
        o.LJIIIZ(loginItem3, "loginItem");
        C16880lQ.LJIIJ(loginItem3.LJIIIIZZ, c85546Xhm.LJLILLLLZI);
        c85546Xhm.LJLJI.setText(c85546Xhm.LJLIL.getContext().getText(loginItem3.LIZJ));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder LIZIZ;
        String string;
        boolean z;
        o.LJIIIZ(parent, "parent");
        String str = null;
        boolean z2 = true;
        if (i != 0) {
            int i2 = R.layout.na;
            switch (i) {
                case 2:
                    LayoutInflater LLZIL = C16880lQ.LLZIL(parent.getContext());
                    if (this.LJLJJI.pv0()) {
                        i2 = R.layout.nb;
                    }
                    View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, i2, parent, false);
                    o.LJIIIIZZ(LLLLIILL, "from(parent.context).inf…           parent, false)");
                    LIZIZ = new C87K(LLLLIILL, false);
                    break;
                case 3:
                    LIZIZ = new C85564Xi4(C1FL.LIZIZ(parent, R.layout.n6, parent, false, "from(parent.context).inf…uest_mode, parent, false)"));
                    break;
                case 4:
                    View LIZIZ2 = C1FL.LIZIZ(parent, R.layout.nh, parent, false, "from(parent.context).inf…se,\n                    )");
                    C62822Ol8 c62822Ol8 = C62783OkV.LIZIZ;
                    if (((Number) c62822Ol8.getValue()).intValue() == 2) {
                        string = parent.getContext().getString(R.string.di6);
                    } else if (((Number) c62822Ol8.getValue()).intValue() == 3) {
                        string = parent.getContext().getString(R.string.di7);
                    } else {
                        string = parent.getContext().getString(R.string.hyd);
                    }
                    o.LJIIIIZZ(string, "when {\n                 …ne)\n                    }");
                    if (((Number) c62822Ol8.getValue()).intValue() == 2) {
                        str = parent.getContext().getString(R.string.di8);
                    }
                    boolean z3 = !C62783OkV.LIZ();
                    if (C62783OkV.LIZ() || this.LJLJJI.pv0()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LIZIZ = new C1794372l(LIZIZ2, string, str, z3, z);
                    break;
                case 5:
                    LIZIZ = new C85560Xi0(C1FL.LIZIZ(parent, R.layout.nk, parent, false, "from(parent.context).inf…separator, parent, false)"));
                    break;
                case 6:
                    LIZIZ = new C85559Xhz(C1FL.LIZIZ(parent, R.layout.nj, parent, false, "from(parent.context).inf…separator, parent, false)"));
                    break;
                case 7:
                    LIZIZ = new C9YO(C1FL.LIZIZ(parent, R.layout.nf, parent, false, "from(parent.context).inf…rcle_list, parent, false)"));
                    break;
                case 8:
                    LIZIZ = new C85545Xhl(C1FL.LIZIZ(parent, R.layout.n9, parent, false, "from(parent.context).inf…l_rounded, parent, false)"));
                    break;
                case 9:
                    LIZIZ = new C85546Xhm(C1FL.LIZIZ(parent, R.layout.n_, parent, false, "from(parent.context).inf…nnel_text, parent, false)"));
                    break;
                case 10:
                    LIZIZ = new C85648XjQ(C1FL.LIZIZ(parent, R.layout.op, parent, false, "from(parent.context).inf…ne_signup, parent, false)"), this.LJLJJI);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    LIZIZ = C74214TAs.LIZIZ(this.LJLJJI.pv0(), parent, this.LJLJI, EnumC74213TAr.ONE_CLICK_LOGIN, 48);
                    break;
                case 12:
                    LIZIZ = C74214TAs.LIZ(this.LJLJJI.pv0(), parent, this.LJLJI, EnumC74213TAr.DYNAMIC_HEIGHT, (String) this.LJLJJI.LL.getValue(), (String) this.LJLJJI.LLD.getValue());
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    LayoutInflater LLZIL2 = C16880lQ.LLZIL(parent.getContext());
                    if (this.LJLJJI.pv0()) {
                        i2 = R.layout.nb;
                    }
                    View LLLLIILL2 = C16880lQ.LLLLIILL(LLZIL2, i2, parent, false);
                    o.LJIIIIZZ(LLLLIILL2, "from(parent.context).inf…se,\n                    )");
                    LIZIZ = new C87K(LLLLIILL2, true);
                    break;
                case 14:
                    LIZIZ = C74214TAs.LIZIZ(this.LJLJJI.pv0(), parent, this.LJLJI, EnumC74213TAr.TRIAL_EXPIRES, 48);
                    break;
                case 15:
                    LIZIZ = C74214TAs.LIZIZ(this.LJLJJI.pv0(), parent, this.LJLJI, EnumC74213TAr.INCREASE_LOGIN_NOTIFY, 48);
                    break;
                default:
                    LIZIZ = new C85540Xhg(C1FL.LIZIZ(parent, R.layout.n8, parent, false, "from(parent.context).inf…n_channel, parent, false)"), this.LJLJJI);
                    break;
            }
        } else {
            LIZIZ = C74214TAs.LIZIZ(this.LJLJJI.pv0(), parent, this.LJLJI, null, 56);
        }
        C0AX.LIZ(parent, LIZIZ.itemView, R.id.lj7);
        View view = LIZIZ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LIZIZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z2 = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z2) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LIZIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LIZIZ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LIZIZ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LIZIZ.getClass().getName();
        return LIZIZ;
    }

    public C85539Xhf(List<C85542Xhi> list, int i, boolean z, SignupViewModel dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        this.LJLIL = list;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = dependencies;
        this.LJLJJLL = new LinkedHashSet();
    }
}
