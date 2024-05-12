package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo4FE;
import com.bytedance.android.livesdk.model.message.StarCommentMessage;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.common.utility.Logger;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.widget.Widget;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.contact.model.Avatars;
import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UOr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77125UOr implements C68D, InterfaceC37239EjT {
    public static QCU LJLIL;

    public static Object LJIIJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-8937276080345288613"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static boolean LJIIJJI(int i, int i2) {
        return (i & i2) == i2;
    }

    public static synchronized boolean LJIJJLI() {
        boolean z;
        synchronized (C77125UOr.class) {
            if (LJLIL == null) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public static final ActivityC45651qj LIZJ(Object host) {
        o.LJIIJ(host, "host");
        if (host instanceof Fragment) {
            ActivityC45651qj requireActivity = ((Fragment) host).requireActivity();
            o.LJFF(requireActivity, "host.requireActivity()");
            return requireActivity;
        }
        if (host instanceof ActivityC45651qj) {
            return (ActivityC45651qj) host;
        }
        if (host instanceof Widget) {
            return LIZJ(((Widget) host).getHost());
        }
        if (host instanceof JediViewHolder) {
            return LIZJ(((JediViewHolder) host).getHost());
        }
        throw new IllegalStateException();
    }

    public static final void LIZLLL(java.util.Map map) {
        String str;
        String str2;
        HashMap hashMap = (HashMap) map;
        hashMap.put("enhance_level", String.valueOf(C74740TUy.LIZLLL().LJ));
        if (C74740TUy.LIZLLL().LJFF != null) {
            str = C74740TUy.LIZLLL().LJFF.realId;
            str2 = C74740TUy.LIZLLL().LJFF.getResourceId();
        } else {
            str = "";
            str2 = "";
        }
        hashMap.put("sticker_id", str);
        hashMap.put("sticker_resource_id", str2);
    }

    public static final void LJ(java.util.Map map) {
        String str;
        if (TTV.LIZ().LJIIIIZZ) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        map.put("is_muted", str);
    }

    public static final void LJFF(java.util.Map map) {
        map.put("guest_permission", TTV.LIZ().LIZ());
    }

    public static final void LJI(java.util.Map map) {
        String str;
        String l;
        LiveEffect liveEffect = C74740TUy.LIZLLL().LJFF;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (liveEffect == null || (str = liveEffect.getResourceId()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("sticker_resource_id", str);
        LiveEffect liveEffect2 = C74740TUy.LIZLLL().LJFF;
        if (liveEffect2 != null && (l = Long.valueOf(liveEffect2.effectId).toString()) != null) {
            str2 = l;
        }
        map.put("sticker_id", str2);
    }

    public static final RedEnvelopInfo4FE LJIILIIL(MessageRedEnvelopInfo messageRedEnvelopInfo) {
        String str;
        List<String> urls;
        ImageModel imageModel;
        List<String> urls2;
        RedEnvelopInfo4FE redEnvelopInfo4FE = new RedEnvelopInfo4FE();
        redEnvelopInfo4FE.businessType = messageRedEnvelopInfo.businessType;
        redEnvelopInfo4FE.diamondCount = messageRedEnvelopInfo.diamondCount;
        redEnvelopInfo4FE.envelopeId = messageRedEnvelopInfo.envelopeId;
        redEnvelopInfo4FE.envelopeIdc = messageRedEnvelopInfo.envelopeIdc;
        redEnvelopInfo4FE.peopleCount = messageRedEnvelopInfo.peopleCount;
        redEnvelopInfo4FE.sendUserId = messageRedEnvelopInfo.sendUserId;
        redEnvelopInfo4FE.unpackAt = messageRedEnvelopInfo.unpackAt;
        redEnvelopInfo4FE.sendUserName = messageRedEnvelopInfo.sendUserName;
        ImageModel imageModel2 = messageRedEnvelopInfo.sendUserAvatar;
        if (imageModel2 == null || (urls = imageModel2.getUrls()) == null || urls.size() <= 0 || (imageModel = messageRedEnvelopInfo.sendUserAvatar) == null || (urls2 = imageModel.getUrls()) == null || (str = (String) ListProtector.get(urls2, 0)) == null) {
            str = "";
        }
        redEnvelopInfo4FE.sendUserAvatar = str;
        redEnvelopInfo4FE.followStatusShow = messageRedEnvelopInfo.followStatusShow;
        redEnvelopInfo4FE.createAt = messageRedEnvelopInfo.createTime;
        return redEnvelopInfo4FE;
    }

    public static final Object LJIILLIIL(Object host) {
        o.LJIIJ(host, "host");
        if ((host instanceof Fragment) || (host instanceof ActivityC45651qj)) {
            return host;
        }
        if (host instanceof Widget) {
            return ((Widget) host).getHost();
        }
        if (host instanceof JediViewHolder) {
            return LJIILLIIL(((JediViewHolder) host).getHost());
        }
        throw new IllegalStateException();
    }

    public static void LJIJ(Aweme aweme) {
        C47242IgQ.LIZ().cancelAll();
        C46728IVo.LJIIL(0, aweme);
        if (aweme != null && aweme.getVideo() != null) {
            aweme.getVideo().setSourceId(aweme.getAid());
            VideoUrlModel properPlayAddr = aweme.getVideo().getProperPlayAddr();
            if (properPlayAddr != null) {
                properPlayAddr.setSourceId(aweme.getAid());
            }
        }
    }

    public static synchronized void LJIJJ(QCU qcu) {
        synchronized (C77125UOr.class) {
            if (LJLIL == null) {
                LJLIL = qcu;
            } else {
                throw new IllegalStateException("Cannot re-initialize NativeLoader.");
            }
        }
    }

    public static String LJIL(Context context) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = context.getAssets().open("pipo_starling.json");
                byte[] bArr = new byte[1024];
                StringBuilder sb = new StringBuilder("");
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read));
                }
                String sb2 = sb.toString();
                try {
                    inputStream.close();
                } catch (Throwable unused) {
                }
                return sb2;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused3) {
                }
            }
            return "";
        }
    }

    public static final IMUserBaseInfo LJJI(IMUser iMUser) {
        o.LJIIIZ(iMUser, "<this>");
        IMUserBaseInfo iMUserBaseInfo = new IMUserBaseInfo();
        String uid = iMUser.getUid();
        o.LJIIIIZZ(uid, "it.uid");
        iMUserBaseInfo.setUserId(CastLongProtector.parseLong(uid));
        iMUserBaseInfo.setContactNickName(iMUser.getNickName());
        iMUserBaseInfo.setUniqueId(iMUser.getUniqueId());
        iMUserBaseInfo.setAvatars(new Avatars(iMUser.getAvatarThumb(), iMUser.getAvatarMedium()));
        iMUserBaseInfo.setFollowStatus(Integer.valueOf(iMUser.getFollowStatus()));
        iMUserBaseInfo.setRecType(iMUser.getRecType());
        iMUserBaseInfo.setSortWeight(iMUser.getSortWeight());
        iMUserBaseInfo.setInitialLetter(iMUser.getInitialLetter());
        return iMUserBaseInfo;
    }

    public static final InterfaceC55726Lty LJII(Context context, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(context, "<this>");
        US3 us3 = new US3(context);
        interfaceC88472Yns.invoke(us3);
        return us3.LIZ();
    }

    public static final InterfaceC55726Lty LJIIIIZZ(Fragment fragment, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(fragment, "<this>");
        Context requireContext = fragment.requireContext();
        o.LJIIIIZZ(requireContext, "this.requireContext()");
        US3 us3 = new US3(requireContext);
        interfaceC88472Yns.invoke(us3);
        return us3.LIZ();
    }

    public static void LJIILJJIL(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[AnimaX]");
        LIZ.append(str);
        LLog.LIZLLL(4, X1D.LIZIZ(LIZ), str2);
    }

    public static String LJIIZILJ(int i, Context context) {
        String str;
        switch (i) {
            case 1:
                str = TTNetInit.getTTNetDepend().LIZ(context, "ssids");
                break;
            case 2:
                str = TTNetInit.getTTNetDepend().LIZ(context, "dns");
                break;
            case 3:
                str = TTNetInit.getTTNetDepend().LIZ(context, "https_dns");
                break;
            case 4:
                str = TTNetInit.getTTNetDepend().LIZ(context, "tnc_config");
                break;
            case 5:
                str = TTNetInit.getTTNetDepend().LIZ(context, "tnc_etag");
                break;
            case 6:
                str = TTNetInit.getTTNetDepend().LIZ(context, "tnc_abtest");
                break;
            default:
                str = "";
                break;
        }
        if (!(str instanceof String)) {
            return "";
        }
        return String.valueOf(str);
    }

    public static void LJIJI(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[AnimaX]");
        LIZ.append(str);
        LLog.LIZLLL(2, X1D.LIZIZ(LIZ), str2);
    }

    public static final void LJIIIZ(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static final CVC LJIIL(StarCommentMessage starCommentMessage, long j, String str) {
        String str2 = starCommentMessage.starCommentId;
        User user = starCommentMessage.user;
        if (user == null) {
            user = new User();
        }
        CVC cvc = new CVC(str2, user, starCommentMessage.content, starCommentMessage.startTimeMs, starCommentMessage.duration, starCommentMessage.commentOption, starCommentMessage.contentLanguage, CZV.DISPLAYING, C31533CZd.LIZJ, str);
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        try {
            commonMessageData.messageId = CastLongProtector.parseLong(cvc.LJLIL);
        } catch (NumberFormatException unused) {
        }
        commonMessageData.showMsg = true;
        cvc.baseMessage = commonMessageData;
        return cvc;
    }

    public static final void LJIILL(C58655N0h c58655N0h, InterfaceC88471Ynr interfaceC88471Ynr, NRF data) {
        o.LJIIIZ(data, "data");
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(c58655N0h.LIZ, c58655N0h.LIZIZ);
        }
        c58655N0h.LJI();
    }

    public static void LJJ(Context context, int i, String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            switch (i) {
                case 1:
                    linkedHashMap.put("ssids", str);
                    break;
                case 2:
                    linkedHashMap.put("dns", str);
                    break;
                case 3:
                    linkedHashMap.put("https_dns", str);
                    break;
                case 4:
                    linkedHashMap.put("tnc_config", str);
                    break;
                case 5:
                    linkedHashMap.put("tnc_etag", str);
                    break;
                case 6:
                    linkedHashMap.put("tnc_abtest", str);
                    break;
            }
            Logger.debug();
            TTNetInit.getTTNetDepend().LJ(context, linkedHashMap);
        } catch (Exception unused) {
        }
    }

    @Override // X.C68D
    public C6DA LIZ(View contentView, C1552567l c1552567l, C82622Wbi c82622Wbi) {
        o.LJIIIZ(contentView, "contentView");
        return new C156146Aw(contentView, c1552567l, c82622Wbi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[Catch: Exception -> 0x0100, TryCatch #0 {Exception -> 0x0100, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0022, B:8:0x0036, B:10:0x0043, B:14:0x0053, B:15:0x004a, B:17:0x0050, B:22:0x0058, B:24:0x005c, B:26:0x0086, B:28:0x0097, B:29:0x009c, B:31:0x00b3, B:32:0x00c6, B:34:0x00fc, B:38:0x00bd, B:39:0x00ae, B:40:0x0060, B:41:0x006f, B:43:0x0073, B:44:0x0078, B:45:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[Catch: Exception -> 0x0100, TryCatch #0 {Exception -> 0x0100, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0022, B:8:0x0036, B:10:0x0043, B:14:0x0053, B:15:0x004a, B:17:0x0050, B:22:0x0058, B:24:0x005c, B:26:0x0086, B:28:0x0097, B:29:0x009c, B:31:0x00b3, B:32:0x00c6, B:34:0x00fc, B:38:0x00bd, B:39:0x00ae, B:40:0x0060, B:41:0x006f, B:43:0x0073, B:44:0x0078, B:45:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc A[Catch: Exception -> 0x0100, TryCatch #0 {Exception -> 0x0100, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0022, B:8:0x0036, B:10:0x0043, B:14:0x0053, B:15:0x004a, B:17:0x0050, B:22:0x0058, B:24:0x005c, B:26:0x0086, B:28:0x0097, B:29:0x009c, B:31:0x00b3, B:32:0x00c6, B:34:0x00fc, B:38:0x00bd, B:39:0x00ae, B:40:0x0060, B:41:0x006f, B:43:0x0073, B:44:0x0078, B:45:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[Catch: Exception -> 0x0100, TryCatch #0 {Exception -> 0x0100, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0022, B:8:0x0036, B:10:0x0043, B:14:0x0053, B:15:0x004a, B:17:0x0050, B:22:0x0058, B:24:0x005c, B:26:0x0086, B:28:0x0097, B:29:0x009c, B:31:0x00b3, B:32:0x00c6, B:34:0x00fc, B:38:0x00bd, B:39:0x00ae, B:40:0x0060, B:41:0x006f, B:43:0x0073, B:44:0x0078, B:45:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[Catch: Exception -> 0x0100, TryCatch #0 {Exception -> 0x0100, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0022, B:8:0x0036, B:10:0x0043, B:14:0x0053, B:15:0x004a, B:17:0x0050, B:22:0x0058, B:24:0x005c, B:26:0x0086, B:28:0x0097, B:29:0x009c, B:31:0x00b3, B:32:0x00c6, B:34:0x00fc, B:38:0x00bd, B:39:0x00ae, B:40:0x0060, B:41:0x006f, B:43:0x0073, B:44:0x0078, B:45:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // X.InterfaceC37239EjT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LIZIZ(java.lang.ClassLoader r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77125UOr.LIZIZ(java.lang.ClassLoader, java.lang.String, boolean, boolean):boolean");
    }
}
