package X;

import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.ugc.aweme.creation.base.BasicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H8l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43579H8l {
    public final CreationConfigModelCompat LIZ;

    public final CreativeInfo LIZ() {
        String LJJJJIZL;
        BasicModel basic = this.LIZ.getBasic();
        if (basic == null || (LJJJJIZL = basic.getCreationId()) == null) {
            LJJJJIZL = C44384HbQ.LJJJJIZL();
        }
        return new CreativeInfo(LJJJJIZL, 0, null, 6, null);
    }

    public C43579H8l(CreationConfigModelCompat creationComposerModel) {
        o.LJIIIZ(creationComposerModel, "creationComposerModel");
        this.LIZ = creationComposerModel;
    }
}
