package X;

import java.util.LinkedHashMap;

/* renamed from: X.Qqt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68275Qqt extends C0M6 {
    public final /* synthetic */ C68244QqO LJFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68275Qqt(C68244QqO c68244QqO) {
        super(20);
        this.LJFF = c68244QqO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0M6
    public final Object LIZ(Object obj) {
        String str = (String) obj;
        QH7.LJI(str);
        C68244QqO c68244QqO = this.LJFF;
        c68244QqO.LJI();
        QH7.LJI(str);
        if (!c68244QqO.LJIJ(str)) {
            return null;
        }
        if (c68244QqO.LJII.containsKey(str) && c68244QqO.LJII.getOrDefault(str, null) != 0) {
            c68244QqO.LJIIL(str, (C68256Qqa) c68244QqO.LJII.getOrDefault(str, null));
        } else {
            c68244QqO.LJIIJJI(str);
        }
        return ((LinkedHashMap) c68244QqO.LJIIIZ.LJII()).get(str);
    }
}
