package X;

import android.graphics.PointF;
import android.util.Property;
import kotlin.jvm.internal.o;

/* renamed from: X.UxP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78871UxP extends Property<C78870UxO, PointF> {
    public C78871UxP(Class cls) {
        super(cls, "translations");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ PointF get(C78870UxO c78870UxO) {
        return null;
    }

    @Override // android.util.Property
    public final void set(C78870UxO c78870UxO, PointF pointF) {
        C78870UxO c78870UxO2 = c78870UxO;
        PointF translation = pointF;
        c78870UxO2.getClass();
        o.LJIIIZ(translation, "translation");
        c78870UxO2.LJFF = translation.x;
        c78870UxO2.LJI = translation.y;
        c78870UxO2.LIZ();
    }
}
