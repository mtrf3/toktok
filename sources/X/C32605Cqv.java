package X;

import com.bytedance.android.livesdk.gift.model.GiftHintInfo;
import com.bytedance.android.livesdk.hints.GiftHintsManager;

/* renamed from: X.Cqv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32605Cqv implements InterfaceC19890qH {
    public final /* synthetic */ GiftHintInfo LJLIL;
    public final /* synthetic */ C32603Cqt LJLILLLLZI;
    public final /* synthetic */ C32633CrN LJLJI;

    public C32605Cqv(GiftHintInfo giftHintInfo, C32603Cqt c32603Cqt, C32633CrN c32633CrN) {
        this.LJLIL = giftHintInfo;
        this.LJLILLLLZI = c32603Cqt;
        this.LJLJI = c32633CrN;
    }

    @Override // X.InterfaceC19890qH
    public final void onShow() {
        EnumC32606Cqw enumC32606Cqw;
        C32650Cre.LIZ = true;
        GiftHintsManager giftHintsManager = GiftHintsManager.LJLIL;
        GiftHintInfo giftHintInfo = this.LJLIL;
        long j = giftHintInfo.giftId;
        int i = giftHintInfo.hintId;
        giftHintsManager.getClass();
        if (i == CHF.FANS_CLUB_JOIN_GIFT.getHintId()) {
            enumC32606Cqw = EnumC32606Cqw.FANS_CLUB_JOIN_GIFT;
        } else if (i == CHF.RANDOM_FIREWORKS.getHintId()) {
            enumC32606Cqw = EnumC32606Cqw.RANDOM_FIREWORKS;
        } else {
            enumC32606Cqw = EnumC32606Cqw.UNKNOWN;
        }
        C32793Ctx.LIZIZ(Long.valueOf(j), enumC32606Cqw, 0);
        CHF.Companion.getClass();
        CHF chf = CHF.enumMap.get(Integer.valueOf(i));
        if (chf != null) {
            chf.markShown();
        }
        this.LJLILLLLZI.LIZLLL(this.LJLJI);
    }
}
