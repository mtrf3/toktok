package com.bytedance.ies.ugc.aweme.commercialize.compliance.ata;

import X.ASL;
import X.ActivityC45651qj;
import X.C025908h;
import X.C03660Ck;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1DG;
import X.C234529Ii;
import X.C235119Kp;
import X.C26227ARb;
import X.C29S;
import X.C3AW;
import X.C3C5;
import X.C41327GJv;
import X.C43269GyX;
import X.C43271GyZ;
import X.C43272Gya;
import X.C43286Gyo;
import X.C58655N0h;
import X.C58704N2e;
import X.C76800UCe;
import X.C84763XOl;
import X.C90903hW;
import X.C9KF;
import X.DialogInterfaceOnDismissListenerC43268GyW;
import X.GKX;
import X.InterfaceC219588ja;
import X.InterfaceC43276Gye;
import X.LRD;
import X.UC0;
import X.X1D;
import Y.AObserverS75S0100000_7;
import Y.ARunnableS40S0100000_4;
import Y.ARunnableS43S0100000_7;
import Y.AfS59S0100000_7;
import Y.IDFactoryS63S0000000_7;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserVM;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfo;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfoItem;
import com.ss.android.ugc.aweme.commercialize.model.OrientationInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS30S1000000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DynamicAdExplainDialog extends Fragment implements InterfaceC219588ja, View.OnClickListener, InterfaceC43276Gye {
    public static final /* synthetic */ int LLFFF = 0;
    public final AwemeRawAd LJLIL;
    public final AboutAdInfo LJLILLLLZI;
    public final String LJLJI;
    public final ActivityC45651qj LJLJJI;
    public final int LJLJJL;
    public final InfoModel LJLJJLL;
    public Integer LJLJL;
    public Integer LJLJLJ;
    public final List<OrientationInfo> LJLJLLL;
    public RecyclerView LJLL;
    public C43272Gya LJLLI;
    public TuxSheet LJLLILLLL;
    public RelativeLayout LJLLJ;
    public TuxIconView LJLLL;
    public TuxIconView LJLLLL;
    public RelativeLayout LJLLLLLL;
    public AdvertiserVM LJLZ;
    public RelativeLayout LJZ;
    public TuxTextView LJZI;
    public int LJZL;
    public final String LL;
    public final String LLD;
    public long LLF;
    public final Map<Integer, View> LLFF;

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        String string = this.LJLJJI.getString(R.string.a9_);
        o.LJIIIIZZ(string, "activty.getString(R.string.about_this_ad_title)");
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new C43269GyX(this));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        return c235119Kp;
    }

    public final void show() {
        ASL asl = new ASL();
        asl.LIZIZ(this);
        asl.LIZ.LJLLJ = false;
        asl.LJ(new DialogInterfaceOnDismissListenerC43268GyW(this));
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZL = true;
        this.LJLLILLLL = tuxSheet;
        C1DG.LJII(this.LJLJJI, "activty.supportFragmentManager", tuxSheet, "DynamicAdExplain");
        LRD.LIZ(this.LJLJJI).LJIIJ("ad_explain_static_dynamic", true, new C41327GJv(this));
        this.LLF = System.currentTimeMillis();
    }

    public final void vl() {
        if (!o.LJ(this.LJLJL, this.LJLJLJ)) {
            AdvertiserModel advertiserModel = new AdvertiserModel(this.LJLIL.getAdvId(), null, null, this.LJLJL, null, 22, null);
            AdvertiserVM advertiserVM = this.LJLZ;
            if (advertiserVM != null) {
                advertiserVM.gv0(advertiserModel);
                AdvertiserVM advertiserVM2 = this.LJLZ;
                if (advertiserVM2 != null) {
                    advertiserVM2.LJLJI.observe(this, new AObserverS75S0100000_7(this, 4));
                    return;
                } else {
                    o.LJIJI("advertiserVM");
                    throw null;
                }
            }
            o.LJIJI("advertiserVM");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLFF).clear();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == R.id.c5c) {
            TuxIconView tuxIconView = this.LJLLL;
            if (tuxIconView != null) {
                tuxIconView.setTintColorRes(R.attr.eb);
                TuxIconView tuxIconView2 = this.LJLLL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setIconRes(R.raw.icon_thumbs_up_fill);
                    TuxIconView tuxIconView3 = this.LJLLL;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setClickable(false);
                        TuxIconView tuxIconView4 = this.LJLLLL;
                        if (tuxIconView4 != null) {
                            tuxIconView4.setClickable(false);
                            RelativeLayout relativeLayout = this.LJLLJ;
                            if (relativeLayout != null) {
                                relativeLayout.postDelayed(new ARunnableS43S0100000_7(this, 10), 1000L);
                                C58655N0h LIZLLL = C58704N2e.LIZLLL("about_this_ad", "otherclick", this.LJLIL);
                                LIZLLL.LIZJ("button", "refer");
                                LIZLLL.LIZIZ("yes", "feedback_value");
                                LIZLLL.LJI();
                                return;
                            }
                            o.LJIJI("feedbackView");
                            throw null;
                        }
                        o.LJIJI("feedbackViewNo");
                        throw null;
                    }
                    o.LJIJI("feedbackViewYes");
                    throw null;
                }
                o.LJIJI("feedbackViewYes");
                throw null;
            }
            o.LJIJI("feedbackViewYes");
            throw null;
        }
        if (num.intValue() != R.id.c5a) {
            return;
        }
        TuxIconView tuxIconView5 = this.LJLLLL;
        if (tuxIconView5 != null) {
            tuxIconView5.setTintColorRes(R.attr.gu);
            TuxIconView tuxIconView6 = this.LJLLLL;
            if (tuxIconView6 != null) {
                tuxIconView6.setIconRes(R.raw.icon_thumbs_up_fill);
                TuxIconView tuxIconView7 = this.LJLLLL;
                if (tuxIconView7 != null) {
                    tuxIconView7.setRotation(180.0f);
                    TuxIconView tuxIconView8 = this.LJLLL;
                    if (tuxIconView8 != null) {
                        tuxIconView8.setClickable(false);
                        TuxIconView tuxIconView9 = this.LJLLLL;
                        if (tuxIconView9 != null) {
                            tuxIconView9.setClickable(false);
                            TuxIconView tuxIconView10 = this.LJLLLL;
                            if (tuxIconView10 != null) {
                                tuxIconView10.postDelayed(new ARunnableS40S0100000_4(this, 17), 500L);
                                TuxIconView tuxIconView11 = this.LJLLLL;
                                if (tuxIconView11 != null) {
                                    tuxIconView11.postDelayed(new ARunnableS43S0100000_7(this, 11), 1000L);
                                    C58655N0h LIZLLL2 = C58704N2e.LIZLLL("about_this_ad", "otherclick", this.LJLIL);
                                    LIZLLL2.LIZJ("button", "refer");
                                    LIZLLL2.LIZIZ("no", "feedback_value");
                                    LIZLLL2.LJI();
                                    return;
                                }
                                o.LJIJI("feedbackViewNo");
                                throw null;
                            }
                            o.LJIJI("feedbackViewNo");
                            throw null;
                        }
                        o.LJIJI("feedbackViewNo");
                        throw null;
                    }
                    o.LJIJI("feedbackViewYes");
                    throw null;
                }
                o.LJIJI("feedbackViewNo");
                throw null;
            }
            o.LJIJI("feedbackViewNo");
            throw null;
        }
        o.LJIJI("feedbackViewNo");
        throw null;
    }

    @Override // X.InterfaceC43276Gye
    public final void J9(int i, OrientationInfo itemInfo) {
        OrientationInfo orientationInfo;
        OrientationInfo orientationInfo2;
        OrientationInfo orientationInfo3;
        OrientationInfo orientationInfo4;
        String string;
        String string2;
        o.LJIIIZ(itemInfo, "itemInfo");
        Integer infoType = itemInfo.getInfoType();
        if (infoType == null) {
            return;
        }
        if (infoType.intValue() == 8) {
            SmartRouter.buildRoute(this.LJLJJI, "//display/caption/setting").open();
            TuxSheet tuxSheet = this.LJLLILLLL;
            if (tuxSheet != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_not_other_exit", true);
                tuxSheet.setArguments(bundle);
                TuxSheet tuxSheet2 = this.LJLLILLLL;
                if (tuxSheet2 != null) {
                    tuxSheet2.dismiss();
                    return;
                } else {
                    o.LJIJI("sheet");
                    throw null;
                }
            }
            o.LJIJI("sheet");
            throw null;
        }
        if (infoType == null) {
            return;
        }
        if (infoType.intValue() == 11 || infoType.intValue() == 10) {
            String LIZ = C03660Ck.LIZ(this.LJLJJI, R.string.a94, "activty.resources.getStr…kalike_second_page_title)");
            Integer infoType2 = itemInfo.getInfoType();
            if (infoType2 == null || infoType2.intValue() != 11) {
                string = this.LJLJJI.getResources().getString(R.string.a88);
            } else {
                string = this.LJLJJI.getResources().getString(R.string.a92);
            }
            o.LJIIIIZZ(string, "if (itemInfo.infoType ==…cond_page_desc)\n        }");
            String string3 = this.LJLJJI.getResources().getString(R.string.a8z);
            o.LJIIIIZZ(string3, "activty.resources.getStr…d_how_to_hide_future_ads)");
            String LJJJJZ = ujb.o.LJJJJZ(string3, "\\n", "", false);
            Integer infoType3 = itemInfo.getInfoType();
            if (infoType3 == null || infoType3.intValue() != 11) {
                string2 = this.LJLJJI.getResources().getString(R.string.a87);
            } else {
                string2 = this.LJLJJI.getResources().getString(R.string.a91);
            }
            o.LJIIIIZZ(string2, "if (itemInfo.infoType ==…econd_page_CTA)\n        }");
            String LIZ2 = C03660Ck.LIZ(this.LJLJJI, R.string.a93, "activty.resources.getStr…alike_second_page_goback)");
            String LJJJJZ2 = ujb.o.LJJJJZ(string, "%s", String.valueOf(itemInfo.getLinkText()), false);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LJJJJZ2);
            LIZ3.append('\n');
            LIZ3.append(LJJJJZ);
            LIZ3.append('\n');
            LIZ3.append(string2);
            SpannableStringBuilder LIZ4 = GKX.LIZ(X1D.LIZIZ(LIZ3), LJJJJZ, null, null, null, null);
            C26227ARb LIZ5 = C3AW.LIZ(this.LJLJJI);
            LIZ5.LJFF(LIZ);
            LIZ5.LIZIZ(LIZ4);
            LIZ5.LJII = false;
            UC0.LIZJ(LIZ5, new AqS30S1000000_7(LIZ2, 5));
            LIZ5.LJI().LIZLLL();
            return;
        }
        if (infoType.intValue() != 10003) {
            return;
        }
        Integer num = this.LJLJLJ;
        if (num == null || num.intValue() != 2) {
            Integer num2 = this.LJLJLJ;
            if (num2 != null && num2.intValue() == 1) {
                this.LJLJLJ = 2;
                List<OrientationInfo> list = this.LJLJLLL;
                if (list != null && (orientationInfo4 = (OrientationInfo) ListProtector.get(list, i)) != null) {
                    orientationInfo4.setSwitch(2);
                }
                List<OrientationInfo> list2 = this.LJLJLLL;
                if (list2 != null && (orientationInfo3 = (OrientationInfo) ListProtector.get(list2, i)) != null) {
                    orientationInfo3.setButtonText(this.LLD);
                }
            }
        } else {
            this.LJLJLJ = 1;
            List<OrientationInfo> list3 = this.LJLJLLL;
            if (list3 != null && (orientationInfo2 = (OrientationInfo) ListProtector.get(list3, i)) != null) {
                orientationInfo2.setSwitch(1);
            }
            List<OrientationInfo> list4 = this.LJLJLLL;
            if (list4 != null && (orientationInfo = (OrientationInfo) ListProtector.get(list4, i)) != null) {
                orientationInfo.setButtonText(this.LL);
            }
        }
        C43272Gya c43272Gya = this.LJLLI;
        if (c43272Gya != null) {
            c43272Gya.notifyItemChanged(i, 0);
        }
        C025908h.LIZLLL("about_this_ad", "otherclick", this.LJLIL, "about_the_advertiser", "refer");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<AboutAdInfoItem> list;
        boolean z;
        String str;
        List<AboutAdInfoItem> advertiserItem;
        String str2;
        InfoModel infoModel;
        FundingParty fundingParty;
        Integer num;
        String str3;
        String str4;
        String str5;
        Integer num2;
        int i;
        Integer infoType;
        String str6;
        FundingParty fundingParty2;
        Integer infoType2;
        int i2;
        String str7;
        Integer num3;
        String str8;
        String str9;
        String str10;
        InfoModel infoModel2;
        Integer infoType3;
        InfoModel infoModel3;
        String str11;
        int i3;
        String str12;
        String str13;
        String str14;
        String str15;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLL = (RecyclerView) view.findViewById(R.id.myu);
        View findViewById = view.findViewById(R.id.c5_);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.default_feedback_text)");
        this.LJLLJ = (RelativeLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.c5e);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.d…t_feedback_thanks_layout)");
        this.LJLLLLLL = (RelativeLayout) findViewById2;
        this.LJZ = (RelativeLayout) view.findViewById(R.id.c51);
        this.LJZI = (TuxTextView) view.findViewById(R.id.c50);
        View findViewById3 = view.findViewById(R.id.c5c);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.default_feedback_text_yes)");
        this.LJLLL = (TuxIconView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c5a);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.default_feedback_text_no)");
        this.LJLLLL = (TuxIconView) findViewById4;
        TuxIconView tuxIconView = this.LJLLL;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, this);
            TuxIconView tuxIconView2 = this.LJLLLL;
            if (tuxIconView2 != null) {
                C16880lQ.LJJJ(tuxIconView2, this);
                HashMap hashMap = new HashMap();
                AboutAdInfo aboutAdInfo = this.LJLILLLLZI;
                if (aboutAdInfo != null) {
                    list = aboutAdInfo.getContentItem();
                } else {
                    list = null;
                }
                int i4 = 1;
                boolean z2 = false;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                Object obj = "";
                if (!z) {
                    for (AboutAdInfoItem aboutAdInfoItem : list) {
                        String groupTitle = aboutAdInfoItem.getGroupTitle();
                        List<OrientationInfo> orientationInfo = aboutAdInfoItem.getOrientationInfo();
                        if (orientationInfo != null && !orientationInfo.isEmpty()) {
                            int i5 = 0;
                            for (OrientationInfo orientationInfo2 : orientationInfo) {
                                int i6 = i5 + 1;
                                if (!TextUtils.isEmpty(orientationInfo2.getGeoCountryType())) {
                                    if (this.LJLJJL != 1) {
                                        InfoModel infoModel4 = this.LJLJJLL;
                                        if (infoModel4 != null) {
                                            str15 = infoModel4.getGeoText();
                                        } else {
                                            str15 = null;
                                        }
                                        if (TextUtils.isEmpty(str15)) {
                                        }
                                    }
                                    i5 = i6;
                                }
                                if (!TextUtils.isEmpty(orientationInfo2.getGeoCountryType())) {
                                    String fullText = orientationInfo2.getFullText();
                                    if (fullText != null) {
                                        InfoModel infoModel5 = this.LJLJJLL;
                                        if (infoModel5 == null || (str14 = infoModel5.getGeoText()) == null) {
                                            str14 = "";
                                        }
                                        str12 = ujb.o.LJJJJZ(fullText, "%s", str14, false);
                                    } else {
                                        str12 = null;
                                    }
                                    orientationInfo2.setFullText(str12);
                                    InfoModel infoModel6 = this.LJLJJLL;
                                    if (infoModel6 == null || (str13 = infoModel6.getGeoText()) == null) {
                                        str13 = "";
                                    }
                                    orientationInfo2.setLinkText(str13);
                                }
                                Integer infoType4 = orientationInfo2.getInfoType();
                                if ((infoType4 == null || infoType4.intValue() != 10 || (infoModel2 = this.LJLJJLL) == null || !o.LJ(infoModel2.getShowCustomerAudience(), Boolean.FALSE)) && ((infoType3 = orientationInfo2.getInfoType()) == null || infoType3.intValue() != 11 || (infoModel3 = this.LJLJJLL) == null || !o.LJ(infoModel3.getShowLookalikeAudience(), Boolean.FALSE))) {
                                    Integer infoType5 = orientationInfo2.getInfoType();
                                    if (infoType5 != null && infoType5.intValue() == 8) {
                                        ActivityC45651qj context = this.LJLJJI;
                                        o.LJIIIZ(context, "context");
                                        String LIZIZ = C43286Gyo.LIZ.LIZIZ().LIZIZ();
                                        o.LJIIIIZZ(LIZIZ, "get().getCurrentI18nItem(context).showName");
                                        orientationInfo2.setLinkText(LIZIZ);
                                        String fullText2 = orientationInfo2.getFullText();
                                        if (fullText2 != null) {
                                            String linkText = orientationInfo2.getLinkText();
                                            if (linkText == null) {
                                                linkText = "";
                                            }
                                            str11 = ujb.o.LJJJJZ(fullText2, "%s", linkText, false);
                                        } else {
                                            str11 = null;
                                        }
                                        orientationInfo2.setFullText(str11);
                                    }
                                    if (i5 == 0) {
                                        orientationInfo2.setTitle(groupTitle);
                                    }
                                    if (i5 == orientationInfo.size() - 1) {
                                        orientationInfo2.setLastItem(Boolean.TRUE);
                                    }
                                    orientationInfo2.setItemType(0);
                                    List<OrientationInfo> list2 = this.LJLJLLL;
                                    if (list2 != null) {
                                        ((ArrayList) list2).add(orientationInfo2);
                                    }
                                    Map<Integer, String> map = C43271GyZ.LIZJ;
                                    Integer infoType6 = orientationInfo2.getInfoType();
                                    if (infoType6 != null) {
                                        i3 = infoType6.intValue();
                                    } else {
                                        i3 = -1;
                                    }
                                    String str16 = map.get(Integer.valueOf(i3));
                                    if (str16 != null) {
                                        String linkText2 = orientationInfo2.getLinkText();
                                        if (linkText2 == null) {
                                            linkText2 = "";
                                        }
                                        hashMap.put(str16, linkText2);
                                    }
                                }
                                i5 = i6;
                            }
                        }
                    }
                } else {
                    RelativeLayout relativeLayout = this.LJZ;
                    if (relativeLayout != null) {
                        relativeLayout.setVisibility(0);
                    }
                    String LIZ = C03660Ck.LIZ(this.LJLJJI, R.string.a8i, "activty.resources.getStr…ad_fallback_description1)");
                    String LIZ2 = C03660Ck.LIZ(this.LJLJJI, R.string.a8m, "activty.resources.getStr…ck_more_info_hyperlink_2)");
                    String LJJJJZ = ujb.o.LJJJJZ(LIZ, "%s", LIZ2, false);
                    if (!TextUtils.isEmpty(LJJJJZ) && !TextUtils.isEmpty(LIZ2)) {
                        TuxTextView tuxTextView = this.LJZI;
                        if (tuxTextView != null) {
                            AwemeRawAd awemeRawAd = this.LJLIL;
                            Long valueOf = Long.valueOf(this.LLF);
                            TuxSheet tuxSheet = this.LJLLILLLL;
                            if (tuxSheet != null) {
                                tuxTextView.setText(GKX.LIZ(LJJJJZ, LIZ2, "https://www.tiktok.com/safety/en/ads-and-data/", awemeRawAd, valueOf, tuxSheet));
                            } else {
                                o.LJIJI("sheet");
                                throw null;
                            }
                        }
                        TuxTextView tuxTextView2 = this.LJZI;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                        }
                    } else {
                        TuxTextView tuxTextView3 = this.LJZI;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setText(LJJJJZ);
                        }
                    }
                }
                AboutAdInfo aboutAdInfo2 = this.LJLILLLLZI;
                if (aboutAdInfo2 != null && (advertiserItem = aboutAdInfo2.getAdvertiserItem()) != null && !advertiserItem.isEmpty()) {
                    for (AboutAdInfoItem aboutAdInfoItem2 : advertiserItem) {
                        String groupTitle2 = aboutAdInfoItem2.getGroupTitle();
                        List<OrientationInfo> orientationInfo3 = aboutAdInfoItem2.getOrientationInfo();
                        if (orientationInfo3 != null && !orientationInfo3.isEmpty()) {
                            int i7 = 0;
                            for (OrientationInfo orientationInfo4 : orientationInfo3) {
                                int i8 = i7 + 1;
                                if (!TextUtils.isEmpty(orientationInfo4.getGeoCountryType())) {
                                    if (this.LJLJJL != i4) {
                                        InfoModel infoModel7 = this.LJLJJLL;
                                        if (infoModel7 != null) {
                                            str10 = infoModel7.getCountryText();
                                        } else {
                                            str10 = null;
                                        }
                                        if (TextUtils.isEmpty(str10)) {
                                        }
                                    }
                                    i4 = 1;
                                    i7 = i8;
                                    z2 = false;
                                }
                                if (!TextUtils.isEmpty(orientationInfo4.getGeoCountryType())) {
                                    String fullText3 = orientationInfo4.getFullText();
                                    if (fullText3 != null) {
                                        InfoModel infoModel8 = this.LJLJJLL;
                                        if (infoModel8 == null || (str9 = infoModel8.getCountryText()) == null) {
                                            str9 = "";
                                        }
                                        str8 = ujb.o.LJJJJZ(fullText3, "%s", str9, z2);
                                    } else {
                                        str8 = null;
                                    }
                                    orientationInfo4.setFullText(str8);
                                }
                                if (i7 == 0) {
                                    orientationInfo4.setTitle(groupTitle2);
                                }
                                if (i7 == orientationInfo3.size() - i4) {
                                    orientationInfo4.setLastItem(Boolean.TRUE);
                                }
                                orientationInfo4.setItemType(Integer.valueOf(z2 ? 1 : 0));
                                Integer num4 = orientationInfo4.getSwitch();
                                if ((num4 != null && num4.intValue() == 2) || ((num3 = orientationInfo4.getSwitch()) != null && num3.intValue() == i4)) {
                                    orientationInfo4.setItemType(2);
                                    this.LJLJL = orientationInfo4.getSwitch();
                                    this.LJLJLJ = orientationInfo4.getSwitch();
                                    Integer num5 = orientationInfo4.getSwitch();
                                    if (num5 == null || num5.intValue() != 2) {
                                        str2 = this.LL;
                                    } else {
                                        str2 = this.LLD;
                                    }
                                    orientationInfo4.setButtonText(str2);
                                    this.LJZL = i7;
                                }
                                List<OrientationInfo> list3 = this.LJLJLLL;
                                if (list3 != null) {
                                    ((ArrayList) list3).add(orientationInfo4);
                                }
                                Integer infoType7 = orientationInfo4.getInfoType();
                                if (infoType7 != null && infoType7.intValue() == 10001 && (infoModel = this.LJLJJLL) != null && infoModel.getFundingParty() != null) {
                                    InfoModel infoModel9 = this.LJLJJLL;
                                    if (infoModel9 != null) {
                                        fundingParty = infoModel9.getFundingParty();
                                    } else {
                                        fundingParty = null;
                                    }
                                    if (fundingParty != null) {
                                        num = fundingParty.getInfoType();
                                    } else {
                                        num = null;
                                    }
                                    if (fundingParty != null) {
                                        str3 = fundingParty.getFullText();
                                    } else {
                                        str3 = null;
                                    }
                                    if (fundingParty != null) {
                                        str4 = fundingParty.getLinkUrl();
                                    } else {
                                        str4 = null;
                                    }
                                    if (fundingParty != null) {
                                        str5 = fundingParty.getLinkText();
                                    } else {
                                        str5 = null;
                                    }
                                    if (fundingParty != null) {
                                        num2 = fundingParty.getSwitch();
                                    } else {
                                        num2 = null;
                                    }
                                    OrientationInfo orientationInfo5 = new OrientationInfo(num, str3, str4, str5, null, null, null, null, num2, null, Integer.valueOf(z2 ? 1 : 0), null, null, 6896, null);
                                    List<OrientationInfo> list4 = this.LJLJLLL;
                                    if (list4 != null) {
                                        ((ArrayList) list4).add(orientationInfo5);
                                    }
                                    Map<Integer, String> map2 = C43271GyZ.LIZJ;
                                    if (fundingParty != null && (infoType2 = fundingParty.getInfoType()) != null) {
                                        i = infoType2.intValue();
                                    } else {
                                        i = -1;
                                    }
                                    String str17 = map2.get(Integer.valueOf(i));
                                    if (str17 != null && fundingParty != null && (infoType = fundingParty.getInfoType()) != null && infoType.intValue() == 10004) {
                                        InfoModel infoModel10 = this.LJLJJLL;
                                        if (infoModel10 == null || (fundingParty2 = infoModel10.getFundingParty()) == null || (str6 = fundingParty2.getEventTrackingText()) == null) {
                                            str6 = "";
                                        }
                                        hashMap.put(str17, str6);
                                    }
                                }
                                Map<Integer, String> map3 = C43271GyZ.LIZJ;
                                Integer infoType8 = orientationInfo4.getInfoType();
                                if (infoType8 != null) {
                                    i2 = infoType8.intValue();
                                } else {
                                    i2 = -1;
                                }
                                String str18 = map3.get(Integer.valueOf(i2));
                                if (str18 != null) {
                                    Integer infoType9 = orientationInfo4.getInfoType();
                                    if (infoType9 != null && infoType9.intValue() == 10001) {
                                        String eventTrackingText = orientationInfo4.getEventTrackingText();
                                        if (eventTrackingText == null) {
                                            eventTrackingText = "";
                                        }
                                        hashMap.put(str18, eventTrackingText);
                                    }
                                    Integer infoType10 = orientationInfo4.getInfoType();
                                    if (infoType10 != null && infoType10.intValue() == 10002) {
                                        InfoModel infoModel11 = this.LJLJJLL;
                                        if (infoModel11 == null || (str7 = infoModel11.getCountryText()) == null) {
                                            str7 = "";
                                        }
                                        hashMap.put(str18, str7);
                                    }
                                }
                                i4 = 1;
                                i7 = i8;
                                z2 = false;
                            }
                        }
                    }
                }
                String LIZ3 = C03660Ck.LIZ(this.LJLJJI, R.string.a81, "activty.resources.getStr…_this_ad_adjust_settings)");
                List<OrientationInfo> list5 = this.LJLJLLL;
                if (list5 != null) {
                    AboutAdInfo aboutAdInfo3 = this.LJLILLLLZI;
                    if (aboutAdInfo3 != null) {
                        str = aboutAdInfo3.getLinkText();
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        AboutAdInfo aboutAdInfo4 = this.LJLILLLLZI;
                        if (aboutAdInfo4 != null) {
                            LIZ3 = aboutAdInfo4.getLinkText();
                        } else {
                            LIZ3 = null;
                        }
                    }
                    ((ArrayList) list5).add(new OrientationInfo(0, LIZ3, null, null, null, null, null, null, null, null, 1, Boolean.FALSE, null, 5116, null));
                }
                C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", this.LJLIL);
                LIZLLL.LIZJ("about_tiktok_ads", "refer");
                Object obj2 = hashMap.get("AGE");
                if (obj2 == null) {
                    obj2 = "";
                }
                LIZLLL.LIZIZ(obj2, "age_range");
                Object obj3 = hashMap.get("CREATOR");
                if (obj3 == null) {
                    obj3 = "";
                }
                LIZLLL.LIZIZ(obj3, "behavior_creator_categories");
                Object obj4 = hashMap.get("VIDEO");
                if (obj4 == null) {
                    obj4 = "";
                }
                LIZLLL.LIZIZ(obj4, "behavior_video_categories");
                Object obj5 = hashMap.get("INTEREST");
                if (obj5 == null) {
                    obj5 = "";
                }
                LIZLLL.LIZIZ(obj5, "interest_categories");
                Object obj6 = hashMap.get("LOCATION");
                if (obj6 == null) {
                    obj6 = "";
                }
                LIZLLL.LIZIZ(obj6, "location");
                Object obj7 = hashMap.get("BUSINESS_NAME");
                if (obj7 == null) {
                    obj7 = "";
                }
                LIZLLL.LIZIZ(obj7, "business_name");
                Object obj8 = hashMap.get("ADV_LOCATION");
                if (obj8 == null) {
                    obj8 = "";
                }
                LIZLLL.LIZIZ(obj8, "business_location");
                Object obj9 = hashMap.get("GENDER");
                if (obj9 == null) {
                    obj9 = "";
                }
                LIZLLL.LIZIZ(obj9, "gender_status");
                Object obj10 = hashMap.get("LANGUAGE_LIST");
                if (obj10 == null) {
                    obj10 = "";
                }
                LIZLLL.LIZIZ(obj10, "app_langugage");
                Object obj11 = hashMap.get("BEHAVIOR_CREATOR");
                if (obj11 == null) {
                    obj11 = "";
                }
                LIZLLL.LIZIZ(obj11, "behavior_creator_categories");
                Object obj12 = hashMap.get("LOOKALIKE_AUDIENCE");
                if (obj12 == null) {
                    obj12 = "";
                }
                LIZLLL.LIZIZ(obj12, "look_like_audience");
                Object obj13 = hashMap.get("CUSTOMER_AUDIENCE");
                if (obj13 == null) {
                    obj13 = "";
                }
                LIZLLL.LIZIZ(obj13, "customer_web_interaction");
                Object obj14 = hashMap.get("FUNDING_PARTY");
                if (obj14 != null) {
                    obj = obj14;
                }
                LIZLLL.LIZIZ(obj, "funding_party");
                LIZLLL.LIZIZ(this.LJLJL, "toggle_initial_status");
                LIZLLL.LJI();
                hashMap.clear();
                C84763XOl.LJI().LJJJJZI(new AfS59S0100000_7(this, 31));
                ActivityC45651qj activity = this.LJLJJI;
                o.LJIIIZ(activity, "activity");
                this.LJLZ = (AdvertiserVM) ViewModelProviders.of(activity, new IDFactoryS63S0000000_7(0)).get(AdvertiserVM.class);
                this.LLF = System.currentTimeMillis();
                RecyclerView recyclerView = this.LJLL;
                if (recyclerView != null) {
                    this.LJLJJI.getBaseContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                }
                AwemeRawAd awemeRawAd2 = this.LJLIL;
                String str19 = this.LJLJI;
                Long valueOf2 = Long.valueOf(this.LLF);
                TuxSheet tuxSheet2 = this.LJLLILLLL;
                if (tuxSheet2 != null) {
                    C43272Gya c43272Gya = new C43272Gya(awemeRawAd2, str19, valueOf2, tuxSheet2, this, this.LJLJJI);
                    this.LJLLI = c43272Gya;
                    List<OrientationInfo> list6 = this.LJLJLLL;
                    if (list6 == null) {
                        list6 = new ArrayList<>();
                    }
                    c43272Gya.LJLJL = list6;
                    RecyclerView recyclerView2 = this.LJLL;
                    if (recyclerView2 == null) {
                        return;
                    }
                    recyclerView2.setAdapter(this.LJLLI);
                    return;
                }
                o.LJIJI("sheet");
                throw null;
            }
            o.LJIJI("feedbackViewNo");
            throw null;
        }
        o.LJIJI("feedbackViewYes");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.amh, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    public DynamicAdExplainDialog(ActivityC45651qj act, AwemeRawAd awemeRawAd, String pageEnterFrom, int i, InfoModel infoModel) {
        o.LJIIIZ(act, "act");
        o.LJIIIZ(awemeRawAd, "awemeRawAd");
        o.LJIIIZ(pageEnterFrom, "pageEnterFrom");
        this.LLFF = new LinkedHashMap();
        this.LJLIL = awemeRawAd;
        this.LJLILLLLZI = awemeRawAd.getAboutThisAd();
        this.LJLJI = pageEnterFrom;
        this.LJLJJI = act;
        this.LJLJJL = i;
        this.LJLJJLL = infoModel;
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        this.LJLJLLL = new ArrayList();
        this.LJZL = -1;
        String string = act.getString(R.string.i9);
        o.LJIIIIZZ(string, "activty.getString(R.stri…ings_warning_CTA_proceed)");
        this.LL = string;
        String string2 = act.getString(R.string.a9f);
        o.LJIIIIZZ(string2, "activty.getString(R.stri…about_this_adv_unhideadv)");
        this.LLD = string2;
    }
}
