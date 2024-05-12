package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.469, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass469 extends AbstractC65781Prl implements InterfaceC88473Ynt<Integer, ViewGroup, Boolean, View> {
    public final /* synthetic */ AnonymousClass468 LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass469(AnonymousClass468 anonymousClass468, Context context) {
        super(3);
        this.LJLIL = anonymousClass468;
        this.LJLILLLLZI = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.LayoutInflater] */
    public final View invoke(int i, ViewGroup parent, boolean z) {
        C46A c46a;
        o.LJIIIZ(parent, "parent");
        AnonymousClass468 anonymousClass468 = this.LJLIL;
        Context context = this.LJLILLLLZI;
        anonymousClass468.getClass();
        if (C77357UXp.LJJIIJZLJL()) {
            c46a = C16880lQ.LLZIL(context);
        } else {
            C46A c46a2 = anonymousClass468.LIZ;
            c46a = c46a2;
            if (c46a2 == null) {
                C46A c46a3 = new C46A(context);
                anonymousClass468.LIZ = c46a3;
                c46a = c46a3;
            }
        }
        try {
            View LLLLIILL = C16880lQ.LLLLIILL(c46a, i, parent, z);
            o.LJIIIIZZ(LLLLIILL, "{\n            inflater.i…, attachToRoot)\n        }");
            return LLLLIILL;
        } catch (Exception e) {
            C34B.LJ("TAG", e);
            return AnonymousClass030.LIZLLL(this.LJLILLLLZI, i, parent, z, "{\n            IMLog.e(\"T…, attachToRoot)\n        }");
        }
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ View invoke(Integer num, ViewGroup viewGroup, Boolean bool) {
        return invoke(num.intValue(), viewGroup, bool.booleanValue());
    }
}
