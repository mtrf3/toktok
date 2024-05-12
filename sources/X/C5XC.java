package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.LoudnessDetectResult;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5XC, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5XC {
    public final VideoPublishEditModel LIZ;

    public abstract List<C5XE> LIZ();

    public LoudnessDetectResult LIZIZ(C5XE c5xe) {
        return null;
    }

    public C5XC(InterfaceC153045zY editor, VideoPublishEditModel editModel) {
        o.LJIIIZ(editor, "editor");
        o.LJIIIZ(editModel, "editModel");
        this.LIZ = editModel;
    }
}
