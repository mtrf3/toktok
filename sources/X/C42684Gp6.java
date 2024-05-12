package X;

import com.ss.android.ugc.aweme.port.internal.IActivityPageService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Gp6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42684Gp6 implements IActivityPageService {
    public final java.util.Map<String, String> LIZ = C113554cx.LJJL(new OSZ("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "tool_record_page"), new OSZ("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "tool_publish_page"), new OSZ("com.ss.android.ugc.gamora.editorpro.EditorProActivity", "tool_editor_pro_page"), new OSZ("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "tool_choose_cover_page"));
    public final java.util.Map<String, String> LIZIZ = C113554cx.LJJL(new OSZ(VideoEditContainerScene.class.getName(), "tool_edit_page"), new OSZ(VideoRecordNewScene.class.getName(), "tool_record_page"), new OSZ(ExteriorVideoRecordScene.class.getName(), "tool_record_page"));

    @Override // com.ss.android.ugc.aweme.port.internal.IActivityPageService
    public final void listenToCurrentPage(InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        C42683Gp5 c42683Gp5 = new C42683Gp5(this, listener);
        C42383GkF c42383GkF = C42130GgA.LIZ;
        C42682Gp4 c42682Gp4 = new C42682Gp4(this, c42683Gp5, listener);
        c42383GkF.LIZ();
        ((ArrayList) c42383GkF.LIZJ).add(c42682Gp4);
        C42685Gp7 c42685Gp7 = new C42685Gp7(listener);
        c42383GkF.LIZ();
        ((ArrayList) c42383GkF.LIZIZ).add(c42685Gp7);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IActivityPageService
    public final void updateCurrentScene(String scene, boolean z) {
        String str;
        o.LJIIIZ(scene, "scene");
        C78553UsH c78553UsH = C3B9.LIZ;
        if (!z) {
            str = "";
        } else {
            str = scene;
        }
        c78553UsH.LJIILJJIL = str;
        C78542Us6 c78542Us6 = C3B0.LIZ;
        if (!z) {
            scene = "";
        }
        c78542Us6.LJIILJJIL = scene;
    }
}
