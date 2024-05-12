package X;

import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161296Ur {
    public final C6U6 LIZ;
    public final InterfaceC65784Pro<Boolean> LIZIZ;
    public final InterfaceC65784Pro<Boolean> LIZJ;
    public final InterfaceC65784Pro<Integer> LIZLLL;

    public C161296Ur(C6U6 c6u6, AqS152S0100000_2 aqS152S0100000_2, AqS152S0100000_2 aqS152S0100000_22, AqS152S0100000_2 aqS152S0100000_23, int i) {
        c6u6 = (i & 1) != 0 ? null : c6u6;
        InterfaceC65784Pro isFollowAddYours = aqS152S0100000_2;
        isFollowAddYours = (i & 2) != 0 ? C161336Uv.LJLIL : isFollowAddYours;
        InterfaceC65784Pro isFromQA = aqS152S0100000_22;
        isFromQA = (i & 4) != 0 ? C161346Uw.LJLIL : isFromQA;
        InterfaceC65784Pro addYoursStickerButtonTextId = aqS152S0100000_23;
        addYoursStickerButtonTextId = (i & 8) != 0 ? C161326Uu.LJLIL : addYoursStickerButtonTextId;
        o.LJIIIZ(isFollowAddYours, "isFollowAddYours");
        o.LJIIIZ(isFromQA, "isFromQA");
        o.LJIIIZ(addYoursStickerButtonTextId, "addYoursStickerButtonTextId");
        this.LIZ = c6u6;
        this.LIZIZ = isFollowAddYours;
        this.LIZJ = isFromQA;
        this.LIZLLL = addYoursStickerButtonTextId;
    }
}
