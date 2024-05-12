package X;

/* renamed from: X.B1t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28117B1t extends C113664d8 {
    public final /* synthetic */ C28111B1n LJLIL;

    public C28117B1t(C28111B1n c28111B1n) {
        this.LJLIL = c28111B1n;
    }

    @Override // X.C113664d8, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.LJLIL.getOnValueChange().invoke(this.LJLIL.getValue());
    }
}
