package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I0U {
    public final LiveEvent<C76800UCe> LIZ;
    public final LiveEvent<C76800UCe> LIZIZ;
    public final LiveEvent<Effect> LIZJ;

    public I0U(C29901Fi dismissSuperEntranceEvent, C29901Fi dismissUploadPopEvent, LiveEvent liveEvent) {
        o.LJIIIZ(dismissSuperEntranceEvent, "dismissSuperEntranceEvent");
        o.LJIIIZ(dismissUploadPopEvent, "dismissUploadPopEvent");
        this.LIZ = dismissSuperEntranceEvent;
        this.LIZIZ = dismissUploadPopEvent;
        this.LIZJ = liveEvent;
    }
}
