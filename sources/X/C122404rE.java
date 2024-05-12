package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioVolumeFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4rE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122404rE extends AbstractC65781Prl implements InterfaceC88472Yns<C122034qd, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ InterfaceC153045zY LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C122404rE(int i, int i2, InterfaceC153045zY interfaceC153045zY, int i3) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = interfaceC153045zY;
        this.LJLJJI = i3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C122034qd c122034qd) {
        C122034qd editorPro = c122034qd;
        o.LJIIIZ(editorPro, "editorPro");
        NLEModel LJ = editorPro.LJIIJ.LJ();
        o.LJIIIIZZ(LJ, "editorPro.editor.model");
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, "editorPro.editor.model.tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (it2.LJIIZILJ() == EnumC123864ta.VIDEO || it2.LJIIZILJ() == EnumC123864ta.AUDIO) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            NLETrack it4 = (NLETrack) it3.next();
            NLEFilter nLEFilter = new NLEFilter();
            nLEFilter.setStartTime(0 * 1000);
            nLEFilter.setEndTime(this.LJLIL * 1000);
            NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter = new NLESegmentAudioVolumeFilter();
            nLESegmentAudioVolumeFilter.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER());
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            EnumC123874tb enumC123874tb = EnumC123874tb.FILTER;
            nLEResourceNode.LJIILIIL(enumC123874tb);
            nLESegmentAudioVolumeFilter.LJI(nLEResourceNode);
            nLESegmentAudioVolumeFilter.LJIIIIZZ(0.0f);
            nLEFilter.LIZJ(nLESegmentAudioVolumeFilter);
            NLEFilter nLEFilter2 = new NLEFilter();
            nLEFilter2.setStartTime(this.LJLILLLLZI * 1000);
            nLEFilter2.setEndTime(this.LJLJI.getDuration() * 1000);
            NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter2 = new NLESegmentAudioVolumeFilter();
            nLESegmentAudioVolumeFilter2.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER());
            NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
            nLEResourceNode2.LJIILIIL(enumC123874tb);
            nLESegmentAudioVolumeFilter2.LJI(nLEResourceNode2);
            nLESegmentAudioVolumeFilter2.LJIIIIZZ(0.0f);
            nLEFilter2.LIZJ(nLESegmentAudioVolumeFilter2);
            NLEFilter LIZ = C5ML.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJJI);
            C124454uX.LJI.getClass();
            HashMap hashMap = (HashMap) C124454uX.LIZLLL.getValue();
            o.LJIIIIZZ(it4, "it");
            String uuid = it4.getUUID();
            o.LJIIIIZZ(uuid, "it.uuid");
            hashMap.put(uuid, C47261Igj.LJII(nLEFilter, nLEFilter2, LIZ));
            it4.LIZ(nLEFilter);
            it4.LIZ(nLEFilter2);
            it4.LIZ(LIZ);
        }
        editorPro.LJIIJ.LIZIZ();
        return C76800UCe.LIZ;
    }
}
