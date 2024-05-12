package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol;
import kotlin.jvm.internal.AqS166S0100000_16;

/* renamed from: X.YcG, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87752YcG extends AbstractC87761YcP {
    public final String LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public String LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C87751YcF LJIIL;
    public final DownloadAbilityProtocol LJIILIIL;

    @Override // X.AbstractC87761YcP
    public final String LJFF() {
        return "DownloadAbility";
    }

    public final YXV LJIIIIZZ() {
        return (YXV) this.LJIIJJI.getValue();
    }

    @Override // X.AbstractC87761YcP
    public final void LJII() {
        P8N.LIZ(this.LJI.LIZIZ(), false);
        this.LJIILIIL.LJII(this.LJIIL);
        DownloadAbilityProtocol downloadAbilityProtocol = this.LJIILIIL;
        String str = LJIIIIZZ().LJLILLLLZI;
        String str2 = (String) ListProtector.get(LJIIIIZZ().LJLIL, this.LJIIIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJI.LIZ);
        LIZ.append("_download");
        LIZ.append(this.LJI.LIZJ);
        if (downloadAbilityProtocol.LJIIIIZZ(str, str2, X1D.LIZIZ(LIZ), this.LJI.LIZIZ())) {
            LJ().LJLJI = true;
            C62737Ojl.LIZJ("DownloadAbility", "use local file");
            return;
        }
        String str3 = (String) ListProtector.get(LJIIIIZZ().LJLIL, this.LJIIIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJI.LIZ);
        LIZ2.append("_download");
        LIZ2.append(this.LJI.LIZJ);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        String LIZIZ2 = this.LJI.LIZIZ();
        this.LJIIJ = str3;
        this.LJIILIIL.LIZJ(str3, LIZIZ, LIZIZ2);
    }

    @Override // X.OBL
    public final void cancel() {
        this.LJIILIIL.LIZ(this.LJI.LIZIZ);
    }

    public C87752YcG(AbstractC44957Hkf abstractC44957Hkf, DownloadAbilityProtocol downloadAbilityProtocol) {
        super(abstractC44957Hkf);
        this.LJIILIIL = downloadAbilityProtocol;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(abstractC44957Hkf.LIZIZ());
        LIZ.append(abstractC44957Hkf.LIZ);
        LIZ.append("_download");
        LIZ.append(abstractC44957Hkf.LIZJ);
        this.LJII = X1D.LIZIZ(LIZ);
        this.LJIIJ = "";
        this.LJIIJJI = C221108m2.LIZIZ(new AqS166S0100000_16(this, 2));
        this.LJIIL = new C87751YcF(this, abstractC44957Hkf);
    }
}
