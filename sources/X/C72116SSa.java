package X;

import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SSa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72116SSa implements ST2 {
    public final /* synthetic */ C76732zl LIZ;
    public final /* synthetic */ ProfileAigcAvatarViewModel LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ C76732zl LIZLLL;
    public final /* synthetic */ List<String> LJ;

    @Override // X.ST2
    public final void LIZ(ST4 resultCode, Integer num) {
        o.LJIIIZ(resultCode, "resultCode");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("save to album callback, result code: ");
        LIZ.append(resultCode);
        LIZ.append(",saved photo count: ");
        LIZ.append(num);
        C221018lt.LIZ("ProfileAigcAvatarViewModel", X1D.LIZIZ(LIZ));
        int i = ST3.LIZ[resultCode.ordinal()];
        if (i != 1) {
            if (i != 3) {
                return;
            }
            C76732zl c76732zl = this.LIZLLL;
            int i2 = c76732zl.element + 1;
            c76732zl.element = i2;
            this.LIZIZ.hv0(i2, this.LIZ.element, this.LJ.size());
            return;
        }
        this.LIZ.element++;
        this.LIZIZ.LJLL.LIZIZ(this.LIZJ, EnumC35502DwY.TOOLS_API);
        this.LIZIZ.hv0(this.LIZLLL.element, this.LIZ.element, this.LJ.size());
    }

    public C72116SSa(ProfileAigcAvatarViewModel profileAigcAvatarViewModel, String str, List list, C76732zl c76732zl, C76732zl c76732zl2) {
        this.LIZ = c76732zl;
        this.LIZIZ = profileAigcAvatarViewModel;
        this.LIZJ = str;
        this.LIZLLL = c76732zl2;
        this.LJ = list;
    }
}
