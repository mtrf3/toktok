package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.1c3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C36551c3 extends AbstractC23600wG {
    public final String LJLJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36551c3(String type) {
        this(type, null, 2, 0 == true ? 1 : 0);
        o.LJIIIZ(type, "type");
    }

    @Override // X.AbstractC23600wG
    public String getType() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36551c3(String type, CharSequence charSequence) {
        super(type, charSequence);
        o.LJIIIZ(type, "type");
        this.LJLJI = type;
        if (getType().length() > 0) {
            return;
        }
        "type must not be empty".toString();
        throw new IllegalArgumentException("type must not be empty");
    }

    public /* synthetic */ C36551c3(String str, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }
}
