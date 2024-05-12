package X;

import com.google.gson.j;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.GwL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43133GwL {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(VideoPublishEditModel model) {
        String LIZJ;
        o.LJIIIZ(model, "model");
        ArrayList arrayList = new ArrayList();
        ArrayList<ImportVideoInfo> arrayList2 = model.importInfoList;
        if (arrayList2 != null) {
            Iterator<ImportVideoInfo> it = arrayList2.iterator();
            while (it.hasNext()) {
                ImportVideoInfo next = it.next();
                if (next.getHypicDescription() != null) {
                    LIZJ = next.getHypicDescription();
                } else {
                    String originImportPath = next.getOriginImportPath();
                    if (originImportPath == null && (originImportPath = next.getRealImportPath()) == null) {
                        originImportPath = "";
                    }
                    LIZJ = LIZJ(originImportPath);
                }
                if (C78685UuP.LJJJZ(LIZJ)) {
                    arrayList.add(LIZJ);
                }
            }
        }
        if (!model.getEditorProModel().getPipResourcePaths().isEmpty()) {
            Iterator<String> it2 = model.getEditorProModel().getPipResourcePaths().iterator();
            while (it2.hasNext()) {
                String LIZJ2 = LIZJ(it2.next());
                if (C78685UuP.LJJJZ(LIZJ2)) {
                    arrayList.add(LIZJ2);
                }
            }
        }
        if (!(!arrayList.isEmpty())) {
            return "";
        }
        return arrayList.toString();
    }

    public static final boolean LIZIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (C42113Gft.LIZ() && !model.isCutSameVideoType() && ((!model.isMvThemeVideoType() || model.isPhotoMvMode) && !model.isCurrentAutoCutMode() && !model.isFromAutoCutAnchor() && !model.isDuet() && !H7R.LJJLIIIJL(model))) {
            return true;
        }
        return false;
    }

    public static String LIZJ(String str) {
        boolean z;
        String str2;
        if (!C42113Gft.LIZ()) {
            return "";
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !C44687HgJ.LIZIZ(str)) {
            return "";
        }
        String LJIILJJIL = C44694HgQ.LJIILJJIL(str);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getHypicDescFromMedia: mimeType = ");
        LIZ2.append(LJIILJJIL);
        LIZ2.append(", path = ");
        LIZ2.append(str);
        H78.LJI(X1D.LIZIZ(LIZ2));
        if (!C44694HgQ.LIZ(LJIILJJIL)) {
            return "";
        }
        String str3 = null;
        try {
            C0MZ LJIIJJI = C44694HgQ.LJIIJJI(str);
            if (LJIIJJI != null) {
                str2 = LJIIJJI.LIZLLL("UserComment");
            } else {
                str2 = null;
            }
            if (C78685UuP.LJJJZ(str2)) {
                new com.google.gson.o();
                j LJJIJ = com.google.gson.o.LIZ(str2).LJIIZILJ().LJJIJ("tiktok_developers_3p_anchor_params");
                if (LJJIJ != null) {
                    str3 = LJJIJ.toString();
                }
            }
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("getHypicDescFromMedia failed: ");
            LIZ3.append(C78963Uyt.LJIJJ(e));
            H78.LIZJ(X1D.LIZIZ(LIZ3));
        }
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    public static final void LIZLLL(String srcPath, String tarPath) {
        o.LJIIIZ(srcPath, "srcPath");
        o.LJIIIZ(tarPath, "tarPath");
        if (srcPath.length() == 0 || tarPath.length() == 0 || o.LJ(srcPath, tarPath) || !C44687HgJ.LIZIZ(srcPath) || !C44687HgJ.LIZIZ(tarPath) || !C44694HgQ.LJIJI(srcPath, false) || !C44694HgQ.LJIJI(tarPath, true)) {
            return;
        }
        String LIZJ = LIZJ(srcPath);
        try {
            if (LIZJ.length() <= 0) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("{\"tiktok_developers_3p_anchor_params\":");
            LIZ2.append(LIZJ);
            LIZ2.append('}');
            String LIZIZ = X1D.LIZIZ(LIZ2);
            C0MZ LJIIJJI = C44694HgQ.LJIIJJI(tarPath);
            if (LJIIJJI == null) {
                return;
            }
            LJIIJJI.LJIL(LIZIZ);
            LJIIJJI.LJIJJ();
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("transHypicMetadata failed: ");
            LIZ3.append(C78963Uyt.LJIJJ(e));
            H78.LIZJ(X1D.LIZIZ(LIZ3));
        }
    }
}
