package X;

import X.C157816Hh;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WmZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83295WmZ<T extends C157816Hh> extends AbstractC83312Wmq<T, Void> {
    public final InterfaceC88471Ynr<T, InterfaceC67352kd<? super C76800UCe>, Object> LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC83312Wmq
    public final boolean LIZLLL() {
        return C157986Hy.LIZ(((C157816Hh) this.LJ).effect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC83312Wmq
    public final void LIZIZ(C83310Wmo c83310Wmo) {
        List<String> urlList;
        File file = new File(((C157816Hh) this.LJ).effect.getZipPath());
        UrlModel fileUrl = ((C157816Hh) this.LJ).effect.getFileUrl();
        Exception exc = null;
        if (fileUrl == null || (urlList = fileUrl.getUrlList()) == null || urlList.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EffectTextDownloadTask , effectId : ");
            LIZ.append(((C157816Hh) this.LJ).effect.getEffectId());
            LIZ.append(" , urlList is null or empty");
            new IZ3(exc, -1, X1D.LIZIZ(LIZ));
            c83310Wmo.LIZ(this);
            return;
        }
        DownloadTask with = C84261X5d.with(C6PB.LIZ());
        with.url((String) ListProtector.get(fileUrl.getUrlList(), 0));
        with.savePath(file.getParent());
        with.name(file.getName());
        with.mainThreadListener(new C83303Wmh(this, this.LJFF, c83310Wmo));
        with.download();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C83295WmZ(String taskId, T bean, InterfaceC88471Ynr<? super T, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr) {
        super(taskId, bean);
        o.LJIIIZ(taskId, "taskId");
        o.LJIIIZ(bean, "bean");
        this.LJFF = interfaceC88471Ynr;
    }
}
