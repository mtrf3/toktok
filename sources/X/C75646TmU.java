package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUserState;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/* renamed from: X.TmU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75646TmU extends AbstractC65781Prl implements InterfaceC65784Pro<EnumMap<LinkUserState, List<LinkUser>>> {
    public static final C75646TmU LJLIL = new C75646TmU();

    public C75646TmU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final EnumMap<LinkUserState, List<LinkUser>> invoke() {
        EnumMap<LinkUserState, List<LinkUser>> enumMap = new EnumMap<>((Class<LinkUserState>) LinkUserState.class);
        enumMap.put((EnumMap<LinkUserState, List<LinkUser>>) LinkUserState.LINKED, (LinkUserState) new ArrayList());
        enumMap.put((EnumMap<LinkUserState, List<LinkUser>>) LinkUserState.APPLICANT, (LinkUserState) new ArrayList());
        enumMap.put((EnumMap<LinkUserState, List<LinkUser>>) LinkUserState.INVITEE, (LinkUserState) new ArrayList());
        return enumMap;
    }
}
