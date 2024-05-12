package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wma, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83296Wma extends AbstractC83312Wmq<Effect, C76800UCe> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC83312Wmq
    public final void LIZIZ(C83310Wmo c83310Wmo) {
        List<String> urlList;
        File file = new File(((com.ss.ugc.effectplatform.model.Effect) this.LJ).getZipPath());
        UrlModel fileUrl = ((EffectTemplate) this.LJ).getFileUrl();
        Exception exc = null;
        if (fileUrl == null || (urlList = fileUrl.getUrlList()) == null || urlList.isEmpty()) {
            new IZ3(exc, -1, "");
            c83310Wmo.LIZ(this);
            return;
        }
        DownloadTask with = C84261X5d.with(C60903NvH.LJ);
        with.url((String) ListProtector.get(fileUrl.getUrlList(), 0));
        with.savePath(file.getParent());
        with.name(file.getName());
        with.subThreadListener(new C83304Wmi(this, c83310Wmo));
        with.download();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83296Wma(Effect mParam, String mTaskId) {
        super(mTaskId, mParam);
        o.LJIIIZ(mTaskId, "mTaskId");
        o.LJIIIZ(mParam, "mParam");
    }
}
