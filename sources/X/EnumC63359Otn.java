package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Otn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63359Otn implements WireEnum {
    NOT_USE(0),
    MSG_RECEIVE_BY_WS(1),
    MSG_RECEIVE_BY_USER(2),
    MSG_RECEIVE_BY_INIT(3),
    MSG_RECEIVE_BY_LOAD_HISTORY(4),
    MSG_RECEIVE_BY_LOAD_NEWER(5),
    MSG_RECEIVE_BY_CHECK_MSG_V1(6),
    MSG_RECEIVE_BY_CHECK_MSG_V2(7),
    MSG_RECEIVE_BY_STRANGER(8),
    MSG_SHOW(9);

    public static final ProtoAdapter<EnumC63359Otn> ADAPTER = new EnumAdapter<EnumC63359Otn>() { // from class: X.Oto
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63359Otn LIZ(int i) {
            return EnumC63359Otn.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63359Otn fromValue(int i) {
        switch (i) {
            case 0:
                return NOT_USE;
            case 1:
                return MSG_RECEIVE_BY_WS;
            case 2:
                return MSG_RECEIVE_BY_USER;
            case 3:
                return MSG_RECEIVE_BY_INIT;
            case 4:
                return MSG_RECEIVE_BY_LOAD_HISTORY;
            case 5:
                return MSG_RECEIVE_BY_LOAD_NEWER;
            case 6:
                return MSG_RECEIVE_BY_CHECK_MSG_V1;
            case 7:
                return MSG_RECEIVE_BY_CHECK_MSG_V2;
            case 8:
                return MSG_RECEIVE_BY_STRANGER;
            case 9:
                return MSG_SHOW;
            default:
                return null;
        }
    }

    public static EnumC63359Otn valueOf(String str) {
        return (EnumC63359Otn) V0N.LJJJ(EnumC63359Otn.class, str);
    }

    EnumC63359Otn(int i) {
        this.LJLIL = i;
    }
}
