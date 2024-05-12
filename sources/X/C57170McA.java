package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.relation.utils.CommonExtKt$runOn$observer$1;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import ujb.s;

/* renamed from: X.McA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57170McA implements InterfaceC57138Mbe {
    @Override // X.InterfaceC57138Mbe
    public final void LIZ() {
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onChannelShare(C113844dQ event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onChannelShare, success: ");
        LIZ.append(event.LJLILLLLZI);
        LIZ.append(", channel=");
        LIZ.append(event.LJLJI.key());
        C221018lt.LJFF("@LinkRelation", X1D.LIZIZ(LIZ));
        if (event.LJLILLLLZI) {
            Context context = event.LJLIL;
            InterfaceC62225ObV shareChannel = event.LJLJI;
            o.LJIIIZ(context, "context");
            o.LJIIIZ(shareChannel, "shareChannel");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI == null) {
                return;
            }
            if (LJJIFFI.isFinishing() || !C25706A7a.LIZ()) {
                C221018lt.LJFF("@LinkRelation", "not enable showPrivacyNotice, skip!");
                return;
            }
            boolean z = !o.LJ(shareChannel.key(), "copy");
            Lifecycle.Event event2 = Lifecycle.Event.ON_RESUME;
            AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LJJIFFI, 17);
            o.LJIIIZ(event2, "event");
            LJJIFFI.getLifecycle().addObserver(new CommonExtKt$runOn$observer$1(z, event2, aqS154S0100000_4));
        }
    }

    @Override // X.InterfaceC57138Mbe
    public final void LIZIZ(EnumC62617Ohp scene, C38281F0r c38281F0r) {
        EnumC57171McB enumC57171McB;
        o.LJIIIZ(scene, "scene");
        String url = c38281F0r.LJ();
        o.LJIIIIZZ(url, "url");
        if (!s.LJJJLZIJ(url, "timestamp", false)) {
            c38281F0r.LIZIZ(System.currentTimeMillis() / 1000, "timestamp");
        }
        IAccountUserService LJIILL = HG3.LJIILL();
        o.LJIIIIZZ(LJIILL, "userService()");
        if (((RBX) LJIILL).isLogin()) {
            if (!s.LJJJLZIJ(url, "user_id", false)) {
                IAccountUserService LJIILL2 = HG3.LJIILL();
                o.LJIIIIZZ(LJIILL2, "userService()");
                c38281F0r.LIZLLL("user_id", ((RBX) LJIILL2).getCurUserId());
            }
            if (!s.LJJJLZIJ(url, "sec_user_id", false)) {
                IAccountUserService LJIILL3 = HG3.LJIILL();
                o.LJIIIIZZ(LJIILL3, "userService()");
                c38281F0r.LIZLLL("sec_user_id", ((RBX) LJIILL3).getCurSecUserId());
            }
        } else {
            C221018lt.LJFF("@LinkRelation", "current user not login, skip uid append");
        }
        switch (C62618Ohq.LIZ[scene.ordinal()]) {
            case 1:
                enumC57171McB = EnumC57171McB.USER;
                break;
            case 2:
                enumC57171McB = EnumC57171McB.VIDEO_POST;
                break;
            case 3:
                enumC57171McB = EnumC57171McB.CHALLENGE;
                break;
            case 4:
                enumC57171McB = EnumC57171McB.MUSIC;
                break;
            case 5:
                enumC57171McB = EnumC57171McB.STICKERS;
                break;
            case 6:
                enumC57171McB = EnumC57171McB.INVITE_FRIENDS;
                break;
            case 7:
                enumC57171McB = EnumC57171McB.LIVE;
                break;
            case 8:
                enumC57171McB = EnumC57171McB.SEARCH;
                break;
            case 9:
                enumC57171McB = EnumC57171McB.QA;
                break;
            case 10:
                enumC57171McB = EnumC57171McB.GROUP_CHAT;
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                enumC57171McB = EnumC57171McB.PHOTO_VIDEO;
                break;
            case 12:
                enumC57171McB = EnumC57171McB.PRODUCT;
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                enumC57171McB = EnumC57171McB.PLAYLIST;
                break;
            case 14:
                enumC57171McB = EnumC57171McB.MULTI_LIVE;
                break;
            case 15:
                enumC57171McB = EnumC57171McB.SUBSCRIBE_INVITE;
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                enumC57171McB = EnumC57171McB.COMMENT;
                break;
            case 17:
                enumC57171McB = EnumC57171McB.STORY;
                break;
            case 18:
            case 19:
                enumC57171McB = EnumC57171McB.NOW_MY_POST;
                break;
            case 20:
                enumC57171McB = EnumC57171McB.NOW_INVITATION;
                break;
            case 21:
            case 22:
                enumC57171McB = EnumC57171McB.NOW_OTHER_POST;
                break;
            case 23:
                enumC57171McB = EnumC57171McB.NOW_BONUS_INVITE;
                break;
            case 24:
                enumC57171McB = EnumC57171McB.NOW_MEMORY;
                break;
            case 25:
                enumC57171McB = EnumC57171McB.NOW_VIDEO_MEMORY;
                break;
            case 26:
                enumC57171McB = EnumC57171McB.VIDEO_COLLECTION;
                break;
            case 27:
                enumC57171McB = EnumC57171McB.POI;
                break;
            default:
                enumC57171McB = EnumC57171McB.DEFAULT;
                break;
        }
        if (!s.LJJJLZIJ(url, "social_share_type", false)) {
            c38281F0r.LIZ(enumC57171McB.getRawValue(), "social_share_type");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("appendParams for type=");
        LIZ.append(enumC57171McB);
        LIZ.append(", url=");
        LIZ.append(c38281F0r.LJ());
        C221018lt.LJFF("@LinkRelation", X1D.LIZIZ(LIZ));
    }
}
