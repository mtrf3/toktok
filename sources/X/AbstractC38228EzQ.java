package X;

import org.json.JSONObject;

/* renamed from: X.EzQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38228EzQ extends QXX {
    public String LJLIL;

    @Override // X.QXX
    public final JSONObject LLLLLLLZIL() {
        JSONObject LLLLLLLZIL = super.LLLLLLLZIL();
        C77123UOp.LJJJJZI("event_type", this.LJLIL, LLLLLLLZIL);
        return LLLLLLLZIL;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseNativeInfo{eventType='");
        return C77800Ug8.LIZJ(LIZ, this.LJLIL, '\'', '}', LIZ);
    }

    public AbstractC38228EzQ(String str) {
        super((Object) null);
        this.LJLIL = str;
    }
}
