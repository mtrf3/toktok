package X;

import com.ss.android.ttve.nativePort.TEImageALGCallbackInterface;
import com.ss.android.vesdk.algorithm.VEImageSkeleton;
import com.ss.android.vesdk.algorithm.model.Skeleton;
import com.ss.android.vesdk.algorithm.model.SkeletonInfo;

/* renamed from: X.Z8z, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89457Z8z implements TEImageALGCallbackInterface.SkeletonInfoCallback {
    @Override // com.ss.android.ttve.nativePort.TEImageALGCallbackInterface.SkeletonInfoCallback
    public final void onResult(SkeletonInfo skeletonInfo) {
        if (skeletonInfo != null) {
            new T2J(1);
            skeletonInfo.getInfo();
            for (Skeleton skeleton : skeletonInfo.getInfo()) {
                VEImageSkeleton vEImageSkeleton = new VEImageSkeleton();
                vEImageSkeleton.setID(skeleton.getID());
                vEImageSkeleton.setRect(skeleton.getRect());
                vEImageSkeleton.setPoints(skeleton.getPoints());
            }
        }
        throw null;
    }
}
