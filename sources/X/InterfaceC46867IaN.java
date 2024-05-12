package X;

import android.util.Pair;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* renamed from: X.IaN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC46867IaN {
    EnumC47177IfN LIZ(EnumC47177IfN enumC47177IfN);

    Pair<EnumC47177IfN, String> LIZIZ(int i);

    void LIZJ(SimVideoUrlModel simVideoUrlModel, List<SimBitRate> list, List<SimAudioBitrate> list2);

    List<Pair<EnumC47177IfN, Integer>> LIZLLL();

    String LJ();

    List<Pair<EnumC47177IfN, SimBitRate>> LJFF();

    int getDuration();

    C47164IfA getTag();
}
