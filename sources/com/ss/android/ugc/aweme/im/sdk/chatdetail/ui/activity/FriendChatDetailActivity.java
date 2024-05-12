package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity;

import X.AJ9;
import X.ARV;
import X.AbstractC90763hI;
import X.AbstractViewOnClickListenerC105754Db;
import X.AnonymousClass636;
import X.C00F;
import X.C100013wD;
import X.C1042547h;
import X.C162476Zf;
import X.C16880lQ;
import X.C221108m2;
import X.C26045AKb;
import X.C34B;
import X.C36636EZk;
import X.C36N;
import X.C36P;
import X.C36W;
import X.C3E5;
import X.C3EU;
import X.C47261Igj;
import X.C48841JEv;
import X.C56642Ke;
import X.C61878OQg;
import X.C62822Ol8;
import X.C63041Oof;
import X.C63120Opw;
import X.C65803Ps7;
import X.C784636c;
import X.C785436k;
import X.C78613UtF;
import X.C78939UyV;
import X.C80533Eb;
import X.C80763Ey;
import X.C81273Gx;
import X.C88663du;
import X.C90643h6;
import X.C91473iR;
import X.C91633ih;
import X.C92333jp;
import X.C94733nh;
import X.C96093pt;
import X.C98793uF;
import X.C98803uG;
import X.EnumC91783iw;
import X.InterfaceC109664Sc;
import X.QD3;
import X.ViewOnTouchListenerC100423ws;
import X.ViewOnTouchListenerC101083xw;
import X.W5F;
import X.W5U;
import X.X1D;
import X.XKX;
import Y.IDCListenerS202S0100000_1;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import o3.IDaS465S0100000_1;
import o3.IDaS88S0000000_1;
import o3.h0;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class FriendChatDetailActivity extends AbstractViewOnClickListenerC105754Db {
    public static final /* synthetic */ int LLFZ = 0;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public boolean LLD;
    public boolean LLF;
    public IMUser LLFF;
    public C784636c LLFFF;
    public final Map<Integer, View> LLFII = new LinkedHashMap();
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 526));
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 525));

    @Override // X.AbstractViewOnClickListenerC105754Db
    public final void LLIIJLIL() {
    }

    @Override // X.AbstractViewOnClickListenerC105754Db, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFII).clear();
    }

    @Override // X.AbstractViewOnClickListenerC105754Db, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFII;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.AbstractViewOnClickListenerC105754Db, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public FriendChatDetailActivity() {
        C221108m2.LIZIZ(new AqS151S0100000_1(this, 533));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 532));
        this.LJLZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 529));
        this.LJZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 528));
        this.LJZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 531));
        this.LJZL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 530));
        this.LL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 527));
    }

    public final SmartAvatarImageView LLILLIZIL() {
        Object value = this.LJLLLL.getValue();
        o.LJIIIIZZ(value, "<get-avatarImage>(...)");
        return (SmartAvatarImageView) value;
    }

    public final RelativeLayout LLILLJJLI() {
        Object value = this.LL.getValue();
        o.LJIIIIZZ(value, "<get-blockLayout>(...)");
        return (RelativeLayout) value;
    }

    public final TuxTextView LLILLL() {
        Object value = this.LJZ.getValue();
        o.LJIIIIZZ(value, "<get-blockText>(...)");
        return (TuxTextView) value;
    }

    public final TuxTextView LLILZ() {
        Object value = this.LJZI.getValue();
        o.LJIIIIZZ(value, "<get-reportText>(...)");
        return (TuxTextView) value;
    }

    @Override // X.AbstractViewOnClickListenerC105754Db
    public final void LLIIIZ() {
        super.LLIIIZ();
        h0.LJIJI(LLILLJJLI(), new IDaS465S0100000_1(this, 0));
        h0.LJIJI(LLILZ(), new IDaS88S0000000_1(2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractViewOnClickListenerC105754Db
    public final void LLIIJI() {
        super.LLIIJI();
        if (this.LLFF == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initEvents, mUser is not initialized, isFinishing: ");
            LIZ.append(isFinishing());
            C34B.LIZJ("FriendChatDetailActivity", X1D.LIZIZ(LIZ));
            if (!isFinishing()) {
                finish();
                return;
            }
            return;
        }
        Object value = this.LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-avatarLayout>(...)");
        C16880lQ.LJIJ((RelativeLayout) value, this);
        C16880lQ.LJJJJL(LLILLIZIL(), this);
        C16880lQ.LJJJJI(LLILLL(), this);
        C16880lQ.LJJJJI(LLILZ(), this);
        Object value2 = this.LJZL.getValue();
        o.LJIIIIZZ(value2, "<get-layoutCreateGroup>(...)");
        C16880lQ.LJIIL((ViewGroup) value2, this);
        ViewOnTouchListenerC100423ws viewOnTouchListenerC100423ws = new ViewOnTouchListenerC100423ws();
        Object value3 = this.LJLLL.getValue();
        o.LJIIIIZZ(value3, "<get-avatarLayout>(...)");
        int i = 0;
        viewOnTouchListenerC100423ws.LIZ(value3, LLILLIZIL());
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.cj, this);
        View[] viewArr = {LLILLL(), LLILZ()};
        do {
            View view = viewArr[i];
            view.setOnTouchListener(new ViewOnTouchListenerC101083xw(LJIIIIZZ, view));
            i++;
        } while (i < 2);
    }

    @Override // X.AbstractViewOnClickListenerC105754Db
    public final void LLIILII() {
        Serializable serializable;
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI != null) {
            serializable = LLJJIJI.getSerializable("simple_uesr");
        } else {
            serializable = null;
        }
        boolean z = false;
        if (LLJJIJI != null && (serializable instanceof IMUser)) {
            IMUser iMUser = (IMUser) serializable;
            this.LLFF = iMUser;
            if (iMUser != null) {
                String uid = iMUser.getUid();
                if (uid != null && uid.length() != 0) {
                    try {
                        o.LJIIIIZZ(uid, "uid");
                        this.LJLJLLL = C81273Gx.LIZ(C81273Gx.LIZIZ(CastLongProtector.parseLong(uid)));
                    } catch (Exception unused) {
                    }
                }
                this.LLD = LLJJIJI.getBoolean("is_stranger", false);
                this.LLF = LLJJIJI.getBoolean("is_author_supporter", false);
                return;
            }
            o.LJIJI("mUser");
            throw null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initParams, containsExtra: ");
        if (LLJJIJI != null) {
            z = true;
        }
        LIZ.append(z);
        LIZ.append(", containsUser: ");
        LIZ.append(serializable instanceof IMUser);
        C34B.LIZJ("FriendChatDetailActivity", X1D.LIZIZ(LIZ));
        finish();
    }

    @Override // X.AbstractViewOnClickListenerC105754Db
    public final void LLIL() {
        super.LLIL();
        if (this.LLFF == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initViews, mUser is not initialized, isFinishing: ");
            LIZ.append(isFinishing());
            C34B.LIZJ("FriendChatDetailActivity", X1D.LIZIZ(LIZ));
            if (!isFinishing()) {
                finish();
                return;
            }
            return;
        }
        View findViewById = findViewById(R.id.fjv);
        View findViewById2 = findViewById(R.id.ix_);
        View findViewById3 = findViewById(R.id.am_);
        View findViewById4 = findViewById(R.id.flt);
        View findViewById5 = findViewById(R.id.fkv);
        View findViewById6 = findViewById(R.id.gml);
        int i = 8;
        findViewById(R.id.amb).setVisibility(8);
        ARV arv = (ARV) LLILLJJLI().findViewById(R.id.ama);
        this.LJLJLJ = arv;
        if (arv != null) {
            arv.setOnCheckedChangeListener(new IDCListenerS202S0100000_1(this, 3));
        }
        if (this.LLD) {
            findViewById.setVisibility(8);
            findViewById4.setVisibility(8);
        }
        if (this.LLF) {
            findViewById5.setVisibility(8);
            LLILLJJLI().setVisibility(8);
            findViewById6.setVisibility(8);
            Object value = this.LJLZ.getValue();
            o.LJIIIIZZ(value, "<get-detailText>(...)");
            ((View) value).setVisibility(8);
            LLILLIZIL().setEnabled(false);
            Object value2 = this.LJLLL.getValue();
            o.LJIIIIZZ(value2, "<get-avatarLayout>(...)");
            ((View) value2).setEnabled(false);
        }
        LLILZ().setTextColorRes(R.attr.e7);
        findViewById2.setVisibility(8);
        LLILLL().setTextColorRes(R.attr.e7);
        findViewById3.setVisibility(8);
        IMUser iMUser = this.LLFF;
        if (iMUser != null) {
            LLJILJILJ(iMUser);
            IMUser iMUser2 = this.LLFF;
            if (iMUser2 != null) {
                if (TextUtils.equals(iMUser2.getUid(), C80763Ey.LIZ(false))) {
                    LLILLJJLI().setVisibility(8);
                }
                IMUser iMUser3 = this.LLFF;
                if (iMUser3 != null) {
                    boolean isFriend = IMUser.isFriend(iMUser3.getFollowStatus());
                    boolean LIZIZ = C92333jp.LIZIZ();
                    StringBuilder LIZLLL = C00F.LIZLLL("Group chat support:", LIZIZ, ",  IMUser is friend: ", isFriend, ", isSelf: ");
                    IMUser iMUser4 = this.LLFF;
                    if (iMUser4 != null) {
                        LIZLLL.append(IMUser.isSelf(iMUser4.getUid()));
                        LIZLLL.append(' ');
                        C34B.LJI("FriendChatDetailActivity", X1D.LIZIZ(LIZLLL));
                        Object value3 = this.LJZL.getValue();
                        o.LJIIIIZZ(value3, "<get-layoutCreateGroup>(...)");
                        View view = (View) value3;
                        if (LIZIZ) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("IMUser is friend ");
                            LIZ2.append(isFriend);
                            C34B.LJI("FriendChatDetailActivity", X1D.LIZIZ(LIZ2));
                            if (isFriend) {
                                i = 0;
                            } else if (isFriend) {
                                throw new C162476Zf();
                            }
                        } else if (LIZIZ) {
                            throw new C162476Zf();
                        }
                        view.setVisibility(i);
                        return;
                    }
                    o.LJIJI("mUser");
                    throw null;
                }
                o.LJIJI("mUser");
                throw null;
            }
            o.LJIJI("mUser");
            throw null;
        }
        o.LJIJI("mUser");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onResume", true);
        super.onResume();
        IMUser iMUser = this.LLFF;
        if (iMUser != null && !IMUser.isInvalidUser(iMUser.getUid())) {
            IMUser iMUser2 = this.LLFF;
            if (iMUser2 != null) {
                String uid = iMUser2.getUid();
                IMUser iMUser3 = this.LLFF;
                if (iMUser3 != null) {
                    C80533Eb.LJIIJJI(uid, iMUser3.getSecUid(), false, new C3EU() { // from class: X.3is
                        @Override // X.C3EU
                        public final void LIZ(IMUser result) {
                            o.LJIIIZ(result, "result");
                            FriendChatDetailActivity friendChatDetailActivity = FriendChatDetailActivity.this;
                            friendChatDetailActivity.LLFFF = new C784636c(friendChatDetailActivity, result, "chat_detail", new AqS151S0100000_1(friendChatDetailActivity, 914), new AqS167S0100000_1(FriendChatDetailActivity.this, 338), new AqS167S0100000_1(FriendChatDetailActivity.this, 339), null, 64);
                            FriendChatDetailActivity.this.LLIZLLLIL(result);
                        }

                        @Override // X.C3EU
                        public final void LIZIZ(Throwable throwable) {
                            o.LJIIIZ(throwable, "throwable");
                        }
                    });
                } else {
                    o.LJIJI("mUser");
                    throw null;
                }
            } else {
                o.LJIJI("mUser");
                throw null;
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public final void LLIZLLLIL(IMUser iMUser) {
        this.LLFF = iMUser;
        ARV arv = this.LJLJLJ;
        if (arv != null) {
            arv.setChecked(iMUser.isBlock());
        }
        IMUser iMUser2 = this.LLFF;
        if (iMUser2 != null) {
            LLJILJILJ(iMUser2);
        } else {
            o.LJIJI("mUser");
            throw null;
        }
    }

    public final void LLJILJILJ(IMUser iMUser) {
        if (iMUser.getAvatarThumb() != null && iMUser.getAvatarThumb().getUrlList() != null && iMUser.getAvatarThumb().getUrlList().size() > 0) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(iMUser.getAvatarThumb()));
            LJII.LJJIJIIJIL = true;
            LJII.LJJIIJ = LLILLIZIL();
            C16880lQ.LLJJJ(LJII);
        } else {
            W5F LJ = W5U.LJ(R.drawable.b0p);
            LJ.LJJIJIIJIL = true;
            LJ.LJJIIJ = LLILLIZIL();
            C16880lQ.LLJJJ(LJ);
        }
        C94733nh.LIZ(LLILLIZIL(), iMUser);
        String customVerify = iMUser.getCustomVerify();
        String enterpriseVerifyReason = iMUser.getEnterpriseVerifyReason();
        Object value = this.LJLLLLLL.getValue();
        o.LJIIIIZZ(value, "<get-userNameText>(...)");
        AJ9.LJ(this, customVerify, enterpriseVerifyReason, (TextView) value);
        Object value2 = this.LJLLLLLL.getValue();
        o.LJIIIIZZ(value2, "<get-userNameText>(...)");
        TextView textView = (TextView) value2;
        String displayId = iMUser.getDisplayId();
        if (!TextUtils.isEmpty(displayId)) {
            textView.setVisibility(0);
            textView.setText(displayId);
        } else {
            textView.setVisibility(4);
        }
        Object value3 = this.LJLZ.getValue();
        o.LJIIIIZZ(value3, "<get-detailText>(...)");
        TextView textView2 = (TextView) value3;
        String displayName = iMUser.getDisplayName();
        if (!TextUtils.isEmpty(displayName)) {
            textView2.setVisibility(0);
            textView2.setText(displayName);
        } else {
            textView2.setVisibility(4);
        }
        if (this.LLF) {
            Object value4 = this.LJLZ.getValue();
            o.LJIIIIZZ(value4, "<get-detailText>(...)");
            ((View) value4).setVisibility(8);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBlockUserSuccessEvent(C785436k event) {
        o.LJIIIZ(event, "event");
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.h4h);
        c26045AKb.LJIIJ();
        C784636c c784636c = this.LLFFF;
        if (c784636c != null) {
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C36P(c784636c, null), 3);
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C36N(c784636c, true, null), 3);
        }
    }

    @Override // X.AbstractViewOnClickListenerC105754Db, android.view.View.OnClickListener
    public void onClick(View v) {
        boolean z;
        String str;
        String str2;
        Long l;
        int i;
        C63120Opw LIZLLL;
        o.LJIIIZ(v, "v");
        super.onClick(v);
        int id = v.getId();
        if (id == R.id.acq || id == R.id.acf) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.LLF || (C100013wD.LIZIZ & 16) == 16) {
                IMUser iMUser = this.LLFF;
                if (iMUser != null) {
                    C3E5.LIZLLL(iMUser.getUid());
                    IUserProfilePreload LJIIIIZZ = UserProfilePreloadHelper.LJIIIIZZ();
                    IMUser iMUser2 = this.LLFF;
                    if (iMUser2 != null) {
                        User user = IMUser.toUser(iMUser2);
                        o.LJIIIIZZ(user, "toUser(mUser)");
                        LJIIIIZZ.LIZJ(user);
                        IMUser iMUser3 = this.LLFF;
                        if (iMUser3 != null) {
                            C96093pt.LIZ(iMUser3.getUid());
                            return;
                        } else {
                            o.LJIJI("mUser");
                            throw null;
                        }
                    }
                    o.LJIJI("mUser");
                    throw null;
                }
                o.LJIJI("mUser");
                throw null;
            }
            return;
        }
        if (id == R.id.amg) {
            C784636c c784636c = this.LLFFF;
            if (c784636c == null) {
                return;
            }
            c784636c.LJI();
            return;
        }
        if (id == R.id.ixf) {
            AbstractC90763hI abstractC90763hI = this.LJLJLLL;
            if (abstractC90763hI != null) {
                str2 = abstractC90763hI.LJ();
            } else {
                str2 = null;
            }
            AbstractC90763hI abstractC90763hI2 = this.LJLJLLL;
            if (abstractC90763hI2 != null && (LIZLLL = abstractC90763hI2.LIZLLL()) != null) {
                l = Long.valueOf(LIZLLL.getConversationShortId());
            } else {
                l = null;
            }
            IMUser iMUser4 = this.LLFF;
            if (iMUser4 != null) {
                String uid = iMUser4.getUid();
                if (uid == null || uid.length() == 0 || str2 == null || str2.length() == 0 || l == null || l.longValue() <= 0) {
                    return;
                }
                if (this.LLD) {
                    i = 1;
                } else {
                    IMUser iMUser5 = this.LLFF;
                    if (iMUser5 != null) {
                        if (iMUser5.getCommerceUserLevel() > 0) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                    } else {
                        o.LJIJI("mUser");
                        throw null;
                    }
                }
                String l2 = l.toString();
                IMUser iMUser6 = this.LLFF;
                if (iMUser6 != null) {
                    String uid2 = iMUser6.getUid();
                    IMUser iMUser7 = this.LLFF;
                    if (iMUser7 != null) {
                        String contactName = iMUser7.getContactName();
                        IMUser iMUser8 = this.LLFF;
                        if (iMUser8 != null) {
                            String LJFF = C98793uF.LJFF(iMUser8);
                            IMUser iMUser9 = this.LLFF;
                            if (iMUser9 != null) {
                                boolean isBlock = iMUser9.isBlock();
                                IMUser iMUser10 = this.LLFF;
                                if (iMUser10 != null) {
                                    String nickName = iMUser10.getNickName();
                                    IMUser iMUser11 = this.LLFF;
                                    if (iMUser11 != null) {
                                        UrlModel displayAvatar = iMUser11.getDisplayAvatar();
                                        IMUser iMUser12 = this.LLFF;
                                        if (iMUser12 != null) {
                                            int followingCount = iMUser12.getFollowingCount();
                                            IMUser iMUser13 = this.LLFF;
                                            if (iMUser13 != null) {
                                                int followerCount = iMUser13.getFollowerCount();
                                                IMUser iMUser14 = this.LLFF;
                                                if (iMUser14 != null) {
                                                    int followStatus = iMUser14.getFollowStatus();
                                                    o.LJIIIIZZ(uid2, "uid");
                                                    C98793uF.LIZLLL(new C91473iR(new C98803uG(l2, uid2, str2, LJFF, Boolean.valueOf(isBlock), "im", i, contactName, 0, false, false, nickName, displayAvatar, Integer.valueOf(followingCount), Integer.valueOf(followerCount), Integer.valueOf(followStatus), null, null, 198400, null)), this, "1", null, 24);
                                                    IMUser iMUser15 = this.LLFF;
                                                    if (iMUser15 != null) {
                                                        C1042547h.LJI(iMUser15, null, 12);
                                                        return;
                                                    } else {
                                                        o.LJIJI("mUser");
                                                        throw null;
                                                    }
                                                }
                                                o.LJIJI("mUser");
                                                throw null;
                                            }
                                            o.LJIJI("mUser");
                                            throw null;
                                        }
                                        o.LJIJI("mUser");
                                        throw null;
                                    }
                                    o.LJIJI("mUser");
                                    throw null;
                                }
                                o.LJIJI("mUser");
                                throw null;
                            }
                            o.LJIJI("mUser");
                            throw null;
                        }
                        o.LJIJI("mUser");
                        throw null;
                    }
                    o.LJIJI("mUser");
                    throw null;
                }
                o.LJIJI("mUser");
                throw null;
            }
            o.LJIJI("mUser");
            throw null;
        }
        if (id != R.id.fho) {
            return;
        }
        Bundle bundle = new Bundle();
        IMUser iMUser16 = this.LLFF;
        if (iMUser16 != null) {
            List LJJIJ = C47261Igj.LJJIJ(iMUser16);
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            EnumC91783iw enumC91783iw = EnumC91783iw.CREATE_GROUP;
            AbstractC90763hI abstractC90763hI3 = this.LJLJLLL;
            if (abstractC90763hI3 == null || (str = abstractC90763hI3.LJ()) == null) {
                str = "";
            }
            bundle.putSerializable("init_config", new C91633ih(LJJIJ, c61878OQg, "single_chat_detail", enumC91783iw, str, false, 32, null));
            C88663du.LIZ(this, bundle);
            C90643h6.LIZIZ = "private_chat";
            C90643h6.LIZJ(false);
            return;
        }
        o.LJIJI("mUser");
        throw null;
    }

    @Override // X.AbstractViewOnClickListenerC105754Db, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onCreate", true);
        activityConfiguration(C63041Oof.LJLIL);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onCreate", false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke event) {
        o.LJIIIZ(event, "event");
        try {
            InterfaceC109664Sc inboxAdapterService = IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService();
            if (inboxAdapterService != null) {
                String string = JSONObjectProtectorUtils.getString(event.LJLIL, "eventName");
                o.LJIIIIZZ(string, "event.params.getString(\"eventName\")");
                Lifecycle.State currentState = getLifecycle().getCurrentState();
                o.LJIIIIZZ(currentState, "this@FriendChatDetailAct…ty.lifecycle.currentState");
                if (inboxAdapterService.LJIIJ(string, currentState)) {
                    FragmentManager supportFragmentManager = getSupportFragmentManager();
                    o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
                    inboxAdapterService.LIZJ(supportFragmentManager, C36W.REPORT, null);
                }
            }
        } catch (JSONException unused) {
        }
    }
}
