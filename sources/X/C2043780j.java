package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.80j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2043780j {
    public static final /* synthetic */ int LJII = 0;
    public final Context LIZ;
    public final PhotoViewModelV2 LIZIZ;
    public final String LIZJ;
    public final VideoItemParams LIZLLL;
    public final IFeedPanelPlatformAbility LJ;
    public final C2044180n LJFF;
    public final InterfaceC2043980l LJI;

    public final C201437vP LIZ() {
        C201437vP c201437vP = new C201437vP();
        Aweme aweme = this.LIZLLL.getAweme();
        o.LJIIIIZZ(aweme, "videoItemParams.aweme");
        c201437vP.LIZIZ = aweme;
        c201437vP.LJIIZILJ = Boolean.valueOf(this.LIZIZ.LJZ);
        VideoItemParams videoItemParams = this.LIZLLL;
        if (videoItemParams != null) {
            c201437vP.LJIIL = videoItemParams;
        }
        String str = videoItemParams.mEventType;
        if (str != null) {
            c201437vP.LJII = str;
        }
        c201437vP.LJIIIIZZ = this.LIZLLL.mPageType;
        String str2 = this.LIZLLL.mEventType;
        if (str2 != null) {
            c201437vP.LJIIIZ = str2;
        }
        String fromGroupId = this.LIZLLL.getAweme().getFromGroupId();
        if (fromGroupId != null) {
            c201437vP.LJIIJ = fromGroupId;
        }
        String str3 = this.LIZLLL.mEnterMethodValue;
        if (str3 != null) {
            c201437vP.LJIIJJI = str3;
        }
        return c201437vP;
    }

    public final void LIZIZ(C201437vP c201437vP) {
        InterfaceC46330IGg interfaceC46330IGg;
        IPlayerComponentAbility playerComponentAbility;
        if (this.LIZIZ.LJLLLLLL) {
            return;
        }
        C8SG c8sg = C8SG.LIZIZ;
        Aweme aweme = this.LIZLLL.getAweme();
        o.LJIIIIZZ(aweme, "videoItemParams.aweme");
        if (!c8sg.LJIILLIIL(aweme)) {
            return;
        }
        Context context = this.LIZ;
        if (C2043880k.LIZ) {
            C2043880k.LIZ(context);
            C2043880k.LIZ = false;
        }
        C2044180n c2044180n = this.LJFF;
        if (c2044180n != null) {
            c2044180n.LJLJLLL = true;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = this.LJ;
        if (iFeedPanelPlatformAbility != null && (playerComponentAbility = iFeedPanelPlatformAbility.getPlayerComponentAbility()) != null) {
            interfaceC46330IGg = playerComponentAbility.getPlayerManager();
        } else {
            interfaceC46330IGg = null;
        }
        JHI.LIZ().LIZ = interfaceC46330IGg;
        PhotoViewModelV2 photoViewModelV2 = this.LIZIZ;
        photoViewModelV2.LJLLLLLL = true;
        photoViewModelV2.rv0();
        c8sg.LJIJJ(this.LIZJ, c201437vP.LIZ());
    }

    public C2043780j(Context context, PhotoViewModelV2 photoVM, PhotoSharedViewModel photoSharedVM, String str, VideoItemParams videoItemParams, IFeedPanelPlatformAbility iFeedPanelPlatformAbility, C2044180n c2044180n, InterfaceC2043980l callback) {
        o.LJIIIZ(photoVM, "photoVM");
        o.LJIIIZ(photoSharedVM, "photoSharedVM");
        o.LJIIIZ(videoItemParams, "videoItemParams");
        o.LJIIIZ(callback, "callback");
        this.LIZ = context;
        this.LIZIZ = photoVM;
        this.LIZJ = str;
        this.LIZLLL = videoItemParams;
        this.LJ = iFeedPanelPlatformAbility;
        this.LJFF = c2044180n;
        this.LJI = callback;
        photoSharedVM.LJLLJ = new AqS150S0200000_3(photoSharedVM, this, 95);
        photoSharedVM.LJLLILLLL = new AqS150S0200000_3(photoSharedVM, this, 96);
    }
}
