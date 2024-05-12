package X;

import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Gjs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42360Gjs extends RuntimeException {
    public final Object LJLIL;
    public final Throwable LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;

    public static /* synthetic */ C42360Gjs copy$default(C42360Gjs c42360Gjs, Object obj, Throwable th, int i, String str, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = c42360Gjs.LJLIL;
        }
        if ((i2 & 2) != 0) {
            th = c42360Gjs.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            i = c42360Gjs.LJLJI;
        }
        if ((i2 & 8) != 0) {
            str = c42360Gjs.LJLJJI;
        }
        return c42360Gjs.copy(obj, th, i, str);
    }

    public final Object[] LIZ() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI), this.LJLJJI};
    }

    public final C42360Gjs copy(Object nodeTag, Throwable t, int i, String extraMsg) {
        o.LJIIIZ(nodeTag, "nodeTag");
        o.LJIIIZ(t, "t");
        o.LJIIIZ(extraMsg, "extraMsg");
        return new C42360Gjs(nodeTag, t, i, extraMsg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42360Gjs) {
            return C78966Uyw.LJIIIZ(((C42360Gjs) obj).LIZ(), LIZ());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(LIZ());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return C78966Uyw.LJJJLL("WaveException:%s,%s,%s,%s", LIZ());
    }

    public final int getCode() {
        return this.LJLJI;
    }

    public final String getExtraMsg() {
        return this.LJLJJI;
    }

    public final Object getNodeTag() {
        return this.LJLIL;
    }

    public final Throwable getT() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42360Gjs(Object nodeTag, Throwable t, int i, String extraMsg) {
        super(t);
        o.LJIIIZ(nodeTag, "nodeTag");
        o.LJIIIZ(t, "t");
        o.LJIIIZ(extraMsg, "extraMsg");
        this.LJLIL = nodeTag;
        this.LJLILLLLZI = t;
        this.LJLJI = i;
        this.LJLJJI = extraMsg;
    }

    public /* synthetic */ C42360Gjs(Object obj, Throwable th, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, th, i, (i2 & 8) != 0 ? "" : str);
    }
}
