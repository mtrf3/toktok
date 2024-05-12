package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import Y.ARunnableS37S0100000_1;
import Y.AfS50S0200000_1;
import Y.AfS53S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.model.InviteUsersData;
import com.ss.android.ugc.aweme.qainvitation.model.InviteeListData;
import com.ss.android.ugc.aweme.qainvitation.model.RecentContactsData;
import com.ss.android.ugc.aweme.qainvitation.model.UserBlockData;
import com.ss.android.ugc.aweme.qainvitation.model.UserBlockedResult;
import com.ss.android.ugc.aweme.qainvitation.model.UserPrivacyCheckData;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;
import yq4.a;

/* renamed from: X.3gT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90253gT extends ConstraintLayout implements InterfaceC250909t0 {
    public final Activity LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final EnumC90333gb LJLJJI;
    public final Long LJLJJL;
    public final Long LJLJJLL;
    public final List<IMUser> LJLJL;
    public final InterfaceC88472Yns<List<? extends IMUser>, C76800UCe> LJLJLJ;
    public final C62387Oe7 LJLJLLL;
    public final IQAInvitationService LJLL;
    public final C73318Sq2 LJLLI;
    public LinearLayoutManager LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public boolean LJLLLL;
    public InterfaceC88472Yns<? super C89863fq, C76800UCe> LJLLLLLL;
    public InterfaceC88472Yns<? super InviteUsersData, C76800UCe> LJLZ;
    public InterfaceC88472Yns<? super List<? extends IMUser>, C76800UCe> LJZ;
    public InterfaceC65784Pro<C76800UCe> LJZI;
    public InterfaceC88472Yns<? super List<? extends IMUser>, C76800UCe> LJZL;
    public final C89853fp LL;
    public final int LLD;
    public final C89673fX LLF;
    public final C90083gC LLFF;
    public final C89823fm LLFFF;
    public final C73306Spq LLFII;
    public final C73306Spq LLFZ;
    public final C73306Spq LLI;
    public final java.util.Map<Integer, View> LLIFFJFJJ;

    private final String getSourceFrom() {
        return "at_user";
    }

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LLIFFJFJJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C250859sv LJJLJLI() {
        Integer num;
        String str = this.LLFF.LJLJJI;
        String sourceFrom = getSourceFrom();
        List LLJI = ORZ.LLJI(getFetchedUidSet());
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        return new C250859sv(5L, null, str, sourceFrom, 20L, LLJI, num);
    }

    public final HashSet<String> getFetchedUidSet() {
        return (HashSet) this.LJLLJ.getValue();
    }

    public final InterfaceC90243gS getSummonFriendSearchPresenter() {
        return (InterfaceC90243gS) this.LJLLL.getValue();
    }

    public final void LJJLL() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.isf);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(0);
        }
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.keh);
        if (c73305Spp == null) {
            return;
        }
        c73305Spp.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJZ() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (!C48203Ivv.LJ(context)) {
            LJL(2);
            return;
        }
        LJL(0);
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        final C61878OQg selectedSUGUsers = c61878OQg;
        if (this.LJLJL != null) {
            selectedSUGUsers = c61878OQg;
            if (!r0.isEmpty()) {
                C89853fp c89853fp = this.LL;
                List<IMUser> LLJILJILJ = ORZ.LLJILJILJ(this.LJLJL);
                c89853fp.getClass();
                c89853fp.LJIIJJI = LLJILJILJ;
                List<IMUser> list = this.LJLJL;
                ArrayList arrayList = new ArrayList();
                for (IMUser iMUser : list) {
                    if (iMUser.getIsUserNotInAllFriends()) {
                        arrayList.add(iMUser);
                    }
                }
                LJJZZI(true);
                C89823fm c89823fm = this.LLFFF;
                List<IMUser> list2 = this.LL.LJIIJJI;
                c89823fm.getClass();
                o.LJIIIZ(list2, "<set-?>");
                c89823fm.LJLILLLLZI = list2;
                this.LLFFF.notifyDataSetChanged();
                selectedSUGUsers = arrayList;
            }
        }
        final C89853fp c89853fp2 = this.LL;
        c89853fp2.getClass();
        o.LJIIIZ(selectedSUGUsers, "selectedSUGUsers");
        this.LJLLI.LIZ(AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.3fc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<C89863fq> interfaceC73573Su9) {
                int i;
                AbstractC73672Svk<UserPrivacyCheckData> LJJIJIL;
                AbstractC73672Svk<RecentContactsData> LJJIJIL2;
                AbstractC73672Svk<InviteeListData> LJJIJIL3;
                List<IMUser> LJIILLIIL = IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIILLIIL();
                ArrayList arrayList2 = new ArrayList();
                Iterator<IMUser> it = LJIILLIIL.iterator();
                while (true) {
                    i = 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    IMUser next = it.next();
                    if (true ^ o.LJ(next.getUid(), ((RBX) HG3.LJIILL()).getCurUserId())) {
                        arrayList2.add(next);
                    }
                }
                final List LLJILJILJ2 = ORZ.LLJILJILJ(arrayList2);
                final List<IMUser> LJIILIIL = IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIILIIL();
                C89853fp.this.getClass();
                String LJI = C89853fp.LJI(LLJILJILJ2, LJIILIIL);
                String json = GsonProtectorUtils.toJson(new Gson(), C47261Igj.LJJIJ(Integer.valueOf(EnumC89743fe.QA_INVITE.getType())));
                o.LJIIIIZZ(json, "Gson().toJson(listOf(QAI…tionType.QA_INVITE.type))");
                List list3 = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                try {
                    LJJIJIL = C89763fg.LIZ().getFilteredContacts(json, LJI);
                } catch (ExecutionException unused) {
                    LJJIJIL = AbstractC73672Svk.LJJIJIL(new UserPrivacyCheckData(null, 1, null));
                }
                C73425Srl LJJJJ = LJJIJIL.LJJL(T16.LIZ()).LJJJJ(new InterfaceC48038ItG() { // from class: X.3fZ
                    @Override // X.InterfaceC48038ItG
                    public final Object apply(Object it2) {
                        o.LJIIIZ(it2, "it");
                        return new UserPrivacyCheckData(null, 1, null);
                    }
                });
                try {
                    LJJIJIL2 = C89763fg.LIZ().getRecentContacts(EnumC89743fe.QA_INVITE.getType());
                } catch (ExecutionException unused2) {
                    LJJIJIL2 = AbstractC73672Svk.LJJIJIL(new RecentContactsData(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0));
                }
                C73425Srl LJJJJ2 = LJJIJIL2.LJJL(T16.LIZ()).LJJJJ(new InterfaceC48038ItG() { // from class: X.3fb
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC48038ItG
                    public final Object apply(Object it2) {
                        o.LJIIIZ(it2, "it");
                        return new RecentContactsData(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    }
                });
                long j = C89853fp.this.LJIIIIZZ;
                if (j == 0) {
                    LJJIJIL3 = AbstractC73672Svk.LJJIJIL(new InviteeListData(list3, i, objArr6 == true ? 1 : 0));
                } else {
                    try {
                        LJJIJIL3 = C89763fg.LIZ().getInviteeList(j);
                    } catch (ExecutionException unused3) {
                        LJJIJIL3 = AbstractC73672Svk.LJJIJIL(new InviteeListData(objArr5 == true ? 1 : 0, i, objArr4 == true ? 1 : 0));
                    }
                }
                C73425Srl LJJJJ3 = LJJIJIL3.LJJL(T16.LIZ()).LJJJJ(new InterfaceC48038ItG() { // from class: X.3fa
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC48038ItG
                    public final Object apply(Object it2) {
                        o.LJIIIZ(it2, "it");
                        return new InviteeListData(null, 1, 0 == true ? 1 : 0);
                    }
                });
                final C89853fp c89853fp3 = C89853fp.this;
                final List<IMUser> list4 = selectedSUGUsers;
                C73454SsE LJJJ = AbstractC73672Svk.LJJLJLI(LJJJJ, LJJJJ2, LJJJJ3, new InterfaceC89813fl() { // from class: X.3fY
                    @Override // X.InterfaceC89813fl
                    public final Object LIZJ(Object obj, Object obj2, Object obj3) {
                        List<UserBlockData> list5;
                        List<User> list6;
                        List<UserBlockData> list7;
                        List<User> list8;
                        List<User> list9;
                        Object obj4;
                        List<UserBlockedResult> list10;
                        boolean z;
                        List<UserBlockedResult> list11;
                        UserBlockedResult userBlockedResult;
                        Integer num;
                        UserBlockData userBlockData;
                        List<UserBlockedResult> list12;
                        boolean z2;
                        List<UserBlockedResult> list13;
                        UserBlockedResult userBlockedResult2;
                        Integer num2;
                        UserBlockData userBlockData2;
                        String str;
                        List<UserBlockData> list14;
                        UserPrivacyCheckData userPrivacyCheckData = (UserPrivacyCheckData) obj;
                        RecentContactsData recentContactsData = (RecentContactsData) obj2;
                        InviteeListData inviteeListData = (InviteeListData) obj3;
                        ArrayList arrayList3 = new ArrayList();
                        C89853fp.this.getClass();
                        List<User> list15 = null;
                        if (userPrivacyCheckData != null) {
                            list5 = userPrivacyCheckData.filteredContactList;
                        } else {
                            list5 = null;
                        }
                        int i2 = 0;
                        if (list5 != null && !list5.isEmpty()) {
                            if (userPrivacyCheckData != null) {
                                list14 = userPrivacyCheckData.filteredContactList;
                            } else {
                                list14 = null;
                            }
                            o.LJII(list14, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.qainvitation.model.UserBlockData>");
                            arrayList3.addAll(C65777Prh.LIZIZ(list14));
                        }
                        ArrayList arrayList4 = new ArrayList();
                        C89853fp c89853fp4 = C89853fp.this;
                        List<IMUser> list16 = LJIILIIL;
                        c89853fp4.getClass();
                        if (recentContactsData != null) {
                            try {
                                list6 = recentContactsData.recentContacts;
                                list7 = recentContactsData.recentContactsBlockedList;
                            } catch (Exception e) {
                                e.getMessage();
                            }
                        } else {
                            list6 = null;
                            list7 = null;
                        }
                        if (list6 != null && (!list6.isEmpty())) {
                            for (User user : list6) {
                                if (arrayList4.size() < 10 && !o.LJ(user.getUid(), ((RBX) HG3.LJIILL()).getCurUserId())) {
                                    IMUser LJIIZILJ = C78966Uyw.LJIIZILJ(user);
                                    if (list7 != null) {
                                        Iterator<UserBlockData> it2 = list7.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                userBlockData2 = it2.next();
                                                String valueOf = String.valueOf(userBlockData2.uid);
                                                if (LJIIZILJ != null) {
                                                    str = LJIIZILJ.getUid();
                                                } else {
                                                    str = null;
                                                }
                                                if (o.LJ(valueOf, str)) {
                                                    break;
                                                }
                                            } else {
                                                userBlockData2 = null;
                                                break;
                                            }
                                        }
                                        userBlockData = userBlockData2;
                                    } else {
                                        userBlockData = null;
                                    }
                                    if (LJIIZILJ != null) {
                                        LJIIZILJ.setUserEnabledQAInvite(Boolean.TRUE);
                                        if (userBlockData != null && (list12 = userBlockData.userBlockedResults) != null && !list12.isEmpty()) {
                                            if (userBlockData != null && (list13 = userBlockData.userBlockedResults) != null && (userBlockedResult2 = (UserBlockedResult) ListProtector.get(list13, 0)) != null && (num2 = userBlockedResult2.blockType) != null && num2.intValue() != 0) {
                                                z2 = false;
                                                LJIIZILJ.setUserEnabledQAInvite(Boolean.valueOf(z2));
                                            }
                                            z2 = true;
                                            LJIIZILJ.setUserEnabledQAInvite(Boolean.valueOf(z2));
                                        }
                                        arrayList4.add(LJIIZILJ);
                                    }
                                }
                            }
                        }
                        if (arrayList4.size() < 10 && list16 != null && !list16.isEmpty()) {
                            for (IMUser iMUser2 : list16) {
                                if (arrayList4.size() < 10 && !arrayList4.contains(iMUser2) && !o.LJ(iMUser2.getUid(), ((RBX) HG3.LJIILL()).getCurUserId())) {
                                    iMUser2.setUserEnabledQAInvite(Boolean.TRUE);
                                    Iterator it3 = arrayList3.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            obj4 = it3.next();
                                            if (o.LJ(String.valueOf(((UserBlockData) obj4).uid), iMUser2.getUid())) {
                                                break;
                                            }
                                        } else {
                                            obj4 = null;
                                            break;
                                        }
                                    }
                                    UserBlockData userBlockData3 = (UserBlockData) obj4;
                                    if (userBlockData3 != null && (list10 = userBlockData3.userBlockedResults) != null && !list10.isEmpty()) {
                                        if (userBlockData3 != null && (list11 = userBlockData3.userBlockedResults) != null && (userBlockedResult = (UserBlockedResult) ListProtector.get(list11, 0)) != null && (num = userBlockedResult.blockType) != null && num.intValue() != 0) {
                                            z = false;
                                            iMUser2.setUserEnabledQAInvite(Boolean.valueOf(z));
                                        }
                                        z = true;
                                        iMUser2.setUserEnabledQAInvite(Boolean.valueOf(z));
                                    }
                                    arrayList4.add(iMUser2);
                                }
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        C89853fp c89853fp5 = C89853fp.this;
                        c89853fp5.getClass();
                        if (inviteeListData != null && (list8 = inviteeListData.inviteeList) != null && !list8.isEmpty()) {
                            if (inviteeListData != null && (list9 = inviteeListData.inviteeList) != null) {
                                i2 = list9.size();
                            }
                            c89853fp5.LIZLLL = i2;
                            if (inviteeListData != null) {
                                list15 = inviteeListData.inviteeList;
                            }
                            o.LJI(list15);
                            arrayList5.addAll(C90173gL.LIZJ(list15));
                        }
                        return C89853fp.this.LJII(arrayList4, LLJILJILJ2, arrayList3, list4, arrayList5);
                    }
                }).LJJJ(C73969T1h.LIZIZ());
                final C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
                AfS53S0100000_1 afS53S0100000_1 = new AfS53S0100000_1(c73433Srt, 64);
                final C89853fp c89853fp4 = C89853fp.this;
                final List<IMUser> list5 = selectedSUGUsers;
                C89853fp.this.LIZ.LIZ(LJJJ.LJJJLIIL(afS53S0100000_1, new InterfaceC64592gB() { // from class: X.3fd
                    @Override // X.InterfaceC64592gB
                    public final void accept(Object obj) {
                        Throwable th = (Throwable) obj;
                        if (th != null) {
                            th.getMessage();
                        }
                        C89853fp.this.LJII(new ArrayList(), LLJILJILJ2, new ArrayList(), list5, new ArrayList());
                        c73433Srt.onNext(C89853fp.this.LJIIL);
                    }
                }));
            }
        }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS53S0100000_1(this, 61)));
    }

    public final void LJJZZIII() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.isf);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(4);
        }
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.keh);
        if (c73305Spp == null) {
            return;
        }
        c73305Spp.setVisibility(0);
    }

    @Override // X.InterfaceC250909t0
    public final void LLIIZ() {
        if (isAttachedToWindow() && this.LLFF.getItemCount() == 0) {
            LJLI(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        long j;
        super.onAttachedToWindow();
        if (getParent().getParent() == null) {
            return;
        }
        Object parent = getParent().getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = ((View) parent).findViewById(R.id.jw1);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        C89853fp c89853fp = this.LL;
        String enterMethod = this.LJLILLLLZI;
        String enterFrom = this.LJLJI;
        Long l = this.LJLJJL;
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = this.LJLJJLL;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        c89853fp.getClass();
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        c89853fp.LJI = enterMethod;
        c89853fp.LJII = enterFrom;
        c89853fp.LJIIIIZZ = j;
        c89853fp.LJIIIZ = j2;
        ((C73305Spp) _$_findCachedViewById(R.id.keh)).setTopMargin(C32151Nz.LJIIZILJ(150));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.igz);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        int i = 0;
        linearLayoutManager.LLJJIII(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.LLFFF);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.awu), new ACListenerS21S0100000_1(this, 174));
        String.valueOf(System.currentTimeMillis());
        _$_findCachedViewById(R.id.jdh).setOnKeyListener(new View.OnKeyListener() { // from class: X.3gU
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (i2 == 66) {
                    AYA.LIZ(C90253gT.this.getActivity(), C90253gT.this._$_findCachedViewById(R.id.jdh));
                    return true;
                }
                return false;
            }
        });
        _$_findCachedViewById(R.id.jdh).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(this, 175)));
        ((TextView) _$_findCachedViewById(R.id.jdh)).addTextChangedListener(new C90233gR() { // from class: X.3gQ
            @Override // X.C90233gR, android.text.TextWatcher
            public final void afterTextChanged(Editable s) {
                boolean z;
                int i2;
                int i3;
                o.LJIIIZ(s, "s");
                if (s.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                if (C90253gT.this._$_findCachedViewById(R.id.be9).getVisibility() != i2) {
                    if (i2 == 8) {
                        C90253gT c90253gT = C90253gT.this;
                        if (c90253gT.LLF.getItemCount() == 0) {
                            i3 = 1;
                        } else {
                            i3 = -1;
                        }
                        c90253gT.LJL(i3);
                    }
                    ((ImageView) C90253gT.this._$_findCachedViewById(R.id.be9)).setVisibility(i2);
                }
                final String charSequence = s.LJZI(s.toString()).toString();
                if (o.LJ(C90253gT.this.LLFF.LJLJJI, charSequence)) {
                    return;
                }
                C90083gC c90083gC = C90253gT.this.LLFF;
                c90083gC.getClass();
                o.LJIIIZ(charSequence, "<set-?>");
                c90083gC.LJLJJI = charSequence;
                if (charSequence.length() > 0) {
                    Context context = C90253gT.this.getContext();
                    o.LJIIIIZZ(context, "context");
                    if (!C48203Ivv.LJ(context)) {
                        C90253gT.this.LJLI(2);
                        return;
                    }
                    if (!C90253gT.this.getSummonFriendSearchPresenter().LJIJJLI()) {
                        C90253gT.this.getSummonFriendSearchPresenter().LIZJ(C90253gT.this);
                    }
                    if (C90253gT.this.LLF.getItemCount() == 0) {
                        C90253gT.this.LJLI(0);
                    }
                    final List LLJILJILJ = ORZ.LLJILJILJ(C90253gT.this.LLF.LJLILLLLZI);
                    if (true ^ C90253gT.this.LL.LJIIL.LIZ.isEmpty()) {
                        ((ArrayList) LLJILJILJ).removeAll(C90253gT.this.LL.LJIIL.LIZ);
                    }
                    final C89853fp c89853fp2 = C90253gT.this.LL;
                    c89853fp2.getClass();
                    C90253gT.this.getCompositeDisposable().LIZ(AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.3fs
                        @Override // X.InterfaceC86003Zc
                        public final void subscribe(InterfaceC73573Su9<List<IMUser>> interfaceC73573Su9) {
                            C89853fp c89853fp3 = C89853fp.this;
                            String str = charSequence;
                            c89853fp3.getClass();
                            o.LJIIIZ(str, "<set-?>");
                            C89853fp c89853fp4 = C89853fp.this;
                            List<IMUser> list = LLJILJILJ;
                            String str2 = charSequence;
                            c89853fp4.getClass();
                            List LJIIIIZZ = IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIIIIZZ(str2, list);
                            Locale locale = Locale.ROOT;
                            String LIZIZ = C141415gn.LIZIZ(locale, "ROOT", str2, locale, "this as java.lang.String).toLowerCase(locale)");
                            for (IMUser iMUser : list) {
                                String uniqueId = iMUser.getUniqueId();
                                if (uniqueId == null || uniqueId.length() == 0) {
                                    String shortId = iMUser.getShortId();
                                    o.LJIIIIZZ(shortId, "it.shortId");
                                    if (C89853fp.LIZIZ(shortId, LIZIZ)) {
                                        iMUser.setSearchType(1);
                                        LJIIIIZZ.add(iMUser);
                                    }
                                } else {
                                    String uniqueId2 = iMUser.getUniqueId();
                                    o.LJIIIIZZ(uniqueId2, "it.uniqueId");
                                    if (C89853fp.LIZIZ(uniqueId2, LIZIZ)) {
                                        iMUser.setSearchType(1);
                                        LJIIIIZZ.add(iMUser);
                                    }
                                }
                            }
                            if (c89853fp4.LJ) {
                                List LIZLLL = C89853fp.LIZLLL(LJIIIIZZ);
                                LJIIIIZZ.clear();
                                LJIIIIZZ.addAll(LIZLLL);
                            }
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : LJIIIIZZ) {
                                if (hashSet.add(((IMUser) obj).getUid())) {
                                    arrayList.add(obj);
                                }
                            }
                            C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
                            C89853fp.this.LIZ.LIZ(AbstractC73672Svk.LJJIJIL(arrayList).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS50S0200000_1(C89853fp.this, c73433Srt, 5), new AfS53S0100000_1(c73433Srt, 65)));
                        }
                    }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS53S0100000_1(C90253gT.this, 63)));
                }
            }
        });
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.be9), new ACListenerS21S0100000_1(this, 176));
        getContext();
        this.LJLLILLLL = new LinearLayoutManager();
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.isf);
        LinearLayoutManager linearLayoutManager2 = this.LJLLILLLL;
        if (linearLayoutManager2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager2);
            ((RecyclerView) _$_findCachedViewById(R.id.isf)).setHasFixedSize(true);
            RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.isf);
            final Context context = getContext();
            recyclerView3.LJIIJJI(new C73379Sr1(context) { // from class: X.3gY
                @Override // X.C73379Sr1, X.C0A6
                public final void LJIILJJIL(int i2, RecyclerView recyclerView4) {
                    o.LJIIIZ(recyclerView4, "recyclerView");
                    super.LJIILJJIL(i2, recyclerView4);
                    AYA.LIZ(this.getActivity(), this._$_findCachedViewById(R.id.jdh));
                }

                @Override // X.C73379Sr1, X.C0A6
                public final void LJIILL(RecyclerView recyclerView4, int i2, int i3) {
                    o.LJIIIZ(recyclerView4, "recyclerView");
                    super.LJIILL(recyclerView4, i2, i3);
                    if (i3 > KL2.LIZJ(this.getContext(), 10.0f)) {
                        AYA.LIZ(this.getActivity(), this._$_findCachedViewById(R.id.jdh));
                    }
                }
            });
            this.LLFF.setShowFooter(true);
            this.LLFF.setLoadMoreListener(new AqS151S0100000_1(this, 891));
            LJJZ();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LJLJI);
            c188727au.LJIIIZ("enter_method", this.LJLILLLLZI);
            List<IMUser> list = this.LJLJL;
            if (list != null) {
                i = list.size();
            }
            c188727au.LIZLLL(i, "selected_invitee_cnt");
            FMX.LJIIL("enter_qa_invite_panel", c188727au.LIZ);
            _$_findCachedViewById(R.id.keh).post(new ARunnableS37S0100000_1(this, 85));
            return;
        }
        o.LJIJI("linearLayoutManager");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LJLJJI != EnumC90333gb.NEW_QUESTION) {
            this.LL.LJIIJJI.clear();
        }
        this.LJLLI.dispose();
    }

    public final Activity getActivity() {
        return this.LJLIL;
    }

    public final InterfaceC88472Yns<C89863fq, C76800UCe> getAllContactsObserver() {
        return this.LJLLLLLL;
    }

    public final C73318Sq2 getCompositeDisposable() {
        return this.LJLLI;
    }

    public final String getEnterFrom() {
        return this.LJLJI;
    }

    public final String getEnterMethod() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC65784Pro<C76800UCe> getHideKeyboardObserver() {
        return this.LJZI;
    }

    public final InterfaceC88472Yns<InviteUsersData, C76800UCe> getInviteUsersObserver() {
        return this.LJLZ;
    }

    public final InterfaceC88472Yns<List<? extends IMUser>, C76800UCe> getInviteeListObserver() {
        return this.LJZ;
    }

    public final List<IMUser> getPreviousSelectedUsers() {
        return this.LJLJL;
    }

    public final IQAInvitationService getQaInviteService() {
        return this.LJLL;
    }

    public final Long getQuestionId() {
        return this.LJLJJL;
    }

    public final Long getQuestionUserId() {
        return this.LJLJJLL;
    }

    public final EnumC90333gb getRequestType() {
        return this.LJLJJI;
    }

    public final InterfaceC88472Yns<List<? extends IMUser>, C76800UCe> getSearchObserver() {
        return this.LJZL;
    }

    public final C73306Spq getTuxStatusErrorView() {
        return this.LLFII;
    }

    public final void LJJZZI(boolean z) {
        if (_$_findCachedViewById(R.id.ar6) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.ar6).getLayoutParams();
        if (z) {
            layoutParams.height = C7MY.LIZIZ(162);
        } else {
            layoutParams.height = C7MY.LIZIZ(1);
        }
        _$_findCachedViewById(R.id.ar6).setLayoutParams(layoutParams);
    }

    public final void LJL(int i) {
        if (!o.LJ(((RecyclerView) _$_findCachedViewById(R.id.isf)).getAdapter(), this.LLF)) {
            ((RecyclerView) _$_findCachedViewById(R.id.isf)).setAdapter(this.LLF);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    LJJLL();
                    return;
                }
                C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.keh);
                if (c73305Spp != null) {
                    c73305Spp.setStatus(this.LLFII);
                }
                LJJZZIII();
                return;
            }
            C73305Spp c73305Spp2 = (C73305Spp) _$_findCachedViewById(R.id.keh);
            if (c73305Spp2 != null) {
                c73305Spp2.setStatus(this.LLFZ);
            }
            LJJZZIII();
            return;
        }
        C73305Spp c73305Spp3 = (C73305Spp) _$_findCachedViewById(R.id.keh);
        if (c73305Spp3 != null) {
            c73305Spp3.LJFF();
        }
        LJJZZIII();
    }

    public final void LJLI(int i) {
        if (!o.LJ(((RecyclerView) _$_findCachedViewById(R.id.isf)).getAdapter(), this.LLFF)) {
            ((RecyclerView) _$_findCachedViewById(R.id.isf)).setAdapter(this.LLFF);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    LJJLL();
                    return;
                }
                C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.keh);
                if (c73305Spp != null) {
                    c73305Spp.setStatus(this.LLFII);
                }
                LJJZZIII();
                return;
            }
            C73305Spp c73305Spp2 = (C73305Spp) _$_findCachedViewById(R.id.keh);
            if (c73305Spp2 != null) {
                c73305Spp2.setStatus(this.LLI);
            }
            LJJZZIII();
            return;
        }
        C73305Spp c73305Spp3 = (C73305Spp) _$_findCachedViewById(R.id.keh);
        if (c73305Spp3 != null) {
            c73305Spp3.LJFF();
        }
        LJJZZIII();
    }

    @Override // X.InterfaceC250909t0
    public final void LLJJI(Exception exc) {
        if (!isAttachedToWindow()) {
            return;
        }
        if (this.LLFF.getItemCount() == 0) {
            LJLI(1);
        }
        AYA.LIZ(this.LJLIL, _$_findCachedViewById(R.id.jdh));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    @Override // X.InterfaceC250909t0
    public final void h40(boolean z) {
        String str;
        ?? r2;
        Collection<? extends String> collection;
        String userId;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSearchCompleteV2: ");
        if (z) {
            str = "success";
        } else {
            str = "error";
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (z) {
            if (getFetchedUidSet().isEmpty()) {
                ((RecyclerView) _$_findCachedViewById(R.id.isf)).LJLI(0);
            }
            this.LLFF.notifyDataSetChanged();
            C90083gC c90083gC = this.LLFF;
            List<? extends IMUser> list = c90083gC.LJLILLLLZI;
            ArrayList arrayList = null;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<? extends IMUser> it = list.iterator();
                while (it.hasNext()) {
                    String uid = it.next().getUid();
                    if (uid != null) {
                        arrayList.add(uid);
                    }
                }
            }
            List<? extends SearchSugEntity> list2 = c90083gC.LJLJI;
            if (list2 != null) {
                r2 = new ArrayList();
                Iterator<? extends SearchSugEntity> it2 = list2.iterator();
                while (it2.hasNext()) {
                    SugExtraInfo sugExtraInfo = it2.next().sugExtraInfo;
                    if (sugExtraInfo != null && (userId = sugExtraInfo.getUserId()) != null) {
                        r2.add(userId);
                    }
                }
            } else {
                r2 = C61878OQg.INSTANCE;
            }
            if (arrayList != null) {
                collection = ORZ.LLIIIZ(r2, arrayList);
            } else {
                collection = C61878OQg.INSTANCE;
            }
            getFetchedUidSet().addAll(collection);
        }
    }

    public final void setAllContactsObserver(InterfaceC88472Yns<? super C89863fq, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLLLLLL = interfaceC88472Yns;
    }

    public final void setHideKeyboardObserver(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJZI = interfaceC65784Pro;
    }

    public final void setInviteUsersObserver(InterfaceC88472Yns<? super InviteUsersData, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLZ = interfaceC88472Yns;
    }

    public final void setInviteeListObserver(InterfaceC88472Yns<? super List<? extends IMUser>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJZ = interfaceC88472Yns;
    }

    public final void setSearchObserver(InterfaceC88472Yns<? super List<? extends IMUser>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJZL = interfaceC88472Yns;
    }

    public final void setUpInvitedCellView(List<? extends IMUser> list) {
        if (list == null) {
            return;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.esn);
        if (_$_findCachedViewById != null && _$_findCachedViewById.getVisibility() == 0) {
            return;
        }
        List LIZIZ = C90173gL.LIZIZ(list);
        if (((ArrayList) LIZIZ).isEmpty()) {
            return;
        }
        C90183gM c90183gM = (C90183gM) _$_findCachedViewById(R.id.gp1);
        if (c90183gM != null) {
            c90183gM.LIZJ(C7MY.LIZIZ(24), O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
        }
        C90183gM c90183gM2 = (C90183gM) _$_findCachedViewById(R.id.gp1);
        if (c90183gM2 != null) {
            c90183gM2.LIZ(0L, LIZIZ);
        }
        if (list.isEmpty()) {
            return;
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.esn);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setVisibility(0);
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.esn);
        if (_$_findCachedViewById3 != null) {
            C16880lQ.LJIIJ(new ACListenerS36S0200000_1(LIZIZ, this, 37), _$_findCachedViewById3);
        }
        String valueOf = String.valueOf(list.size());
        if (C90193gN.LIZIZ(getContext())) {
            ((TextView) _$_findCachedViewById(R.id.esj)).setText(getContext().getString(R.string.pof, String.valueOf(this.LLD), valueOf));
        } else {
            ((TextView) _$_findCachedViewById(R.id.esj)).setText(getContext().getString(R.string.pof, valueOf, String.valueOf(this.LLD)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        r2 = r7.LJIIL.LJ.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (r2.hasNext() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, r1.getUid()) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r1 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        r5.add(r6);
     */
    @Override // X.InterfaceC250909t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hn0(com.ss.android.ugc.aweme.search.model.SearchUserSugResponse r10, java.lang.String r11) {
        /*
            r9 = this;
            X.3gC r0 = r9.LLFF
            java.lang.String r0 = r0.LJLJJI
            boolean r0 = kotlin.jvm.internal.o.LJ(r11, r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            boolean r0 = r9.isAttachedToWindow()
            if (r0 == 0) goto L1b
            X.3gC r0 = r9.LLFF
            java.lang.String r0 = r0.LJLJJI
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
        L1b:
            return
        L1c:
            X.3gS r0 = r9.getSummonFriendSearchPresenter()
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto Laf
            X.3gC r0 = r9.LLFF
            r0.resetLoadMoreState()
        L2b:
            java.util.List<? extends com.ss.android.ugc.aweme.search.model.SearchSugEntity> r0 = r10.sugList
            r4 = 1
            r5 = 0
            if (r0 == 0) goto Lb6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r8 = r0.iterator()
        L3a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r6 = r8.next()
            r0 = r6
            com.ss.android.ugc.aweme.search.model.SearchSugEntity r0 = (com.ss.android.ugc.aweme.search.model.SearchSugEntity) r0
            X.3fp r7 = r9.LL
            com.ss.android.ugc.aweme.search.model.SugExtraInfo r0 = r0.sugExtraInfo
            java.lang.String r3 = r0.getUserId()
            if (r3 != 0) goto L53
            java.lang.String r3 = ""
        L53:
            r7.getClass()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r0 = r0.getCurUserId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L67
            goto L3a
        L67:
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r7.LJFF
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L6f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            java.lang.String r0 = r0.getUid()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 == 0) goto L6f
            if (r1 == 0) goto L89
            goto L3a
        L89:
            X.3fq r0 = r7.LJIIL
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r0.LJ
            java.util.Iterator r2 = r0.iterator()
        L91:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            java.lang.String r0 = r0.getUid()
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L91
            if (r1 == 0) goto Lab
            goto L3a
        Lab:
            r5.add(r6)
            goto L3a
        Laf:
            X.3gC r0 = r9.LLFF
            r0.showLoadMoreEmpty()
            goto L2b
        Lb6:
            X.3gC r0 = r9.LLFF
            r0.LJLJI = r5
            int r0 = r0.getItemCount()
            if (r0 != 0) goto Lc5
        Lc0:
            r9.LJLI(r4)
            goto L1b
        Lc5:
            r4 = -1
            goto Lc0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90253gT.hn0(com.ss.android.ugc.aweme.search.model.SearchUserSugResponse, java.lang.String):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90253gT(Activity activity, String str, String str2, EnumC90333gb requestType, Long l, Long l2, List list, InterfaceC88472Yns interfaceC88472Yns, Context context, C62387Oe7 c62387Oe7) {
        super(context, null, 0);
        o.LJIIIZ(requestType, "requestType");
        this.LLIFFJFJJ = new LinkedHashMap();
        this.LJLIL = activity;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = requestType;
        this.LJLJJL = l;
        this.LJLJJLL = l2;
        this.LJLJL = list;
        this.LJLJLJ = interfaceC88472Yns;
        this.LJLJLLL = c62387Oe7;
        IQAInvitationService LJI = QAInvitationService.LJI();
        o.LJIIIIZZ(LJI, "get().getService(IQAInvitationService::class.java)");
        this.LJLL = LJI;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLLI = c73318Sq2;
        this.LJLLJ = C221108m2.LIZIZ(C90273gV.LJLIL);
        this.LJLLL = C221108m2.LIZIZ(C90293gX.LJLIL);
        this.LJLLLL = true;
        C16880lQ.LLLZIIL(R.layout.c_j, C16880lQ.LLZIL(context), this);
        if (C99W.LIZ) {
            _$_findCachedViewById(R.id.awu).getClass();
            _$_findCachedViewById(R.id.jdl).setBackground(context.getDrawable(R.drawable.c04));
        }
        this.LJLLLLLL = new AqS132S0200000_1(context, this, 68);
        this.LJLZ = new AqS132S0200000_1(context, this, 69);
        this.LJZ = new AqS167S0100000_1(this, 314);
        this.LJZI = new AqS151S0100000_1(this, 890);
        this.LJZL = new AqS167S0100000_1(this, 315);
        C89853fp c89853fp = new C89853fp(c73318Sq2, this.LJLLLLLL, this.LJZI);
        this.LL = c89853fp;
        this.LLD = c89853fp.LJFF();
        this.LLF = new C89673fX(c89853fp);
        this.LLFF = new C90083gC(c89853fp);
        this.LLFFF = new C89823fm(c89853fp);
        C73306Spq c73306Spq = new C73306Spq();
        C73312Spw.LJII(c73306Spq);
        c73306Spq.LJII = new AqS132S0200000_1(context, this, 70);
        this.LLFII = c73306Spq;
        C73306Spq c73306Spq2 = new C73306Spq();
        C73312Spw.LJIIIZ(c73306Spq2);
        String string = context.getString(R.string.poo);
        o.LJIIIIZZ(string, "context.getString(R.stri…nvite_invite_empty_title)");
        c73306Spq2.LJFF = string;
        String string2 = context.getString(R.string.pon);
        o.LJIIIIZZ(string2, "context.getString(R.stri…te_invite_empty_subtitle)");
        c73306Spq2.LJI = string2;
        this.LLFZ = c73306Spq2;
        C73306Spq c73306Spq3 = new C73306Spq();
        String string3 = context.getString(R.string.h8z);
        o.LJIIIIZZ(string3, "context.getString(R.string.im_search_empty_title)");
        c73306Spq3.LJI = string3;
        this.LLI = c73306Spq3;
    }
}
