package com.ss.android.ugc.aweme.comment.widgets;

import X.AbstractC65781Prl;
import X.C0F1;
import X.C16880lQ;
import X.C174366sq;
import X.C188727au;
import X.C207668Da;
import X.C226198uF;
import X.C226208uG;
import X.C227768wm;
import X.C2S6;
import X.C38499F9b;
import X.C47698Inm;
import X.C58655N0h;
import X.C58704N2e;
import X.C59646Nb0;
import X.C61845OOz;
import X.C62846OlW;
import X.C63077OpF;
import X.C63081OpJ;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C6ZT;
import X.C71367Rzf;
import X.C71396S0i;
import X.C76800UCe;
import X.C78765Uvh;
import X.C78983UzD;
import X.C79045V0n;
import X.C87N;
import X.FMX;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.NN1;
import X.NO5;
import X.TBT;
import X.V92;
import X.VA9;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.model.SimplePromotion;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class CommentHeaderWidget extends BaseCommentWidget implements View.OnClickListener {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final InterfaceC65784Pro<C76800UCe> LJLL;
    public final C87N LJLLI = new C87N(R.id.fti);
    public final C87N LJLLILLLL = new C87N(R.id.ft5);
    public final C87N LJLLJ = new C87N(R.id.ftk);
    public final C87N LJLLL = new C87N(R.id.u9);
    public final C87N LJLLLL = new C87N(R.id.ua);
    public final C87N LJLLLLLL = new C87N(R.id.ft1);
    public final C87N LJLZ = new C87N(R.id.bmr);
    public final C87N LJZ = new C87N(R.id.bnl);
    public final C87N LJZI = new C87N(R.id.boj);
    public final C87N LJZL = new C87N(R.id.fhh);
    public final C87N LL = new C87N(R.id.bo0);
    public final C87N LLD = new C87N(R.id.bmt);
    public final C87N LLF = new C87N(R.id.bo5);
    public final C87N LLFF = new C87N(R.id.bmu);
    public final C87N LLFFF = new C87N(R.id.bwx);
    public final C87N LLFII = new C87N(R.id.bn9);
    public final C87N LLFZ = new C87N(R.id.bnm);
    public AbstractC65781Prl LLI = C226198uF.LJLIL;

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final int LJIIJ() {
        return R.layout.du6;
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        TBT tbt = new TBT(CommentHeaderWidget.class, "mLinkTag", "getMLinkTag()Landroid/view/View;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(CommentHeaderWidget.class, "mLinkIcon", "getMLinkIcon()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mLinkTitle", "getMLinkTitle()Landroid/widget/TextView;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mLinkAdTag", "getMLinkAdTag()Landroid/widget/TextView;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mLinkAdTagDivider", "getMLinkAdTagDivider()Landroid/view/View;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mLinkDesc", "getMLinkDesc()Landroid/widget/TextView;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mCommerceArea", "getMCommerceArea()Landroid/view/View;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mCommerceLogo", "getMCommerceLogo()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mCommerceTitle", "getMCommerceTitle()Landroid/widget/TextView;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mCommerceDescriptionLayout", "getMCommerceDescriptionLayout()Landroid/view/View;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mCommercePrice", "getMCommercePrice()Landroid/widget/TextView;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mCommerceBottomDivider", "getMCommerceBottomDivider()Landroid/view/View;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mCommerceSales", "getMCommerceSales()Landroid/widget/TextView;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mCommerceBottomDivider2", "getMCommerceBottomDivider2()Landroid/view/View;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mPosCouponText", "getMPosCouponText()Landroid/widget/TextView;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mCommerceDivider", "getMCommerceDivider()Landroid/view/View;", 0, c65351Pkp), C61845OOz.LIZJ(CommentHeaderWidget.class, "mCommerceLogoRight", "getMCommerceLogoRight()Landroid/widget/ImageView;", 0, c65351Pkp)};
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    public final void LJIIZILJ() {
        C87N c87n = this.LJLLI;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLIFFJFJJ;
        C16880lQ.LJIIJ(this, c87n.LIZ(this, interfaceC74236TBoArr[0]));
        C16880lQ.LJIIJ(this, this.LJLZ.LIZ(this, interfaceC74236TBoArr[6]));
    }

    public final C62846OlW LJIL() {
        return (C62846OlW) this.LJZ.LIZ(this, LLIFFJFJJ[7]);
    }

    public final TextView LJJ() {
        return (TextView) this.LL.LIZ(this, LLIFFJFJJ[10]);
    }

    public final TextView LJJI() {
        return (TextView) this.LJLLL.LIZ(this, LLIFFJFJJ[3]);
    }

    public final boolean LJJII() {
        if (!LJIJ() || !C59646Nb0.LIZIZ(LJIILJJIL(), true, 0, "company_link") || C63077OpF.LIZ(LJIILJJIL()) == null) {
            return false;
        }
        return true;
    }

    public CommentHeaderWidget(AqS153S0100000_3 aqS153S0100000_3) {
        this.LJLL = aqS153S0100000_3;
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    /* renamed from: LJIJI */
    public final void onChanged(C207668Da c207668Da) {
        SimplePromotion promotion;
        boolean z;
        Integer valueOf;
        String name;
        String str;
        String str2;
        int i;
        String str3;
        super.onChanged(c207668Da);
        if (c207668Da == null) {
            return;
        }
        String str4 = c207668Da.LIZ;
        if (str4.hashCode() != 2016314694 || !str4.equals("comment_aweme_and_params") || !LJIJ() || this.LJLJLLL == null || !LJIJ()) {
            return;
        }
        C87N c87n = this.LJZL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLIFFJFJJ;
        BaseCommentWidget.LJIJJLI(c87n.LIZ(this, interfaceC74236TBoArr[9]));
        BaseCommentWidget.LJIJJ(this.LJLZ.LIZ(this, interfaceC74236TBoArr[6]), LJJ(), this.LLD.LIZ(this, interfaceC74236TBoArr[11]), this.LLF.LIZ(this, interfaceC74236TBoArr[12]), this.LLFF.LIZ(this, interfaceC74236TBoArr[13]), this.LLFII.LIZ(this, interfaceC74236TBoArr[15]), this.LLFZ.LIZ(this, interfaceC74236TBoArr[16]), this.LLFFF.LIZ(this, interfaceC74236TBoArr[14]), this.LJLLI.LIZ(this, interfaceC74236TBoArr[0]), LJJI(), this.LJLLLL.LIZ(this, interfaceC74236TBoArr[4]));
        String str5 = "";
        if (LJJII()) {
            if (C63081OpJ.LJJLL(LJIILJJIL())) {
                BaseCommentWidget.LJIJJ(this.LJLLI.LIZ(this, interfaceC74236TBoArr[0]));
            } else {
                LinkData LIZ = C63077OpF.LIZ(LJIILJJIL());
                if (LIZ != null) {
                    BaseCommentWidget.LJIJJLI(this.LJLLI.LIZ(this, interfaceC74236TBoArr[0]));
                    TextView textView = (TextView) this.LJLLJ.LIZ(this, interfaceC74236TBoArr[2]);
                    LinkData.CommentStruct commentStruct = LIZ.commentArea;
                    if (commentStruct == null || (str2 = commentStruct.title) == null) {
                        str2 = "";
                    }
                    textView.setText(str2);
                    TextView textView2 = (TextView) this.LJLLLLLL.LIZ(this, interfaceC74236TBoArr[5]);
                    LinkData.CommentStruct commentStruct2 = LIZ.commentArea;
                    if (commentStruct2 != null && (str3 = commentStruct2.featureLabel) != null) {
                        str5 = str3;
                    }
                    textView2.setText(str5);
                    Context context = this.LJLLILLLL.LIZ(this, interfaceC74236TBoArr[1]).getContext();
                    o.LJIIIIZZ(context, "mLinkIcon.context");
                    Integer LJI = C79045V0n.LJI(R.attr.cj, context);
                    if (LJI != null) {
                        i = LJI.intValue();
                    } else {
                        i = 0;
                    }
                    ((V92) ((VA9) this.LJLLILLLL.LIZ(this, interfaceC74236TBoArr[1])).getHierarchy()).LJIILL(new ColorDrawable(i), 5);
                    String str6 = LIZ.label;
                    if (str6 == null || str6.length() == 0) {
                        BaseCommentWidget.LJIJJ(LJJI(), this.LJLLLL.LIZ(this, interfaceC74236TBoArr[4]));
                    } else {
                        LJJI().setText(LIZ.label);
                        BaseCommentWidget.LJIJJLI(LJJI(), this.LJLLLL.LIZ(this, interfaceC74236TBoArr[4]));
                    }
                    C78765Uvh.LJFF((C62846OlW) this.LJLLILLLL.LIZ(this, interfaceC74236TBoArr[1]), LIZ.getCommentAvatarIcon());
                    Context context2 = this.LJLIL;
                    C226208uG c226208uG = new C226208uG();
                    c226208uG.LIZ = "comment_show";
                    c226208uG.LIZIZ = LIZ;
                    c226208uG.LIZJ = LJIILJJIL();
                    c226208uG.LIZLLL = true;
                    NN1.LJIJI(context2, c226208uG.LIZ());
                }
            }
        } else if (LJJIII("iron_man")) {
            MicroAppInfo microAppInfo = LJIILJJIL().getMicroAppInfo();
            if (microAppInfo != null) {
                BaseCommentWidget.LJIJJLI(this.LJLZ.LIZ(this, interfaceC74236TBoArr[6]), LJJ());
                TextView textView3 = (TextView) this.LJZI.LIZ(this, interfaceC74236TBoArr[8]);
                String title = microAppInfo.getTitle();
                if (title == null || title.length() == 0) {
                    name = microAppInfo.getName();
                } else {
                    name = microAppInfo.getTitle();
                }
                textView3.setText(name);
                int type = microAppInfo.getType();
                if (type != 1) {
                    if (type != 2) {
                        if (type == 3) {
                            C78765Uvh.LIZ(LJIL(), R.drawable.b8p);
                        }
                    } else {
                        LJIL().setImageURI(C0F1.LIZ("res").path(String.valueOf(R.drawable.b8q)).build());
                    }
                } else {
                    LJIL().setImageURI(C0F1.LIZ("res").path(String.valueOf(R.drawable.b8n)).build());
                }
                TextView LJJ = LJJ();
                String desc = microAppInfo.getDesc();
                if (desc == null || desc.length() == 0) {
                    if (!microAppInfo.isApp()) {
                        str5 = this.LJLIL.getString(R.string.i4l);
                    }
                } else {
                    str5 = microAppInfo.getDesc();
                }
                LJJ.setText(str5);
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", LJIILLIIL());
                c188727au.LJIIIZ("position", "comment_top");
                c188727au.LJIIIZ("group_id", LJIILJJIL().getAid());
                c188727au.LJIIIZ("author_id", LJIILJJIL().getAuthorUid());
                c188727au.LJIIIZ("mp_id", microAppInfo.getAppId());
                if (microAppInfo.isApp()) {
                    str = "micro_app";
                } else {
                    str = "micro_game";
                }
                c188727au.LJIIIZ("_param_for_special", str);
                FMX.LJIIL("mp_show", c188727au.LIZ);
                this.LLI = new AqS107S0300000_3(this, C38499F9b.LIZ.LIZIZ(), microAppInfo, 28);
            }
        } else if (LJJIII("shopping_cart") && (promotion = LJIILJJIL().getPromotion()) != null) {
            BaseCommentWidget.LJIJJLI(LJJ(), this.LJLZ.LIZ(this, interfaceC74236TBoArr[6]));
            LJJ().setText(promotion.getCommentArea());
            LJIL().setImageURI(C0F1.LIZ("res").path(String.valueOf(R.drawable.b6j)).build());
            ((TextView) this.LJZI.LIZ(this, interfaceC74236TBoArr[8])).setText(promotion.getShortTitle());
            this.LLI = new AqS169S0100000_3(this, 791);
            C2S6.LIZ(LJJ().getContext()).getFromGroupId();
            C2S6.LIZ(LJJ().getContext()).getReferCommodityId();
            C174366sq c174366sq = this.LJLJLLL;
            if (c174366sq != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (c174366sq != null) {
                    Integer valueOf2 = Integer.valueOf(c174366sq.getPageType());
                    if (valueOf2 != null && valueOf2.intValue() == 0) {
                        C47698Inm.LIZ.LIZ();
                    }
                } else {
                    o.LJIJI("params");
                    throw null;
                }
            }
            Aweme LJIILJJIL = LJIILJJIL();
            C174366sq c174366sq2 = this.LJLJLLL;
            if (c174366sq2 != null && (valueOf = Integer.valueOf(c174366sq2.getPageType())) != null && valueOf.intValue() == 0) {
                C227768wm.LJIIL(valueOf.intValue(), LJIILJJIL);
            }
            ICommerceService LIZ2 = C71396S0i.LIZ();
            C71367Rzf c71367Rzf = new C71367Rzf();
            c71367Rzf.LIZLLL = LJIILJJIL().getAuthorUid();
            promotion.getPromotionId();
            promotion.getPromotionSource();
            c71367Rzf.LIZIZ = LJIILL();
            c71367Rzf.LIZJ = LJIILJJIL().getAid();
            c71367Rzf.LJJIII = Integer.valueOf(LJIILJJIL().getFollowStatus());
            LIZ2.logCommerceEvents("product_entrance_show", c71367Rzf);
            ICommerceService LIZ3 = C71396S0i.LIZ();
            C71367Rzf c71367Rzf2 = new C71367Rzf();
            c71367Rzf2.LIZLLL = LJIILJJIL().getAuthorUid();
            promotion.getPromotionId();
            promotion.getPromotionSource();
            c71367Rzf2.LIZIZ = LJIILL();
            c71367Rzf2.LIZJ = LJIILJJIL().getAid();
            c71367Rzf2.LJFF = "click_comment";
            LJIILL();
            c71367Rzf2.LJJIII = Integer.valueOf(LJIILJJIL().getFollowStatus());
            LIZ3.logCommerceEvents("show_product", c71367Rzf2);
        }
        if (LJJ().getVisibility() == 0 || this.LLD.LIZ(this, interfaceC74236TBoArr[11]).getVisibility() == 0 || this.LLF.LIZ(this, interfaceC74236TBoArr[12]).getVisibility() == 0 || this.LLFF.LIZ(this, interfaceC74236TBoArr[13]).getVisibility() == 0 || this.LLFFF.LIZ(this, interfaceC74236TBoArr[14]).getVisibility() == 0) {
            return;
        }
        BaseCommentWidget.LJIJJ(this.LJZL.LIZ(this, interfaceC74236TBoArr[9]));
    }

    public final boolean LJJIII(String str) {
        if (o.LJ(str, "iron_man")) {
            if (!LJIJ() || !C59646Nb0.LIZIZ(LJIILJJIL(), true, 0, "iron_man") || LJIILJJIL().getMicroAppInfo() == null) {
                return false;
            }
            return true;
        }
        if (!o.LJ(str, "shopping_cart") || !LJIJ() || !C59646Nb0.LIZIZ(LJIILJJIL(), true, 0, "shopping_cart") || LJIILJJIL().getPromotion() == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((C207668Da) obj);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.Yns, X.Prl] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (C6ZT.LIZ(view) || view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return;
        }
        if (valueOf.intValue() == R.id.fti) {
            LinkData LIZ = C63077OpF.LIZ(LJIILJJIL());
            C226208uG c226208uG = new C226208uG();
            c226208uG.LIZ = "click";
            c226208uG.LIZIZ = LIZ;
            c226208uG.LIZJ = LJIILJJIL();
            c226208uG.LIZLLL = true;
            NN1.LJIJI(this.LJLIL, c226208uG.LIZ());
            NO5.LJIILIIL(this.LJLIL, LIZ, LJIILJJIL(), true);
            if (C63081OpJ.LJLIL(LJIILJJIL())) {
                NN1.LJIJJLI("link_click", this.LJLIL, LIZ, LJIILJJIL(), true, false);
            }
            if (!LJJII() || (commerceVideoAuthInfo = LJIILJJIL().getCommerceVideoAuthInfo()) == null || commerceVideoAuthInfo.getAdSource() != 1) {
                return;
            }
            Context context = this.LJLIL;
            Aweme LJIILJJIL = LJIILJJIL();
            JSONObject LJIIL = NN1.LJIIL(context, LJIILJJIL, false, null);
            if (!TextUtils.isEmpty("common_link")) {
                try {
                    LJIIL.put("refer", "common_link");
                } catch (JSONException e) {
                    C78983UzD.LJIIZILJ(e);
                }
            }
            if (NN1.LJIJ(context, LJIILJJIL)) {
                NN1.LJJJJJL(context, LJIILJJIL.getAwemeRawAd(), "comment_ad", "otherclick", LJIIL);
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("comment_ad", "otherclick", LJIILJJIL().getAwemeRawAd());
            LIZLLL.LIZJ("common_link", "refer");
            LIZLLL.LJII();
            return;
        }
        if (valueOf.intValue() != R.id.bmr) {
            return;
        }
        this.LLI.invoke(view);
    }
}
