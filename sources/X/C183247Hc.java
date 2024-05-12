package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import kotlin.jvm.internal.o;

/* renamed from: X.7Hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183247Hc extends AbstractC65781Prl implements InterfaceC65784Pro<C7JY> {
    public static final C183247Hc LJLIL = new C183247Hc();

    public C183247Hc() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7JY] */
    @Override // X.InterfaceC65784Pro
    public final C7JY invoke() {
        return new InterfaceC200587u2() { // from class: X.7JY
            @Override // X.InterfaceC200587u2
            public final boolean LIZ(Aweme aweme, String str, String str2, Boolean bool) {
                return false;
            }

            /* JADX WARN: Incorrect types in method signature: <T:Lcom/bytedance/assem/arch/reused/ReusedUIAssem<*>;:LX/8XO<TITEM;>;ITEM:Ljava/lang/Object;>(TT;LX/Pko<+Lcom/bytedance/assem/arch/reused/ReusedAssem<*>;>;Ljava/lang/String;)V */
            @Override // X.InterfaceC200587u2
            public final void LIZIZ(ReusedUIAssem host, InterfaceC65350Pko interfaceC65350Pko, String str) {
                o.LJIIIZ(host, "host");
            }

            @Override // X.InterfaceC200587u2
            public final void LIZJ(String str) {
            }

            @Override // X.InterfaceC200587u2
            public final boolean LIZLLL(Aweme aweme, BaseFeedPageParams baseFeedPageParams) {
                return false;
            }

            @Override // X.InterfaceC200587u2
            public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LJ() {
                return null;
            }
        };
    }
}
