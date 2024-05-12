package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.BPM;
import X.C0NB;
import X.C0YT;
import X.C113554cx;
import X.C12U;
import X.C14480hY;
import X.C14520hc;
import X.C23360vs;
import X.C278217i;
import X.C2A4;
import X.C30868C9o;
import X.C33611Tp;
import X.C37951eJ;
import X.C40741io;
import X.C45101pq;
import X.C70657RoD;
import X.C76732zl;
import X.C76800UCe;
import X.EnumC23500w6;
import X.InterfaceC09420Yo;
import X.InterfaceC11260cM;
import X.InterfaceC21480sq;
import X.InterfaceC23370vt;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.ORZ;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class IDqS40S0300000 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS40S0300000 iDqS40S0300000, Object obj, Object obj2) {
        LiveEffect liveEffect = (LiveEffect) iDqS40S0300000.l0;
        liveEffect.isDownloaded = false;
        liveEffect.isDownloading = false;
        ((C40741io) iDqS40S0300000.l1).LJZ(liveEffect);
        BPM bpm = new BPM();
        bpm.LIZJ = R.string.n8h;
        bpm.LIZLLL = true;
        bpm.LJFF = (DataChannel) iDqS40S0300000.l2;
        bpm.LIZIZ = "pm_multiWallpaper_wallpaperPanel_error_toast";
        C30868C9o.LJII(bpm);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS40S0300000 iDqS40S0300000, Object obj, Object obj2) {
        InterfaceC23370vt interfaceC23370vt = (InterfaceC23370vt) obj;
        long j = ((C23360vs) obj2).LIZ;
        o.LJIIIZ(interfaceC23370vt, "$this$null");
        if (C23360vs.LJII(j) != Integer.MAX_VALUE) {
            InterfaceC09420Yo interfaceC09420Yo = (InterfaceC09420Yo) iDqS40S0300000.l0;
            EnumC23500w6 enumC23500w6 = EnumC23500w6.Ltr;
            List LLJILJILJ = ORZ.LLJILJILJ(((InterfaceC11260cM) iDqS40S0300000.l1).LIZ(interfaceC23370vt, C23360vs.LJII(j) - interfaceC23370vt.LJJIJ(C70657RoD.LIZIZ((InterfaceC09420Yo) iDqS40S0300000.l0, enumC23500w6) + C70657RoD.LIZJ(interfaceC09420Yo, enumC23500w6)), interfaceC23370vt.LJJIJ(((C0YT) iDqS40S0300000.l2).LIZ())));
            int size = ((ArrayList) LLJILJILJ).size();
            for (int i = 1; i < size; i++) {
                ListProtector.set(LLJILJILJ, i, Integer.valueOf(((Number) ListProtector.get(LLJILJILJ, i - 1)).intValue() + ((Number) ListProtector.get(LLJILJILJ, i)).intValue()));
            }
            return LLJILJILJ;
        }
        "LazyVerticalGrid's width should be bound by parent.".toString();
        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
    }

    public static final Object invoke$2(IDqS40S0300000 iDqS40S0300000, Object obj, Object obj2) {
        C0NB.LJFF("LiveLinkMicGiftFlyAnimationHelper", "loadWebpAnimation small fly webp failed,", (Throwable) obj2);
        ((C14520hc) iDqS40S0300000.l0).LIZIZ((C2A4) iDqS40S0300000.l1);
        C14480hY.LIZIZ((C33611Tp) iDqS40S0300000.l2, 4, 2, 2, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS40S0300000 iDqS40S0300000, Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        return Float.valueOf(((InterfaceC21480sq) ((InterfaceC88471Ynr) iDqS40S0300000.l1).invoke(C113554cx.LJJJLL(Float.valueOf(floatValue), (Map) iDqS40S0300000.l0), C113554cx.LJJJLL(Float.valueOf(floatValue2), (Map) iDqS40S0300000.l0))).LIZ((InterfaceC23370vt) iDqS40S0300000.l2, floatValue, floatValue2));
    }

    public static final Object invoke$4(IDqS40S0300000 iDqS40S0300000, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        C12U c12u = (C12U) iDqS40S0300000.l0;
        C278217i c278217i = c12u.LIZ;
        C45101pq c45101pq = c278217i.LIZ;
        c12u.LJJII(c278217i, c45101pq.LJLJJL, intValue, c45101pq.LJLJJLL, intValue2);
        ((C76732zl) iDqS40S0300000.l1).element = intValue;
        ((C76732zl) iDqS40S0300000.l2).element = intValue2;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS40S0300000 iDqS40S0300000, Object obj, Object obj2) {
        ((C37951eJ) iDqS40S0300000.l0).LJLIL.remove((SoundEffect) iDqS40S0300000.l1);
        ((InterfaceC88472Yns) iDqS40S0300000.l2).invoke(-3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS40S0300000(InterfaceC09420Yo interfaceC09420Yo, InterfaceC11260cM interfaceC11260cM, C0YT c0yt, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC09420Yo;
        this.l1 = interfaceC11260cM;
        this.l2 = c0yt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS40S0300000(C14520hc c14520hc, C2A4 c2a4, C33611Tp c33611Tp, int i) {
        super(2);
        this.$t = i;
        this.l0 = c14520hc;
        this.l1 = c2a4;
        this.l2 = c33611Tp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS40S0300000(C12U c12u, C76732zl c76732zl, C76732zl c76732zl2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c12u;
        this.l1 = c76732zl;
        this.l2 = c76732zl2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS40S0300000(C37951eJ c37951eJ, C37951eJ c37951eJ2, SoundEffect soundEffect, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        super(2);
        this.$t = interfaceC88472Yns;
        this.l0 = c37951eJ;
        this.l1 = c37951eJ2;
        this.l2 = soundEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS40S0300000(LiveEffect liveEffect, C40741io c40741io, DataChannel dataChannel, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveEffect;
        this.l1 = c40741io;
        this.l2 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS40S0300000(Map map, Map<Float, Object> map2, InterfaceC88471Ynr<Object, Object, ? extends InterfaceC21480sq> interfaceC88471Ynr, InterfaceC23370vt interfaceC23370vt) {
        super(2);
        this.$t = interfaceC23370vt;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = interfaceC88471Ynr;
    }
}
