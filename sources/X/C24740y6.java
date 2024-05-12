package X;

import android.content.Context;
import android.os.Parcel;
import android.util.Base64;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.0y6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24740y6 {
    public final Object LIZ;

    public final int LIZIZ() {
        return ((Parcel) this.LIZ).dataAvail();
    }

    public final float LIZJ() {
        return ((Parcel) this.LIZ).readFloat();
    }

    public final long LIZLLL() {
        long j;
        byte readByte = ((Parcel) this.LIZ).readByte();
        if (readByte == 1) {
            j = 4294967296L;
        } else if (readByte == 2) {
            j = 8589934592L;
        } else {
            j = 0;
        }
        if (C23540wA.LIZ(j, 0L)) {
            return C23520w8.LIZJ;
        }
        return C79043V0l.LJIJ(LIZJ(), j);
    }

    public final Object LJ() {
        return ListProtector.remove((ArrayList) this.LIZ, ((ArrayList) r0).size() - 1);
    }

    public /* synthetic */ C24740y6(String str) {
        Parcel obtain = Parcel.obtain();
        o.LJIIIIZZ(obtain, "obtain()");
        this.LIZ = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public final synchronized void LIZ(Collection collection) {
        o.LJIIIZ(collection, "collection");
        ((java.util.Set) this.LIZ).addAll(collection);
    }

    public final void LJFF(Object obj) {
        ((ArrayList) this.LIZ).add(obj);
    }

    public C24740y6(int i) {
        if (i != 2) {
            this.LIZ = new ArrayList();
        } else {
            this.LIZ = new LinkedHashSet();
        }
    }

    public /* synthetic */ C24740y6(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }
}
