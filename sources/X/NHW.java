package X;

import Y.ACListenerS30S0100000_10;
import Y.ARunnableS46S0100000_10;
import Y.IDObjectS182S0100000_10;
import android.content.Context;
import android.os.Handler;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class NHW extends ConstraintLayout implements InterfaceC70422pa {
    public final Handler LJLIL;
    public final T5T LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxIconView LJLJJI;
    public final C105794Df LJLJJL;
    public final LinearLayout LJLJJLL;
    public final C62822Ol8 LJLJL;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C84673XKz LJLL;
    public final MBA LJLLI;
    public final XLM LJLLILLLL;
    public final XLM LJLLJ;
    public final C79863Bm LJLLL;

    private final C85623Xq getTagsAdapter() {
        return (C85623Xq) this.LJLJL.getValue();
    }

    private final IDObjectS182S0100000_10 getTextWatcher() {
        return (IDObjectS182S0100000_10) this.LJLJLLL.getValue();
    }

    public final void LJJLJLI() {
        String charSequence = s.LJZI(String.valueOf(this.LJLILLLLZI.getText())).toString();
        if (charSequence.length() > 0) {
            if (getTagsAdapter().getItemCount() >= 50) {
                this.LJLILLLLZI.clearFocus();
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIIZZ(R.string.eu3);
                c26045AKb.LJIIJ();
                return;
            }
            InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = this.LJLJLJ;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(charSequence);
                return;
            }
            return;
        }
        this.LJLILLLLZI.clearFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LJLL.LIZIZ(null);
        super.onDetachedFromWindow();
    }

    public final void LJJLL() {
        getTagsAdapter().LJLIL = null;
        this.LJLJLJ = null;
    }

    @Override // X.InterfaceC70422pa
    public MBA getCoroutineContext() {
        return this.LJLLI;
    }

    public final void setAddTagAction(InterfaceC88472Yns<? super String, C76800UCe> action) {
        o.LJIIIZ(action, "action");
        this.LJLJLJ = action;
    }

    public final void setDeleteTagAction(InterfaceC88472Yns<? super Integer, C76800UCe> action) {
        o.LJIIIZ(action, "action");
        getTagsAdapter().LJLIL = action;
    }

    public final void setLoadingState(boolean z) {
        if (z) {
            this.LJLLJ.setValue(new NHU(false));
            this.LJLIL.postDelayed(new ARunnableS46S0100000_10(this, 53), 600L);
        } else {
            this.LJLIL.removeCallbacksAndMessages(null);
            this.LJLLJ.setValue(NHV.LIZ);
        }
    }

    public final void setTags(List<String> tags) {
        o.LJIIIZ(tags, "tags");
        getTagsAdapter().submitList(tags);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NHW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NHW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = new Handler(C16880lQ.LLJJJJ());
        this.LJLJL = C221108m2.LIZIZ(NHX.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 244));
        C84673XKz LJIILIIL = C79146V4k.LJIILIIL();
        this.LJLL = LJIILIIL;
        this.LJLLI = LJIILIIL.plus(C36636EZk.LIZ);
        XLM LIZ = V8H.LIZ(null);
        this.LJLLILLLL = LIZ;
        XLM LIZ2 = V8H.LIZ(new NHU(false));
        this.LJLLJ = LIZ2;
        C70342pS c70342pS = new C70342pS(LIZ, LIZ2, new NHS(null));
        C3BD.LIZ.getClass();
        this.LJLLL = V1M.LJJJJLI(c70342pS, this, C3BE.LIZIZ, Boolean.TRUE);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.b73, C16880lQ.LLZIL(context), this);
        View findViewById = LLLZIIL.findViewById(R.id.cqb);
        TextView textView = (TextView) findViewById;
        textView.setFilters(new InputFilter[]{new NHY()});
        textView.addTextChangedListener(getTextWatcher());
        o.LJIIIIZZ(findViewById, "rootView.findViewById<Tu…er(textWatcher)\n        }");
        this.LJLILLLLZI = (T5T) findViewById;
        View findViewById2 = LLLZIIL.findViewById(R.id.lyz);
        C16880lQ.LJJJJI((TuxTextView) findViewById2, new ACListenerS30S0100000_10(this, 49));
        o.LJIIIIZZ(findViewById2, "rootView.findViewById<Tu…{ addNewTag() }\n        }");
        this.LJLJI = (TuxTextView) findViewById2;
        View findViewById3 = LLLZIIL.findViewById(R.id.eb6);
        C16880lQ.LJJJ((TuxIconView) findViewById3, new ACListenerS30S0100000_10(this, 50));
        o.LJIIIIZZ(findViewById3, "rootView.findViewById<Tu…)\n            }\n        }");
        this.LJLJJI = (TuxIconView) findViewById3;
        View findViewById4 = LLLZIIL.findViewById(R.id.l05);
        RecyclerView recyclerView = (RecyclerView) findViewById4;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context, 0);
        flexboxLayoutManager.LLIZLLLIL(1);
        flexboxLayoutManager.LLIZ(0);
        flexboxLayoutManager.LLILZLL(4);
        flexboxLayoutManager.LLJ(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setAdapter(getTagsAdapter());
        o.LJIIIIZZ(findViewById4, "rootView.findViewById<Ta…r = tagsAdapter\n        }");
        this.LJLJJL = (C105794Df) findViewById4;
        View findViewById5 = LLLZIIL.findViewById(R.id.g8b);
        o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.id.loading_content)");
        this.LJLJJLL = (LinearLayout) findViewById5;
        XKX.LIZLLL(this, null, null, new NHQ(this, null), 3);
        XKX.LIZLLL(this, null, null, new NHR(this, null), 3);
    }
}
