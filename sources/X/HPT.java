package X;

import com.ss.android.ugc.aweme.services.external.ui.EditorProAnchorConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HPT {
    public final EditorProAnchorConfig LIZ;

    public final C188727au LIZ() {
        Object obj;
        EnumC1289754j[] values = EnumC1289754j.values();
        int length = values.length;
        int i = 0;
        while (true) {
            String str = null;
            if (i < length) {
                EnumC1289754j enumC1289754j = values[i];
                String type = enumC1289754j.getType();
                EditorProAnchorConfig editorProAnchorConfig = this.LIZ;
                if (editorProAnchorConfig != null) {
                    str = editorProAnchorConfig.getAnchorSubType();
                }
                if (o.LJ(type, str)) {
                    obj = Integer.valueOf(enumC1289754j.getValue());
                    break;
                }
                i++;
            } else {
                obj = "";
                break;
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJFF(obj, "ep_anchor_type");
        return c188727au;
    }

    public HPT(EditorProAnchorConfig editorProAnchorConfig) {
        this.LIZ = editorProAnchorConfig;
    }
}
