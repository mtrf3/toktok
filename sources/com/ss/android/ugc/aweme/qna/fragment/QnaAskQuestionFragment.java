package com.ss.android.ugc.aweme.qna.fragment;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C10A;
import X.C118874lX;
import X.C118884lY;
import X.C119184m2;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C188727au;
import X.C19K;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26045AKb;
import X.C268713r;
import X.C29S;
import X.C2NU;
import X.C32151Nz;
import X.C33Q;
import X.C38350F3i;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C5H3;
import X.C5S1;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8YZ;
import X.C90183gM;
import X.C90193gN;
import X.C90903hW;
import X.C99W;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.CK3;
import X.EnumC118964lg;
import X.FMX;
import X.GE3;
import X.HG3;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC228778yP;
import X.InterfaceC61213O0r;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.J9P;
import X.KPL;
import X.O6R;
import X.OJD;
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.RBX;
import X.SY4;
import X.T73;
import X.TBT;
import X.TBW;
import X.X1D;
import Y.ACListenerS21S0100000_1;
import Y.ARunnableS12S0300000_1;
import Y.ARunnableS2S1100000_1;
import Y.ARunnableS7S0110000_1;
import Y.AfS50S0200000_1;
import Y.AfS53S0100000_1;
import Y.IDObjectS174S0100000_1;
import Y.IDgS346S0100000_1;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment;
import com.ss.android.ugc.aweme.qna.model.AskQuestionParam;
import com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import defpackage.s1;
import defpackage.t1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC61213O0r
/* loaded from: classes2.dex */
public class QnaAskQuestionFragment extends BaseFragment implements InterfaceC228778yP, KPL {
    public final C214298b3 LJLJI;
    public final IQAInvitationService LJLJJI;
    public List<? extends User> LJLJJL;
    public List<? extends IMUser> LJLJJLL;
    public boolean LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 693));

    public String Dl() {
        return "";
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC228778yP
    public final /* synthetic */ void onHide() {
    }

    public QnaAskQuestionFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(QnaCreationViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 695);
        C118874lX c118874lX = C118874lX.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c118874lX, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c118874lX, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b3;
        IQAInvitationService LJI = QAInvitationService.LJI();
        o.LJIIIIZZ(LJI, "get().getService(IQAInvitationService::class.java)");
        this.LJLJJI = LJI;
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new ArrayList();
    }

    public final QnaCreationViewModel Al() {
        return (QnaCreationViewModel) this.LJLJI.getValue();
    }

    public final void wl() {
        ArrayList arrayList;
        List<? extends IMUser> list = this.LJLJJLL;
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (IMUser iMUser : list) {
                if (!o.LJ(iMUser.getUid(), HG3.LJIILL().getCurUserId())) {
                    arrayList.add(iMUser);
                }
            }
        } else {
            arrayList = null;
        }
        this.LJLJJLL = arrayList;
        List<? extends User> list2 = this.LJLJJL;
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (User user : list2) {
                if (!o.LJ(user.getUid(), HG3.LJIILL().getCurUserId())) {
                    arrayList2.add(user);
                }
            }
        }
        this.LJLJJL = arrayList2;
        Nl(arrayList2);
    }

    public final AskQuestionParam xl() {
        return (AskQuestionParam) this.LJLILLLLZI.getValue();
    }

    public void Gl() {
        Kl();
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.a8u);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(this, 113));
        }
        SY4 sy42 = (SY4) _$_findCachedViewById(R.id.a8t);
        if (sy42 != null) {
            C16880lQ.LJJIZ(sy42, new ACListenerS21S0100000_1(this, 114));
        }
        if (C99W.LIZ) {
            _$_findCachedViewById(R.id.a8t).getClass();
            _$_findCachedViewById(R.id.a8u).getClass();
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.a8v);
        if (textView != null) {
            textView.setRawInputType(1);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.a8v);
        if (textView2 != null) {
            textView2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.4lc
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i, KeyEvent keyEvent) {
                    if (i == 6 && QnaAskQuestionFragment.this._$_findCachedViewById(R.id.a8t).isEnabled() && QnaAskQuestionFragment.this._$_findCachedViewById(R.id.a8t).isClickable()) {
                        QnaAskQuestionFragment.this.Ol(new C118934ld(QnaAskQuestionFragment.this));
                        return true;
                    }
                    return false;
                }
            });
        }
        TextView textView3 = (TextView) _$_findCachedViewById(R.id.a8v);
        if (textView3 != null) {
            textView3.addTextChangedListener(new IDObjectS174S0100000_1(this, 6));
        }
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.a8x), new ACListenerS21S0100000_1(this, 115));
        Jl(false);
        Hl(100, true);
    }

    public final void Il() {
        String str;
        String enterMethod;
        C19K c19k = (C19K) _$_findCachedViewById(R.id.a8v);
        if (c19k != null) {
            c19k.getContext();
            if (C2NU.LIZ.LIZIZ()) {
                String str2 = "";
                if (!((RBX) HG3.LJIILL()).isLogin()) {
                    AskQuestionParam askQuestionParam = (AskQuestionParam) this.LJLIL.getValue();
                    if (askQuestionParam == null || (str = askQuestionParam.getEnterFrom()) == null) {
                        str = "";
                    }
                    AskQuestionParam askQuestionParam2 = (AskQuestionParam) this.LJLIL.getValue();
                    if (askQuestionParam2 != null && (enterMethod = askQuestionParam2.getEnterMethod()) != null) {
                        str2 = enterMethod;
                    }
                    J9P.LIZJ(this, str, str2, null, new IDgS346S0100000_1(this, 0));
                    return;
                }
                SY4 sy4 = (SY4) _$_findCachedViewById(R.id.a8t);
                if (sy4 != null) {
                    sy4.setLoading(true);
                }
                View _$_findCachedViewById = _$_findCachedViewById(R.id.a8t);
                if (_$_findCachedViewById != null) {
                    _$_findCachedViewById.setClickable(false);
                }
                View _$_findCachedViewById2 = _$_findCachedViewById(R.id.a8u);
                if (_$_findCachedViewById2 != null) {
                    _$_findCachedViewById2.setClickable(false);
                }
                View _$_findCachedViewById3 = _$_findCachedViewById(R.id.a8x);
                if (_$_findCachedViewById3 != null) {
                    _$_findCachedViewById3.setClickable(false);
                }
                String valueOf = String.valueOf(c19k.getText());
                wl();
                if (s.LJZI(new OJD("(?m)^[ \t]*\r?\n").replace(valueOf, "")).toString().length() == 0) {
                    Jl(true);
                    return;
                }
                QnaCreationViewModel Al = Al();
                CharSequence s = s.LJZI(valueOf);
                List<? extends User> list = this.LJLJJL;
                String enterFrom = xl().getEnterFrom();
                if (enterFrom != null) {
                    str2 = enterFrom;
                }
                Al.getClass();
                o.LJIIIZ(s, "s");
                ((AssemViewModel) Al.LJLILLLLZI.getValue()).setState(T73.LJLIL);
                Al.setState(C118884lY.LJLIL);
                try {
                    String invitedUsersString = QnaCreationViewModel.jv0(list);
                    C119184m2 c119184m2 = Al.LJLIL.LIZIZ;
                    String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                    o.LJIIIIZZ(curUserId, "userService().curUserId");
                    Long LJJIZ = C38350F3i.LJJIZ(curUserId);
                    String charSequence = s.toString();
                    o.LJIIIIZZ(invitedUsersString, "invitedUsersString");
                    Al.disposeOnClear(c119184m2.LJJJLL(charSequence, invitedUsersString, LJJIZ, str2, Al.LJLJI).LJJJLIIL(new AfS50S0200000_1(list, Al, 7), new AfS53S0100000_1(Al, 72)));
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
            C5S1 c5s1 = new C5S1(c19k.getContext());
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
        }
    }

    public void Kl() {
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.a8z);
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS151S0100000_1(this, 694));
            C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
            String string = requireContext().getString(R.string.pnj);
            o.LJIIIIZZ(string, "requireContext().getStri…qa_text_halfscreen_title)");
            LIZLLL.LIZJ = string;
            c235119Kp.LIZJ = LIZLLL;
            c235119Kp.LIZLLL = true;
            c252709vu.setNavActions(c235119Kp);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Integer num;
        QnaCreationViewModel Al = Al();
        Al.getClass();
        String enterFrom = Al.getEnterFrom();
        EnumC118964lg value = Al.LJLLILLLL.getValue();
        if (value != null) {
            num = value.getEt();
        } else {
            num = null;
        }
        List LLJI = ORZ.LLJI(Al.LJLLI);
        C188727au LIZ = CK3.LIZ("enter_from", enterFrom);
        if (num != null) {
            LIZ.LIZLLL(num.intValue(), "last_helper_notes");
        }
        LIZ.LJFF(LLJI, "category_show_list");
        FMX.LJIIL("exit_qa_text_ask_page", LIZ.LIZ);
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Jl(false);
        Hl(100, true);
    }

    @Override // X.InterfaceC228778yP
    public final void onShow() {
        ArrayList<User> invitedUsers;
        User user;
        ArrayList<User> invitedUsers2 = xl().getInvitedUsers();
        if (invitedUsers2 != null && !invitedUsers2.isEmpty()) {
            Keva repo = Keva.getRepo("question_repo");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ask_question_invite_message_show");
            if (C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, true) && (invitedUsers = xl().getInvitedUsers()) != null && (user = (User) ListProtector.get(invitedUsers, 0)) != null) {
                C90183gM invite_multi_avatar_view = (C90183gM) _$_findCachedViewById(R.id.es9);
                o.LJIIIIZZ(invite_multi_avatar_view, "invite_multi_avatar_view");
                invite_multi_avatar_view.postDelayed(new ARunnableS12S0300000_1(this, user, invite_multi_avatar_view, 0), 300L);
                Keva repo2 = Keva.getRepo("question_repo");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ask_question_invite_message_show");
                LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
                repo2.storeBoolean(X1D.LIZIZ(LIZ2), false);
            }
        }
    }

    public final void Jl(boolean z) {
        Integer num;
        int i;
        int i2;
        Editable text;
        C19K c19k = (C19K) _$_findCachedViewById(R.id.a8v);
        if (c19k != null && (text = c19k.getText()) != null) {
            num = Integer.valueOf(text.length());
        } else {
            num = null;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Ml(i);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        Ll(i2);
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.a8t);
        if (sy4 != null) {
            sy4.setLoading(false);
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.a8t);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setClickable(true);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.a8u);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setClickable(true);
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.a8x);
        if (_$_findCachedViewById3 != null) {
            _$_findCachedViewById3.setClickable(true);
        }
        if (z) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.pnl);
            c26045AKb.LJIIJ();
        }
    }

    public final void Ll(int i) {
        ForegroundColorSpan foregroundColorSpan;
        Resources resources;
        Resources resources2;
        Resources resources3;
        ForegroundColorSpan foregroundColorSpan2;
        Resources resources4;
        Resources resources5;
        ForegroundColorSpan foregroundColorSpan3;
        Resources resources6;
        String valueOf = String.valueOf(i);
        ForegroundColorSpan foregroundColorSpan4 = null;
        if (!C90193gN.LIZIZ(getContext())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i0.LJFF(valueOf, "/150"));
            if (i > 150 || i < 1) {
                Context context = getContext();
                if (context != null && (resources4 = context.getResources()) != null) {
                    foregroundColorSpan2 = new ForegroundColorSpan(resources4.getColor(R.color.q0));
                } else {
                    foregroundColorSpan2 = null;
                }
                spannableStringBuilder.setSpan(foregroundColorSpan2, 0, valueOf.length(), 18);
            } else {
                Context context2 = getContext();
                if (context2 != null && (resources6 = context2.getResources()) != null) {
                    foregroundColorSpan3 = new ForegroundColorSpan(resources6.getColor(R.color.cu));
                } else {
                    foregroundColorSpan3 = null;
                }
                spannableStringBuilder.setSpan(foregroundColorSpan3, 0, valueOf.length(), 18);
            }
            Context context3 = getContext();
            if (context3 != null && (resources5 = context3.getResources()) != null) {
                foregroundColorSpan4 = new ForegroundColorSpan(resources5.getColor(R.color.cu));
            }
            spannableStringBuilder.setSpan(foregroundColorSpan4, valueOf.length(), spannableStringBuilder.length(), 18);
            TextView textView = (TextView) _$_findCachedViewById(R.id.a8r);
            if (textView == null) {
                return;
            }
            textView.setText(spannableStringBuilder);
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(i0.LJFF("150/", valueOf));
        Context context4 = getContext();
        if (context4 != null && (resources3 = context4.getResources()) != null) {
            foregroundColorSpan = new ForegroundColorSpan(resources3.getColor(R.color.cu));
        } else {
            foregroundColorSpan = null;
        }
        spannableStringBuilder2.setSpan(foregroundColorSpan, 0, 4, 18);
        if (i > 150 || i < 1) {
            Context context5 = getContext();
            if (context5 != null && (resources = context5.getResources()) != null) {
                foregroundColorSpan4 = new ForegroundColorSpan(resources.getColor(R.color.q0));
            }
            spannableStringBuilder2.setSpan(foregroundColorSpan4, 4, spannableStringBuilder2.length(), 18);
        } else {
            Context context6 = getContext();
            if (context6 != null && (resources2 = context6.getResources()) != null) {
                foregroundColorSpan4 = new ForegroundColorSpan(resources2.getColor(R.color.cu));
            }
            spannableStringBuilder2.setSpan(foregroundColorSpan4, 4, spannableStringBuilder2.length(), 18);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.a8r);
        if (textView2 == null) {
            return;
        }
        textView2.setText(spannableStringBuilder2);
    }

    public final void Ml(int i) {
        boolean z;
        int i2 = 0;
        if (1 <= i && i < 6) {
            z = true;
        } else {
            z = false;
        }
        int i3 = 8;
        if (z) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.a8r);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(8);
            }
            SY4 sy4 = (SY4) _$_findCachedViewById(R.id.a8u);
            if (sy4 != null) {
                sy4.setEnabled(true);
            }
            SY4 sy42 = (SY4) _$_findCachedViewById(R.id.a8u);
            if (sy42 != null) {
                sy42.setIconTintColorRes(R.attr.go);
            }
            SY4 sy43 = (SY4) _$_findCachedViewById(R.id.a8t);
            if (sy43 == null) {
                return;
            }
            sy43.setEnabled(false);
            return;
        }
        if (5 <= i && i < 151) {
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.a8r);
            if (_$_findCachedViewById2 != null) {
                if (i < 130) {
                    i2 = 8;
                }
                _$_findCachedViewById2.setVisibility(i2);
            }
            SY4 sy44 = (SY4) _$_findCachedViewById(R.id.a8u);
            if (sy44 != null) {
                sy44.setEnabled(true);
            }
            SY4 sy45 = (SY4) _$_findCachedViewById(R.id.a8u);
            if (sy45 != null) {
                sy45.setIconTintColorRes(R.attr.go);
            }
            SY4 sy46 = (SY4) _$_findCachedViewById(R.id.a8t);
            if (sy46 == null) {
                return;
            }
            sy46.setEnabled(this.LJLJL);
            return;
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.a8r);
        if (_$_findCachedViewById3 != null) {
            if (i != 0) {
                i3 = 0;
            }
            _$_findCachedViewById3.setVisibility(i3);
        }
        SY4 sy47 = (SY4) _$_findCachedViewById(R.id.a8u);
        if (sy47 != null) {
            sy47.setEnabled(false);
        }
        SY4 sy48 = (SY4) _$_findCachedViewById(R.id.a8u);
        if (sy48 != null) {
            sy48.setIconTintColorRes(R.attr.gp);
        }
        SY4 sy49 = (SY4) _$_findCachedViewById(R.id.a8t);
        if (sy49 == null) {
            return;
        }
        sy49.setEnabled(false);
    }

    public final void Nl(List<? extends User> list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.es9);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(8);
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.esb);
            if (_$_findCachedViewById2 == null) {
                return;
            }
            _$_findCachedViewById2.setVisibility(0);
            return;
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.es9);
        if (_$_findCachedViewById3 != null) {
            _$_findCachedViewById3.setVisibility(0);
        }
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.esb);
        if (_$_findCachedViewById4 != null) {
            _$_findCachedViewById4.setVisibility(8);
        }
        C90183gM c90183gM = (C90183gM) _$_findCachedViewById(R.id.es9);
        if (c90183gM != null) {
            c90183gM.LIZJ(AnonymousClass391.LIZ(24.0d), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(13.5d))));
        }
        C90183gM c90183gM2 = (C90183gM) _$_findCachedViewById(R.id.es9);
        if (c90183gM2 == null) {
            return;
        }
        c90183gM2.LIZ(list.size(), list);
    }

    public final void Ol(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                String enterFrom = xl().getEnterFrom();
                String str = "";
                if (enterFrom == null) {
                    enterFrom = "";
                }
                String enterMethod = xl().getEnterMethod();
                if (enterMethod != null) {
                    str = enterMethod;
                }
                J9P.LIZIZ(mo49getActivity, enterFrom, str, null, new IDgS346S0100000_1(interfaceC65784Pro, 1));
                return;
            }
            return;
        }
        interfaceC65784Pro.invoke();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        fragmentConfiguration(GE3.LJLIL);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
    }

    public void vl(String currentText) {
        o.LJIIIZ(currentText, "currentText");
        Ml(s.LJZI(currentText).toString().length());
        Ll(s.LJZI(currentText).toString().length());
    }

    public final void Hl(int i, boolean z) {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.a8v);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.postDelayed(new ARunnableS7S0110000_1(this, z, 0), i);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Gl();
        AskQuestionParam navParams = xl();
        o.LJIIIZ(navParams, "navParams");
        String enterFrom = navParams.getEnterFrom();
        String enterMethod = navParams.getEnterMethod();
        C188727au c188727au = new C188727au();
        if (enterFrom != null) {
            c188727au.LJI("enter_from", enterFrom);
        }
        if (enterMethod != null) {
            c188727au.LJI("enter_method", enterMethod);
        }
        FMX.LJIIL("ask_question", c188727au.LIZ);
        QnaCreationViewModel Al = Al();
        String enterFrom2 = navParams.getEnterFrom();
        String str = "";
        if (enterFrom2 == null) {
            enterFrom2 = "";
        }
        Al.getClass();
        Al.LJLJJI = enterFrom2;
        QnaCreationViewModel Al2 = Al();
        String enterMethod2 = navParams.getEnterMethod();
        if (enterMethod2 != null) {
            str = enterMethod2;
        }
        Al2.getClass();
        Al2.LJLJJL = str;
        String question = navParams.getQuestion();
        int i = 0;
        if (question != null && question.length() > 0 && question.length() <= 150) {
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.a8v);
            if (textView2 != null) {
                textView2.setText(question);
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.a8v);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.post(new ARunnableS2S1100000_1(this, question, 1));
            }
            this.LJLJL = true;
        }
        ArrayList<User> invitedUsers = navParams.getInvitedUsers();
        if (invitedUsers != null && (!invitedUsers.isEmpty())) {
            this.LJLJJL = invitedUsers;
            this.LJLJJLL = this.LJLJJI.LJ(invitedUsers);
        }
        String bannerText = navParams.getBannerText();
        if (bannerText != null && bannerText.length() > 0 && (textView = (TextView) _$_findCachedViewById(R.id.a8o)) != null) {
            textView.setText(bannerText);
        }
        if (navParams.getBannerShow()) {
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.a8p);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setVisibility(0);
            }
        } else {
            String bannerText2 = navParams.getBannerText();
            if (bannerText2 == null || bannerText2.length() == 0) {
                Keva repo = Keva.getRepo("question_repo");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ask_question_banner_message_show");
                if (C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, true)) {
                    Keva repo2 = Keva.getRepo("question_repo");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("ask_question_banner_message_show");
                    LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
                    repo2.storeBoolean(X1D.LIZIZ(LIZ2), false);
                    View _$_findCachedViewById3 = _$_findCachedViewById(R.id.a8p);
                    if (_$_findCachedViewById3 != null) {
                        _$_findCachedViewById3.setVisibility(0);
                    }
                }
            }
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.a8p);
            if (_$_findCachedViewById4 != null) {
                _$_findCachedViewById4.setVisibility(8);
            }
        }
        View _$_findCachedViewById5 = _$_findCachedViewById(R.id.a8u);
        if (_$_findCachedViewById5 != null) {
            if (!navParams.getRecordShow()) {
                i = 8;
            }
            _$_findCachedViewById5.setVisibility(i);
        }
        if (navParams.getAutoInvite()) {
            _$_findCachedViewById(R.id.a8x).callOnClick();
        }
        Nl(this.LJLJJL);
        AssemViewModel.asyncSubscribe$default(Al(), new TBT() { // from class: X.4lZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C118904la) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS167S0100000_1(this, 25), null, new AqS167S0100000_1(this, 26), 8, null);
        KeyboardUtils.LIZ(this, getView(), this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c_b, viewGroup, false);
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

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
