package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.OlL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC62835OlL implements WireEnum {
    DeepLink(0),
    H5Link(1),
    FollowUser(2),
    Callback(3),
    Show(4),
    Refresh(5);

    public static final ProtoAdapter<EnumC62835OlL> ADAPTER = new EnumAdapter<EnumC62835OlL>() { // from class: X.OlN
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC62835OlL LIZ(int i) {
            return EnumC62835OlL.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC62835OlL fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return Refresh;
                        }
                        return Show;
                    }
                    return Callback;
                }
                return FollowUser;
            }
            return H5Link;
        }
        return DeepLink;
    }

    public static EnumC62835OlL valueOf(String str) {
        return (EnumC62835OlL) V0N.LJJJ(EnumC62835OlL.class, str);
    }

    EnumC62835OlL(int i) {
        this.LJLIL = i;
    }
}
