package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6VW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VW extends AbstractC65781Prl implements InterfaceC65784Pro<C120874ol> {
    public static final C6VW LJLIL = new C6VW();

    public C6VW() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4ol] */
    @Override // X.InterfaceC65784Pro
    public final C120874ol invoke() {
        return new InterfaceC120884om() { // from class: X.4ol
            @Override // X.InterfaceC120884om
            public final boolean LIZ(String str) {
                if (str == null || str.length() == 0) {
                    return false;
                }
                NLEEditor nLEEditor = new NLEEditor();
                nLEEditor.LJI(str);
                NLEModel LJ = nLEEditor.LJ();
                o.LJIIIIZZ(LJ, "editor.model");
                return C132385Hm.LJFF(LJ);
            }

            @Override // X.InterfaceC120884om
            public final List<HFP> LIZIZ(String str) {
                String libraryId;
                NLESegmentVideo LJJ;
                ArrayList arrayList = new ArrayList();
                if (str == null || str.length() == 0) {
                    return arrayList;
                }
                NLEEditor nLEEditor = new NLEEditor();
                nLEEditor.LJI(str);
                VecNLETrackSPtr tracks = nLEEditor.LJ().getTracks();
                o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
                ArrayList arrayList2 = new ArrayList();
                Iterator<NLETrack> it = tracks.iterator();
                while (it.hasNext()) {
                    NLETrack next = it.next();
                    NLETrack nLETrack = next;
                    if (!nLETrack.LJIIJ() && nLETrack.hasExtra("track_extra_pip") && o.LJ(nLETrack.getExtra("track_extra_pip"), "true")) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILL().iterator();
                    while (it3.hasNext()) {
                        NLETrackSlot next2 = it3.next();
                        if (next2.hasExtra("library_id")) {
                            libraryId = next2.getExtra("library_id");
                        } else {
                            libraryId = "";
                        }
                        o.LJIIIIZZ(libraryId, "libraryId");
                        if (libraryId.length() == 0 && (LJJ = NLESegmentVideo.LJJ(next2.LJI())) != null) {
                            String LIZJ = LJJ.LJ().LIZJ();
                            o.LJIIIIZZ(LIZJ, "it.avFile.resourceFile");
                            long j = 1000;
                            arrayList.add(new HFP(LIZJ, LJJ.LJIILIIL() / j, (LJJ.LJIIL() - LJJ.LJIILIIL()) / j));
                        }
                    }
                }
                return arrayList;
            }
        };
    }
}
