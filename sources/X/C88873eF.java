package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UserInfoComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.container.fragment.StickerStorePanelFragment;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AqS12S2100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3eF */
/* loaded from: classes2.dex */
public final class C88873eF {
    public static final C88873eF LIZ = new C88873eF();

    public static int LIZJ(Fragment fragment) {
        StickerStorePanelFragment stickerStorePanelFragment;
        Integer num;
        while (fragment != null && !(fragment instanceof StickerStorePanelFragment)) {
            fragment = fragment.getParentFragment();
        }
        if ((fragment instanceof StickerStorePanelFragment) && (stickerStorePanelFragment = (StickerStorePanelFragment) fragment) != null && (num = stickerStorePanelFragment.LJLJJL) != null) {
            return num.intValue();
        }
        return EnumC87993cp.UNKNOWN.getIndex();
    }

    public static int LIZIZ(long j, long j2) {
        int intValue = ((Number) C88943eM.LIZ.getValue()).intValue();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy,MM,dd,HH,mm,ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String oldDate = simpleDateFormat.format(Long.valueOf(j));
        String newDate = simpleDateFormat.format(Long.valueOf(j2));
        o.LJIIIIZZ(oldDate, "oldDate");
        List LJLJJL = s.LJLJJL(oldDate, new String[]{","}, 0, 6);
        o.LJIIIIZZ(newDate, "newDate");
        List LJLJJL2 = s.LJLJJL(newDate, new String[]{","}, 0, 6);
        int parseInt = CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL, 2));
        int parseInt2 = CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL2, 2));
        int parseInt3 = CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL, 3));
        int parseInt4 = CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL2, 3));
        if (parseInt3 >= intValue) {
            parseInt++;
        }
        if (parseInt4 >= intValue) {
            parseInt2++;
        }
        int i = parseInt2 - parseInt;
        StringBuilder LIZLLL = C06540Nm.LIZLLL("oldDate=", oldDate, " newDate=", newDate, " dayDiff=");
        LIZLLL.append(i);
        C34B.LIZIZ("StickerStoreHelper", X1D.LIZIZ(LIZLLL));
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIJ(View view, StickerTemplate stickerTemplate) {
        Context context;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        C61878OQg c61878OQg;
        List<String> list;
        Long l;
        String str;
        if (view == null || (context = view.getContext()) == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
            return;
        }
        C245319jz c245319jz = new C245319jz();
        UserInfoComponent userInfoComponent = stickerTemplate.userInfo;
        if (userInfoComponent != null) {
            long j = userInfoComponent.userId;
            String str2 = userInfoComponent.nickName;
            if (str2 == null) {
                c61878OQg = C61878OQg.INSTANCE;
            } else {
                ImageComponent imageComponent = userInfoComponent.avatarThumb;
                if (imageComponent == null || (list = imageComponent.urls) == null) {
                    c61878OQg = C61878OQg.INSTANCE;
                } else {
                    String str3 = stickerTemplate.LLLL().queryData.extras.get("a:origin_video_id");
                    String str4 = stickerTemplate.LLLL().queryData.extras.get("a:sticker_id");
                    String str5 = stickerTemplate.LLLL().queryData.extras.get("a:sticker_type");
                    String str6 = stickerTemplate.LLLL().queryData.extras.get("a:sticker_creator_user_id");
                    ArrayList arrayList = new ArrayList();
                    C252659vp LIZIZ = C49606JdS.LIZIZ(R.raw.icon_play_circle, R.string.roj);
                    LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS12S2100000_1(view, str3, str4, 4), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                    arrayList.add(LIZIZ);
                    if (C88963eO.LIZLLL() && !C88963eO.LIZJ()) {
                        Integer num = null;
                        if (str4 != null) {
                            l = C38350F3i.LJJIZ(str4);
                        } else {
                            l = null;
                        }
                        if (str5 != null) {
                            num = C38350F3i.LJJIL(str5);
                        }
                        C252659vp LIZ2 = C72704Sg8.LIZ(R.raw.icon_star);
                        Context context2 = view.getContext();
                        if (context2 == null || (str = context2.getString(R.string.hau)) == null) {
                            str = "";
                        }
                        LIZ2.LIZ = str;
                        LIZ2.LJ = new ACListenerS21S0100000_1(new C72072sF(view, num, l, str3, str6), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                        arrayList.add(LIZ2);
                    }
                    C252659vp c252659vp = new C252659vp();
                    c252659vp.LJI = new AqS167S0100000_1(list, (List<VoucherInfoNew>) 478);
                    c252659vp.LIZ = Q8U.LIZIZ(new Object[]{str2}, 1, C88913eJ.LIZ(view, R.string.roi, "view.context.getString(R…idsticker_longpress_more)"), "format(format, *args)");
                    c252659vp.LJ = new ACListenerS21S0100000_1(new C87333bl(j, str4, str3), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                    arrayList.add(c252659vp);
                    c61878OQg = arrayList;
                }
            }
        } else {
            c61878OQg = C61878OQg.INSTANCE;
        }
        C252659vp[] c252659vpArr = (C252659vp[]) c61878OQg.toArray(new C252659vp[0]);
        c245319jz.LIZ((C252659vp[]) Arrays.copyOf(c252659vpArr, c252659vpArr.length));
        c245319jz.LIZJ().show(supportFragmentManager, "StickerStoreHelper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r13 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.sharer.model.SharePackage LIZLLL(com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r5 = "send_to_friend_button"
            r3 = 0
            r6 = 2
            r4 = r14
            r7 = r4
            r2 = r13
            r1 = r12
            com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate r1 = LJ(r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask r3 = new com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask
            com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel r6 = new com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel
            if (r4 != 0) goto L14
            java.lang.String r7 = ""
        L14:
            r8 = 0
            r11 = 28
            r9 = r8
            r10 = r8
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.String r0 = "video_sticker"
            r3.<init>(r0, r1, r6, r8)
            if (r2 == 0) goto L5a
            com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerUrlStruct r0 = r2.getStaticUrl()
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.base.model.UrlModel r8 = r0.getMidResolutionUrl()
        L2d:
            com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerUrlStruct r0 = r2.getAnimateUrl()
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getMidResolutionUrl()
            if (r2 == 0) goto L47
            java.util.List r0 = r2.getUrlList()
            if (r0 == 0) goto L47
            boolean r1 = X.C1GE.LJIILIIL(r0)
            r0 = 1
            if (r1 != r0) goto L47
            r8 = r2
        L47:
            com.ss.android.ugc.aweme.sharer.model.SharePackage r2 = X.C106684Gq.LIZ(r3)
            android.os.Bundle r1 = r2.extras
            java.lang.String r0 = "video_cover"
            r1.putSerializable(r0, r8)
            android.os.Bundle r1 = r2.extras
            java.lang.String r0 = "enter_from"
            r1.putString(r0, r4)
            return r2
        L5a:
            if (r2 == 0) goto L47
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88873eF.LIZLLL(com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker, java.lang.String):com.ss.android.ugc.aweme.sharer.model.SharePackage");
    }

    public static /* synthetic */ void LJIIIZ(VideoSticker videoSticker, String str, EnumC88973eP enumC88973eP, java.util.Map map) {
        LIZ.LJIIIIZZ(videoSticker, str, enumC88973eP, map, C88903eI.LIZ(), EF7.LIZIZ());
    }

    public static /* synthetic */ void LJII(SetSticker setSticker, String str, EnumC88973eP enumC88973eP, java.util.Map map, int i) {
        InterfaceC88923eK interfaceC88923eK;
        java.util.Map map2 = map;
        Context context = null;
        if ((i & 8) != 0) {
            map2 = null;
        }
        if ((i & 16) != 0) {
            interfaceC88923eK = C88903eI.LIZ();
        } else {
            interfaceC88923eK = null;
        }
        if ((i & 32) != 0) {
            context = EF7.LIZIZ();
        }
        LJI(setSticker, str, enumC88973eP, map2, interfaceC88923eK, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(androidx.fragment.app.Fragment r20, java.lang.Long r21, java.lang.Integer r22, X.C87153bT r23, X.InterfaceC67352kd r24) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88873eF.LJFF(androidx.fragment.app.Fragment, java.lang.Long, java.lang.Integer, X.3bT, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r11 != null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
    
        if (r23 == null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (r17 != null) goto L203;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate LJ(X.C88873eF r22, com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r23, android.content.Context r24, java.lang.String r25, java.lang.String r26, int r27) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88873eF.LJ(X.3eF, com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker, android.content.Context, java.lang.String, java.lang.String, int):com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
    
        if (r16 != null) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker r16, java.lang.String r17, X.EnumC88973eP r18, java.util.Map r19, X.InterfaceC88923eK r20, android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88873eF.LJI(com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker, java.lang.String, X.3eP, java.util.Map, X.3eK, android.content.Context):void");
    }

    public final void LJIIIIZZ(VideoSticker videoSticker, String str, EnumC88973eP enterMethod, java.util.Map<String, String> map, InterfaceC88923eK messageSenderTaskBuilder, Context context) {
        String str2;
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(messageSenderTaskBuilder, "messageSenderTaskBuilder");
        o.LJIIIZ(context, "context");
        C4MW LIZIZ = messageSenderTaskBuilder.LIZIZ(str);
        LIZIZ.LJFF(LJ(this, videoSticker, context, null, null, 12));
        LIZIZ.LIZ("video_sticker");
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        map.put("enter_method", enterMethod.getValue());
        if (enterMethod == EnumC88973eP.STICKER_STORE) {
            str2 = enterMethod.getValue();
        } else {
            str2 = "chat";
        }
        map.put("enter_from", str2);
        LIZIZ.LIZ.LJII = map;
        LIZIZ.LJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r23, java.lang.String r24, android.view.View r25, long r26, int r28, java.lang.String r29, X.C87163bU r30, X.InterfaceC67352kd r31) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88873eF.LIZ(java.lang.String, java.lang.String, android.view.View, long, int, java.lang.String, X.3bU, X.2kd):java.lang.Object");
    }
}
