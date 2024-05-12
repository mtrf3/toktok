package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import java.io.File;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.HFv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43771HFv extends HG1 {
    public final CreativeInfo LIZJ;

    @Override // X.HG1
    public final String LIZJ() {
        String LJ = C43073GvN.LJ(C62850Ola.LJ(), this.LIZJ, EnumC43652HBg.EXTRACT_FRAMES, null, 12);
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        return s.LJJZZIII(separator, LJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43771HFv(CreativeInfo creativeInfo) {
        super(C60903NvH.LJ);
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.LIZJ = creativeInfo;
        this.LIZIZ = LIZJ();
    }
}
