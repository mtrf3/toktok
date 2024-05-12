package X;

import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2;

/* renamed from: X.Bsh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30167Bsh extends AbstractC65781Prl implements InterfaceC88474Ynu<Long, Long, Long, Long, C76800UCe> {
    public final /* synthetic */ CaptionTextWidgetV2 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30167Bsh(CaptionTextWidgetV2 captionTextWidgetV2) {
        super(4);
        this.LJLIL = captionTextWidgetV2;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Long l, Long l2, Long l3, Long l4) {
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        long longValue3 = l3.longValue();
        long longValue4 = l4.longValue();
        C29295Bed c29295Bed = this.LJLIL.LLFII;
        if (c29295Bed != null) {
            c29295Bed.LIZLLL(longValue, longValue2, longValue3, longValue4);
        }
        return C76800UCe.LIZ;
    }
}
