package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.Tbs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74988Tbs implements InterfaceC75414Tik<ChangeMaxPositionResult> {
    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ChangeMaxPositionResult value) {
        o.LJIIIZ(value, "value");
    }
}
