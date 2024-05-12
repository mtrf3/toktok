package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IaJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46863IaJ extends AbstractC65781Prl implements InterfaceC88472Yns<SimVideoUrlModel, C76800UCe> {
    public final /* synthetic */ List<SimVideoUrlModel> LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ C68322mC<java.util.Map<String, EAN>> LJLJI;
    public final /* synthetic */ SimVideoUrlModel LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ C68322mC<C59772Wf> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46863IaJ(List<? extends SimVideoUrlModel> list, C76732zl c76732zl, C68322mC<java.util.Map<String, EAN>> c68322mC, SimVideoUrlModel simVideoUrlModel, int i, C68322mC<C59772Wf> c68322mC2) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = c68322mC;
        this.LJLJJI = simVideoUrlModel;
        this.LJLJJL = i;
        this.LJLJJLL = c68322mC2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SimVideoUrlModel simVideoUrlModel) {
        int i;
        Integer num;
        int intValue;
        int indexOf;
        SimBitRate simBitRate;
        int intValue2;
        int bitRate;
        SimVideoUrlModel video = simVideoUrlModel;
        o.LJIIIZ(video, "video");
        double duration = video.getDuration();
        InterfaceC46904Iay LIZ = C46900Iau.LIZ(video, C46868IaO.LIZJ);
        int indexOf2 = ((ArrayList) ORZ.LJLL(this.LJLIL)).indexOf(video) + this.LJLILLLLZI.element;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<SimBitRate> it = video.getBitRate().iterator();
        while (true) {
            int i2 = -1;
            if (!it.hasNext()) {
                break;
            }
            SimBitRate next = it.next();
            if (next == null) {
                bitRate = -1;
            } else {
                bitRate = next.getBitRate();
            }
            arrayList2.add(Integer.valueOf(bitRate));
            if (next != null) {
                i2 = next.getQualityType();
            }
            arrayList.add(Integer.valueOf(i2));
            arrayList3.add(0L);
        }
        String sourceId = video.getSourceId();
        o.LJIIIIZZ(sourceId, "video.sourceId");
        EAN ean = new EAN(sourceId, arrayList3, arrayList2, arrayList);
        if (!TextUtils.isEmpty(video.getDashVideoModelStr())) {
            ean.setVideo_format("dash");
        }
        this.LJLJI.element.put(String.valueOf(indexOf2), ean);
        ean.setVideo_dur(duration);
        if (o.LJ(this.LJLJJI, video)) {
            i = this.LJLJJL;
        } else {
            i = 0;
        }
        ean.setPlayed_dur(i);
        if (LIZ.LIZIZ() > 0) {
            if (video.getDashVideoModelStr() != null) {
                Iterator<InterfaceC46904Iay> it2 = LIZ.LIZJ().iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    Integer LIZ2 = C46901Iav.LIZ(it2.next().key());
                    if (LIZ2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = LIZ2.intValue();
                    }
                    i3 += intValue2;
                }
                num = Integer.valueOf(i3);
            } else {
                List<SimBitRate> bitRate2 = video.getBitRate();
                if (bitRate2 != null) {
                    Iterator<SimBitRate> it3 = bitRate2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            simBitRate = it3.next();
                            if (o.LJ(simBitRate.getUrlKey(), LIZ.key())) {
                                break;
                            }
                        } else {
                            simBitRate = null;
                            break;
                        }
                    }
                    SimBitRate simBitRate2 = simBitRate;
                    if (simBitRate2 != null) {
                        num = Integer.valueOf(simBitRate2.getBitRate());
                    }
                }
                this.LJLJJLL.element.setPlaylist(this.LJLJI.element);
                return C76800UCe.LIZ;
            }
        } else {
            num = 0;
        }
        if (num != null && (intValue = num.intValue()) > 0 && (indexOf = arrayList2.indexOf(Integer.valueOf(intValue))) > -1 && indexOf < arrayList3.size()) {
            ListProtector.set(arrayList3, indexOf, Long.valueOf(LIZ.LIZIZ()));
        }
        this.LJLJJLL.element.setPlaylist(this.LJLJI.element);
        return C76800UCe.LIZ;
    }
}
