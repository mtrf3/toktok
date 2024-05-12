package X;

import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class C4H extends CR6 {
    public final long LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI = R.drawable.d59;
    public final String LJLJJI;

    public final Object[] LIZ() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI, Integer.valueOf(this.LJLJI), this.LJLJJI};
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4H) {
            return C78966Uyw.LJIIIZ(((C4H) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("LocalActionMessage:%s,%s,%s,%s", LIZ());
    }

    public C4H(long j, String str, String str2) {
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJJI = str2;
        this.type = EnumC31509CYf.LOCAL_ACTION_MESSAGE;
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        this.baseMessage = commonMessageData;
    }
}
