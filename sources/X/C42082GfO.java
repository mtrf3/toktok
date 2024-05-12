package X;

import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.GfO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42082GfO {
    public final Serializable LIZ;
    public final Object LIZIZ;
    public final Object LIZJ;
    public final Object LIZLLL;

    public /* synthetic */ C42082GfO() {
        Q93 q93 = C86794Y4o.LIZ;
        this.LIZJ = new ConcurrentHashMap();
        this.LIZLLL = new ConcurrentHashMap();
        this.LIZ = "/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto";
        this.LIZIZ = q93;
    }

    public /* synthetic */ C42082GfO(VideoPublishEditModel editModel, PublishModel publishModel, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(publishModel, "publishModel");
        this.LIZ = editModel;
        this.LIZIZ = publishModel;
        this.LIZJ = videoCreation;
        this.LIZLLL = synthetiseResult;
    }
}
