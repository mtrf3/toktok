package X;

import com.bytedance.android.livesdk.gift.model.GiftIconInfo;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;

/* renamed from: X.Cr4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32614Cr4 implements IHD<Void> {
    public final /* synthetic */ C32609Cqz LIZ;
    public final /* synthetic */ C68322mC<GiftIconInfo> LIZIZ;

    @Override // X.IHD
    public final void LIZ(W4W<Void> w4w) {
    }

    @Override // X.IHD
    public final void LIZIZ(AbstractC48384Iyq abstractC48384Iyq) {
    }

    @Override // X.IHD
    public final void LIZJ(AbstractC48384Iyq abstractC48384Iyq) {
    }

    @Override // X.IHD
    public final void LIZLLL(W4W<Void> w4w) {
        C32609Cqz c32609Cqz = this.LIZ;
        c32609Cqz.LJLLILLLL = EnumC32618Cr8.EVENT;
        c32609Cqz.LJLLJ = C15640jQ.LIZ(this.LIZIZ.element.mEffect);
        ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(this.LIZIZ.element.mIcon, new C32628CrI(this.LIZ));
    }

    public C32614Cr4(C32609Cqz c32609Cqz, C68322mC<GiftIconInfo> c68322mC) {
        this.LIZ = c32609Cqz;
        this.LIZIZ = c68322mC;
    }
}
