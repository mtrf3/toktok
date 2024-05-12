package Y;

import X.C0WP;
import X.C15750jb;
import X.C1QC;
import X.C1VH;
import X.C33771Uf;
import X.C41581kA;
import X.C41591kB;
import X.C73433Srt;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import android.text.TextUtils;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDuS74S0200000 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<List<C1QC>> interfaceC73573Su9) {
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
            default:
                return;
        }
    }

    public static final void subscribe$0(IDuS74S0200000 iDuS74S0200000, InterfaceC73573Su9 interfaceC73573Su9) {
        C41581kA c41581kA = (C41581kA) iDuS74S0200000.l0;
        C0WP<T> c0wp = c41581kA.LIZJ;
        List<C1QC> LJIIJJI = c41581kA.LIZIZ.LJIIJJI((EffectChannelResponse) iDuS74S0200000.l1);
        c0wp.LJIIZILJ(LJIIJJI);
        interfaceC73573Su9.onNext(LJIIJJI);
    }

    public static final void subscribe$1(IDuS74S0200000 iDuS74S0200000, InterfaceC73573Su9 interfaceC73573Su9) {
        C41591kB c41591kB = (C41591kB) iDuS74S0200000.l0;
        C0WP<T> c0wp = c41591kB.LIZJ;
        List<C1QC> LJIIJJI = c41591kB.LIZIZ.LJIIJJI((EffectChannelResponse) iDuS74S0200000.l1);
        c0wp.LJIIZILJ(LJIIJJI);
        interfaceC73573Su9.onNext(LJIIJJI);
    }

    public static final void subscribe$2(IDuS74S0200000 iDuS74S0200000, InterfaceC73573Su9 interfaceC73573Su9) {
        C33771Uf c33771Uf = (C33771Uf) iDuS74S0200000.l0;
        final FilterModel filterModel = (FilterModel) iDuS74S0200000.l1;
        c33771Uf.getClass();
        C33771Uf c33771Uf2 = C15750jb.LIZ;
        String id = filterModel.getEffect().getId();
        String tagsUpdatedAt = filterModel.getEffect().getTagsUpdatedAt();
        final C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener = new IIsTagNeedUpdatedListener() { // from class: X.1Ud
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedNotUpdate() {
                FilterModel.this.isNew = false;
                c73433Srt.onComplete();
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedUpdate() {
                FilterModel.this.isNew = true;
                c73433Srt.onComplete();
            }
        };
        if (c33771Uf2.LIZIZ == null || id == null || tagsUpdatedAt == null || TextUtils.equals("NULL", tagsUpdatedAt.toUpperCase())) {
            iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
        } else {
            c33771Uf2.LIZIZ.isTagUpdated(id, tagsUpdatedAt, iIsTagNeedUpdatedListener);
        }
    }

    public static final void subscribe$3(IDuS74S0200000 iDuS74S0200000, InterfaceC73573Su9 interfaceC73573Su9) {
        String str;
        C1VH c1vh = (C1VH) iDuS74S0200000.l0;
        Effect effect = ((LiveEffect) iDuS74S0200000.l1).getEffect();
        String str2 = null;
        if (effect != null) {
            str = effect.getId();
        } else {
            str = null;
        }
        Effect effect2 = ((LiveEffect) iDuS74S0200000.l1).getEffect();
        if (effect2 != null) {
            str2 = effect2.getTagsUpdatedAt();
        }
        final LiveEffect liveEffect = (LiveEffect) iDuS74S0200000.l1;
        final C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener = new IIsTagNeedUpdatedListener() { // from class: X.1VJ
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedNotUpdate() {
                LiveEffect.this.isNew = false;
                c73433Srt.onComplete();
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedUpdate() {
                LiveEffect.this.isNew = true;
                c73433Srt.onComplete();
            }
        };
        if (c1vh.LJ != null && str != null && str2 != null) {
            String upperCase = str2.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (!TextUtils.equals("NULL", upperCase)) {
                c1vh.LJ.isTagUpdated(str, str2, iIsTagNeedUpdatedListener);
                return;
            }
        }
        iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDuS74S0200000(Object obj, C41581kA<T> c41581kA, EffectChannelResponse effectChannelResponse) {
        this.$t = effectChannelResponse;
        this.l0 = obj;
        this.l1 = c41581kA;
    }
}
