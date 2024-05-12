package com.ss.android.ugc.aweme.profile.editprofile.pronouns.ui;

import X.AnonymousClass898;
import X.C025908h;
import X.C214298b3;
import X.C221108m2;
import X.C2318097w;
import X.C234569Im;
import X.C26045AKb;
import X.C44384HbQ;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72062SPy;
import X.C72808Sho;
import X.C73318Sq2;
import X.C73849Syb;
import X.C73969T1h;
import X.C78926UyI;
import X.C78999UzT;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.C9BR;
import X.C9GP;
import X.C9HM;
import X.C9QI;
import X.C9QJ;
import X.C9QO;
import X.C9QP;
import X.C9QQ;
import X.C9QR;
import X.InterfaceC198557ql;
import X.InterfaceC57784Mm4;
import X.InterfaceC64592gB;
import X.ORS;
import X.ORZ;
import X.SYL;
import X.TBT;
import Y.AfS56S0100000_4;
import Y.IDObjectS177S0100000_4;
import Y.IDrS44S0100000_4;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.api.ProfileEditPronounsParams;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist.PronounCell;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class ProfileEditPronounsSearchAndDisplayAssem extends UIContentAssem implements C9BR {
    public static final C9QP LJLLJ = new Object() { // from class: X.9QP
    };
    public boolean LJLL;
    public final C214298b3 LJLLI;
    public Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C5H3 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 686));
    public final C5H3 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 685));
    public final C5H3 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 684));
    public final C5H3 LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 683));
    public final C5H3 LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 681));
    public final C5H3 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 682));
    public final C5H3 LJLJL = C221108m2.LIZIZ(C9HM.LJLIL);
    public final C5H3 LJLJLJ = C221108m2.LIZIZ(C234569Im.LJLIL);
    public final C55749LuL LJLJLLL = new C55749LuL(C47704Ins.LJ(this, C9GP.class, null), checkSupervisorPrepared());

    private final void l4() {
        C8YN.LJII(this, W3(), new TBT() { // from class: X.97v
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92R) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 173), 6);
    }

    public void _$_clearFindViewByIdCache() {
        this.LJLLILLLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLILLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C9BR, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public ProfileEditPronounsSearchAndDisplayAssem() {
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 688);
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileEditPronounsSearchAndDisplayViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 687), C2318097w.INSTANCE, aqS154S0100000_4);
    }

    private final C73318Sq2 K3() {
        return (C73318Sq2) this.LJLJLJ.getValue();
    }

    private final View L3() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-displayEmptyView>(...)");
        return (View) value;
    }

    private final TuxTextView M3() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-displayEmptyViewSecondLine>(...)");
        return (TuxTextView) value;
    }

    private final SYL N3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-displayList>(...)");
        return (SYL) value;
    }

    private final TuxTextView P3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-headerDesc>(...)");
        return (TuxTextView) value;
    }

    private final View Q3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-headerView>(...)");
        return (View) value;
    }

    private final C9GP R3() {
        return (C9GP) this.LJLJLLL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9QQ] */
    @Override // X.C8VB
    /* renamed from: H3, reason: merged with bridge method [inline-methods] */
    public C9QQ defaultObservableData() {
        return new InterfaceC198557ql() { // from class: X.9QQ
        };
    }

    public final C73849Syb<String> I3() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-behaviorSubject>(...)");
        return (C73849Syb) value;
    }

    public final C9QI O3() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-editText>(...)");
        return (C9QI) value;
    }

    public final ProfileEditPronounsSearchAndDisplayViewModel W3() {
        return (ProfileEditPronounsSearchAndDisplayViewModel) this.LJLLI.getValue();
    }

    private final void A3() {
        N3().LJIIJJI(new IDrS44S0100000_4(this, 4));
    }

    private final void C3() {
        O3().addTextChangedListener(new IDObjectS177S0100000_4(this, 7));
    }

    private final void X3() {
        C78999UzT.LJFF(I3().LJJJJLI(300L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 53), new InterfaceC64592gB() { // from class: X.9Ku
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }), K3());
    }

    private final void Y3() {
        Context context = getContext();
        if (context != null) {
            M3().setMovementMethod(AnonymousClass898.LIZ);
            String string = context.getString(R.string.h8w);
            o.LJIIIIZZ(string, "getString(R.string.im_search_empty2)");
            String string2 = context.getString(R.string.h8x);
            o.LJIIIIZZ(string2, "getString(R.string.im_search_empty3)");
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) string);
            C72062SPy c72062SPy = new C72062SPy();
            c72062SPy.LIZIZ = string2;
            c72062SPy.LIZ = false;
            c72062SPy.LJ(1);
            c72062SPy.LIZIZ(42);
            c72062SPy.LJFF = new AqS151S0200000_4(this, context, 15);
            append.append((CharSequence) " ").append(c72062SPy.LIZ(context));
            M3().setText(append);
        }
    }

    private final void Z3() {
        a4();
        x3();
    }

    private final void a4() {
        C9QI O3 = O3();
        Editable text = O3.getText();
        if (text != null) {
            O3().setSelection(text.length());
        }
        O3.setFocusable(true);
        O3.setFocusableInTouchMode(true);
        O3.requestFocus();
        O3.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.9QN
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return true;
            }
        });
        O3.setLongClickable(false);
        O3.setTextIsSelectable(false);
        O3.setMovementMethod(new BaseMovementMethod() { // from class: X.89B
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
            public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
                Integer valueOf;
                if (textView == null || spannable == null) {
                    return super.onTouchEvent(textView, spannable, motionEvent);
                }
                if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null && (valueOf.intValue() == 1 || valueOf.intValue() == 0)) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                    int totalPaddingTop = y - textView.getTotalPaddingTop();
                    int scrollX = textView.getScrollX() + totalPaddingLeft;
                    int scrollY = textView.getScrollY() + totalPaddingTop;
                    Layout layout = textView.getLayout();
                    if (layout == null) {
                        return super.onTouchEvent(textView, spannable, motionEvent);
                    }
                    int lineForVertical = layout.getLineForVertical(scrollY);
                    float f = scrollX;
                    int LLLLLLL = C16880lQ.LLLLLLL(layout, lineForVertical, f);
                    if (layout.getPrimaryHorizontal(LLLLLLL) > f) {
                        LLLLLLL--;
                    }
                    if (layout.getLineRight(lineForVertical) <= f) {
                        return true;
                    }
                    ClickableSpan[] links = (ClickableSpan[]) spannable.getSpans(LLLLLLL, LLLLLLL + 1, ClickableSpan.class);
                    o.LJIIIIZZ(links, "links");
                    boolean z = false;
                    if (links.length == 0) {
                        Selection.removeSelection(spannable);
                    } else {
                        C101273yF c101273yF = links[0];
                        if (c101273yF instanceof C89A) {
                            int intValue = valueOf.intValue();
                            if (intValue != 0) {
                                if (intValue == 1) {
                                    ((C89A) c101273yF).LIZ(textView, spannable);
                                }
                            } else {
                                ((C89A) c101273yF).LIZIZ(textView, spannable);
                            }
                            z = true;
                        }
                        if (valueOf.intValue() == 1) {
                            c101273yF.onClick(textView);
                        }
                        if (z) {
                            textView.invalidate();
                        }
                        return true;
                    }
                }
                return super.onTouchEvent(textView, spannable, motionEvent);
            }
        });
    }

    private final void b4() {
        Context context = getContext();
        if (context != null) {
            TuxTextView P3 = P3();
            String string = context.getString(R.string.pi0);
            o.LJIIIIZZ(string, "getString(R.string.pronoun_disc)");
            C025908h.LJ(new Object[]{Integer.valueOf(W3().LJLJJL)}, 1, string, "format(format, *args)", P3);
        }
    }

    private final void c4() {
        SYL N3 = N3();
        N3.LLLF.LJZL(PronounCell.class);
        N3.setLifecycleOwner(this);
        N3.setItemAnimator(null);
        A3();
    }

    private final void e4() {
        g4();
        k4();
        l4();
    }

    private final void g4() {
        int i;
        ProfileEditPronounsSearchAndDisplayViewModel W3 = W3();
        W3.getClass();
        C9QJ.LIZ.getClass();
        ProfileEditPronounsParams profileEditPronounsParams = (ProfileEditPronounsParams) C9QJ.LIZJ.getValue();
        Integer num = profileEditPronounsParams.maxPronounsNum;
        if (num != null) {
            i = num.intValue();
        } else {
            i = W3.LJLJJL;
        }
        W3.LJLJJL = i;
        List<String> list = profileEditPronounsParams.pronounsList;
        if (list == null) {
            list = W3.LJLJJI;
        }
        W3.LJLJJI = list;
    }

    private final void k4() {
        String str;
        Context context = getContext();
        if (context != null) {
            ProfileEditPronounsSearchAndDisplayViewModel W3 = W3();
            C9GP R3 = R3();
            if (R3 == null || (str = R3.LJLILLLLZI) == null) {
                str = "";
            }
            W3.getClass();
            if (o.LJ(str, "")) {
                return;
            }
            W3.iv0(context, s.LJLJJL(str, new String[]{"/"}, 0, 6));
        }
    }

    private final void v3() {
        O3().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.9QM
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                    return false;
                }
                return true;
            }
        });
    }

    private final void x3() {
        v3();
        C3();
        O3().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.9QL
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    KeyboardUtils.LIZLLL(view);
                } else {
                    KeyboardUtils.LIZIZ(view);
                }
            }
        });
    }

    public final void E3() {
        String str;
        ProfileEditPronounsSearchAndDisplayViewModel W3 = W3();
        C9GP R3 = R3();
        if (R3 != null) {
            str = R3.LJLILLLLZI;
        } else {
            str = null;
        }
        boolean LJ = o.LJ(ORZ.LLD(W3.LJLILLLLZI, "/", null, null, null, 62), str);
        boolean z = true;
        if (!LJ) {
            ((C9QO) C8VC.LIZ(this, C65352Pkq.LIZ(C9QO.class), null)).LJJIIJZLJL();
        } else {
            ((C9QO) C8VC.LIZ(this, C65352Pkq.LIZ(C9QO.class), null)).LJJJI();
            z = false;
        }
        this.LJLL = z;
    }

    @Override // X.C9BR
    public String G3() {
        ProfileEditPronounsSearchAndDisplayViewModel W3 = W3();
        if (((ArrayList) W3.LJLILLLLZI).isEmpty()) {
            return "";
        }
        return ORZ.LLD(W3.LJLILLLLZI, ",", null, null, null, 62);
    }

    public final boolean m4() {
        ProfileEditPronounsSearchAndDisplayViewModel W3 = W3();
        C9QI editText = O3();
        W3.getClass();
        o.LJIIIZ(editText, "editText");
        if (W3.LJLIL.length() == W3.LJLJJL && W3.hv0(editText, W3.LJLIL.length())) {
            O3().setCursorVisible(false);
            q4(0);
            return true;
        }
        ProfileEditPronounsSearchAndDisplayViewModel W32 = W3();
        C9QI editText2 = O3();
        W32.getClass();
        o.LJIIIZ(editText2, "editText");
        if (!W32.hv0(editText2, W32.LJLIL.length() + 20)) {
            return false;
        }
        q4(1);
        return true;
    }

    public final void n4() {
        L3().setVisibility(8);
        N3().setVisibility(8);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        K3().dispose();
        super.onDestroy();
    }

    @Override // X.C9BR
    public boolean fh() {
        return this.LJLL;
    }

    private final void q4(int i) {
        int i2;
        if (i != 0) {
            if (i != 1) {
                i2 = R.string.im9;
            } else {
                i2 = R.string.i22;
            }
        } else {
            i2 = R.string.pi4;
        }
        C26045AKb c26045AKb = new C26045AKb(getContainerView());
        c26045AKb.LJIIIIZZ(i2);
        c26045AKb.LJIIJ();
    }

    @Override // X.C9BR
    public void Bd(int i) {
        int i2;
        boolean z;
        ProfileEditPronounsSearchAndDisplayViewModel W3 = W3();
        C9QI editText = O3();
        View underline = _$_findCachedViewById(R.id.mt0);
        o.LJIIIIZZ(underline, "underline");
        View headerView = Q3();
        W3.getClass();
        o.LJIIIZ(editText, "editText");
        o.LJIIIZ(headerView, "headerView");
        if (i > 0 && W3.LJLJJLL == null) {
            underline.getWindowVisibleDisplayFrame(new Rect());
            underline.getLocationInWindow(new int[]{0, 0});
            if (r1.bottom - r0[1] >= C44384HbQ.LJJJLL(78)) {
                z = true;
            } else {
                z = false;
            }
            W3.LJLJJLL = Boolean.valueOf(z);
        }
        Boolean bool = W3.LJLJJLL;
        if (bool != null) {
            bool.booleanValue();
            if (i > 0) {
                Editable text = editText.getText();
                if (text != null) {
                    i2 = text.length();
                } else {
                    i2 = 0;
                }
                if (i2 != W3.LJLIL.length()) {
                    W3.gv0(headerView, false);
                    if (editText.getMaxLines() == 1) {
                        return;
                    }
                    editText.setMaxLines(1);
                    return;
                }
            }
            W3.gv0(headerView, true);
            if (i <= 0 && editText.getMaxLines() == 1) {
                editText.setMaxLines(W3.LJLJL);
            }
        }
    }

    public final String U3(CharSequence charSequence) {
        return s.LJZI(charSequence.subSequence(W3().LJLIL.length(), charSequence.length()).toString()).toString();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        e4();
        b4();
        X3();
        Z3();
        c4();
        Y3();
    }

    public final void p4(List<String> list) {
        N3().getState().LJFF();
        if (list.isEmpty()) {
            L3().setVisibility(0);
            N3().setVisibility(8);
            return;
        }
        N3().setVisibility(0);
        L3().setVisibility(8);
        C72808Sho<InterfaceC57784Mm4> state = N3().getState();
        W3().getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C9QR(it.next()));
        }
        state.LJ(arrayList);
    }

    public final void F3(int i, int i2, int i3) {
        int i4 = i + 1;
        if (i4 == W3().LJLIL.length() && i2 > i3 && i2 == 1) {
            W3().LJLIL.delete(Math.max(0, i4 - i2), i4);
            ListProtector.remove(W3().LJLILLLLZI, i);
            O3().setSelectionMinIndex(W3().LJLIL.length());
            return;
        }
        int i5 = i + i3;
        if (i5 < W3().LJLIL.length() && W3().LJLIL.length() < W3().LJLJJL) {
            if (i3 > i2) {
                O3().setText(W3().LJLIL);
                O3().setSelection(W3().LJLIL.length());
                return;
            }
            int min = Math.min(W3().LJLIL.length() - i5, i2);
            W3().LJLIL.delete(i5, Math.min(W3().LJLIL.length(), i + i2));
            while (true) {
                int i6 = min - 1;
                if (min > 0) {
                    ORS.LJJLL(W3().LJLILLLLZI);
                    min = i6;
                } else {
                    O3().setSelectionMinIndex(W3().LJLIL.length());
                    return;
                }
            }
        }
    }
}
