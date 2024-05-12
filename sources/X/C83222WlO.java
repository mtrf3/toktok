package X;

import Y.ACListenerS48S0200000_14;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;
import o3.IDaS471S0100000_14;
import o3.h0;

/* renamed from: X.WlO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83222WlO extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<C83277WmH> LJLIL;
    public final ArrayList<ComposerBeauty> LJLILLLLZI;
    public AbstractC65781Prl LJLJI;
    public AqS164S0100000_14 LJLJJI;
    public C83211WlD LJLJJL;
    public AqS180S0100000_14 LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final C83221WlN LJLJLLL;
    public final AqS196S0100000_14 LJLL;
    public final AqS164S0100000_14 LJLLI;
    public final AqS196S0100000_14 LJLLILLLL;
    public final AqS196S0100000_14 LJLLJ;
    public final AqS180S0100000_14 LJLLL;
    public final AqS196S0100000_14 LJLLLL;
    public final C83232WlY LJLLLLLL;
    public final RecyclerView LJLZ;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    public final void LJLLLLLL(ComposerBeauty composerBeauty) {
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        int i = 0;
        while (it.hasNext()) {
            C83277WmH c83277WmH = (C83277WmH) it.next();
            if ((c83277WmH instanceof C83270WmA) && o.LJ(((C83270WmA) c83277WmH).LIZIZ, composerBeauty)) {
                if (i >= 0 && i < ((ArrayList) this.LJLIL).size()) {
                    notifyItemChanged(i);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void LJZI(boolean z) {
        this.LJLJL = z;
        if (!this.LJLJLLL.LJJI) {
            return;
        }
        for (C83277WmH c83277WmH : this.LJLIL) {
            if (c83277WmH instanceof C83271WmB) {
                ((C83271WmB) c83277WmH).LIZJ = z;
            } else if (c83277WmH instanceof C83270WmA) {
                ((C83270WmA) c83277WmH).LIZJ = z;
            }
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((C83277WmH) ListProtector.get(this.LJLIL, i)).LIZ;
    }

    public C83222WlO(C83232WlY panelConfig, C73124Smu c73124Smu) {
        o.LJIIIZ(panelConfig, "panelConfig");
        this.LJLLLLLL = panelConfig;
        this.LJLZ = c73124Smu;
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = new ArrayList<>();
        this.LJLJL = true;
        this.LJLJLLL = panelConfig.LJI;
        this.LJLL = new AqS196S0100000_14(this, 50);
        this.LJLLI = new AqS164S0100000_14(this, 509);
        this.LJLLILLLL = new AqS196S0100000_14(this, 48);
        this.LJLLJ = new AqS196S0100000_14(this, 51);
        this.LJLLL = new AqS180S0100000_14(this, 370);
        this.LJLLLL = new AqS196S0100000_14(this, 49);
    }

    public static void LJLZ(C83222WlO c83222WlO, List beautyBeans) {
        ComposerBeauty composerBeauty;
        boolean z;
        Boolean bool;
        ComposerBeauty composerBeauty2;
        c83222WlO.getClass();
        o.LJIIIZ(beautyBeans, "beautyBeans");
        c83222WlO.LJLILLLLZI.clear();
        c83222WlO.LJLILLLLZI.addAll(beautyBeans);
        ((ArrayList) c83222WlO.LJLIL).clear();
        c83222WlO.LJLJL = true;
        if (c83222WlO.LJLJLLL.LJJI && (composerBeauty = (ComposerBeauty) ORZ.LJLLLL(beautyBeans)) != null && !C1DH.LJIJ(composerBeauty) && composerBeauty.getCategoryExtra() != null && composerBeauty.getCategoryExtra().getShowSwitch()) {
            AqS180S0100000_14 aqS180S0100000_14 = c83222WlO.LJLJJLL;
            if (aqS180S0100000_14 != null && (bool = (Boolean) aqS180S0100000_14.invoke(composerBeauty.getCategoryId())) != null) {
                z = bool.booleanValue();
            } else {
                z = c83222WlO.LJLLLLLL.LJIIJJI;
            }
            c83222WlO.LJLJL = z;
            ListProtector.add(c83222WlO.LJLIL, 0, new C83271WmB(composerBeauty.getCategoryId(), c83222WlO.LJLJL));
        }
        if (c83222WlO.LJLJLLL.LJJIFFI && (composerBeauty2 = (ComposerBeauty) ORZ.LJLLLL(beautyBeans)) != null && composerBeauty2.getCategoryExtra() != null && composerBeauty2.isBeautyMode()) {
            ListProtector.add(c83222WlO.LJLIL, 0, new C83272WmC(false));
        }
        Iterator it = beautyBeans.iterator();
        while (it.hasNext()) {
            ComposerBeauty composerBeauty3 = (ComposerBeauty) it.next();
            if (composerBeauty3.isBeautyMode()) {
                ((ArrayList) c83222WlO.LJLIL).add(new C83273WmD(composerBeauty3));
            } else {
                ((ArrayList) c83222WlO.LJLIL).add(new C83270WmA(composerBeauty3, c83222WlO.LJLJL));
            }
        }
        c83222WlO.notifyDataSetChanged();
    }

    public final void LJZ(String categoryId, boolean z) {
        o.LJIIIZ(categoryId, "categoryId");
        for (C83277WmH c83277WmH : this.LJLIL) {
            if (c83277WmH instanceof C83272WmC) {
                C83272WmC c83272WmC = (C83272WmC) c83277WmH;
                c83272WmC.LIZJ = z;
                if (categoryId.length() > 0) {
                    c83272WmC.getClass();
                    c83272WmC.LIZIZ = categoryId;
                }
            }
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        String str;
        o.LJIIIZ(holder, "holder");
        boolean z9 = false;
        this.LJLJLJ = false;
        if (holder instanceof C83230WlW) {
            Object obj = ListProtector.get(this.LJLIL, i);
            if (!(obj instanceof C83271WmB)) {
                obj = null;
            }
            C83271WmB c83271WmB = (C83271WmB) obj;
            if (c83271WmB != null) {
                C83230WlW c83230WlW = (C83230WlW) holder;
                c83230WlW.LJLJJL = c83271WmB;
                c83230WlW.LJLIL.setCheckedNoEvent(c83271WmB.LIZJ);
                TextView switchText = (TextView) c83230WlW.LJLILLLLZI.getValue();
                o.LJIIIIZZ(switchText, "switchText");
                if (c83271WmB.LIZJ) {
                    str = (String) c83230WlW.LJLJJLL.getValue();
                } else {
                    str = (String) c83230WlW.LJLJL.getValue();
                }
                switchText.setText(str);
                c83230WlW.LJLIL.setOnCheckedChangeListener(new C83229WlV(c83230WlW));
                C78866UxK.LJJIIJZLJL(c83230WlW.LJLIL);
                h0.LJIJI(c83230WlW.LJLJI, new IDaS471S0100000_14(c83230WlW, 4));
            }
        } else if (holder instanceof C83244Wlk) {
            Object obj2 = ListProtector.get(this.LJLIL, i);
            if (!(obj2 instanceof C83273WmD)) {
                obj2 = null;
            }
            C83273WmD c83273WmD = (C83273WmD) obj2;
            if (c83273WmD != null) {
                C83244Wlk c83244Wlk = (C83244Wlk) holder;
                if (i == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (((ArrayList) this.LJLIL).size() > 1 && i == ((ArrayList) this.LJLIL).size() - 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                ComposerBeauty composerBeauty = c83273WmD.LIZIZ;
                UrlModel urlModel = new UrlModel();
                urlModel.setUri(composerBeauty.getCategoryExtra().getPrimaryPanelIcon());
                urlModel.setUrlList(composerBeauty.getCategoryExtra().getPrimaryPanelIconList());
                c83244Wlk.LJLLI.setCustomSelected(composerBeauty.getSelected());
                if (composerBeauty.isLocalItem() && composerBeauty.getLocalIconResId() > 0) {
                    c83244Wlk.LJLLI.getImageView().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    c83244Wlk.LJLLI.getImageView().setImageResource(composerBeauty.getLocalIconResId());
                } else {
                    C78764Uvg.LJI(c83244Wlk.LJLLI.getImageView(), urlModel, -1, -1);
                }
                if (composerBeauty.isBeautyMode()) {
                    c83244Wlk.LJLLI.setText(composerBeauty.getCategoryExtra().getPrimaryPanelName());
                    C83224WlQ c83224WlQ = c83244Wlk.LJLLI;
                    if (composerBeauty.getSelected()) {
                        c83224WlQ.LLILLIZIL.setVisibility(0);
                    } else {
                        c83224WlQ.LLILLIZIL.setVisibility(4);
                    }
                }
                c83244Wlk.LJLLI.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS48S0200000_14(composerBeauty, c83244Wlk, 17)));
                C78866UxK.LJJIIJZLJL(c83244Wlk.LJLLI);
                c83244Wlk.L(z7, z8);
            }
        } else if (holder instanceof C83241Wlh) {
            Object obj3 = ListProtector.get(this.LJLIL, i);
            if (!(obj3 instanceof C83272WmC)) {
                obj3 = null;
            }
            C83272WmC c83272WmC = (C83272WmC) obj3;
            if (c83272WmC != null) {
                C83241Wlh c83241Wlh = (C83241Wlh) holder;
                if (i == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (((ArrayList) this.LJLIL).size() > 1 && i == ((ArrayList) this.LJLIL).size() - 1) {
                    z9 = true;
                }
                c83241Wlh.L(z6, z9);
                c83241Wlh.LJLLI.setCustomSelected(c83272WmC.LIZJ);
                c83241Wlh.LJLLI.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS48S0200000_14(c83241Wlh, c83272WmC, 18)));
            }
        } else if (holder instanceof C83235Wlb) {
            Object obj4 = ListProtector.get(this.LJLIL, i);
            if (!(obj4 instanceof C83278WmI)) {
                obj4 = null;
            }
            C83278WmI c83278WmI = (C83278WmI) obj4;
            if (c83278WmI != null) {
                C83235Wlb c83235Wlb = (C83235Wlb) holder;
                if (i == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (((ArrayList) this.LJLIL).size() > 1 && i == ((ArrayList) this.LJLIL).size() - 1) {
                    z9 = true;
                }
                c83235Wlb.N(c83278WmI.LIZIZ);
                c83235Wlb.L(z5, z9);
                c83235Wlb.LJLLI.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS48S0200000_14(c83235Wlb, c83278WmI, 20)));
            }
        } else if (holder instanceof C83223WlP) {
            Object obj5 = ListProtector.get(this.LJLIL, i);
            if (!(obj5 instanceof C83270WmA)) {
                obj5 = null;
            }
            C83270WmA c83270WmA = (C83270WmA) obj5;
            if (c83270WmA != null) {
                C83223WlP c83223WlP = (C83223WlP) holder;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((ArrayList) this.LJLIL).size() > 1 && i == ((ArrayList) this.LJLIL).size() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ComposerBeauty composerBeauty2 = c83270WmA.LIZIZ;
                UrlModel urlModel2 = new UrlModel();
                Effect effect = composerBeauty2.getEffect();
                if (effect.getIconUrl() != null) {
                    urlModel2.setUri(composerBeauty2.getEffect().getIconUrl().getUri());
                    urlModel2.setUrlList(composerBeauty2.getEffect().getIconUrl().getUrlList());
                }
                c83223WlP.LJLIL.setCustomSelected(composerBeauty2.getSelected());
                C83224WlQ c83224WlQ2 = c83223WlP.LJLIL;
                if (c83223WlP.LJLJLLL.LJIILLIIL && composerBeauty2.getShowDot()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c83224WlQ2.LJIIJ(z3);
                c83223WlP.N(c83270WmA.LIZJ);
                if (c83270WmA.LIZJ) {
                    c83223WlP.LJLIL.LJIIL(c83270WmA.LIZIZ.getEnable(), c83270WmA.LIZIZ.getSelected());
                }
                View itvRedDot = c83223WlP.LJLJI;
                o.LJIIIIZZ(itvRedDot, "itvRedDot");
                if (composerBeauty2.getShowRedDot()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                itvRedDot.setVisibility(i2);
                if (composerBeauty2.isLocalItem() && composerBeauty2.getLocalIconResId() > 0) {
                    c83223WlP.LJLIL.getImageView().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    c83223WlP.LJLIL.getImageView().setImageResource(composerBeauty2.getLocalIconResId());
                    C72790ShW imageView = c83223WlP.LJLIL.getImageView();
                    View itemView = c83223WlP.itemView;
                    o.LJIIIIZZ(itemView, "itemView");
                    Context context = itemView.getContext();
                    o.LJIIIIZZ(context, "itemView.context");
                    C83221WlN c83221WlN = c83223WlP.LJLJLLL;
                    imageView.setBackground(C74298TDy.LIZ(c83221WlN.LIZLLL, R.color.dz, context, c83221WlN.LJ));
                } else {
                    C78764Uvg.LJI(c83223WlP.LJLIL.getImageView(), urlModel2, -1, -1);
                    List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty2.getBeautifyExtra().getItems();
                    if (items != null && items.isEmpty()) {
                        C72790ShW imageView2 = c83223WlP.LJLIL.getImageView();
                        View itemView2 = c83223WlP.itemView;
                        o.LJIIIIZZ(itemView2, "itemView");
                        Context context2 = itemView2.getContext();
                        o.LJIIIIZZ(context2, "itemView.context");
                        C83221WlN c83221WlN2 = c83223WlP.LJLJLLL;
                        imageView2.setBackground(C74298TDy.LIZ(c83221WlN2.LIZLLL, R.color.dz, context2, c83221WlN2.LJ));
                    } else {
                        C72790ShW imageView3 = c83223WlP.LJLIL.getImageView();
                        View itemView3 = c83223WlP.itemView;
                        o.LJIIIIZZ(itemView3, "itemView");
                        Context context3 = itemView3.getContext();
                        o.LJIIIIZZ(context3, "itemView.context");
                        C83221WlN c83221WlN3 = c83223WlP.LJLJLLL;
                        imageView3.setBackground(C74298TDy.LIZ(c83221WlN3.LIZLLL, c83221WlN3.LJIIIIZZ, context3, c83221WlN3.LJ));
                    }
                }
                c83223WlP.LJLIL.setText(effect.getName());
                c83223WlP.LJLIL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS48S0200000_14(composerBeauty2, c83223WlP, 19)));
                C78866UxK.LJJIIJZLJL(c83223WlP.LJLIL);
                int downloadState = composerBeauty2.getDownloadState();
                if (1 == composerBeauty2.getEffect().getEffectType()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    ImageView ivDownload = c83223WlP.LJLILLLLZI;
                    o.LJIIIIZZ(ivDownload, "ivDownload");
                    ivDownload.setVisibility(8);
                } else {
                    if (downloadState != 4) {
                        if (downloadState != 8) {
                            if (downloadState != 16) {
                                c83223WlP.M();
                                ImageView ivDownload2 = c83223WlP.LJLILLLLZI;
                                o.LJIIIIZZ(ivDownload2, "ivDownload");
                                ivDownload2.setVisibility(0);
                            }
                        } else {
                            ImageView ivDownload3 = c83223WlP.LJLILLLLZI;
                            o.LJIIIIZZ(ivDownload3, "ivDownload");
                            ivDownload3.setVisibility(0);
                            c83223WlP.LJLJLLL.getClass();
                            Integer num = 0;
                            if (num.intValue() != 0) {
                                i3 = num.intValue();
                            } else {
                                i3 = R.drawable.th;
                            }
                            c83223WlP.LJLILLLLZI.setImageResource(i3);
                            if (!((ValueAnimator) c83223WlP.LJLJJL.getValue()).isRunning()) {
                                ((ObjectAnimator) c83223WlP.LJLJJL.getValue()).start();
                            }
                            ImageView ivDownload4 = c83223WlP.LJLILLLLZI;
                            o.LJIIIIZZ(ivDownload4, "ivDownload");
                            ivDownload4.setVisibility(0);
                        }
                    }
                    c83223WlP.M();
                    ImageView ivDownload5 = c83223WlP.LJLILLLLZI;
                    o.LJIIIIZZ(ivDownload5, "ivDownload");
                    ivDownload5.setVisibility(8);
                }
                c83223WlP.L(z, z2);
            }
        }
        this.LJLJLJ = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        C83230WlW c83230WlW;
        View itemView;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        C83221WlN config = this.LJLJLLL;
                        o.LJIIIZ(config, "config");
                        if (config.LJIILJJIL != 0) {
                            itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), config.LJIILJJIL, parent, false);
                        } else {
                            itemView = C28289B8j.LIZ(parent, R.layout.jo, parent, false);
                        }
                        C83226WlS c83226WlS = C83224WlQ.LLILLL;
                        o.LJIIIIZZ(itemView, "itemView");
                        Context context = itemView.getContext();
                        o.LJIIIIZZ(context, "itemView.context");
                        c83226WlS.getClass();
                        C83224WlQ LIZ = C83226WlS.LIZ(context, config);
                        LIZ.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        LIZ.setId(R.id.evm);
                        TextView textView = LIZ.getTextView();
                        if (textView != null) {
                            textView.setTextSize(1, config.LIZ);
                        }
                        ((ViewGroup) itemView.findViewById(R.id.de_)).addView(LIZ, 0);
                        itemView.findViewById(R.id.evo).setBackgroundResource(config.LJIIZILJ);
                        C83223WlP c83223WlP = new C83223WlP(itemView, config);
                        c83223WlP.LJLJJLL = this.LJLL;
                        c83223WlP.LJLJL = this.LJLLI;
                        c83230WlW = c83223WlP;
                    } else {
                        C83221WlN config2 = this.LJLJLLL;
                        o.LJIIIZ(config2, "config");
                        View itemView2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.jr, parent, false);
                        C83226WlS c83226WlS2 = C83224WlQ.LLILLL;
                        o.LJIIIIZZ(itemView2, "itemView");
                        Context context2 = itemView2.getContext();
                        o.LJIIIIZZ(context2, "itemView.context");
                        c83226WlS2.getClass();
                        C83224WlQ LIZ2 = C83226WlS.LIZ(context2, config2);
                        LIZ2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        LIZ2.setId(R.id.evm);
                        C72790ShW imageView = LIZ2.getImageView();
                        Context context3 = itemView2.getContext();
                        o.LJIIIIZZ(context3, "itemView.context");
                        imageView.setBackground(C74298TDy.LIZ(config2.LIZLLL, R.color.dz, context3, config2.LJ));
                        LIZ2.getImageView().setActualImageResource(R.drawable.ax9);
                        TextView textView2 = LIZ2.getTextView();
                        if (textView2 != null) {
                            textView2.setTextSize(1, config2.LIZ);
                        }
                        TextView textView3 = LIZ2.getTextView();
                        if (textView3 != null) {
                            Context context4 = itemView2.getContext();
                            o.LJIIIIZZ(context4, "itemView.context");
                            textView3.setText(context4.getResources().getString(0));
                        }
                        ((ViewGroup) itemView2.findViewById(R.id.de_)).addView(LIZ2, 0);
                        C83235Wlb c83235Wlb = new C83235Wlb(itemView2, config2);
                        c83235Wlb.LJLLILLLL = this.LJLLL;
                        c83230WlW = c83235Wlb;
                    }
                } else {
                    C83221WlN config3 = this.LJLJLLL;
                    o.LJIIIZ(config3, "config");
                    View itemView3 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.jq, parent, false);
                    C83226WlS c83226WlS3 = C83224WlQ.LLILLL;
                    o.LJIIIIZZ(itemView3, "itemView");
                    Context context5 = itemView3.getContext();
                    o.LJIIIIZZ(context5, "itemView.context");
                    c83226WlS3.getClass();
                    C83224WlQ LIZ3 = C83226WlS.LIZ(context5, config3);
                    LIZ3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    LIZ3.setId(R.id.evm);
                    C72790ShW imageView2 = LIZ3.getImageView();
                    Context context6 = itemView3.getContext();
                    o.LJIIIIZZ(context6, "itemView.context");
                    imageView2.setBackground(C74298TDy.LIZ(config3.LIZLLL, R.color.dz, context6, config3.LJ));
                    LIZ3.getImageView().setActualImageResource(R.drawable.ax8);
                    TextView textView4 = LIZ3.getTextView();
                    if (textView4 != null) {
                        textView4.setTextSize(1, config3.LIZ);
                    }
                    TextView textView5 = LIZ3.getTextView();
                    if (textView5 != null) {
                        Context context7 = itemView3.getContext();
                        o.LJIIIIZZ(context7, "itemView.context");
                        textView5.setText(context7.getResources().getString(0));
                    }
                    ((ViewGroup) itemView3.findViewById(R.id.de_)).addView(LIZ3, 0);
                    C83241Wlh c83241Wlh = new C83241Wlh(itemView3, config3);
                    c83241Wlh.LJLLILLLL = this.LJLLLL;
                    c83230WlW = c83241Wlh;
                }
            } else {
                C83221WlN config4 = this.LJLJLLL;
                o.LJIIIZ(config4, "config");
                View itemView4 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.jo, parent, false);
                C83226WlS c83226WlS4 = C83224WlQ.LLILLL;
                o.LJIIIIZZ(itemView4, "itemView");
                Context context8 = itemView4.getContext();
                o.LJIIIIZZ(context8, "itemView.context");
                c83226WlS4.getClass();
                C83224WlQ LIZ4 = C83226WlS.LIZ(context8, config4);
                LIZ4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                LIZ4.setId(R.id.evm);
                C72790ShW imageView3 = LIZ4.getImageView();
                Context context9 = itemView4.getContext();
                o.LJIIIIZZ(context9, "itemView.context");
                imageView3.setBackground(C74298TDy.LIZ(config4.LIZLLL, R.color.dz, context9, config4.LJ));
                TextView textView6 = LIZ4.getTextView();
                if (textView6 != null) {
                    textView6.setTextSize(1, config4.LIZ);
                }
                ((ViewGroup) itemView4.findViewById(R.id.de_)).addView(LIZ4, 0);
                itemView4.findViewById(R.id.evo).setBackgroundResource(config4.LJIIZILJ);
                C83244Wlk c83244Wlk = new C83244Wlk(itemView4, config4);
                c83244Wlk.LJLLJ = this.LJLLILLLL;
                c83230WlW = c83244Wlk;
            }
        } else {
            C83221WlN config5 = this.LJLJLLL;
            o.LJIIIZ(config5, "config");
            View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.js, parent, false);
            o.LJIIIIZZ(view, "view");
            C83230WlW c83230WlW2 = new C83230WlW(view, this, config5);
            c83230WlW2.LJLJJI = this.LJLLJ;
            c83230WlW = c83230WlW2;
        }
        C0AX.LIZ(parent, c83230WlW.itemView, R.id.lj7);
        View view2 = c83230WlW.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c83230WlW.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c83230WlW.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c83230WlW.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c83230WlW.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c83230WlW.getClass().getName();
        return c83230WlW;
    }
}
