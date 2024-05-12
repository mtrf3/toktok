package com.ss.android.ugc.aweme.profile.ui;

import X.AI8;
import X.AIF;
import X.AbstractC234519Ih;
import X.AbstractC65743Pr9;
import X.ActivityC45651qj;
import X.AnonymousClass036;
import X.C0NY;
import X.C10A;
import X.C119634ml;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C188727au;
import X.C1A7;
import X.C1C8;
import X.C2068389v;
import X.C221018lt;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C237559Tz;
import X.C237939Vl;
import X.C238099Wb;
import X.C238129We;
import X.C238259Wr;
import X.C238269Ws;
import X.C238279Wt;
import X.C238289Wu;
import X.C244099i1;
import X.C244309iM;
import X.C244379iT;
import X.C252709vu;
import X.C255199zv;
import X.C26338AVi;
import X.C29S;
import X.C2U8;
import X.C38306F1q;
import X.C38333F2r;
import X.C3C5;
import X.C44384HbQ;
import X.C47261Igj;
import X.C56642Ke;
import X.C5S1;
import X.C62822Ol8;
import X.C62905OmT;
import X.C62906OmU;
import X.C64698PaI;
import X.C6ZT;
import X.C73040SlY;
import X.C73305Spp;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78598Ut0;
import X.C78605Ut7;
import X.C78765Uvh;
import X.C78975Uz5;
import X.C78983UzD;
import X.C79045V0n;
import X.C82544WaS;
import X.C86202XsM;
import X.C90903hW;
import X.C9KF;
import X.C9ND;
import X.C9VC;
import X.C9VE;
import X.C9VF;
import X.C9VG;
import X.C9VL;
import X.C9W3;
import X.C9WC;
import X.EF7;
import X.EnumC26164AOq;
import X.FMX;
import X.HG3;
import X.InterfaceC238009Vs;
import X.InterfaceC238019Vt;
import X.InterfaceC243979hp;
import X.InterfaceC26189APp;
import X.InterfaceC26320AUq;
import X.InterfaceC66555QAd;
import X.KL2;
import X.OJD;
import X.QBK;
import X.QBP;
import X.QD3;
import X.QZP;
import X.RBX;
import X.SFS;
import X.SYL;
import X.W5I;
import X.X1D;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS26S1200000_4;
import Y.ARunnableS5S1100000_4;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.edit.InstagramPresenter;
import com.ss.android.ugc.aweme.profile.edit.TwitterPresenter;
import com.ss.android.ugc.aweme.profile.edit.YoutubePresenter;
import com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.ProfileAdvancedFeaturesCell;
import com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncService;
import com.ss.android.ugc.aweme.profile.editprofile.vm.ProfileEditProfileViewModel;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.SpecialAccount;
import com.ss.android.ugc.aweme.profile.model.TTSeller;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserBioPermission;
import com.ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment;
import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import ujb.s;
import yq4.a;

