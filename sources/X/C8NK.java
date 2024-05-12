package X;

import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8NK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NK extends C8NL<ReusedUIContentAssem<? extends C3C8>> {
    public ReusedUIContentAssem<? extends C3C8> LIZJ;
    public int LIZLLL;
    public int LJ;
    public View LJFF;
    public C212518Vr LJI = C212518Vr.LIZ;

    @Override // X.C8NL, X.C8VP
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ReusedUIContentAssem<? extends C3C8> build() {
        ReusedUIContentAssem<? extends C3C8> reusedUIContentAssem = (ReusedUIContentAssem) super.build();
        reusedUIContentAssem.LJLZ = this.LIZLLL;
        reusedUIContentAssem.LJZ = this.LJ;
        o.LJIIIZ(this.LJI, "<set-?>");
        View view = this.LJFF;
        if (view != null) {
            reusedUIContentAssem.setContainerView(view);
        }
        return reusedUIContentAssem;
    }

    @Override // X.C8NL
    public final /* bridge */ /* synthetic */ ReusedUIContentAssem<? extends C3C8> LIZJ() {
        return this.LIZJ;
    }
}
