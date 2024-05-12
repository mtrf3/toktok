package X;

import Y.IDhS99S0100000_6;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import kotlin.jvm.internal.o;

/* renamed from: X.TOo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74574TOo extends AbstractC74512TMe<InfoStickerEffect, E3Y, InfoStickerListModel> {
    public final InterfaceC65784Pro<InterfaceC84497XEf> LJ;
    public final int LJFF;
    public final String LJI;
    public final String LJII;

    @Override // X.R30
    public final AbstractC73672Svk LJII(Object obj) {
        OSZ req = (OSZ) obj;
        o.LJIIIZ(req, "req");
        ((Number) req.getFirst()).intValue();
        E3Y e3y = (E3Y) req.getSecond();
        AbstractC73672Svk<R> LJJIIJZLJL = LJIIJ(e3y).LJIJI(new IDhS99S0100000_6(e3y, 10)).LJJIIJZLJL();
        o.LJIIIIZZ(LJJIIJZLJL, "fetchPage(count, request…\n        }.toObservable()");
        return LJJIIJZLJL;
    }

    public C73579SuF LJIIJ(E3Y cursorData) {
        o.LJIIIZ(cursorData, "cursorData");
        return AbstractC73638SvC.LJI(new C74575TOp(this, cursorData));
    }

    @Override // X.AbstractC74512TMe
    public final boolean LJIIIIZZ(E3Y e3y, E3Y e3y2) {
        E3Y a = e3y;
        E3Y b = e3y2;
        o.LJIIIZ(a, "a");
        o.LJIIIZ(b, "b");
        if (a.LJLIL == b.LJLIL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C74574TOo(InterfaceC65784Pro<? extends InterfaceC84497XEf> effectPlatform, int i, String str, String str2, E3Y e3y) {
        super(e3y);
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LJ = effectPlatform;
        this.LJFF = i;
        this.LJI = str;
        this.LJII = str2;
    }
}
