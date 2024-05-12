package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base;

import X.C105134Ar;
import X.C105454Bx;
import X.C107234It;
import X.C109934Td;
import X.C110154Tz;
import X.C158066Ig;
import X.C16880lQ;
import X.C16970lZ;
import X.C2068389v;
import X.C221108m2;
import X.C32V;
import X.C34B;
import X.C45804HyK;
import X.C4B8;
import X.C4BN;
import X.C4BS;
import X.C4BT;
import X.C4BU;
import X.C4VN;
import X.C4VR;
import X.C4YG;
import X.C62822Ol8;
import X.C6ZT;
import X.C84763XOl;
import X.C88963eO;
import X.InterfaceC1032043g;
import X.InterfaceC1032943p;
import X.InterfaceC105124Aq;
import X.LFH;
import X.T59;
import X.V3N;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ARunnableS37S0100000_1;
import Y.IDLListenerS189S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public abstract class BaseInputView implements InterfaceC105124Aq, InterfaceC1032943p, View.OnClickListener, View.OnTouchListener, TextWatcher {
    public final LifecycleOwner LJLIL;
    public C4YG LJLILLLLZI;
    public TuxIconView LJLJI;
    public View LJLJJI;
    public TuxIconView LJLJJL;
    public View LJLJJLL;
    public C4BT LJLJL;
    public C4BN LJLJLJ;
    public C4BU LJLJLLL;
    public InterfaceC1032943p LJLLI;
    public boolean LJLLJ;
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 88));
    public int LJLLILLLL = -1;
    public final List<InterfaceC1032043g> LJLLL = new ArrayList();
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 89));

    public abstract C4BS LIZLLL(C4BS c4bs);

    public void LJIIIIZZ() {
    }

    public void LJIIIZ() {
    }

    public void LJIIJ() {
    }

    public void LJIIJJI() {
    }

    public void LJIILIIL() {
    }

    @Override // X.InterfaceC105124Aq
    public void LLLZLZ(C105454Bx baseEmoji) {
        o.LJIIIZ(baseEmoji, "baseEmoji");
    }

    @Override // X.InterfaceC105124Aq
    public /* synthetic */ void T0(C32V c32v, C4B8 c4b8) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // X.InterfaceC105124Aq
    public boolean onBackPressed() {
        return false;
    }

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public /* bridge */ /* synthetic */ void onPause() {
        C105134Ar.LIZIZ(this);
    }

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public /* bridge */ /* synthetic */ void onResume() {
        C105134Ar.LIZJ(this);
    }

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public /* bridge */ /* synthetic */ void onStop() {
        C105134Ar.LIZLLL(this);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void LJI() {
        ViewTreeObserver viewTreeObserver;
        View view = this.LJLJJI;
        if (view != null) {
            C16880lQ.LJIIJ(this, view);
        }
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, this);
        }
        C4YG c4yg = this.LJLILLLLZI;
        if (c4yg != null) {
            c4yg.setFilters(new InputFilter[]{new C158066Ig(c4yg)});
            c4yg.setOnKeyListener((View.OnKeyListener) this.LJLLLL.getValue());
            c4yg.setOnClickListener(new ViewOnClickListenerC13880ga(this));
            c4yg.setOnTouchListener(this);
            c4yg.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.4Bs
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    if (!z) {
                        C34B.LJI("BaseInputView", "view focus has changed, will reset keyboard");
                        BaseInputView.this.LJIILJJIL();
                    }
                }
            });
            c4yg.removeTextChangedListener(this);
            c4yg.addTextChangedListener(this);
        }
        C4BT c4bt = this.LJLJL;
        if (c4bt != null) {
            c4bt.setOnPanelChangeListener(this);
        }
        C4BT c4bt2 = this.LJLJL;
        if (c4bt2 != null) {
            c4bt2.setOnClickListener(new ViewOnClickListenerC13880ga(this));
        }
        LFH.LIZIZ.LIZLLL().LIZJ().LIZ(this.LJLJJLL);
        View view2 = this.LJLJJLL;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS189S0100000_1(this, 0));
        }
    }

    public void LJIILJJIL() {
        C4BT c4bt = this.LJLJL;
        if (c4bt != null) {
            c4bt.post(new ARunnableS37S0100000_1(this, 27));
        }
    }

    public void LJIIZILJ() {
        if (this.LJLLILLLL != -2) {
            LJIJ(false);
            LJIILLIIL(-2);
        }
    }

    @Override // X.InterfaceC105124Aq
    public final void LLLLLZIL() {
        C4YG c4yg;
        KeyEvent keyEvent = new KeyEvent(0, 67);
        C4YG c4yg2 = this.LJLILLLLZI;
        if (c4yg2 != null && !C109934Td.LJIIIIZZ(c4yg2) && (c4yg = this.LJLILLLLZI) != null) {
            c4yg.dispatchKeyEvent(keyEvent);
        }
    }

    public final Context getContext() {
        C4YG c4yg = this.LJLILLLLZI;
        if (c4yg != null) {
            return c4yg.getContext();
        }
        return null;
    }

    @Override // X.InterfaceC105124Aq
    public final void n9() {
        C4YG c4yg = this.LJLILLLLZI;
        if (c4yg != null) {
            c4yg.setText("");
        }
    }

    @Override // X.InterfaceC105124Aq
    public void onDestroy() {
        C4YG c4yg = this.LJLILLLLZI;
        if (c4yg != null) {
            c4yg.removeTextChangedListener(this);
        }
        C4BU c4bu = this.LJLJLLL;
        if (c4bu != null) {
            c4bu.LJIIJJI();
        }
    }

    @Override // X.InterfaceC105124Aq
    public final int getPanelType() {
        return this.LJLLILLLL;
    }

    public BaseInputView(LifecycleOwner lifecycleOwner) {
        this.LJLIL = lifecycleOwner;
    }

    public void LJFF(LifecycleOwner lifecycleOwner) {
        View view;
        Activity LJIIIIZZ;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        C4BT c4bt = this.LJLJL;
        if (c4bt != null) {
            C4BS c4bs = new C4BS(this, c4bt, lifecycleOwner);
            LIZLLL(c4bs);
            C4VN.LIZ();
            if (C110154Tz.LIZ(1)) {
                c4bs.LJ.LIZIZ = true;
            }
            if (C16970lZ.LIZ(R.layout.b6v, getContext()) && (LJIIIIZZ = C84763XOl.LJIIIIZZ()) != null) {
                View LIZLLL = C16970lZ.LIZLLL(LJIIIIZZ, R.layout.b6v);
                o.LJIIIIZZ(LIZLLL, "inflate(\n               …                        )");
                c4bs.LIZLLL = LIZLLL;
            }
            c4bs.LJ.LJI = 1;
            C4BU LIZ = c4bs.LIZ();
            this.LJLJLLL = LIZ;
            C16880lQ.LJIILLIIL(LIZ.LJII(), this);
            C4BU c4bu = this.LJLJLLL;
            if (c4bu != null) {
                c4bu.LJIIIIZZ().setOnClickListener(new ViewOnClickListenerC13880ga(this));
            }
            C4BU c4bu2 = this.LJLJLLL;
            if (c4bu2 != null) {
                view = c4bu2.LJLIL;
            } else {
                view = null;
            }
            c4bt.LIZ(view);
            c4bt.setEditText(this.LJLILLLLZI);
        }
    }

    public void LJII(ViewGroup viewGroup) {
        C4YG c4yg;
        C4BT c4bt;
        if (this.LJLJJI != null && (c4yg = this.LJLILLLLZI) != null && (c4bt = this.LJLJL) != null && this.LJLJJLL != null) {
            c4bt.setEditText(c4yg);
            return;
        }
        throw new Exception("Initialize views inside initViewRefs() method of child class");
    }

    public void LJIILL(boolean z) {
        if (this.LJLLJ == z) {
            return;
        }
        this.LJLLJ = z;
        C4YG c4yg = this.LJLILLLLZI;
        if (c4yg != null) {
            c4yg.setSelected(z);
        }
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView == null) {
            return;
        }
        tuxIconView.setActivated(z);
    }

    public void LJIILLIIL(int i) {
        if (i != -2) {
            if (i != -1) {
                if (i != 1) {
                    return;
                }
                C4BT c4bt = this.LJLJL;
                if (c4bt != null && c4bt.LJLILLLLZI == 1) {
                    LJIILJJIL();
                    return;
                }
                C4BU c4bu = this.LJLJLLL;
                if (c4bu != null) {
                    c4bu.LJIILL(true);
                }
                C4BT c4bt2 = this.LJLJL;
                if (c4bt2 != null) {
                    c4bt2.LJI(1, false);
                }
                LJIIIIZZ();
                return;
            }
            LJIILJJIL();
            return;
        }
        C4BT c4bt3 = this.LJLJL;
        if (c4bt3 == null) {
            return;
        }
        c4bt3.post(new ARunnableS37S0100000_1(this, 28));
    }

    public void LJIJ(boolean z) {
        C2068389v c2068389v;
        int i;
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            if (z) {
                c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_keyboard_circle;
                c2068389v.LJFF = true;
            } else {
                c2068389v = new C2068389v();
                if (C88963eO.LJFF()) {
                    i = R.raw.icon_sticker_round;
                } else {
                    i = R.raw.icon_emoji;
                }
                c2068389v.LIZ = i;
                c2068389v.LJFF = true;
            }
            tuxIconView.setTuxIcon(c2068389v);
        }
        TuxIconView tuxIconView2 = this.LJLJI;
        if (tuxIconView2 != null) {
            tuxIconView2.setSelected(z);
        }
        TuxIconView tuxIconView3 = this.LJLJI;
        if (tuxIconView3 != null) {
            tuxIconView3.setTintColorRes(R.attr.go);
        }
    }

    @Override // X.InterfaceC105124Aq
    public void i30(String emojiText) {
        Editable text;
        o.LJIIIZ(emojiText, "emojiText");
        if (TextUtils.isEmpty(emojiText)) {
            return;
        }
        C4YG c4yg = this.LJLILLLLZI;
        if (c4yg != null && (text = c4yg.getText()) != null) {
            if (emojiText.length() + text.length() > 6000) {
                Activity activity = null;
                if (1 != 0) {
                    Context context = getContext();
                    if (context != null) {
                        activity = C45804HyK.LJIJJ(context);
                    }
                    V3N.LJJIJIIJI(activity);
                    return;
                }
            }
        }
        if (this.LJLLILLLL == -1) {
            LJIILLIIL(-2);
        }
        C4YG c4yg2 = this.LJLILLLLZI;
        if (c4yg2 == null || c4yg2.getEditableText() == null) {
            return;
        }
        int selectionStart = c4yg2.getSelectionStart();
        if (selectionStart < 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addEmojiText index invalid: ");
            LIZ.append(selectionStart);
            C34B.LIZJ("MentionEditText", X1D.LIZIZ(LIZ));
            return;
        }
        SpannableString spannableString = new SpannableString(emojiText);
        Drawable LIZ2 = new C4VR().LIZ(c4yg2.getContext(), emojiText);
        if (LIZ2 != null) {
            int lineHeight = c4yg2.getLineHeight();
            LIZ2.setBounds(0, 0, (int) ((lineHeight * ((LIZ2.getIntrinsicWidth() + 0.0f) / LIZ2.getIntrinsicHeight())) + 0.5f), lineHeight);
            spannableString.setSpan(new T59(LIZ2), 0, spannableString.length(), 33);
        }
        Editable text2 = c4yg2.getText();
        if (text2 == null) {
            return;
        }
        text2.insert(selectionStart, spannableString);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (o.LJ(view, this.LJLILLLLZI)) {
            if (C6ZT.LIZIZ(view, 500L)) {
                return;
            }
            LJIIZILJ();
            return;
        }
        if (o.LJ(view, this.LJLJJI)) {
            if (C6ZT.LIZIZ(view, 500L)) {
                return;
            }
            View view2 = this.LJLJJI;
            if (view2 != null && view2.isActivated()) {
                ((InterfaceC105124Aq) this.LJLL.getValue()).vb();
                C107234It.LJI("input_box", "click");
                return;
            } else {
                LJIILIIL();
                return;
            }
        }
        if (!o.LJ(view, this.LJLJI) || C6ZT.LIZIZ(view, 500L)) {
            return;
        }
        if (this.LJLJLLL == null) {
            LJFF(this.LJLIL);
        }
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            tuxIconView.setSelected(!tuxIconView.isSelected());
            if (tuxIconView.isSelected()) {
                LJIILLIIL(1);
                LJIIJJI();
            } else {
                LJIILLIIL(-2);
            }
            LJIJ(tuxIconView.isSelected());
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        if (o.LJ(v, this.LJLILLLLZI) && event.getAction() == 1) {
            LJIIZILJ();
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
    
        if (r7 == (-1)) goto L7;
     */
    @Override // X.InterfaceC1032943p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIIL(android.view.View r5, int r6, int r7, boolean r8) {
        /*
            r4 = this;
            r3 = -1
            r2 = -2
            r0 = 1
            r1 = 0
            if (r7 == r2) goto L50
            if (r7 == r3) goto L38
            if (r7 == r0) goto L34
            if (r7 != r3) goto Le
        Lc:
            r1 = 8
        Le:
            X.4BU r0 = r4.LJLJLLL
            if (r0 != 0) goto L31
        L12:
            X.4BN r0 = r4.LJLJLJ
            if (r0 == 0) goto L19
            r0.LIZ(r1)
        L19:
            r4.LJLLILLLL = r7
            X.43p r0 = r4.LJLLI
            if (r0 == 0) goto L22
            r0.LJIIL(r5, r6, r7, r8)
        L22:
            if (r6 != r7) goto L25
        L24:
            return
        L25:
            if (r6 != r2) goto L2b
            r4.LJIIIZ()
            goto L24
        L2b:
            if (r7 != r2) goto L24
            r4.LJIIJ()
            goto L24
        L31:
            r0.LJLILLLLZI = r7
            goto L12
        L34:
            r4.LJIILL(r0)
            goto Le
        L38:
            com.bytedance.tux.icon.TuxIconView r0 = r4.LJLJI
            if (r0 == 0) goto L45
            boolean r0 = r0.isSelected()
            if (r0 == 0) goto L45
            r4.LJIJ(r1)
        L45:
            r4.LJIILL(r1)
            X.4YG r0 = r4.LJLILLLLZI
            if (r0 == 0) goto Lc
            r0.clearFocus()
            goto Lc
        L50:
            r4.LJIILL(r0)
            r4.LJIJ(r1)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView.LJIIL(android.view.View, int, int, boolean):void");
    }
}
