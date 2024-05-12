package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.4h3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116094h3 extends C116074h1 {
    public final SkylightData LJLILLLLZI;

    public final int hashCode() {
        return Objects.hash(this.LJLILLLLZI);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("SkylightTemplateDataItem:%s", this.LJLILLLLZI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116094h3(SkylightData data) {
        super(data);
        o.LJIIIZ(data, "data");
        this.LJLILLLLZI = data;
    }

    @Override // X.C116074h1, X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.C116074h1, X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C116094h3)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C116094h3) obj).LJLILLLLZI}, new Object[]{this.LJLILLLLZI});
    }
}
