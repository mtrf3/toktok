package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.ProfileParametersModel;
import com.ss.android.ugc.aweme.creative.model.SocialParametersModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import kotlin.jvm.internal.o;

/* renamed from: X.HOc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43986HOc extends SimpleServiceLoadCallback {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ Aweme LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        String str;
        o.LJIIIZ(service, "service");
        FaceStickerBean.sCurPropSource = "prop_page";
        IRecordService recordService = service.uiService().recordService();
        Context context = this.LIZ;
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.sticker(this.LIZIZ);
        builder.musicId(this.LIZJ);
        builder.enterFrom(this.LIZLLL);
        builder.shootWay("prop_page");
        builder.enterMethod("click_prop_publish");
        builder.creationId(this.LJ);
        Aweme aweme = this.LJFF;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        builder.groupId(str);
        ProfileParametersModel profileParametersModel = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Aweme aweme2 = this.LJFF;
        if (aweme2 != null) {
            str2 = aweme2.getAuthorUid();
        }
        builder.initialInputModel(new CreativeInitialModel(profileParametersModel, objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, new SocialParametersModel("1", str2), objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 16127, objArr == true ? 1 : 0));
        recordService.startRecord(context, builder.build());
    }

    public C43986HOc(Context context, Aweme aweme, String str, String str2, String str3, String str4) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = aweme;
    }
}
