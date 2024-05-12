package X;

import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;

/* loaded from: classes14.dex */
public interface UB9 {
    Client create(InteractConfig interactConfig);

    ILiveStream getLiveCore();
}
