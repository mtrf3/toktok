package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes14.dex */
public final class V0A implements V04 {
    public final V0I LJLIL = new V0I();

    @Override // X.V04
    public final C79007Uzb LJ(String str, V0B v0b, int i, int i2, java.util.Map<EnumC79013Uzh, ?> map) {
        if (v0b == V0B.UPC_A) {
            return this.LJLIL.LJ(CardStruct.IStatusCode.DEFAULT.concat(String.valueOf(str)), V0B.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(v0b)));
    }
}
