package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4sw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123464sw {
    public final InterfaceC124924vI LIZ;
    public final Context LIZIZ;
    public final VideoPublishEditModel LIZJ;

    public static NLETrackSlot LIZ(NLETrack nLETrack, String str) {
        String str2;
        NLETrackSlot it;
        Iterator<NLETrackSlot> it2 = nLETrack.LJIILL().iterator();
        do {
            str2 = null;
            if (!it2.hasNext()) {
                return null;
            }
            it = it2.next();
            o.LJIIIIZZ(it, "it");
            NLENode nLENode = (NLENode) NLESegmentTextSticker.class.getMethod("LJFF", NLENode.class).invoke(null, it.LJI());
            if (nLENode != null) {
                str2 = nLENode.getUUID();
            }
        } while (!o.LJ(str2, str));
        return it;
    }

    public C123464sw(EditorProContext editorProContext, Context context, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = editorProContext;
        this.LIZIZ = context;
        this.LIZJ = videoPublishEditModel;
    }
}
