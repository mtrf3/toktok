package com.bytedance.sdk.xbridge.registry.core.model.idl;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* loaded from: classes13.dex */
public interface CompletionBlock<S extends XBaseResultModel> {
    void onFailure(int i, String str, S s);

    void onRawSuccess(S s);

    void onSuccess(S s, String str);
}
