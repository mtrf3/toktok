package com.ss.android.ugc.gamora.editor.lightening.canvas.forward;

import X.C169656lF;
import X.C76800UCe;
import X.GMG;
import X.InterfaceC65784Pro;
import X.InterfaceC70422pa;
import X.XKX;
import android.content.Context;
import com.ss.android.ugc.aweme.services.story.forward.ForwardResult;
import com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardResult;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DefaultStoryForwardServiceImpl implements IStoryForwardService {
    @Override // com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService
    public final boolean editForwardTask(Context context, ForwardResult forwardResult, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(forwardResult, "forwardResult");
        if (forwardResult instanceof QuickForwardResult) {
            XKX.LIZLLL((InterfaceC70422pa) C169656lF.LJ.getValue(), null, null, new GMG((QuickForwardResult) forwardResult, context, interfaceC65784Pro, z, null), 3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.services.story.forward.ForwardResult forward2Story(android.content.Context r24, com.ss.android.ugc.aweme.services.story.forward.ForwardMedia r25, com.ss.android.ugc.aweme.services.story.forward.ForwardConfig r26, X.InterfaceC88472Yns<? super com.ss.android.ugc.aweme.services.story.forward.ForwardResult, X.C76800UCe> r27) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lightening.canvas.forward.DefaultStoryForwardServiceImpl.forward2Story(android.content.Context, com.ss.android.ugc.aweme.services.story.forward.ForwardMedia, com.ss.android.ugc.aweme.services.story.forward.ForwardConfig, X.Yns):com.ss.android.ugc.aweme.services.story.forward.ForwardResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0134  */
    @Override // com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void forwardOnThisDay(android.content.Context r11, com.ss.android.ugc.aweme.services.story.forward.ForwardMedia r12, com.ss.android.ugc.aweme.services.story.forward.ForwardConfig r13, X.InterfaceC65784Pro<X.C76800UCe> r14) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lightening.canvas.forward.DefaultStoryForwardServiceImpl.forwardOnThisDay(android.content.Context, com.ss.android.ugc.aweme.services.story.forward.ForwardMedia, com.ss.android.ugc.aweme.services.story.forward.ForwardConfig, X.Pro):void");
    }
}
