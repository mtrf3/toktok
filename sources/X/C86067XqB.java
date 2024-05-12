package X;

/* renamed from: X.XqB, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86067XqB extends AbstractC86064Xq8<C86067XqB> {
    public String LJFF;
    public String LJI;

    public C86067XqB() {
        super("activity_filter_option_click");
    }

    @Override // X.AbstractC86064Xq8
    public final void LIZIZ() {
        super.LIZIZ();
        String str = this.LJFF;
        if (str != null) {
            LIZ("option_name", str);
        }
        String str2 = this.LJI;
        if (str2 != null) {
            LIZ("action_type", str2);
        }
    }
}
