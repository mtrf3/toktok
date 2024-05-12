package X;

import com.google.ar.core.AugmentedFace;
import com.google.ar.core.AugmentedImage;
import com.google.ar.core.DepthPoint;
import com.google.ar.core.InstantPlacementPoint;
import com.google.ar.core.Plane;
import com.google.ar.core.Point;
import com.google.ar.core.Trackable;

/* renamed from: X.aSN, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public enum EnumC93531aSN {
    /* JADX INFO: Fake field, exist only in values array */
    BASE_TRACKABLE(1095893248, Trackable.class),
    UNKNOWN_TO_JAVA(-1, null),
    /* JADX INFO: Fake field, exist only in values array */
    PLANE(1095893249, Plane.class),
    /* JADX INFO: Fake field, exist only in values array */
    POINT(1095893250, Point.class),
    /* JADX INFO: Fake field, exist only in values array */
    AUGMENTED_IMAGE(1095893252, AugmentedImage.class),
    /* JADX INFO: Fake field, exist only in values array */
    FACE(1095893253, AugmentedFace.class),
    /* JADX INFO: Fake field, exist only in values array */
    DEPTH_POINT(1095893265, DepthPoint.class),
    /* JADX INFO: Fake field, exist only in values array */
    INSTANT_PLACEMENT_POINT(1095893266, InstantPlacementPoint.class);

    public final int LJLIL;
    public final Class<?> LJLILLLLZI;

    EnumC93531aSN(int i, Class cls) {
        this.LJLIL = i;
        this.LJLILLLLZI = cls;
    }
}
