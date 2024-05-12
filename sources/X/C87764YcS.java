package X;

import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol;
import kotlin.jvm.internal.AqS166S0100000_16;

/* renamed from: X.YcS, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87764YcS extends AbstractC87761YcP {
    public final String LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final WaterMarkAbilityProtocol LJIIIZ;

    @Override // X.AbstractC87761YcP
    public final String LJFF() {
        return "WaterMarkAbility";
    }

    @Override // X.AbstractC87761YcP
    public final void LJII() {
        DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol = this.LJFF;
        if (downloadMobProtocol != null) {
            downloadMobProtocol.LJIJJLI();
        }
        this.LJIIIZ.LJIIIIZZ(new C87753YcH(this));
        this.LJIIIZ.LJ(0L, 0L, LJ().LJLJI, this.LJ, this.LJII);
        C62737Ojl.LIZJ("WaterMarkAbility", "finish init");
        C10K.LIZIZ(new CallableC87765YcT(this), C38995FSd.LIZLLL(), null);
    }

    @Override // X.OBL
    public final void cancel() {
        this.LJIIIZ.LIZ();
    }

    public C87764YcS(AbstractC44957Hkf abstractC44957Hkf, WaterMarkAbilityProtocol waterMarkAbilityProtocol) {
        super(abstractC44957Hkf);
        this.LJIIIZ = waterMarkAbilityProtocol;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(abstractC44957Hkf.LIZIZ());
        LIZ.append(abstractC44957Hkf.LIZ);
        LIZ.append("_watermark");
        LIZ.append(abstractC44957Hkf.LIZJ);
        this.LJII = X1D.LIZIZ(LIZ);
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS166S0100000_16(this, 4));
    }
}
