package X;

import Y.ACListenerS37S0300000_12;
import Y.ACListenerS46S0200000_12;
import Y.ACListenerS46S1100000_12;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T87 extends T8F {
    public final T84 LJLILLLLZI;
    public T86 LJLJI;

    @Override // X.T8F
    public final void L(C74125T7h c74125T7h) {
        String str;
        C69604RTk c69604RTk;
        String str2;
        int i;
        String str3;
        String str4;
        T86 t86 = (T86) c74125T7h;
        C74143T7z c74143T7z = t86.LJIIIIZZ;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.LJLIL.findViewById(R.id.a69);
        if (constraintLayout != null && (str4 = c74125T7h.LIZIZ) != null) {
            C16880lQ.LJIL(constraintLayout, new ACListenerS46S1100000_12(this, str4, 6));
            constraintLayout.setOnLongClickListener(new T89(this, str4, t86));
        }
        C71799SFv c71799SFv = (C71799SFv) this.LJLIL.findViewById(R.id.a67);
        String str5 = null;
        if (c71799SFv != null) {
            T86 t862 = this.LJLJI;
            if (t862 != null) {
                str3 = t862.LJI;
            } else {
                str3 = null;
            }
            if (!o.LJ(str3, t86.LJI)) {
                String str6 = t86.LJI;
                if (str6 != null) {
                    C71799SFv.LJIIJ(c71799SFv, str6, null, false, null, 126);
                }
                C16880lQ.LJJIL(c71799SFv, new ACListenerS46S0200000_12(this, t86, 27));
            }
        }
        TuxTextView tuxTextView = (TuxTextView) this.LJLIL.findViewById(R.id.a68);
        if (tuxTextView != null) {
            tuxTextView.setText(t86.LJ);
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS46S0200000_12(this, t86, 28));
        }
        TextView textView = (TextView) this.LJLIL.findViewById(R.id.a6_);
        if (textView != null) {
            String str7 = t86.LJFF;
            if (str7 != null) {
                str2 = QZP.LIZIZ("(?m)^[ \t]*\r?\n", str7, "");
            } else {
                str2 = null;
            }
            textView.setText(str2);
            int i2 = 3;
            if (C90193gN.LIZ()) {
                i = 4;
            } else {
                i = 3;
            }
            textView.setTextDirection(i);
            if (C90193gN.LIZ()) {
                i2 = 5;
            }
            textView.setGravity(i2);
        }
        C76S c76s = (C76S) this.LJLIL.findViewById(R.id.lk9);
        if (c76s != null) {
            if (c74143T7z.LIZIZ) {
                c76s.setVisibility(0);
                c76s.setLoading(true);
                c76s.setLoadingText(R.string.dm9);
            } else {
                c76s.setVisibility(8);
            }
        }
        C69604RTk c69604RTk2 = t86.LJII;
        if (c69604RTk2 != null) {
            C71799SFv c71799SFv2 = (C71799SFv) this.LJLIL.findViewById(R.id.a6b);
            if (c71799SFv2 != null) {
                T86 t863 = this.LJLJI;
                if (t863 != null && (c69604RTk = t863.LJII) != null) {
                    str5 = c69604RTk.LIZ;
                }
                if (!o.LJ(str5, c69604RTk2.LIZ)) {
                    String str8 = c69604RTk2.LIZ;
                    if (str8 != null) {
                        C71799SFv.LJIIJ(c71799SFv2, str8, null, false, null, 126);
                    }
                    C16880lQ.LJJIL(c71799SFv2, new ACListenerS46S0200000_12(this, c69604RTk2, 29));
                }
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.LJLIL.findViewById(R.id.a6d);
            if (tuxTextView2 != null) {
                tuxTextView2.setText(c69604RTk2.LIZIZ);
                C16880lQ.LJJJJI(tuxTextView2, new ACListenerS46S0200000_12(this, c69604RTk2, 30));
            }
            TextView textView2 = (TextView) this.LJLIL.findViewById(R.id.a6c);
            if (textView2 != null) {
                textView2.setText(c69604RTk2.LIZJ);
            }
            RecyclerView recyclerView = (RecyclerView) this.LJLIL.findViewById(R.id.a6e);
            if (recyclerView != null) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.LLJJIII(0);
                recyclerView.setLayoutManager(linearLayoutManager);
                SHW shw = new SHW(this.LJLILLLLZI, t86.LJFF);
                recyclerView.setAdapter(shw);
                List<C71830SHa> list = c69604RTk2.LJ;
                if (list != null) {
                    shw.submitList(list);
                }
            }
            View findViewById = this.LJLIL.findViewById(R.id.krl);
            if (findViewById != null && (str = c74125T7h.LIZIZ) != null) {
                C16880lQ.LJIIJ(new ACListenerS37S0300000_12(t86, c69604RTk2, this, 8), findViewById);
                findViewById.setOnLongClickListener(new T8A(this, str, t86));
            }
        }
        this.LJLJI = t86;
    }

    public T87(T84 t84, View view, Context context) {
        super(view);
        this.LJLILLLLZI = t84;
    }
}
