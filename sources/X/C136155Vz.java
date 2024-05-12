package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.5Vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136155Vz {
    public static final String LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        NLEModel LIZIZ = LIZIZ(model);
        if (LIZIZ == null || ((ArrayList) C45087Hml.LJIILIIL(LIZIZ)).size() > 35) {
            return null;
        }
        String LIZ = C132475Hv.LIZ(model.creativeModel.autoCutAnchorModel.templateId, EnumC43650HBe.AUTOCUT_TEMPLATE_ZIP, LIZIZ, model, null, false);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AutoCutTemplateHelper#buildAutoCutTemplateZip success: ");
        LIZ2.append(LIZ);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ2));
        return LIZ;
    }

    public static final NLEModel LIZIZ(VideoPublishEditModel model) {
        String str;
        boolean z;
        EditorProModel editorProModel;
        o.LJIIIZ(model, "model");
        C5K0.LIZ(2);
        NLEEditor nLEEditor = new NLEEditor();
        AutoCutAnchorModel autoCutAnchorModel = model.creativeModel.autoCutAnchorModel;
        if (!C78685UuP.LJJJZ(autoCutAnchorModel.nleData) && (str = autoCutAnchorModel.nleDataPath) != null && str.length() != 0 && C39579Fg7.LIZIZ(str)) {
            int i = autoCutAnchorModel.nleDataVersion;
            CreativeFlowData creativeFlowData = model.creativeFlowData;
            if (creativeFlowData != null && (editorProModel = creativeFlowData.getEditorProModel()) != null) {
                z = editorProModel.isAdvancedEditDraft();
            } else {
                z = false;
            }
            autoCutAnchorModel.nleDataVersion = C122954s7.LIZ(i, str, z).getSecond().intValue();
            autoCutAnchorModel.nleData = C39579Fg7.LJIJI(str);
        }
        String str2 = model.creativeModel.autoCutAnchorModel.nleData;
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        nLEEditor.LJI(model.creativeModel.autoCutAnchorModel.nleData);
        boolean LJLL = C44384HbQ.LJLL(model);
        C5V8.LJ(nLEEditor.LJ(), LJLL);
        C5V8.LIZLLL(nLEEditor.LJ(), LJLL);
        NLEModel LJ = nLEEditor.LJ();
        o.LJIIIIZZ(LJ, "editor.model");
        NLEModel dynamicCast = NLEModel.dynamicCast(LJ.deepClone());
        VecNLEResourceNodeSPtr allResources = dynamicCast.getAllResources();
        o.LJIIIIZZ(allResources, "templateModel.allResources");
        Iterator<NLEResourceNode> it = allResources.iterator();
        while (it.hasNext()) {
            NLEResourceNode next = it.next();
            if (next.LJFF() == EnumC123874tb.VIDEO || next.LJFF() == EnumC123874tb.IMAGE) {
                next.LJIIIZ("");
            }
        }
        return dynamicCast;
    }
}
