package X;

import com.ss.android.ugc.aweme.editpost.EditPostBizPermissionStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.G9u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41066G9u {
    public static final int LIZ(EditPostPermission editPostPermission) {
        List<EditPostBizPermissionStruct> bizPermission;
        EditPostBizPermissionStruct editPostBizPermissionStruct;
        if (editPostPermission != null && (bizPermission = editPostPermission.getBizPermission()) != null) {
            Iterator<EditPostBizPermissionStruct> it = bizPermission.iterator();
            while (true) {
                if (it.hasNext()) {
                    editPostBizPermissionStruct = it.next();
                    if (editPostBizPermissionStruct.getBizType() == 3) {
                        break;
                    }
                } else {
                    editPostBizPermissionStruct = null;
                    break;
                }
            }
            EditPostBizPermissionStruct editPostBizPermissionStruct2 = editPostBizPermissionStruct;
            if (editPostBizPermissionStruct2 != null) {
                return editPostBizPermissionStruct2.getBizStatus();
            }
        }
        return EnumC41101GBd.NO_SHOW.getValue();
    }
}
