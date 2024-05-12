package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.G7o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41008G7o {
    public static final /* synthetic */ int LIZIZ = 0;
    public final java.util.Map<String, String> LIZ;

    public C41008G7o(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        this.LIZ = C113554cx.LJJL(new OSZ("enter_from", "advanced_settings"), new OSZ("creation_id", editModel.getCreationId()), new OSZ("content_source", editModel.getAvetParameter().getContentSource()), new OSZ("content_type", H7R.LJIIIZ(editModel)));
    }
}
