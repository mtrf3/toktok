package X;

import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;

/* renamed from: X.JGe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48876JGe extends AbstractC65781Prl implements InterfaceC65784Pro<IAdSceneService> {
    public static final C48876JGe INSTANCE = new C48876JGe();

    public C48876JGe() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAdSceneService invoke() {
        return AdSceneServiceImpl.LJII();
    }
}
