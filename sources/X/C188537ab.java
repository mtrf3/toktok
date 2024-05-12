package X;

import android.content.Context;
import android.text.Spanned;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS15S1201000_3;
import kotlin.jvm.internal.AqS3S2201000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188537ab {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static Spanned LIZ(Context context, int i, int i2, int i3, int i4, String enterFrom, String str, int i5, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(enterFrom, "enterFrom");
        if (C77266UUc.LIZIZ.LJI()) {
            C72062SPy c72062SPy = new C72062SPy();
            String string = context.getString(R.string.ghe);
            o.LJIIIIZZ(string, "context.getString(R.stri…een_note_suggest_account)");
            c72062SPy.LIZIZ = string;
            c72062SPy.LJ(1);
            c72062SPy.LIZ = false;
            c72062SPy.LIZIZ(i4);
            c72062SPy.LJFF = new AqS3S2201000_3(i5, context, enterFrom, str, interfaceC65784Pro, 0);
            CharSequence LIZ2 = c72062SPy.LIZ(context);
            C72062SPy c72062SPy2 = new C72062SPy();
            String string2 = context.getString(R.string.ghf);
            o.LJIIIIZZ(string2, "context.getString(R.stri…creen_note_sync_contacts)");
            c72062SPy2.LIZIZ = string2;
            c72062SPy2.LJ(1);
            c72062SPy2.LIZ = false;
            c72062SPy2.LIZIZ(i4);
            c72062SPy2.LJFF = new AqS15S1201000_3(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) context, (Context) enterFrom, (String) i5, 1);
            CharSequence LIZ3 = c72062SPy2.LIZ(context);
            C72062SPy c72062SPy3 = new C72062SPy();
            String string3 = context.getString(R.string.ghc);
            o.LJIIIIZZ(string3, "context.getString(R.stri…lfscreen_note_learn_more)");
            c72062SPy3.LIZIZ = string3;
            c72062SPy3.LJ(1);
            c72062SPy3.LIZ = false;
            c72062SPy3.LIZIZ(i4);
            c72062SPy3.LJFF = new AqS150S0200000_3(context, interfaceC65784Pro, 106);
            return C1A7.LJIJ(context, i3, LIZ2, LIZ3, c72062SPy3.LIZ(context));
        }
        C72062SPy c72062SPy4 = new C72062SPy();
        String string4 = context.getString(i2);
        o.LJIIIIZZ(string4, "context.getString(rawHintTextId)");
        c72062SPy4.LIZIZ = string4;
        c72062SPy4.LJ(1);
        c72062SPy4.LIZ = false;
        c72062SPy4.LIZIZ(i4);
        c72062SPy4.LJFF = new AqS3S2201000_3(i5, context, enterFrom, str, interfaceC65784Pro, 1);
        return C1A7.LJIJ(context, i, c72062SPy4.LIZ(context));
    }
}
