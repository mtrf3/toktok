package com.ss.android.ugc.aweme.profile.popup;

import X.C116714i3;
import X.C116724i4;
import X.C16880lQ;
import X.C208018Ej;
import X.C214298b3;
import X.C221108m2;
import X.C252709vu;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73318Sq2;
import X.C73849Syb;
import X.C76800UCe;
import X.C78926UyI;
import X.C79045V0n;
import X.C86V;
import X.C8EL;
import X.C8YN;
import X.C9BE;
import X.EnumC26164AOq;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.AfS53S0100000_1;
import Y.IDCListenerS372S0100000_3;
import Y.IDLListenerS191S0100000_3;
import Y.IDObjectS176S0100000_3;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.popup.SetUpNicknameAssem;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SetUpNicknameAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C73849Syb<C76800UCe> LJLILLLLZI;
    public final C73318Sq2 LJLJI;
    public final UserPresenter LJLJJI;
    public TextView LJLJJL;
    public C252709vu LJLJJLL;
    public EditText LJLJL;
    public TuxIconView LJLJLJ;
    public TuxTextView LJLJLLL;
    public C73305Spp LJLL;
    public IDLListenerS191S0100000_3 LJLLI;
    public final IDObjectS176S0100000_3 LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    public SetUpNicknameAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AvatarAndNicknamePopupViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 810), C8EL.INSTANCE, null);
        this.LJLILLLLZI = new C73849Syb<>();
        this.LJLJI = new C73318Sq2();
        this.LJLJJI = new UserPresenter(EnumC26164AOq.PROMPT.getValue());
        this.LJLLILLLL = new IDObjectS176S0100000_3(this, 7);
        this.LJLLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 811));
    }

    public final void A3() {
        int i;
        ForegroundColorSpan foregroundColorSpan;
        Integer LJI;
        EditText editText = this.LJLJL;
        if (editText != null) {
            Editable text = editText.getText();
            boolean z = false;
            if (text.length() > 30) {
                int selectionEnd = Selection.getSelectionEnd(text);
                String substring = text.toString().substring(0, 30);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                editText.setText(substring);
                Editable text2 = editText.getText();
                if (selectionEnd > text2.length()) {
                    selectionEnd = text2.length();
                }
                Selection.setSelection(text2, selectionEnd);
                z = true;
                this.LJLILLLLZI.onNext(C76800UCe.LIZ);
            }
            int length = editText.length();
            if (z) {
                i = R.attr.e7;
            } else {
                i = R.attr.gv;
            }
            Context context = getContext();
            if (context != null && (LJI = C79045V0n.LJI(i, context)) != null) {
                foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
            } else {
                foregroundColorSpan = null;
            }
            int min = Math.min(length, 30);
            C116724i4 c116724i4 = new C116724i4();
            c116724i4.LIZJ(C208018Ej.LIZ(min), foregroundColorSpan);
            c116724i4.LJ("/");
            c116724i4.LIZIZ(C208018Ej.LIZ(30));
            C116714i3 c116714i3 = c116724i4.LIZ;
            TextView textView = this.LJLJJL;
            if (textView == null) {
                return;
            }
            textView.setText(c116714i3);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        this.LJLJI.LIZLLL();
        super.onDestroy();
        TuxIconView tuxIconView = this.LJLJLJ;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, null);
        }
        EditText editText = this.LJLJL;
        if (editText != null) {
            editText.removeTextChangedListener(this.LJLLILLLL);
        }
        EditText editText2 = this.LJLJL;
        if (editText2 != null) {
            editText2.setOnEditorActionListener(null);
        }
        EditText editText3 = this.LJLJL;
        if (editText3 != null && (viewTreeObserver = editText3.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.LJLLI);
        }
        KeyboardUtils.LIZIZ(this.LJLJL);
    }

    public final AvatarAndNicknamePopupViewModel x3() {
        return (AvatarAndNicknamePopupViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ((ViewStub) view).setOnInflateListener(new ViewStub.OnInflateListener() { // from class: X.8EV
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view2) {
                ViewTreeObserver viewTreeObserver;
                Editable editable;
                int i;
                SetUpNicknameAssem setUpNicknameAssem = SetUpNicknameAssem.this;
                setUpNicknameAssem.LJLJJI.bindView((C8ES) setUpNicknameAssem.LJLLJ.getValue());
                SetUpNicknameAssem setUpNicknameAssem2 = SetUpNicknameAssem.this;
                view2.findViewById(R.id.bu5);
                setUpNicknameAssem2.getClass();
                SetUpNicknameAssem.this.LJLJL = (EditText) view2.findViewById(R.id.czq);
                SetUpNicknameAssem.this.LJLJLJ = (TuxIconView) view2.findViewById(R.id.f0e);
                SetUpNicknameAssem.this.LJLJLLL = (TuxTextView) view2.findViewById(R.id.cot);
                SetUpNicknameAssem.this.LJLJJLL = (C252709vu) view2.findViewById(R.id.gwg);
                SetUpNicknameAssem.this.LJLL = (C73305Spp) view2.findViewById(R.id.kf_);
                SetUpNicknameAssem.this.LJLJJL = (TextView) view2.findViewById(R.id.cp1);
                SetUpNicknameAssem setUpNicknameAssem3 = SetUpNicknameAssem.this;
                setUpNicknameAssem3.getClass();
                C234509Ig c234509Ig = new C234509Ig();
                c234509Ig.LIZIZ = "cancel";
                c234509Ig.LIZJ = setUpNicknameAssem3.v3(R.string.cki, new Object[0]);
                c234509Ig.LIZ(EnumC252729vw.SECONDARY);
                c234509Ig.LIZ = new C109824Ss(new AqS153S0100000_3(setUpNicknameAssem3, 5));
                C234509Ig c234509Ig2 = new C234509Ig();
                c234509Ig2.LIZIZ = "save";
                c234509Ig2.LIZJ = setUpNicknameAssem3.v3(R.string.ckh, new Object[0]);
                c234509Ig2.LIZ = new C109824Ss(new AqS153S0100000_3(setUpNicknameAssem3, 4));
                C252709vu c252709vu = setUpNicknameAssem3.LJLJJLL;
                if (c252709vu != null) {
                    C235119Kp c235119Kp = new C235119Kp();
                    c235119Kp.LIZLLL(c234509Ig);
                    c235119Kp.LIZIZ(c234509Ig2);
                    c235119Kp.LIZLLL = false;
                    c252709vu.setNavActions(c235119Kp);
                }
                EditText editText = setUpNicknameAssem3.LJLJL;
                if (editText != null) {
                    editText.setText("");
                    editText.setHint(((RBX) HG3.LJIILL()).getCurUser().getNickname());
                    editText.setSelection(editText.getText().length());
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.8EZ
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                            if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                                return true;
                            }
                            return false;
                        }
                    });
                    editText.setOnFocusChangeListener(new IDCListenerS372S0100000_3(editText, 0));
                    editText.addTextChangedListener(setUpNicknameAssem3.LJLLILLLL);
                    editText.requestFocus();
                }
                TuxIconView tuxIconView = setUpNicknameAssem3.LJLJLJ;
                if (tuxIconView != null) {
                    C16880lQ.LJJJ(tuxIconView, new ACListenerS23S0100000_3(setUpNicknameAssem3, 3));
                    EditText editText2 = setUpNicknameAssem3.LJLJL;
                    if (editText2 != null) {
                        editable = editText2.getText();
                    } else {
                        editable = null;
                    }
                    if (String.valueOf(editable).length() > 0) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    tuxIconView.setVisibility(i);
                }
                TextView textView = setUpNicknameAssem3.LJLJJL;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                setUpNicknameAssem3.A3();
                C78999UzT.LJFF(setUpNicknameAssem3.LJLILLLLZI.LJJLIIIJILLIZJL(3000L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0100000_1(view2, 1), new InterfaceC64592gB() { // from class: X.8EY
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                }), setUpNicknameAssem3.LJLJI);
                TuxTextView tuxTextView = setUpNicknameAssem3.LJLJLLL;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                    tuxTextView.setText(setUpNicknameAssem3.v3(R.string.ckn, new Object[0]));
                }
                C252709vu c252709vu2 = setUpNicknameAssem3.LJLJJLL;
                if (c252709vu2 != null) {
                    c252709vu2.LJIJ("save", C8EX.LJLIL);
                }
                if (C1DH.LJJIFFI()) {
                    SetUpNicknameAssem setUpNicknameAssem4 = SetUpNicknameAssem.this;
                    setUpNicknameAssem4.LJLLI = new IDLListenerS191S0100000_3(view2, 6);
                    EditText editText3 = setUpNicknameAssem4.LJLJL;
                    if (editText3 != null && (viewTreeObserver = editText3.getViewTreeObserver()) != null) {
                        viewTreeObserver.addOnGlobalLayoutListener(SetUpNicknameAssem.this.LJLLI);
                    }
                }
                C8EN c8en = SetUpNicknameAssem.this.x3().LJLIL;
                if (c8en != null) {
                    C188727au c188727au = new C188727au();
                    c8en.LIZ(c188727au);
                    FMX.LJIIL("show_update_nickname_sheet", c188727au.LIZ);
                }
            }
        });
        C8YN.LJII(this, x3(), new TBT() { // from class: X.8ED
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8E3) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(view, 72), 6);
    }

    public final String v3(int i, Object... objArr) {
        String string = C86V.LJ().getString(i, Arrays.copyOf(objArr, objArr.length));
        o.LJIIIIZZ(string, "getResources().getString(resId, *formatArgs)");
        return string;
    }
}
