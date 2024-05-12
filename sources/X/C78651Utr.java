package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.relation.monitor.RecUserBehaviorMonImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Utr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78651Utr implements InterfaceC53896LDg {
    public final /* synthetic */ RecUserBehaviorMonImpl LJLIL;
    public final /* synthetic */ com.bytedance.hox.Hox LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        this.LJLIL.k0();
        this.LJLILLLLZI.zv0(this.LJLJI, this);
    }

    public C78651Utr(RecUserBehaviorMonImpl recUserBehaviorMonImpl, com.bytedance.hox.Hox hox, String str) {
        this.LJLIL = recUserBehaviorMonImpl;
        this.LJLILLLLZI = hox;
        this.LJLJI = str;
    }
}
