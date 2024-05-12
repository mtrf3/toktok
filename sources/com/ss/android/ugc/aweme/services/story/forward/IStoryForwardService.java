package com.ss.android.ugc.aweme.services.story.forward;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.content.Context;

/* loaded from: classes8.dex */
public interface IStoryForwardService {
    boolean editForwardTask(Context context, ForwardResult forwardResult, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    ForwardResult forward2Story(Context context, ForwardMedia forwardMedia, ForwardConfig forwardConfig, InterfaceC88472Yns<? super ForwardResult, C76800UCe> interfaceC88472Yns);

    void forwardOnThisDay(Context context, ForwardMedia forwardMedia, ForwardConfig forwardConfig, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean editForwardTask$default(IStoryForwardService iStoryForwardService, Context context, ForwardResult forwardResult, boolean z, InterfaceC65784Pro interfaceC65784Pro, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    interfaceC65784Pro = null;
                }
                return iStoryForwardService.editForwardTask(context, forwardResult, z, interfaceC65784Pro);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: editForwardTask");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ForwardResult forward2Story$default(IStoryForwardService iStoryForwardService, Context context, ForwardMedia forwardMedia, ForwardConfig forwardConfig, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    interfaceC88472Yns = null;
                }
                return iStoryForwardService.forward2Story(context, forwardMedia, forwardConfig, interfaceC88472Yns);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forward2Story");
        }
    }
}
