package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS27S0300000_1;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4IJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4IJ extends AbstractC029409q<RecyclerView.ViewHolder> {
    public static final C4IO LJLJLLL = new AbstractC03160Am<C4IN>() { // from class: X.4IO
        @Override // X.AbstractC03160Am
        public final boolean LIZ(C4IN c4in, C4IN c4in2) {
            return c4in.equals(c4in2);
        }

        @Override // X.AbstractC03160Am
        public final boolean LIZIZ(C4IN c4in, C4IN c4in2) {
            return c4in.equals(c4in2);
        }
    };
    public final int LJLIL;
    public final boolean LJLILLLLZI;
    public final C4IV LJLJI;
    public RecyclerView LJLJJL;
    public C4IU LJLJJLL;
    public C4IT LJLJL;
    public final C0AR<C4IN> LJLJJI = new C0AR<>(new C28811Bd(this), new C0AJ(LJLJLLL).LIZ());
    public final ArrayList<String> LJLJLJ = new ArrayList<>();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJI.LJFF.size();
    }

    public final void LJLLLLLL(List<String> labels) {
        o.LJIIIZ(labels, "labels");
        this.LJLJLJ.clear();
        this.LJLJLJ.addAll(labels);
        this.LJLJJI.LIZIZ(C4IW.LIZ(this.LJLIL, labels), null);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        C4IN c4in;
        List<C4IN> list = this.LJLJJI.LJFF;
        o.LJIIIIZZ(list, "differ.currentList");
        if (i < 0 || i >= list.size() || (c4in = (C4IN) ListProtector.get(list, i)) == null) {
            return -1;
        }
        return c4in.LJLILLLLZI;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJJL = recyclerView;
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.LJLJJL = null;
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (holder instanceof C4IP) {
            C4IP c4ip = (C4IP) holder;
            if (c4ip.LJLIL == 1) {
                c4ip.itemView.findViewById(R.id.kge).requestFocus();
                Object LLILL = C16880lQ.LLILL(c4ip.itemView.getContext(), "input_method");
                o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) LLILL).showSoftInput(c4ip.itemView, 1);
                return;
            }
            return;
        }
        if (!(holder instanceof C4IQ)) {
            return;
        }
        C4IQ c4iq = (C4IQ) holder;
        if (c4iq.LJLIL != 1) {
            return;
        }
        c4iq.itemView.findViewById(R.id.kge).requestFocus();
        Object LLILL2 = C16880lQ.LLILL(c4iq.itemView.getContext(), "input_method");
        o.LJII(LLILL2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) LLILL2).showSoftInput(c4iq.itemView, 1);
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (holder instanceof C4IQ) {
            C4IQ c4iq = (C4IQ) holder;
            if (c4iq.LJLIL == 1) {
                c4iq.itemView.findViewById(R.id.kge).clearFocus();
            }
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        C4IN c4in;
        o.LJIIIZ(holder, "holder");
        List<C4IN> list = this.LJLJJI.LJFF;
        o.LJIIIIZZ(list, "differ.currentList");
        CharSequence charSequence = null;
        if (i < 0 || i >= list.size() || (c4in = (C4IN) ListProtector.get(list, i)) == null) {
            return;
        }
        if (holder instanceof C4IM) {
            C4IM c4im = (C4IM) holder;
            C4IV c4iv = this.LJLJI;
            c4im.LJLILLLLZI.setText(c4in.LJLIL);
            TuxIconView tuxIconView = (TuxIconView) c4im.itemView.findViewById(R.id.kib);
            if (c4im.LJLIL == 0) {
                tuxIconView.setVisibility(8);
                if (c4iv != null) {
                    C16880lQ.LJIIJ(new ACListenerS27S0300000_1(c4iv, c4in, c4im, 12), c4im.itemView);
                    return;
                }
                return;
            }
            tuxIconView.setVisibility(0);
            if (c4iv == null) {
                return;
            }
            C16880lQ.LJJJ(tuxIconView, new ACListenerS27S0300000_1(c4iv, c4in, c4im, 13));
            return;
        }
        if (holder instanceof C4IP) {
            C4IP c4ip = (C4IP) holder;
            C4IV c4iv2 = this.LJLJI;
            final C4IU c4iu = this.LJLJJLL;
            final C4IT c4it = this.LJLJL;
            int i2 = c4ip.LJLIL;
            if (i2 == 0) {
                c4ip.itemView.findViewById(R.id.kia).setVisibility(8);
                ((ImageView) c4ip.itemView.findViewById(R.id.kib)).setVisibility(8);
                ((ImageView) c4ip.itemView.findViewById(R.id.kic)).setVisibility(0);
            } else if (i2 == 1) {
                final C4IY c4iy = (C4IY) c4ip.itemView.findViewById(R.id.kge);
                c4iy.setHint("");
                c4iy.addTextChangedListener(new TextWatcher() { // from class: X.4IK
                    @Override // android.text.TextWatcher
                    public final void afterTextChanged(Editable editable) {
                    }

                    @Override // android.text.TextWatcher
                    public final void beforeTextChanged(CharSequence charSequence2, int i3, int i4, int i5) {
                    }

                    @Override // android.text.TextWatcher
                    public final void onTextChanged(CharSequence charSequence2, int i3, int i4, int i5) {
                        C4IU c4iu2;
                        if (charSequence2 == null || c4iy.getText() == null) {
                            return;
                        }
                        if (ujb.o.LJJJJJL(charSequence2) && charSequence2.length() > 0) {
                            C4IU c4iu3 = c4iu;
                            if (c4iu3 == null) {
                                return;
                            }
                            c4iu3.LIZ(String.valueOf(c4iy.getText()));
                            return;
                        }
                        if (s.LJZI(charSequence2).length() == charSequence2.length() || (c4iu2 = c4iu) == null) {
                            return;
                        }
                        c4iu2.LIZ(String.valueOf(c4iy.getText()));
                    }
                });
                c4iy.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.4IL
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                        int i4 = i3 & 255;
                        if (i4 != 5 && i4 != 6) {
                            return false;
                        }
                        C4IU c4iu2 = c4iu;
                        if (c4iu2 != null) {
                            c4iu2.LIZ(String.valueOf(c4iy.getText()));
                        }
                        return true;
                    }
                });
                if (c4it != null) {
                    c4iy.setKeyImeChangeListener$im_base_release(new C4IX() { // from class: X.4IR
                        @Override // X.C4IX
                        public final void LLILII() {
                            C4IT.this.onBackPressed();
                        }
                    });
                }
            }
            if (c4iv2 == null) {
                return;
            }
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(c4iv2, 226), c4ip.itemView);
            return;
        }
        if (!(holder instanceof C4IQ)) {
            return;
        }
        C4IQ c4iq = (C4IQ) holder;
        C4IV c4iv3 = this.LJLJI;
        final C4IU c4iu2 = this.LJLJJLL;
        final C4IT c4it2 = this.LJLJL;
        int i3 = c4iq.LJLIL;
        if (i3 == 0) {
            TextView textView = (TextView) c4iq.itemView.findViewById(R.id.ki5);
            Context context = c4iq.itemView.getContext();
            if (context != null) {
                charSequence = context.getText(R.string.enw);
            }
            textView.setText(charSequence);
        } else if (i3 == 1) {
            final C4IY c4iy2 = (C4IY) c4iq.itemView.findViewById(R.id.kge);
            Context context2 = c4iq.itemView.getContext();
            if (context2 != null) {
                charSequence = context2.getText(R.string.enq);
            }
            c4iy2.setHint(charSequence);
            c4iy2.addTextChangedListener(new TextWatcher() { // from class: X.4IK
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence2, int i32, int i4, int i5) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence2, int i32, int i4, int i5) {
                    C4IU c4iu22;
                    if (charSequence2 == null || c4iy2.getText() == null) {
                        return;
                    }
                    if (ujb.o.LJJJJJL(charSequence2) && charSequence2.length() > 0) {
                        C4IU c4iu3 = c4iu2;
                        if (c4iu3 == null) {
                            return;
                        }
                        c4iu3.LIZ(String.valueOf(c4iy2.getText()));
                        return;
                    }
                    if (s.LJZI(charSequence2).length() == charSequence2.length() || (c4iu22 = c4iu2) == null) {
                        return;
                    }
                    c4iu22.LIZ(String.valueOf(c4iy2.getText()));
                }
            });
            c4iy2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.4IL
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView2, int i32, KeyEvent keyEvent) {
                    int i4 = i32 & 255;
                    if (i4 != 5 && i4 != 6) {
                        return false;
                    }
                    C4IU c4iu22 = c4iu2;
                    if (c4iu22 != null) {
                        c4iu22.LIZ(String.valueOf(c4iy2.getText()));
                    }
                    return true;
                }
            });
            if (c4it2 != null) {
                c4iy2.setKeyImeChangeListener$im_base_release(new C4IX() { // from class: X.4IS
                    @Override // X.C4IX
                    public final void LLILII() {
                        C4IT.this.onBackPressed();
                    }
                });
            }
        }
        if (c4iv3 == null) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(c4iv3, 227), c4iq.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c4im;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        int i2 = R.layout.b_a;
        if (i != 1) {
            int i3 = R.layout.b19;
            if (i != 2 && i != 3) {
                int i4 = this.LJLIL;
                if (i4 == 0) {
                    i3 = R.layout.b__;
                }
                View itemView = C28289B8j.LIZ(parent, i3, parent, false);
                o.LJIIIIZZ(itemView, "itemView");
                c4im = new C4IQ(itemView, i4);
            } else {
                int i5 = this.LJLIL;
                if (i5 != 0) {
                    i2 = R.layout.b19;
                }
                View itemView2 = C28289B8j.LIZ(parent, i2, parent, false);
                o.LJIIIIZZ(itemView2, "itemView");
                c4im = new C4IP(itemView2, i5);
            }
        } else {
            int i6 = this.LJLIL;
            View itemView3 = C28289B8j.LIZ(parent, R.layout.b_a, parent, false);
            o.LJIIIIZZ(itemView3, "itemView");
            c4im = new C4IM(itemView3, i6);
        }
        C0AX.LIZ(parent, c4im.itemView, R.id.lj7);
        View view = c4im.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c4im.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c4im.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c4im.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c4im.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c4im.getClass().getName();
        return c4im;
    }

    public C4IJ(int i, boolean z, C4IV c4iv) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = c4iv;
    }
}
