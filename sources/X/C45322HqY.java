package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HqY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45322HqY extends F9E {
    public final /* synthetic */ int LJLIL = 1;
    public final List LJLILLLLZI;
    public final CharSequence LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        switch (this.LJLIL) {
            case 0:
                return new Object[]{this.LJLJI, this.LJLILLLLZI};
            default:
                return new Object[]{this.LJLJI, this.LJLILLLLZI};
        }
    }

    public C45322HqY(CharSequence charSequence, List extra) {
        o.LJIIIZ(extra, "extra");
        this.LJLJI = charSequence;
        this.LJLILLLLZI = extra;
        if (o.LJ(charSequence, "null")) {
            System.out.println((Object) "value is 'null', potential bug");
        }
    }

    public C45322HqY(String starlingKey, List arguments) {
        o.LJIIIZ(starlingKey, "starlingKey");
        o.LJIIIZ(arguments, "arguments");
        this.LJLJI = starlingKey;
        this.LJLILLLLZI = arguments;
    }
}
