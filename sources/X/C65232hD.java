package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.2hD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65232hD extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65232hD(boolean z, int i, boolean z2) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = z2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        if (!this.LJLIL) {
            str = "invalid";
        } else if (this.LJLILLLLZI > 0) {
            str = "count";
        } else if (this.LJLJI) {
            str = "dot";
        } else {
            str = LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        C3K5.LJLLILLLL = str;
        C3K5.LJFF();
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C65202hA(null), 3);
        return C76800UCe.LIZ;
    }
}
