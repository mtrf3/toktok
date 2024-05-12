package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;

/* loaded from: classes8.dex */
public final class HVN extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ EnumC244439iZ LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HVN(int i, int i2, ActivityC45651qj activityC45651qj, EnumC244439iZ enumC244439iZ, String str, String str2, boolean z) {
        super(1);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = enumC244439iZ;
        this.LJLJJL = i;
        this.LJLJJLL = z;
        this.LJLJL = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue()) {
            Bundle bundle = new Bundle();
            EnumC244439iZ enumC244439iZ = this.LJLJJI;
            int i = this.LJLJJL;
            boolean z = this.LJLJJLL;
            String str = this.LJLILLLLZI;
            int i2 = this.LJLJL;
            String str2 = this.LJLJI;
            bundle.putSerializable("key_function_on_render_done", new C45625HvR());
            bundle.putSerializable("key_function_on_click_next", new AIGCPictureHandler(false, enumC244439iZ, i, "ai_avatar", z, str));
            bundle.putInt("key_photo_select_min_count", i);
            bundle.putInt("key_photo_select_max_count", i2);
            bundle.putString("shoot_way", "ai_avatar");
            bundle.putString("enter_from", str2);
            bundle.putString("enter_method", str);
            bundle.putInt("key_choose_scene", 25);
            bundle.putInt("key_support_flag", 2);
            HJ9.LIZLLL(this.LJLIL, bundle, 0);
            C72413SbR.LIZIZ(this.LJLILLLLZI, this.LJLJI);
        }
        return C76800UCe.LIZ;
    }
}
