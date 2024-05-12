package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.SurveyQuestionOption;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;

/* renamed from: X.Opg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63104Opg implements OOK {
    public SurveyQuestionOption LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public Long LJ;
    public Context LJFF;
    public View LJI;
    public View LJII;
    public View LJIIIIZZ;
    public TuxIconView LJIIIZ;
    public TuxTextView LJIIJ;
    public RecyclerView LJIIJJI;
    public View LJIIL;
    public TuxTextView LJIILIIL;
    public TuxIconView LJIILJJIL;
    public SY4 LJIILLIIL;
    public TuxTextView LJIIZILJ;
    public TuxTextView LJIJ;
    public InterfaceC63108Opk LJIJI;
    public C51769KTl LJIJJ;
    public String LJIILL = "";
    public final ACListenerS30S0100000_10 LJIJJLI = new ACListenerS30S0100000_10(this, 116);

    public final void LIZIZ() {
        View view = this.LJII;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJI;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.LJIIIIZZ;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        C51769KTl c51769KTl = this.LJIJJ;
        if (c51769KTl != null) {
            c51769KTl.notifyDataSetChanged();
        }
        View view4 = this.LJIIL;
        if (view4 != null) {
            view4.setEnabled(true);
        }
        TuxIconView tuxIconView = this.LJIILJJIL;
        if (tuxIconView != null) {
            tuxIconView.setEnabled(true);
        }
        View view5 = this.LJIIL;
        if (view5 != null) {
            view5.setVisibility(8);
        }
        TuxTextView tuxTextView = this.LJIILIIL;
        if (tuxTextView != null) {
            tuxTextView.setText("");
        }
        this.LJIILL = "";
        SY4 sy4 = this.LJIILLIIL;
        if (sy4 != null) {
            sy4.setEnabled(false);
            sy4.setClickable(false);
            sy4.setButtonVariant(2);
        }
        TuxTextView tuxTextView2 = this.LJIIZILJ;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setEnabled(true);
    }

    @Override // X.OOK
    public final void LIZ(String str) {
        TuxTextView tuxTextView = this.LJIILIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        if (str == null) {
            str = "";
        }
        this.LJIILL = str;
    }
}
