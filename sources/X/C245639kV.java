package X;

import Y.AgS122S0100000_4;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.9kV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245639kV {
    public final C92U LIZ;
    public Aweme LIZIZ;
    public Y1Q LIZJ;
    public C223038p9 LIZLLL;
    public C223778qL LJ;
    public InterfaceC46330IGg LJFF;
    public InterfaceC86436Xw8 LJI;
    public final boolean LJII;
    public InteractStickerViewModel LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public String LJIIJJI;
    public InterfaceC223918qZ LJIIL;
    public AbsInteractStickerWidget LJIILIIL;

    public final void LIZIZ() {
        User author;
        String aid;
        String str;
        String str2;
        long j;
        VideoReplyStruct videoReplyStruct;
        InteractStickerViewModel interactStickerViewModel;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        C245649kW c245649kW = new C245649kW();
        c245649kW.LJIILJJIL = this.LIZJ;
        c245649kW.LJIILIIL = this.LIZLLL;
        c245649kW.LJIILL = this.LJI;
        c245649kW.LJIILLIIL = this.LJIIL;
        c245649kW.LJIIZILJ = this.LJ;
        Aweme aweme = this.LIZIZ;
        String str3 = null;
        if (aweme == null) {
            author = null;
        } else if (aweme.getAwemeType() == 13 && aweme.getForwardItem() != null) {
            author = aweme.getForwardItem().getAuthor();
        } else {
            author = aweme.getAuthor();
        }
        c245649kW.LIZJ = author;
        Aweme aweme2 = this.LIZIZ;
        if (aweme2 == null) {
            aid = "";
        } else if (aweme2.getAwemeType() == 13 && aweme2.getForwardItem() != null) {
            aid = aweme2.getForwardItem().getAid();
        } else {
            aid = aweme2.getAid();
        }
        c245649kW.LIZLLL = aid;
        c245649kW.LJIIL = this.LJII;
        c245649kW.LJ = this.LJIIIZ;
        Aweme aweme3 = this.LIZIZ;
        if (aweme3 != null && (awemeRawAd3 = aweme3.getAwemeRawAd()) != null) {
            str = awemeRawAd3.getLogExtra();
        } else {
            str = null;
        }
        c245649kW.LJII = str;
        Aweme aweme4 = this.LIZIZ;
        if (aweme4 != null && (awemeRawAd2 = aweme4.getAwemeRawAd()) != null) {
            str2 = awemeRawAd2.getPageFrom();
        } else {
            str2 = null;
        }
        c245649kW.LJIIIIZZ = str2;
        Aweme aweme5 = this.LIZIZ;
        if (aweme5 == null || (awemeRawAd = aweme5.getAwemeRawAd()) == null || (creativeId = awemeRawAd.getCreativeId()) == null) {
            j = 0;
        } else {
            j = creativeId.longValue();
        }
        c245649kW.LJIIIZ = j;
        Aweme aweme6 = this.LIZIZ;
        o.LJI(aweme6);
        c245649kW.LJIIJ = C247179mz.LIZ(aweme6);
        Aweme aweme7 = this.LIZIZ;
        if (aweme7 != null) {
            videoReplyStruct = aweme7.getVideoReplyStruct();
        } else {
            videoReplyStruct = null;
        }
        c245649kW.LJIJ = videoReplyStruct;
        c245649kW.LJIJI = LJ(this.LIZIZ);
        Aweme aweme8 = this.LIZIZ;
        if (aweme8 != null) {
            str3 = aweme8.getRequestId();
        }
        c245649kW.LJIIJJI = str3;
        c245649kW.LJI = this.LJIIJJI;
        c245649kW.LJFF = this.LJIIJ;
        if (this.LJIILIIL != null && (interactStickerViewModel = this.LJIIIIZZ) != null) {
            interactStickerViewModel.iv0(c245649kW, "interact_sticker_data");
        }
    }

    public final void LIZJ() {
        Aweme aweme = this.LIZIZ;
        if (aweme != null && aweme.isProhibited()) {
            InteractStickerViewModel interactStickerViewModel = this.LJIIIIZZ;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.iv0(new ArrayList(), "interact_sticker_video_data");
                return;
            }
            return;
        }
        C10K.LIZJ(new Callable() { // from class: X.9ka
            /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r11 = this;
                    X.9kV r3 = X.C245639kV.this
                    X.IGg r1 = r3.LJFF
                    r10 = 0
                    if (r1 == 0) goto Lec
                    java.lang.String r0 = "information"
                    java.lang.String r2 = r1.LJJIJIIJI(r0)
                    if (r2 != 0) goto L1a
                    X.IGg r1 = r3.LJFF
                    kotlin.jvm.internal.o.LJI(r1)
                    java.lang.String r0 = "com.android.information"
                    java.lang.String r2 = r1.LJJIJIIJI(r0)
                L1a:
                    if (r2 != 0) goto L27
                    X.IGg r1 = r3.LJFF
                    kotlin.jvm.internal.o.LJI(r1)
                    java.lang.String r0 = "com.apple.quicktime.information"
                    java.lang.String r2 = r1.LJJIJIIJI(r0)
                L27:
                    boolean r0 = android.text.TextUtils.isEmpty(r2)
                    if (r0 == 0) goto Lb1
                L2d:
                    r0 = r10
                L2e:
                    boolean r1 = X.C79004UzY.LJJIFFI(r0)
                    if (r1 == 0) goto L35
                L34:
                    return r0
                L35:
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    if (r0 == 0) goto Lab
                    java.util.Iterator r9 = r0.iterator()
                L40:
                    boolean r1 = r9.hasNext()
                    if (r1 == 0) goto Lab
                    java.lang.Object r7 = r9.next()
                    com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r7 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r7
                    if (r7 == 0) goto L40
                    java.lang.String r4 = r7.getAttr()
                    java.lang.String r1 = "this.attr"
                    kotlin.jvm.internal.o.LJIIIIZZ(r4, r1)
                    org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L73
                    r2.<init>(r4)     // Catch: java.lang.Exception -> L73
                    java.lang.String r1 = "interaction_extra"
                    java.lang.String r4 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r2, r1)     // Catch: java.lang.Exception -> L73
                    com.ss.android.ugc.aweme.utils.GsonProvider r1 = com.ss.android.ugc.aweme.utils.GsonHolder.LIZLLL()     // Catch: java.lang.Exception -> L73
                    com.google.gson.Gson r2 = r1.LIZ()     // Catch: java.lang.Exception -> L73
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData> r1 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData.class
                    java.lang.Object r6 = r2.LJI(r4, r1)     // Catch: java.lang.Exception -> L73
                    com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r6 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData) r6     // Catch: java.lang.Exception -> L73
                    goto L78
                L73:
                    r1 = move-exception
                    X.C16880lQ.LLLLIIL(r1)
                    r6 = r10
                L78:
                    r5 = 0
                    if (r6 != 0) goto L81
                L7b:
                    if (r5 != 0) goto L40
                    r8.add(r7)
                    goto L40
                L81:
                    com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.LIZIZ
                    if (r1 == 0) goto L9d
                    java.lang.String r4 = r1.getStickerIDs()
                    if (r4 == 0) goto L9d
                    java.lang.String r1 = ","
                    java.lang.String[] r2 = new java.lang.String[]{r1}
                    r1 = 6
                    java.util.List r2 = ujb.s.LJLJJL(r4, r2, r5, r1)
                L96:
                    boolean r1 = X.C79004UzY.LJJIFFI(r2)
                    if (r1 == 0) goto L9f
                    goto L7b
                L9d:
                    r2 = r10
                    goto L96
                L9f:
                    kotlin.jvm.internal.o.LJI(r2)
                    java.lang.String r1 = r6.getStickerId()
                    boolean r5 = r2.contains(r1)
                    goto L7b
                Lab:
                    if (r0 == 0) goto L34
                    r0.removeAll(r8)
                    goto L34
                Lb1:
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lc8
                    r1.<init>(r2)     // Catch: java.lang.Exception -> Lc8
                    java.lang.String r0 = "com.bytedance.info"
                    java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: java.lang.Exception -> Lc8
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lc8
                    r1.<init>(r0)     // Catch: java.lang.Exception -> Lc8
                    java.lang.String r0 = "interaction_stickers"
                    java.lang.String r2 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: java.lang.Exception -> Lc8
                    goto Lcd
                Lc8:
                    r0 = move-exception
                    X.C16880lQ.LLLLIIL(r0)
                    r2 = r10
                Lcd:
                    com.ss.android.ugc.aweme.utils.GsonProvider r0 = com.ss.android.ugc.aweme.utils.GsonHolder.LIZLLL()     // Catch: com.google.gson.s -> Le6
                    com.google.gson.Gson r1 = r0.LIZ()     // Catch: com.google.gson.s -> Le6
                    X.9kb r0 = new X.9kb     // Catch: com.google.gson.s -> Le6
                    r0.<init>()     // Catch: com.google.gson.s -> Le6
                    java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> Le6
                    java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)     // Catch: com.google.gson.s -> Le6
                    java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: com.google.gson.s -> Le6
                    goto L2e
                Le6:
                    r0 = move-exception
                    X.C16880lQ.LLLLIIL(r0)
                    goto L2d
                Lec:
                    r2 = r10
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC245689ka.call():java.lang.Object");
            }
        }).LJ(new AgS122S0100000_4(this, 4), C10K.LJIIIIZZ, null);
    }

    public final void LIZLLL() {
        if (this.LJIILIIL == null) {
            return;
        }
        InteractStickerViewModel interactStickerViewModel = this.LJIIIIZZ;
        if (interactStickerViewModel != null) {
            interactStickerViewModel.iv0(null, "interact_sticker_clear_data");
        }
        InteractStickerViewModel interactStickerViewModel2 = this.LJIIIIZZ;
        if (interactStickerViewModel2 != null) {
            interactStickerViewModel2.iv0(null, "interact_sticker_aweme_data");
        }
        InteractStickerViewModel interactStickerViewModel3 = this.LJIIIIZZ;
        if (interactStickerViewModel3 != null) {
            interactStickerViewModel3.iv0(null, "interact_sticker_video_data");
        }
    }

    public final void LJFF() {
        InteractStickerViewModel interactStickerViewModel;
        AbsInteractStickerWidget h0 = this.LIZ.h0();
        this.LJIILIIL = h0;
        if (h0 != null) {
            h0.LLIFFJFJJ(this.LIZIZ);
        }
        AbsInteractStickerWidget absInteractStickerWidget = this.LJIILIIL;
        if (absInteractStickerWidget != null) {
            interactStickerViewModel = absInteractStickerWidget.LJIILJJIL();
        } else {
            interactStickerViewModel = null;
        }
        this.LJIIIIZZ = interactStickerViewModel;
        LIZIZ();
    }

    public C245639kV(C92U widgetFactory) {
        o.LJIIIZ(widgetFactory, "widgetFactory");
        this.LIZ = widgetFactory;
        this.LJII = true;
        this.LJIIJJI = "";
    }

    public static String LJ(Aweme aweme) {
        String str = "";
        if (aweme == null || C79004UzY.LJJIFFI(aweme.getTextExtra())) {
            return "";
        }
        try {
            for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
                if (textExtraStruct.getSubtype() == 2 || textExtraStruct.getSubtype() == 3) {
                    if (textExtraStruct.getUserId() == null) {
                        return "";
                    }
                    String userId = textExtraStruct.getUserId();
                    o.LJIIIIZZ(userId, "textExtra.userId");
                    str = userId;
                    return str;
                }
            }
            return "";
        } catch (ClassCastException e) {
            C16880lQ.LLLLIIL(e);
            return str;
        }
    }

    public final void LIZ(boolean z) {
        List<InteractStickerStruct> list;
        Aweme aweme = this.LIZIZ;
        if (aweme != null) {
            list = aweme.getInteractStickerStructs();
        } else {
            list = null;
        }
        if (list == null) {
            if (this.LJIILIIL != null) {
                ArrayList arrayList = new ArrayList();
                InteractStickerViewModel interactStickerViewModel = this.LJIIIIZZ;
                if (interactStickerViewModel != null) {
                    interactStickerViewModel.iv0(arrayList, "interact_sticker_aweme_data");
                    return;
                }
                return;
            }
            return;
        }
        Aweme aweme2 = this.LIZIZ;
        o.LJI(aweme2);
        ArrayList arrayList2 = new ArrayList(aweme2.getInteractStickerStructs());
        Aweme aweme3 = this.LIZIZ;
        if (aweme3 != null && aweme3.isProhibited()) {
            arrayList2 = new ArrayList();
        }
        if (z) {
            ORS.LJJLIL(C245669kY.LJLIL, arrayList2);
        }
        if (C79004UzY.LJJIFFI(arrayList2)) {
            if (this.LJIILIIL == null) {
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            InteractStickerViewModel interactStickerViewModel2 = this.LJIIIIZZ;
            if (interactStickerViewModel2 == null) {
                return;
            }
            interactStickerViewModel2.iv0(arrayList3, "interact_sticker_aweme_data");
            return;
        }
        if (this.LJIILIIL == null) {
            LJFF();
        }
        InteractStickerViewModel interactStickerViewModel3 = this.LJIIIIZZ;
        if (interactStickerViewModel3 == null) {
            return;
        }
        interactStickerViewModel3.iv0(arrayList2, "interact_sticker_aweme_data");
    }

    public final void LJIIIIZZ(String str) {
        String str2;
        InteractStickerViewModel interactStickerViewModel;
        Aweme aweme = this.LIZIZ;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (o.LJ(str, str2) && (interactStickerViewModel = this.LJIIIIZZ) != null) {
            interactStickerViewModel.iv0(Boolean.TRUE, "viewholder_select_status_changed");
        }
    }

    public final void LJIIIZ(String str) {
        String str2;
        InteractStickerViewModel interactStickerViewModel;
        Aweme aweme = this.LIZIZ;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (o.LJ(str, str2) && (interactStickerViewModel = this.LJIIIIZZ) != null) {
            interactStickerViewModel.iv0(Boolean.FALSE, "viewholder_select_status_changed");
        }
    }

    public final void LJIIJJI(Aweme aweme) {
        this.LIZIZ = aweme;
        AbsInteractStickerWidget absInteractStickerWidget = this.LJIILIIL;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.LLIFFJFJJ(aweme);
        }
    }

    public final void LJI(int i, int i2) {
        InteractStickerViewModel interactStickerViewModel = this.LJIIIIZZ;
        if (interactStickerViewModel != null) {
            interactStickerViewModel.iv0(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)), "interact_sticker_update_intro_layout_y");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c4, code lost:
    
        if (r0.getCommentId() == 0) goto L193;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.content.Context r17, androidx.fragment.app.Fragment r18) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245639kV.LJIIJ(android.content.Context, androidx.fragment.app.Fragment):void");
    }

    public final void LJII(float f, float f2, int i) {
        InteractStickerViewModel interactStickerViewModel;
        OSJ osj = new OSJ(Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i));
        if (this.LJIILIIL != null && (interactStickerViewModel = this.LJIIIIZZ) != null) {
            interactStickerViewModel.iv0(osj, "interact_sticker_delegate_single_tap");
        }
    }
}
