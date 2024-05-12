package X;

import com.ss.android.ugc.gamora.editorpro.crop.VideoCropService;
import com.ss.ugc.android.editor.components.base.api.IVideoCropService;

/* renamed from: X.50G, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C50G extends AbstractC65781Prl implements InterfaceC65784Pro<IVideoCropService> {
    public static final C50G LJLIL = new C50G();

    public C50G() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IVideoCropService invoke() {
        return VideoCropService.createIVideoCropServicebyMonsterPlugin(false);
    }
}
