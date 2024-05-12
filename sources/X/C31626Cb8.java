package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* renamed from: X.Cb8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31626Cb8 {
    public static /* synthetic */ void LIZ(CompletionBlock completionBlock, int i, String str, int i2) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        completionBlock.onFailure(i, str, null);
    }
}
