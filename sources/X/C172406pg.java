package X;

import com.bytedance.ies.cutsame.source.model.ProcessorConfig;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6pg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172406pg {
    public final String LIZ;
    public final String LIZIZ;
    public final C173866s2 LIZJ;
    public final ProcessorConfig LIZLLL;
    public C172356pb LJ;
    public final C62822Ol8 LJFF;

    public C172406pg(String savePath, String str, C173866s2 c173866s2, ProcessorConfig config) {
        o.LJIIIZ(savePath, "savePath");
        o.LJIIIZ(config, "config");
        this.LIZ = savePath;
        this.LIZIZ = str;
        this.LIZJ = c173866s2;
        this.LIZLLL = config;
        com.bytedance.ies.nleeditor.NLE.loadNLELibrary$default(com.bytedance.ies.nleeditor.NLE.INSTANCE, false, 1, null);
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 641));
    }
}
