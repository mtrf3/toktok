package X;

import android.app.Activity;
import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Oeg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62422Oeg implements PopupWindow.OnDismissListener {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ EnumC62419Oed LJLILLLLZI;
    public final /* synthetic */ C43694HCw LJLJI;
    public final /* synthetic */ Activity LJLJJI;

    public C62422Oeg(Aweme aweme, EnumC62419Oed enumC62419Oed, C43694HCw c43694HCw, ActivityC45651qj activityC45651qj) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = enumC62419Oed;
        this.LJLJI = c43694HCw;
        this.LJLJJI = activityC45651qj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        AVUploadSaveModel aVUploadSaveModel;
        String localSilentSharePath;
        AVUploadSaveModel aVUploadSaveModel2;
        Aweme aweme = this.LJLIL;
        o.LJIIIIZZ(aweme, "aweme");
        EnumC62419Oed enumC62419Oed = this.LJLILLLLZI;
        Aweme aweme2 = this.LJLIL;
        o.LJIIIIZZ(aweme2, "aweme");
        CreateBaseAwemeResponse createBaseAwemeResponse = this.LJLJI.LJLJLJ;
        o.LJIIIIZZ(createBaseAwemeResponse, "status.response");
        if (!C62417Oeb.LJ(aweme2) ? (aVUploadSaveModel = createBaseAwemeResponse.mSaveModel) == null || (localSilentSharePath = aVUploadSaveModel.getLocalSilentSharePath()) == null : (aVUploadSaveModel2 = createBaseAwemeResponse.mSaveModel) == null || (localSilentSharePath = aVUploadSaveModel2.getImageModeCoverPath()) == null) {
            localSilentSharePath = "";
        }
        C62417Oeb.LIZLLL(aweme, enumC62419Oed, localSilentSharePath, this.LJLJJI);
    }
}
