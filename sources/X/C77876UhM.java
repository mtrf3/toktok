package X;

import aj2.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import java.util.ArrayList;
import kotlin.jvm.internal.IDqS432S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.UhM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77876UhM implements InterfaceC77878UhO, b, InterfaceC75706TnS, InterfaceC36767Ebr, InterfaceC19890qH, InterfaceC83383Pa, InterfaceC48038ItG {
    public static C77876UhM LJLIL;
    public static final C77876UhM LJLILLLLZI = new C77876UhM();
    public static final C77876UhM LJLJI = new C77876UhM();

    @Override // X.InterfaceC36767Ebr
    public void LIZIZ(String message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC36767Ebr
    public void LIZJ(String message, Throwable throwable) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(throwable, "throwable");
    }

    public static C100023wE LJ() {
        return C88546Yp4.LIZIZ.LIZIZ();
    }

    public static synchronized C77876UhM LJI() {
        C77876UhM c77876UhM;
        synchronized (C77876UhM.class) {
            if (LJLIL == null) {
                LJLIL = new C77876UhM();
            }
            c77876UhM = LJLIL;
        }
        return c77876UhM;
    }

    @Override // X.InterfaceC19890qH
    public void onShow() {
        InterfaceC30442Bx8.b2.LIZJ(Boolean.TRUE);
    }

    public static final W0U LJIIIIZZ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        C77877UhN gsonSupplier = C77877UhN.LJLIL;
        o.LJIIIZ(gsonSupplier, "gsonSupplier");
        W0U w0u = new W0U(gsonSupplier);
        ((ArrayList) w0u.LIZ).add(new IDqS432S0100000_7(shortVideoContext, 1));
        w0u.LIZIZ = new W0N(shortVideoContext);
        return w0u;
    }

    @Override // X.InterfaceC75706TnS
    public void LJFF(OFV ofv) {
        RandomLinkMicManager.LJLIL.getClass();
        RandomLinkMicManager.LIZIZ("receive quickpair invite");
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        CategoryEffectModel it = (CategoryEffectModel) obj;
        o.LJIIIZ(it, "it");
        return new CategoryPageModel(new com.ss.ugc.effectplatform.model.CategoryPageModel(it, null, null, 6, null));
    }

    @Override // X.InterfaceC75706TnS
    public void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        RandomLinkMicManager.LJIILIIL();
        if (th != null) {
            BPP.LJ(C15380j0.LIZLLL(), th);
            C75516TkO.LIZ.LIZIZ(702, "reply quick pair invitation failed", th, null);
        }
    }

    public void LJII(Context context, String str) {
        android.net.Uri uri;
        o.LJIIIZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("openUrl: ");
        LIZ.append(str);
        LIZ.append(", ");
        LIZ.append(true);
        C34B.LJI("IMSecUrlOpenHelper", X1D.LIZIZ(LIZ));
        if (str == null || str.length() == 0) {
            C34B.LIZJ("IMSecUrlOpenHelper", "openUrl url isEmpty");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
        try {
            uri = UriProtector.parse(str);
        } catch (Exception e) {
            C34B.LJ("IMSecUrlOpenHelper", e);
            uri = null;
        }
        intent.putExtra("sec_link_scene", "im");
        if (uri != null) {
            intent.putExtra("need_sec_link", true);
            intent.putExtra("sec_link_scene", "im");
            intent.putExtra("need_detect_2_jump", true);
            intent.putExtra("safeTemplate", true);
            C34B.LJI("IMSecUrlOpenHelper", "openUrl with secLink sdk");
            intent.setData(uri);
            intent.putExtra("enter_from", "chat");
            intent.putExtra("hide_more", false);
            intent.putExtra("use_webview_title", false);
            C16880lQ.LIZJ(context, intent);
            return;
        }
        C34B.LJI("IMSecUrlOpenHelper", "openUrl jumpUri null");
    }

    public void LIZ(Context context, String str, String str2, String str3, int i, String str4, Bundle bundle) {
        if (context != null) {
            Intent intent = new Intent(context, (Class<?>) DetailActivity.class);
            intent.putExtra("id", str);
            intent.putExtra("refer", str2);
            intent.putExtra("video_from", str3);
            intent.putExtra("profile_enterprise_type", i);
            intent.putExtra("page_type", 7000);
            intent.putExtra("enter_method", bundle.getString("enter_method", null));
            if (str4 != null) {
                intent.putExtra("userid", str4);
            }
            intent.putExtra("key_from_chat_room_playing", bundle.getBoolean("key_from_chat_room_playing"));
            intent.putExtra("key_from_chat_room_real_aid", bundle.getString("key_from_chat_room_real_aid"));
            intent.putExtra("is_from_auto_message", bundle.getInt("is_from_auto_message"));
            intent.putExtra("message", bundle.getSerializable("message"));
            intent.putExtra("conversation_id", bundle.getString("conversation_id"));
            if (bundle.getBoolean("key_from_quoted_video")) {
                intent.putExtra("key_from_quoted_video", bundle.getBoolean("key_from_quoted_video"));
                intent.putExtra("message_id", bundle.getLong("message_id"));
            } else {
                intent.putExtra("message_id", bundle.getString("message_id"));
            }
            intent.putExtra("process_id", bundle.getString("process_id"));
            intent.putExtra("search_id", bundle.getString("search_id"));
            intent.putExtra("im_support_duplicate", bundle.getBoolean("im_support_duplicate", true));
            String string = bundle.getString("cid");
            if (!TextUtils.isEmpty(string)) {
                intent.putExtra("cid", string);
                intent.putExtra("id", bundle.getString("realItemId"));
            }
            intent.putExtra("chat_type", bundle.getInt("chat_type", -1));
            intent.putExtra("enter_chat_param", bundle.getSerializable("enter_chat_param"));
            try {
                C16880lQ.LIZJ(context, intent);
            } catch (Exception unused) {
                C16880lQ.LIZJ(context, intent);
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "chat");
        c188727au.LJIIIZ("group_id", str);
        FMX.LJIIL("feed_enter", c188727au.LIZ);
    }
}
