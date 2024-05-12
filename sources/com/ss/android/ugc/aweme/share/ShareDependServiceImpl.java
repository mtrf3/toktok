package com.ss.android.ugc.aweme.share;

import X.AnonymousClass025;
import X.C008901t;
import X.C03880Dg;
import X.C05040Hs;
import X.C188727au;
import X.C198517qh;
import X.C58096Mr6;
import X.C62011OVj;
import X.C62066OXm;
import X.C65300Pk0;
import X.C78609UtB;
import X.C78966Uyw;
import X.C8HX;
import X.DialogInterfaceC39771hF;
import X.FMX;
import X.InterfaceC62225ObV;
import X.OVQ;
import X.OW1;
import X.X1D;
import Y.IDCListenerS162S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.gif.GifShareService;
import com.ss.android.ugc.aweme.share.gif.IGifShareService;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import defpackage.m0;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public final class ShareDependServiceImpl extends OVQ {
    public static ShareDependService LJJIZ() {
        Object LIZ = C58096Mr6.LIZ(ShareDependService.class, false);
        if (LIZ != null) {
            return (ShareDependService) LIZ;
        }
        if (C58096Mr6.J6 == null) {
            synchronized (ShareDependService.class) {
                if (C58096Mr6.J6 == null) {
                    C58096Mr6.J6 = new ShareDependServiceImpl();
                }
            }
        }
        return C58096Mr6.J6;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final OW1 LJJ() {
        IGifShareService iGifShareService;
        Object LIZ = C58096Mr6.LIZ(IGifShareService.class, false);
        if (LIZ != null) {
            iGifShareService = (IGifShareService) LIZ;
        } else {
            if (C58096Mr6.P6 == null) {
                synchronized (IGifShareService.class) {
                    if (C58096Mr6.P6 == null) {
                        C58096Mr6.P6 = new GifShareService();
                    }
                }
            }
            iGifShareService = C58096Mr6.P6;
        }
        if (iGifShareService != null) {
            return iGifShareService.LIZ();
        }
        return null;
    }

    @Override // X.OVQ, com.ss.android.ugc.aweme.share.ShareDependService
    public final boolean LJII() {
        return C78966Uyw.LJJIJ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJFF(Activity contenxt) {
        o.LJIIIZ(contenxt, "contenxt");
        AnonymousClass025 anonymousClass025 = new AnonymousClass025(contenxt, R.style.po);
        C008901t c008901t = anonymousClass025.LIZ;
        c008901t.LIZLLL = c008901t.LIZ.getText(R.string.it1);
        anonymousClass025.LIZIZ(R.string.it0);
        anonymousClass025.LIZJ(R.string.cg_, new IDCListenerS162S0100000_10(contenxt, 7));
        anonymousClass025.LIZLLL(R.string.dsg, new IDCListenerS162S0100000_10(contenxt, 6));
        DialogInterfaceC39771hF LIZ = anonymousClass025.LIZ();
        try {
            LIZ.setCancelable(false);
            LIZ.setCanceledOnTouchOutside(false);
            if (!new C03880Dg(2).LIZJ(300000, "androidx/appcompat/app/AlertDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "1018916551238698143")).LIZ) {
                LIZ.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIJJ(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        ((Keva) C62066OXm.LIZ.getValue()).storeLong(channel.key(), System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final boolean LJJI(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return !C62011OVj.LIZJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIJ(Aweme aweme, String eventType) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(eventType, "eventType");
        if (C62011OVj.LIZJ(aweme)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("type ");
            LIZ.append(aweme.getAwemeType());
            String LIZIZ = X1D.LIZIZ(LIZ);
            Video video = aweme.getVideo();
            if (video != null) {
                StringBuilder LIZJ = b1.LIZJ(LIZIZ, " width ");
                LIZJ.append(video.getWidth());
                LIZJ.append(" height ");
                LIZJ.append(video.getHeight());
                LIZIZ = X1D.LIZIZ(LIZJ);
            }
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("setting", Boolean.valueOf(!C62011OVj.LJ()));
            c198517qh.LIZ.put("isInValidValueAweme", Boolean.valueOf(C62011OVj.LIZLLL(aweme)));
            c198517qh.LIZ.put("message", LIZIZ);
            C8HX.LIZIZ("livewall_not_show", "", c198517qh.LJ());
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("request_id", aweme.getRequestId());
        c188727au.LJIIIZ("enter_from", eventType);
        FMX.LJIIL("wall_paper_show", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIIIIZZ(Music music, Context context, String str) {
        String ownerId;
        o.LJIIIZ(music, "music");
        if (TextUtils.isEmpty(music.getOwnerId())) {
            ownerId = CardStruct.IStatusCode.DEFAULT;
        } else {
            ownerId = music.getOwnerId();
        }
        a.LJIILLIIL().LIZIZ(C78609UtB.LJJLIIIJ(context), new Uri.Builder().appendQueryParameter("report_type", "music").appendQueryParameter("object_id", music.getMid()).appendQueryParameter("owner_id", ownerId));
        a.LJIILLIIL().LIZ(str, "music", "", music.getMid(), music.getOwnerId(), "click_resso_song_player");
    }

    @Override // X.OVQ, com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIL(Context context, Aweme aweme, String str, String enterFrom, String str2, String str3) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        C78966Uyw.LJLJJI = aweme;
        C05040Hs.LJ(m0.LIZ(context, "//setting//privacy", "tab_name", str, "enter_from", enterFrom), "enter_method", str2, "impr_id", str3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0200, code lost:
    
        if (r32.equals("search_result") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x020d, code lost:
    
        r14 = X.C2S6.LIZ(r30);
        r15 = X.Z9N.LIZIZ;
        r15.LLIILZL(r28);
        r10 = r15.LLJLLIL(r32, r14.getPreviousPageWithPlaylistScene());
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0224, code lost:
    
        if ((!r10.isEmpty()) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0226, code lost:
    
        r14 = r15.LLJJJJ(r32, "", "", java.lang.String.valueOf(r28.getRank()), r10).entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0246, code lost:
    
        if (r14.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0248, code lost:
    
        r13 = (java.util.Map.Entry) r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0258, code lost:
    
        if (X.C78685UuP.LJJJZ((java.lang.String) r13.getValue()) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x025a, code lost:
    
        r4.put((java.lang.String) r13.getKey(), r13.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0268, code lost:
    
        r6 = r10.get("last_from_group_id");
        r0 = r10.get("search_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0272, code lost:
    
        r6 = r14.getFromGroupId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0209, code lost:
    
        if (r32.equals("general_search") == false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02da  */
    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.feed.model.Aweme r28, java.lang.String r29, android.content.Context r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ShareDependServiceImpl.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
