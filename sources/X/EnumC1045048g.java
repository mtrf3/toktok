package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.48g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1045048g implements WireEnum {
    FilteredReasonNone(0),
    FilteredReasonRisk(1),
    FilteredRequestKeyword(2);

    public static final ProtoAdapter<EnumC1045048g> ADAPTER = new EnumAdapter<EnumC1045048g>() { // from class: X.48h
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC1045048g LIZ(int i) {
            return EnumC1045048g.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC1045048g fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return FilteredRequestKeyword;
            }
            return FilteredReasonRisk;
        }
        return FilteredReasonNone;
    }

    public static EnumC1045048g valueOf(String str) {
        return (EnumC1045048g) V0N.LJJJ(EnumC1045048g.class, str);
    }

    EnumC1045048g(int i) {
        this.LJLIL = i;
    }
}
