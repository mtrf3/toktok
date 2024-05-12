package X;

import android.os.Handler;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4uw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C124704uw {
    public final InterfaceC124924vI LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final Handler LJLJJI;
    public final InterfaceC127784zu LJLJJL;

    public final NLETrack LJJL() {
        return (NLETrack) C79057V0z.LJJIIJ(this.LJLIL, "selected_video_cover_track");
    }

    public final NLETrackSlot LJJLI() {
        return (NLETrackSlot) C79057V0z.LJJIIJ(this.LJLIL, "selected_video_cover_track_slot");
    }

    public final NLETrack LJJLIIIIJ() {
        return this.LJLIL.getSelectedTrack();
    }

    public final NLETrackSlot LJJLIIIJ() {
        return this.LJLIL.getSelectedTrackSlot();
    }

    public final NLEModel r9() {
        return (NLEModel) this.LJLILLLLZI.getValue();
    }

    public C124704uw(InterfaceC124924vI editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        this.LJLIL = editorContext;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 744));
        this.LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 743));
        C221108m2.LIZIZ(new AqS152S0100000_2(this, 745));
        this.LJLJJI = new Handler(C16880lQ.LLJJJJ());
        this.LJLJJL = editorContext.getPlayer();
    }

    public final void LJJJZ(EnumC124724uy enumC124724uy, String str) {
        if (enumC124724uy != null) {
            int i = C124714ux.LIZ[enumC124724uy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                C79057V0z.LJIILL(this.LJLIL, str);
                return;
            }
            C79057V0z.LJIIL(this.LJLIL);
        }
    }
}
