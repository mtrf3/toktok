package X;

import android.os.Bundle;
import com.ss.android.ugc.feed.platform.fragment.GenericFeedFragment;
import kotlin.jvm.internal.AqS182S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Ymp, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88407Ymp implements InterfaceC53896LDg {
    public final /* synthetic */ KRA LJLIL;
    public final /* synthetic */ GenericFeedFragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        String str;
        KRA kra = this.LJLIL;
        if (kra != null) {
            str = kra.LIZ;
        } else {
            str = null;
        }
        if (o.LJ(str, "Friends")) {
            GenericFeedFragment genericFeedFragment = this.LJLILLLLZI;
            KUM.LIZLLL(genericFeedFragment, bundle, new AqS182S0100000_16(genericFeedFragment, 38));
        } else {
            GenericFeedFragment genericFeedFragment2 = this.LJLILLLLZI;
            KUM.LIZ(genericFeedFragment2, bundle, this.LJLJI, new AqS182S0100000_16(genericFeedFragment2, 39));
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        String str;
        o.LJIIIZ(args, "args");
        KRA kra = this.LJLIL;
        if (kra != null) {
            str = kra.LIZ;
        } else {
            str = null;
        }
        if (o.LJ(str, "Friends")) {
            GenericFeedFragment genericFeedFragment = this.LJLILLLLZI;
            KUM.LIZLLL(genericFeedFragment, args, new AqS182S0100000_16(genericFeedFragment, 40));
        } else {
            GenericFeedFragment genericFeedFragment2 = this.LJLILLLLZI;
            KUM.LIZIZ(genericFeedFragment2, args, this.LJLJI, new AqS182S0100000_16(genericFeedFragment2, 41));
        }
    }

    public C88407Ymp(KRA kra, GenericFeedFragment genericFeedFragment, String str) {
        this.LJLIL = kra;
        this.LJLILLLLZI = genericFeedFragment;
        this.LJLJI = str;
    }
}
