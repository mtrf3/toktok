package X;

import com.ss.android.ugc.aweme.commercialize.model.AdBottomContainerInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdTopContainerInfoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NG9 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final NG9 LJLIL = new NG9();

    public NG9() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        AdDescriptiveCTAStruct adDescriptiveCTAStruct;
        AdBottomContainerInfoStruct bottomContainer;
        List<Integer> list;
        AdTopContainerInfoStruct leftContainer;
        M95 string = m95;
        o.LJIIIZ(string, "$this$string");
        Object LIZ = string.LIZ(NGR.class);
        if (LIZ != null) {
            NGR ngr = (NGR) LIZ;
            Object LIZ2 = string.LIZ(Aweme.class);
            if (LIZ2 != null) {
                AwemeRawAd awemeRawAd = ((Aweme) LIZ2).getAwemeRawAd();
                List<Integer> list2 = null;
                if (awemeRawAd != null) {
                    adDescriptiveCTAStruct = awemeRawAd.getAdDescriptiveCTA();
                } else {
                    adDescriptiveCTAStruct = null;
                }
                ArrayList arrayList = new ArrayList();
                if (ngr.LJ) {
                    if (adDescriptiveCTAStruct != null && (leftContainer = adDescriptiveCTAStruct.getLeftContainer()) != null) {
                        list = leftContainer.getElementSequence();
                    } else {
                        list = null;
                    }
                    UC0.LIZLLL(arrayList, list);
                }
                if (ngr.LJFF) {
                    if (adDescriptiveCTAStruct != null && (bottomContainer = adDescriptiveCTAStruct.getBottomContainer()) != null) {
                        list2 = bottomContainer.getElementSequence();
                    }
                    UC0.LIZLLL(arrayList, list2);
                }
                return ORZ.LLD(arrayList, ",", null, null, null, 62);
            }
            throw new C58623Mzb(Aweme.class);
        }
        throw new C58623Mzb(NGR.class);
    }
}
