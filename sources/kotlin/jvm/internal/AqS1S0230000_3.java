package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C185657Qj;
import X.C186407Tg;
import X.C186417Th;
import X.C186427Ti;
import X.C186547Tu;
import X.C212518Vr;
import X.C58441Mwf;
import X.C65352Pkq;
import X.C76800UCe;
import X.C77117UOj;
import X.C79043V0l;
import X.C8VL;
import X.FFL;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.detail.prefab.DetailHeaderAssem;
import com.ss.android.ugc.aweme.detail.prefab.DetailPageContainerAssem;
import com.ss.android.ugc.aweme.music.ab.MusicDetailRedesignV2Experiment;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public class AqS1S0230000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;
    public boolean z4;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S0230000_3 aqS1S0230000_3, Object obj) {
        C8VL c8vl = (C8VL) obj;
        o.LJIIIZ(c8vl, "$this$null");
        c8vl.LIZ = C65352Pkq.LIZ(DetailHeaderAssem.class);
        c8vl.LJIIIIZZ = C212518Vr.LIZJ;
        c8vl.LJI("basic_info", C185657Qj.LJLIL);
        c8vl.LJI("advanced_info", new AqS134S0200000_3((MusicDetailFragment) aqS1S0230000_3.l0, (MusicDetail) aqS1S0230000_3.l1, 269));
        c8vl.LJI("buttons", new C58441Mwf(aqS1S0230000_3.z2, aqS1S0230000_3.z3, aqS1S0230000_3.z4));
        c8vl.LJI("custom1", new AqS169S0100000_3((MusicDetail) aqS1S0230000_3.l1, 875));
        C77117UOj.LJIIIZ(c8vl, "advanced_info");
        C77117UOj.LJIIIZ(c8vl, "buttons");
        C77117UOj.LJIIIZ(c8vl, "custom1");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S0230000_3 aqS1S0230000_3, Object obj) {
        C8VL dynamicAssem = (C8VL) obj;
        o.LJIIIZ(dynamicAssem, "$this$dynamicAssem");
        dynamicAssem.LIZ = C65352Pkq.LIZ(DetailPageContainerAssem.class);
        dynamicAssem.LJI = R.id.bul;
        dynamicAssem.LJIIIIZZ = C212518Vr.LIZJ;
        dynamicAssem.LJI("navbar", C186427Ti.LJLIL);
        dynamicAssem.LJI("content", C186417Th.LJLIL);
        dynamicAssem.LJI("header", new AqS1S0230000_3((MusicDetailFragment) aqS1S0230000_3.l0, (MusicDetail) aqS1S0230000_3.l1, aqS1S0230000_3.z2, aqS1S0230000_3.z3, aqS1S0230000_3.z4, 0));
        dynamicAssem.LJI("status", new AqS169S0100000_3((MusicDetailFragment) aqS1S0230000_3.l0, 876));
        dynamicAssem.LJI("record", C186407Tg.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS1S0230000_3 aqS1S0230000_3, Object assemble) {
        o.LJIIIZ(assemble, "$this$assemble");
        MusicDetailFragment musicDetailFragment = (MusicDetailFragment) aqS1S0230000_3.l0;
        C79043V0l.LIZJ(musicDetailFragment, new AqS1S0230000_3(musicDetailFragment, (MusicDetail) aqS1S0230000_3.l1, aqS1S0230000_3.z2, aqS1S0230000_3.z3, aqS1S0230000_3.z4, 1));
        MusicDetailRedesignV2Experiment.LIZ.getClass();
        FFL LJIIIZ = FFL.LJIIIZ();
        MusicDetailRedesignV2Experiment.RedesignFeature redesignFeature = MusicDetailRedesignV2Experiment.LIZIZ;
        LJIIIZ.getClass();
        MusicDetailRedesignV2Experiment.RedesignFeature redesignFeature2 = (MusicDetailRedesignV2Experiment.RedesignFeature) FFL.LJIJ(true, "music_detail_redesign_v2", 31744, MusicDetailRedesignV2Experiment.RedesignFeature.class, redesignFeature);
        if (redesignFeature2 != null && redesignFeature2.gradientColorsBackground) {
            C79043V0l.LIZJ((MusicDetailFragment) aqS1S0230000_3.l0, C186547Tu.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0230000_3(MusicDetailFragment musicDetailFragment, MusicDetail musicDetail, boolean z, boolean z2, boolean z3, int i) {
        super(1);
        this.$t = i;
        this.l0 = musicDetailFragment;
        this.l1 = musicDetail;
        this.z2 = z;
        this.z3 = z2;
        this.z4 = z3;
    }
}
