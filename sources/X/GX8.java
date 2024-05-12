package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileCheckResults;
import java.io.File;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GX8 {
    public static final long LJI() {
        File file = new File(C60903NvH.LJIIJJI().LJJIJL().getPathService().getCreativeRoot());
        C78966Uyw.LJJJJLL(file);
        return C38891fp.LJIJI(file.getAbsolutePath());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DraftCheckResult LIZ(AwemeDraft draft) {
        o.LJIIIZ(draft, "draft");
        long currentTimeMillis = System.currentTimeMillis();
        if (draft.LJJJJI.creationMode == 3) {
            return new DraftCheckResult(System.currentTimeMillis() - currentTimeMillis, new DraftFileCheckResults(new ArrayList(), new ArrayList()), null, 0, 12, 0 == true ? 1 : 0);
        }
        OSZ<List<DraftFileCheckResult>, List<DraftFileCheckResult>> LIZIZ = LIZIZ(draft.LIZIZ(), draft.LJJJJI, AVDraftExtras.class);
        OSZ<List<DraftFileCheckResult>, List<DraftFileCheckResult>> LIZIZ2 = LIZIZ(draft.LIZIZ(), draft.LIZ, CreativeModel.class);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LIZIZ.getFirst());
        arrayList.addAll(LIZIZ2.getFirst());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(LIZIZ.getSecond());
        arrayList2.addAll(LIZIZ2.getSecond());
        return new DraftCheckResult(currentTimeMillis2, new DraftFileCheckResults(arrayList, arrayList2), null, 0, 12, 0 == true ? 1 : 0);
    }

    public static final void LIZLLL(FileChannel fileChannel) {
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (Exception e) {
                H78.LJ(e);
            }
        }
    }

    public static final void LJ(CreativeInfo creativeInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("deleteUnUseCreativeFiles , creativeInfo : ");
        LIZ.append(creativeInfo);
        LIZ.append(" trace : ");
        LIZ.append(android.util.Log.getStackTraceString(new RuntimeException()));
        GPR.LIZJ(X1D.LIZIZ(LIZ));
        File[] listFiles = new File(C60903NvH.LJIIJJI().LJJIJL().getPathService().LIZIZ(new CreativeInfo(creativeInfo.getCreationId(), -1, null, 4, null))).listFiles(new GX9(creativeInfo));
        if (listFiles != null) {
            for (File it : listFiles) {
                o.LJIIIIZZ(it, "it");
                OR7.LLLIIL(it);
            }
        }
    }

    public static final File LJFF(File file) {
        if (file.exists()) {
            return file;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return LJFF(parentFile);
        }
        return null;
    }

    public static final String LJII(File file, int i) {
        File[] listFiles;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("-");
        }
        sb.append(file.getName());
        sb.append("\n");
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File it : listFiles) {
                o.LJIIIIZZ(it, "it");
                sb.append(LJII(it, i + 4));
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "strBuilder.toString()");
        return sb2;
    }

    public static final <DATA> OSZ<List<DraftFileCheckResult>, List<DraftFileCheckResult>> LIZIZ(CreativeInfo creativeInfo, DATA data, Class<DATA> cls) {
        C42236Ghs LIZ = C42083GfP.LIZ(cls, InterfaceC43620HAa.class);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            LIZ.LIZIZ(data, new GPY(new HashMap(), creativeInfo, arrayList, arrayList2));
        } catch (GX7 unused) {
        }
        return new OSZ<>(arrayList, arrayList2);
    }

    public static final void LIZJ(java.util.Map<String, Boolean> map, CreativeInfo creativeInfo, List<DraftFileCheckResult> list, List<DraftFileCheckResult> list2, String str, InterfaceC43620HAa interfaceC43620HAa, Field field) {
        DraftFileCheckResult draftFileCheckResult;
        String str2;
        if (map.get(str) == null) {
            creativeInfo.getCreationId();
            if (str.length() == 0) {
                draftFileCheckResult = new DraftFileCheckResult(0, null, null, null, 15, null);
            } else if (C78966Uyw.LJJIJIL(str)) {
                draftFileCheckResult = new DraftFileCheckResult(0, null, null, null, 15, null);
            } else {
                File LJFF = LJFF(new File(str));
                if (LJFF != null) {
                    str2 = LJFF.getAbsolutePath();
                } else {
                    str2 = null;
                }
                draftFileCheckResult = new DraftFileCheckResult(-101, str2, str, field.toString());
            }
            if (!interfaceC43620HAa.blockCreative() || draftFileCheckResult.isSuc()) {
                if (!interfaceC43620HAa.blockCreative() && !draftFileCheckResult.isSuc()) {
                    list2.add(draftFileCheckResult);
                    return;
                } else {
                    map.put(str, Boolean.valueOf(draftFileCheckResult.isSuc()));
                    return;
                }
            }
            list.add(draftFileCheckResult);
            throw new GX7();
        }
    }
}
