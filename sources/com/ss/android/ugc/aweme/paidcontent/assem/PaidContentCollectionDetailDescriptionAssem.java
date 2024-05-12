package com.ss.android.ugc.aweme.paidcontent.assem;

import X.A30;
import X.A35;
import X.A3B;
import X.A3E;
import X.A3F;
import X.A3G;
import X.A3P;
import X.AJ9;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C00F;
import X.C025908h;
import X.C16880lQ;
import X.C184077Kh;
import X.C188727au;
import X.C1FJ;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C254529yq;
import X.C254619yz;
import X.C254739zB;
import X.C25584A2i;
import X.C25589A2n;
import X.C25590A2o;
import X.C25594A2s;
import X.C25598A2w;
import X.C25601A2z;
import X.C26045AKb;
import X.C26338AVi;
import X.C32151Nz;
import X.C36636EZk;
import X.C47261Igj;
import X.C47704Ins;
import X.C48841JEv;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65642hs;
import X.C65776Prg;
import X.C73318Sq2;
import X.C73849Syb;
import X.C73969T1h;
import X.C78685UuP;
import X.C78926UyI;
import X.C78999UzT;
import X.C7VX;
import X.C8IC;
import X.C8W0;
import X.C8YN;
import X.C95C;
import X.C9BD;
import X.EnumC25627A3z;
import X.FMX;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.J14;
import X.J17;
import X.O6R;
import X.ORZ;
import X.Q8U;
import X.SY4;
import X.T16;
import X.TBT;
import X.X1D;
import X.XKX;
import Y.AfS56S0100000_4;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.anchor.service.IPaidContentAnchorAttachService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.paidcontent.util.SeriesCountDownTimer;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentCollectionListAssemViewModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailPaymentViewModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailVideoListViewModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentVoucherClaimViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IPaidContentPaymentService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class PaidContentCollectionDetailDescriptionAssem extends UIContentAssem implements A3P, J17 {
    public final C214378bB LJLJJL;
    public final C214378bB LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C214298b3 LJLLI;
    public final C214298b3 LJLLILLLL;
    public CollectionDetailModel LJLLJ;
    public int LJLLL;
    public String LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public long LJZ;
    public long LJZI;
    public TuxTextView LJZL;
    public TuxTextView LL;
    public ConstraintLayout LLD;
    public TuxTextView LLF;
    public C8IC LLFF;
    public TuxTextView LLFFF;
    public SY4 LLFII;
    public LinearLayout LLFZ;
    public boolean LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public SY4 LLIIIL;
    public SY4 LLIIIZ;
    public TuxTextView LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public final Map<Integer, View> LLIILZL = new LinkedHashMap();
    public final C73849Syb<C25598A2w> LJLIL = new C73849Syb<>();
    public final C73849Syb<C254739zB> LJLILLLLZI = new C73849Syb<>();
    public final C73318Sq2 LJLJI = new C73318Sq2();
    public final C55749LuL LJLJJI = new C55749LuL(C47704Ins.LIZJ(this, C25594A2s.class, "paid_content_collection_detail_hierarchy_data_key"), checkSupervisorPrepared());

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIILZL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public PaidContentCollectionDetailDescriptionAssem() {
        InterfaceC65784Pro LJIILJJIL;
        InterfaceC65784Pro LJIILJJIL2;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 538);
        C65776Prg LIZ = C65352Pkq.LIZ(PaidContentDetailVideoListViewModel.class);
        A35 a35 = A35.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4((C8W0) this, 536);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        AqS60S0110000_3 LJIIZILJ = C78926UyI.LJIIZILJ(this, true);
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(this, false);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        this.LJLJJL = new C214378bB(LIZ, aqS154S0100000_4, c214528bQ, LJJII, c184077Kh, a35, LJIILJJIL, LJIIZILJ);
        AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(this, 531);
        C65776Prg LIZ2 = C65352Pkq.LIZ(PaidContentCollectionListAssemViewModel.class);
        C254619yz c254619yz = C254619yz.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL2 = new AqS154S0100000_4((C8W0) this, 537);
        } else {
            LJIILJJIL2 = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJJLL = new C214378bB(LIZ2, aqS154S0100000_42, c214528bQ, C78926UyI.LJJII(this, false), c184077Kh, c254619yz, LJIILJJIL2, C78926UyI.LJIIZILJ(this, true));
        this.LJLJL = C221108m2.LIZIZ(A3B.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(A3G.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(A3F.LJLIL);
        this.LJLL = C221108m2.LIZIZ(C254529yq.LJLIL);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ3 = C65352Pkq.LIZ(PaidContentDetailPaymentViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ3, c9bd, new AqS151S0100000_1((InterfaceC65350Pko) LIZ3, 687), C25601A2z.INSTANCE, null);
        C65776Prg LIZ4 = C65352Pkq.LIZ(PaidContentVoucherClaimViewModel.class);
        this.LJLLILLLL = C78926UyI.LJ(this, LIZ4, c9bd, new AqS151S0100000_1((InterfaceC65350Pko) LIZ4, 688), A30.INSTANCE, null);
        this.LJLLL = -1;
        this.LJLLLL = "click_purchase_button";
        this.LJLZ = true;
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 686));
        this.LLII = C221108m2.LIZIZ(new AqS154S0100000_4(this, 534));
        this.LLIIII = C221108m2.LIZIZ(new AqS154S0100000_4(this, 533));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 532));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 530));
    }

    public final J14 A3() {
        Object value = this.LLII.getValue();
        o.LJIIIIZZ(value, "<get-coverVideoViewComponent>(...)");
        return (J14) value;
    }

    public final C25594A2s C3() {
        return (C25594A2s) this.LJLJJI.getValue();
    }

    public final PaidContentDetailPaymentViewModel E3() {
        return (PaidContentDetailPaymentViewModel) this.LJLLI.getValue();
    }

    public final PaidContentDetailVideoListViewModel F3() {
        return (PaidContentDetailVideoListViewModel) this.LJLJJL.getValue();
    }

    public final void I3() {
        String str;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C26045AKb c26045AKb = new C26045AKb(LIZ);
            c26045AKb.LJIIIZ(LIZ.getResources().getString(R.string.qnk));
            c26045AKb.LJIIJ();
            CollectionDetailModel collectionDetailModel = this.LJLLJ;
            if (collectionDetailModel != null) {
                Intent intent = C3().LJLJJI;
                String sourceWay = this.LJLLLL;
                o.LJIIIZ(sourceWay, "sourceWay");
                if (intent != null) {
                    str = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
                } else {
                    str = null;
                }
                C25589A2n.LJIIJJI("collection_in_app_purchase_toast", str, null, null, null, Boolean.valueOf(C25590A2o.LIZ(intent)), null, null, null, null, sourceWay, null, null, null, null, null, null, null, collectionDetailModel, null, null, null, null, null, null, 66582460);
            }
        }
        ConstraintLayout constraintLayout = this.LLD;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        F3().manualListRefresh();
        CollectionDetailModel collectionDetailModel2 = this.LJLLJ;
        if (collectionDetailModel2 != null) {
            C25590A2o.LIZLLL(collectionDetailModel2, true, C3().LJLJJI, 0, this.LJLLLL, Long.valueOf(C3().LJLJL), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID(), "mobile", C3().LJLLILLLL, C3().LJLLJ, C3().LJLLL);
        }
    }

    @Override // X.A3P
    public final void LJJLL() {
        LinearLayout linearLayout;
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        String signature;
        Rect rect = new Rect();
        LinearLayout linearLayout2 = this.LLFZ;
        if (linearLayout2 != null && linearLayout2.isShown() && !this.LLI) {
            LinearLayout linearLayout3 = this.LLFZ;
            if (linearLayout3 != null && linearLayout3.getGlobalVisibleRect(rect)) {
                this.LLI = true;
                CollectionDetailModel collectionDetailModel = this.LJLLJ;
                if (collectionDetailModel != null) {
                    Intent intent = C3().LJLJJI;
                    if (intent != null) {
                        str = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
                    } else {
                        str = null;
                    }
                    Intent intent2 = C3().LJLJJI;
                    User collectionCreator = collectionDetailModel.getCollectionCreator();
                    if (collectionCreator != null) {
                        str2 = collectionCreator.getCustomVerify();
                    } else {
                        str2 = null;
                    }
                    User collectionCreator2 = collectionDetailModel.getCollectionCreator();
                    if (collectionCreator2 != null) {
                        str3 = collectionCreator2.getEnterpriseVerifyReason();
                    } else {
                        str3 = null;
                    }
                    User collectionCreator3 = collectionDetailModel.getCollectionCreator();
                    if (collectionCreator3 != null) {
                        num = Integer.valueOf(collectionCreator3.getVerificationType());
                    } else {
                        num = null;
                    }
                    Boolean valueOf = Boolean.valueOf(AJ9.LIZIZ(new UserVerify(null, str2, str3, num)));
                    Boolean valueOf2 = Boolean.valueOf(C25590A2o.LIZ(intent2));
                    C188727au c188727au = new C188727au();
                    c188727au.LJI("enter_from", str);
                    C25589A2n.LJ(c188727au, collectionDetailModel);
                    C25589A2n.LIZ(c188727au, collectionDetailModel);
                    C25589A2n.LJI(c188727au, collectionDetailModel);
                    c188727au.LJ(collectionDetailModel.getCollectionSalesNum(), "collection_sold_cnt");
                    if (valueOf2 != null) {
                        C25589A2n.LJII(c188727au, valueOf2.booleanValue());
                    }
                    C25589A2n.LJIIIZ(c188727au, collectionDetailModel.getHasPurchasedCollection());
                    User collectionCreator4 = collectionDetailModel.getCollectionCreator();
                    if (collectionCreator4 != null) {
                        c188727au.LIZLLL(collectionCreator4.getFollowerCount(), "creator_followers_cnt");
                    }
                    User collectionCreator5 = collectionDetailModel.getCollectionCreator();
                    if (collectionCreator5 != null && (signature = collectionCreator5.getSignature()) != null) {
                        c188727au.LJI("creator_bio", signature);
                    }
                    if (valueOf != null) {
                        if (valueOf.booleanValue()) {
                            str4 = "1";
                        } else {
                            str4 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c188727au.LJI("creator_account_verification", str4);
                    }
                    FMX.LJIIL("show_creator_info_card", c188727au.LIZ);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LLI || (linearLayout = this.LLFZ) == null || linearLayout.getGlobalVisibleRect(rect)) {
            return;
        }
        this.LLI = false;
    }

    public final void M3() {
        Drawable drawable;
        GradientDrawable gradientDrawable;
        TuxTextView tuxTextView = this.LLF;
        if (tuxTextView != null) {
            tuxTextView.setBackgroundResource(R.drawable.ald);
        }
        C25598A2w LJJZZIII = this.LJLIL.LJJZZIII();
        String str = null;
        if (LJJZZIII != null) {
            int i = LJJZZIII.LJLIL;
            TuxTextView tuxTextView2 = this.LLF;
            if (tuxTextView2 != null) {
                drawable = tuxTextView2.getBackground();
            } else {
                drawable = null;
            }
            if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
                gradientDrawable.setColor(i);
            }
        }
        TuxTextView tuxTextView3 = this.LLF;
        if (tuxTextView3 != null) {
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.s93);
            }
            tuxTextView3.setText(str);
        }
        TuxTextView tuxTextView4 = this.LLF;
        if (tuxTextView4 == null) {
            return;
        }
        tuxTextView4.setClickable(false);
    }

    public final SmartImageView v3() {
        return (SmartImageView) this.LLIIIJ.getValue();
    }

    public final void H3() {
        Context context = getContext();
        if (context != null) {
            Object value = this.LJLL.getValue();
            o.LJIIIIZZ(value, "<get-anchorAttachService>(...)");
            ((IPaidContentAnchorAttachService) value).LIZ(context, C3().LJLILLLLZI, C47261Igj.LJJIJ(this.LJLLJ));
        }
    }

    public final void R3() {
        CollectionDetailModel collectionDetailModel;
        if (C7VX.LIZ() && (collectionDetailModel = this.LJLLJ) != null && collectionDetailModel.getVoucherUrgencyType() == 1) {
            C25598A2w LJJZZIII = this.LJLIL.LJJZZIII();
            if (LJJZZIII != null && !LJJZZIII.LJLJI) {
                Color.colorToHSV(LJJZZIII.LJLIL, r9);
                float[] fArr = {0.0f, 0.0f, 1.0f};
                int HSVToColor = Color.HSVToColor(fArr);
                fArr[2] = fArr[2] * 0.3f;
                int HSVToColor2 = Color.HSVToColor(fArr);
                _$_findCachedViewById(R.id.neg).setBackgroundColor(HSVToColor);
                TextView textView = (TextView) _$_findCachedViewById(R.id.nef);
                if (textView != null) {
                    textView.setTextColor(HSVToColor2);
                }
            }
            View voucher_expiration_container = _$_findCachedViewById(R.id.neg);
            o.LJIIIIZZ(voucher_expiration_container, "voucher_expiration_container");
            C26338AVi.LJI(voucher_expiration_container, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5))), null, null, false, 29);
            View voucher_expiration_container2 = _$_findCachedViewById(R.id.neg);
            o.LJIIIIZZ(voucher_expiration_container2, "voucher_expiration_container");
            C26338AVi.LJIIIZ(voucher_expiration_container2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5))), null, 26);
            View voucher_expiration = _$_findCachedViewById(R.id.nef);
            o.LJIIIIZZ(voucher_expiration, "voucher_expiration");
            C26338AVi.LJI(voucher_expiration, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5))), null, AnonymousClass391.LIZJ(5), null, false, 26);
            return;
        }
        View voucher_expiration_container3 = _$_findCachedViewById(R.id.neg);
        o.LJIIIIZZ(voucher_expiration_container3, "voucher_expiration_container");
        C26338AVi.LJI(voucher_expiration_container3, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, null, false, 29);
        View voucher_expiration_container4 = _$_findCachedViewById(R.id.neg);
        o.LJIIIIZZ(voucher_expiration_container4, "voucher_expiration_container");
        C26338AVi.LJIIIZ(voucher_expiration_container4, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, 26);
        _$_findCachedViewById(R.id.neg).setBackgroundColor(0);
        View voucher_expiration2 = _$_findCachedViewById(R.id.nef);
        o.LJIIIIZZ(voucher_expiration2, "voucher_expiration");
        C26338AVi.LJI(voucher_expiration2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, C1FJ.LIZIZ(0), null, false, 26);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        if (A3E.LIZ()) {
            J14 A3 = A3();
            if (A3.getVideoViewComponent().LJFF()) {
                A3.getVideoViewComponent().LJIIJJI();
            }
        }
        super.onDestroy();
        this.LJLJI.dispose();
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        if (x3(this.LJLLJ) != null && A3().getHasPrepared()) {
            A3().LIZ();
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        String aid;
        Aweme aweme;
        int i;
        super.onResume();
        if (this.LLIIJLIL) {
            F3().manualListRefresh();
            this.LLIIL = true;
            this.LLIIJLIL = false;
        }
        if (x3(this.LJLLJ) != null && A3().getHasPrepared()) {
            J14 A3 = A3();
            Aweme aweme2 = A3.LJLJI;
            if (aweme2 != null && (aid = aweme2.getAid()) != null && (aweme = A3.LJLJI) != null && aweme.getVideo() != null) {
                Integer num = (Integer) ((HashMap) C95C.LIZ).get(aid);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                float LJ = (i / ((float) (A3.getVideoViewComponent().LJ() / 1000))) * 100;
                if (LJ != 0.0f) {
                    A3.getVideoViewComponent().LJIIJ(LJ);
                }
            }
            v3().setVisibility(8);
        }
    }

    public static PaidVideoItem x3(CollectionDetailModel collectionDetailModel) {
        PaidVideoItem paidVideoItem;
        PaidVideoItem paidVideoItem2;
        Aweme aweme;
        PaidContentInfo paidContentInfo;
        if (collectionDetailModel == null) {
            return null;
        }
        Iterator<PaidVideoItem> it = collectionDetailModel.getPaidVideoList().iterator();
        while (true) {
            if (it.hasNext()) {
                paidVideoItem = it.next();
                PaidVideoItem paidVideoItem3 = paidVideoItem;
                if (paidVideoItem3 != null && (aweme = paidVideoItem3.getAweme()) != null && (paidContentInfo = aweme.mPaidContentInfo) != null && paidContentInfo.getShouldShowPreview()) {
                    break;
                }
            } else {
                paidVideoItem = null;
                break;
            }
        }
        PaidVideoItem paidVideoItem4 = paidVideoItem;
        Iterator<PaidVideoItem> it2 = collectionDetailModel.getPaidVideoList().iterator();
        while (true) {
            if (it2.hasNext()) {
                paidVideoItem2 = it2.next();
                PaidVideoItem paidVideoItem5 = paidVideoItem2;
                if (paidVideoItem5 != null && paidVideoItem5.isIntro()) {
                    break;
                }
            } else {
                paidVideoItem2 = null;
                break;
            }
        }
        PaidVideoItem paidVideoItem6 = paidVideoItem2;
        if (collectionDetailModel.getHasPurchasedCollection() || C00F.LIZ(31744, 0, "paid_content_enable_sdp_revamp_2", true) != 2) {
            return null;
        }
        if (paidVideoItem6 == null) {
            return paidVideoItem4;
        }
        return paidVideoItem6;
    }

    public final void K3(CollectionDetailModel collectionDetailModel) {
        String str;
        withState(E3(), new AqS170S0100000_4(this, 473));
        E3().gv0(collectionDetailModel.getCollectionId(), C3().LJLJI, collectionDetailModel.getVoucherId());
        this.LJLLLL = "click_purchase_button";
        Intent intent = C3().LJLJJI;
        String str2 = C3().LJLLILLLL;
        String str3 = C3().LJLLJ;
        String str4 = C3().LJLLL;
        if (intent != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
        } else {
            str = null;
        }
        C25589A2n.LJIIJJI("click_purchase_collection", str, null, null, null, Boolean.valueOf(C25590A2o.LIZ(intent)), null, null, null, null, null, null, null, null, null, null, null, null, collectionDetailModel, null, str2, str3, str4, null, null, 51904444);
    }

    public final void L3(boolean z) {
        SY4 sy4 = this.LLIIIL;
        if (sy4 != null) {
            sy4.setLoading(z);
        }
        SY4 sy42 = this.LLIIIZ;
        if (sy42 != null) {
            sy42.setLoading(z);
        }
        SY4 sy43 = this.LLIIIL;
        if (sy43 != null) {
            sy43.setClickable(!z);
        }
        SY4 sy44 = this.LLIIIZ;
        if (sy44 == null) {
            return;
        }
        sy44.setClickable(!z);
    }

    @Override // X.J17
    public final void LLLF(PaidVideoItem item) {
        Context context;
        o.LJIIIZ(item, "item");
        CollectionDetailModel collectionDetailModel = this.LJLLJ;
        if (collectionDetailModel != null && (context = getContext()) != null) {
            F3().iv0(item, context, collectionDetailModel, Float.valueOf(A3().getCurrentProgress()));
        }
    }

    public final void N3(CollectionDetailModel collectionDetailModel) {
        long collectionRatingNum;
        float collectionRating;
        if (this.LJLLL > 0) {
            collectionRatingNum = collectionDetailModel.getCollectionRatingNum() + 1;
        } else {
            collectionRatingNum = collectionDetailModel.getCollectionRatingNum();
        }
        if (this.LJLLL > 0) {
            collectionRating = (((collectionDetailModel.getCollectionRating() * ((float) collectionDetailModel.getCollectionRatingNum())) + this.LJLLL) * 1.0f) / ((float) (collectionDetailModel.getCollectionRatingNum() + 1));
        } else {
            collectionRating = collectionDetailModel.getCollectionRating();
        }
        TuxTextView tuxTextView = (TuxTextView) getContainerView().findViewById(R.id.bhe);
        TuxIconView tuxIconView = (TuxIconView) getContainerView().findViewById(R.id.bhf);
        tuxIconView.setVisibility(0);
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C25584A2i(collectionDetailModel, this, tuxTextView, tuxIconView, collectionRatingNum, collectionRating, null), 3);
        this.LJLLL = -1;
    }

    @Override // X.J17
    public final void O2(String str) {
        Intent intent;
        String LLJJIJIIJIL;
        boolean z;
        CollectionDetailModel collectionDetailModel = this.LJLLJ;
        if (collectionDetailModel != null && (intent = C3().LJLJJI) != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "enter_from")) != null) {
            if (C3().LJLJI == EnumC25627A3z.ANCHOR) {
                z = true;
            } else {
                z = false;
            }
            boolean hasPurchasedCollection = collectionDetailModel.getHasPurchasedCollection();
            C188727au c188727au = new C188727au();
            C25589A2n.LJFF(c188727au, LLJJIJIIJIL);
            C25589A2n.LJ(c188727au, collectionDetailModel);
            C25589A2n.LIZ(c188727au, collectionDetailModel);
            C25589A2n.LJI(c188727au, collectionDetailModel);
            C25589A2n.LJII(c188727au, z);
            c188727au.LJ(collectionDetailModel.getCollectionSalesNum(), "collection_sold_cnt");
            C25589A2n.LJIIIZ(c188727au, hasPurchasedCollection);
            c188727au.LJI("cover_photo_status", str);
            FMX.LJIIL("click_collection_cover_photo", c188727au.LIZ);
        }
    }

    @Override // X.J17
    public final void o3(int i) {
        Object value = this.LLIIII.getValue();
        o.LJIIIIZZ(value, "<get-coverVideoPlayButton>(...)");
        ((View) value).setVisibility(i);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-seriesPaymentService>(...)");
        C78999UzT.LJFF(((IPaidContentPaymentService) value).LIZIZ().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS56S0100000_4(this, 35)), this.LJLJI);
        this.LJZL = (TuxTextView) getContainerView().findViewById(R.id.fuz);
        this.LL = (TuxTextView) getContainerView().findViewById(R.id.bhd);
        ConstraintLayout constraintLayout = (ConstraintLayout) getContainerView().findViewById(R.id.ekt);
        this.LLD = constraintLayout;
        if (constraintLayout != null) {
            tuxTextView = (TuxTextView) constraintLayout.findViewById(R.id.ned);
        } else {
            tuxTextView = null;
        }
        this.LLFFF = tuxTextView;
        this.LLFF = (C8IC) getContainerView().findViewById(R.id.nec);
        AssemViewModel.asyncSubscribe$default(F3(), new TBT() { // from class: X.A2h
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A3V) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), null, null, new AqS170S0100000_4(this, 478), 12, null);
        C8YN.LJII(this, F3(), new TBT() { // from class: X.A3A
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A3V) obj).LJLJI;
            }
        }, null, new AqS186S0100000_4(this, 146), 6);
        E3().asyncSubscribe(new TBT() { // from class: X.A38
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A37) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS170S0100000_4(this, 479), new AqS154S0100000_4(this, 529), new AqS170S0100000_4(this, 472));
        E3().asyncSubscribe(new TBT() { // from class: X.A36
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A37) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS170S0100000_4(this, 474), new AqS154S0100000_4(this, 535), new AqS170S0100000_4(this, 475));
        C8YN.LJII(this, E3(), new TBT() { // from class: X.A2a
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A37) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 144), 4);
        C8YN.LJII(this, E3(), new TBT() { // from class: X.A31
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((A37) obj).LJLJL);
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 145), 4);
        ((AssemViewModel) this.LJLLILLLL.getValue()).asyncSubscribe(new TBT() { // from class: X.A34
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A32) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS170S0100000_4(this, 476), new AqS154S0100000_4(this, 539), new AqS170S0100000_4(this, 477));
        if (A3E.LIZ()) {
            C3().LJLLI.setValue(this);
        }
    }

    public final void O3(CollectionDetailModel collectionDetailModel, String str) {
        String priceInUsd;
        String priceInUsd2;
        TuxTextView tuxTextView;
        String str2;
        Context context = getContext();
        if (context != null) {
            if (C7VX.LIZ()) {
                if (collectionDetailModel.getVoucherIsCountdown()) {
                    PriceInfo priceInfo = collectionDetailModel.getPriceInfo();
                    if (priceInfo != null && (priceInUsd = priceInfo.getPriceInUsd()) != null) {
                        float parseFloat = CastFloatProtector.parseFloat(priceInUsd);
                        PriceInfo discountedPriceInfo = collectionDetailModel.getDiscountedPriceInfo();
                        if (discountedPriceInfo != null && (priceInUsd2 = discountedPriceInfo.getPriceInUsd()) != null) {
                            float parseFloat2 = CastFloatProtector.parseFloat(priceInUsd2);
                            String voucherDescription = collectionDetailModel.getVoucherDescription();
                            if (voucherDescription != null && (tuxTextView = this.LLFFF) != null) {
                                String str3 = (String) ORZ.LJLLLL(s.LJLJJL(voucherDescription, new String[]{"\n"}, 0, 6));
                                if (str3 == null || (str2 = s.LJZI(str3).toString()) == null) {
                                    str2 = "";
                                }
                                StringBuilder LIZ = X1D.LIZ();
                                C025908h.LJ(new Object[]{b0.LIZJ(LIZ, (int) ((parseFloat2 / parseFloat) * 100), '%', LIZ)}, 1, str2, "format(format, *args)", tuxTextView);
                            }
                        }
                    }
                    SeriesCountDownTimer seriesCountDownTimer = (SeriesCountDownTimer) this.LLIFFJFJJ.getValue();
                    long voucherExpireTimestamp = collectionDetailModel.getVoucherExpireTimestamp();
                    AqS132S0200000_1 aqS132S0200000_1 = new AqS132S0200000_1(this, context, 31);
                    seriesCountDownTimer.getClass();
                    if (seriesCountDownTimer.LJLIL == null) {
                        seriesCountDownTimer.LJLIL = XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C65642hs(voucherExpireTimestamp, seriesCountDownTimer, aqS132S0200000_1, null), 3);
                        return;
                    }
                    return;
                }
                P3(collectionDetailModel, str, this);
                return;
            }
            P3(collectionDetailModel, str, this);
        }
    }

    public static final void P3(CollectionDetailModel collectionDetailModel, String str, PaidContentCollectionDetailDescriptionAssem paidContentCollectionDetailDescriptionAssem) {
        String voucherDescription = collectionDetailModel.getVoucherDescription();
        if (voucherDescription == null) {
            voucherDescription = "";
        }
        List LJLJJI = s.LJLJJI(Q8U.LIZIZ(new Object[]{str}, 1, voucherDescription, "format(format, *args)"), new char[]{'\n'}, false, 6);
        if (LJLJJI.size() == 2) {
            String str2 = (String) ListProtector.get(LJLJJI, 0);
            String str3 = (String) ListProtector.get(LJLJJI, 1);
            TuxTextView tuxTextView = paidContentCollectionDetailDescriptionAssem.LLFFF;
            if (tuxTextView != null) {
                tuxTextView.setText(str2);
            }
            TextView textView = (TextView) paidContentCollectionDetailDescriptionAssem._$_findCachedViewById(R.id.nef);
            if (textView == null) {
                return;
            }
            textView.setText(str3);
        }
    }

    public final void Q3(boolean z, boolean z2, C254739zB c254739zB) {
        String str;
        String str2;
        PriceInfo priceInfo;
        int i;
        TuxTextView tuxTextView = this.LL;
        int i2 = 8;
        if (tuxTextView != null) {
            if (!c254739zB.LJFF && C78685UuP.LJJJZ(c254739zB.LIZLLL) && !z2 && !z) {
                i = 0;
            } else {
                i = 8;
            }
            tuxTextView.setVisibility(i);
            tuxTextView.setText(c254739zB.LIZJ);
            if (C78685UuP.LJJJZ(c254739zB.LIZLLL)) {
                tuxTextView.setPaintFlags(tuxTextView.getPaintFlags() | 16);
            }
        }
        TuxTextView tuxTextView2 = this.LJZL;
        if (tuxTextView2 != null) {
            if (!c254739zB.LJFF && !z2) {
                i2 = 0;
            }
            tuxTextView2.setVisibility(i2);
            if (z) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('$');
                CollectionDetailModel collectionDetailModel = this.LJLLJ;
                if (collectionDetailModel == null || (priceInfo = collectionDetailModel.getPriceInfo()) == null || (str2 = priceInfo.getPriceInUsd()) == null) {
                    str2 = "";
                }
                LIZ.append(str2);
                str = X1D.LIZIZ(LIZ);
            } else if (C78685UuP.LJJJZ(c254739zB.LIZLLL)) {
                str = c254739zB.LIZLLL;
            } else {
                str = c254739zB.LIZJ;
            }
            tuxTextView2.setText(str);
        }
    }
}
