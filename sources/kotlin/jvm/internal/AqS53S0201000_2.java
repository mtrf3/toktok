package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass658;
import X.C08630Vn;
import X.C113554cx;
import X.C131555Eh;
import X.C131645Eq;
import X.C152945zO;
import X.C1545864w;
import X.C156906Du;
import X.C167736i9;
import X.C52V;
import X.C63E;
import X.C68322mC;
import X.C6EC;
import X.C6EE;
import X.C6EF;
import X.C6MT;
import X.C76800UCe;
import X.C78688UuS;
import X.H7B;
import X.InterfaceC150095un;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.OSZ;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.audioservice.businessui.soundremixfilter.SoundFilterViewModel;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class AqS53S0201000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS53S0201000_2 aqS53S0201000_2, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C6EC) aqS53S0201000_2.l0).LJLJLJ((C156906Du) aqS53S0201000_2.l1);
        } else {
            H7B.LIZ("audioCopyrightDetectInEdit -> show Authorize Dialog");
            C6EC c6ec = (C6EC) aqS53S0201000_2.l0;
            C6EE.LIZ(c6ec.LLF, c6ec.LJJZZI(), 0);
            C6EC c6ec2 = (C6EC) aqS53S0201000_2.l0;
            C6EF c6ef = c6ec2.LJLILLLLZI;
            FragmentManager supportFragmentManager = ((ActivityC45651qj) C78688UuS.LJIJJ(c6ec2)).getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity as FragmentActi…y).supportFragmentManager");
            c6ef.LJII(supportFragmentManager, C78688UuS.LJIL((C6EC) aqS53S0201000_2.l0), ((C6EC) aqS53S0201000_2.l0).LJJZZI(), ((C6EC) aqS53S0201000_2.l0).LJLILLLLZI.LIZIZ(), new AqS103S0101000_2((C6EC) aqS53S0201000_2.l0, aqS53S0201000_2.i2, 4), new AqS103S0101000_2((C6EC) aqS53S0201000_2.l0, aqS53S0201000_2.i2, 5));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS53S0201000_2 aqS53S0201000_2, Object obj) {
        C6MT setState = (C6MT) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C6MT.LIZ(setState, false, null, null, (List) aqS53S0201000_2.l0, new OSZ(Integer.valueOf(aqS53S0201000_2.i2), ((C68322mC) aqS53S0201000_2.l1).element), 0.0f, false, 0, null, null, null, 2023);
    }

    public static final Object invoke$2(AqS53S0201000_2 aqS53S0201000_2, Object obj) {
        ImageSynthesisResult it = (ImageSynthesisResult) obj;
        o.LJIIIZ(it, "it");
        ((SingleImageData) ListProtector.get((List) aqS53S0201000_2.l0, aqS53S0201000_2.i2)).setSynthesisData(it);
        ((InterfaceC88471Ynr) aqS53S0201000_2.l1).invoke(Integer.valueOf(aqS53S0201000_2.i2), it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS53S0201000_2 aqS53S0201000_2, Object obj) {
        ((Boolean) obj).booleanValue();
        ((C1545864w) aqS53S0201000_2.l0).getEditModel().creativeModel.onThisDayData.getLoadedIndexList().add(Integer.valueOf(aqS53S0201000_2.i2));
        List<TextStickerData> LIZIZ = ((AnonymousClass658) aqS53S0201000_2.l1).LIZIZ();
        C1545864w c1545864w = (C1545864w) aqS53S0201000_2.l0;
        Iterator it = ((ArrayList) LIZIZ).iterator();
        while (it.hasNext()) {
            TextStickerData textStickerData = (TextStickerData) it.next();
            C63E c63e = c1545864w.LJLLLLLL;
            if (c63e != null) {
                c63e.LIZIZ(textStickerData, true);
            } else {
                o.LJIJI("textStickerController");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS53S0201000_2 aqS53S0201000_2, Object obj) {
        Map enumMap;
        Map<C52V, Integer> map;
        C131555Eh setState = (C131555Eh) obj;
        o.LJIIIZ(setState, "$this$setState");
        C08630Vn<Map<C52V, Integer>> c08630Vn = ((C131645Eq) aqS53S0201000_2.l0).LJJLJ().LJ;
        if (c08630Vn != null && (map = c08630Vn.LIZIZ) != null) {
            enumMap = C113554cx.LJJLIL(map);
        } else {
            enumMap = new EnumMap(C52V.class);
        }
        enumMap.put((C52V) aqS53S0201000_2.l1, Integer.valueOf(aqS53S0201000_2.i2));
        return C131555Eh.LIZ(setState, 0L, 0L, null, null, new C08630Vn(enumMap), null, null, 111);
    }

    public static final Object invoke$5(AqS53S0201000_2 aqS53S0201000_2, Object obj) {
        Effect effect = (Effect) obj;
        ((C167736i9) aqS53S0201000_2.l0).LIZ = effect;
        InterfaceC150095un interfaceC150095un = ((SoundFilterViewModel) aqS53S0201000_2.l1).LJLJJL;
        if (interfaceC150095un != null) {
            interfaceC150095un.LIZJ(aqS53S0201000_2.i2, 1);
        }
        ((SoundFilterViewModel) aqS53S0201000_2.l1).gv0(effect);
        InterfaceC150095un interfaceC150095un2 = ((SoundFilterViewModel) aqS53S0201000_2.l1).LJLJJL;
        if (interfaceC150095un2 != null) {
            interfaceC150095un2.LIZIZ(aqS53S0201000_2.i2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0201000_2(C131645Eq c131645Eq, C52V c52v, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c131645Eq;
        this.l1 = c52v;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0201000_2(C1545864w c1545864w, int i, AnonymousClass658 anonymousClass658, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1545864w;
        this.i2 = i;
        this.l1 = anonymousClass658;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0201000_2(C6EC c6ec, C156906Du c156906Du, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c6ec;
        this.l1 = c156906Du;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0201000_2(C167736i9 c167736i9, SoundFilterViewModel soundFilterViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c167736i9;
        this.l1 = soundFilterViewModel;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS53S0201000_2(List list, List<RecommendEffectItem> list2, int i, C68322mC<List<RecommendEffectItem>> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l0 = list;
        this.i2 = list2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0201000_2(List list, int i, C152945zO c152945zO, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = list;
        this.i2 = i;
        this.l1 = c152945zO;
    }
}
