package com.ss.android.ugc.aweme.mix.editname;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C116414hZ;
import X.C116714i3;
import X.C116724i4;
import X.C16880lQ;
import X.C188727au;
import X.C207598Ct;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C229008ym;
import X.C229068ys;
import X.C229078yt;
import X.C229088yu;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6ZT;
import X.C78926UyI;
import X.C8C9;
import X.C8VC;
import X.C90193gN;
import X.C99W;
import X.C9BD;
import X.FMX;
import X.InterfaceC207558Cp;
import X.JC4;
import X.KNV;
import X.Q7K;
import X.SY4;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS22S0200000_3;
import Y.IDObjectS176S0100000_3;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameAssem;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS12S1101000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;
import q03.IDaS199S0200000_3;
import ujb.s;

/* loaded from: classes4.dex */
public final class EditPlayListNameAssem extends UIContentAssem {
    public int LJLIL;
    public EditText LJLILLLLZI;
    public TextView LJLJI;
    public View LJLJJI;
    public LinearLayout LJLJJL;
    public C116414hZ LJLJJLL;
    public SY4 LJLJL;
    public ImageView LJLJLJ;
    public TextView LJLJLLL;
    public boolean LJLL;
    public final C214298b3 LJLLI;
    public final C214298b3 LJLLILLLL;
    public final CountDownTimer LJLLJ;

