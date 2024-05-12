package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BUE extends AbstractC38127Exn<Object, JSONObject> {
    public static void LJJI(User user, JSONObject jSONObject) {
        jSONObject.put("user_id", String.valueOf(user.getId()));
        jSONObject.put("sec_user_id", user.getSecUid());
        if (user.getAvatarThumb() != null) {
            jSONObject.put("avatar", ListProtector.get(user.getAvatarThumb().getUrls(), 0));
        }
        jSONObject.put("nickname", C05170If.LIZLLL(user));
        if (user.getAnchorInfo() != null) {
            jSONObject.put("anchor_level", user.getAnchorInfo().level);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    @Override // X.AbstractC38127Exn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject invoke(java.lang.Object r12, X.C38131Exr r13) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUE.invoke(java.lang.Object, X.Exr):java.lang.Object");
    }
}
