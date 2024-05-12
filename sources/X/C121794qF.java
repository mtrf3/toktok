package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4qF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121794qF extends AbstractC121974qX {
    public EnumC135185Sg LIZIZ;
    public final C122004qa LIZJ;
    public final boolean LIZLLL;

    @Override // X.AbstractC121974qX
    public final void LIZ(InterfaceC126684y8 nleSession) {
        o.LJIIIZ(nleSession, "nleSession");
        nleSession.V8().prepare();
        if (this.LIZIZ == EnumC135185Sg.STARTED) {
            nleSession.V8().play();
        }
    }

    @Override // X.AbstractC121974qX
    public final void LIZIZ(InterfaceC126684y8 nleSession) {
        o.LJIIIZ(nleSession, "nleSession");
        EnumC135185Sg LJJIL = nleSession.V8().LJJIL();
        this.LIZIZ = LJJIL;
        if (LJJIL == EnumC135185Sg.STARTED) {
            nleSession.V8().pause();
        }
    }

    @Override // X.AbstractC121974qX
    public final void LIZJ(NLEEditor nleEditor) {
        Object obj;
        NLETrack nLETrack;
        o.LJIIIZ(nleEditor, "nleEditor");
        LJFF(" 2.add track start ");
        C122004qa c122004qa = this.LIZJ;
        AqS184S0100000_2 aqS184S0100000_2 = new AqS184S0100000_2(this, 63);
        boolean z = true;
        if (this.LIZLLL) {
            nLETrack = new NLETrack();
            C77357UXp.LJJJJL(nLETrack, c122004qa.LJIILIIL.name());
            nLETrack.setStartTime(0L);
            nLETrack.setEndTime(-2);
        } else {
            Iterator LIZ = C0FS.LIZ(nleEditor, "nleEditor.model", "nleEditor.model.tracks");
            while (true) {
                if (LIZ.hasNext()) {
                    obj = LIZ.next();
                    NLETrack it = (NLETrack) obj;
                    o.LJIIIIZZ(it, "it");
                    if (o.LJ(C77357UXp.LJIILIIL(it), c122004qa.LJIILIIL.name())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            nLETrack = (NLETrack) obj;
            if (nLETrack == null) {
                nLETrack = new NLETrack();
                C77357UXp.LJJJJL(nLETrack, c122004qa.LJIILIIL.name());
                nLETrack.setStartTime(0L);
                nLETrack.setEndTime(-2);
            } else {
                z = false;
            }
        }
        NLETrackSlot LJII = LJII(nLETrack, c122004qa);
        if (z) {
            nleEditor.LJ().addTrack(nLETrack);
        }
        aqS184S0100000_2.invoke(nLETrack, LJII);
    }

    public C121794qF(C122004qa params, boolean z) {
        o.LJIIIZ(params, "params");
        this.LIZJ = params;
        this.LIZLLL = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" 0.init ");
        LIZ.append(params.toString());
        LJFF(X1D.LIZIZ(LIZ));
        if (params.LIZ != null) {
        } else {
            throw new IllegalArgumentException("MusicBgmOperation.filePath can not be null");
        }
    }

    public static NLETrackSlot LJII(NLETrack nLETrack, C122004qa params) {
        o.LJIIIZ(params, "params");
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.LJIILIIL(EnumC123874tb.AUDIO);
        nLEResourceAV.LJIIIZ(params.LIZ);
        String str = params.LJIIJJI;
        if (str != null && str.length() != 0) {
            NLEEditorJniJNI.NLEResourceAV_setFileInfo(nLEResourceAV.LIZJ, nLEResourceAV, params.LJIIJJI);
        }
        nLEResourceAV.setDuration((params.LIZLLL - params.LIZJ) * 1000);
        nLESegmentAudio.LJIILL(nLEResourceAV);
        nLETrackSlot.LJIIL(nLESegmentAudio);
        new C121354pX(params);
        C121354pX.LJII(nLETrackSlot, params);
        nLETrack.LIZIZ(nLETrackSlot);
        return nLETrackSlot;
    }
}
