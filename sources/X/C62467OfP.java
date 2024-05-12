package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OfP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62467OfP {
    public static void LIZ(BaseSharePackage baseSharePackage, String coverTemplateId, int i) {
        o.LJIIIZ(coverTemplateId, "coverTemplateId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = baseSharePackage.extras.getString("aid");
        String str = "";
        if (string == null) {
            string = "";
        }
        linkedHashMap.put("group_id", string);
        String string2 = baseSharePackage.extras.getString("author_id");
        if (string2 == null) {
            string2 = "";
        }
        linkedHashMap.put("author_id", string2);
        String string3 = baseSharePackage.extras.getString("enter_from");
        if (string3 == null) {
            string3 = "";
        }
        linkedHashMap.put("enter_from", string3);
        String string4 = baseSharePackage.extras.getString("panel_source");
        if (string4 != null) {
            str = string4;
        }
        linkedHashMap.put("panel_source", str);
        linkedHashMap.put("cover_template_id", coverTemplateId);
        linkedHashMap.put("loc", Integer.valueOf(i));
        InterfaceC114054dl interfaceC114054dl = C62494Ofq.LIZIZ;
        if (interfaceC114054dl != null) {
            interfaceC114054dl.LIZIZ("share_cover_preview_show", linkedHashMap);
        }
    }
}
