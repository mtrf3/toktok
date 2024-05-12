package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class H68 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(List list) {
        boolean z;
        Object obj;
        boolean z2;
        boolean z3;
        Integer num = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                z = false;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((AnchorCommonStruct) obj).getType() == EnumC42934Gt8.ANCHOR_EDITOR_PRO.getTYPE()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) obj;
            if (anchorCommonStruct != null) {
                try {
                    num = Integer.valueOf(JSONObjectProtectorUtils.getInt(new JSONObject(anchorCommonStruct.getExtra()), "editor_pro_subtype"));
                    boolean isFunctionEnabled = AVExternalServiceImpl.LIZ().anchorService().isFunctionEnabled(num);
                    EnumC1289754j enumC1289754j = EnumC1289754j.GENERAL;
                    if (num.intValue() != enumC1289754j.getValue()) {
                        FFL.LJIIIZ().getClass();
                        if (FFL.LJIIJ(31744, 0, "studio_editor_pro_anchor_type", true) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2 || !isFunctionEnabled) {
                            z = true;
                        }
                    }
                    if (z) {
                        num = Integer.valueOf(enumC1289754j.getValue());
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return String.valueOf(num);
    }
}
