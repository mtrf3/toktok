package com.ss.android.ugc.aweme.editpost;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EditPostPushBody extends F9E implements Serializable {

    @InterfaceC65349Pkn("aweme_id")
    public final String awemeId;

    @InterfaceC65349Pkn("edit_id")
    public final String editId;

    @InterfaceC65349Pkn("edit_post_permission")
    public final EditPostPermission editPostPermission;

    @InterfaceC65349Pkn("push_scene")
    public final int pushScene;

    public static /* synthetic */ EditPostPushBody copy$default(EditPostPushBody editPostPushBody, String str, String str2, int i, EditPostPermission editPostPermission, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = editPostPushBody.awemeId;
        }
        if ((i2 & 2) != 0) {
            str2 = editPostPushBody.editId;
        }
        if ((i2 & 4) != 0) {
            i = editPostPushBody.pushScene;
        }
        if ((i2 & 8) != 0) {
            editPostPermission = editPostPushBody.editPostPermission;
        }
        return editPostPushBody.copy(str, str2, i, editPostPermission);
    }

    public final EditPostPushBody copy(String awemeId, String editId, int i, EditPostPermission editPostPermission) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(editId, "editId");
        o.LJIIIZ(editPostPermission, "editPostPermission");
        return new EditPostPushBody(awemeId, editId, i, editPostPermission);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.awemeId, this.editId, Integer.valueOf(this.pushScene), this.editPostPermission};
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getEditId() {
        return this.editId;
    }

    public final EditPostPermission getEditPostPermission() {
        return this.editPostPermission;
    }

    public final int getPushScene() {
        return this.pushScene;
    }

    public EditPostPushBody(String awemeId, String editId, int i, EditPostPermission editPostPermission) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(editId, "editId");
        o.LJIIIZ(editPostPermission, "editPostPermission");
        this.awemeId = awemeId;
        this.editId = editId;
        this.pushScene = i;
        this.editPostPermission = editPostPermission;
    }

    public /* synthetic */ EditPostPushBody(String str, String str2, int i, EditPostPermission editPostPermission, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 1 : i, editPostPermission);
    }
}
