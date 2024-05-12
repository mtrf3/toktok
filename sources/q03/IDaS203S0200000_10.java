package q03;

import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C188727au;
import X.C228888ya;
import X.C229198z5;
import X.C27739Aud;
import X.C45804HyK;
import X.C57443MgZ;
import X.C59091NHb;
import X.C5S1;
import X.C60977NwT;
import X.C60984Nwa;
import X.C60986Nwc;
import X.C61593OFh;
import X.C61914ORq;
import X.C62722OjW;
import X.C62724OjY;
import X.C62864Olo;
import X.C64652gH;
import X.C76542zS;
import X.C78685UuP;
import X.C98T;
import X.EnumC228828yU;
import X.EnumC57444Mga;
import X.EnumC62723OjX;
import X.FMX;
import X.InterfaceC60761Nsz;
import X.InterfaceC62865Olp;
import X.P2U;
import X.SY4;
import X.XKX;
import X.XMX;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell;
import com.ss.android.ugc.aweme.relation.friendlist.InviteFriendVM;
import com.ss.android.ugc.aweme.relation.friendlist.cell.InviteFriendUserCell;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.model.SearchLandingPageButtonInfo;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS173S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDaS203S0200000_10 extends C98T {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(IDaS203S0200000_10 iDaS203S0200000_10, View view) {
        if (view != null) {
            ((RecFriendsTopBaseCell) iDaS203S0200000_10.l0).N((P2U) iDaS203S0200000_10.l1);
        }
    }

    public static final void LIZ$1(IDaS203S0200000_10 iDaS203S0200000_10, View view) {
        String str;
        String buttonName;
        if (view != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            SearchLandingPageButtonInfo searchLandingPageButtonInfo = C60986Nwc.LJI;
            String str2 = "";
            if (searchLandingPageButtonInfo == null || (str = searchLandingPageButtonInfo.getClickLink()) == null) {
                str = "";
            }
            if (C78685UuP.LJJJZ(str)) {
                intent.setData(UriProtector.parse(str));
                Intent intent2 = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
                Context context = ((View) ((InterfaceC60761Nsz) iDaS203S0200000_10.l0)).getContext();
                o.LJIIIIZZ(context, "view.context");
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                if (LJIJJ != null) {
                    C16880lQ.LIZIZ(LJIJJ, intent2);
                }
            }
            View view2 = ((C60984Nwa) iDaS203S0200000_10.l1).LJLJJL;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            SearchLandingPageButtonInfo searchLandingPageButtonInfo2 = C60986Nwc.LJI;
            if (searchLandingPageButtonInfo2 != null && (buttonName = searchLandingPageButtonInfo2.getButtonName()) != null) {
                str2 = buttonName;
            }
            C60977NwT.LJ(str2);
        }
    }

    public static final void LIZ$2(IDaS203S0200000_10 iDaS203S0200000_10, View view) {
        boolean z;
        String str;
        boolean z2;
        if (view != null) {
            boolean z3 = true;
            if (((AddFeedToMixFragment) iDaS203S0200000_10.l0).mo49getActivity() != null) {
                AddFeedToMixFragment addFeedToMixFragment = (AddFeedToMixFragment) iDaS203S0200000_10.l0;
                if (addFeedToMixFragment.LJLJJL) {
                    InterfaceC62865Olp interfaceC62865Olp = addFeedToMixFragment.LJLJJLL;
                    if (interfaceC62865Olp != null) {
                        interfaceC62865Olp.chooseMixResult(addFeedToMixFragment.LJLJI, addFeedToMixFragment.LJLJL);
                    }
                    if (((IAVPublishService) ((AddFeedToMixFragment) iDaS203S0200000_10.l0).LJLLL.getValue()).shouldShowAddToMixWithinSheet()) {
                        ASQ.LJ((AddFeedToMixFragment) iDaS203S0200000_10.l0, ASX.LIZ);
                    } else {
                        ((AddFeedToMixFragment) iDaS203S0200000_10.l0).vl();
                    }
                } else if (!((SY4) addFeedToMixFragment._$_findCachedViewById(R.id.aul)).LLI) {
                    ((SY4) ((AddFeedToMixFragment) iDaS203S0200000_10.l0)._$_findCachedViewById(R.id.aul)).setLoading(true);
                    AddFeedToMixFragment addFeedToMixFragment2 = (AddFeedToMixFragment) iDaS203S0200000_10.l0;
                    Aweme aweme = addFeedToMixFragment2.LJLILLLLZI;
                    if (aweme != null) {
                        ActivityC45651qj mo49getActivity = addFeedToMixFragment2.mo49getActivity();
                        o.LJI(mo49getActivity);
                        Aweme aweme2 = ((AddFeedToMixFragment) iDaS203S0200000_10.l0).LJLILLLLZI;
                        o.LJI(aweme2);
                        String str2 = ((AddFeedToMixFragment) iDaS203S0200000_10.l0).LJLJI;
                        o.LJI(str2);
                        int operation = EnumC228828yU.VIDEOADD.getOperation();
                        AddFeedToMixFragment addFeedToMixFragment3 = (AddFeedToMixFragment) iDaS203S0200000_10.l0;
                        C62864Olo c62864Olo = new C62864Olo(addFeedToMixFragment3, aweme);
                        String str3 = addFeedToMixFragment3.LJLJLJ;
                        String str4 = addFeedToMixFragment3.LJLJLLL;
                        String str5 = addFeedToMixFragment3.LJLJJI;
                        if (str5 != null && str5.length() != 0) {
                            AddFeedToMixFragment addFeedToMixFragment4 = (AddFeedToMixFragment) iDaS203S0200000_10.l0;
                            if (o.LJ(addFeedToMixFragment4.LJLJJI, addFeedToMixFragment4.LJLJI)) {
                                z2 = true;
                                C229198z5.LIZ(operation, mo49getActivity, aweme2, c62864Olo, str2, str3, str4, z2);
                            }
                        }
                        z2 = false;
                        C229198z5.LIZ(operation, mo49getActivity, aweme2, c62864Olo, str2, str3, str4, z2);
                    }
                }
                AddFeedToMixFragment addFeedToMixFragment5 = (AddFeedToMixFragment) iDaS203S0200000_10.l0;
                View view2 = (View) iDaS203S0200000_10.l1;
                addFeedToMixFragment5.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(view2.getContext(), "input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 0);
                }
            }
            AddFeedToMixFragment addFeedToMixFragment6 = (AddFeedToMixFragment) iDaS203S0200000_10.l0;
            if (!TextUtils.isEmpty(addFeedToMixFragment6.LJLJI) && !TextUtils.isEmpty(addFeedToMixFragment6.LJLJL)) {
                z = true;
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(addFeedToMixFragment6.LJLJI) || TextUtils.isEmpty(addFeedToMixFragment6.LJLJL)) {
                z3 = false;
            }
            if (z) {
                str = "exist";
            } else if (z3) {
                str = "new";
            } else {
                str = "";
            }
            String str6 = addFeedToMixFragment6.LJLJI;
            String str7 = addFeedToMixFragment6.LJLJLJ;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("playlist_id", str6);
            c188727au.LJIIIZ("playlist_status", str);
            c188727au.LJIIIZ("enter_from", str7);
            FMX.LJIIL("add_split_to_playlist", c188727au.LIZ);
            if (o.LJ(str, "new")) {
                C228888ya.LJ(addFeedToMixFragment6.LJLJLJ, addFeedToMixFragment6.LJLJLLL);
            }
        }
    }

    public static final void LIZ$3(IDaS203S0200000_10 iDaS203S0200000_10, View view) {
        AqS173S0200000_10 aqS173S0200000_10;
        if (view != null && (aqS173S0200000_10 = ((C61593OFh) iDaS203S0200000_10.l0).LIZIZ) != null) {
            aqS173S0200000_10.invoke(view, (C59091NHb) iDaS203S0200000_10.l1);
        }
    }

    public static final void LIZ$4(IDaS203S0200000_10 iDaS203S0200000_10, View view) {
        AqS173S0200000_10 aqS173S0200000_10;
        if (view != null && (aqS173S0200000_10 = ((C61593OFh) iDaS203S0200000_10.l0).LIZIZ) != null) {
            aqS173S0200000_10.invoke(view, (C59091NHb) iDaS203S0200000_10.l1);
        }
    }

    public static final void LIZ$5(IDaS203S0200000_10 iDaS203S0200000_10, View view) {
        C62724OjY c62724OjY;
        String uid;
        if (view != null) {
            try {
                InviteFriendVM inviteFriendVM = (InviteFriendVM) ((InviteFriendUserCell) iDaS203S0200000_10.l0).LJLILLLLZI.getValue();
                XMX item = ((InviteFriendUserCell) iDaS203S0200000_10.l0).getItem();
                if (item != null && (c62724OjY = item.LJLIL) != null && (uid = c62724OjY.getUid()) != null && ((Set) inviteFriendVM.LJLJI.getValue()).add(uid)) {
                    ((C57443MgZ) ((InviteFriendUserCell) iDaS203S0200000_10.l0).itemView.findViewById(R.id.err)).setButtonVariant(EnumC57444Mga.TT_NOW_INVITED.getValue());
                    ((C57443MgZ) ((InviteFriendUserCell) iDaS203S0200000_10.l0).itemView.findViewById(R.id.err)).setText(((InviteFriendUserCell) iDaS203S0200000_10.l0).itemView.getContext().getString(R.string.j36));
                    InviteFriendVM inviteFriendVM2 = (InviteFriendVM) ((InviteFriendUserCell) iDaS203S0200000_10.l0).LJLILLLLZI.getValue();
                    String uid2 = ((User) iDaS203S0200000_10.l1).getUid();
                    o.LJIIIIZZ(uid2, "uid");
                    String secUid = ((User) iDaS203S0200000_10.l1).getSecUid();
                    o.LJIIIIZZ(secUid, "secUid");
                    XKX.LIZLLL(inviteFriendVM2.getAssemVMScope(), null, null, new C64652gH(uid2, secUid, null), 3);
                    C62722OjW.LIZ(((User) iDaS203S0200000_10.l1).getUid(), EnumC62723OjX.CLICK_SEND, ((InviteFriendUserCell) iDaS203S0200000_10.l0).getAbsoluteAdapterPosition());
                    ((InviteFriendUserCell) iDaS203S0200000_10.l0).L((User) iDaS203S0200000_10.l1);
                }
                C5S1 c5s1 = new C5S1(((InviteFriendUserCell) iDaS203S0200000_10.l0).itemView.getContext());
                c5s1.LIZLLL(((InviteFriendUserCell) iDaS203S0200000_10.l0).itemView.getContext().getString(R.string.j38));
                c5s1.LJ();
            } catch (Exception unused) {
            }
        }
    }

    public static final void LIZ$6(IDaS203S0200000_10 iDaS203S0200000_10, View view) {
        Bundle arguments;
        String string;
        if (view == null || (arguments = ((StoreFragment) iDaS203S0200000_10.l0).getArguments()) == null || (string = arguments.getString("sellerId")) == null || ujb.o.LJJJJJL(string)) {
            return;
        }
        C76542zS.LIZ("tiktokec_search_entrance_click", ((StoreFragment) iDaS203S0200000_10.l0).LJLIL);
        String LIZLLL = C78685UuP.LIZLLL(((IEcomSearchService) iDaS203S0200000_10.l1).LJIJJ(), string, "sellerId");
        StoreFragment storeFragment = (StoreFragment) iDaS203S0200000_10.l0;
        storeFragment.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : storeFragment.LJLIL.entrySet()) {
            if (C61914ORq.LIZ.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("traffic_source", 7);
        SmartRouter.buildRoute(view.getContext(), C78685UuP.LIZLLL(LIZLLL, Uri.encode(C27739Aud.LJI(linkedHashMap)), "trackParams")).open();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS203S0200000_10(RecFriendsTopBaseCell recFriendsTopBaseCell, P2U p2u, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = recFriendsTopBaseCell;
        this.l1 = p2u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS203S0200000_10(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
