package X;

import com.ss.android.vesdk.VEImageDetectUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Hu7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45543Hu7 implements VEImageDetectUtils.IDetectImageResultListener {
    public final /* synthetic */ AtomicBoolean LIZ;

    public C45543Hu7(AtomicBoolean atomicBoolean) {
        this.LIZ = atomicBoolean;
    }

    @Override // com.ss.android.vesdk.VEImageDetectUtils.IDetectImageResultListener
    public final void onDetectResult(String str, String str2, String str3, boolean z) {
        this.LIZ.set(z);
    }
}
