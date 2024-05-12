package com.ss.android.ugc.aweme.favorites.business.collection;

import X.ARV;
import X.ActivityC45651qj;
import X.C10A;
import X.C116414hZ;
import X.C141335gf;
import X.C16880lQ;
import X.C192307gg;
import X.C193227iA;
import X.C1DH;
import X.C29S;
import X.C3C5;
import X.C73411SrX;
import X.C76800UCe;
import X.C90903hW;
import X.C99W;
import X.InterfaceC193237iB;
import X.SY4;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import Y.IDCListenerS204S0100000_3;
import Y.IDLListenerS191S0100000_3;
import Y.IDObjectS120S0200000_3;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class InputNameSheetFragment extends Fragment {
    public static final /* synthetic */ int LJLLJ = 0;
    public C116414hZ LJLIL;
    public EditText LJLILLLLZI;
    public ImageView LJLJI;
    public TextView LJLJJI;
    public SY4 LJLJJL;
    public C73411SrX LJLJJLL;
    public InterfaceC193237iB LJLJL;
    public TuxTextView LJLJLJ;
    public ARV LJLJLLL;
    public TuxTextView LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;

    static {
        new C193227iA();
    }

    public InputNameSheetFragment() {
        new LinkedHashMap();
        this.LJLLILLLL = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C73411SrX c73411SrX;
        super.onDestroy();
        C73411SrX c73411SrX2 = this.LJLJJLL;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LJLJJLL) != null) {
            c73411SrX.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        int i;
        int i2;
        String str3;
        int i3;
        String obj;
        ViewTreeObserver viewTreeObserver;
        o.LJIIIZ(view, "view");
        Bundle arguments = getArguments();
        boolean z3 = true;
        if (arguments != null) {
            z = arguments.getBoolean("enablePrivacySetting");
        } else {
            z = true;
        }
        this.LJLLILLLL = z;
        View findViewById = view.findViewById(R.id.ktq);
        o.LJIIIIZZ(findViewById, "view.findViewById<TuxButton>(R.id.sumbit)");
        this.LJLJJL = (SY4) findViewById;
        View findViewById2 = view.findViewById(R.id.m60);
        o.LJIIIIZZ(findViewById2, "view.findViewById<TextView>(R.id.tv_edit_hint)");
        this.LJLJJI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f0e);
        o.LJIIIIZZ(findViewById3, "view.findViewById<ImageView>(R.id.iv_clear_all)");
        this.LJLJI = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.czq);
        o.LJIIIIZZ(findViewById4, "view.findViewById<EditText>(R.id.et_input)");
        this.LJLILLLLZI = (EditText) findViewById4;
        View findViewById5 = view.findViewById(R.id.mb3);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.tv_make_public)");
        this.LJLJLJ = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.i4m);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.privacy_switch)");
        this.LJLJLLL = (ARV) findViewById6;
        View findViewById7 = view.findViewById(R.id.m1z);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.tv_change_privacy_hint)");
        this.LJLL = (TuxTextView) findViewById7;
        TextView textView = (TextView) view.findViewById(R.id.m61);
        TextView textView2 = (TextView) view.findViewById(R.id.title);
        View findViewById8 = view.findViewById(R.id.b3n);
        View findViewById9 = view.findViewById(R.id.aeg);
        View findViewById10 = view.findViewById(R.id.g7r);
        o.LJIIIIZZ(findViewById10, "view.findViewById<TuxSpinner>(R.id.loading)");
        this.LJLIL = (C116414hZ) findViewById10;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("title");
        } else {
            str = null;
        }
        textView2.setText(str);
        SY4 sy4 = this.LJLJJL;
        if (sy4 != null) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                str2 = arguments3.getString("btnName");
            } else {
                str2 = null;
            }
            sy4.setText(str2);
            EditText editText = this.LJLILLLLZI;
            if (editText != null) {
                editText.setHint(R.string.gaz);
                C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 48), findViewById8);
                C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 49), findViewById9);
                Bundle arguments4 = getArguments();
                if (arguments4 != null && arguments4.getBoolean("cancelStyle")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i = 0;
                } else {
                    i = 8;
                }
                findViewById8.setVisibility(i);
                Bundle arguments5 = getArguments();
                if (arguments5 != null && arguments5.getBoolean("cancelStyle")) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                findViewById9.setVisibility(i2);
                ImageView imageView = this.LJLJI;
                if (imageView != null) {
                    C16880lQ.LJIILLIIL(imageView, new ACListenerS23S0100000_3(this, 50));
                    EditText editText2 = this.LJLILLLLZI;
                    if (editText2 != null) {
                        editText2.addTextChangedListener(new IDObjectS120S0200000_3(this, textView, 0));
                        if (C1DH.LJJIFFI() && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS191S0100000_3(view, 2));
                        }
                        EditText editText3 = this.LJLILLLLZI;
                        if (editText3 != null) {
                            Bundle arguments6 = getArguments();
                            if (arguments6 == null || (str3 = arguments6.getString("defaultInput")) == null) {
                                str3 = "";
                            }
                            editText3.setText(str3);
                            EditText editText4 = this.LJLILLLLZI;
                            if (editText4 != null) {
                                Editable editableText = editText4.getEditableText();
                                if (editableText != null && (obj = editableText.toString()) != null) {
                                    i3 = obj.length();
                                } else {
                                    i3 = 0;
                                }
                                editText4.setSelection(i3);
                                if (!C99W.LIZ || this.LJLJJL != null) {
                                    SY4 sy42 = this.LJLJJL;
                                    if (sy42 != null) {
                                        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 2, 42, 42), sy42);
                                        if (C192307gg.LIZ() && this.LJLLILLLL) {
                                            z3 = false;
                                        }
                                        EditText editText5 = this.LJLILLLLZI;
                                        if (editText5 != null) {
                                            editText5.postDelayed(new ARunnableS39S0100000_3(this, 51), 200L);
                                            ARV arv = this.LJLJLLL;
                                            if (arv != null) {
                                                arv.setOnCheckedChangeListener(new IDCListenerS204S0100000_3(this, 1));
                                                if (z3) {
                                                    TuxTextView tuxTextView = this.LJLL;
                                                    if (tuxTextView != null) {
                                                        tuxTextView.setVisibility(8);
                                                        TuxTextView tuxTextView2 = this.LJLJLJ;
                                                        if (tuxTextView2 != null) {
                                                            tuxTextView2.setVisibility(8);
                                                            ARV arv2 = this.LJLJLLL;
                                                            if (arv2 != null) {
                                                                arv2.setVisibility(8);
                                                                return;
                                                            } else {
                                                                o.LJIJI("privacySwitch");
                                                                throw null;
                                                            }
                                                        }
                                                        o.LJIJI("tvMakePublic");
                                                        throw null;
                                                    }
                                                    o.LJIJI("tvChangePrivacyHint");
                                                    throw null;
                                                }
                                                TuxTextView tuxTextView3 = this.LJLL;
                                                if (tuxTextView3 != null) {
                                                    tuxTextView3.setVisibility(0);
                                                    TuxTextView tuxTextView4 = this.LJLJLJ;
                                                    if (tuxTextView4 != null) {
                                                        tuxTextView4.setVisibility(0);
                                                        ARV arv3 = this.LJLJLLL;
                                                        if (arv3 != null) {
                                                            arv3.setVisibility(0);
                                                            return;
                                                        } else {
                                                            o.LJIJI("privacySwitch");
                                                            throw null;
                                                        }
                                                    }
                                                    o.LJIJI("tvMakePublic");
                                                    throw null;
                                                }
                                                o.LJIJI("tvChangePrivacyHint");
                                                throw null;
                                            }
                                            o.LJIJI("privacySwitch");
                                            throw null;
                                        }
                                        o.LJIJI("etInput");
                                        throw null;
                                    }
                                    o.LJIJI("submit");
                                    throw null;
                                }
                                o.LJIJI("submit");
                                throw null;
                            }
                            o.LJIJI("etInput");
                            throw null;
                        }
                        o.LJIJI("etInput");
                        throw null;
                    }
                    o.LJIJI("etInput");
                    throw null;
                }
                o.LJIJI("ivClearAll");
                throw null;
            }
            o.LJIJI("etInput");
            throw null;
        }
        o.LJIJI("submit");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.av2, viewGroup, false);
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
}
