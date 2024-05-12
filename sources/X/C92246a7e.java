package X;

import android.R;
import kotlin.jvm.internal.o;

/* renamed from: X.a7e, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92246a7e implements InterfaceC91769Zzx {
    @Override // X.InterfaceC91769Zzx
    public final void LIZ(String title, Integer num, InterfaceC07790Sh modifier, InterfaceC91770Zzy size, InterfaceC91771Zzz type, boolean z, boolean z2, C1OH interactionSource, float f, C11850dJ c11850dJ, C11850dJ c11850dJ2, InterfaceC65784Pro<C76800UCe> onClick, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(modifier, "modifier");
        o.LJIIIZ(size, "size");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(interactionSource, "interactionSource");
        o.LJIIIZ(onClick, "onClick");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-25433755);
        int i3 = i >> 6;
        int i4 = i << 3;
        C91986a3S.LIZ(modifier, title, num, z, z2, size, f, type, interactionSource, c11850dJ, c11850dJ2, onClick, LJIL, (i3 & 3670016) | (i3 & 14) | R.string.cancel | (i4 & 112) | (i4 & 896) | (i3 & 7168) | (57344 & i3) | (234881024 & i4) | (i & 1879048192), (i2 & 14) | (i2 & 112), 0);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92873aHl(this, title, num, modifier, size, type, z, z2, interactionSource, f, c11850dJ, c11850dJ2, onClick, i, i2);
    }
}
