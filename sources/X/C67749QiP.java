package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.WeakHashMap;

/* renamed from: X.QiP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67749QiP {
    public static final Status LIZJ = new Status(8, "The connection to Google Play services was lost");
    public final java.util.Set<BasePendingResult<?>> LIZ = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public final C67753QiT LIZIZ = new C67753QiT(this);
}
