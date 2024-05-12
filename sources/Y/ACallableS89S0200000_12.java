package Y;

import X.C32I;
import X.C74517TMj;
import X.C74551TNr;
import X.C74552TNs;
import X.C74558TNy;
import X.C76800UCe;
import X.C78866UxK;
import X.EnumC74555TNv;
import X.InterfaceC73367Sqp;
import X.SWH;
import X.TEA;
import X.TOI;
import X.TOK;
import X.TOM;
import X.TOR;
import X.ViewOnClickListenerC74332TFg;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.assem.music.addtodsp.AddToMusicDspButtonAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes13.dex */
public class ACallableS89S0200000_12 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS89S0200000_12 aCallableS89S0200000_12) {
        return ((C74551TNr) aCallableS89S0200000_12.l0).LIZIZ.LIZIZ((InfoStickerEffect) aCallableS89S0200000_12.l1, true).LJJIJL(new IDhS105S0100000_12(aCallableS89S0200000_12, 0));
    }

    public static final Object call$1(ACallableS89S0200000_12 aCallableS89S0200000_12) {
        EnumC74555TNv enumC74555TNv;
        List<InfoStickerEffect> list = (List) aCallableS89S0200000_12.l1;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (InfoStickerEffect infoStickerEffect : list) {
            String LIZ = ((C74552TNs) aCallableS89S0200000_12.l0).LIZJ.LIZ(infoStickerEffect);
            if (C78866UxK.LJIJJLI(((C74552TNs) aCallableS89S0200000_12.l0).LIZLLL, infoStickerEffect)) {
                enumC74555TNv = EnumC74555TNv.SEARCH_STICKER_STICKER_DOWNLOADING;
            } else if (((C74552TNs) aCallableS89S0200000_12.l0).LIZJ.LIZIZ(infoStickerEffect)) {
                enumC74555TNv = EnumC74555TNv.SEARCH_STICKER_STICKER_DOWNLOAD_SUCCESS;
            } else {
                enumC74555TNv = EnumC74555TNv.SEARCH_STICKER_STICKER_NOT_DOWNLOAD;
            }
            arrayList.add(new C74558TNy(enumC74555TNv, LIZ));
        }
        return arrayList;
    }

    public static final Object call$2(ACallableS89S0200000_12 aCallableS89S0200000_12) {
        List<Effect> effects = ((CategoryEffectModel) aCallableS89S0200000_12.l0).getEffects();
        InterfaceC73367Sqp interfaceC73367Sqp = (InterfaceC73367Sqp) aCallableS89S0200000_12.l1;
        Iterator<Effect> it = effects.iterator();
        while (it.hasNext()) {
            interfaceC73367Sqp.LIZJ(it.next(), false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS89S0200000_12 aCallableS89S0200000_12) {
        return ((ViewOnClickListenerC74332TFg) aCallableS89S0200000_12.l0).LLIIJI.invoke(((Effect) aCallableS89S0200000_12.l1).getDesignerId(), ((Effect) aCallableS89S0200000_12.l1).getDesignerEncryptedId());
    }

    public static final Object call$4(ACallableS89S0200000_12 aCallableS89S0200000_12) {
        VideoMusicTitleAssem.I4((Aweme) aCallableS89S0200000_12.l0, (VideoMusicTitleAssem) aCallableS89S0200000_12.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$5(ACallableS89S0200000_12 aCallableS89S0200000_12) {
        AddToMusicDspButtonAssem.q4((Aweme) aCallableS89S0200000_12.l0, (AddToMusicDspButtonAssem) aCallableS89S0200000_12.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS89S0200000_12 aCallableS89S0200000_12) {
        SWH.LJ((Aweme) aCallableS89S0200000_12.l0, (VideoItemParams) aCallableS89S0200000_12.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$7(ACallableS89S0200000_12 aCallableS89S0200000_12) {
        TEA tea;
        List<Effect> list = (List) aCallableS89S0200000_12.l1;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (Effect effect : list) {
            if (C78866UxK.LJIJJLI(((C74517TMj) aCallableS89S0200000_12.l0).LIZLLL, effect)) {
                tea = TEA.DOWNLOADING;
            } else if (((C74517TMj) aCallableS89S0200000_12.l0).LIZJ.LIZ(effect)) {
                tea = TEA.DOWNLOAD_SUCCESS;
            } else {
                tea = TEA.NOT_DOWNLOAD;
            }
            arrayList.add(tea);
        }
        return arrayList;
    }

    public static final Object call$8(ACallableS89S0200000_12 aCallableS89S0200000_12) {
        return ((TOI) aCallableS89S0200000_12.l0).LIZIZ.LIZIZ((ProviderEffect) aCallableS89S0200000_12.l1, true).LJJIJL(new IDhS105S0100000_12(aCallableS89S0200000_12, 38));
    }

    public static final Object call$9(ACallableS89S0200000_12 aCallableS89S0200000_12) {
        TOM tom;
        List<ProviderEffect> list = (List) aCallableS89S0200000_12.l1;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (ProviderEffect providerEffect : list) {
            String LIZIZ = ((TOK) aCallableS89S0200000_12.l0).LIZLLL.LIZIZ(providerEffect);
            if (C78866UxK.LJIJJLI(((TOK) aCallableS89S0200000_12.l0).LIZJ, providerEffect)) {
                tom = TOM.PROVIDER_STICKER_STATE_DOWNLOADING;
            } else if (((TOK) aCallableS89S0200000_12.l0).LIZLLL.LIZ(providerEffect)) {
                tom = TOM.PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS;
            } else {
                tom = TOM.PROVIDER_STICKER_STATE_NOT_DOWNLOAD;
            }
            arrayList.add(new TOR(tom, LIZIZ));
        }
        return arrayList;
    }

    public ACallableS89S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
