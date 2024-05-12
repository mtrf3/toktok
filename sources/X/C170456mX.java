package X;

import Y.ACListenerS21S0101000_2;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6mX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C170456mX extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLJJL = 0;
    public final C72790ShW LJLIL;
    public final C170466mY LJLILLLLZI;
    public final View LJLJI;
    public final /* synthetic */ C170426mU LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C170456mX(C170426mU c170426mU, View view) {
        super(view);
        this.LJLJJI = c170426mU;
        C72790ShW c72790ShW = (C72790ShW) view.findViewById(R.id.ki1);
        this.LJLIL = c72790ShW;
        C170466mY c170466mY = (C170466mY) view.findViewById(R.id.kk9);
        this.LJLILLLLZI = c170466mY;
        View findViewById = view.findViewById(R.id.kgn);
        this.LJLJI = findViewById;
        c170466mY.setStatusTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, view.getContext()));
        c170466mY.LJJIJIL();
        c170466mY.setHorizontalFadingEdgeEnabled(true);
        c170466mY.setFadingEdgeLength((int) KL2.LIZJ(c170466mY.getContext(), 4.0f));
        c72790ShW.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0101000_2(2, this, 11)));
        c72790ShW.setOnTouchListener(new ViewOnTouchListenerC170476mZ(1.2f, 100L, findViewById));
    }
}
