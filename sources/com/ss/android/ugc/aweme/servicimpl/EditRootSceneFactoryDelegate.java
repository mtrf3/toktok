package com.ss.android.ugc.aweme.servicimpl;

import X.C6F2;
import X.C6FG;
import X.C82622Wbi;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditRootSceneFactoryDelegate implements IEditRootSceneFactory {
    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final C6F2 LIZ(C82622Wbi activityIOCContainer) {
        C6FG c6fg;
        o.LJIIIZ(activityIOCContainer, "activityIOCContainer");
        if (!AVInitializerImpl.LIZIZ) {
            c6fg = null;
        } else {
            c6fg = C6FG.LIZIZ;
        }
        o.LJI(c6fg);
        return c6fg.LIZ(activityIOCContainer);
    }
}
