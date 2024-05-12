package X;

import Y.ACListenerS32S0100000_12;
import Y.AfS64S0100000_12;
import Y.IDObjectS183S0100000_12;
import Y.IDTListenerS120S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TM8 {
    public ViewGroup LIZ;
    public EditText LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public C31561Ca5 LJ;
    public boolean LJII;
    public View LJIIIIZZ;
    public C83547Wqd LJIIJJI;
    public final ViewGroup LJIILIIL;
    public final InterfaceC65784Pro<InterfaceC74486TLe<ProviderEffect>> LJIILJJIL;
    public final View LJIILL;
    public final Activity LJIILLIIL;
    public final String LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final C73893SzJ<C35794E3a<String>> LJFF = new C73893SzJ<>();
    public final C73893SzJ<Boolean> LJI = new C73893SzJ<>();
    public final C5H3 LJIIIZ = C221108m2.LIZ(EnumC221088m0.NONE, new AqS162S0100000_12(this, 1006));
    public final IDObjectS183S0100000_12 LJIIJ = new IDObjectS183S0100000_12(this, 4);
    public final TMA LJIIL = new TMA(this);

    public final InterfaceC74486TLe<ProviderEffect> LIZIZ() {
        return (InterfaceC74486TLe) this.LJIIIZ.getValue();
    }

    public final void LIZJ() {
        EditText editText = this.LIZIZ;
        if (editText != null) {
            KeyboardUtils.LIZ(this.LJIILIIL.getContext(), editText);
        }
    }

    public final C73426Srm LIZLLL() {
        C73893SzJ<Boolean> c73893SzJ = this.LJI;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public final void LIZ(boolean z) {
        EditText editText = this.LIZIZ;
        if (editText != null) {
            editText.setText("");
            if (z) {
                LJFF("");
            }
            View view = this.LIZJ;
            if (view != null) {
                view.setVisibility(8);
                return;
            } else {
                o.LJIJI("clearQueryButton");
                throw null;
            }
        }
        o.LJIJI("searchEditView");
        throw null;
    }

    public final void LJ(boolean z) {
        int i;
        ViewGroup viewGroup = this.LJIILIIL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        viewGroup.setVisibility(i);
        if (!z || this.LIZIZ != null) {
            return;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJIILIIL.getContext()), R.layout.cs0, this.LJIILIIL, true);
        o.LJIIIIZZ(LLLLIILL, "LayoutInflater.from(cont…rance, contentView, true)");
        this.LJIIIIZZ = LLLLIILL;
        View findViewById = LLLLIILL.findViewById(R.id.j5r);
        o.LJIIIIZZ(findViewById, "content.findViewById(R.id.rl_search_container)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        this.LIZ = viewGroup2;
        if (this.LJIJI) {
            viewGroup2.setBackgroundResource(R.drawable.ble);
        }
        View view = this.LJIIIIZZ;
        if (view != null) {
            View findViewById2 = view.findViewById(R.id.mip);
            o.LJIIIIZZ(findViewById2, "content.findViewById(R.id.tv_search)");
            this.LIZIZ = (EditText) findViewById2;
            View view2 = this.LJIIIIZZ;
            if (view2 != null) {
                View findViewById3 = view2.findViewById(R.id.avg);
                o.LJIIIIZZ(findViewById3, "content.findViewById(R.id.btn_clear)");
                this.LIZJ = findViewById3;
                View view3 = this.LJIIIIZZ;
                if (view3 != null) {
                    View findViewById4 = view3.findViewById(R.id.mir);
                    o.LJIIIIZZ(findViewById4, "content.findViewById(R.id.tv_search_action)");
                    this.LIZLLL = findViewById4;
                    Context context = this.LJIILIIL.getContext();
                    o.LJIIIIZZ(context, "contentView.context");
                    View view4 = this.LJIIIIZZ;
                    if (view4 != null) {
                        View view5 = this.LIZLLL;
                        if (view5 != null) {
                            ViewGroup viewGroup3 = this.LIZ;
                            if (viewGroup3 != null) {
                                this.LJ = new C31561Ca5(context, view4, view5, viewGroup3);
                                EditText editText = this.LIZIZ;
                                if (editText != null) {
                                    editText.clearFocus();
                                    EditText editText2 = this.LIZIZ;
                                    if (editText2 != null) {
                                        editText2.setCursorVisible(false);
                                        String str = this.LJIIZILJ;
                                        if (str != null) {
                                            EditText editText3 = this.LIZIZ;
                                            if (editText3 != null) {
                                                editText3.setHint(str);
                                            } else {
                                                o.LJIJI("searchEditView");
                                                throw null;
                                            }
                                        }
                                        EditText editText4 = this.LIZIZ;
                                        if (editText4 != null) {
                                            editText4.setOnEditorActionListener(new TM9(this));
                                            EditText editText5 = this.LIZIZ;
                                            if (editText5 != null) {
                                                editText5.addTextChangedListener(this.LJIIJ);
                                                EditText editText6 = this.LIZIZ;
                                                if (editText6 != null) {
                                                    editText6.setOnTouchListener(new IDTListenerS120S0100000_12(this, 2));
                                                    View view6 = this.LIZJ;
                                                    if (view6 != null) {
                                                        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 106), view6);
                                                        View view7 = this.LIZLLL;
                                                        if (view7 != null) {
                                                            C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 107), view7);
                                                            this.LJFF.LJIIJJI(600L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(this, 87), C73982T1u.LJLIL);
                                                            return;
                                                        } else {
                                                            o.LJIJI("hideListButton");
                                                            throw null;
                                                        }
                                                    }
                                                    o.LJIJI("clearQueryButton");
                                                    throw null;
                                                }
                                                o.LJIJI("searchEditView");
                                                throw null;
                                            }
                                            o.LJIJI("searchEditView");
                                            throw null;
                                        }
                                        o.LJIJI("searchEditView");
                                        throw null;
                                    }
                                    o.LJIJI("searchEditView");
                                    throw null;
                                }
                                o.LJIJI("searchEditView");
                                throw null;
                            }
                            o.LJIJI("searchContainer");
                            throw null;
                        }
                        o.LJIJI("hideListButton");
                        throw null;
                    }
                    o.LJIJI("content");
                    throw null;
                }
                o.LJIJI("content");
                throw null;
            }
            o.LJIJI("content");
            throw null;
        }
        o.LJIJI("content");
        throw null;
    }

    public final void LJFF(String str) {
        if ((str == null || str.length() == 0) && (LIZIZ() instanceof InterfaceC74487TLf)) {
            InterfaceC74486TLe<ProviderEffect> LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                String LIZLLL = ((InterfaceC74487TLf) LIZIZ).LIZLLL();
                if (LIZLLL != null) {
                    str = LIZLLL;
                }
                InterfaceC74486TLe<ProviderEffect> LIZIZ2 = LIZIZ();
                if (LIZIZ2 != null) {
                    String LIZ = ((InterfaceC74487TLf) LIZIZ2).LIZ();
                    if ((str == null || str.length() == 0) && LIZ != null && LIZ.length() != 0) {
                        str = LIZ;
                    }
                    LIZIZ().J4(str);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.tools.infosticker.view.api.ILibraryProviderListView<com.ss.android.ugc.effectmanager.effect.model.ProviderEffect>");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.tools.infosticker.view.api.ILibraryProviderListView<com.ss.android.ugc.effectmanager.effect.model.ProviderEffect>");
        }
        LIZIZ().J4(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TM8(ViewGroup viewGroup, InterfaceC65784Pro<? extends InterfaceC74486TLe<ProviderEffect>> interfaceC65784Pro, View view, Activity activity, String str, boolean z, boolean z2) {
        this.LJIILIIL = viewGroup;
        this.LJIILJJIL = interfaceC65784Pro;
        this.LJIILL = view;
        this.LJIILLIIL = activity;
        this.LJIIZILJ = str;
        this.LJIJ = z;
        this.LJIJI = z2;
        viewGroup.setVisibility(8);
    }
}
