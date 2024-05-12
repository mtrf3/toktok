package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.LxH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55931LxH {
    public final /* synthetic */ AbstractC55930LxG LIZ;

    public final EnumC55932LxI LIZ() {
        ActivityC45651qj LIZ;
        EnumC55932LxI enumC55932LxI;
        CustomDotAssem customDotAssem = this.LIZ.LIZJ;
        if (customDotAssem != null && (LIZ = C212428Vi.LIZ(customDotAssem)) != null) {
            if (o.LJ("HOME", C116694i1.LIZ(LIZ).nv0())) {
                enumC55932LxI = EnumC55932LxI.HOME_TAB;
            } else {
                enumC55932LxI = EnumC55932LxI.NOT_HOME_TAB;
            }
            if (enumC55932LxI != null) {
                return enumC55932LxI;
            }
        }
        return EnumC55932LxI.NONE;
    }

    public C55931LxH(AbstractC55930LxG abstractC55930LxG) {
        this.LIZ = abstractC55930LxG;
    }
}
