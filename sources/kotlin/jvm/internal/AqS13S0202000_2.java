package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C121144pC;
import X.C122034qd;
import X.C47261Igj;
import X.C5ML;
import X.C5S3;
import X.C76800UCe;
import X.EnumC123864ta;
import X.EnumC123874tb;
import X.InterfaceC153045zY;
import X.InterfaceC88472Yns;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioVolumeFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.vesdk.VEEditor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class AqS13S0202000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS13S0202000_2 aqS13S0202000_2, Object obj) {
        C122034qd editorPro = (C122034qd) obj;
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
            nLEFilter.setEndTime(aqS13S0202000_2.i2 * 1000);
            NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter = new NLESegmentAudioVolumeFilter();
            nLESegmentAudioVolumeFilter.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER());
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            EnumC123874tb enumC123874tb = EnumC123874tb.FILTER;
            nLEResourceNode.LJIILIIL(enumC123874tb);
            nLESegmentAudioVolumeFilter.LJI(nLEResourceNode);
            nLESegmentAudioVolumeFilter.LJIIIIZZ(0.0f);
            nLEFilter.LIZJ(nLESegmentAudioVolumeFilter);
            NLEFilter nLEFilter2 = new NLEFilter();
            nLEFilter2.setStartTime(aqS13S0202000_2.i3 * 1000);
            nLEFilter2.setEndTime(((C5S3) aqS13S0202000_2.l1).LIZ((InterfaceC153045zY) aqS13S0202000_2.l0) * 1000);
            NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter2 = new NLESegmentAudioVolumeFilter();
            nLESegmentAudioVolumeFilter2.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER());
            NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
            nLEResourceNode2.LJIILIIL(enumC123874tb);
            nLESegmentAudioVolumeFilter2.LJI(nLEResourceNode2);
            nLESegmentAudioVolumeFilter2.LJIIIIZZ(0.0f);
            nLEFilter2.LIZJ(nLESegmentAudioVolumeFilter2);
            NLEFilter LIZ = C5ML.LIZ(aqS13S0202000_2.i2, aqS13S0202000_2.i3, ((C5S3) aqS13S0202000_2.l1).LJII);
            Map<String, ArrayList<NLEFilter>> map = ((C5S3) aqS13S0202000_2.l1).LIZIZ;
            o.LJIIIIZZ(it4, "it");
            String uuid = it4.getUUID();
            o.LJIIIIZZ(uuid, "it.uuid");
            map.put(uuid, C47261Igj.LJII(nLEFilter, nLEFilter2, LIZ));
            it4.LIZ(nLEFilter);
            it4.LIZ(nLEFilter2);
            it4.LIZ(LIZ);
        }
        editorPro.LJIIJ.LIZIZ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS13S0202000_2 aqS13S0202000_2, Object obj) {
        C122034qd editorPro = (C122034qd) obj;
        o.LJIIIZ(editorPro, "editorPro");
        if (o.LJ(((EffectPointModel) aqS13S0202000_2.l0).getKey(), "2")) {
            ((EffectPointModel) aqS13S0202000_2.l0).setUuid(editorPro.LIZLLL().LJIJ(C121144pC.LIZ(aqS13S0202000_2.i2, aqS13S0202000_2.i3)));
        } else if (o.LJ(((EffectPointModel) aqS13S0202000_2.l0).getKey(), "3")) {
            ((EffectPointModel) aqS13S0202000_2.l0).setUuid(editorPro.LIZLLL().LJIJ(C121144pC.LIZIZ(aqS13S0202000_2.i2, aqS13S0202000_2.i3)));
        }
        InterfaceC153045zY interfaceC153045zY = (InterfaceC153045zY) aqS13S0202000_2.l1;
        interfaceC153045zY.LLIZ(interfaceC153045zY.getDuration(), VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S0202000_2(int i, int i2, InterfaceC153045zY interfaceC153045zY, C5S3 c5s3, int i3) {
        super(1);
        this.$t = i3;
        this.i2 = i;
        this.i3 = i2;
        this.l0 = interfaceC153045zY;
        this.l1 = c5s3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S0202000_2(EffectPointModel effectPointModel, int i, int i2, InterfaceC153045zY interfaceC153045zY, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = effectPointModel;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = interfaceC153045zY;
    }
}
