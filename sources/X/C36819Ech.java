package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Ech, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36819Ech {
    public static final /* synthetic */ int LIZ = 0;

    public static C36818Ecg LIZ(Object obj, String name) {
        o.LJIIJ(name, "name");
        if (obj instanceof Context) {
            return new C36818Ecg((Context) obj, name);
        }
        throw new IllegalArgumentException("must parse context arguement in Settings!");
    }
}
