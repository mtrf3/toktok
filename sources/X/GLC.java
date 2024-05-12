package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.profile.ui.CropActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GLC extends AbstractC65781Prl implements InterfaceC88472Yns<Bundle, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ CropActivity LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLC(String str, CropActivity cropActivity) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = cropActivity;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Bundle bundle) {
        String str;
        Bundle generateCreationBundle = bundle;
        o.LJIIIZ(generateCreationBundle, "$this$generateCreationBundle");
        generateCreationBundle.putBoolean("change_avatar", true);
        generateCreationBundle.putString("origin_avatar_url", this.LJLIL);
        if (!TextUtils.isEmpty((String) this.LJLILLLLZI.LLIIJI.getValue())) {
            str = (String) this.LJLILLLLZI.LLIIJI.getValue();
        } else {
            str = "click_save";
        }
        generateCreationBundle.putString("realEnterMethod", str);
        generateCreationBundle.putString("enter_method", "preview_post");
        return C76800UCe.LIZ;
    }
}
