package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;
import kotlin.jvm.internal.o;

/* renamed from: X.HCb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43673HCb extends AbstractC38911fr {
    public final /* synthetic */ ProgressDialogC43241Gy5 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ CreativeInfo LJLJL;
    public final /* synthetic */ Context LJLJLJ;

    @Override // X.AbstractC38911fr
    public final void LJJIIZI() {
        this.LJLILLLLZI.dismiss();
        ShareFromWebHelper.LIZ(this.LJLJLJ);
    }

    @Override // X.AbstractC38911fr
    public final void LJJIJL(int i) {
        ProgressDialogC43241Gy5 progressDialogC43241Gy5 = this.LJLILLLLZI;
        if (i >= 100) {
            i = 100;
        }
        progressDialogC43241Gy5.setProgress(i);
    }

    @Override // X.AbstractC38911fr
    public final void LJJIJLIJ(String str, String fullFilePath) {
        o.LJIIIZ(fullFilePath, "fullFilePath");
        this.LJLILLLLZI.dismiss();
        EditConfig.Builder builder = new EditConfig.Builder();
        builder.mediaInfo(new VideoMedia(fullFilePath));
        builder.shootWay(this.LJLJI);
        builder.shareID(this.LJLJJI);
        builder.channel(this.LJLJJL);
        builder.hashtag(this.LJLJJLL);
        builder.creationId(this.LJLJL.getCreationId());
        IExternalService LIZ = AVExternalServiceImpl.LIZ();
        Context context = this.LJLJLJ;
        LIZ.asyncService(context, "upload", new IDLCallbackS16S0200000_7(context, builder, 14));
    }

    public C43673HCb(ProgressDialogC43241Gy5 progressDialogC43241Gy5, String str, String str2, String str3, String str4, CreativeInfo creativeInfo, Context context) {
        this.LJLILLLLZI = progressDialogC43241Gy5;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = creativeInfo;
        this.LJLJLJ = context;
    }
}
