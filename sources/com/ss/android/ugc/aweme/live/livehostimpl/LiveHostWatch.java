package com.ss.android.ugc.aweme.live.livehostimpl;

import X.B57;
import X.B7F;
import X.B7N;
import X.B83;
import X.C03880Dg;
import X.C09710Zr;
import X.C0JT;
import X.C26227ARb;
import X.C29374Bfu;
import X.C2U8;
import X.C30Q;
import X.C46581IPx;
import X.C48189Ivh;
import X.C55661Lsv;
import X.C55902Lwo;
import X.C62706OjG;
import X.C65300Pk0;
import X.C73969T1h;
import X.C78056UkG;
import X.C78058UkI;
import X.C78450Uqc;
import X.C78451Uqd;
import X.C78457Uqj;
import X.C78461Uqn;
import X.DialogC77438UaI;
import X.HG3;
import X.IPR;
import X.InterfaceC28610BKs;
import X.InterfaceC64592gB;
import X.InterfaceC75370Ti2;
import X.JIT;
import X.MYW;
import X.Q7L;
import X.RBX;
import X.T16;
import X.UC0;
import X.X1D;
import Y.AfS44S0300000_5;
import Y.AfS57S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.LivePlayActivity;
import com.ss.android.ugc.aweme.live.SearchCardLiveService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveHostWatch implements IHostWatch {
    public C62706OjG LJLIL;
    public C78056UkG LJLILLLLZI;

    public static void LIZ(DialogC77438UaI dialogC77438UaI) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", dialogC77438UaI, new Object[0], "void", new C65300Pk0(false, "()V", "-8168893432364020036")).LIZ) {
            return;
        }
        dialogC77438UaI.show();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C78058UkI.LIZ(this);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void addScreenShotListener() {
        C62706OjG c62706OjG = new C62706OjG();
        this.LJLIL = c62706OjG;
        ScreenShotService.LJIIIZ().LJ(c62706OjG);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void removeScreenShotListener() {
        C62706OjG c62706OjG = this.LJLIL;
        if (c62706OjG != null) {
            ScreenShotService.LJIIIZ().LJIIIIZZ(c62706OjG);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final int getAnchorPosition() {
        LiveOuterService.LJJJLL().LJIIJJI();
        return C55902Lwo.LJ;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final String getFollowWidgetType() {
        LiveOuterService.LJJJLL().LJIIJJI();
        return C55902Lwo.LIZLLL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean getIsFollowJumpToLive() {
        LiveOuterService.LJJJLL().LJIIJJI();
        return C55902Lwo.LJI;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean getIsFollowWidgetExp() {
        LiveOuterService.LJJJLL().LJIIJJI();
        return C55661Lsv.LJIIIIZZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final int getWidgetAnchorNum() {
        LiveOuterService.LJJJLL().LJIIJJI();
        return C55902Lwo.LIZLLL();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void searchScrollToNextItem() {
        SearchCardLiveService.LIZJ().searchScrollToNextItem();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void updateSearchScrollStatus() {
        SearchCardLiveService.LIZJ().LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final InterfaceC28610BKs getSearchComponent(String listProviderTag) {
        o.LJIIIZ(listProviderTag, "listProviderTag");
        return new C78457Uqj(listProviderTag);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void recordExitRoomId(long j) {
        C2U8.LIZ(new MYW(j));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void setIsFollowJumpToLive(boolean z) {
        LiveOuterService.LJJJLL().LJIIJJI();
        C55902Lwo.LJI = z;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void watchLive(Context context, EnterRoomConfig config) {
        Integer num;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(config, "config");
        B57.LIZ.LIZJ(new EnterRoomLinkSession(config));
        if (TextUtils.equals(config.mRoomsData.enterRoomScene, "inner_draw")) {
            config.mRoomsData.enterRoomScene = "inner_jump";
        }
        if (C48189Ivh.LJI(context) || C09710Zr.LIZ(context) || !(context instanceof Activity) || (Live.getService() != null && ((num = (Integer) Live.getService().LJIIIZ(0, "live_mt_remove_traffic_dialog")) == null || num.intValue() != 0))) {
            LivePlayActivity.LLIIIJ(context, config);
            return;
        }
        C26227ARb LIZ = Q7L.LIZ(context, R.string.tmz);
        UC0.LIZJ(LIZ, new AqS144S0200000_13(context, config, 11));
        LIZ.LJI().LIZLLL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0201, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, X.CXJ.LIZ) == false) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean watchLiveFromSchema(android.content.Context r13, com.bytedance.android.livesdkapi.session.EnterRoomConfig r14) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch.watchLiveFromSchema(android.content.Context, com.bytedance.android.livesdkapi.session.EnterRoomConfig):boolean");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void watchLive(Context context, EnterRoomConfig config, String uniqueId) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(uniqueId, "uniqueId");
        LiveOuterService.LJJJLL().LIZ().getClass();
        C30Q.LIZ.getRoomId(uniqueId).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(new B7N(context, config, this, uniqueId), 346), new InterfaceC64592gB() { // from class: X.9FD
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean watchLiveFromSchemaNoLogin(Context context, EnterRoomConfig config, String uniqueId) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(uniqueId, "uniqueId");
        if (((RBX) HG3.LJIILL()).isLogin()) {
            return watchLiveFromSchema(context, config);
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        Bundle LIZ = C0JT.LIZ("is_fullscreen_dialog", true, "is_skippable_dialog", false);
        C78450Uqc c78450Uqc = new C78450Uqc();
        EnterRoomConfig.RoomsData roomsData = config.mRoomsData;
        c78450Uqc.LIZIZ = roomsData.enterFromMerge;
        c78450Uqc.LIZJ = roomsData.enterMethod;
        c78450Uqc.LIZ = (Activity) context;
        c78450Uqc.LIZLLL = LIZ;
        C78056UkG c78056UkG = new C78056UkG(context, config, this, uniqueId);
        this.LJLILLLLZI = c78056UkG;
        AccountService.LJIJ().LJI().showLoginAndRegisterView(new C78451Uqd(c78450Uqc));
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(c78056UkG);
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void watchLive(Context context, EnterRoomConfig config, long j) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(config, "config");
        ((C29374Bfu) B83.LIZ().LIZIZ()).LJIILL(j, "LiveHostStartLiveManager_watchLive").LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS44S0300000_5(context, config, this, 3), B7F.LJLIL);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void updateRoomLists(String str, boolean z, int i, List<Long> list) {
        C78461Uqn LJIILL;
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJIILL = LJJJLL.LJIILL()) != null) {
            LJIILL.LJIIJ(Boolean.valueOf(z), Integer.valueOf(i), str, list);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final InterfaceC75370Ti2 getVideoCleanPlayerController(TextureView textureView, String str, int i, JIT jit, String tag, IPR ipr) {
        o.LJIIIZ(tag, "tag");
        C46581IPx c46581IPx = null;
        if (i != 0 && str != null && !ujb.o.LJJJJJL(str) && textureView != null) {
            c46581IPx = new C46581IPx(textureView);
            Video video = new Video();
            LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(tag);
            LIZ.append('_');
            LIZ.append(str);
            localVideoUrlModel.setSourceId(X1D.LIZIZ(LIZ));
            localVideoUrlModel.setUrlList(new ArrayList());
            localVideoUrlModel.getUrlList().add(str);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(tag);
            LIZ2.append('_');
            LIZ2.append(str);
            localVideoUrlModel.setUrlKey(X1D.LIZIZ(LIZ2));
            video.setPlayAddr(localVideoUrlModel);
            video.setVideoLength(i);
            video.setPlayAddrBytevc1(video.getPlayAddr());
            c46581IPx.LJFF = video;
            if (ipr != null) {
                c46581IPx.LIZ().add(ipr);
            }
        }
        return c46581IPx;
    }
}
