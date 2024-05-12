package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YWM extends AbstractC23740wU {
    public static final YWM LIZJ = new YWM();

    public YWM() {
        super(30, 31);
    }

    @Override // X.AbstractC23740wU
    public final void LIZ(C38451f7 database) {
        o.LJIIIZ(database, "database");
        StringBuilder sb = new StringBuilder("create table if not exists MAF_USER (");
        EnumC87513YWf[] values = EnumC87513YWf.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            EnumC87513YWf enumC87513YWf = values[i];
            sb.append(enumC87513YWf.key);
            sb.append(" ");
            i = C0EH.LIZIZ(sb, enumC87513YWf.type, ",", i, 1);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        StringBuilder LIZ = X1D.LIZ();
        String substring = sb2.substring(0, sb2.length() - 1);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        LIZ.append(substring);
        LIZ.append(");");
        database.LJJIJIIJI(X1D.LIZIZ(LIZ));
    }
}
