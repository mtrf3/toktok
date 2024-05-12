package com.ss.android.ugc.aweme.favorites.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C203727z6;
import X.C2062487o;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C52535Kjb;
import X.C62562cu;
import X.C62822Ol8;
import X.C71799SFv;
import X.C76800UCe;
import X.C87P;
import X.C87Q;
import X.C90193gN;
import X.C90903hW;
import X.FMX;
import X.HG3;
import X.InterfaceC203737z7;
import X.InterfaceC85013Vh;
import X.OSZ;
import X.RBX;
import X.W5F;
import X.W5U;
import Y.ACListenerS23S0100000_3;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.favorites.ui.FavoriteNoticeSheetFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FavoriteNoticeSheetFragment extends Fragment implements DialogInterface.OnDismissListener {
    public static final /* synthetic */ int LJLJLLL = 0;
    public String LJLIL;
    public Aweme LJLILLLLZI;
    public C203727z6 LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C2062487o.LJLIL);

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        String str2;
        String str3;
        String aid;
        int i = 8;
        String str4 = null;
        if (this.LJLJI == null) {
            C203727z6 c203727z6 = new C203727z6();
            this.LJLJI = c203727z6;
            c203727z6.LJLJJLL = this.LJLIL;
            c203727z6.LJLLJ = Boolean.valueOf(this.LJLJJI);
            if (this.LJLJJI) {
                C203727z6 c203727z62 = this.LJLJI;
                if (c203727z62 != null) {
                    c203727z62.LJLLI = 9;
                } else {
                    o.LJIJI("collectActionPresenter");
                    throw null;
                }
            } else {
                C203727z6 c203727z63 = this.LJLJI;
                if (c203727z63 != null) {
                    c203727z63.LJLLI = 8;
                } else {
                    o.LJIJI("collectActionPresenter");
                    throw null;
                }
            }
        }
        C203727z6 c203727z64 = this.LJLJI;
        if (c203727z64 != null) {
            c203727z64.LJLILLLLZI = new InterfaceC203737z7() { // from class: X.87m
                @Override // X.InterfaceC203737z7
                public final void aB(Exception exc) {
                }

                @Override // X.InterfaceC203737z7
                public final void ix() {
                    Aweme aweme;
                    FavoriteNoticeSheetFragment favoriteNoticeSheetFragment = FavoriteNoticeSheetFragment.this;
                    if (!favoriteNoticeSheetFragment.LJLJJI && (aweme = favoriteNoticeSheetFragment.LJLILLLLZI) != null) {
                        String str5 = "";
                        if (!aweme.isCollected()) {
                            aweme.setCollectStatus(1);
                            AwemeService.LIZ().g6(1, aweme.getAid());
                            C2U8.LIZ(new C50420Jqa(54, favoriteNoticeSheetFragment.LJLILLLLZI));
                            String aid2 = aweme.getAid();
                            if (aid2 != null) {
                                str5 = aid2;
                            }
                            C2U8.LIZ(new C193097hx(str5, 1, false));
                            if (o.LJ("homepage_hot", favoriteNoticeSheetFragment.LJLIL)) {
                                C2MY.LIZ().LJFF(6);
                                return;
                            }
                            return;
                        }
                        aweme.setCollectStatus(0);
                        AwemeService.LIZ().g6(0, aweme.getAid());
                        C2U8.LIZ(new C50420Jqa(54, favoriteNoticeSheetFragment.LJLILLLLZI));
                        String aid3 = aweme.getAid();
                        if (aid3 != null) {
                            str5 = aid3;
                        }
                        C2U8.LIZ(new C193097hx(str5, 0, false));
                    }
                }

                @Override // X.InterfaceC203737z7
                public final void gd(String str5) {
                    Activity LJIIIIZZ;
                    if (str5 != null && FavoriteServiceImpl.LJIJJLI().LJI() <= 0 && (LJIIIIZZ = C84763XOl.LJIIIIZZ()) != null) {
                        C31811Ce7.LIZIZ(LJIIIIZZ, str5);
                    }
                }
            };
            if (!this.LJLJJI) {
                if (C52535Kjb.LIZ()) {
                    Aweme aweme = this.LJLILLLLZI;
                    if (aweme != null) {
                        Boolean LIZIZ = AwemeCollectionAgent.LJIIZILJ().LIZIZ(this.LJLILLLLZI);
                        if (this.LJLJJI) {
                            i = 9;
                        }
                        Map<String, Object> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("privacy_setting", Integer.valueOf(i)));
                        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZIZ, 0);
                        if (o.LJ(LIZIZ, Boolean.TRUE)) {
                            C87Q c87q = (C87Q) this.LJLJL.getValue();
                            String aid2 = aweme.getAid();
                            o.LJIIIIZZ(aid2, "it.aid");
                            C87P.LIZIZ(c87q, aid2, LJJLIIIIJ, new AqS185S0100000_3(aqS153S0100000_3, 0), null, 8);
                        } else {
                            C87Q c87q2 = (C87Q) this.LJLJL.getValue();
                            String aid3 = aweme.getAid();
                            o.LJIIIIZZ(aid3, "aid");
                            c87q2.LJII(aid3, LJJLIIIIJ, new AqS185S0100000_3(aqS153S0100000_3, 1), new AqS185S0100000_3(this, 2));
                        }
                    }
                } else {
                    Aweme aweme2 = this.LJLILLLLZI;
                    if (aweme2 != null) {
                        C203727z6 c203727z65 = this.LJLJI;
                        if (c203727z65 != null) {
                            c203727z65.LJIILL(2, aweme2.getAid(), Integer.valueOf(!aweme2.isCollected() ? 1 : 0), Integer.valueOf(aweme2.getAwemeType()));
                        } else {
                            o.LJIJI("collectActionPresenter");
                            throw null;
                        }
                    }
                }
            }
            Keva.getRepo("keva_favorite_notify_optimize_repo").storeBoolean("keva_has_shown_favorite_notify_optimize_sheet", true);
            if (this.LJLJJI) {
                str = "cancel";
            } else if (this.LJLJJL) {
                str = "close";
            } else if (this.LJLJJLL) {
                str = "ok";
            } else {
                str = "hotzone";
            }
            C188727au c188727au = new C188727au();
            Aweme aweme3 = this.LJLILLLLZI;
            if (aweme3 != null) {
                str4 = aweme3.getAid();
            }
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            c188727au.LJIIIZ("group_id", str4);
            Aweme aweme4 = this.LJLILLLLZI;
            if (aweme4 == null || (str2 = aweme4.getAuthorUid()) == null) {
                str2 = "";
            }
            c188727au.LJIIIZ("author_id", str2);
            IAccountUserService LJIILL = HG3.LJIILL();
            if (LJIILL == null || (str3 = ((RBX) LJIILL).getCurUserId()) == null) {
                str3 = "";
            }
            c188727au.LJIIIZ("user_id", str3);
            c188727au.LJIIIZ("click_type", str);
            c188727au.LJIIIZ("enter_from", this.LJLIL);
            Aweme aweme5 = this.LJLILLLLZI;
            if (aweme5 != null && (aid = aweme5.getAid()) != null) {
                str5 = aid;
            }
            c188727au.LJIIIZ("item_id", str5);
            c188727au.LJIIIZ("device_id", AppLog.getServerDeviceId());
            FMX.LJIIL("favorite_permit_notification", c188727au.LIZ);
            return;
        }
        o.LJIJI("collectActionPresenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UrlModel avatarLarger;
        List<String> urlList;
        o.LJIIIZ(view, "view");
        W5F LJ = W5U.LJ(R.drawable.aid);
        View findViewById = view.findViewById(R.id.d5f);
        if (C90193gN.LIZ()) {
            findViewById.setScaleX(-1.0f);
        }
        LJ.LJJIIJ = (InterfaceC85013Vh) findViewById;
        C16880lQ.LLJJJ(LJ);
        View findViewById2 = view.findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById2, "view.findViewById<TuxAvatarView>(R.id.avatar)");
        C71799SFv c71799SFv = (C71799SFv) findViewById2;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        List<String> list = null;
        if (curUser != null) {
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if ((avatarMedium == null || (urlList = avatarMedium.getUrlList()) == null) && ((avatarLarger = curUser.getAvatarLarger()) == null || (urlList = avatarLarger.getUrlList()) == null)) {
                UrlModel avatarThumb = curUser.getAvatarThumb();
                if (avatarThumb != null) {
                    list = avatarThumb.getUrlList();
                }
            } else {
                list = urlList;
            }
        }
        C71799SFv.LJIIJ(c71799SFv, new C62562cu(list), null, false, null, 126);
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 56), view.findViewById(R.id.d5a));
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 57), view.findViewById(R.id.axp));
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 58), view.findViewById(R.id.av_));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.auu, viewGroup, false);
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
}
