package com.ss.android.ugc.aweme.feed.prompt.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C237639Uh;
import X.E4Q;
import X.E4T;
import X.InterfaceC195757mF;
import X.InterfaceC27211Am7;
import X.InterfaceC64985Pev;
import X.InterfaceC64989Pez;
import X.InterfaceC64991Pf1;
import com.ss.android.ugc.aweme.feed.prompt.data.RecommendPromptRequest;
import com.ss.android.ugc.aweme.feed.prompt.data.RecommendPromptResponse;

/* loaded from: classes5.dex */
public interface FeedPromptApi {
    public static final C237639Uh LIZ = C237639Uh.LIZ;

    @E4T("/tiktok/feed/prompt/recommend/v1")
    AbstractC73672Svk<RecommendPromptResponse> getRecommendPrompts(@InterfaceC27211Am7 RecommendPromptRequest recommendPromptRequest);

    @E4Q("/tiktok/feed/instructions/all/v1")
    AbstractC73672Svk<InstructionResp> instructionsAll(@InterfaceC64989Pez("request_type") int i);

    @InterfaceC64991Pf1("/tiktok/feed/instructions/undo/v1")
    AbstractC73672Svk<InstructionUndoResp> instructionsUndo(@InterfaceC64989Pez("instruction_id") long j);

    @InterfaceC195757mF
    @E4T("/tiktok/feed/prompt/transform/v1")
    AbstractC73638SvC<PromptTransformResp> promptTransform(@InterfaceC64985Pev("prompt") String str, @InterfaceC64985Pev("prompt_type") Integer num, @InterfaceC64985Pev("gid") String str2, @InterfaceC64985Pev("auto_commit") Boolean bool);
}
