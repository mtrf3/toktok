package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PoiStickerStruct;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8qD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223698qD extends AbstractC221838nD {
    public final InterfaceC223648q8 LJLJJL;

    @Override // X.AbstractC221838nD
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct stickerStruct) {
        o.LJIIIZ(stickerStruct, "stickerStruct");
        return C223998qh.LIZJ(j, stickerStruct);
    }

    @Override // X.AbstractC221838nD
    public final void LIZJ(float f, float f2, InterfaceC221818nB popListener) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        User user;
        String poiId;
        C76800UCe c76800UCe;
        C223778qL c223778qL3;
        C223778qL c223778qL4;
        C223778qL c223778qL5;
        C223778qL c223778qL6;
        o.LJIIIZ(popListener, "popListener");
        if (C6ZT.LIZ(this.LJLILLLLZI.LIZ(22))) {
            return;
        }
        C2U8.LIZ(new C223728qG(this.LJLILLLLZI.hashCode()));
        C188727au c188727au = new C188727au();
        C245649kW c245649kW = this.LJLJJI;
        String str6 = null;
        if (c245649kW != null && (c223778qL6 = c245649kW.LJIIZILJ) != null) {
            str = c223778qL6.LIZJ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 != null && (c223778qL5 = c245649kW2.LJIIZILJ) != null) {
            str2 = c223778qL5.LIZIZ;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        C245649kW c245649kW3 = this.LJLJJI;
        if (c245649kW3 != null && (c223778qL4 = c245649kW3.LJIIZILJ) != null) {
            str3 = c223778qL4.LIZLLL;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("log_pb", str3);
        C245649kW c245649kW4 = this.LJLJJI;
        if (c245649kW4 != null && (c223778qL3 = c245649kW4.LJIIZILJ) != null) {
            str4 = c223778qL3.LIZ;
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("enter_from", str4);
        try {
            HashMap hashMap = (HashMap) GsonHolder.LIZLLL().LIZ().LJII(this.LJLJI.getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.2ZI
            }.getType());
            if (hashMap != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (C78685UuP.LJJJZ((String) entry.getKey()) && C78685UuP.LJJJZ((String) entry.getValue())) {
                        c188727au.LJI((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        PoiStickerStruct poiStickerStruct = this.LJLJI.getPoiStickerStruct();
        if (poiStickerStruct != null && (poiId = poiStickerStruct.getPoiId()) != null) {
            c188727au.LJI("poi_id", poiId);
        }
        FMX.LJIIL("location_sticker_click", c188727au.LIZ);
        try {
            String poiId2 = this.LJLJI.getPoiStickerStruct().getPoiId();
            IAccountUserService LJIILL = HG3.LJIILL();
            C245649kW c245649kW5 = this.LJLJJI;
            if (c245649kW5 != null && (user = c245649kW5.LIZJ) != null) {
                str5 = user.getUid();
            } else {
                str5 = null;
            }
            boolean isMe = ((RBX) LJIILL).isMe(str5);
            C51556KLg.LIZ.getClass();
            if ((C51556KLg.LIZ().LJJJJZI() && !isMe) || !C51556KLg.LIZ().LJJJIL()) {
                SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "//poi/map");
                buildRoute.withParam("poi_id", poiId2);
                C245649kW c245649kW6 = this.LJLJJI;
                if (c245649kW6 != null && (c223778qL2 = c245649kW6.LJIIZILJ) != null) {
                    str6 = c223778qL2.LIZ;
                }
                buildRoute.withParam("enter_from", str6);
                buildRoute.open();
                return;
            }
            SmartRoute buildRoute2 = SmartRouter.buildRoute(this.LJLIL, "aweme://poi/detail");
            buildRoute2.withParam("poi_id", poiId2);
            C245649kW c245649kW7 = this.LJLJJI;
            if (c245649kW7 != null && (c223778qL = c245649kW7.LJIIZILJ) != null) {
                str6 = c223778qL.LIZ;
            }
            buildRoute2.withParam("enter_from", str6);
            buildRoute2.withParam("enter_method", "click_sticker");
            buildRoute2.open();
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
    }

    @Override // X.AbstractC221838nD, X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        C51556KLg.LIZ.getClass();
        if (!C51556KLg.LIZ().LJIJ()) {
            return false;
        }
        return super.LJIIJJI(j, f, f2, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C223698qD(Context context, C223708qE view, InteractStickerStruct stickerStruct, C245649kW c245649kW, InterfaceC223648q8 interfaceC223648q8) {
        super(context, view, stickerStruct, c245649kW);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(stickerStruct, "stickerStruct");
        this.LJLJJL = interfaceC223648q8;
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 1778));
    }
}
