package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.t1;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0hY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14480hY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C2A4 c2a4, Context context, ImageModel imageModel, final InterfaceC88473Ynt interfaceC88473Ynt, final InterfaceC88471Ynr interfaceC88471Ynr) {
        o.LJIIIZ(context, "context");
        C17190lv LJII = C17190lv.LJII(context);
        LJII.LJFF = imageModel;
        LJII.LIZLLL = new W4V<InterfaceC81599W0t>() { // from class: X.1mO
            @Override // X.W4V, X.W4Z
            public final void LJ(String str, Throwable th) {
                C0NB.LJFF("LiveFlyMicGiftHelper", "load image failed，", th);
                interfaceC88471Ynr.invoke(str, th);
            }

            @Override // X.W4V, X.W4Z
            public final void LJFF(String str, Object obj, Animatable animatable) {
                if (!(animatable instanceof AnimatedDrawable2)) {
                    C0NB.LJ("LiveFlyMicGiftHelper", "animatable is not AnimatedDrawable2, so return");
                    return;
                }
                AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                animatedDrawable2.LJLIL = 1;
                animatedDrawable2.LJLILLLLZI = true;
                animatedDrawable2.LJFF(new C518821w(animatedDrawable2.LJLJI, 1));
                interfaceC88473Ynt.invoke(str, obj, animatable);
            }
        };
        LJII.LIZJ(c2a4);
    }

    public static void LIZIZ(C33611Tp flyMicGiftAnimaInfo, int i, int i2, int i3, boolean z) {
        String str;
        String str2;
        Long l;
        Object obj;
        Object obj2;
        long j;
        o.LJIIIZ(flyMicGiftAnimaInfo, "flyMicGiftAnimaInfo");
        HashMap hashMap = new HashMap();
        hashMap.put("downgrade_status", String.valueOf(flyMicGiftAnimaInfo.LJLIL.LJIILIIL));
        hashMap.put("error_code", String.valueOf(i));
        hashMap.put("trail_effect_status", String.valueOf(i2));
        hashMap.put("mic_effect_status", String.valueOf(i3));
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (i3 == 1) {
            long currentTimeMillis = System.currentTimeMillis() - flyMicGiftAnimaInfo.LJLJJI;
            Long l2 = flyMicGiftAnimaInfo.LJLIL.LJIIL;
            if (l2 != null) {
                j = l2.longValue();
            } else {
                j = 0;
            }
            str = String.valueOf(currentTimeMillis + j);
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("mic_effect_delay", str);
        int i4 = flyMicGiftAnimaInfo.LJLIL.LIZIZ;
        if (i4 == 3) {
            str2 = "1";
        } else if (i4 != 4) {
            str2 = "-1";
        } else {
            str2 = "2";
        }
        hashMap.put("fly_mic_gift_type", str2);
        hashMap.put("gift_id", String.valueOf(flyMicGiftAnimaInfo.LJLIL.LIZ));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        Long l3 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        hashMap.put("anchor_id", String.valueOf(l));
        t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "user_id");
        if (flyMicGiftAnimaInfo.LJLIL.LIZLLL == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_own_send", obj);
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            l3 = Long.valueOf(room2.getOwnerUserId());
        }
        if (o.LJ(valueOf, String.valueOf(l3))) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", obj2);
        if (z) {
            str3 = "1";
        }
        hashMap.put("is_guest", str3);
        C0NB.LIZIZ("legolas", "send log");
        C29822Bn8.LIZIZ("livesdk_fly_mic_gift_effect", hashMap);
    }
}
