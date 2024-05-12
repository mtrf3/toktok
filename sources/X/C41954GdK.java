package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.VideoChosenResultFromAddSceneImpl$checkAddValid$1$1", f = "VideoChosenResultFromAddSceneImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GdK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41954GdK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C41988Gds LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ List<MediaModel> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C41954GdK(C41988Gds c41988Gds, boolean z, List<? extends MediaModel> list, InterfaceC67352kd<? super C41954GdK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c41988Gds;
        this.LJLJI = z;
        this.LJLJJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41954GdK c41954GdK = new C41954GdK(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c41954GdK.LJLIL = obj;
        return c41954GdK;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Resources resources;
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        this.LJLILLLLZI.dismissDialog();
        if (C48841JEv.LJIILLIIL(interfaceC70422pa) && this.LJLJI) {
            C41988Gds c41988Gds = this.LJLILLLLZI;
            List<MediaModel> list = this.LJLJJI;
            c41988Gds.getClass();
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("key_choose_media_data", new ArrayList<>(list));
            c41988Gds.LIZ.setResult(-1, intent);
            Activity activity = c41988Gds.LIZ;
            if (activity instanceof MvChoosePhotoActivity) {
                ActivityC86117Xqz activityC86117Xqz = (ActivityC86117Xqz) activity;
                activityC86117Xqz.finish();
                activityC86117Xqz.overridePendingTransition(0, R.anim.y);
            } else {
                activity.finish();
            }
        } else {
            Activity activity2 = this.LJLILLLLZI.LIZ;
            if (activity2 != null && (resources = activity2.getResources()) != null) {
                str = resources.getString(R.string.pmn);
            } else {
                str = null;
            }
            Activity activity3 = this.LJLILLLLZI.LIZ;
            if (activity3 != null && str != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(str);
                C78915Uy7.LJJIIZI(activity3, 4004, creativeToastBuilder);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
