package X;

import Y.ACListenerS34S0100000_14;
import Y.ARunnableS50S0100000_14;
import Y.IDrS52S0100000_14;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Vri, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81066Vri extends ConstraintLayout {
    public final TextView LJLIL;
    public final View LJLILLLLZI;
    public final RecyclerView LJLJI;
    public InterfaceC81070Vrm LJLJJI;
    public final C71831SHb LJLJJL;
    public final LinearLayoutManager LJLJJLL;
    public String LJLJL;

    public final void LJJZZI() {
        int LLIL = this.LJLJJLL.LLIL();
        int LLILLIZIL = this.LJLJJLL.LLILLIZIL();
        List<String> currentList = this.LJLJJL.getCurrentList();
        o.LJIIIIZZ(currentList, "horizontalPickerAdapter.currentList");
        if (LLIL < 0 || LLILLIZIL < 0 || LLIL > LLILLIZIL) {
            return;
        }
        while (true) {
            String category = (String) ListProtector.get(currentList, LLIL);
            InterfaceC81070Vrm interfaceC81070Vrm = this.LJLJJI;
            if (interfaceC81070Vrm != null) {
                o.LJIIIIZZ(category, "category");
                interfaceC81070Vrm.LIZ(category);
            }
            if (LLIL != LLILLIZIL) {
                LLIL++;
            } else {
                return;
            }
        }
    }

    public final void LJJLL(boolean z) {
        float f;
        float f2;
        if (!z) {
            this.LJLJJL.LJLIL = false;
        }
        C29B c29b = C17T.LJIJI;
        float f3 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        LJJLJLI(c29b, f, z);
        C29H c29h = C17T.LJIILJJIL;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.75f;
        }
        LJJLJLI(c29h, f2, false);
        C29I c29i = C17T.LJIILL;
        if (!z) {
            f3 = 0.75f;
        }
        LJJLJLI(c29i, f3, false);
    }

    public final void setList(List<String> dataset) {
        o.LJIIIZ(dataset, "dataset");
        this.LJLJJL.submitList(dataset, new ARunnableS50S0100000_14(this, 82));
    }

    public final void setPickerCallback(InterfaceC81070Vrm callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJJI = callback;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C81066Vri(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public static void LJJZ(View view, boolean z) {
        float f;
        if (z) {
            view.setVisibility(0);
        } else {
            view.setClickable(false);
        }
        C29B c29b = C17T.LJIJI;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        C39661h4 c39661h4 = new C39661h4(view, c29b, f);
        c39661h4.LJIL.LIZIZ(977.163f);
        c39661h4.LJIL.LIZ(0.75f);
        c39661h4.LIZ = 0.0f;
        c39661h4.LIZIZ(new C81069Vrl(view, z));
        c39661h4.LJIIIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81066Vri(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        C71831SHb c71831SHb = new C71831SHb(this);
        this.LJLJJL = c71831SHb;
        View inflate = View.inflate(context, R.layout.b0b, this);
        View findViewById = inflate.findViewById(R.id.jme);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.selected_item_text_view)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.jmf);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.s…item_text_view_container)");
        this.LJLILLLLZI = findViewById2;
        if (C99W.LIZ) {
            findViewById2.setBackground(context.getDrawable(R.drawable.a_w));
        }
        View findViewById3 = inflate.findViewById(R.id.e75);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.h…tal_picker_recycler_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        this.LJLJI = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, C90193gN.LIZ());
        this.LJLJJLL = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(c71831SHb);
        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 21), findViewById2);
        recyclerView.LJIIJJI(new IDrS52S0100000_14(this, 0));
    }

    public final void LJJLJLI(AbstractC45091pp abstractC45091pp, float f, boolean z) {
        if (z) {
            C39661h4 c39661h4 = new C39661h4(this.LJLJI, abstractC45091pp, f);
            c39661h4.LJIL.LIZIZ(977.163f);
            c39661h4.LJIL.LIZ(0.75f);
            c39661h4.LIZ = 0.0f;
            c39661h4.LIZIZ(new C81068Vrk(this));
            c39661h4.LJIIIZ();
            return;
        }
        C39661h4 c39661h42 = new C39661h4(this.LJLJI, abstractC45091pp, f);
        c39661h42.LJIL.LIZIZ(977.163f);
        c39661h42.LJIL.LIZ(0.75f);
        c39661h42.LIZ = 0.0f;
        c39661h42.LJIIIZ();
    }
}
