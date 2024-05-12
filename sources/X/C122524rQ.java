package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4rQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122524rQ {
    public static final int LIZ(NLEModel nLEModel, EnumC123864ta enumC123864ta) {
        int i;
        switch (C122534rR.LIZ[enumC123864ta.ordinal()]) {
            case 3:
                i = 1000;
                break;
            case 4:
                i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                break;
            case 5:
                i = 3000;
                break;
            case 6:
                i = LivePlayerResourceReleaseSetting.ENABLE;
                break;
            case 7:
                i = 5000;
                break;
            case 8:
                i = 7000;
                break;
            default:
                i = 0;
                break;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                if (C79057V0z.LJJIJIL(next) == enumC123864ta) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILL().iterator();
                while (it3.hasNext()) {
                    i = Math.max(i, it3.next().getLayer());
                }
            }
        }
        return i + 1;
    }
}