/* loaded from: classes5.dex */
public class ProfileEditFragment extends Hilt_ProfileEditFragment implements InterfaceC26189APp, InterfaceC26320AUq, InterfaceC238009Vs, InterfaceC66555QAd, QBK, QBP, InterfaceC243979hp, InterfaceC238019Vt {
    public static final List<String> LLJJJIL = Arrays.asList("photo", "video", "nickname", "supported_ngo", "bio", "instagram", "twitter", "youtube", "category", "website", "bio_email");
    public static final List<String> LLJJJJ = C47261Igj.LJJIJIIJI("twitter", "instagram", "youtube");
    public List<String> LJLJJI;
    public C119634ml LJLJJLL;
    public C73305Spp LJLJL;
    public UserPresenter LJLJLJ;
    public AvatarPresenter LJLJLLL;
    public User LJLL;
    public C244379iT LJLLI;
    public boolean LJLLILLLL;
    public LinearLayout LJLLJ;
    public LinearLayout LJLLL;
    public TextView LJLLLL;
    public AI8 LJLLLLLL;
    public AI8 LJLZ;
    public AI8 LJZ;
    public AI8 LJZI;
    public AI8 LJZL;
    public AI8 LL;
    public AI8 LLD;
    public AI8 LLF;
    public AI8 LLFF;
    public AI8 LLFFF;
    public AI8 LLFII;
    public View LLFZ;
    public TuxTextView LLI;
    public AI8 LLIFFJFJJ;
    public AI8 LLII;
    public AI8 LLIIII;
    public AI8 LLIIIILZ;
    public AI8 LLIIIJ;
    public View LLIIIL;
    public AI8 LLIIIZ;
    public AI8 LLIIJI;
    public AI8 LLIIJLIL;
    public AI8 LLIIL;
    public SYL LLIILII;
    public TuxTextView LLIILZL;
    public View LLIIZ;
    public InstagramPresenter LLIL;
    public TwitterPresenter LLILII;
    public YoutubePresenter LLILIL;
    public C78975Uz5 LLILL;
    public int LLILLIZIL;
    public ProfileNgoStruct LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public String LLIZ;
    public ProfileEditProfileViewModel LLIZLLLIL;
    public C73318Sq2 LLJ;
    public C1C8 LLJI;
    public boolean LLJIJIL;
    public String LLJJI;
    public C237939Vl LLJJIII;
    public User LLJJIJIL;
    public final Map<Integer, View> LLJJJ = new LinkedHashMap();
    public final C188727au LJLJJL = new C188727au();
    public String LLILLJJLI = "";
    public final C62822Ol8 LLJILJIL = C221108m2.LIZIZ(C238289Wu.LJLIL);
    public final C62822Ol8 LLJILJILJ = C221108m2.LIZIZ(C238279Wt.LJLIL);
    public final C62822Ol8 LLJILLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 694));
    public final C62822Ol8 LLJJ = C221108m2.LIZIZ(C238269Ws.LJLIL);
    public final List<C238129We> LLJJIJI = new ArrayList();
    public final C62822Ol8 LLJJIJIIJIL = C221108m2.LIZIZ(C238259Wr.LJLIL);

    public final void Nm() {
        Al(false);
        ((ProfileNameSyncService) this.LLJJIJIIJIL.getValue()).LIZLLL(this, this.LLJJIJI, new AqS154S0100000_4(this, 695));
        ((ArrayList) this.LLJJIJI).clear();
    }

    public int Ol() {
        return R.layout.c4z;
    }

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLJJJ).clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLJJJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC238009Vs
    public final void k4() {
    }

    public final AvatarPresenter Jl() {
        AvatarPresenter avatarPresenter = this.LJLJLLL;
        if (avatarPresenter != null) {
            return avatarPresenter;
        }
        o.LJIJI("avatarPresenter");
        throw null;
    }

    public final AI8 Kl() {
        AI8 ai8 = this.LJZI;
        if (ai8 != null) {
            return ai8;
        }
        o.LJIJI("bioTuxCell");
        throw null;
    }

    public final C119634ml Ll() {
        C119634ml c119634ml = this.LJLJJLL;
        if (c119634ml != null) {
            return c119634ml;
        }
        o.LJIJI("headerImage");
        throw null;
    }

    public final InstagramPresenter Ml() {
        InstagramPresenter instagramPresenter = this.LLIL;
        if (instagramPresenter != null) {
            return instagramPresenter;
        }
        o.LJIJI("instagramPresenter");
        throw null;
    }

    public final AI8 Nl() {
        AI8 ai8 = this.LJLLLLLL;
        if (ai8 != null) {
            return ai8;
        }
        o.LJIJI("nickNameTuxCell");
        throw null;
    }

    public final void Om() {
        C73305Spp c73305Spp = this.LJLJL;
        if (c73305Spp != null) {
            if (c73305Spp.getVisibility() != 0) {
                C73305Spp c73305Spp2 = this.LJLJL;
                if (c73305Spp2 != null) {
                    c73305Spp2.setVisibility(0);
                } else {
                    o.LJIJI("statusView");
                    throw null;
                }
            }
            C73305Spp c73305Spp3 = this.LJLJL;
            if (c73305Spp3 != null) {
                c73305Spp3.LJFF();
                return;
            } else {
                o.LJIJI("statusView");
                throw null;
            }
        }
        o.LJIJI("statusView");
        throw null;
    }

    public final boolean Pl() {
        return ((Boolean) this.LLJJ.getValue()).booleanValue();
    }

    public final boolean Ql() {
        return ((Boolean) this.LLJILJILJ.getValue()).booleanValue();
    }

    public final boolean Rl() {
        return ((Boolean) this.LLJILLL.getValue()).booleanValue();
    }

    public final boolean Sl() {
        return ((Boolean) this.LLJILJIL.getValue()).booleanValue();
    }

    public final TwitterPresenter Tl() {
        TwitterPresenter twitterPresenter = this.LLILII;
        if (twitterPresenter != null) {
            return twitterPresenter;
        }
        o.LJIJI("twitterPresenter");
        throw null;
    }

    public final C244379iT Wl() {
        C244379iT c244379iT = this.LJLLI;
        if (c244379iT != null) {
            return c244379iT;
        }
        o.LJIJI("updateUserInfo");
        throw null;
    }

    public final AI8 Xl() {
        AI8 ai8 = this.LJLZ;
        if (ai8 != null) {
            return ai8;
        }
        o.LJIJI("userNameTuxCell");
        throw null;
    }

    public final UserPresenter Yl() {
        UserPresenter userPresenter = this.LJLJLJ;
        if (userPresenter != null) {
            return userPresenter;
        }
        o.LJIJI("userPresenter");
        throw null;
    }

    public final AI8 cm() {
        AI8 ai8 = this.LJZL;
        if (ai8 != null) {
            return ai8;
        }
        o.LJIJI("websiteTuxCell");
        throw null;
    }

    public final YoutubePresenter dm() {
        YoutubePresenter youtubePresenter = this.LLILIL;
        if (youtubePresenter != null) {
            return youtubePresenter;
        }
        o.LJIJI("youtubePresenter");
        throw null;
    }

    public final void fm() {
        boolean z;
        String string;
        String contentValue;
        String str;
        int i;
        TTSeller seller;
        Date date = new Date(getUser().getHandleModified() * 1000);
        int abs = Math.abs((int) ((new Date().getTime() - date.getTime()) / 86400000));
        if (this.LLILLIZIL == 0) {
            C244309iM.LJII("enter_profile_username", "click_username", "username");
        }
        if (abs > 30) {
            z = true;
            string = getString(R.string.fl9);
            o.LJIIIIZZ(string, "{\n            getString(…_username_hint)\n        }");
        } else {
            z = false;
            BDDateFormat bDDateFormat = new BDDateFormat("LL");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(5, 30);
            long time = calendar.getTime().getTime();
            Locale locale = Locale.getDefault();
            o.LJIIIIZZ(locale, "getDefault()");
            string = getString(R.string.tjg, bDDateFormat.LIZIZ(time, locale));
            o.LJIIIIZZ(string, "{\n            getString(…,\n            )\n        }");
        }
        if (Rl()) {
            string = getString(R.string.fi7);
            o.LJIIIIZZ(string, "getString(R.string.editP…sername_edit_description)");
        }
        if (!Dl(this.LLILLJJLI)) {
            contentValue = this.LLILLJJLI;
        } else {
            contentValue = "";
        }
        int i2 = this.LLILLIZIL;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    str = "edit_profile_page";
                } else {
                    str = "tiktok_message";
                }
            } else {
                str = "modify_username_notify";
            }
        } else {
            str = "personal_homepage";
        }
        SpecialAccount specialAccount = getUser().specialAccount;
        if (specialAccount != null && (seller = specialAccount.getSeller()) != null) {
            i = seller.getType();
        } else {
            i = -1;
        }
        String string2 = getString(R.string.fkr);
        o.LJIIIIZZ(string2, "getString(R.string.edit_profile_username_title)");
        String customVerify = getUser().getCustomVerify();
        String enterpriseVerifyReason = getUser().getEnterpriseVerifyReason();
        Integer valueOf = Integer.valueOf(i);
        o.LJIIIZ(contentValue, "contentValue");
        ProfileEditUsernameFragment profileEditUsernameFragment = new ProfileEditUsernameFragment();
        Bundle LIZJ = AnonymousClass036.LIZJ("content_name", string2, "content_value", contentValue);
        LIZJ.putString("enter_from", str);
        LIZJ.putBoolean("is_edit_enabled", z);
        LIZJ.putString("edit_hint", string);
        LIZJ.putInt("content_max_length", 24);
        LIZJ.putBoolean("is_enable_null", false);
        LIZJ.putString("custom_verify", customVerify);
        LIZJ.putString("enterprise_verify_reason", enterpriseVerifyReason);
        LIZJ.putString("special_account", String.valueOf(valueOf));
        profileEditUsernameFragment.setArguments(LIZJ);
        profileEditUsernameFragment.setUserVisibleHint(true);
        profileEditUsernameFragment.LJLLLL = new C9W3() { // from class: X.9i3
            @Override // X.C9W3
            public final void LIZ(String content, C237939Vl c237939Vl) {
                o.LJIIIZ(content, "content");
                ProfileEditFragment.this.Hm(content, c237939Vl);
            }
        };
        profileEditUsernameFragment.Al(this);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            FragmentManager supportFragmentManager = mo49getActivity.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            profileEditUsernameFragment.show(supportFragmentManager, "EditUserNameDialog");
        }
    }

    public final User getUser() {
        User user = this.LJLL;
        if (user != null) {
            return user;
        }
        o.LJIJI("user");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x009e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x02a0, code lost:
    
        if (r11 != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x02a6, code lost:
    
        if (r11.enableActionButton() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x02a8, code lost:
    
        r1 = r22.LLII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x02aa, code lost:
    
        if (r1 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x02ac, code lost:
    
        xl(r1, "ba_action_buttons");
        r1.setVisibility(0);
        r2.LJJI("info");
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x02bd, code lost:
    
        if (r11.enableProfileDisplay() == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x02bf, code lost:
    
        r1 = r22.LLIIII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x02c1, code lost:
    
        if (r1 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x02c3, code lost:
    
        xl(r1, "ba_profile_display");
        r1.setVisibility(0);
        r2.LJJI("display");
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x02d4, code lost:
    
        if (r11.enableLeadsFrom() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x02d6, code lost:
    
        r1 = r22.LLIIIILZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x02d8, code lost:
    
        if (r1 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x02da, code lost:
    
        xl(r1, "ba_leads_from");
        r1.setVisibility(0);
        r2.LJJI("leads_from");
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x028f, code lost:
    
        if (r11.enableWebsite() != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x037f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x048b, code lost:
    
        if (r17 != null) goto L244;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00cc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:295:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0753 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:692:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0b3a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initData() {
        /*
            Method dump skipped, instructions count: 2978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment.initData():void");
    }

    public final void wl() {
        AI8 ai8 = this.LLIIJI;
        if (ai8 != null) {
            xl(ai8, "instagram");
            AI8 ai82 = this.LLIIJLIL;
            if (ai82 != null) {
                xl(ai82, "youtube");
                AI8 ai83 = this.LLIIL;
                if (ai83 != null) {
                    xl(ai83, "twitter");
                    return;
                } else {
                    o.LJIJI("twitterTuxCell");
                    throw null;
                }
            }
            o.LJIJI("youtubeTuxCell");
            throw null;
        }
        o.LJIJI("instagramTuxCell");
        throw null;
    }

    public final void Am() {
        AI8 ai8;
        int i;
        int i2;
        int i3;
        View findViewById;
        final boolean twitter = C244099i1.LIZ().getTwitter();
        final boolean ins = C244099i1.LIZ().getIns();
        final boolean youtube = C244099i1.LIZ().getYoutube();
        if (!twitter && !ins && !youtube) {
            View view = getView();
            if (view == null || (findViewById = view.findViewById(R.id.g6a)) == null) {
                return;
            }
            findViewById.setVisibility(8);
            return;
        }
        View view2 = getView();
        if (view2 == null || (ai8 = (AI8) view2.findViewById(R.id.vr)) == null) {
            return;
        }
        User user = this.LLJJIJIL;
        if (user != null) {
            final boolean LJJJJ = C78983UzD.LJJJJ(user.getTwitterName());
            User user2 = this.LLJJIJIL;
            if (user2 != null) {
                final boolean LJJJJ2 = C78983UzD.LJJJJ(user2.getInsId());
                User user3 = this.LLJJIJIL;
                if (user3 != null) {
                    final boolean LJJJJ3 = C78983UzD.LJJJJ(user3.getYoutubeChannelTitle());
                    AI8 ai82 = this.LLIIL;
                    if (ai82 != null) {
                        if (LJJJJ) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        ai82.setVisibility(i);
                        AI8 ai83 = this.LLIIJI;
                        if (ai83 != null) {
                            if (LJJJJ2) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            ai83.setVisibility(i2);
                            AI8 ai84 = this.LLIIJLIL;
                            if (ai84 != null) {
                                if (LJJJJ3) {
                                    i3 = 0;
                                } else {
                                    i3 = 8;
                                }
                                ai84.setVisibility(i3);
                                AI8 ai85 = this.LLIIL;
                                if (ai85 != null) {
                                    SFS.LJJIJLIJ(ai85);
                                    AI8 ai86 = this.LLIIJI;
                                    if (ai86 != null) {
                                        SFS.LJJIJLIJ(ai86);
                                        AI8 ai87 = this.LLIIJLIL;
                                        if (ai87 != null) {
                                            SFS.LJJIJLIJ(ai87);
                                            if (!LJJJJ) {
                                                this.LJLJJL.LJI("twitter", "");
                                            }
                                            if (!LJJJJ2) {
                                                this.LJLJJL.LJI("instagram", "");
                                            }
                                            if (!LJJJJ3) {
                                                this.LJLJJL.LJI("youtube", "");
                                            }
                                            wl();
                                            if ((twitter && !LJJJJ) || ((ins && !LJJJJ2) || (youtube && !LJJJJ3))) {
                                                ai8.setVisibility(0);
                                                SFS.LJJIJL(ai8);
                                                AIF LJIILIIL = SFS.LJIILIIL(ai8);
                                                if (LJIILIIL != null) {
                                                    LJIILIIL.LJIILJJIL(new View.OnClickListener() { // from class: X.9hu
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view3) {
                                                            C188727au c188727au = new C188727au();
                                                            c188727au.LJIIIZ("enter_from", "personal_homepage");
                                                            FMX.LJIIL("click_social_account_entry", c188727au.LIZ);
                                                            ArrayList arrayList = new ArrayList();
                                                            boolean z = twitter;
                                                            boolean z2 = LJJJJ;
                                                            ProfileEditFragment profileEditFragment = ProfileEditFragment.this;
                                                            boolean z3 = ins;
                                                            boolean z4 = LJJJJ2;
                                                            boolean z5 = youtube;
                                                            boolean z6 = LJJJJ3;
                                                            if (z && !z2) {
                                                                profileEditFragment.getClass();
                                                                C252669vq c252669vq = new C252669vq();
                                                                c252669vq.LIZ(R.string.fhy);
                                                                c252669vq.LJ = new ACListenerS21S0100000_1(new AqS170S0100000_4(profileEditFragment, 573), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                                                                arrayList.add(c252669vq);
                                                            }
                                                            if (z3 && !z4) {
                                                                profileEditFragment.getClass();
                                                                C252669vq c252669vq2 = new C252669vq();
                                                                c252669vq2.LIZ(R.string.fhv);
                                                                c252669vq2.LJ = new ACListenerS21S0100000_1(new AqS170S0100000_4(profileEditFragment, 571), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                                                                arrayList.add(c252669vq2);
                                                            }
                                                            if (z5 && !z6) {
                                                                profileEditFragment.getClass();
                                                                C252669vq c252669vq3 = new C252669vq();
                                                                c252669vq3.LIZ(R.string.fhw);
                                                                c252669vq3.LJ = new ACListenerS21S0100000_1(new AqS170S0100000_4(profileEditFragment, 575), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                                                                arrayList.add(c252669vq3);
                                                            }
                                                            C245319jz c245319jz = new C245319jz();
                                                            c245319jz.LJFF(arrayList);
                                                            TuxActionSheet LIZJ = c245319jz.LIZJ();
                                                            FragmentManager requireFragmentManager = ProfileEditFragment.this.requireFragmentManager();
                                                            o.LJIIIIZZ(requireFragmentManager, "requireFragmentManager()");
                                                            LIZJ.show(requireFragmentManager, "ADD_SOCIAL_LINKS");
                                                        }
                                                    });
                                                    return;
                                                }
                                                return;
                                            }
                                            ai8.setVisibility(8);
                                            return;
                                        }
                                        o.LJIJI("youtubeTuxCell");
                                        throw null;
                                    }
                                    o.LJIJI("instagramTuxCell");
                                    throw null;
                                }
                                o.LJIJI("twitterTuxCell");
                                throw null;
                            }
                            o.LJIJI("youtubeTuxCell");
                            throw null;
                        }
                        o.LJIJI("instagramTuxCell");
                        throw null;
                    }
                    o.LJIJI("twitterTuxCell");
                    throw null;
                }
                o.LJIJI("userCache");
                throw null;
            }
            o.LJIJI("userCache");
            throw null;
        }
        o.LJIJI("userCache");
        throw null;
    }

    public final void Gl() {
        int i;
        String str;
        if (!isViewValid() || this.LLILZ) {
            return;
        }
        if (getUser().naviId != null) {
            i = 1;
        } else {
            i = 0;
        }
        C244309iM.LJI(i, "replace_profile_photo", "photo");
        AvatarPresenter Jl = Jl();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        C119634ml Ll = Ll();
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        User curUser2 = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser2.getBoldFields() != null && curUser2.getBoldFields().contains("photo")) {
            str = "edit";
        } else {
            str = "add";
        }
        Jl.onClickAvatarImage(0, mo49getActivity, Ll, curUser, str);
    }

    @Override // X.QBP
    public final void Go() {
        if (getContext() == null) {
            return;
        }
        Al(false);
        C5S1 c5s1 = new C5S1(getContext());
        c5s1.LIZLLL(getString(R.string.tem));
        c5s1.LJ();
    }

    public final void Mm() {
        FragmentManager fragmentManager;
        DialogFragment selectDonationDialog = AVExternalServiceImpl.LIZ().donationService().getSelectDonationDialog(new IDonationService.OnDonationOrgChangeListener() { // from class: X.9hz
            @Override // com.ss.android.ugc.aweme.services.external.IDonationService.OnDonationOrgChangeListener
            public final void onDismiss() {
            }

            @Override // com.ss.android.ugc.aweme.services.external.IDonationService.OnDonationOrgChangeListener
            public final void onOrgSelected(IDonationService.OrganizationModel org2) {
                o.LJIIIZ(org2, "org");
                if (!ProfileEditFragment.this.Rl()) {
                    ProfileEditFragment profileEditFragment = ProfileEditFragment.this;
                    AI8 ai8 = profileEditFragment.LLFF;
                    if (ai8 != null) {
                        profileEditFragment.Im(ai8, org2.getName(), false);
                    } else {
                        o.LJIJI("nonprofitTuxCell");
                        throw null;
                    }
                }
                ProfileEditFragment.this.Em(org2);
            }
        });
        if (selectDonationDialog.isAdded() || (fragmentManager = getFragmentManager()) == null) {
            return;
        }
        selectDonationDialog.show(fragmentManager, "profile_edit_select_donation");
    }

    public final void Tm() {
        boolean z;
        boolean z2;
        String nickname;
        if (getUser().getNickNameModifyTs() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (o.LJ(getUser().getNickname(), getUser().getUniqueId()) || (nickname = getUser().getNickname()) == null || nickname.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Sl()) {
            if (z && z2) {
                SFS.LJJIJIL(Nl());
            } else {
                Nl().setTitle(getUser().getNickname());
                SFS.LJJIJLIJ(Nl());
            }
            C244309iM.LJIIL(!z);
            xl(Nl(), "nickname");
            return;
        }
        if (Ql()) {
            if (z) {
                AI8 Nl = Nl();
                String string = getString(R.string.fhf);
                o.LJIIIIZZ(string, "getString(R.string.editP…ofileV2_name_placeholder)");
                SFS.LJJIIZ(Nl, string, z2);
            } else {
                AI8 Nl2 = Nl();
                String nickname2 = getUser().getNickname();
                o.LJIIIIZZ(nickname2, "user.nickname");
                SFS.LJJIIZI(Nl2, nickname2);
            }
            C244309iM.LJIIL(!z);
            xl(Nl(), "nickname");
            return;
        }
        Im(Nl(), getUser().getNickname(), false);
        C244309iM.LJIIL(!z);
        xl(Nl(), "nickname");
    }

    public final void em() {
        int i;
        String Zl = Zl(Nl());
        if (getUser().getNickNameModifyTs() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", "name");
        c188727au.LJIIIZ("enter_method", "click_name");
        c188727au.LIZLLL(i, "complete_status");
        FMX.LJIIL("enter_profile_name", c188727au.LIZ);
        ProfileEditNicknameFragment LIZ = C9VG.LIZ(C255199zv.LJI(getUser(), "click_save", "nickname"), Zl);
        LIZ.setUserVisibleHint(true);
        LIZ.LJLZ = new C9VL() { // from class: X.9i2
            @Override // X.C9VL
            public final void LIZ(String str, C237939Vl c237939Vl) {
                ProfileEditFragment profileEditFragment = ProfileEditFragment.this;
                profileEditFragment.LLJJIII = c237939Vl;
                profileEditFragment.Tm();
                ProfileEditFragment.this.ym(str);
            }
        };
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "requireActivity().supportFragmentManager");
        LIZ.show(supportFragmentManager, "EditWebsiteDialog");
    }

    @Override // X.QBK
    public final void n10() {
        if (getContext() == null) {
            return;
        }
        Al(false);
        C5S1 c5s1 = new C5S1(getContext());
        c5s1.LIZLLL(getString(R.string.tem));
        c5s1.LJ();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        C78975Uz5 c78975Uz5 = this.LLILL;
        if (c78975Uz5 != null) {
            c78975Uz5.LIZ.LIZLLL();
            C73318Sq2 c73318Sq2 = this.LLJ;
            if (c73318Sq2 != null) {
                c73318Sq2.dispose();
                return;
            } else {
                o.LJIJI("behaviorSubjectDisposable");
                throw null;
            }
        }
        o.LJIJI("verificationPresenter");
        throw null;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Jl().dismissProgressDialog();
        Jl().bindView(null);
        Yl().bindView(null);
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.LLILZ = a.LJ().LJ(4);
    }

    public final void xm() {
        if (!isViewValid()) {
            return;
        }
        C188727au c188727au = this.LJLJJL;
        if (c188727au != null) {
            c188727au.LJIIIZ("event_type", "leave");
            FMX.LJIIL("profile_edit_status", c188727au.LIZ);
        }
        if (requireArguments().getBoolean("change_to_ba", false)) {
            C2U8.LIZ(new C9ND());
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    public final void zm() {
        int i;
        int i2;
        View findViewById;
        View findViewById2;
        boolean twitter = C244099i1.LIZ().getTwitter();
        boolean ins = C244099i1.LIZ().getIns();
        boolean youtube = C244099i1.LIZ().getYoutube();
        int i3 = 8;
        if (!twitter && !ins && !youtube) {
            View view = getView();
            if (view != null && (findViewById2 = view.findViewById(R.id.g6a)) != null) {
                findViewById2.setVisibility(8);
            }
            View view2 = getView();
            if (view2 == null || (findViewById = view2.findViewById(R.id.e4i)) == null) {
                return;
            }
            findViewById.setVisibility(8);
            return;
        }
        User user = this.LLJJIJIL;
        if (user != null) {
            boolean LJJJJ = C78983UzD.LJJJJ(user.getTwitterName());
            User user2 = this.LLJJIJIL;
            if (user2 != null) {
                boolean LJJJJ2 = C78983UzD.LJJJJ(user2.getInsId());
                User user3 = this.LLJJIJIL;
                if (user3 != null) {
                    boolean LJJJJ3 = C78983UzD.LJJJJ(user3.getYoutubeChannelTitle());
                    AI8 ai8 = this.LLIIL;
                    if (ai8 != null) {
                        if (twitter) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        ai8.setVisibility(i);
                        AI8 ai82 = this.LLIIJI;
                        if (ai82 != null) {
                            if (ins) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            ai82.setVisibility(i2);
                            AI8 ai83 = this.LLIIJLIL;
                            if (ai83 != null) {
                                if (youtube) {
                                    i3 = 0;
                                }
                                ai83.setVisibility(i3);
                                if (LJJJJ) {
                                    AI8 ai84 = this.LLIIL;
                                    if (ai84 != null) {
                                        User user4 = this.LLJJIJIL;
                                        if (user4 != null) {
                                            String twitterName = user4.getTwitterName();
                                            o.LJIIIIZZ(twitterName, "userCache.twitterName");
                                            SFS.LJJIIZI(ai84, twitterName);
                                        } else {
                                            o.LJIJI("userCache");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("twitterTuxCell");
                                        throw null;
                                    }
                                } else {
                                    AI8 ai85 = this.LLIIL;
                                    if (ai85 != null) {
                                        String string = getString(R.string.fhy);
                                        o.LJIIIIZZ(string, "getString(R.string.editP…ocialBottomSheet_option4)");
                                        SFS.LJJIIZ(ai85, string, false);
                                        this.LJLJJL.LJI("twitter", "");
                                    } else {
                                        o.LJIJI("twitterTuxCell");
                                        throw null;
                                    }
                                }
                                if (LJJJJ2) {
                                    AI8 ai86 = this.LLIIJI;
                                    if (ai86 != null) {
                                        User user5 = this.LLJJIJIL;
                                        if (user5 != null) {
                                            String insId = user5.getInsId();
                                            o.LJIIIIZZ(insId, "userCache.insId");
                                            SFS.LJJIIZI(ai86, insId);
                                        } else {
                                            o.LJIJI("userCache");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("instagramTuxCell");
                                        throw null;
                                    }
                                } else {
                                    AI8 ai87 = this.LLIIJI;
                                    if (ai87 != null) {
                                        String string2 = getString(R.string.fhv);
                                        o.LJIIIIZZ(string2, "getString(R.string.editP…socialBottomSheet_option)");
                                        SFS.LJJIIZ(ai87, string2, false);
                                        this.LJLJJL.LJI("instagram", "");
                                    } else {
                                        o.LJIJI("instagramTuxCell");
                                        throw null;
                                    }
                                }
                                if (LJJJJ3) {
                                    AI8 ai88 = this.LLIIJLIL;
                                    if (ai88 != null) {
                                        User user6 = this.LLJJIJIL;
                                        if (user6 != null) {
                                            String youtubeChannelTitle = user6.getYoutubeChannelTitle();
                                            o.LJIIIIZZ(youtubeChannelTitle, "userCache.youtubeChannelTitle");
                                            SFS.LJJIIZI(ai88, youtubeChannelTitle);
                                        } else {
                                            o.LJIJI("userCache");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("youtubeTuxCell");
                                        throw null;
                                    }
                                } else {
                                    AI8 ai89 = this.LLIIJLIL;
                                    if (ai89 != null) {
                                        String string3 = getString(R.string.fhw);
                                        o.LJIIIIZZ(string3, "getString(R.string.editP…ocialBottomSheet_option2)");
                                        SFS.LJJIIZ(ai89, string3, false);
                                        this.LJLJJL.LJI("youtube", "");
                                    } else {
                                        o.LJIJI("youtubeTuxCell");
                                        throw null;
                                    }
                                }
                                wl();
                                return;
                            }
                            o.LJIJI("youtubeTuxCell");
                            throw null;
                        }
                        o.LJIJI("instagramTuxCell");
                        throw null;
                    }
                    o.LJIJI("twitterTuxCell");
                    throw null;
                }
                o.LJIJI("userCache");
                throw null;
            }
            o.LJIJI("userCache");
            throw null;
        }
        o.LJIJI("userCache");
        throw null;
    }

    public final boolean Ad(String str) {
        if (!TextUtils.equals(str, ((RBX) HG3.LJIILL()).getCurUser().getSignature())) {
            while (s.LJJJLZIJ(str, "\n\n", false)) {
                str = QZP.LIZIZ("\n\n", str, "\n");
            }
            int length = str.length() - 1;
            if (length >= 0 && str.charAt(length) == '\n') {
                str = str.substring(0, length);
                o.LJIIIIZZ(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            User user = this.LLJJIJIL;
            if (user != null) {
                user.setSignature(str);
                Wl().LIZ = str;
                Om();
                Yl().updateSignature(str);
                return true;
            }
            o.LJIJI("userCache");
            throw null;
        }
        Wl().LIZ = null;
        return true;
    }

    public final void Al(boolean z) {
        if (z) {
            Om();
            return;
        }
        C73305Spp c73305Spp = this.LJLJL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(4);
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }

    @Override // X.QBK
    public final void CS(String str) {
        C82544WaS.LIZJ(new ARunnableS5S1100000_4(this, str, 3));
    }

    public final boolean Dl(String str) {
        if (this.LLILZ) {
            return false;
        }
        if (new OJD("[0-9A-Za-z_.]*").matches(str) && !PatternProtector.compile("[0-9]*").matcher(str).matches()) {
            return false;
        }
        return true;
    }

    public final void Dm(String str) {
        String str2;
        this.LJLLILLLL = true;
        if (!TextUtils.equals(str, ((RBX) HG3.LJIILL()).getCurUser().getBioEmail())) {
            while (s.LJJJLZIJ(str, "\n\n", false)) {
                str = QZP.LIZIZ("\n\n", str, "\n");
            }
            int length = str.length() - 1;
            if (length >= 0 && str.charAt(length) == '\n') {
                str = str.substring(0, length);
                o.LJIIIIZZ(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Wl().LJII = str;
            Yl().updateUserInfo(Wl().LIZ());
            Om();
            User user = this.LLJJIJIL;
            if (user != null) {
                user.setEmail(str);
                boolean isEmpty = TextUtils.isEmpty(str);
                if (!TextUtils.isEmpty(str)) {
                    str2 = "bold";
                } else {
                    str2 = "blank";
                }
                Rm("bio_email", str2, isEmpty);
                Qm("email", !TextUtils.isEmpty(str));
                return;
            }
            o.LJIJI("userCache");
            throw null;
        }
        Wl().LJII = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Em(com.ss.android.ugc.aweme.services.external.IDonationService.OrganizationModel r15) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment.Em(com.ss.android.ugc.aweme.services.external.IDonationService$OrganizationModel):void");
    }

    public void FI(boolean z) {
        if (z) {
            if (this.LLJJIII == null) {
                C5S1 c5s1 = new C5S1(EF7.LIZIZ());
                c5s1.LIZJ(R.string.tnc);
                c5s1.LJ();
            }
            C2U8.LIZ(new C9VE());
        }
    }

    public final void Hl(View view) {
        if (C6ZT.LIZ(view) || !isViewValid() || this.LLILZ) {
            return;
        }
        C78975Uz5 c78975Uz5 = this.LLILL;
        if (c78975Uz5 != null) {
            c78975Uz5.LIZIZ(getUser(), new C86202XsM(this));
        } else {
            o.LJIJI("verificationPresenter");
            throw null;
        }
    }

    public final void Jm(ProfileNgoStruct profileNgoStruct) {
        ProfileNgoStruct profileNgoStruct2;
        if (profileNgoStruct == null || profileNgoStruct.getName().length() == 0) {
            profileNgoStruct2 = null;
        } else {
            profileNgoStruct2 = getUser().getProfileNgoStruct();
        }
        this.LLILLL = profileNgoStruct2;
    }

    @Override // X.InterfaceC66555QAd
    public final void PL(String errorMessage) {
        o.LJIIIZ(errorMessage, "errorMessage");
        C82544WaS.LIZJ(new ARunnableS5S1100000_4(this, errorMessage, 6));
    }

    public final void Sm(boolean z) {
        TuxIconView tuxIconView;
        this.LLILZIL = z;
        if (z) {
            LinearLayout linearLayout = this.LJLLJ;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                LinearLayout linearLayout2 = this.LJLLL;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                    AI8 Xl = Xl();
                    boolean Rl = Rl();
                    Integer valueOf = Integer.valueOf(R.attr.eb);
                    if (Rl) {
                        View view = getView();
                        if (view != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.cq5)) != null) {
                            C2068389v c2068389v = new C2068389v();
                            c2068389v.LIZ = R.raw.icon_exclamation_mark_circle_fill;
                            c2068389v.LIZIZ = C17N.LJIILL(12.0d);
                            c2068389v.LIZJ = C17N.LJIILL(12.0d);
                            c2068389v.LJ = valueOf;
                            tuxIconView.setTuxIcon(c2068389v);
                            return;
                        }
                        return;
                    }
                    AIF aif = (AIF) Xl.getAccessory();
                    if (aif == null) {
                        return;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(aif.LJIIJJI());
                    C2068389v c2068389v2 = new C2068389v();
                    c2068389v2.LIZ = R.raw.icon_exclamation_mark_circle_fill;
                    c2068389v2.LIZIZ = C17N.LJIILL(12.0d);
                    c2068389v2.LIZJ = C17N.LJIILL(12.0d);
                    c2068389v2.LJ = valueOf;
                    spannableStringBuilder.clear();
                    spannableStringBuilder.append((CharSequence) CardStruct.IStatusCode.DEFAULT);
                    Context requireContext = requireContext();
                    o.LJIIIIZZ(requireContext, "requireContext()");
                    spannableStringBuilder.setSpan(c2068389v2.LIZIZ(2, requireContext), 0, 1, 17);
                    aif.LJIILIIL(spannableStringBuilder);
                    Xl.setAccessory(aif);
                    return;
                }
                o.LJIJI("personalLinkArea");
                throw null;
            }
            o.LJIJI("hintArea");
            throw null;
        }
        LinearLayout linearLayout3 = this.LJLLJ;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
            LinearLayout linearLayout4 = this.LJLLL;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(0);
                return;
            } else {
                o.LJIJI("personalLinkArea");
                throw null;
            }
        }
        o.LJIJI("hintArea");
        throw null;
    }

    public final String Zl(AI8 ai8) {
        if (Sl()) {
            return String.valueOf(ai8.getTitle());
        }
        return SFS.LJIJ(ai8);
    }

    @Override // X.InterfaceC238019Vt
    public final void b4(boolean z) {
        Yl().setUpdateUserIdRemovingVerification(z);
    }

    public void cq(Exception exc) {
        String str;
        Al(false);
        Jl().dismissProgressDialog();
        if (!isViewValid()) {
            return;
        }
        if ((exc instanceof C38333F2r) && ((C38306F1q) exc).getErrorCode() == 20022) {
            C73040SlY.LJII(mo49getActivity(), "profile_image_setting", "review_failure");
        }
        C1A7.LJIJJLI(mo49getActivity(), exc, R.string.b5f);
        if (exc == null || (str = exc.getMessage()) == null) {
            str = "";
        }
        C78598Ut0.LJIIZILJ(str, "avatar");
    }

    public final void hm(String str) {
        AI8 ai8 = this.LLD;
        if (ai8 == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            Im(ai8, str, true);
        } else {
            Im(ai8, getString(R.string.c2m), false);
        }
        xl(ai8, "biz_address");
    }

    public void initView(View view) {
        int i;
        View findViewById = view.findViewById(R.id.gwg);
        C252709vu c252709vu = (C252709vu) findViewById;
        if (Rl()) {
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            Integer LJI = C79045V0n.LJI(R.attr.c9, requireContext);
            if (LJI != null) {
                c252709vu.setNavBackground(LJI.intValue());
            }
            i = R.raw.icon_chevron_left_offset_ltr;
        } else {
            c252709vu.setNavBackground(0);
            i = R.raw.icon_arrow_left_ltr;
        }
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = i;
        LIZJ.LIZLLL = true;
        String string = getString(R.string.aub);
        o.LJIIIIZZ(string, "getString(R.string.acces…lityLabels_settings_back)");
        LIZJ.LJII = string;
        LIZJ.LIZIZ(new AqS151S0200000_4(this, view, 16));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        CharSequence text = getText(R.string.fkm);
        o.LJII(text, "null cannot be cast to non-null type kotlin.String");
        LIZLLL.LIZJ = text;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        o.LJIIIIZZ(findViewById, "view.findViewById<TuxNav…,\n            )\n        }");
        AvatarPresenter avatarPresenter = new AvatarPresenter();
        avatarPresenter.bindView(this);
        avatarPresenter.initHeadUploadHelper(mo49getActivity(), this);
        this.LJLJLLL = avatarPresenter;
        UserPresenter userPresenter = new UserPresenter(EnumC26164AOq.PROFILE.getValue());
        userPresenter.bindView(this);
        this.LJLJLJ = userPresenter;
        this.LLILL = new C78975Uz5();
        AI8 ai8 = this.LLIIL;
        if (ai8 != null) {
            ai8.setVisibility(8);
        } else {
            o.LJIJI("twitterTuxCell");
            throw null;
        }
    }

    @Override // X.QBP
    public final void kE(String str) {
        C82544WaS.LIZJ(new ARunnableS5S1100000_4(this, str, 4));
    }

    @Override // X.QBK
    public final void l30(String str) {
        if (Sl()) {
            User user = this.LLJJIJIL;
            if (user != null) {
                user.setInsId(str);
                Am();
                AI8 ai8 = this.LLIIJI;
                if (ai8 != null) {
                    Pm(ai8, "instagram", TextUtils.isEmpty(str));
                    Al(false);
                    C2U8.LIZ(new C9VE());
                    return;
                }
                o.LJIJI("instagramTuxCell");
                throw null;
            }
            o.LJIJI("userCache");
            throw null;
        }
        if (Ql()) {
            User user2 = this.LLJJIJIL;
            if (user2 != null) {
                user2.setInsId(str);
                zm();
                AI8 ai82 = this.LLIIJI;
                if (ai82 != null) {
                    Pm(ai82, "instagram", TextUtils.isEmpty(str));
                    Al(false);
                    C2U8.LIZ(new C9VE());
                    return;
                }
                o.LJIJI("instagramTuxCell");
                throw null;
            }
            o.LJIJI("userCache");
            throw null;
        }
        if (getContext() == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AI8 ai83 = this.LLIIJI;
            if (ai83 != null) {
                Im(ai83, requireContext().getString(R.string.fk9), false);
            } else {
                o.LJIJI("instagramTuxCell");
                throw null;
            }
        } else {
            AI8 ai84 = this.LLIIJI;
            if (ai84 != null) {
                Im(ai84, str, true);
            } else {
                o.LJIJI("instagramTuxCell");
                throw null;
            }
        }
        AI8 ai85 = this.LLIIJI;
        if (ai85 != null) {
            Pm(ai85, "instagram", TextUtils.isEmpty(str));
            Al(false);
            C2U8.LIZ(new C9VE());
            return;
        }
        o.LJIJI("instagramTuxCell");
        throw null;
    }

    public final void lm(String str) {
        boolean z;
        if (getUser().getSignatureModifyTime() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (Sl()) {
            if (!TextUtils.isEmpty(str)) {
                Kl().setTitle(str);
                SFS.LJJIJLIJ(Kl());
            } else {
                Kl().setTitle(getString(R.string.fh1));
                if (z) {
                    SFS.LJJIJIL(Kl());
                } else {
                    SFS.LJJIJL(Kl());
                }
            }
            C244309iM.LJIIJJI(!z);
            xl(Kl(), "bio");
            return;
        }
        if (Ql()) {
            if (str == null || str.length() == 0) {
                AI8 Kl = Kl();
                String string = getString(R.string.fhe);
                o.LJIIIIZZ(string, "getString(R.string.editP…rofileV2_bio_placeholder)");
                SFS.LJJIIZ(Kl, string, z);
            } else {
                SFS.LJJIIZI(Kl(), str);
            }
            C244309iM.LJIIJJI(!z);
            xl(Kl(), "bio");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            Im(Kl(), str, false);
        } else {
            Im(Kl(), getString(R.string.fk4), false);
        }
        AI8 Kl2 = Kl();
        List<String> list = this.LJLJJI;
        if (list != null) {
            Im(Kl2, null, list.contains("bio"));
            C244309iM.LJIIJJI(!z);
            xl(Kl(), "bio");
            return;
        }
        o.LJIJI("boldFields");
        throw null;
    }

    public final void mm(String str) {
        if (!TextUtils.isEmpty(str)) {
            AI8 ai8 = this.LLFII;
            if (ai8 != null) {
                Im(ai8, str, false);
                AI8 ai82 = this.LLIIIJ;
                if (ai82 != null) {
                    Im(ai82, str, true);
                }
            } else {
                o.LJIJI("categoryTuxCell");
                throw null;
            }
        } else {
            AI8 ai83 = this.LLFII;
            if (ai83 != null) {
                Im(ai83, getString(R.string.cqb), false);
                AI8 ai84 = this.LLIIIJ;
                if (ai84 != null) {
                    Im(ai84, getString(R.string.cqb), false);
                }
            } else {
                o.LJIJI("categoryTuxCell");
                throw null;
            }
        }
        AI8 ai85 = this.LLFII;
        if (ai85 != null) {
            Im(ai85, null, true);
            AI8 ai86 = this.LLFII;
            if (ai86 != null) {
                xl(ai86, "category");
                AI8 ai87 = this.LLIIIJ;
                if (ai87 != null) {
                    xl(ai87, "ba_category");
                    return;
                }
                return;
            }
            o.LJIJI("categoryTuxCell");
            throw null;
        }
        o.LJIJI("categoryTuxCell");
        throw null;
    }

    public final void om(String str) {
        if (!TextUtils.isEmpty(str)) {
            AI8 ai8 = this.LLF;
            if (ai8 != null) {
                Im(ai8, str, false);
            } else {
                o.LJIJI("mailTuxCell");
                throw null;
            }
        } else {
            AI8 ai82 = this.LLF;
            if (ai82 != null) {
                Im(ai82, getString(R.string.fk_), false);
            } else {
                o.LJIJI("mailTuxCell");
                throw null;
            }
        }
        AI8 ai83 = this.LLF;
        if (ai83 != null) {
            List<String> list = this.LJLJJI;
            if (list != null) {
                Im(ai83, null, list.contains("bio_email"));
                AI8 ai84 = this.LLF;
                if (ai84 != null) {
                    xl(ai84, "bio_email");
                    return;
                } else {
                    o.LJIJI("mailTuxCell");
                    throw null;
                }
            }
            o.LJIJI("boldFields");
            throw null;
        }
        o.LJIJI("mailTuxCell");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        initData();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFEPageEditSuccess(C56642Ke broadCastEvent) {
        o.LJIIIZ(broadCastEvent, "broadCastEvent");
        JSONObject jSONObject = broadCastEvent.LJLIL;
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("eventName");
        JSONObject optJSONObject = broadCastEvent.LJLIL.optJSONObject("data");
        boolean z = false;
        if (TextUtils.equals(optString, "ba_profile_show_display")) {
            AI8 ai8 = this.LLIIII;
            if (ai8 == null) {
                return;
            }
            ai8.setVisibility(0);
            xl(ai8, "ba_profile_display");
            new C237559Tz().LJJI("display");
            return;
        }
        if (optJSONObject == null || optString == null) {
            return;
        }
        switch (optString.hashCode()) {
            case -1482765820:
                if (!optString.equals("profile_phone_save")) {
                    return;
                }
                qm(optJSONObject.optString("phone"));
                Qm("call", !TextUtils.isEmpty(r0));
                FI(true);
                return;
            case -739622622:
                if (!optString.equals("ba_business_address_submit")) {
                    return;
                }
                hm(optJSONObject.optString("simplified_address_text"));
                Qm("address", !TextUtils.isEmpty(r0));
                FI(true);
                return;
            case 292545779:
                if (!optString.equals("download_app_link_success")) {
                    return;
                }
                int optInt = optJSONObject.optInt("download_link_audit_status");
                String optString2 = optJSONObject.optString("android_download_app_link");
                String optString3 = optJSONObject.optString("ios_download_app_link");
                km(optInt, optString2);
                if ((!TextUtils.isEmpty(optString2) || !TextUtils.isEmpty(optString3)) && optInt == 2) {
                    z = true;
                }
                Qm("app", z);
                FI(true);
                return;
            case 726159191:
                if (!optString.equals("edit_category_success")) {
                    return;
                }
                String optString4 = optJSONObject.optString("category_name");
                if (TextUtils.isEmpty(optString4)) {
                    return;
                }
                mm(optString4);
                getUser().setCategory(optString4);
                FI(true);
                return;
            default:
                return;
        }
    }

    @Override // X.QBP
    public final void or(String str) {
        if (Sl()) {
            User user = this.LLJJIJIL;
            if (user != null) {
                user.setTwitterName(str);
                Am();
                AI8 ai8 = this.LLIIL;
                if (ai8 != null) {
                    Pm(ai8, "twitter", TextUtils.isEmpty(str));
                    Al(false);
                    return;
                } else {
                    o.LJIJI("twitterTuxCell");
                    throw null;
                }
            }
            o.LJIJI("userCache");
            throw null;
        }
        if (Ql()) {
            User user2 = this.LLJJIJIL;
            if (user2 != null) {
                user2.setTwitterName(str);
                zm();
                AI8 ai82 = this.LLIIL;
                if (ai82 != null) {
                    Pm(ai82, "twitter", TextUtils.isEmpty(str));
                    Al(false);
                    return;
                } else {
                    o.LJIJI("twitterTuxCell");
                    throw null;
                }
            }
            o.LJIJI("userCache");
            throw null;
        }
        if (getContext() == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AI8 ai83 = this.LLIIL;
            if (ai83 != null) {
                Im(ai83, requireContext().getString(R.string.fkn), false);
            } else {
                o.LJIJI("twitterTuxCell");
                throw null;
            }
        } else {
            AI8 ai84 = this.LLIIL;
            if (ai84 != null) {
                Im(ai84, str, true);
            } else {
                o.LJIJI("twitterTuxCell");
                throw null;
            }
        }
        AI8 ai85 = this.LLIIL;
        if (ai85 != null) {
            Pm(ai85, "twitter", TextUtils.isEmpty(str));
            Al(false);
        } else {
            o.LJIJI("twitterTuxCell");
            throw null;
        }
    }

    public final void pm(String str) {
        if (Sl()) {
            if (str != null && !TextUtils.isEmpty(str)) {
                AI8 ai8 = this.LLFF;
                if (ai8 != null) {
                    ai8.setTitle(str);
                    AI8 ai82 = this.LLFF;
                    if (ai82 != null) {
                        SFS.LJJIJLIJ(ai82);
                    } else {
                        o.LJIJI("nonprofitTuxCell");
                        throw null;
                    }
                } else {
                    o.LJIJI("nonprofitTuxCell");
                    throw null;
                }
            } else {
                AI8 ai83 = this.LLFF;
                if (ai83 != null) {
                    ai83.setTitle(getString(R.string.fh9));
                    AI8 ai84 = this.LLFF;
                    if (ai84 != null) {
                        SFS.LJJIJL(ai84);
                    } else {
                        o.LJIJI("nonprofitTuxCell");
                        throw null;
                    }
                } else {
                    o.LJIJI("nonprofitTuxCell");
                    throw null;
                }
            }
            AI8 ai85 = this.LLFF;
            if (ai85 != null) {
                xl(ai85, "nonprofit");
                return;
            } else {
                o.LJIJI("nonprofitTuxCell");
                throw null;
            }
        }
        if (Ql()) {
            if (str == null || str.length() == 0) {
                AI8 ai86 = this.LLFF;
                if (ai86 != null) {
                    String string = getString(R.string.fh9);
                    o.LJIIIIZZ(string, "getString(R.string.editP…Organization_placeholder)");
                    SFS.LJJIIZ(ai86, string, false);
                } else {
                    o.LJIJI("nonprofitTuxCell");
                    throw null;
                }
            } else {
                AI8 ai87 = this.LLFF;
                if (ai87 != null) {
                    SFS.LJJIIZI(ai87, str);
                } else {
                    o.LJIJI("nonprofitTuxCell");
                    throw null;
                }
            }
            AI8 ai88 = this.LLFF;
            if (ai88 != null) {
                xl(ai88, "nonprofit");
                return;
            } else {
                o.LJIJI("nonprofitTuxCell");
                throw null;
            }
        }
        if (str != null && !TextUtils.isEmpty(str)) {
            AI8 ai89 = this.LLFF;
            if (ai89 != null) {
                Im(ai89, str, false);
            } else {
                o.LJIJI("nonprofitTuxCell");
                throw null;
            }
        } else {
            AI8 ai810 = this.LLFF;
            if (ai810 != null) {
                Im(ai810, getString(R.string.iut), false);
            } else {
                o.LJIJI("nonprofitTuxCell");
                throw null;
            }
        }
        AI8 ai811 = this.LLFF;
        if (ai811 != null) {
            List<String> list = this.LJLJJI;
            if (list != null) {
                Im(ai811, null, list.contains("supported_ngo"));
                AI8 ai812 = this.LLFF;
                if (ai812 != null) {
                    xl(ai812, "nonprofit");
                    return;
                } else {
                    o.LJIJI("nonprofitTuxCell");
                    throw null;
                }
            }
            o.LJIJI("boldFields");
            throw null;
        }
        o.LJIJI("nonprofitTuxCell");
        throw null;
    }

    public final void qm(String str) {
        AI8 ai8 = this.LL;
        if (ai8 == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            Im(ai8, str, true);
        } else {
            Im(ai8, getString(R.string.jb), false);
        }
        xl(ai8, "biz_phone");
    }

    public void rs0(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("file://");
        LIZ.append(str);
        Uri parse = UriProtector.parse(X1D.LIZIZ(LIZ));
        W5I.LIZ().LIZIZ(parse);
        C78765Uvh.LJIIIZ(Ll(), parse.toString(), (int) KL2.LIZJ(getContext(), 84.0f), (int) KL2.LIZJ(getContext(), 84.0f));
    }

    @Override // X.InterfaceC243979hp
    public final void sh(ProfileAdvancedFeaturesCell powerCell) {
        o.LJIIIZ(powerCell, "powerCell");
        C1C8 c1c8 = this.LLJI;
        if (c1c8 != null) {
            c1c8.LJIJI(powerCell);
        } else {
            o.LJIJI("itemTouchHelper");
            throw null;
        }
    }

    public final void sm(UserPronounsInfo userPronounsInfo) {
        if (this.LLILZ || userPronounsInfo == null || userPronounsInfo.getEnableEditPronouns() == null || o.LJ(userPronounsInfo.getEnableEditPronouns(), Boolean.FALSE)) {
            AI8 ai8 = this.LJZ;
            if (ai8 != null) {
                ai8.setVisibility(8);
                if (Sl()) {
                    _$_findCachedViewById(R.id.iek).setVisibility(8);
                }
                this.LJLJJL.LJI("pronouns", "null");
                return;
            }
            o.LJIJI("pronounsTuxCell");
            throw null;
        }
        String pronouns = userPronounsInfo.getPronouns();
        if (Sl()) {
            if (TextUtils.isEmpty(pronouns)) {
                AI8 ai82 = this.LJZ;
                if (ai82 != null) {
                    ai82.setTitle(getString(R.string.fha));
                    AI8 ai83 = this.LJZ;
                    if (ai83 != null) {
                        SFS.LJJIJL(ai83);
                        this.LJLJJL.LJI("pronouns", "blank");
                    } else {
                        o.LJIJI("pronounsTuxCell");
                        throw null;
                    }
                } else {
                    o.LJIJI("pronounsTuxCell");
                    throw null;
                }
            } else {
                AI8 ai84 = this.LJZ;
                if (ai84 != null) {
                    ai84.setTitle(pronouns);
                    AI8 ai85 = this.LJZ;
                    if (ai85 != null) {
                        SFS.LJJIJLIJ(ai85);
                        this.LJLJJL.LJI("pronouns", "bold");
                    } else {
                        o.LJIJI("pronounsTuxCell");
                        throw null;
                    }
                } else {
                    o.LJIJI("pronounsTuxCell");
                    throw null;
                }
            }
            AI8 ai86 = this.LJZ;
            if (ai86 != null) {
                xl(ai86, "pronouns");
                return;
            } else {
                o.LJIJI("pronounsTuxCell");
                throw null;
            }
        }
        if (Ql()) {
            if (pronouns == null || pronouns.length() == 0) {
                AI8 ai87 = this.LJZ;
                if (ai87 != null) {
                    String string = getString(R.string.fha);
                    o.LJIIIIZZ(string, "getString(R.string.editP…eV1_pronouns_placeholder)");
                    SFS.LJJIIZ(ai87, string, false);
                    this.LJLJJL.LJI("pronouns", "blank");
                } else {
                    o.LJIJI("pronounsTuxCell");
                    throw null;
                }
            } else {
                AI8 ai88 = this.LJZ;
                if (ai88 != null) {
                    SFS.LJJIIZI(ai88, pronouns);
                    this.LJLJJL.LJI("pronouns", "bold");
                } else {
                    o.LJIJI("pronounsTuxCell");
                    throw null;
                }
            }
            AI8 ai89 = this.LJZ;
            if (ai89 != null) {
                xl(ai89, "pronouns");
                return;
            } else {
                o.LJIJI("pronounsTuxCell");
                throw null;
            }
        }
        if (TextUtils.isEmpty(pronouns)) {
            AI8 ai810 = this.LJZ;
            if (ai810 != null) {
                Im(ai810, getString(R.string.bfv), false);
                this.LJLJJL.LJI("pronouns", "blank");
            } else {
                o.LJIJI("pronounsTuxCell");
                throw null;
            }
        } else {
            AI8 ai811 = this.LJZ;
            if (ai811 != null) {
                Im(ai811, pronouns, true);
                this.LJLJJL.LJI("pronouns", "bold");
            } else {
                o.LJIJI("pronounsTuxCell");
                throw null;
            }
        }
        AI8 ai812 = this.LJZ;
        if (ai812 != null) {
            xl(ai812, "pronouns");
        } else {
            o.LJIJI("pronounsTuxCell");
            throw null;
        }
    }

    public final void vm(String str) {
        TuxIconView tuxIconView;
        this.LLILLJJLI = str;
        TextView textView = this.LJLLLL;
        if (textView != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tiktok.com/@");
            LIZ.append(str);
            textView.setText(X1D.LIZIZ(LIZ));
            if (Rl()) {
                AI8 Xl = Xl();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('@');
                LIZ2.append(this.LLILLJJLI);
                Xl.setTitle(X1D.LIZIZ(LIZ2));
                AIF LJIILIIL = SFS.LJIILIIL(Xl());
                if (LJIILIIL != null) {
                    LJIILIIL.LJIILL(false);
                }
                Xl().setOnClickListener(new AqS170S0100000_4(this, 555));
                ((TuxTextView) Xl().findViewById(R.id.lao)).setTuxFont(33);
                ((TuxTextView) Xl().findViewById(R.id.lao)).setTextColorRes(R.attr.go);
                View view = getView();
                if (view != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.cq5)) != null) {
                    C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 124));
                }
                Sm(Dl(this.LLILLJJLI));
                xl(Xl(), "username");
                return;
            }
            Im(Xl(), this.LLILLJJLI, true);
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            Integer LJI = C79045V0n.LJI(R.attr.go, C78605Ut7.LJIIIIZZ(requireContext));
            if (LJI != null) {
                int intValue = LJI.intValue();
                TextView textView2 = this.LJLLLL;
                if (textView2 != null) {
                    textView2.setTextColor(intValue);
                } else {
                    o.LJIJI("personalLink");
                    throw null;
                }
            }
            Sm(Dl(this.LLILLJJLI));
            xl(Xl(), "username");
            return;
        }
        o.LJIJI("personalLink");
        throw null;
    }

    @Override // X.InterfaceC66555QAd
    public final void wd(String str) {
        C82544WaS.LIZJ(new ARunnableS5S1100000_4(this, str, 5));
    }

    public void yH(AvatarUri avatarUri) {
        Jl().dismissProgressDialog();
        if (avatarUri == null) {
            C5S1 c5s1 = new C5S1(mo49getActivity());
            c5s1.LIZJ(R.string.b5f);
            c5s1.LJ();
        }
    }

    public final void ym(String str) {
        User user = this.LLJJIJIL;
        if (user != null) {
            user.setNickname(str);
            if (!Rl()) {
                Im(Nl(), str, true);
            }
            Rm("nickname", "bold", false);
            C237939Vl c237939Vl = this.LLJJIII;
            if (c237939Vl != null) {
                if (!((ArrayList) this.LLJJIJI).isEmpty()) {
                    C244309iM.LJIIIZ(1, "edit_username_page", null, true);
                } else {
                    C244309iM.LJIIIZ(1, "edit_nickname_page", null, false);
                }
                ((ArrayList) this.LLJJIJI).add(new C238129We(C9WC.NICKNAME));
                if (((ArrayList) this.LLJJIJI).size() == 2) {
                    C221018lt.LIZ("ProfileEditFragment", "nickname updated, terminate name sync flow");
                    Nm();
                    return;
                } else {
                    if (c237939Vl.LJLIL) {
                        C221018lt.LIZ("ProfileEditFragment", "trigger a username sync");
                        Hm(c237939Vl.LJLJI, c237939Vl);
                    }
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
            }
            C244309iM.LJIIIZ(1, "edit_nickname_page", null, false);
            return;
        }
        o.LJIJI("userCache");
        throw null;
    }

    public static void Cm(String str, List list) {
        switch (str.hashCode()) {
            case -1147692044:
                if (!str.equals("address")) {
                    return;
                }
                break;
            case 96801:
                if (!str.equals("app")) {
                    return;
                }
                break;
            case 3045982:
                if (!str.equals("call")) {
                    return;
                }
                break;
            case 96619420:
                if (!str.equals("email")) {
                    return;
                }
                break;
            default:
                return;
        }
        list.remove(str);
    }

    public static void vl(String str, List list) {
        switch (str.hashCode()) {
            case -1147692044:
                if (!str.equals("address")) {
                    return;
                }
                break;
            case 96801:
                if (!str.equals("app")) {
                    return;
                }
                break;
            case 3045982:
                if (!str.equals("call")) {
                    return;
                }
                break;
            case 96619420:
                if (!str.equals("email")) {
                    return;
                }
                break;
            default:
                return;
        }
        list.add(str);
    }

    public final void Hm(String str, C237939Vl c237939Vl) {
        if (C238099Wb.LIZIZ(str)) {
            if (u.LIZJ(str, getContext())) {
                this.LLJJIII = c237939Vl;
                Om();
                Yl().updateUserId(str);
                User user = this.LLJJIJIL;
                if (user != null) {
                    user.setUniqueId(str);
                    return;
                } else {
                    o.LJIJI("userCache");
                    throw null;
                }
            }
            Al(false);
            Wl().LIZIZ = "";
            return;
        }
        Wl().LIZIZ = "";
    }

    public final void Il(AI8 ai8, boolean z) {
        AI8 ai82;
        if (C6ZT.LIZ(ai8) || !isViewValid() || this.LLILZ) {
            return;
        }
        if (this.LLILZLL) {
            if (!TextUtils.isEmpty(this.LLIZ)) {
                C0NY.LIZJ(SmartRouter.buildRoute(ai8.getContext(), "//webview"), "url", this.LLIZ, "hide_nav_bar", true);
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("uid", getUser().getUid());
            FMX.LJIIL("cannot_add_link_click", c188727au.LIZ);
            return;
        }
        UserBioPermission bioPermission = getUser().getBioPermission();
        if (bioPermission != null && !bioPermission.getEnableUrl()) {
            BAProfilePageServiceImpl.LJIIJJI().LIZ(getContext(), "website");
            return;
        }
        String LJIJ = SFS.LJIJ(cm());
        if (z && (ai82 = this.LLIFFJFJJ) != null) {
            LJIJ = SFS.LJIJ(ai82);
        }
        if (o.LJ(LJIJ, getString(R.string.fks))) {
            LJIJ = "";
        }
        new C237559Tz().LJJ("website");
        C244309iM.LJII("enter_profile_website", "click_website", "website");
        ProfileEditBioUrlFragment LIZ = C9VC.LIZ(LJIJ);
        LIZ.setUserVisibleHint(true);
        LIZ.xl(this);
        LIZ.LJLLLL = new C9VF() { // from class: X.9hy
            @Override // X.C9VF
            public final void LIZ(String content) {
                String str;
                o.LJIIIZ(content, "content");
                ProfileEditFragment profileEditFragment = ProfileEditFragment.this;
                User user = profileEditFragment.LLJJIJIL;
                if (user != null) {
                    user.setBioUrl(content);
                    boolean isEmpty = TextUtils.isEmpty(content);
                    if (!TextUtils.isEmpty(content)) {
                        str = "bold";
                    } else {
                        str = "blank";
                    }
                    profileEditFragment.Rm("website", str, isEmpty);
                    profileEditFragment.nm(content, false);
                    return;
                }
                o.LJIJI("userCache");
                throw null;
            }
        };
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "requireActivity().supportFragmentManager");
        LIZ.show(supportFragmentManager, "EditWebsiteDialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012d, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Pp0(com.ss.android.ugc.aweme.profile.model.User r13, int r14) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment.Pp0(com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    public final void Qm(String str, boolean z) {
        if (getUser().getAccountType() != 3) {
            return;
        }
        BizAccountInfo bizAccountInfo = getUser().getBizAccountInfo();
        if (bizAccountInfo == null) {
            BizAccountInfo bizAccountInfo2 = new BizAccountInfo();
            ArrayList arrayList = new ArrayList();
            vl(str, arrayList);
            bizAccountInfo2.setAddedContactAndLinkList(arrayList);
            getUser().setBizAccountInfo(bizAccountInfo2);
            return;
        }
        AbstractC65743Pr9 fromNullable = AbstractC65743Pr9.fromNullable(bizAccountInfo.getAddedContactAndLinkList());
        if (fromNullable.isPresent()) {
            if (!z) {
                Object obj = fromNullable.get();
                o.LJIIIIZZ(obj, "opt.get()");
                Cm(str, (List) obj);
                return;
            }
        } else if (!z) {
            return;
        }
        if (fromNullable.isPresent()) {
            Object obj2 = fromNullable.get();
            o.LJIIIIZZ(obj2, "opt.get()");
            Cm(str, (List) obj2);
            Object obj3 = fromNullable.get();
            o.LJIIIIZZ(obj3, "opt.get()");
            vl(str, (List) obj3);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        vl(str, arrayList2);
        bizAccountInfo.setAddedContactAndLinkList(arrayList2);
    }

    public final String Vl(Exception exc, C9WC c9wc) {
        C38333F2r c38333F2r;
        String errorMsg;
        if (exc instanceof C64698PaI) {
            if (c9wc == C9WC.USERNAME) {
                String string = getResources().getString(R.string.pcq);
                o.LJIIIIZZ(string, "{\n                resour…scription9)\n            }");
                return string;
            }
            String string2 = getResources().getString(R.string.pcn);
            o.LJIIIIZZ(string2, "{\n                resour…scription6)\n            }");
            return string2;
        }
        if (!(exc instanceof C38333F2r) || (errorMsg = (c38333F2r = (C38333F2r) exc).getErrorMsg()) == null || errorMsg.length() == 0) {
            if (c9wc == C9WC.USERNAME) {
                String string3 = getResources().getString(R.string.pcp);
                o.LJIIIIZZ(string3, "{\n            resources.…t_description8)\n        }");
                return string3;
            }
            String string4 = getResources().getString(R.string.pck);
            o.LJIIIIZZ(string4, "{\n            resources.…t_description3)\n        }");
            return string4;
        }
        String errorMsg2 = c38333F2r.getErrorMsg();
        o.LJIIIIZZ(errorMsg2, "e.errorMsg");
        return errorMsg2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0143, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L60;
     */
    @Override // X.InterfaceC26189APp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Xa(java.lang.Exception r12, int r13) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment.Xa(java.lang.Exception, int):void");
    }

    public final void km(int i, String str) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    AI8 ai8 = this.LLFFF;
                    if (ai8 != null) {
                        Im(ai8, getString(R.string.skw), false);
                    } else {
                        o.LJIJI("appStoreLinkTuxCell");
                        throw null;
                    }
                } else {
                    AI8 ai82 = this.LLFFF;
                    if (ai82 != null) {
                        Im(ai82, getString(R.string.skx), false);
                    } else {
                        o.LJIJI("appStoreLinkTuxCell");
                        throw null;
                    }
                }
            } else if (str == null || str.length() == 0) {
                AI8 ai83 = this.LLFFF;
                if (ai83 != null) {
                    Im(ai83, getString(R.string.skw), false);
                } else {
                    o.LJIJI("appStoreLinkTuxCell");
                    throw null;
                }
            } else {
                AI8 ai84 = this.LLFFF;
                if (ai84 != null) {
                    Im(ai84, str, true);
                } else {
                    o.LJIJI("appStoreLinkTuxCell");
                    throw null;
                }
            }
        } else {
            AI8 ai85 = this.LLFFF;
            if (ai85 != null) {
                Im(ai85, getString(R.string.sky), false);
            } else {
                o.LJIJI("appStoreLinkTuxCell");
                throw null;
            }
        }
        AI8 ai86 = this.LLFFF;
        if (ai86 != null) {
            xl(ai86, "app_store_link");
        } else {
            o.LJIJI("appStoreLinkTuxCell");
            throw null;
        }
    }

    public final void nm(String str, boolean z) {
        if (this.LLILZLL) {
            Im(cm(), getString(R.string.c3f), false);
            xl(cm(), "website");
            AI8 ai8 = this.LLIFFJFJJ;
            if (ai8 != null) {
                Im(ai8, getString(R.string.c3f), false);
                xl(ai8, "ba_website");
            }
            if (z) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("uid", getUser().getUid());
                FMX.LJIIL("cannot_add_link_show", c188727au.LIZ);
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            Im(cm(), str, false);
            AI8 ai82 = this.LLIFFJFJJ;
            if (ai82 != null) {
                Im(ai82, str, true);
            }
        } else {
            Im(cm(), getString(R.string.fks), false);
            AI8 ai83 = this.LLIFFJFJJ;
            if (ai83 != null) {
                Im(ai83, getString(R.string.fks), false);
            }
        }
        AI8 cm = cm();
        List<String> list = this.LJLJJI;
        if (list != null) {
            Im(cm, null, list.contains("website"));
            xl(cm(), "website");
            AI8 ai84 = this.LLIFFJFJJ;
            if (ai84 != null) {
                xl(ai84, "ba_website");
                return;
            }
            return;
        }
        o.LJIJI("boldFields");
        throw null;
    }

    @Override // X.InterfaceC26189APp
    public final void vb0(String toast, boolean z) {
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(toast, "toast");
        if (!isViewValid()) {
            return;
        }
        Al(false);
        if (TextUtils.isEmpty(toast)) {
            return;
        }
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZLLL(toast);
        c5s1.LJ();
        if (z && (mo49getActivity = mo49getActivity()) != null) {
            mo49getActivity.finish();
        }
    }

    public final void xl(AI8 ai8, String str) {
        AIF LJIILIIL = SFS.LJIILIIL(ai8);
        if (LJIILIIL == null) {
            return;
        }
        LJIILIIL.LJIILJJIL(new ACListenerS26S1200000_4(this, ai8, str, 2));
    }

    public final void Im(AI8 ai8, CharSequence charSequence, boolean z) {
        int i;
        int i2;
        AIF LJIILIIL = SFS.LJIILIIL(ai8);
        if (LJIILIIL == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = LJIILIIL.LJIIJJI();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        if (z) {
            i = R.attr.go;
        } else {
            i = R.attr.gw;
        }
        Integer LJI = C79045V0n.LJI(i, requireContext);
        if (LJI != null) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
            if (charSequence != null) {
                i2 = charSequence.length();
            } else {
                i2 = 0;
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, i2, 17);
        }
        LJIILIIL.LJIILIIL(spannableStringBuilder);
        ai8.setAccessory(LJIILIIL);
    }

    public final void Km(String str, String str2, DialogInterface.OnClickListener onClickListener) {
        if (!isActive()) {
            return;
        }
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C62905OmT c62905OmT = new C62905OmT(requireActivity);
        c62905OmT.LIZIZ = str;
        c62905OmT.LIZJ = str2;
        c62905OmT.LJIIJJI(R.string.cen, onClickListener, false);
        new C62906OmU(c62905OmT).LIZLLL();
    }

    public final void Pm(AI8 ai8, String str, boolean z) {
        String str2;
        if (z) {
            List<String> list = this.LJLJJI;
            if (list != null) {
                if (list.contains(str)) {
                    List<String> list2 = this.LJLJJI;
                    if (list2 != null) {
                        list2.remove(str);
                    } else {
                        o.LJIJI("boldFields");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("boldFields");
                throw null;
            }
        } else {
            List<String> list3 = this.LJLJJI;
            if (list3 != null) {
                if (!list3.contains(str)) {
                    List<String> list4 = this.LJLJJI;
                    if (list4 != null) {
                        list4.add(str);
                    } else {
                        o.LJIJI("boldFields");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("boldFields");
                throw null;
            }
        }
        C188727au c188727au = this.LJLJJL;
        if (z) {
            str2 = "bold";
        } else {
            str2 = "blank";
        }
        c188727au.LJI(str, str2);
        if (Rl()) {
            return;
        }
        List<String> list5 = this.LJLJJI;
        if (list5 != null) {
            Im(ai8, null, list5.contains(str));
        } else {
            o.LJIJI("boldFields");
            throw null;
        }
    }

    public final void Rm(String str, String str2, boolean z) {
        try {
            if (!z) {
                List<String> list = this.LJLJJI;
                if (list != null) {
                    if (!list.contains(str)) {
                        List<String> list2 = this.LJLJJI;
                        if (list2 != null) {
                            list2.add(str);
                        } else {
                            o.LJIJI("boldFields");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("boldFields");
                    throw null;
                }
            } else {
                List<String> list3 = this.LJLJJI;
                if (list3 != null) {
                    if (list3.contains(str)) {
                        List<String> list4 = this.LJLJJI;
                        if (list4 != null) {
                            list4.remove(str);
                        } else {
                            o.LJIJI("boldFields");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("boldFields");
                    throw null;
                }
            }
            if (o.LJ(str, "bio_email")) {
                str = "email";
            }
            this.LJLJJL.LJI(str, str2);
        } catch (UnsupportedOperationException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r6 == null) goto L14;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r4 != r0) goto Lf
            r3.dm()
            com.ss.android.ugc.aweme.profile.edit.YoutubePresenter r0 = r3.dm()
            r0.onActivityResult(r6)
        Le:
            return
        Lf:
            r0 = 10002(0x2712, float:1.4016E-41)
            if (r4 != r0) goto L2c
            if (r6 == 0) goto L2e
            if (r5 != 0) goto L33
            java.lang.String r0 = "retake"
            r1 = 0
            boolean r0 = r6.getBooleanExtra(r0, r1)
            if (r0 == 0) goto Le
            com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter r0 = r3.Jl()
            X.Xs4 r0 = r0.getHeadUploadHelper()
            r0.LJIIL(r1)
            goto Le
        L2c:
            if (r6 != 0) goto L33
        L2e:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
        L33:
            com.ss.android.ugc.aweme.profile.model.User r2 = r3.getUser()
            java.lang.String r1 = "photo"
            java.lang.String r0 = "video"
            java.lang.String[] r1 = new java.lang.String[]{r1, r0}
            java.lang.String r0 = "click_save"
            android.os.Bundle r1 = X.C255199zv.LJI(r2, r0, r1)
            java.lang.String r0 = "extras_info"
            r6.putExtra(r0, r1)
            com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter r0 = r3.Jl()
            r0.onActivityResult(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, Ol(), viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.e44);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.header_image)");
        this.LJLJJLL = (C119634ml) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.status_view)");
        this.LJLJL = (C73305Spp) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.erk);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.invalid_username_hint_area)");
        this.LJLLJ = (LinearLayout) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.g4z);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.ll_personal_link)");
        this.LJLLL = (LinearLayout) findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.hmi);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.personal_link)");
        this.LJLLLL = (TextView) findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.h1i);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.nickname_tux_cell)");
        this.LJLLLLLL = (AI8) findViewById6;
        View findViewById7 = LLLLIILL.findViewById(R.id.n1c);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.username_tux_cell)");
        this.LJLZ = (AI8) findViewById7;
        View findViewById8 = LLLLIILL.findViewById(R.id.iep);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.pronouns_tux_cell)");
        this.LJZ = (AI8) findViewById8;
        View findViewById9 = LLLLIILL.findViewById(R.id.alm);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.bio_tux_cell)");
        this.LJZI = (AI8) findViewById9;
        View findViewById10 = LLLLIILL.findViewById(R.id.nid);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.website_tux_cell)");
        this.LJZL = (AI8) findViewById10;
        this.LL = (AI8) LLLLIILL.findViewById(R.id.hnz);
        this.LLD = (AI8) LLLLIILL.findViewById(R.id.x9);
        View findViewById11 = LLLLIILL.findViewById(R.id.gbu);
        o.LJIIIIZZ(findViewById11, "view.findViewById(R.id.mail_tux_cell)");
        this.LLF = (AI8) findViewById11;
        View findViewById12 = LLLLIILL.findViewById(R.id.h32);
        o.LJIIIIZZ(findViewById12, "view.findViewById(R.id.nonprofit_tux_cell)");
        this.LLFF = (AI8) findViewById12;
        View findViewById13 = LLLLIILL.findViewById(R.id.a6q);
        o.LJIIIIZZ(findViewById13, "view.findViewById(R.id.app_store_link_tux_cell)");
        this.LLFFF = (AI8) findViewById13;
        View findViewById14 = LLLLIILL.findViewById(R.id.b6z);
        o.LJIIIIZZ(findViewById14, "view.findViewById(R.id.category_tux_cell)");
        this.LLFII = (AI8) findViewById14;
        this.LLFZ = LLLLIILL.findViewById(R.id.alh);
        this.LLI = (TuxTextView) LLLLIILL.findViewById(R.id.e3r);
        this.LLIFFJFJJ = (AI8) LLLLIILL.findViewById(R.id.aef);
        this.LLII = (AI8) LLLLIILL.findViewById(R.id.ae4);
        this.LLIIII = (AI8) LLLLIILL.findViewById(R.id.aec);
        this.LLIIIILZ = (AI8) LLLLIILL.findViewById(R.id.aea);
        this.LLIIIJ = (AI8) LLLLIILL.findViewById(R.id.ae7);
        View findViewById15 = LLLLIILL.findViewById(R.id.aed);
        o.LJIIIIZZ(findViewById15, "view.findViewById(R.id.ba_tts_entry_cell)");
        this.LLIIIZ = (AI8) findViewById15;
        this.LLIIIL = LLLLIILL.findViewById(R.id.ali);
        View findViewById16 = LLLLIILL.findViewById(R.id.eph);
        o.LJIIIIZZ(findViewById16, "view.findViewById(R.id.instagram_tux_cell)");
        this.LLIIJI = (AI8) findViewById16;
        View findViewById17 = LLLLIILL.findViewById(R.id.nkq);
        o.LJIIIIZZ(findViewById17, "view.findViewById(R.id.youtube_tux_cell)");
        this.LLIIJLIL = (AI8) findViewById17;
        View findViewById18 = LLLLIILL.findViewById(R.id.mr8);
        o.LJIIIIZZ(findViewById18, "view.findViewById(R.id.twitter_tux_cell)");
        this.LLIIL = (AI8) findViewById18;
        View findViewById19 = LLLLIILL.findViewById(R.id.y8);
        o.LJIIIIZZ(findViewById19, "view.findViewById(R.id.a…necd_features_power_list)");
        this.LLIILII = (SYL) findViewById19;
        View findViewById20 = LLLLIILL.findViewById(R.id.e4i);
        o.LJIIIIZZ(findViewById20, "view.findViewById(R.id.header_social)");
        this.LLIILZL = (TuxTextView) findViewById20;
        this.LLIIZ = LLLLIILL.findViewById(R.id.cds);
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 125), LLLLIILL.findViewById(R.id.mud));
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 126), LLLLIILL.findViewById(R.id.g4z));
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 127), LLLLIILL.findViewById(R.id.egd));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLILLIZIL = arguments.getInt("need_focus_id_input", 0);
            this.LLJIJIL = arguments.getBoolean("aivatar_notif_permission", false);
        }
        if (Rl()) {
            AI8 onCreateView$lambda$1 = (AI8) LLLLIILL.findViewById(R.id.mz5);
            if (Sl()) {
                o.LJIIIIZZ(onCreateView$lambda$1, "onCreateView$lambda$1");
                ((TextView) onCreateView$lambda$1.findViewById(R.id.lao)).setHeight((int) C44384HbQ.LJJJLL(46));
                View title_tv = onCreateView$lambda$1.findViewById(R.id.lao);
                o.LJIIIIZZ(title_tv, "title_tv");
                C26338AVi.LJI(title_tv, null, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), null, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), false, 21);
                ((TextView) onCreateView$lambda$1.findViewById(R.id.lao)).setGravity(16);
                SFS.LJJIJIIJIL(onCreateView$lambda$1, 102, R.attr.go);
                SFS.LJJIJ(onCreateView$lambda$1, R.raw.icon_chevron_right_offset_ltr, R.attr.gx, 20, false);
            } else {
                o.LJIIIIZZ(onCreateView$lambda$1, "onCreateView$lambda$1");
                ((TextView) onCreateView$lambda$1.findViewById(R.id.lao)).setHeight((int) C44384HbQ.LJJJLL(48));
                View title_tv2 = onCreateView$lambda$1.findViewById(R.id.lao);
                o.LJIIIIZZ(title_tv2, "title_tv");
                C26338AVi.LJI(title_tv2, null, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), null, Integer.valueOf((int) C44384HbQ.LJJJLL(0)), false, 21);
                ((TextView) onCreateView$lambda$1.findViewById(R.id.lao)).setGravity(16);
                SFS.LJJIJIIJIL(onCreateView$lambda$1, 41, R.attr.go);
                SFS.LJJIJ(onCreateView$lambda$1, R.raw.icon_chevron_right_offset_ltr, R.attr.gx, 16, true);
            }
            AIF LJIILIIL = SFS.LJIILIIL(onCreateView$lambda$1);
            if (LJIILIIL != null) {
                LJIILIIL.LJIILJJIL(new ACListenerS24S0100000_4(this, 128));
            }
        }
        initView(LLLLIILL);
        EventBus.LIZJ().LJIILJJIL(this);
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
