package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ATm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26290ATm extends HSS {
    @Override // X.S1E
    public final S1E clone() {
        return new C26290ATm();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ANCHOR_AIGC_AVATAR.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        eventMapBuilder.LJI("anchor_type", "ai_avatar");
        super.LJ(eventMapBuilder);
    }

    @Override // X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        if (C26356AWa.LIZ()) {
            return super.LJFF(list);
        }
        ORS.LJJLIL(new AqS170S0100000_4(this, 948), list);
        return EnumC26289ATl.NOT_FOUND;
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        eventMapBuilder.LJI("anchor_type", "ai_avatar");
        LJJJJIZL(new AqS170S0100000_4(this, 949));
        HSS.LJJIZ(this, eventMapBuilder, 6);
    }
}
