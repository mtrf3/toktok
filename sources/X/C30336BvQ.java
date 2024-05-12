package X;

import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.BvQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30336BvQ extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC08070Tj<? extends LiveEffect>> {
    public static final C30336BvQ LJLIL = new C30336BvQ();

    public C30336BvQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC08070Tj<? extends LiveEffect> invoke() {
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            InterfaceC08070Tj<LiveEffect> liveComposerFilterManager = C7N.LJII().getLiveComposerFilterManager();
            o.LJI(liveComposerFilterManager);
            return liveComposerFilterManager;
        }
        InterfaceC08070Tj<FilterModel> liveFilterManager = C7N.LJII().getLiveFilterManager();
        o.LJI(liveFilterManager);
        return liveFilterManager;
    }
}
