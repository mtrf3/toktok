package X;

import com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory;
import kotlin.jvm.internal.o;

/* renamed from: X.6FG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6FG implements IEditRootSceneFactory {
    public static final C6FG LIZIZ = new C6FG();
    public final /* synthetic */ IEditRootSceneFactory LIZ;

    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final C6F2 LIZ(C82622Wbi activityIOCContainer) {
        o.LJIIIZ(activityIOCContainer, "activityIOCContainer");
        return this.LIZ.LIZ(activityIOCContainer);
    }

    public C6FG() {
        IEditRootSceneFactory iEditRootSceneFactory;
        if (C1DG.LJIIIIZZ()) {
            iEditRootSceneFactory = new IEditRootSceneFactory() { // from class: X.6FF
                @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
                public final C6F2 LIZ(C82622Wbi activityIOCContainer) {
                    o.LJIIIZ(activityIOCContainer, "activityIOCContainer");
                    return new C146855pZ(activityIOCContainer);
                }
            };
        } else {
            iEditRootSceneFactory = new IEditRootSceneFactory() { // from class: X.6FH
                @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
                public final C6F2 LIZ(C82622Wbi activityIOCContainer) {
                    o.LJIIIZ(activityIOCContainer, "activityIOCContainer");
                    return new C147295qH(activityIOCContainer);
                }
            };
        }
        this.LIZ = iEditRootSceneFactory;
    }
}
