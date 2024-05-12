package X;

import android.content.Context;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import com.ss.android.ugc.aweme.creative.model.ForwardEditPublishData;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardPublishLock;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6lF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169656lF {
    public static final boolean LIZ;
    public static final java.util.Map<String, InterfaceC68342mE<String>> LIZIZ;
    public static final java.util.Map<String, QuickForwardPublishLock> LIZJ;
    public static final java.util.Map<String, InterfaceC79150V4o> LIZLLL;
    public static final C62822Ol8 LJ;

    static {
        FFL.LJIIIZ().getClass();
        LIZ = FFL.LJ(31744, "enable_quick_share_story_publish_cloud_merge", true, false);
        LIZIZ = new LinkedHashMap();
        LIZJ = new LinkedHashMap();
        LIZLLL = new LinkedHashMap();
        LJ = C221108m2.LIZIZ(C169666lG.LJLIL);
        C6YM.LIZ();
        C69B.LIZ();
    }

    public static ProgressDialogC43239Gy3 LIZ(Context context, final InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        EnumC42288Gii enumC42288Gii;
        if (z) {
            enumC42288Gii = EnumC42288Gii.VISIBLE_AFTER_5S;
        } else {
            enumC42288Gii = EnumC42288Gii.GONE;
        }
        ProgressDialogC43239Gy3 LIZJ2 = C42034Gec.LIZJ(context, enumC42288Gii, new InterfaceC43240Gy4() { // from class: X.6lH
            @Override // X.InterfaceC43240Gy4
            public final void LIZIZ() {
                interfaceC65784Pro.invoke();
            }
        });
        LIZJ2.setIndeterminate(true);
        LIZJ2.setMessage(context.getString(R.string.r6l));
        LIZJ2.setCancelable(false);
        if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/DoubleBallLoadingDialog", "show", LIZJ2, new Object[0], "void", new C65300Pk0(false, "()V", "4827419159875641104")).LIZ) {
            LIZJ2.show();
        }
        return LIZJ2;
    }

    public static void LIZIZ(ForwardEditPublishData forwardEditPublishData, VideoPublishEditModel model, boolean z) {
        o.LJIIIZ(model, "model");
        String id = forwardEditPublishData.draftId;
        o.LJIIIZ(id, "id");
        LIZJ.remove(id);
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new GLY(model, forwardEditPublishData, z, null), 3);
    }

    public static void LIZJ(CanvasVideoData canvasVideoData, String str, InterfaceC88473Ynt interfaceC88473Ynt) {
        String str2;
        CanvasFilterParam canvasFilterParam;
        ForwardCanvasExtra forwardCanvasExtra;
        ForwardVideo forwardVideo;
        if (canvasVideoData == null || C79004UzY.LJJJ(canvasVideoData)) {
            interfaceC88473Ynt.invoke(Boolean.TRUE, Boolean.FALSE, str);
            return;
        }
        List<String> sourceInfo = canvasVideoData.getSourceInfo();
        if (sourceInfo != null) {
            str2 = (String) ORZ.LJLLLL(sourceInfo);
        } else {
            str2 = null;
        }
        List<CanvasFilterParam> transformList = canvasVideoData.getTransformList();
        if (transformList != null) {
            canvasFilterParam = (CanvasFilterParam) ORZ.LJLLLL(transformList);
        } else {
            canvasFilterParam = null;
        }
        CanvasExtra extra = canvasVideoData.getExtra();
        if (extra == null || (forwardCanvasExtra = extra.getForwardCanvasExtra()) == null || (forwardVideo = forwardCanvasExtra.getForwardVideo()) == null || canvasFilterParam == null) {
            Boolean bool = Boolean.FALSE;
            interfaceC88473Ynt.invoke(bool, bool, str);
        } else {
            XKX.LIZLLL((InterfaceC70422pa) LJ.getValue(), null, null, new C163566bQ(str2, canvasFilterParam, interfaceC88473Ynt, str, canvasVideoData, forwardVideo, null), 3);
        }
    }
}
