package X;

import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import kotlin.jvm.internal.o;

/* renamed from: X.1yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50571yf extends AbstractC65781Prl implements InterfaceC65784Pro<BoringLayout.Metrics> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ CharSequence LJLILLLLZI;
    public final /* synthetic */ TextPaint LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50571yf(int i, C17650mf c17650mf, CharSequence charSequence) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = charSequence;
        this.LJLJI = c17650mf;
    }

    @Override // X.InterfaceC65784Pro
    public final BoringLayout.Metrics invoke() {
        TextDirectionHeuristic LIZ = C0XS.LIZ(this.LJLIL);
        CharSequence text = this.LJLILLLLZI;
        TextPaint paint = this.LJLJI;
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        return C0XD.LIZIZ(text, paint, LIZ);
    }
}
