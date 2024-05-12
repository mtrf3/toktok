package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.actionai.action.data.FileDisplayName;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Oqx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63183Oqx implements InterfaceC63353Oth, InterfaceC48038ItG, InterfaceC134325Oy, C0WP {
    public static QMX LJLIL;
    public static final C63183Oqx LJLILLLLZI = new C63183Oqx();

    @Override // X.C0WP
    public List LJIIZILJ(List effectPanelList) {
        o.LJIIIZ(effectPanelList, "effectPanelList");
        return effectPanelList;
    }

    @Override // X.InterfaceC134325Oy
    public String LIZ(NLEModel nLEModel) {
        NLETrack mainTrack;
        StringBuilder sb = new StringBuilder();
        if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null) {
            Iterator<NLETrackSlot> it = mainTrack.LJIILL().iterator();
            while (it.hasNext()) {
                sb.append(FileDisplayName.get(it.next().LJI().LIZIZ().LIZJ()));
            }
        }
        return String.valueOf(sb.toString().hashCode());
    }

    @Override // X.InterfaceC63353Oth
    public void LIZLLL(Object obj) {
        C63309Osz.LIZLLL().LJIIJJI((List) obj);
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        OSZ it = (OSZ) obj;
        o.LJIIIZ(it, "it");
        AVMusic aVMusic = (AVMusic) it.getFirst();
        aVMusic.path = (String) it.getSecond();
        return aVMusic;
    }
}
