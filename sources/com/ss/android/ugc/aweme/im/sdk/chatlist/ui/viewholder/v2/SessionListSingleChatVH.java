package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2;

import X.AJ9;
import X.AnonymousClass064;
import X.C1040246k;
import X.C1040846q;
import X.C1041346v;
import X.C107724Kq;
import X.C112244aq;
import X.C113554cx;
import X.C119354mJ;
import X.C17N;
import X.C221108m2;
import X.C226668v0;
import X.C3E6;
import X.C3L3;
import X.C3L4;
import X.C3TD;
import X.C3TO;
import X.C3TU;
import X.C3TV;
import X.C3U2;
import X.C3U6;
import X.C53691L5j;
import X.C57396Mfo;
import X.C57434MgQ;
import X.C62822Ol8;
import X.C76662ze;
import X.C76800UCe;
import X.C771431a;
import X.C78949Uyf;
import X.C78966Uyw;
import X.C81273Gx;
import X.C84673Tz;
import X.C85353Wp;
import X.C89263es;
import X.C94733nh;
import X.C96503qY;
import X.C96533qb;
import X.C96703qs;
import X.C96893rB;
import X.C96913rD;
import X.C97343ru;
import X.EnumC112694bZ;
import X.EnumC53695L5n;
import X.EnumC96553qd;
import X.InterfaceC100393wp;
import X.InterfaceC1040946r;
import X.InterfaceC82723Mm;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.SY9;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSayhiAnalyticsImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SessionListSingleChatVH extends SessionListIMBaseVH {
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final AqS167S0100000_1 LLIIJLIL;
    public final AqS167S0100000_1 LLIIL;
    public final C62822Ol8 LLIILII;
    public int LLIILZL;

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final C53691L5j A0() {
        return (C53691L5j) this.LLFZ.getValue();
    }

    public final RelationButton B0() {
        return (RelationButton) this.LLI.getValue();
    }

    public final TuxTextView C0() {
        return (TuxTextView) this.LLIFFJFJJ.getValue();
    }

    public final InterfaceC100393wp D0() {
        return (InterfaceC100393wp) this.LLIIIZ.getValue();
    }

    public final InboxSocPubStatusViewModelImpl E0() {
        return (InboxSocPubStatusViewModelImpl) this.LLIIIJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH
    public final Map<String, String> X() {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        View view = (View) this.LLIIIL.getValue();
        if (view != null && view.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        linkedHashMap.put("has_icon", String.valueOf(z));
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH, X.MMN
    public final void onAttach() {
        C3TO copy$default;
        C3L4 LIZJ;
        TuxTextView C0;
        boolean z;
        String uid;
        Set<String> set;
        EnumC53695L5n enumC53695L5n;
        C53691L5j A0;
        EnumC53695L5n mode;
        Map<String, EnumC53695L5n> map;
        Set<String> set2;
        super.onAttach();
        C3TO c3to = (C3TO) this.LJLLILLLL;
        if (c3to == null || (copy$default = C3TO.copy$default(c3to, false, false, false, 0, false, false, null, false, null, false, false, null, false, null, null, null, null, null, false, false, false, false, null, 0, 0L, 0L, 67108863, null)) == null || (LIZJ = C771431a.LIZ().LIZJ(copy$default.getSessionId())) == null) {
            return;
        }
        C3TV c3tv = C3TV.LIZ;
        RelationButton B0 = B0();
        if ((B0 == null || B0.getVisibility() != 0) && (C0 = C0()) != null && C0.getVisibility() == 0) {
        }
        View view = (View) this.LLIIIL.getValue();
        if (view != null && view.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        C3TV.LJI(c3tv, LIZJ, z, this.LLIILZL);
        C78949Uyf.LJJJI(LIZJ, z0());
        IMUser imUser = copy$default.getImUser();
        if (imUser == null || (uid = imUser.getUid()) == null) {
            return;
        }
        InboxSocPubStatusViewModelImpl E0 = E0();
        if (E0 != null && (set = E0.LJLJJL) != null && !set.contains(uid)) {
            C53691L5j A02 = A0();
            if (A02 != null) {
                enumC53695L5n = A02.getMode();
            } else {
                enumC53695L5n = null;
            }
            if (enumC53695L5n != EnumC53695L5n.NONE && (A0 = A0()) != null && (mode = A0.getMode()) != null) {
                InterfaceC100393wp D0 = D0();
                if (D0 != null) {
                    D0.LJFF(mode);
                }
                InboxSocPubStatusViewModelImpl E02 = E0();
                if (E02 != null && (set2 = E02.LJLJJL) != null) {
                    set2.add(uid);
                }
                InboxSocPubStatusViewModelImpl E03 = E0();
                if (E03 != null && (map = E03.LJLJJI) != null) {
                    map.put(uid, mode);
                }
            }
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C112244aq.LIZ(itemView, uid, Boolean.valueOf(copy$default.isActive()));
    }

    public final C107724Kq z0() {
        return (C107724Kq) this.LLIIJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH, X.MMN
    public final void onDetach() {
        super.onDetach();
        InterfaceC1040946r l0 = l0();
        if (l0 != null) {
            l0.LIZIZ();
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setTag(R.id.eg1, null);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final boolean s0() {
        TuxTextView C0 = C0();
        if (C0 == null || C0.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH
    public final InterfaceC88472Yns<C3TO, C76800UCe> Q() {
        return this.LLIIL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH
    public final InterfaceC88472Yns<C3TO, C76800UCe> T() {
        return this.LLIIJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionListSingleChatVH(View view) {
        super(view);
        o.LJIIIZ(view, "view");
        this.LLFZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 618));
        this.LLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 619));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 620));
        this.LLII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 615));
        this.LLIIII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 623));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 616));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 622));
        this.LLIIIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 617));
        this.LLIIIZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 621));
        this.LLIIJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 614));
        this.LLIIJLIL = new AqS167S0100000_1(this, 167);
        this.LLIIL = new AqS167S0100000_1(this, 166);
        this.LLIILII = C221108m2.LIZIZ(C96703qs.LJLIL);
    }

    public static void H0(C3TO c3to) {
        C3L3 c3l3;
        IMUser LJIJI;
        if (!c3to.getShowSayHiButton() || (c3l3 = (C3L3) C771431a.LIZ().LIZJ(c3to.getSessionId())) == null || (LJIJI = c3l3.LJIJI()) == null) {
            return;
        }
        String uid = LJIJI.getUid();
        if (uid == null) {
            Long valueOf = Long.valueOf(C81273Gx.LIZLLL(c3to.getSessionId()));
            if (valueOf.longValue() == -1 || (uid = valueOf.toString()) == null) {
                return;
            }
        }
        C3TD.LIZ().getClass();
        C3U2.LIZLLL(LJIJI, uid);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH
    public final void L(InterfaceC82723Mm interfaceC82723Mm) {
        String secUid;
        C3TO c3to = (C3TO) interfaceC82723Mm;
        Object avatar = c3to.getAvatar();
        if (avatar instanceof UrlModel) {
            IMUser imUser = c3to.getImUser();
            String sessionId = c3to.getSessionId();
            o.LJIIIZ(sessionId, "sessionId");
            if (imUser != null && ((secUid = imUser.getSecUid()) == null || secUid.length() == 0)) {
                C3E6.LIZ(sessionId);
            }
            C94733nh.LIZ(P(), c3to.getImUser());
            if ((C1041346v.LIZIZ() & 1) != 0 && l0() != null) {
                InterfaceC1040946r l0 = l0();
                if (l0 != null) {
                    C1040846q.LIZIZ(l0, c3to.getUid(), (UrlModel) avatar, 0, 12);
                    return;
                }
                return;
            }
            if (C84673Tz.LIZ()) {
                C85353Wp.LIZ(P(), this.LJLJLLL.LIZIZ, (UrlModel) avatar, c3to.getUid());
                return;
            } else {
                super.L(c3to);
                return;
            }
        }
        super.L(c3to);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH, X.C3X3
    public final void LLL(C96533qb c96533qb) {
        super.LLL(c96533qb);
        int i = c96533qb.LIZIZ;
        if (i != -1) {
            int intValue = ((Number) C96503qY.LJ.getValue()).intValue() + i;
            C53691L5j A0 = A0();
            if (A0 != null) {
                g0.LJJIJIIJI(intValue, intValue, A0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH
    public final void M(InterfaceC82723Mm interfaceC82723Mm) {
        TuxTextView U;
        TuxTextView U2;
        CharSequence string;
        C3TO c3to = (C3TO) interfaceC82723Mm;
        super.M(c3to);
        if (c3to.isRecommendedChat() && (U2 = U()) != null) {
            if (c3to.getLastMessageMsgType() != 15) {
                string = C97343ru.LIZ.getString(R.string.esm);
                o.LJIIIIZZ(string, "{\n            appContext…_inactive_push)\n        }");
            } else {
                string = C97343ru.LIZ.getString(R.string.esn);
                o.LJIIIIZZ(string, "{\n            appContext…o_history_push)\n        }");
            }
            U2.setText(string);
        }
        if (!c3to.isShowingTypingStatus() || (U = U()) == null) {
            return;
        }
        CharSequence typingStatusText = c3to.getTypingStatusText();
        if (typingStatusText == null) {
            typingStatusText = c3to.getContent();
        }
        U.setText(typingStatusText);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH
    public final void N(InterfaceC82723Mm interfaceC82723Mm) {
        C3TO c3to = (C3TO) interfaceC82723Mm;
        super.N(c3to);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        TuxTextView V = V();
        if (V == null) {
            return;
        }
        AJ9.LIZLLL(context, V, c3to.getShowVerifyIcon());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH
    public final boolean Y(InterfaceC82723Mm interfaceC82723Mm) {
        C3TO c3to;
        CharSequence charSequence;
        C3TO c3to2 = (C3TO) interfaceC82723Mm;
        if (super.Y(c3to2) || (c3to = (C3TO) this.LJLLILLLL) == null || c3to2.isShowingTypingStatus() != c3to.isShowingTypingStatus()) {
            return true;
        }
        CharSequence typingStatusText = c3to2.getTypingStatusText();
        C3TO c3to3 = (C3TO) this.LJLLILLLL;
        if (c3to3 != null) {
            charSequence = c3to3.getTypingStatusText();
        } else {
            charSequence = null;
        }
        if (!o.LJ(typingStatusText, charSequence)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final void f0(C3TU c3tu) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        C3TO c3to = (C3TO) c3tu;
        AppCompatTextView p0 = p0();
        if (p0 != null) {
            if (i0() && c3to.getDisplayActiveText()) {
                z = true;
            } else {
                z = false;
            }
            if (i0() && c3to.isShowingTypingStatus()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z && !c3to.getShowSayHiButton() && !c3to.isRecommendedChat() && !z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i = 0;
            } else {
                i = 8;
            }
            p0.setVisibility(i);
            if (p0.getVisibility() == 0) {
                C96503qY m0 = m0();
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                m0.getClass();
                p0.setText(C96503qY.LIZLLL(context, c3to));
                p0.setVisibility(0);
                return;
            }
            p0.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final void h0(C3TU c3tu) {
        ConstraintLayout constraintLayout;
        C3TO c3to = (C3TO) c3tu;
        View view = this.itemView;
        if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
            AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
            if (c3to.getShowSayHiButton()) {
                LIZ.LJIIIZ(R.id.la4, 7, R.id.jb1, 6, ((Number) this.LLIILII.getValue()).intValue());
                LIZ.LJIIIZ(R.id.btt, 7, R.id.jb1, 6, ((Number) this.LLIILII.getValue()).intValue());
            } else if (i0()) {
                LIZ.LJIIIIZZ(R.id.la4, 7, R.id.n3m, 6);
                LIZ.LJIIIIZZ(R.id.btt, 7, R.id.n3m, 6);
            } else if (n0()) {
                if (c3to.getShowCameraIcon()) {
                    LIZ.LJIIIIZZ(R.id.la4, 7, R.id.b3a, 6);
                    LIZ.LJIIIIZZ(R.id.btt, 7, R.id.b3a, 6);
                } else {
                    LIZ.LJIIIIZZ(R.id.la4, 7, R.id.fgj, 6);
                    LIZ.LJIIIIZZ(R.id.btt, 7, R.id.fgj, 6);
                }
            } else {
                LIZ.LJIIIIZZ(R.id.la4, 7, R.id.ffv, 6);
                LIZ.LJIIIIZZ(R.id.btt, 7, R.id.fgj, 6);
            }
            LIZ.LIZIZ(constraintLayout);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final SY9 o0(EnumC96553qd enumC96553qd) {
        return m0().LIZJ(enumC96553qd);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final boolean t0(C3TU c3tu) {
        boolean z;
        C3TO c3to = (C3TO) c3tu;
        if (C96893rB.LIZ() && c3to.getReadStatus() != EnumC96553qd.FAILED) {
            z = true;
        } else {
            z = false;
        }
        if (c3to.getShowReadStatus() && !c3to.getDisplayActiveText() && !c3to.getHasUnreadMsg() && !c3to.isShowingTypingStatus() && !c3to.isRecommendedChat() && !z) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final void w0(C3TU c3tu) {
        C3TO c3to = (C3TO) c3tu;
        if (c3to.isBlock()) {
            ImageView imageView = (ImageView) this.LL.getValue();
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (c3to.getHasUnreadMsg()) {
                x0(c3to.getSessionUnreadViewState());
            }
            C76662ze c76662ze = C76662ze.LJLIL;
            String sessionId = c3to.getSessionId();
            c76662ze.getClass();
            C76662ze.LJFF(sessionId, null);
            return;
        }
        if (c3to.isMute()) {
            if (c3to.getHasUnreadMsg()) {
                x0(c3to.getSessionUnreadViewState());
            }
            ImageView imageView2 = (ImageView) this.LJZL.getValue();
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            C76662ze c76662ze2 = C76662ze.LJLIL;
            String sessionId2 = c3to.getSessionId();
            c76662ze2.getClass();
            C76662ze.LJFF(sessionId2, null);
            return;
        }
        if (!c3to.getHasUnreadMsg() || c3to.isRecommendedChat()) {
            return;
        }
        x0(c3to.getSessionUnreadViewState());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final void v0(C3TO c3to, int i) {
        String str;
        String str2;
        String str3;
        if (c3to.getShowCameraIcon()) {
            View view = (View) this.LLIIIL.getValue();
            if (view != null) {
                C17N.LJJLIIIJJI(view);
            }
        } else {
            View view2 = (View) this.LLIIIL.getValue();
            if (view2 != null) {
                C17N.LJJIIJZLJL(view2);
            }
        }
        super.v0(c3to, i);
        this.LLIILZL = i;
        C3L4 LIZJ = C771431a.LIZ().LIZJ(c3to.getSessionId());
        if (LIZJ != null) {
            if (E0() != null) {
                InterfaceC100393wp D0 = D0();
                if (LIZJ.LJIIIIZZ() != 0 && D0 != null) {
                    D0.reset();
                }
            }
            if (E0() != null) {
                InboxSocPubStatusViewModelImpl.jv0(D0(), c3to.getImUser());
            }
        }
        C107724Kq z0 = z0();
        z0.LIZJ = c3to.getUid();
        z0.LJI = Boolean.valueOf(c3to.isActive());
        if (c3to.getPriority() > 0) {
            C119354mJ c119354mJ = (C119354mJ) this.LLII.getValue();
            if (c119354mJ != null) {
                c119354mJ.LIZ(R.attr.cv);
            }
        } else {
            C119354mJ c119354mJ2 = (C119354mJ) this.LLII.getValue();
            if (c119354mJ2 != null) {
                c119354mJ2.LIZ(R.attr.cl);
            }
        }
        ((C1040246k) this.LLIIIILZ.getValue()).LIZJ(c3to.isActive());
        if (c3to.isTCM()) {
            ImageView imageView = (ImageView) this.LLIIII.getValue();
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            ImageView imageView2 = (ImageView) this.LLIIII.getValue();
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        if (c3to.getShowSayHiButton()) {
            if (((Boolean) C96913rD.LIZ.getValue()).booleanValue()) {
                TuxTextView C0 = C0();
                if (C0 != null) {
                    C0.setVisibility(0);
                    C0.setText("👋");
                }
            } else {
                if (c3to.getImUser() != null) {
                    IMUser imUser = c3to.getImUser();
                    if (C3U6.LIZ && B0() != null && !C78966Uyw.LJJIJ().LIZIZ() && imUser.getFollowStatus() == 2) {
                        String uid = imUser.getUid();
                        o.LJIIIIZZ(uid, "imUser.uid");
                        if (!C89263es.LIZLLL(C89263es.LIZ(), uid, true)) {
                            RelationButton B0 = B0();
                            if (B0 != null) {
                                B0.setVisibility(0);
                            }
                            User user = IMUser.toUser(c3to.getImUser());
                            o.LJIIIIZZ(user, "toUser(sessionVO.imUser)");
                            RelationButton B02 = B0();
                            if (B02 != null) {
                                C226668v0 c226668v0 = new C226668v0();
                                c226668v0.LIZ = user;
                                c226668v0.LIZIZ(EnumC112694bZ.MESSAGE_ICE_BREAKING);
                                B02.LLIIIJ.LJJJJJL(c226668v0.LIZ());
                            }
                            RelationButton B03 = B0();
                            if (B03 != null) {
                                B03.setTracker(new AqS151S0100000_1(this, 824));
                            }
                        }
                    }
                }
                RelationButton B04 = B0();
                if (B04 == null) {
                    return;
                }
                B04.setVisibility(8);
                return;
            }
            if (c3to.isRecommendedChat()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            IMSayhiAnalyticsImpl iMSayhiAnalyticsImpl = IMSayhiAnalyticsImpl.LIZ;
            IMUser imUser2 = c3to.getImUser();
            if (imUser2 != null) {
                str2 = imUser2.getUid();
            } else {
                str2 = null;
            }
            OSZ[] oszArr = new OSZ[4];
            oszArr[0] = new OSZ("enter_from", "notification_page");
            oszArr[1] = new OSZ("enter_method", "button");
            IMUser imUser3 = c3to.getImUser();
            if (imUser3 == null || (str3 = Integer.valueOf(imUser3.getFollowStatus()).toString()) == null) {
                str3 = "";
            }
            oszArr[2] = new OSZ("relation_tag", str3);
            oszArr[3] = new OSZ("is_recommended_chat", str);
            Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            iMSayhiAnalyticsImpl.LIZ(str2, LJJLIIIIJ, C57434MgQ.LIZIZ(context), false);
            return;
        }
        TuxTextView C02 = C0();
        if (C02 == null) {
            return;
        }
        C02.setVisibility(8);
    }
}
