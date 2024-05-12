package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.translation.model.TranslationContent;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.8kB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219958kB {
    public static final LruCache<Long, C219948kA> LIZ = new LruCache<>(50);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C219428jK.LJLIL);

    public static Object LIZ(long j, String topicStr, InterfaceC67352kd interfaceC67352kd) {
        String targetLang = TranslationServiceImpl.LJJIJ().LJJIIZI();
        C219948kA c219948kA = LIZ.get(Long.valueOf(j));
        if (c219948kA != null) {
            o.LJIIIZ(topicStr, "topicStr");
            o.LJIIIZ(targetLang, "targetLang");
            if (c219948kA.LJLIL == j && o.LJ(c219948kA.LJLILLLLZI, targetLang) && o.LJ(c219948kA.LJLJI, topicStr) && c219948kA != null) {
                return c219948kA;
            }
        }
        final XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C76L LJFF = TranslationServiceImpl.LJJIJ().LJFF(4, targetLang, GsonProtectorUtils.toJson((Gson) LIZIZ.getValue(), C47261Igj.LJJIJ(new TranslationContent(topicStr))));
        final C219968kC c219968kC = new C219968kC(j, targetLang, topicStr);
        o.LJIIIZ(LJFF, "<this>");
        InterfaceC65753PrJ<Object> interfaceC65753PrJ = new InterfaceC65753PrJ<Object>() { // from class: X.8kD
            @Override // X.InterfaceC65753PrJ
            public final void onFailure(Throwable t) {
                o.LJIIIZ(t, "t");
                XJL<Object> xjl = xks;
                C3C4 LIZ2 = C141335gf.LIZ(t);
                C3C5.m7constructorimpl(LIZ2);
                xjl.resumeWith(LIZ2);
            }

            @Override // X.InterfaceC65753PrJ
            public final void onSuccess(Object obj) {
                Object invoke = c219968kC.invoke(obj);
                if (invoke != null) {
                    XJL<Object> xjl = xks;
                    C3C5.m7constructorimpl(invoke);
                    xjl.resumeWith(invoke);
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                XJL<Object> xjl2 = xks;
                C3C4 LIZ2 = C141335gf.LIZ(new C2Q1("null result"));
                C3C5.m7constructorimpl(LIZ2);
                xjl2.resumeWith(LIZ2);
            }
        };
        LJFF.LJFF(new RunnableC65751PrH(LJFF, interfaceC65753PrJ), EnumC169566l6.LJLIL);
        return xks.LJIIJJI();
    }
}
