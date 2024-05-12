package X;

import Y.ARunnableS28S0200000_9;
import com.bytedance.poplayer.core.PopupManager;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.M8d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56311M8d {
    public static final java.util.Map<String, Long> LIZ = new LinkedHashMap();

    public static void LIZ(java.util.Set runningScenes, InterfaceC55643Lsd scene) {
        o.LJIIIZ(runningScenes, "runningScenes");
        o.LJIIIZ(scene, "scene");
        PopupManager.LIZLLL().LJII.execute(new ARunnableS28S0200000_9(scene, runningScenes, 68));
    }

    public static void LIZIZ(C56309M8b taskWrapper, EnumC56314M8g failCode, String sceneId, String reason, OSZ osz) {
        o.LJIIIZ(taskWrapper, "taskWrapper");
        o.LJIIIZ(sceneId, "sceneId");
        o.LJIIIZ(failCode, "failCode");
        o.LJIIIZ(reason, "reason");
        PopupManager.LIZLLL().LJII.execute(new RunnableC56310M8c(taskWrapper, failCode, sceneId, reason, osz));
    }
}
