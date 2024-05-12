package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.ui;

import X.ALX;
import X.AbstractC029409q;
import X.AbstractC28801Bc;
import X.ActivityC45651qj;
import X.C102303zu;
import X.C113304cY;
import X.C113314cZ;
import X.C16880lQ;
import X.C221108m2;
import X.C32I;
import X.C36636EZk;
import X.C3K3;
import X.C3L3;
import X.C3L4;
import X.C3SG;
import X.C3SH;
import X.C3SI;
import X.C3SJ;
import X.C3SK;
import X.C3SR;
import X.C3TX;
import X.C3U1;
import X.C48841JEv;
import X.C57285Me1;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73542Ste;
import X.C73969T1h;
import X.C77266UUc;
import X.C82513Lr;
import X.C92353jr;
import X.EnumC57365MfJ;
import X.EnumC94693nd;
import X.FII;
import X.InterfaceC113344cc;
import X.InterfaceC57917MoD;
import X.InterfaceC82123Ke;
import X.ORZ;
import X.T16;
import X.X1D;
import X.XKX;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS27S0300000_1;
import Y.ACListenerS36S0200000_1;
import Y.AObserverS69S0100000_1;
import Y.ARunnableS37S0100000_1;
import Y.IDCListenerS108S0200000_1;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.ui.MafChatListWidget;
import com.ss.android.ugc.aweme.im.service.experiment.EducateUserMessageSetting;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS164S0200000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MafChatListWidget extends InboxAdapterWidget implements InterfaceC113344cc, InterfaceC57917MoD {
    public final MutableLiveData<EnumC94693nd> LJLJL;
    public final MutableLiveData LJLJLJ;
    public final C113314cZ LJLJLLL;
    public final C113314cZ LJLL;
    public final List<RecUser> LJLLI;
    public final ConcurrentHashSet<String> LJLLILLLL;
    public volatile boolean LJLLJ;
    public final ActivityC45651qj LJLLL;
    public final Set<RecUser> LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C73318Sq2 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final MutableLiveData<Integer> LJZL;
    public final MutableLiveData LL;
    public final Handler LLD;
    public final C3SG LLF;

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int LJIIIZ(int i) {
        return -1;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C82513Lr LJII = C3K3.LIZ().LJII();
        C3SG observer = this.LLF;
        LJII.getClass();
        o.LJIIIZ(observer, "observer");
        LJII.LJLJL.remove(observer);
        this.LJLZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, X.MLD
    public final void LJ() {
        if (!this.LJLLJ) {
            return;
        }
        this.LJLLJ = false;
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C3SH(this, null), 3);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C77266UUc.LIZIZ.getRelationService().LJFF().observe(this.LJLIL, new AObserverS69S0100000_1(this, 48));
        if (C3TX.LIZIZ()) {
            C3K3.LIZ().LJII().LJII(this.LLF);
        } else {
            this.LJLZ.LIZ(C73542Ste.LJIIIIZZ(((C3SR) this.LJZ.getValue()).XT(true).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()), C3SJ.LJLIL, null, new AqS167S0100000_1(this, 159), 2));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final AbstractC029409q<?> LJIIJ() {
        return this.LJLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<Integer> LJIIL() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<EnumC94693nd> LJIILIIL() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC113344cc
    public final void LJFF(RecUser user) {
        o.LJIIIZ(user, "user");
        C92353jr c92353jr = C92353jr.LIZ;
        Keva LJFF = c92353jr.LJFF();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key_maf_chat_delete_num");
        LIZ.append(C92353jr.LIZJ());
        String LIZIZ = X1D.LIZIZ(LIZ);
        Keva LJFF2 = c92353jr.LJFF();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_maf_chat_delete_num");
        LIZ2.append(C92353jr.LIZJ());
        LJFF.storeInt(LIZIZ, LJFF2.getInt(X1D.LIZIZ(LIZ2), 0) + 1);
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C3SI(this, this.LJLLI.indexOf(user), null), 3);
    }

    @Override // X.InterfaceC113344cc
    public final void LJI(RecUser user) {
        o.LJIIIZ(user, "user");
        this.LJLLLL.add(user);
        LJFF(user);
        C3U1 c3u1 = (C3U1) this.LJLLLLLL.getValue();
        boolean z = true;
        if (c3u1 != null) {
            ALX alx = new ALX();
            alx.LIZJ(user.getUid());
            alx.LIZIZ(user.getSecUid());
            boolean isAccuratePrivateAccount = user.isAccuratePrivateAccount();
            C57285Me1 c57285Me1 = alx.LIZ;
            c57285Me1.LJIIL = isAccuratePrivateAccount;
            c57285Me1.LIZJ = 1;
            alx.LIZ.LJIIJ = user.getFollowerStatus();
            alx.LIZ.LJIILL = user.getAccurateRecType();
            c3u1.yQ(alx.LIZ(), "notification_page", new AqS164S0200000_1(this, user, 2));
        }
        if (user.getFollowerStatus() != 1) {
            z = false;
        }
        C102303zu.LIZLLL("notification_page", "guide_dm", z);
        C102303zu.LJ(user, EnumC57365MfJ.FOLLOW);
    }

    public final void LJIILLIIL(List<? extends C3L4> list) {
        String uid;
        this.LJLLILLLL.clear();
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.LJLLI);
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((User) it.next()).getUid());
            }
            List LLJILJILJ = ORZ.LLJILJILJ(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (C3L4 c3l4 : list) {
                if (c3l4 instanceof C3L3) {
                    arrayList3.add(c3l4);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                IMUser iMUser = ((C3L3) it2.next()).LLIIIZ;
                if (iMUser != null && (uid = iMUser.getUid()) != null) {
                    this.LJLLILLLL.add(uid);
                    ArrayList arrayList4 = (ArrayList) LLJILJILJ;
                    if (arrayList4.contains(uid)) {
                        int indexOf = arrayList4.indexOf(uid);
                        if (indexOf >= 0 && indexOf < this.LJLLI.size()) {
                            ListProtector.remove(this.LJLLI, indexOf);
                            submitList(this.LJLLI);
                            notifyItemRemoved(indexOf);
                        }
                        arrayList4.remove(uid);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.3SG] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.4cZ] */
    public MafChatListWidget(final InboxFragment fragment, LiveData parentWidgetState) {
        super(fragment, parentWidgetState);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(parentWidgetState, "parentWidgetState");
        MutableLiveData<EnumC94693nd> mutableLiveData = new MutableLiveData<>(EnumC94693nd.EMPTY);
        this.LJLJL = mutableLiveData;
        this.LJLJLJ = mutableLiveData;
        ?? r0 = new AbstractC28801Bc<RecUser, C113304cY>(fragment, this) { // from class: X.4cZ
            public final Fragment LJLIL;
            public final InterfaceC113344cc LJLILLLLZI;
            public final java.util.Set<String> LJLJI;

            @Override // X.AbstractC029409q
            public final long getItemId(int i) {
                return getItem(i).hashCode();
            }

            @Override // X.AbstractC029409q
            public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                C113304cY holder = (C113304cY) viewHolder;
                o.LJIIIZ(holder, "holder");
                super.onViewAttachedToWindow(holder);
                java.util.Set<String> shownUids = this.LJLJI;
                o.LJIIIZ(shownUids, "shownUids");
                RecUser recUser = holder.LJLJLLL;
                if (recUser != null && (!shownUids.contains(recUser.getUid()))) {
                    String uid = recUser.getUid();
                    o.LJIIIIZZ(uid, "uid");
                    shownUids.add(uid);
                    holder.M(recUser.getUid(), "show");
                    C102303zu.LJ(recUser, EnumC57365MfJ.SHOW);
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r2 = this;
                    X.3XD r1 = new X.3XD
                    r1.<init>()
                    java.lang.String r0 = "fragment"
                    kotlin.jvm.internal.o.LJIIIZ(r3, r0)
                    java.lang.String r0 = "listener"
                    kotlin.jvm.internal.o.LJIIIZ(r4, r0)
                    r2.<init>(r1)
                    r2.LJLIL = r3
                    r2.LJLILLLLZI = r4
                    r0 = 1
                    r2.setHasStableIds(r0)
                    java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                    r0.<init>()
                    r2.LJLJI = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C113314cZ.<init>(com.ss.android.ugc.aweme.inbox.InboxFragment, X.4cc):void");
            }

            @Override // X.AbstractC029409q
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                String displayName;
                int i2;
                UrlModel avatarThumb;
                OSZ osz;
                Integer num;
                C113304cY holder = (C113304cY) viewHolder;
                o.LJIIIZ(holder, "holder");
                if (i >= 0 && i <= getItemCount() - 1) {
                    RecUser item = getItem(i);
                    o.LJIIIIZZ(item, "getItem(position)");
                    RecUser recUser = item;
                    holder.LJLJLLL = recUser;
                    W5F LJII = W5U.LJII(C78939UyV.LJ(recUser.getAvatarThumb()));
                    LJII.LJJIIJ = holder.LJLIL;
                    C16880lQ.LLJJJ(LJII);
                    if (TextUtils.isEmpty(recUser.getRemarkName())) {
                        displayName = recUser.getNickname();
                    } else {
                        displayName = recUser.getRemarkName();
                    }
                    TuxTextView tuxTextView = holder.LJLILLLLZI;
                    OSZ L = C113304cY.L();
                    if (L != null && (num = (Integer) L.getFirst()) != null) {
                        tuxTextView.setTuxFont(num.intValue());
                    }
                    tuxTextView.setText(displayName);
                    TuxTextView tuxTextView2 = holder.LJLJI;
                    OSZ L2 = C113304cY.L();
                    if (L2 != null && (osz = (OSZ) L2.getSecond()) != null) {
                        tuxTextView2.setTuxFont(((Number) osz.getFirst()).intValue());
                        tuxTextView2.setTextColorRes(((Number) osz.getSecond()).intValue());
                    }
                    tuxTextView2.setText(holder.itemView.getContext().getString(R.string.h8t, displayName));
                    C57446Mgc c57446Mgc = holder.LJLJJI;
                    C7YW c7yw = new C7YW();
                    c7yw.LIZ = recUser;
                    c7yw.LIZIZ(EnumC57119MbL.NORMAL);
                    c7yw.LJ = true;
                    c57446Mgc.LJLILLLLZI.LJJJJJL(c7yw.LIZ());
                    holder.LJLJJI.setTracker(C113334cb.LJLIL);
                    holder.LJLJJI.setFollowClickInterceptor(new C113324ca(holder, recUser, null));
                    Context context = holder.itemView.getContext();
                    o.LJIIIIZZ(context, "itemView.context");
                    C26227ARb LIZIZ = C77413UZt.LIZIZ(context);
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(LIZIZ.LIZ), R.layout.b92, null, false);
                    View findViewById = LLLLIILL.findViewById(R.id.abh);
                    o.LJIIIIZZ(findViewById, "layout.findViewById(R.id.avatar)");
                    SmartImageView smartImageView = (SmartImageView) findViewById;
                    User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                    if (curUser != null && (avatarThumb = curUser.getAvatarThumb()) != null) {
                        W5F LJII2 = W5U.LJII(C78939UyV.LJ(avatarThumb));
                        LJII2.LJJIIJ = smartImageView;
                        C16880lQ.LLJJJ(LJII2);
                    }
                    View findViewById2 = LLLLIILL.findViewById(R.id.gbk);
                    o.LJIIIIZZ(findViewById2, "layout.findViewById(R.id.maf_avatar)");
                    SmartImageView smartImageView2 = (SmartImageView) findViewById2;
                    UrlModel avatarThumb2 = recUser.getAvatarThumb();
                    if (avatarThumb2 != null) {
                        W5F LJII3 = W5U.LJII(C78939UyV.LJ(avatarThumb2));
                        LJII3.LJJIIJ = smartImageView2;
                        C16880lQ.LLJJJ(LJII3);
                    }
                    C78685UuP.LJIJI(LIZIZ, LLLLIILL, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(LIZIZ.LIZ), R.layout.b93, null, false);
                    View findViewById3 = LLLLIILL2.findViewById(R.id.b_o);
                    o.LJIIIIZZ(findViewById3, "layout.findViewById(R.id.checkbox)");
                    holder.LJLJLJ = (C71897SJp) findViewById3;
                    if (recUser.getFollowerStatus() == 1) {
                        i2 = R.string.hc7;
                    } else {
                        i2 = R.string.hc6;
                    }
                    ((TextView) LLLLIILL2.findViewById(R.id.gho)).setText(i2);
                    C16880lQ.LJJJJI((TuxTextView) LLLLIILL2.findViewById(R.id.ghg), new ACListenerS21S0100000_1(holder, UserLevelGeckoUpdateSetting.DEFAULT));
                    LIZIZ.LJIIJ = new ARU(LLLLIILL2);
                    C77123UOp.LJIILL(LIZIZ, new AqS132S0200000_1(holder, recUser, 53));
                    LIZIZ.LJIIIIZZ = true;
                    LIZIZ.LJII = true;
                    LIZIZ.LIZJ(new AqS132S0200000_1(holder, recUser, 54));
                    C16880lQ.LJJJJI(holder.LJLJJL, new ACListenerS27S0300000_1(LIZIZ.LJI(), recUser, holder, 5));
                    C16880lQ.LJIIJ(new ACListenerS36S0200000_1(recUser, holder, 19), holder.itemView);
                    o.LJIIIIZZ(displayName, "displayName");
                    C245319jz c245319jz = new C245319jz();
                    String string = holder.itemView.getContext().getString(R.string.em1, displayName);
                    o.LJIIIIZZ(string, "itemView.context.getStri…roid_delete, displayName)");
                    c245319jz.LIZ.LJLLILLLL = string;
                    C252659vp LIZIZ2 = C49606JdS.LIZIZ(R.raw.icon_trash_bin, R.string.h5a);
                    LIZIZ2.LIZJ = 1;
                    LIZIZ2.LJ = new ACListenerS21S0100000_1(new AqS132S0200000_1(holder, recUser, 55), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                    c245319jz.LIZ(LIZIZ2);
                    holder.itemView.setOnLongClickListener(new IDCListenerS108S0200000_1(c245319jz.LIZJ(), holder, 1));
                }
            }

            @Override // X.AbstractC029409q
            /* renamed from: onCreateViewHolder */
            public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
                o.LJIIIZ(parent, "parent");
                Fragment fragment2 = this.LJLIL;
                InterfaceC113344cc listener = this.LJLILLLLZI;
                o.LJIIIZ(fragment2, "fragment");
                o.LJIIIZ(listener, "listener");
                View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.b3f, parent, false);
                o.LJIIIIZZ(itemView, "itemView");
                C113304cY c113304cY = new C113304cY(itemView);
                c113304cY.LJLJJLL = fragment2;
                c113304cY.LJLJL = listener;
                C0AX.LIZ(parent, c113304cY.itemView, R.id.lj7);
                View view = c113304cY.itemView;
                if (view != null) {
                    view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
                }
                try {
                    if (c113304cY.itemView.getParent() != null) {
                        boolean z = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (z) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C113304cY.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(parent.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C78983UzD.LJIILL(stringBuffer.toString());
                            ViewGroup viewGroup = (ViewGroup) c113304cY.itemView.getParent();
                            if (viewGroup != null) {
                                C16880lQ.LJLLL(c113304cY.itemView, viewGroup);
                            }
                        }
                    }
                } catch (Exception e) {
                    C78946Uyc.LIZIZ(e);
                    C36922EeM.LIZ(e);
                }
                C29127Bbv.LIZ = C113304cY.class.getName();
                return c113304cY;
            }
        };
        this.LJLJLLL = r0;
        this.LJLL = r0;
        this.LJLLI = FII.LIZ();
        this.LJLLILLLL = new ConcurrentHashSet<>();
        ActivityC45651qj requireActivity = fragment.requireActivity();
        o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
        this.LJLLL = requireActivity;
        this.LJLLLL = new LinkedHashSet();
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 786));
        this.LJLZ = new C73318Sq2();
        this.LJZ = C221108m2.LIZIZ(new AqS151S0100000_1(fragment, 785));
        this.LJZI = C221108m2.LIZIZ(C3SK.LJLIL);
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.LJZL = mutableLiveData2;
        this.LL = mutableLiveData2;
        this.LLD = new Handler(C16880lQ.LLJJJJ());
        this.LLF = new InterfaceC82123Ke() { // from class: X.3SG
            @Override // X.InterfaceC82123Ke
            public final C39N LIZIZ() {
                return C39N.INBOX;
            }

            @Override // X.InterfaceC82123Ke
            public final void LIZ(C81983Jq c81983Jq, List<? extends C3L4> sessionList) {
                o.LJIIIZ(sessionList, "sessionList");
            }

            @Override // X.InterfaceC82123Ke
            public final void LIZJ(List<? extends C3L4> sessionList, boolean z) {
                o.LJIIIZ(sessionList, "sessionList");
                MafChatListWidget mafChatListWidget = MafChatListWidget.this;
                mafChatListWidget.LLD.post(new ARunnableS37S0100000_1(mafChatListWidget, 67));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC57917MoD
    public final List LIZLLL(List data, boolean z) {
        List<Integer> canMessageFollowStatusList;
        o.LJIIIZ(data, "data");
        this.LJLLI.clear();
        this.LJLLJ = true;
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EducateUserMessageSetting.EducateUserMessageConfig educateUserMessageConfig = EducateUserMessageSetting.LIZ;
        EducateUserMessageSetting.EducateUserMessageConfig educateUserMessageConfig2 = (EducateUserMessageSetting.EducateUserMessageConfig) LIZLLL.LJIIIIZZ("tt_dm_educate_muf_user_to_message_config", EducateUserMessageSetting.EducateUserMessageConfig.class, educateUserMessageConfig);
        if (educateUserMessageConfig2 != null) {
            educateUserMessageConfig = educateUserMessageConfig2;
        }
        o.LJIIIIZZ(educateUserMessageConfig, "SettingsManager.getInsta….java)\n        ?: DEFAULT");
        int i = educateUserMessageConfig.maxChatCount;
        Keva LJFF = C92353jr.LIZ.LJFF();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key_maf_chat_delete_num");
        LIZ.append(C92353jr.LIZJ());
        int i2 = i - LJFF.getInt(X1D.LIZIZ(LIZ), 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (this.LJLLI.size() < Math.max(i2, 0) && (obj instanceof RecUser)) {
                User user = (User) obj;
                o.LJIIIZ(user, "user");
                if (!user.isAccuratePrivateAccount() && (canMessageFollowStatusList = user.getCanMessageFollowStatusList()) != null && ((canMessageFollowStatusList.contains(1) || canMessageFollowStatusList.contains(4)) && user.getFollowStatus() == 0 && ((o.LJ(user.getAccurateRecType(), "1-2") || o.LJ(user.getAccurateRecType(), "1-1")) && !this.LJLLILLLL.contains(((User) obj).getUid())))) {
                    this.LJLLI.add(obj);
                }
            }
            arrayList.add(obj);
        }
        this.LJZL.postValue(Integer.valueOf(this.LJLLI.size()));
        LJ();
        return arrayList;
    }
}
