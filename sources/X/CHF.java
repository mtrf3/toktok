package X;

import com.bytedance.android.livesdk.livesetting.level.FansClubBubbleSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public abstract class CHF {
    public static final CHG Companion;
    public static final CHF FANS_CLUB_JOIN_GIFT;
    public static final CHF FIRST_GIFT_TIPS;
    public static final /* synthetic */ CHF[] LJLJI;
    public static final CHF RANDOM_FIREWORKS;
    public static final java.util.Map<Integer, CHF> enumMap;
    public final int LJLIL;
    public final C09 LJLILLLLZI;

    public CHF() {
        throw null;
    }

    public static CHF valueOf(String str) {
        return (CHF) V0N.LJJJ(CHF.class, str);
    }

    public static CHF[] values() {
        return (CHF[]) LJLJI.clone();
    }

    public void markShown() {
    }

    public abstract boolean shouldShow();

    static {
        CHF chf = new CHF() { // from class: X.C0B
            public final C48459J0d<Integer> LJLJJI;

            {
                C09 c09 = C09.RANDOM_FIREWORKS;
                this.LJLJJI = InterfaceC30442Bx8.k;
            }

            @Override // X.CHF
            public final void markShown() {
                this.LJLJJI.LIZ(1);
            }

            @Override // X.CHF
            public final boolean shouldShow() {
                Integer LIZJ = this.LJLJJI.LIZJ();
                if (LIZJ == null || LIZJ.intValue() != 1) {
                    return true;
                }
                return false;
            }
        };
        RANDOM_FIREWORKS = chf;
        CHF chf2 = new CHF() { // from class: X.CHE
            @Override // X.CHF
            public final boolean shouldShow() {
                return true;
            }
        };
        FIRST_GIFT_TIPS = chf2;
        CHF chf3 = new CHF() { // from class: X.C0C
            public final C30554Byw<Boolean> LJLJJI;

            {
                C09 c09 = C09.FANS_START_GIFT;
                this.LJLJJI = InterfaceC30442Bx8.k2;
            }

            @Override // X.CHF
            public final void markShown() {
                this.LJLJJI.LIZJ(Boolean.FALSE);
            }

            @Override // X.CHF
            public final boolean shouldShow() {
                boolean z;
                RoomAuthStatus roomAuthStatus;
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                    z = roomAuthStatus.enableGift;
                } else {
                    z = true;
                }
                if (!o.LJ(this.LJLJJI.LIZ(), Boolean.FALSE) && z && FansClubBubbleSetting.INSTANCE.getValue()) {
                    return true;
                }
                return false;
            }
        };
        FANS_CLUB_JOIN_GIFT = chf3;
        LJLJI = new CHF[]{chf, chf2, chf3};
        Companion = new CHG();
        CHF[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (CHF chf4 : values) {
            linkedHashMap.put(Integer.valueOf(chf4.LJLIL), chf4);
        }
        enumMap = linkedHashMap;
    }

    public final int getHintId() {
        return this.LJLIL;
    }

    public final C09 getTooltipType() {
        return this.LJLILLLLZI;
    }

    public CHF(String str, int i, int i2, C09 c09, DefaultConstructorMarker defaultConstructorMarker) {
        this.LJLIL = i2;
        this.LJLILLLLZI = c09;
    }
}
