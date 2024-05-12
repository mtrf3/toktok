package X;

import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TNG implements InterfaceC74529TMv {
    public final HashMap<String, Effect> LIZ;
    public final InterfaceC73389SrB LIZIZ;
    public final InterfaceC65784Pro<TNV> LIZJ;
    public final TNX LIZLLL;
    public final InterfaceC65784Pro<InterfaceC84497XEf> LJ;
    public final boolean LJFF;

    @Override // X.InterfaceC74529TMv
    public final boolean LIZ(Effect effect, boolean z) {
        o.LJIIIZ(effect, "effect");
        boolean containsKey = this.LIZ.containsKey(effect.getId());
        if (z) {
            if (containsKey || this.LIZIZ.LIZIZ(effect)) {
                return true;
            }
            return false;
        }
        return containsKey;
    }

    @Override // X.TOA
    public final void LIZIZ(C74397THt c74397THt, TO7<C74397THt, Effect, C44368HbA> to7) {
        List<String> music;
        String str;
        C74397THt key = c74397THt;
        o.LJIIIZ(key, "key");
        boolean LIZ = this.LIZIZ.LIZ(key.LJLIL);
        TNH tnh = new TNH(this, to7);
        this.LIZJ.invoke().LIZ(key.LJLIL);
        Effect effect = key.LJLIL;
        if (!V3N.LJJII(effect) || (music = effect.getMusic()) == null || music.isEmpty()) {
            if (LIZ) {
                tnh.LJIIJJI(key, key.LJLIL);
                return;
            } else {
                LIZJ(key, new TNJ(key, tnh));
                return;
            }
        }
        this.LIZLLL.LIZLLL(effect);
        TNI tni = new TNI(key, tnh);
        if (LIZ) {
            tni.LIZLLL(key, key.LJLIL);
        } else {
            LIZJ(key, tni);
        }
        List<String> music2 = key.LJLIL.getMusic();
        if (music2 != null && (str = (String) ORZ.LJLLLL(music2)) != null) {
            this.LIZJ.invoke().LIZIZ(str, new TNP(tni), new TNN(tni), new TNL(tni), !LIZ(key.LJLIL, false));
        } else {
            tni.onFailed();
        }
    }

    public final void LIZJ(C74397THt c74397THt, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
        TNY tny;
        EnumC44267HYx enumC44267HYx;
        if (this.LJFF) {
            TID tid = c74397THt.LJLJI;
            if (tid != null) {
                enumC44267HYx = tid.LIZLLL;
            } else {
                enumC44267HYx = null;
            }
            if (enumC44267HYx == EnumC44267HYx.UI_CLICK) {
                this.LJ.invoke().LIZJ(c74397THt.LJLIL, true, true, true, iEffectDownloadProgressListener);
                return;
            }
        }
        TID tid2 = c74397THt.LJLJI;
        if (tid2 != null && (tny = tid2.LJIIJ) != null && tny.LIZ) {
            this.LJ.invoke().LJJIII(c74397THt.LJLIL, c74397THt.LJLJI.LJIIJ.LIZIZ, iEffectDownloadProgressListener);
        } else {
            this.LJ.invoke().LJJIIZI(c74397THt.LJLIL, iEffectDownloadProgressListener);
        }
    }

    public TNG(InterfaceC73389SrB fileService, AqS162S0100000_12 aqS162S0100000_12, C78248UnM c78248UnM, AqS162S0100000_12 aqS162S0100000_122, boolean z) {
        o.LJIIIZ(fileService, "fileService");
        this.LIZIZ = fileService;
        this.LIZJ = aqS162S0100000_12;
        this.LIZLLL = c78248UnM;
        this.LJ = aqS162S0100000_122;
        this.LJFF = z;
        this.LIZ = new HashMap<>();
    }
}
