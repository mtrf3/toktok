package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerRecentTabSwitchSetting;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1ts, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47601ts extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends C32001Nk>> {
    public static final C47601ts LJLIL = new C47601ts();

    public C47601ts() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends C32001Nk> invoke() {
        if (LiveStickerRecentTabSwitchSetting.INSTANCE.canShowRecentTab()) {
            String RECENTS = C0TY.LJIIJ;
            o.LJIIIIZZ(RECENTS, "RECENTS");
            return C47261Igj.LJJIJIIJI(new C32001Nk("favorite", "favorite", true), new C32001Nk(RECENTS, "Recents", true));
        }
        return C47261Igj.LJJIJ(new C32001Nk("favorite", "favorite", true));
    }
}
