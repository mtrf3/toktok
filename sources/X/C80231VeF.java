package X;

import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: X.VeF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80231VeF extends QXX {
    public final /* synthetic */ TextPaint LJLIL;
    public final /* synthetic */ QXX LJLILLLLZI;
    public final /* synthetic */ C80229VeD LJLJI;

    @Override // X.QXX
    public final void LLLF(int i) {
        this.LJLILLLLZI.LLLF(i);
    }

    @Override // X.QXX
    public final void LLLFF(Typeface typeface, boolean z) {
        this.LJLJI.LIZLLL(this.LJLIL, typeface);
        this.LJLILLLLZI.LLLFF(typeface, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80231VeF(C80229VeD c80229VeD, TextPaint textPaint, QXX qxx) {
        super((Object) null);
        this.LJLJI = c80229VeD;
        this.LJLIL = textPaint;
        this.LJLILLLLZI = qxx;
    }
}
