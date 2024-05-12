package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.1aN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35511aN extends AbstractC23600wG {
    public final String LJLJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C35511aN(String type) {
        this(type, null, 2, 0 == true ? 1 : 0);
        o.LJIIIZ(type, "type");
    }

    @Override // X.AbstractC23600wG
    public String getType() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35511aN(String type, CharSequence charSequence) {
        super(type, charSequence);
        o.LJIIIZ(type, "type");
        this.LJLJI = type;
        if (getType().length() > 0) {
            return;
        }
        "type must not be empty".toString();
        throw new IllegalArgumentException("type must not be empty");
    }

    public /* synthetic */ C35511aN(String str, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }
}
