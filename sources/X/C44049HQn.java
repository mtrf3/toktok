package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.o;

/* renamed from: X.HQn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44049HQn<T1, T2, R> implements RTU {
    public final /* synthetic */ C44044HQi LJLIL;

    public C44049HQn(C44044HQi c44044HQi) {
        this.LJLIL = c44044HQi;
    }

    @Override // X.RTU
    public final Object apply(Object obj, Object obj2) {
        int i;
        String str;
        C44048HQm t1 = (C44048HQm) obj;
        C44048HQm t2 = (C44048HQm) obj2;
        o.LJIIIZ(t1, "t1");
        o.LJIIIZ(t2, "t2");
        this.LJLIL.getClass();
        String str2 = t2.LIZ;
        int i2 = t2.LIZIZ;
        NLETemplateModel nLETemplateModel = t2.LIZJ;
        NLEModel nLEModel = t2.LIZLLL;
        long j = t2.LJ;
        String str3 = t2.LJFF;
        String str4 = t2.LJI;
        String str5 = t2.LJII;
        String str6 = t2.LJIIIIZZ;
        String str7 = t1.LJIIIZ;
        int i3 = t1.LJIIJ;
        AVMusic aVMusic = t1.LJIIJJI;
        String str8 = t1.LJIIL;
        if (t2.LIZ()) {
            i = t2.LJIILIIL;
        } else {
            i = t1.LJIILIIL;
        }
        if (t2.LIZ()) {
            str = t2.LJIILJJIL;
        } else {
            str = t1.LJIILJJIL;
        }
        return new C44048HQm(str2, i2, nLETemplateModel, nLEModel, j, str3, str4, str5, str6, str7, i3, aVMusic, str8, i, str);
    }
}
