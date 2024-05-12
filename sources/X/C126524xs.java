package X;

import com.ss.android.ugc.aweme.services.audio.IAudioService;
import com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4xs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126524xs {
    public static final java.util.Map<String, IAudioServiceFactory<?>> LIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ = linkedHashMap;
        linkedHashMap.put(C126514xr.class.getName(), new IAudioServiceFactory<C126314xX>() { // from class: X.4xr
            @Override // com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory
            public final IAudioService getAudioService(C126314xX c126314xX) {
                C126314xX params = c126314xX;
                o.LJIIIZ(params, "params");
                C124424uU.LIZ.getClass();
                if (C124424uU.LIZ().useCE == 1) {
                    return new C126254xR(params);
                }
                return new C126534xt(params);
            }
        });
        linkedHashMap.put(C140495fJ.class.getName(), new C140495fJ());
    }
}
