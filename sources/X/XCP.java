package X;

import com.ss.ugc.effectplatform.model.Effect;

/* loaded from: classes16.dex */
public interface XCP extends XDR<Effect> {
    void onProgress(Effect effect, int i, long j);

    void onStart(Effect effect);
}
