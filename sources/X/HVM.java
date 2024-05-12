package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;

/* loaded from: classes8.dex */
public final class HVM extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ EnumC244439iZ LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HVM(ActivityC45651qj activityC45651qj, EnumC244439iZ enumC244439iZ, String str, String str2, boolean z) {
        super(1);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = enumC244439iZ;
        this.LJLJJL = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue()) {
            Bundle bundle = new Bundle();
            EnumC244439iZ enumC244439iZ = this.LJLJJI;
            boolean z = this.LJLJJL;
            String str = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            bundle.putSerializable("key_function_on_render_done", new C45626HvS());
            AIGCPictureHandler aIGCPictureHandler = new AIGCPictureHandler(true, enumC244439iZ, 1, "ai_avatar", z, str);
            bundle.putSerializable("key_function_on_click_next", aIGCPictureHandler);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 1);
            bundle.putString("shoot_way", "ai_avatar");
            bundle.putString("enter_from", str2);
            bundle.putString("enter_method", str);
            bundle.putInt("key_choose_scene", 25);
            bundle.putInt("key_support_flag", 2);
            bundle.putSerializable("key_album_interact_view_holder_list", C47261Igj.LJII(new HUM(aIGCPictureHandler, "ai_avatar")));
            HJ9.LIZLLL(this.LJLIL, bundle, 0);
            C72413SbR.LIZIZ(this.LJLILLLLZI, this.LJLJI);
        }
        return C76800UCe.LIZ;
    }
}