    public EditPlayListNameAssem() {
        new LinkedHashMap();
        this.LJLIL = 15;
        C65776Prg LIZ = C65352Pkq.LIZ(EditPlayListNameEditTextVM.class);
        this.LJLLI = new C214298b3(new AqS153S0100000_3(LIZ, 493), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C229008ym.INSTANCE, LIZ);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(MixCreateViewModel.class);
        this.LJLLILLLL = C78926UyI.LJ(this, LIZ2, c9bd, new AqS153S0100000_3(LIZ2, 494), C207598Ct.INSTANCE, null);
        this.LJLLJ = new CountDownTimer(1000L, 100L, new JC4() { // from class: X.8yl
            @Override // X.JC4
            public final void LJIILIIL(long j) {
            }

            @Override // X.JC4
            public final void onStart() {
            }

            @Override // X.JC4
            public final void LIZ() {
                EditText editText = EditPlayListNameAssem.this.LJLILLLLZI;
                if (editText != null) {
                    if (o.LJ(editText.getText().toString(), "")) {
                        C116414hZ c116414hZ = EditPlayListNameAssem.this.LJLJJLL;
                        if (c116414hZ != null) {
                            c116414hZ.setVisibility(8);
                            ImageView imageView = EditPlayListNameAssem.this.LJLJLJ;
                            if (imageView != null) {
                                imageView.setVisibility(8);
                                return;
                            } else {
                                o.LJIJI("delete");
                                throw null;
                            }
                        }
                        o.LJIJI("loading");
                        throw null;
                    }
                    EditText editText2 = EditPlayListNameAssem.this.LJLILLLLZI;
                    if (editText2 != null) {
                        if (s.LJZI(editText2.getText().toString()).toString().length() == 0) {
                            EditPlayListNameAssem.this.x3();
                            return;
                        }
                        EditText editText3 = EditPlayListNameAssem.this.LJLILLLLZI;
                        if (editText3 != null) {
                            int length = editText3.getText().toString().length();
                            EditPlayListNameAssem editPlayListNameAssem = EditPlayListNameAssem.this;
                            if (length > editPlayListNameAssem.LJLIL) {
                                return;
                            }
                            C116414hZ c116414hZ2 = editPlayListNameAssem.LJLJJLL;
                            if (c116414hZ2 != null) {
                                c116414hZ2.setVisibility(0);
                                ImageView imageView2 = EditPlayListNameAssem.this.LJLJLJ;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(8);
                                    EditPlayListNameEditTextVM editPlayListNameEditTextVM = (EditPlayListNameEditTextVM) EditPlayListNameAssem.this.LJLLI.getValue();
                                    EditText editText4 = EditPlayListNameAssem.this.LJLILLLLZI;
                                    if (editText4 != null) {
                                        String name = editText4.getText().toString();
                                        o.LJIIIZ(name, "name");
                                        editPlayListNameEditTextVM.withState(new AqS12S1101000_3(editPlayListNameEditTextVM, name, 0));
                                        return;
                                    }
                                    o.LJIJI("editText");
                                    throw null;
                                }
                                o.LJIJI("delete");
                                throw null;
                            }
                            o.LJIJI("loading");
                            throw null;
                        }
                        o.LJIJI("editText");
                        throw null;
                    }
                    o.LJIJI("editText");
                    throw null;
                }
                o.LJIJI("editText");
                throw null;
            }
        });
    }

    @Override // X.C8W0
    public final void onPause() {
        if (this.LJLILLLLZI != null) {
            MixCreateViewModel v3 = v3();
            EditText editText = this.LJLILLLLZI;
            if (editText != null) {
                String C3 = C3(editText.getText().toString());
                v3.getClass();
                v3.setStateImmediate(new AqS28S1000000_3(C3, 21));
                super.onPause();
                return;
            }
            o.LJIJI("editText");
            throw null;
        }
        o.LJIJI("editText");
        throw null;
    }

    public final MixCreateViewModel v3() {
        return (MixCreateViewModel) this.LJLLILLLL.getValue();
    }

    public final void A3() {
        String str;
        CharSequence charSequence;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C116724i4 c116724i4 = new C116724i4();
            EditText editText = this.LJLILLLLZI;
            if (editText != null) {
                c116724i4.LIZIZ(String.valueOf(editText.getText().length()));
                if (C90193gN.LIZ()) {
                    str = "\u200f\\";
                } else {
                    str = "\u200e/";
                }
                c116724i4.LIZIZ(str);
                c116724i4.LIZIZ(String.valueOf(this.LJLIL));
                C116714i3 c116714i3 = c116724i4.LIZ;
                EditText editText2 = this.LJLILLLLZI;
                if (editText2 != null) {
                    if (editText2.getText().length() > this.LJLIL) {
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(LIZ.getResources().getColor(R.color.c3));
                        EditText editText3 = this.LJLILLLLZI;
                        if (editText3 != null) {
                            c116714i3.setSpan(foregroundColorSpan, 0, String.valueOf(editText3.getText().length()).length() + 1, 33);
                            TextView textView = this.LJLJI;
                            if (textView != null) {
                                textView.setText(c116714i3);
                                LinearLayout linearLayout = this.LJLJJL;
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(0);
                                    TextView textView2 = this.LJLJLLL;
                                    if (textView2 != null) {
                                        Context context = getContext();
                                        if (context != null) {
                                            charSequence = context.getText(R.string.cm8);
                                        } else {
                                            charSequence = null;
                                        }
                                        textView2.setText(charSequence);
                                        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
                                        if (LIZ2 != null) {
                                            View view = this.LJLJJI;
                                            if (view != null) {
                                                view.setBackground(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.e7, LIZ2)));
                                                return;
                                            } else {
                                                o.LJIJI("viewLint");
                                                throw null;
                                            }
                                        }
                                        return;
                                    }
                                    o.LJIJI("txErrorHint");
                                    throw null;
                                }
                                o.LJIJI("errorHint");
                                throw null;
                            }
                            o.LJIJI("lengthHint");
                            throw null;
                        }
                        o.LJIJI("editText");
                        throw null;
                    }
                    TextView textView3 = this.LJLJI;
                    if (textView3 != null) {
                        textView3.setText(c116714i3);
                        return;
                    } else {
                        o.LJIJI("lengthHint");
                        throw null;
                    }
                }
                o.LJIJI("editText");
                throw null;
            }
            o.LJIJI("editText");
            throw null;
        }
    }

    public final void x3() {
        CharSequence charSequence;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            View view = this.LJLJJI;
            if (view != null) {
                view.setBackground(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.dt, LIZ)));
                if (C99W.LIZ) {
                    SY4 sy4 = this.LJLJL;
                    if (sy4 != null) {
                        sy4.setButtonVariant(0);
                        if (this.LJLJL == null) {
                            o.LJIJI("button");
                            throw null;
                        }
                    } else {
                        o.LJIJI("button");
                        throw null;
                    }
                } else {
                    SY4 sy42 = this.LJLJL;
                    if (sy42 != null) {
                        sy42.setBackground(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.cg, LIZ)));
                        SY4 sy43 = this.LJLJL;
                        if (sy43 != null) {
                            sy43.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, LIZ));
                        } else {
                            o.LJIJI("button");
                            throw null;
                        }
                    } else {
                        o.LJIJI("button");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("viewLint");
                throw null;
            }
        }
        LinearLayout linearLayout = this.LJLJJL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            C116414hZ c116414hZ = this.LJLJJLL;
            if (c116414hZ != null) {
                c116414hZ.setVisibility(8);
                ImageView imageView = this.LJLJLJ;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    TextView textView = this.LJLJLLL;
                    if (textView != null) {
                        Context context = getContext();
                        if (context != null) {
                            charSequence = context.getText(R.string.jtj);
                        } else {
                            charSequence = null;
                        }
                        textView.setText(charSequence);
                        SY4 sy44 = this.LJLJL;
                        if (sy44 != null) {
                            sy44.setEnabled(false);
                            return;
                        } else {
                            o.LJIJI("button");
                            throw null;
                        }
                    }
                    o.LJIJI("txErrorHint");
                    throw null;
                }
                o.LJIJI("delete");
                throw null;
            }
            o.LJIJI("loading");
            throw null;
        }
        o.LJIJI("errorHint");
        throw null;
    }

    public static String C3(String str) {
        char[] charArray = str.toCharArray();
        o.LJIIIIZZ(charArray, "this as java.lang.String).toCharArray()");
        int length = charArray.length;
        while (length > 0) {
            int i = length - 1;
            if (o.LJIIJJI(charArray[i], 32) > 0) {
                break;
            }
            length = i;
        }
        if (length < charArray.length) {
            String substring = new String(charArray).substring(0, length);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return new String(charArray);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object obj;
        String str;
        Integer num;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        o.LJIIIZ(view, "view");
        this.LJLIL = Q7K.LIZIZ("mix_name_max_length", 25);
        View findViewById = view.findViewById(R.id.czq);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.et_input)");
        this.LJLILLLLZI = (EditText) findViewById;
        View findViewById2 = view.findViewById(R.id.fq1);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.length_hint)");
        this.LJLJI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.n9u);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.view)");
        this.LJLJJI = findViewById3;
        View findViewById4 = view.findViewById(R.id.cou);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.edit_hint_layout)");
        this.LJLJJL = (LinearLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.g7r);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.loading)");
        this.LJLJJLL = (C116414hZ) findViewById5;
        View findViewById6 = view.findViewById(R.id.b1h);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.button)");
        this.LJLJL = (SY4) findViewById6;
        View findViewById7 = view.findViewById(R.id.c65);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.delete)");
        this.LJLJLJ = (ImageView) findViewById7;
        View findViewById8 = view.findViewById(R.id.m60);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.tv_edit_hint)");
        this.LJLJLLL = (TextView) findViewById8;
        TextView textView = (TextView) view.findViewById(R.id.ced);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            obj = C16880lQ.LLILLJJLI(LIZ, "input_method");
        } else {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        EditText editText = this.LJLILLLLZI;
        if (editText != null) {
            editText.postDelayed(new ARunnableS22S0200000_3(this, inputMethodManager, 66), 300L);
            C8C9 c8c9 = (C8C9) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC207558Cp.class));
            if (c8c9 != null) {
                str = c8c9.LIZIZ;
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                EditText editText2 = this.LJLILLLLZI;
                if (editText2 != null) {
                    editText2.setText(str);
                    EditText editText3 = this.LJLILLLLZI;
                    if (editText3 != null) {
                        editText3.setSelection(str.length());
                    } else {
                        o.LJIJI("editText");
                        throw null;
                    }
                } else {
                    o.LJIJI("editText");
                    throw null;
                }
            }
            EditText editText4 = this.LJLILLLLZI;
            if (editText4 != null) {
                editText4.addTextChangedListener(new IDObjectS176S0100000_3(this, 14));
                C8C9 c8c92 = (C8C9) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC207558Cp.class));
                if (c8c92 != null) {
                    num = Integer.valueOf(c8c92.LIZ);
                } else {
                    num = null;
                }
                if (num != null) {
                    if (num.intValue() == 1) {
                        Context context = getContext();
                        if (context != null) {
                            charSequence5 = context.getText(R.string.ika);
                        } else {
                            charSequence5 = null;
                        }
                        textView.setText(charSequence5);
                        SY4 sy4 = this.LJLJL;
                        if (sy4 != null) {
                            Context context2 = getContext();
                            if (context2 != null) {
                                charSequence6 = context2.getText(R.string.ipp);
                            } else {
                                charSequence6 = null;
                            }
                            sy4.setText(charSequence6);
                            String str2 = v3().LJLILLLLZI;
                            C188727au LIZLLL = KNV.LIZLLL(str2, "enterFrom");
                            LIZLLL.LJIIIZ("enter_from", str2);
                            FMX.LJIIL("enter_playlist_name", LIZLLL.LIZ);
                        } else {
                            o.LJIJI("button");
                            throw null;
                        }
                    } else if (num.intValue() == 2) {
                        Context context3 = getContext();
                        if (context3 != null) {
                            charSequence3 = context3.getText(R.string.clt);
                        } else {
                            charSequence3 = null;
                        }
                        textView.setText(charSequence3);
                        SY4 sy42 = this.LJLJL;
                        if (sy42 != null) {
                            Context context4 = getContext();
                            if (context4 != null) {
                                charSequence4 = context4.getText(R.string.q8j);
                            } else {
                                charSequence4 = null;
                            }
                            sy42.setText(charSequence4);
                        } else {
                            o.LJIJI("button");
                            throw null;
                        }
                    } else if (num.intValue() == 3) {
                        Context context5 = getContext();
                        if (context5 != null) {
                            charSequence = context5.getText(R.string.ika);
                        } else {
                            charSequence = null;
                        }
                        textView.setText(charSequence);
                        SY4 sy43 = this.LJLJL;
                        if (sy43 != null) {
                            Context context6 = getContext();
                            if (context6 != null) {
                                charSequence2 = context6.getText(R.string.ipp);
                            } else {
                                charSequence2 = null;
                            }
                            sy43.setText(charSequence2);
                            this.LJLL = true;
                            String str3 = v3().LJLILLLLZI;
                            C188727au LIZLLL2 = KNV.LIZLLL(str3, "enterFrom");
                            LIZLLL2.LJIIIZ("enter_from", str3);
                            FMX.LJIIL("enter_playlist_name", LIZLLL2.LIZ);
                        } else {
                            o.LJIJI("button");
                            throw null;
                        }
                    }
                }
                ImageView imageView = this.LJLJLJ;
                if (imageView != null) {
                    C16880lQ.LJIILLIIL(imageView, new ACListenerS23S0100000_3(this, 289));
                    C252709vu c252709vu = (C252709vu) view.findViewById(R.id.l_2);
                    C235119Kp c235119Kp = new C235119Kp();
                    C234529Ii LIZJ = s1.LIZJ();
                    LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
                    LIZJ.LIZIZ(new AqS150S0200000_3(this, inputMethodManager, 93));
                    c235119Kp.LIZLLL(LIZJ);
                    c235119Kp.LIZLLL = false;
                    c252709vu.setNavActions(c235119Kp);
                    SY4 sy44 = this.LJLJL;
                    if (sy44 != null) {
                        C6ZT.LIZIZ(sy44, 300L);
                        SY4 sy45 = this.LJLJL;
                        if (sy45 != null) {
                            C16880lQ.LJIIJ(new IDaS199S0200000_3(this, inputMethodManager, 4, 42), sy45);
                            AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.8yT
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj2) {
                                    return ((C228798yR) obj2).LJLJL;
                                }
                            }, null, new AqS169S0100000_3(this, 896), null, null, 26, null);
                            A3();
                            x3();
                            AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLLI.getValue(), new TBT() { // from class: X.8yo
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj2) {
                                    return ((C229038yp) obj2).LJLIL;
                                }
                            }, null, new AqS169S0100000_3(this, 892), C229078yt.LJLIL, new AqS169S0100000_3(this, 893), 2, null);
                            AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLLI.getValue(), new TBT() { // from class: X.8yn
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj2) {
                                    return ((C229038yp) obj2).LJLILLLLZI;
                                }
                            }, null, new AqS169S0100000_3(this, 894), C229088yu.LJLIL, new AqS169S0100000_3(this, 895), 2, null);
                            AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.8yS
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj2) {
                                    return ((C228798yR) obj2).LJLJL;
                                }
                            }, null, new AqS169S0100000_3(this, 889), C229068ys.LJLIL, new AqS169S0100000_3(this, 891), 2, null);
                            ImageView imageView2 = this.LJLJLJ;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                String str4 = v3().getVmDispatcher().getState().LJLJJL;
                                String str5 = "";
                                if (str4 == null) {
                                    str4 = "";
                                }
                                if (!TextUtils.isEmpty(str4)) {
                                    EditText editText5 = this.LJLILLLLZI;
                                    if (editText5 != null) {
                                        String str6 = v3().getVmDispatcher().getState().LJLJJL;
                                        if (str6 != null) {
                                            str5 = str6;
                                        }
                                        editText5.setText(str5);
                                        return;
                                    }
                                    o.LJIJI("editText");
                                    throw null;
                                }
                                return;
                            }
                            o.LJIJI("delete");
                            throw null;
                        }
                        o.LJIJI("button");
                        throw null;
                    }
                    o.LJIJI("button");
                    throw null;
                }
                o.LJIJI("delete");
                throw null;
            }
            o.LJIJI("editText");
            throw null;
        }
        o.LJIJI("editText");
        throw null;
    }
}
