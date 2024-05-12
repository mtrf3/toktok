package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public final /* synthetic */ class Q8U implements InterfaceC65843Psl {
    @Override // X.InterfaceC65843Psl
    public void LIZ(boolean z) {
        if (z) {
            u.LJIIJJI = true;
        }
    }

    public static String LIZIZ(Object[] objArr, int i, String str, String str2) {
        String LLLZ = C16880lQ.LLLZ(str, Arrays.copyOf(objArr, i));
        o.LJIIIIZZ(LLLZ, str2);
        return LLLZ;
    }

    public static void LIZJ(C145995oB c145995oB, String str, String str2, VideoPublishEditModel videoPublishEditModel, String str3) {
        c145995oB.LJI(str, str2);
        c145995oB.LJI(str3, videoPublishEditModel.getCreationId());
    }
}
