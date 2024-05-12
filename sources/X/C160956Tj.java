package X;

import android.os.Build;

/* renamed from: X.6Tj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160956Tj extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ C160946Ti LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160956Tj(C160946Ti c160946Ti) {
        super(1);
        this.LJLIL = c160946Ti;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        this.LJLIL.getContentEditText().setClickable(booleanValue);
        this.LJLIL.getContentEditText().setLongClickable(booleanValue);
        if (Build.VERSION.SDK_INT >= 23) {
            this.LJLIL.getContentEditText().setContextClickable(booleanValue);
        }
        return C76800UCe.LIZ;
    }
}
