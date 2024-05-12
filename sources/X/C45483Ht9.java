package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ht9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45483Ht9 implements InterfaceC74506TLy {
    public final /* synthetic */ MvChoosePhotoScene LIZ;

    @Override // X.InterfaceC74506TLy
    public final boolean LIZIZ() {
        ArrayList<MyMediaModel> LJIIIZ;
        InterfaceC45480Ht6 interfaceC45480Ht6 = this.LIZ.LLLLIILLL;
        if (interfaceC45480Ht6 == null || (LJIIIZ = interfaceC45480Ht6.LJIIIZ()) == null || LJIIIZ.size() < this.LIZ.LLILZIL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC74506TLy
    public final void LIZJ() {
        Activity requireActivity = this.LIZ.requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(R.string.fnn);
        C78915Uy7.LJJIIZI(requireActivity, 3029, creativeToastBuilder);
    }

    public C45483Ht9(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LIZ = mvChoosePhotoScene;
    }

    @Override // X.InterfaceC74506TLy
    public final Integer LIZ(MyMediaModel mediaModel, boolean z) {
        o.LJIIIZ(mediaModel, "mediaModel");
        ChooseMediaViewModel chooseMediaViewModel = this.LIZ.LLLLLIL;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.setState(C45568HuW.LJLIL);
        }
        InterfaceC45480Ht6 interfaceC45480Ht6 = this.LIZ.LLLLIILLL;
        if (interfaceC45480Ht6 != null) {
            return Integer.valueOf(interfaceC45480Ht6.LJIJ(mediaModel, z, true));
        }
        return null;
    }
}
