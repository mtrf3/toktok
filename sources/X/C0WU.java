package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.0WU, reason: invalid class name */
/* loaded from: classes.dex */
public interface C0WU {
    void LIZ(LiveEffect liveEffect, DataChannel dataChannel, int i, boolean z);

    void LIZIZ(LiveEffect liveEffect);

    void LIZJ();

    void LIZLLL(String str, TreeMap<Integer, C75295Tgp> treeMap, List<? extends LiveEffect> list, DataChannel dataChannel);

    void LJ(LiveEffect liveEffect, DataChannel dataChannel, int i);

    void LJFF();

    boolean LJI();

    void LJII();

    void LJIIIIZZ(DataChannel dataChannel, String str);

    void LJIIIZ(LiveEffect liveEffect, DataChannel dataChannel);

    void LJIIJ(DataChannel dataChannel, String str);

    void release();
}
