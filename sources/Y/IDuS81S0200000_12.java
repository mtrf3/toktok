package Y;

import X.C109444Rg;
import X.C109454Rh;
import X.C58232MtI;
import X.C72708SgC;
import X.C72921Sjd;
import X.C72927Sjj;
import X.C73433Srt;
import X.C73574SuA;
import X.C73575SuB;
import X.C74433TJd;
import X.C74434TJe;
import X.C74515TMh;
import X.C74551TNr;
import X.C74556TNw;
import X.C74558TNy;
import X.C780334l;
import X.C78613UtF;
import X.C84499XEh;
import X.EnumC74519TMl;
import X.EnumC74555TNv;
import X.InterfaceC65462ha;
import X.InterfaceC73573Su9;
import X.InterfaceC84497XEf;
import X.InterfaceC86003Zc;
import X.MBA;
import X.TJF;
import X.TJG;
import X.TJH;
import X.TJI;
import X.TJY;
import X.TOI;
import X.TOM;
import X.TON;
import X.TOR;
import X.TPK;
import X.TPM;
import X.XKX;
import X.XKY;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;

/* loaded from: classes13.dex */
public class IDuS81S0200000_12 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C74556TNw> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            case 3:
                subscribe$3(this, interfaceC73573Su9);
                return;
            case 4:
                subscribe$4(this, interfaceC73573Su9);
                return;
            case 5:
                subscribe$5(this, interfaceC73573Su9);
                return;
            case 6:
                subscribe$6(this, interfaceC73573Su9);
                return;
            case 7:
                subscribe$7(this, interfaceC73573Su9);
                return;
            case 8:
                subscribe$8(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public static final void subscribe$0(IDuS81S0200000_12 iDuS81S0200000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        if (((C74551TNr) iDuS81S0200000_12.l0).LIZJ.LIZIZ((InfoStickerEffect) iDuS81S0200000_12.l1)) {
            InfoStickerEffect infoStickerEffect = (InfoStickerEffect) iDuS81S0200000_12.l1;
            interfaceC73573Su9.onNext(new C74556TNw(infoStickerEffect, new C74558TNy(EnumC74555TNv.SEARCH_STICKER_STICKER_DOWNLOAD_SUCCESS, ((C74551TNr) iDuS81S0200000_12.l0).LIZJ.LIZ(infoStickerEffect)), null, null));
        }
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$1(IDuS81S0200000_12 iDuS81S0200000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        TJH tjh = new TJH((C73433Srt) interfaceC73573Su9);
        TJG tjg = (TJG) iDuS81S0200000_12.l0;
        InterfaceC84497XEf interfaceC84497XEf = tjg.LIZLLL;
        String str = tjg.LIZJ;
        TJI tji = (TJI) iDuS81S0200000_12.l1;
        interfaceC84497XEf.LJJIJIL(str, tji.LIZ, tji.LIZIZ, tji.LIZJ, tji.LIZLLL, tji.LJ, tjh);
    }

    public static final void subscribe$2(IDuS81S0200000_12 iDuS81S0200000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        interfaceC73573Su9.setCancellable(new C73574SuA(XKX.LIZJ(C780334l.LJLIL, C78613UtF.LIZIZ.plus((MBA) iDuS81S0200000_12.l0), XKY.ATOMIC, new C73575SuB((InterfaceC65462ha) iDuS81S0200000_12.l1, interfaceC73573Su9, null))));
    }

    public static final void subscribe$3(IDuS81S0200000_12 iDuS81S0200000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        TJF tjf = (TJF) iDuS81S0200000_12.l0;
        InterfaceC84497XEf interfaceC84497XEf = tjf.LIZLLL;
        String str = tjf.LIZJ;
        TJI tji = (TJI) iDuS81S0200000_12.l1;
        String str2 = tji.LIZ;
        C84499XEh.LIZLLL(tji.LIZIZ, tji.LIZJ, tji.LIZLLL, new C72927Sjj((C73433Srt) interfaceC73573Su9), interfaceC84497XEf, str, str2, tji.LJ, tji.LJIIIIZZ, tji.LJII);
    }

    public static final void subscribe$4(IDuS81S0200000_12 iDuS81S0200000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        TJY tjy = (TJY) iDuS81S0200000_12.l0;
        InterfaceC84497XEf interfaceC84497XEf = tjy.LIZLLL;
        String str = tjy.LIZJ;
        TPM tpm = (TPM) iDuS81S0200000_12.l1;
        C84499XEh.LJI(interfaceC84497XEf, str, tpm.LJLJJLL, tpm.LJLIL, tpm.LJLILLLLZI, tpm.LJLJI, tpm.LJLJJI, tpm.LJLJJL, tpm.LJLJL, tpm.LJLJLJ, new TPK(iDuS81S0200000_12, (C73433Srt) interfaceC73573Su9), tjy.LJ, tjy.LJFF, tjy.LJI);
    }

    public static final void subscribe$5(IDuS81S0200000_12 iDuS81S0200000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        ((C72708SgC) iDuS81S0200000_12.l0).LIZJ.LJ((List) iDuS81S0200000_12.l1, true, null, new C72921Sjd((C73433Srt) interfaceC73573Su9));
    }

    public static final void subscribe$6(IDuS81S0200000_12 iDuS81S0200000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        C74433TJd c74433TJd = (C74433TJd) iDuS81S0200000_12.l0;
        c74433TJd.LIZLLL.LJIILIIL(c74433TJd.LIZJ, ((C58232MtI) iDuS81S0200000_12.l1).LIZ, new C74434TJe((C73433Srt) interfaceC73573Su9));
    }

    public static final void subscribe$7(IDuS81S0200000_12 iDuS81S0200000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        if (((C74515TMh) iDuS81S0200000_12.l0).LJFF.LIZ((Effect) iDuS81S0200000_12.l1)) {
            interfaceC73573Su9.onNext(new C109444Rg((Effect) iDuS81S0200000_12.l1, new C109454Rh(EnumC74519TMl.INFO_STICKER_STATE_DOWNLOAD_SUCCESS), null, null));
        }
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$8(IDuS81S0200000_12 iDuS81S0200000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        if (((TOI) iDuS81S0200000_12.l0).LIZJ.LIZ((ProviderEffect) iDuS81S0200000_12.l1)) {
            ProviderEffect providerEffect = (ProviderEffect) iDuS81S0200000_12.l1;
            interfaceC73573Su9.onNext(new TON(providerEffect, new TOR(TOM.PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS, ((TOI) iDuS81S0200000_12.l0).LIZJ.LIZIZ(providerEffect)), null, null));
        }
        interfaceC73573Su9.onComplete();
    }

    public IDuS81S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
