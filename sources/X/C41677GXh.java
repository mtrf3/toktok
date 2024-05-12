package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GXh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41677GXh extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL = R.string.tvt;

    public C41677GXh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(this.LJLIL);
            C78915Uy7.LJJIIZI(validTopActivity, 2028, creativeToastBuilder);
        }
        return C76800UCe.LIZ;
    }
}
