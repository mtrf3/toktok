package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.4YY, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C4YY implements WireEnum {
    NormalUserInbox(1),
    StrangerMessageRequest(2),
    StrangerFilteredRequest(3);

    public static final ProtoAdapter<C4YY> ADAPTER = new EnumAdapter<C4YY>() { // from class: X.4YZ
        @Override // com.squareup.wire.EnumAdapter
        public final C4YY LIZ(int i) {
            return C4YY.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static C4YY fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return StrangerFilteredRequest;
            }
            return StrangerMessageRequest;
        }
        return NormalUserInbox;
    }

    public static C4YY valueOf(String str) {
        return (C4YY) V0N.LJJJ(C4YY.class, str);
    }

    C4YY(int i) {
        this.LJLIL = i;
    }
}
