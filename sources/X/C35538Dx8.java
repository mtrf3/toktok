package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.settings.MessageCenterTabListEntranceSettings;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Dx8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35538Dx8 extends F9E implements InterfaceC57784Mm4 {
    public final List<MessageCenterTabListEntranceSettings.TabEntranceItem> LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C35538Dx8(List<MessageCenterTabListEntranceSettings.TabEntranceItem> tabList) {
        o.LJIIIZ(tabList, "tabList");
        this.LJLIL = tabList;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}