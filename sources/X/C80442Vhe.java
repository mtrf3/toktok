package X;

import android.graphics.Typeface;

/* renamed from: X.Vhe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80442Vhe extends QXX {
    public final /* synthetic */ C80438Vha LJLIL;

    @Override // X.QXX
    public final void LLLF(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80442Vhe(C80438Vha c80438Vha) {
        super((Object) null);
        this.LJLIL = c80438Vha;
    }

    @Override // X.QXX
    public final void LLLFF(Typeface typeface, boolean z) {
        CharSequence text;
        C80438Vha c80438Vha = this.LJLIL;
        C80437VhZ c80437VhZ = c80438Vha.LJLJJL;
        if (c80437VhZ.LLLF) {
            text = c80437VhZ.LLIIII;
        } else {
            text = c80438Vha.getText();
        }
        c80438Vha.setText(text);
        this.LJLIL.requestLayout();
        this.LJLIL.invalidate();
    }
}
