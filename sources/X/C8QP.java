package X;

import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentsData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedMultiSceneComponentsData;

/* renamed from: X.8QP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8QP extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends FeedComponentsData>> {
    public static final C8QP LJLIL = new C8QP();

    public C8QP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends FeedComponentsData> invoke() {
        try {
            return C8QN.LIZLLL((FeedMultiSceneComponentsData) C8QQ.LIZ.getValue());
        } catch (Exception unused) {
            C8QN.LIZJ(6, "all_scene");
            return null;
        }
    }
}
