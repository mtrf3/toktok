package X;

import com.ss.android.ugc.asve.context.PreviewSize;
import kotlin.jvm.internal.o;

/* renamed from: X.WvP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83843WvP extends F9E {
    public final PreviewSize LJLIL;
    public final C5T3 LJLILLLLZI;
    public final EnumC84107Wzf LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C83843WvP(PreviewSize previewSize, C5T3 ratio, EnumC84107Wzf fitMode) {
        o.LJIIIZ(previewSize, "previewSize");
        o.LJIIIZ(ratio, "ratio");
        o.LJIIIZ(fitMode, "fitMode");
        this.LJLIL = previewSize;
        this.LJLILLLLZI = ratio;
        this.LJLJI = fitMode;
    }
}
