package com.ss.android.ugc.now.interaction.assem;

import X.AnonymousClass729;
import X.C16880lQ;
import X.C1789170l;
import X.C1790370x;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C224738rt;
import X.C2K0;
import X.C62562cu;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71799SFv;
import X.C71Y;
import X.C73G;
import X.C78886Uxe;
import X.C78926UyI;
import X.C8VV;
import X.C8YN;
import X.C9BD;
import X.InterfaceC55102Lju;
import X.TBT;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS5S0210000_3;
import Y.IDObjectS176S0100000_3;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.BaseNowKeyboardInputAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class NowKeyboardInputAssem extends BaseNowKeyboardInputAssem implements InterfaceC55102Lju {
    public static final /* synthetic */ int LJZL = 0;
    public C73G LJLJLLL;
    public final C214298b3 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public String LJLLLLLL;
    public Comment LJLZ;
    public String LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1684082298) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.INowKeyboardInputPanelAssemAbility
    public final void r1() {
        L3(false);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.qr;
    }

    public NowKeyboardInputAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NowKeyboardVM.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 1393), C1789170l.INSTANCE, null);
        this.LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1391));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1392));
        this.LJLLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1390));
        this.LJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1389));
        this.LJLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1388));
    }

    public final C224738rt H3() {
        Object value = this.LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-editTextComment>(...)");
        return (C224738rt) value;
    }

    public final C73G I3() {
        C73G c73g = this.LJLJLLL;
        if (c73g == null) {
            return C63081OpJ.LJJII(this);
        }
        return c73g;
    }

    public final NowKeyboardVM K3() {
        return (NowKeyboardVM) this.LJLL.getValue();
    }

    public final void M3() {
        String str;
        H3().setFocusableInTouchMode(true);
        H3().setFocusable(true);
        Boolean valueOf = Boolean.valueOf(H3().requestFocus());
        if (!o.LJ(valueOf, Boolean.TRUE)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("input request edit focus failed, visible=");
            LIZ.append(Integer.valueOf(H3().getVisibility()));
            LIZ.append(", enable=");
            LIZ.append(Boolean.valueOf(H3().isEnabled()));
            LIZ.append(", focusable=");
            LIZ.append(Boolean.valueOf(H3().isFocusable()));
            LIZ.append(", focusableInTouch=");
            LIZ.append(Boolean.valueOf(H3().isFocusableInTouchMode()));
            str = X1D.LIZIZ(LIZ);
        } else {
            str = "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BaseKeyboardPanel: reqFocusRes=");
        LIZ2.append(valueOf);
        LIZ2.append("  msg===> ");
        LIZ2.append(str);
        C71Y.LIZLLL("CommentInputAssem", X1D.LIZIZ(LIZ2));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.INowKeyboardInputPanelAssemAbility
    public final C224738rt U1() {
        return H3();
    }

    public final void L3(boolean z) {
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("openSoftInput  ");
        LIZ.append(z);
        C71Y.LIZLLL("CommentInputAssem", X1D.LIZIZ(LIZ));
        C224738rt H3 = H3();
        if (z) {
            j = 30;
        } else {
            j = 0;
        }
        H3.postDelayed(new ARunnableS5S0210000_3(this, H3, z, 2), j);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.INowKeyboardInputPanelAssemAbility
    public final void LLJJIJI(C73G c73g) {
        this.LJLJLLL = c73g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        o.LJIIIZ(view, "view");
        C62562cu LIZ = AnonymousClass729.LIZ(AccountService.LJIJ().LJFF().getCurUser());
        if (LIZ != null) {
            Object value = this.LJLLI.getValue();
            o.LJIIIIZZ(value, "<get-ivAvatar>(...)");
            C71799SFv.LJIIJ((C71799SFv) value, LIZ, null, false, null, 110);
        }
        Object value2 = this.LJLLJ.getValue();
        o.LJIIIIZZ(value2, "<get-ivAt>(...)");
        View view2 = (View) value2;
        if (C1790370x.LIZ()) {
            i = 0;
        } else {
            i = 8;
        }
        view2.setVisibility(i);
        C224738rt H3 = H3();
        Context context = H3().getContext();
        o.LJIIIIZZ(context, "editTextComment.context");
        H3.setMentionTextColor(C78886Uxe.LJJIFFI(R.attr.go, R.color.ck, context));
        H3().setMentionTextTypeface(1);
        H3().addTextChangedListener(new IDObjectS176S0100000_3(this, 12));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("TAGc  panelType  ");
        LIZ2.append(K3());
        C71Y.LIZ("CommentInputAssem", X1D.LIZIZ(LIZ2));
        C8YN.LJII(this, K3(), new TBT() { // from class: X.70d
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLJJI;
            }
        }, null, new AqS185S0100000_3(this, 183), 6);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.70n
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLLLL;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 186), 4);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.6zE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C178336zF) obj).LJLJL);
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 189), 4);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.6zG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C178336zF) obj).LJLLJ);
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 173), 4);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.70m
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLJLLL;
            }
        }, null, new AqS185S0100000_3(this, 176), 6);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.70L
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLLLLLL;
            }
        }, null, new AqS185S0100000_3(this, 178), 6);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.70p
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLZ;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 179), 4);
        Object value3 = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value3, "<get-ivSend>(...)");
        C16880lQ.LJIILJJIL((FrameLayout) value3, new ACListenerS23S0100000_3(this, 225));
        Object value4 = this.LJLLJ.getValue();
        o.LJIIIIZZ(value4, "<get-ivAt>(...)");
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 226), (View) value4);
        C8VV.LIZJ(this, new AqS169S0100000_3(this, 601));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.INowKeyboardInputPanelAssemAbility
    public final void yz(Editable editable) {
        H3().setText(editable);
        H3().requestLayout();
    }
}
