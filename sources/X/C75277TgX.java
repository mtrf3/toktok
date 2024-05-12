package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.TgX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75277TgX extends AbstractC65781Prl implements InterfaceC88472Yns<C75235Tfr, C75235Tfr> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ MultiGuestSharedBgGuestViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ LiveEffect LJLJJI;
    public final /* synthetic */ DownloadInfo LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75277TgX(boolean z, MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel, String str, LiveEffect liveEffect, DownloadInfo downloadInfo) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = multiGuestSharedBgGuestViewModel;
        this.LJLJI = str;
        this.LJLJJI = liveEffect;
        this.LJLJJL = downloadInfo;
    }

    @Override // X.InterfaceC88472Yns
    public final C75235Tfr invoke(C75235Tfr setState) {
        String str;
        o.LJIIIZ(setState, "$this$setState");
        boolean z = true;
        if (this.LJLIL) {
            this.LJLILLLLZI.getClass();
            if (!C75283Tgd.LJ()) {
                z = false;
            }
        }
        String str2 = this.LJLJI;
        String str3 = this.LJLJJI.shareImageUrl;
        DownloadInfo downloadInfo = this.LJLJJL;
        if (downloadInfo != null) {
            str = downloadInfo.getTargetFilePath();
        } else {
            str = null;
        }
        return new C75235Tfr(z, str2, str3, str);
    }
}
