package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Abs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26576Abs extends AbstractC73230Soc<Object> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26576Abs(Fragment owner) {
        super(owner, new C26578Abu(), 4);
        o.LJIIIZ(owner, "owner");
    }

    @Override // X.AbstractC73237Soj
    public final void LJZ(C73242Soo c73242Soo) {
        c73242Soo.LJFF(new AqS170S0100000_4(this, 351), AMZ.LJLIL, null);
    }

    @Override // X.AbstractC73237Soj, X.C4II
    public final int getBasicItemViewType(int i) {
        return this.LJLILLLLZI.LIZIZ(i);
    }
}
