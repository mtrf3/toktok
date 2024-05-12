package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui;

import X.AJ9;
import X.AbstractC50059Jkl;
import X.ActivityC45651qj;
import X.C00F;
import X.C113554cx;
import X.C116724i4;
import X.C16530kr;
import X.C16880lQ;
import X.C17N;
import X.C188627ak;
import X.C221108m2;
import X.C226668v0;
import X.C239319aJ;
import X.C32151Nz;
import X.C36636EZk;
import X.C45804HyK;
import X.C47261Igj;
import X.C48841JEv;
import X.C49098JOs;
import X.C49391JZz;
import X.C49394Ja2;
import X.C49399Ja7;
import X.C49401Ja9;
import X.C49410JaI;
import X.C49411JaJ;
import X.C49412JaK;
import X.C49420JaS;
import X.C49421JaT;
import X.C49422JaU;
import X.C49448Jau;
import X.C49458Jb4;
import X.C49465JbB;
import X.C49489JbZ;
import X.C49618Jde;
import X.C50238Jne;
import X.C50321Joz;
import X.C50322Jp0;
import X.C50433Jqn;
import X.C50469JrN;
import X.C50605JtZ;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50653JuL;
import X.C50654JuM;
import X.C50699Jv5;
import X.C51094K3m;
import X.C51698KQs;
import X.C51757KSz;
import X.C53691L5j;
import X.C53873LCj;
import X.C55230Lly;
import X.C57127MbT;
import X.C57128MbU;
import X.C62822Ol8;
import X.C64962gm;
import X.C6ZT;
import X.C78685UuP;
import X.C78847Ux1;
import X.C78857UxB;
import X.C78895Uxn;
import X.C78934UyQ;
import X.C79045V0n;
import X.C79146V4k;
import X.DY9;
import X.DYF;
import X.E2C;
import X.EnumC49404JaC;
import X.InterfaceC49417JaP;
import X.InterfaceC49419JaR;
import X.InterfaceC55235Lm3;
import X.JNB;
import X.JND;
import X.JNU;
import X.JNW;
import X.JQA;
import X.JRS;
import X.JTI;
import X.JVN;
import X.JYG;
import X.JZB;
import X.KT1;
import X.LD1;
import X.O6R;
import X.ORZ;
import X.OSZ;
import X.QD3;
import X.SJU;
import X.T5R;
import X.TMC;
import X.V1B;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS27S0200000_8;
import Y.ARunnableS44S0100000_8;
import Y.IDTListenerS117S0100000_8;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveAvatarAnimationOptimizeV2Config;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public final class SearchUserViewHolder extends JNU implements View.OnClickListener, Observer<FollowStatus> {
    public static final /* synthetic */ int LLILZIL = 0;
    public C53691L5j LJLJL;
    public View LJLJLJ;
    public C57128MbU LJLJLLL;
    public C53873LCj LJLL;
    public C239319aJ LJLLI;
    public View LJLLILLLL;
    public RelationButton LJLLJ;
    public TextView LJLLL;
    public TextView LJLLLL;
    public TuxTextView LJLLLLLL;
    public C188627ak LJLZ;
    public RelativeLayout LJZ;
    public ViewStub LJZI;
    public ViewStub LJZL;
    public C49399Ja7 LL;
    public C49465JbB LLD;
    public LD1 LLF;
    public User LLFF;
    public volatile SearchUser LLFFF;
    public final JZB LLFII;
    public InterfaceC49417JaP LLFZ;
    public final C51698KQs LLI;
    public C49448Jau LLIFFJFJJ;
    public SearchResultParam LLII;
    public String LLIIII;
    public boolean LLIIIILZ;
    public volatile boolean LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public User LLIIIZ;
    public SearchUser LLIIJI;
    public EnumC49404JaC LLIIJLIL;
    public final AObserverS76S0100000_8 LLIIL;
    public final AObserverS76S0100000_8 LLIILII;
    public final boolean LLIILZL;
    public boolean LLIIZ;
    public final C62822Ol8 LLIL;
    public final C62822Ol8 LLILII;
    public final AqS158S0100000_8 LLILIL;
    public final boolean LLILL;
    public final C64962gm LLILLIZIL;
    public final C62822Ol8 LLILLJJLI;
    public final C62822Ol8 LLILLL;
    public final SearchUserViewHolder$lifecycleCallback$1 LLILZ;

    @Override // X.JNU
    public final void N() {
        ((Map) ((C49391JZz) this.LLIL.getValue()).LJFF.getValue()).clear();
    }

    public final void Q() {
        int i;
        int followStatus;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        User user = this.LLFF;
        if (user != null) {
            C116724i4 c116724i4 = new C116724i4();
            String searchUserName = user.getSearchUserName();
            if (searchUserName == null || !C78857UxB.LJJJIL(searchUserName)) {
                searchUserName = "";
            }
            c116724i4.LIZLLL(searchUserName);
            T5R t5r = new T5R(c116724i4.LIZ);
            t5r.LIZ(42);
            Integer LJI = C79045V0n.LJI(R.attr.go, getContext());
            int i2 = 0;
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            t5r.setSpan(new ForegroundColorSpan(i), 0, t5r.length(), 33);
            spannableStringBuilder.append((CharSequence) t5r);
            C49448Jau c49448Jau = this.LLIFFJFJJ;
            if (c49448Jau != null) {
                c49448Jau.LIZ(spannableStringBuilder, "search_user_name", 0);
            }
            if (AJ9.LIZIZ(new UserVerify(null, user.getCustomVerify(), user.getEnterpriseVerifyReason(), -1))) {
                spannableStringBuilder.append((CharSequence) " T");
                spannableStringBuilder.setSpan(new SJU(R.drawable.ax3, getContext()), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
            }
            if (user.isPrivateAccount() && DY9.LJLJI.LIZLLL() && (followStatus = user.getFollowStatus()) != 1 && followStatus != 2) {
                String string = getContext().getString(R.string.pb1);
                o.LJIIIIZZ(string, "context.getString(R.string.private_permission)");
                C116724i4 c116724i42 = new C116724i4();
                c116724i42.LIZLLL(string);
                T5R t5r2 = new T5R(c116724i42.LIZ);
                t5r2.LIZ(61);
                spannableStringBuilder.append((CharSequence) " · ");
                spannableStringBuilder.append((CharSequence) t5r2);
                Integer LJI2 = C79045V0n.LJI(R.attr.gv, getContext());
                if (LJI2 != null) {
                    i2 = LJI2.intValue();
                }
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i2), (spannableStringBuilder.length() - 3) - t5r2.length(), spannableStringBuilder.length(), 33);
            }
        }
        TextView textView = this.LJLLL;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
        } else {
            o.LJIJI("usernameText");
            throw null;
        }
    }

    public final void T() {
        RelationButton relationButton = this.LJLLJ;
        if (relationButton != null) {
            C226668v0 c226668v0 = new C226668v0();
            c226668v0.LIZ = this.LLFF;
            c226668v0.LIZIZ = !C49421JaT.LIZLLL(r0);
            relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
            return;
        }
        o.LJIJI("relationBtn");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder.U():void");
    }

    public final String Y() {
        ProductGroup productGroup;
        Integer num;
        ProductGroup productGroup2;
        Integer num2;
        SearchUser searchUser = this.LLFFF;
        if (searchUser == null || (productGroup2 = searchUser.productGroup) == null || (num2 = productGroup2.shopType) == null || num2.intValue() != 1) {
            SearchUser searchUser2 = this.LLFFF;
            if (searchUser2 == null || (productGroup = searchUser2.productGroup) == null || (num = productGroup.shopType) == null || num.intValue() != 2) {
                return "";
            }
            return "shop";
        }
        return "window";
    }

    public final String f0() {
        SearchUser searchUser;
        ProductGroup productGroup;
        C49410JaI.LIZ.getClass();
        if (C49410JaI.LIZ() && (searchUser = this.LLFFF) != null && (productGroup = searchUser.productGroup) != null && o.LJ(productGroup.showEntrance, Boolean.TRUE)) {
            return "showcase_entrance";
        }
        return "";
    }

    public final void l0() {
        User user = this.LLFF;
        if (user != null) {
            C49458Jb4 LIZIZ = C49420JaS.LIZIZ("search_popup_confirm_click", LJLJL(), user);
            LIZIZ.LJIIZILJ("button_type", "click_back");
            LIZIZ.LJIILIIL();
        }
    }

    public final void n0() {
        User user = this.LLFF;
        if (user != null) {
            C49458Jb4 LIZIZ = C49420JaS.LIZIZ("search_popup_confirm_click", LJLJL(), user);
            LIZIZ.LJIIZILJ("button_type", "click_unfollow");
            LIZIZ.LJIILIIL();
        }
    }

    public final void o0() {
        User user = this.LLFF;
        if (user != null) {
            C49420JaS.LIZIZ("search_popup_confirm_show", LJLJL(), user).LJIILIIL();
        }
    }

    public final String a0() {
        if (o.LJ(LJLJL().LJFF, "find_friends")) {
            if (o.LJ(LJLJL().LJJI, "now_find_friends_search")) {
                return "now_find_friends_page";
            }
            return "find_friends_page";
        }
        SearchResultParam searchResultParam = this.LLII;
        if (searchResultParam != null) {
            return searchResultParam.getSearchEnterFromPage();
        }
        return null;
    }

    public final String c0() {
        if (LJLJL().LJJIJIIJIL != null) {
            return "1";
        }
        SearchUser searchUser = this.LLFFF;
        if (searchUser != null && searchUser.isAladdin()) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public final String g0() {
        User user;
        String uid;
        String str = LJLJL().LJJIJIIJI;
        if (str.length() > 0) {
            return str;
        }
        SearchUser searchUser = this.LLFFF;
        if (searchUser == null || (user = searchUser.user) == null || (uid = user.getUid()) == null) {
            return "";
        }
        return uid;
    }

    public final String getEnterFrom() {
        if (LJLJL().LIZ) {
            return "general_search";
        }
        return "search_result";
    }

    public final String h0() {
        List<Aweme> list;
        if (!TextUtils.isEmpty(LJLJL().LJJIJ)) {
            return LJLJL().LJJIJ;
        }
        SearchUser searchUser = this.LLFFF;
        if (searchUser != null && (list = searchUser.awemeCards) != null && (!list.isEmpty())) {
            return "hot_user";
        }
        return "person";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder$lifecycleCallback$1] */
    public SearchUserViewHolder(View view) {
        super(view);
        o.LJIIIZ(view, "view");
        this.LLIIIILZ = true;
        this.LLIIIL = C221108m2.LIZIZ(C49394Ja2.LJLIL);
        this.LLIIL = new AObserverS76S0100000_8(this, 51);
        this.LLIILII = new AObserverS76S0100000_8(this, 52);
        this.LLIILZL = ((Boolean) C49422JaU.LIZ.getValue()).booleanValue();
        this.LLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 269));
        this.LLILII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 267));
        this.LLILIL = new AqS158S0100000_8(this, 268);
        this.LLILL = C50238Jne.LJ();
        this.LLILLIZIL = C48841JEv.LIZ(C36636EZk.LIZ);
        this.LLILLJJLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 620));
        this.LLILLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 266));
        this.LLILZ = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder$lifecycleCallback$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                } else if (event == Lifecycle.Event.ON_PAUSE) {
                    onPause();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPause() {
                LD1 ld1 = SearchUserViewHolder.this.LLF;
                if (ld1 != null) {
                    ld1.LJ();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                LD1 ld1 = SearchUserViewHolder.this.LLF;
                if (ld1 != null) {
                    ld1.LJI();
                }
            }
        };
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: m0 */
    public final void onChanged(FollowStatus followStatus) {
        User user = this.LLFF;
        if (user == null || followStatus == null || !o.LJ(user.getUid(), followStatus.userId)) {
            return;
        }
        s0(followStatus);
        SearchGlobalViewModel M = M();
        if (M != null) {
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            M.pv0(followStatus.followStatus, uid);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC55235Lm3 interfaceC55235Lm3;
        boolean z;
        boolean z2;
        GlobalDoodleConfig globalDoodleConfig;
        String str;
        String str2;
        String l;
        C50469JrN searchVideoModel;
        C50433Jqn searchCommonModel;
        if (view != null) {
            interfaceC55235Lm3 = C55230Lly.LJ(view);
        } else {
            interfaceC55235Lm3 = null;
        }
        new C50699Jv5(interfaceC55235Lm3).LJI();
        if (C6ZT.LIZ(view)) {
            return;
        }
        if (view != null && view.getId() == R.id.eye) {
            z = true;
        } else {
            z = false;
        }
        if (z && C51094K3m.LIZ(this.LLFF)) {
            User user = this.LLFF;
            if (user == null) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C78934UyQ.LJIILJJIL(user));
            String str3 = "";
            LIZ.append("");
            String LIZIZ = X1D.LIZIZ(LIZ);
            C50654JuM c50654JuM = C50653JuL.LJLILLLLZI;
            OSZ[] oszArr = new OSZ[5];
            User user2 = this.LLFF;
            o.LJI(user2);
            oszArr[0] = new OSZ("search_result_id", user2.getUid());
            oszArr[1] = new OSZ("search_id", LJLJL().LJII);
            C50651JuJ c50651JuJ = C50652JuK.Companion;
            View view2 = this.itemView;
            c50651JuJ.getClass();
            C50650JuI LJI = C50651JuJ.LJI(view2);
            if (LJI == null || (searchCommonModel = LJI.getSearchCommonModel()) == null || (str = searchCommonModel.getEnterFrom()) == null) {
                str = "";
            }
            oszArr[2] = new OSZ("search_entrance", str);
            oszArr[3] = new OSZ("list_item_id", LIZIZ);
            C50650JuI LJI2 = C50651JuJ.LJI(this.itemView);
            if (LJI2 == null || (searchVideoModel = LJI2.getSearchVideoModel()) == null || (str2 = searchVideoModel.getGroupId()) == null) {
                str2 = "";
            }
            oszArr[4] = new OSZ("last_from_group_id", str2);
            Map LJJL = C113554cx.LJJL(oszArr);
            c50654JuM.getClass();
            C50654JuM.LIZJ(LJJL, false);
            OSZ[] oszArr2 = new OSZ[2];
            User user3 = this.LLFF;
            if (user3 != null && (l = Long.valueOf(C78934UyQ.LJIILJJIL(user3)).toString()) != null) {
                str3 = l;
            }
            oszArr2[0] = new OSZ("room_id", str3);
            oszArr2[1] = new OSZ("list_result_type", "live");
            i0("click_into_live", C113554cx.LJJL(oszArr2));
            long LJIILJJIL = C78934UyQ.LJIILJJIL(user);
            String str4 = LJLJL().LJII;
            String str5 = LJLJL().LJ;
            String str6 = LJLJL().LIZJ;
            User user4 = this.LLFF;
            o.LJI(user4);
            String uid = user4.getUid();
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            logData.search_id = str4;
            logData.search_keyword = str5;
            logData.search_type = str6;
            logData.search_result_id = uid;
            logData.list_item_id = LIZIZ;
            logData.requestId = str4;
            logData.anchorId = user.getUid();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.enterMethod = "others_photo";
            roomsData.followStatus = String.valueOf(user.getFollowStatus());
            String str7 = user.roomData;
            if (str7 != null) {
                try {
                    Room room = (Room) GsonHolder.LIZLLL().LIZ().LJI(str7, Room.class);
                    if (room != null) {
                        C78847Ux1.LJIILL(room, enterRoomConfig);
                    }
                } catch (Exception unused) {
                }
            }
            ArrayList LJII = C47261Igj.LJII(Long.valueOf(LJIILJJIL));
            ArrayList LJII2 = C47261Igj.LJII(new RoomInfo(LJIILJJIL, user.getUid()));
            C49489JbZ c49489JbZ = C49489JbZ.LIZ;
            Context context = getContext();
            String enterFrom = getEnterFrom();
            c49489JbZ.getClass();
            C49489JbZ.LIZ(LJIILJJIL, context, enterRoomConfig, enterFrom, LJII, LJII2);
            return;
        }
        SearchUser searchUser = this.LLFFF;
        if (searchUser != null && (globalDoodleConfig = searchUser.mGlobalDoodleConfig) != null) {
            z2 = o.LJ(globalDoodleConfig.getHasEcomIntent(), Boolean.TRUE);
        } else {
            z2 = false;
        }
        if (z2) {
            X(this, false, "9", E2C.LIZJ("list_result_type", "user"), 13);
        } else {
            X(this, false, null, E2C.LIZJ("list_result_type", "user"), 15);
        }
    }

    @QD3
    public final void onContainerLoadingEvent(JRS event) {
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI == 4) {
            this.LLIIIILZ = false;
        }
    }

    @QD3
    public final void onFollowStatusEvent(FollowStatusEvent followStatusEvent) {
        this.itemView.post(new ARunnableS27S0200000_8(followStatusEvent, this, 35));
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        ActivityC45651qj LJJIFFI;
        LD1 ld1;
        InterfaceC49419JaR interfaceC49419JaR;
        C49399Ja7 c49399Ja7;
        JTI jti;
        RecyclerView recyclerView;
        RecyclerView.ViewHolder LJJJJJL;
        int bindingAdapterPosition;
        Aweme aweme;
        List<? extends Aweme> list;
        o.LJIIIZ(v, "v");
        super.onViewAttachedToWindow(v);
        EventBus.LIZJ().LJIILJJIL(this);
        if (this.LLIIIILZ) {
            C49618Jde.LIZ(this.itemView, new ARunnableS44S0100000_8(this, 44));
            SearchUser searchUser = this.LLFFF;
            if (searchUser != null && searchUser.hasMedia() && (c49399Ja7 = this.LL) != null && (jti = c49399Ja7.LJIIIZ) != null && (recyclerView = jti.LJLILLLLZI) != null) {
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (childAt != null && (LJJJJJL = recyclerView.LJJJJJL(childAt)) != null && (bindingAdapterPosition = LJJJJJL.getBindingAdapterPosition()) != -1) {
                        SearchAwemeCardForUser searchAwemeCardForUser = c49399Ja7.LJIIJ;
                        if (searchAwemeCardForUser != null && (list = searchAwemeCardForUser.LJLJJI) != null) {
                            aweme = (Aweme) ORZ.LJLLLLLL(bindingAdapterPosition, list);
                        } else {
                            aweme = null;
                        }
                        SearchAwemeCardForUser searchAwemeCardForUser2 = c49399Ja7.LJIIJ;
                        if (searchAwemeCardForUser2 != null) {
                            searchAwemeCardForUser2.LJJ(aweme, Integer.valueOf(bindingAdapterPosition)).LJIILIIL();
                        }
                    }
                }
            }
            C49399Ja7 c49399Ja72 = this.LL;
            if (c49399Ja72 != null && (interfaceC49419JaR = c49399Ja72.LJIIL) != null) {
                interfaceC49419JaR.trackVisible();
            }
        }
        if (((LiveAvatarAnimationOptimizeV2Config) C78895Uxn.LIZ().LJIIIZ(LiveAvatarAnimationOptimizeV2Config.LIZ, "live_avatar_animation_optimize_v2")).enable) {
            C53873LCj c53873LCj = this.LJLL;
            if (c53873LCj != null) {
                Context context = c53873LCj.getContext();
                if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (ld1 = this.LLF) != null && ld1.LJIIIZ()) {
                    LJJIFFI.getLifecycle().addObserver(this.LLILZ);
                    return;
                }
                return;
            }
            o.LJIJI("liveCircleView");
            throw null;
        }
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        ActivityC45651qj LJJIFFI;
        LD1 ld1;
        o.LJIIIZ(v, "v");
        super.onViewDetachedFromWindow(v);
        EventBus.LIZJ().LJIJ(this);
        if (((LiveAvatarAnimationOptimizeV2Config) LiveOuterService.LJJJLL().LJJIZ().LJJIJIL().LJIIIZ(LiveAvatarAnimationOptimizeV2Config.LIZ, "live_avatar_animation_optimize_v2")).enable) {
            C53873LCj c53873LCj = this.LJLL;
            if (c53873LCj != null) {
                Context context = c53873LCj.getContext();
                if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (ld1 = this.LLF) != null && ld1.LJIIIZ()) {
                    LJJIFFI.getLifecycle().removeObserver(this.LLILZ);
                    return;
                }
                return;
            }
            o.LJIJI("liveCircleView");
            throw null;
        }
    }

    public final void s0(FollowStatus followStatus) {
        User user;
        if (C00F.LIZ(31744, 0, "disable_relationship", true) == 1 || followStatus == null || (user = this.LLFF) == null || !TextUtils.equals(followStatus.userId, user.getUid())) {
            return;
        }
        int i = followStatus.followStatus;
        if (i == 1 || i == 2 || i == 4) {
            this.LLIIJLIL = EnumC49404JaC.SHOW_FOLLOW;
        } else if (i == 0) {
            this.LLIIJLIL = EnumC49404JaC.EMPTY;
        }
        int followStatus2 = user.getFollowStatus();
        user.setFollowStatus(followStatus.followStatus);
        if (followStatus2 != followStatus.followStatus) {
            Q();
        }
        U();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchUserViewHolder(View view, JZB jzb) {
        this(view);
        o.LJIIIZ(view, "view");
        View findViewById = view.findViewById(R.id.dc_);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.fl_avatar)");
        this.LJLJLJ = findViewById;
        View findViewById2 = view.findViewById(R.id.dfe);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.fl_now_avatar)");
        this.LJLJL = (C53691L5j) findViewById2;
        View findViewById3 = view.findViewById(R.id.eye);
        o.LJIIIIZZ(findViewById3, "view.findViewById<Avatar…WithLive>(R.id.iv_avatar)");
        C57128MbU c57128MbU = (C57128MbU) findViewById3;
        C57127MbT avatarImageView = c57128MbU.getAvatarImageView();
        o.LJIIIIZZ(avatarImageView, "avatarImageView");
        C49421JaT.LJFF(avatarImageView);
        this.LJLJLLL = c57128MbU;
        View findViewById4 = view.findViewById(R.id.eud);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.item_live_circle)");
        this.LJLL = (C53873LCj) findViewById4;
        View findViewById5 = view.findViewById(R.id.aw_);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.btn_follow)");
        this.LJLLI = (C239319aJ) findViewById5;
        View findViewById6 = view.findViewById(R.id.l29);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.temp_follow_layout)");
        this.LJLLILLLL = findViewById6;
        View findViewById7 = view.findViewById(R.id.iu_);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.relationBtn)");
        this.LJLLJ = (RelationButton) findViewById7;
        View findViewById8 = view.findViewById(R.id.mq0);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.tv_username)");
        this.LJLLL = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.m09);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.tv_aweme_id)");
        this.LJLLLL = (TextView) findViewById9;
        View findViewById10 = view.findViewById(R.id.m4n);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.tv_desc)");
        this.LJLLLLLL = (TuxTextView) findViewById10;
        View findViewById11 = view.findViewById(R.id.gv3);
        o.LJIIIIZZ(findViewById11, "view.findViewById(R.id.mutual_relation_view)");
        this.LJLZ = (C188627ak) findViewById11;
        View findViewById12 = view.findViewById(R.id.n16);
        o.LJIIIIZZ(findViewById12, "view.findViewById(R.id.user_video_playlist_stub)");
        this.LJZI = (ViewStub) findViewById12;
        View findViewById13 = view.findViewById(R.id.n05);
        o.LJIIIIZZ(findViewById13, "view.findViewById(R.id.user_product_list_stub)");
        this.LJZL = (ViewStub) findViewById13;
        ViewStub viewStub = this.LJZI;
        if (viewStub != null) {
            C49399Ja7 c49399Ja7 = new C49399Ja7(viewStub, (ViewGroup) view);
            c49399Ja7.LJIJI = new AqS158S0100000_8(this, 470);
            this.LL = c49399Ja7;
            C16880lQ.LJIIJ(this, view);
            C57128MbU c57128MbU2 = this.LJLJLLL;
            if (c57128MbU2 != null) {
                c57128MbU2.setOnClickListener(new ViewOnClickListenerC13880ga(this));
                C57128MbU c57128MbU3 = this.LJLJLLL;
                if (c57128MbU3 != null) {
                    c57128MbU3.setAvatarRoundingPadding(0.0f);
                    View findViewById14 = view.findViewById(R.id.jer);
                    o.LJIIIIZZ(findViewById14, "view.findViewById(R.id.search_common_user_rl)");
                    this.LJZ = (RelativeLayout) findViewById14;
                    C49098JOs.LIZ.getClass();
                    Integer valueOf = Integer.valueOf(C49098JOs.LJFF());
                    if (valueOf.intValue() > 0) {
                        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
                        C57128MbU c57128MbU4 = this.LJLJLLL;
                        if (c57128MbU4 != null) {
                            ViewGroup.LayoutParams layoutParams = c57128MbU4.getLayoutParams();
                            int LIZJ = LJJIIZ - (layoutParams instanceof ViewGroup.MarginLayoutParams ? C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams) : 0);
                            if (LIZJ > 0) {
                                View view2 = this.LJLJLJ;
                                if (view2 != null) {
                                    V1B.LJLLL(LIZJ, view2);
                                } else {
                                    o.LJIJI("avatarContainer");
                                    throw null;
                                }
                            }
                            View view3 = this.LJLLILLLL;
                            if (view3 != null) {
                                V1B.LJLJLJ(LJJIIZ, view3);
                            } else {
                                o.LJIJI("relationContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("avatarImage");
                            throw null;
                        }
                    }
                    this.LLFII = jzb;
                    C239319aJ c239319aJ = this.LJLLI;
                    if (c239319aJ != null) {
                        C51698KQs c51698KQs = new C51698KQs(c239319aJ, new C49401Ja9(this));
                        if (!DYF.LJLJI.LIZLLL()) {
                            return;
                        }
                        c51698KQs.LJLJLJ = new C49411JaJ(this);
                        c51698KQs.LJLJJL = new C49412JaK(this);
                        c51698KQs.LJLJLLL = true;
                        this.LLI = c51698KQs;
                        return;
                    }
                    o.LJIJI("followButton");
                    throw null;
                }
                o.LJIJI("avatarImage");
                throw null;
            }
            o.LJIJI("avatarImage");
            throw null;
        }
        o.LJIJI("videoAndPlaylistStub");
        throw null;
    }

    public final void P(View view, SearchUser searchUser) {
        JYG jyg;
        String value;
        String str;
        String str2;
        String secUid;
        if (this.LJLJJL) {
            if (C78685UuP.LJJJZ(this.LJLJJI)) {
                value = this.LJLJJI;
            } else {
                value = KT1.USER.getValue();
            }
            jyg = new JYG(value, null, null, null, null, null, null, 126, null);
            jyg.setImgCover(searchUser.user.getAvatarThumb());
            jyg.setTitle(searchUser.user.getSearchUserName());
            jyg.setMultipleChoices(C51757KSz.LIZLLL(jyg.getFeedbackType()));
            OSZ[] oszArr = new OSZ[9];
            oszArr[0] = new OSZ("enter_from", getEnterFrom());
            oszArr[1] = new OSZ("search_result_id", g0());
            oszArr[2] = new OSZ("token_type", h0());
            oszArr[3] = new OSZ("is_aladdin", c0());
            int i = searchUser.rank;
            if (i == 0) {
                i = LJLJL().LJIIL;
            }
            oszArr[4] = new OSZ("rank", String.valueOf(i));
            oszArr[5] = new OSZ("list_result_type", "user");
            User user = searchUser.user;
            if (user != null) {
                str = user.getUniqueId();
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            oszArr[6] = new OSZ("unique_id", str);
            User user2 = searchUser.user;
            if (user2 != null && user2.isBlocked()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[7] = new OSZ("is_blocked", str2);
            User user3 = searchUser.user;
            if (user3 != null && (secUid = user3.getSecUid()) != null) {
                str3 = secUid;
            }
            oszArr[8] = new OSZ("sec_user_id", str3);
            Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
            if (searchUser.isAladdin()) {
                LJJLIIIIJ.put("aladdin_rank", String.valueOf(getAdapterPosition()));
            } else if (LJLJL().LIZ) {
                LJJLIIIIJ.put("item_rank", String.valueOf(getAdapterPosition()));
            }
            jyg.setLogParams(LJJLIIIIJ);
        } else {
            jyg = null;
        }
        RelativeLayout relativeLayout = this.LJZ;
        if (relativeLayout != null) {
            L(view, relativeLayout, jyg, new IDTListenerS117S0100000_8(this, 4));
        } else {
            o.LJIJI("commonUserLayout");
            throw null;
        }
    }

    public final void i0(String str, Map<String, String> map) {
        String str2;
        User user;
        String str3;
        String str4;
        int i;
        Integer num;
        String searchUserName;
        User user2;
        ProductGroup productGroup;
        List<Product> list;
        User user3;
        User user4;
        JQA LJLJL = LJLJL();
        SearchGlobalViewModel M = M();
        String str5 = null;
        if (M != null) {
            str2 = M.jv0();
        } else {
            str2 = null;
        }
        LJLJL.LIZ(str2);
        JNB LIZ = JND.LIZ(LJLJL);
        String h0 = h0();
        SearchUser searchUser = this.LLFFF;
        if (searchUser != null) {
            user = searchUser.user;
        } else {
            user = null;
        }
        String LJJIJIL = C79146V4k.LJJIJIL(user);
        if (this.LLIIJLIL == EnumC49404JaC.SHOW_BLOCK) {
            LJJIJIL = "blocked";
        }
        LIZ.LJIIZILJ("token_type", h0);
        LIZ.LJIIZILJ("product_window_type", f0());
        LIZ.LJIIZILJ("ecom_user_type", Y());
        LIZ.LJIJ("user_tag", LJJIJIL);
        SearchUser searchUser2 = this.LLFFF;
        if (searchUser2 != null && (user4 = searchUser2.user) != null) {
            str3 = user4.getUniqueId();
        } else {
            str3 = null;
        }
        LIZ.LJIIZILJ("user_name", str3);
        SearchUser searchUser3 = this.LLFFF;
        if (searchUser3 != null && (user3 = searchUser3.user) != null) {
            str4 = user3.getUid();
        } else {
            str4 = null;
        }
        LIZ.LJIIZILJ("user_list", str4);
        LIZ.LJJIIJZLJL(c0());
        SearchUser searchUser4 = this.LLFFF;
        if (searchUser4 != null && (productGroup = searchUser4.productGroup) != null && (list = productGroup.productList) != null && (!list.isEmpty())) {
            i = 1;
        } else {
            i = 0;
        }
        LIZ.LJJIIJ(Integer.valueOf(i));
        LIZ.LJIJ("search_result_id", g0());
        User user5 = this.LLFF;
        if (user5 != null) {
            num = Integer.valueOf(C45804HyK.LJJIIJ(user5));
        } else {
            num = null;
        }
        LIZ.LJIIZILJ("relation_tag", String.valueOf(num));
        LIZ.LIZLLL("section_type", this.LLIIII);
        SearchUser searchUser5 = this.LLFFF;
        if (searchUser5 != null && searchUser5.isAladdin()) {
            LIZ.LJIIZILJ("aladdin_button_type", str);
            SearchUser searchUser6 = this.LLFFF;
            if (searchUser6 != null && (user2 = searchUser6.user) != null) {
                str5 = user2.getUid();
            }
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            LIZ.LJIIZILJ("list_item_id", str5);
            LIZ.LJJIII(Integer.valueOf(getAdapterPosition()));
            User user6 = this.LLFF;
            if (user6 != null && (searchUserName = user6.getSearchUserName()) != null) {
                str6 = searchUserName;
            }
            LIZ.LIZLLL("aladdin_words", str6);
        } else {
            LIZ.LJIIZILJ("button_type", str);
            if (LJLJL().LIZ) {
                LIZ.LJIIZILJ("item_rank", String.valueOf(getAdapterPosition()));
            }
        }
        if (map != null) {
            LIZ.LIZ(map);
        }
        LIZ.LJIILIIL();
    }

    public final void p0(String str, Map map, boolean z) {
        int i;
        String str2;
        String str3;
        String str4;
        C50433Jqn searchCommonModel;
        String enterFrom;
        C50469JrN searchVideoModel;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        ISearchContextAbility LJJJJJ = C17N.LJJJJJ(itemView);
        if (LJJJJJ != null && (If = LJJJJJ.If()) != null && (LIZJ = If.LIZJ()) != null) {
            C50651JuJ c50651JuJ = C50652JuK.Companion;
            View view = this.itemView;
            c50651JuJ.getClass();
            TMC.LJIIJ(C50651JuJ.LJIIIZ(view), LIZJ, "SearchUserViewHolder 1417");
        }
        C50651JuJ c50651JuJ2 = C50652JuK.Companion;
        View view2 = this.itemView;
        c50651JuJ2.getClass();
        C50321Joz LIZLLL = C50651JuJ.LIZLLL(view2);
        if (LIZLLL != null) {
            i = LIZLLL.getTabIndex();
        } else {
            i = 0;
        }
        String LJII = C50605JtZ.LJII(i);
        C50654JuM c50654JuM = C50653JuL.LJLILLLLZI;
        OSZ[] oszArr = new OSZ[7];
        oszArr[0] = new OSZ("search_result_id", g0());
        String str5 = "";
        if (LIZLLL == null || (str2 = LIZLLL.getSearchId()) == null) {
            str2 = "";
        }
        oszArr[1] = new OSZ("search_id", str2);
        oszArr[2] = new OSZ("is_search_scene", "1");
        if (LIZLLL == null || (str3 = LIZLLL.getSearchKeyword()) == null) {
            str3 = "";
        }
        oszArr[3] = new OSZ("search_keyword", str3);
        C50650JuI LJI = C50651JuJ.LJI(this.itemView);
        if (LJI == null || (searchVideoModel = LJI.getSearchVideoModel()) == null || (str4 = searchVideoModel.getGroupId()) == null) {
            str4 = "";
        }
        oszArr[4] = new OSZ("last_from_group_id", str4);
        oszArr[5] = new OSZ("search_type", LJII);
        C50650JuI LJI2 = C50651JuJ.LJI(this.itemView);
        if (LJI2 != null && (searchCommonModel = LJI2.getSearchCommonModel()) != null && (enterFrom = searchCommonModel.getEnterFrom()) != null) {
            str5 = enterFrom;
        }
        oszArr[6] = new OSZ("search_entrance", str5);
        Map LJJL = C113554cx.LJJL(oszArr);
        c50654JuM.getClass();
        C50654JuM.LIZJ(LJJL, false);
        if (!C78857UxB.LJJJIL(str)) {
            if (z) {
                str = "click_see_all";
            } else {
                str = "click_info";
            }
        }
        i0(str, map);
    }

    public static /* synthetic */ void X(SearchUserViewHolder searchUserViewHolder, boolean z, String str, Map map, int i) {
        boolean z2 = z;
        String str2 = str;
        if ((i & 1) != 0) {
            z2 = false;
        }
        Map map2 = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 16) == 0) {
            map2 = map;
        }
        searchUserViewHolder.V(str2, null, map2, z2, false);
    }

    public final void V(String str, String str2, Map map, boolean z, boolean z2) {
        User user;
        String requestId;
        p0(str2, map, z);
        User user2 = this.LLFF;
        String str3 = null;
        if (user2 != null) {
            str3 = C79146V4k.LJJIJIL(user2);
        }
        if (this.LLIIJLIL == EnumC49404JaC.SHOW_BLOCK) {
            str3 = "blocked";
        }
        User user3 = this.LLFF;
        if ((user3 == null || (requestId = user3.getRequestId()) == null || requestId.length() == 0) && (user = this.LLFF) != null) {
            user.setRequestId(LJLJL().LJII);
        }
        JVN jvn = new JVN();
        jvn.LIZ = this.itemView;
        jvn.LIZIZ = this.LLFF;
        jvn.LIZJ = getAdapterPosition();
        jvn.LIZLLL = str3;
        jvn.LJ = str;
        jvn.LJFF = JNW.LIZIZ(LJLJL().LJ);
        jvn.LJI = z2;
        jvn.LJII = a0();
        User user4 = this.LLFF;
        if (user4 != null) {
            UserProfilePreloadHelper.LJIIIIZZ().LIZJ(user4);
        }
        JZB jzb = this.LLFII;
        if (jzb != null) {
            jzb.LIZ(jvn);
        }
        InterfaceC49417JaP interfaceC49417JaP = this.LLFZ;
        if (interfaceC49417JaP != null) {
            interfaceC49417JaP.LIZ();
        }
    }
}
