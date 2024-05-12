package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JND {
    public static final JNB LIZ(JQA param) {
        String str;
        C50469JrN searchVideoModel;
        o.LJIIIZ(param, "param");
        String str2 = param.LJIIJJI;
        String str3 = param.LJIIIIZZ;
        String str4 = param.LJII;
        String str5 = param.LJ;
        String str6 = param.LJFF;
        int i = param.LJIIL;
        JNB jnb = new JNB(param);
        jnb.LJIIZILJ("search_id", str4);
        jnb.LJIIZILJ("origin_format", param.LJJIFFI);
        jnb.LJIIZILJ("current_format", param.LJJII);
        jnb.LJIIZILJ("search_keyword", str5);
        jnb.LJIIZILJ("log_pb", str2);
        jnb.LJIIZILJ("impr_id", str3);
        jnb.LJIJI(str6);
        jnb.LJJIIJZLJL("1");
        C50652JuK.Companion.getClass();
        C50650JuI LIZJ = C50651JuJ.LIZJ();
        if (LIZJ != null && (searchVideoModel = LIZJ.getSearchVideoModel()) != null) {
            str = searchVideoModel.getGroupId();
        } else {
            str = null;
        }
        jnb.LJIIZILJ("last_from_group_id", str);
        jnb.LJJI(Integer.valueOf(i));
        return jnb;
    }

    public static final JN8 LIZIZ(JQA param) {
        o.LJIIIZ(param, "param");
        String str = param.LJIIJJI;
        String str2 = param.LJIIIIZZ;
        String str3 = param.LJII;
        String str4 = param.LJ;
        String str5 = param.LJFF;
        int i = param.LJIIL;
        JN8 jn8 = new JN8(param);
        jn8.LJIIZILJ("search_id", str3);
        jn8.LJIIZILJ("origin_format", param.LJJIFFI);
        jn8.LJIIZILJ("current_format", param.LJJII);
        jn8.LJIIZILJ("search_keyword", str4);
        jn8.LJIIZILJ("log_pb", str);
        jn8.LJIIZILJ("impr_id", str2);
        jn8.LJIJI(str5);
        jn8.LJJIIJZLJL("1");
        jn8.LJJI(Integer.valueOf(i));
        return jn8;
    }
}
