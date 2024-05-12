package com.ss.android.ugc.aweme.property;

import X.C00F;
import X.C47959Irz;
import com.ss.android.ugc.aweme.services.IEditorProIconService;

/* loaded from: classes8.dex */
public final class EditorProIconServiceImpl implements IEditorProIconService {
    @Override // com.ss.android.ugc.aweme.services.IEditorProIconService
    public final boolean enableNewEditorProIcon() {
        if (C00F.LIZ(31744, 0, "studio_change_editor_pro_icon", true) == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.IEditorProIconService
    public final String getTransparentEditorProIconUrl() {
        return C47959Irz.LIZLLL(31744, "studio_transparent_editor_pro_icon_url", "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/Video_Play_Split_Fill.png", true);
    }
}
