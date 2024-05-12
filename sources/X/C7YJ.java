package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import java.util.List;

/* renamed from: X.7YJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YJ extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ List<MusicOwnerInfo> LJLIL;
    public final /* synthetic */ FragmentManager LJLILLLLZI;
    public final /* synthetic */ Music LJLJI;
    public final /* synthetic */ C7YK LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7YJ(List<MusicOwnerInfo> list, FragmentManager fragmentManager, Music music, C7YK c7yk) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = fragmentManager;
        this.LJLJI = music;
        this.LJLJJI = c7yk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        r8.LJIIIZ(r1, r0);
        X.FMX.LJIIL("enter_personal_detail", r8.LIZ);
        r2 = com.bytedance.router.SmartRouter.buildRoute(r6.getContext(), "aweme://user/profile/");
        r0 = (com.ss.android.ugc.aweme.music.model.MusicOwnerInfo) X.ORZ.LJLLLLLL(0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        r1 = r0.getUid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        r2.withParam("uid", r1);
        r0 = (com.ss.android.ugc.aweme.music.model.MusicOwnerInfo) X.ORZ.LJLLLLLL(0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        r0 = r0.getSecUid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        if (r0 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        r2.withParam("sec_user_id", r3);
        r2.open();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        if (r2 == null) goto L31;
     */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(android.view.View r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7YJ.invoke(java.lang.Object):java.lang.Object");
    }
}
