package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.OGf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61617OGf extends RecyclerView.ViewHolder implements WeakHandler.IHandler {
    public final SmartImageView LJLIL;
    public Banner LJLILLLLZI;
    public int LJLJI;
    public final WeakHandler LJLJJI;
    public String LJLJJL;
    public final InterfaceC56611MJr LJLJJLL;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message msg) {
        User user;
        o.LJIIIZ(msg, "msg");
        Context context = this.itemView.getContext();
        Object obj = msg.obj;
        int i = msg.what;
        if (obj instanceof ExecutionException) {
            obj = ((Throwable) obj).getCause();
        }
        if (obj instanceof C38333F2r) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C1FJ.LJI((C38333F2r) obj, new C26045AKb(itemView));
            return;
        }
        if (obj instanceof Exception) {
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            C26045AKb c26045AKb = new C26045AKb(itemView2);
            c26045AKb.LJIIIIZZ(R.string.imh);
            c26045AKb.LJIIJ();
            return;
        }
        if (i == Z8A.LIZIZ.getMessageProfile()) {
            if (obj instanceof User) {
                Object obj2 = msg.obj;
                o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                user = (User) obj2;
            } else if (!(obj instanceof UserResponse)) {
                return;
            } else {
                user = ((UserResponse) obj).getUser();
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            Banner banner = this.LJLILLLLZI;
            o.LJI(banner);
            logData.requestId = banner.getRequestId();
            enterRoomConfig.mRoomsData.enterFromMerge = "discovery";
            LiveOuterService.LJJJLL().LJIILL().LJIIZILJ(context, user, enterRoomConfig);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61617OGf(InterfaceC56611MJr listener, View itemView) {
        super(itemView);
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.jd5);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.sd_cover)");
        SmartImageView smartImageView = (SmartImageView) findViewById;
        this.LJLIL = smartImageView;
        this.LJLJJI = new WeakHandler(C16880lQ.LLJJJJ(), this);
        this.LJLJJL = "";
        this.LJLJJLL = listener;
        C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS30S0100000_10(this, 124));
    }

    public final void L(String str, String str2) {
        String bid;
        String bid2;
        Banner banner = this.LJLILLLLZI;
        o.LJI(banner);
        FMX.LJII("banner_click", this.LJLJI + 1, "click", String.valueOf(banner.getCreativeId()));
        String LJJJJLI = C78866UxK.LJJJJLI(str);
        C50924Jyi c50924Jyi = new C50924Jyi();
        Banner banner2 = this.LJLILLLLZI;
        o.LJI(banner2);
        c50924Jyi.setBannerId(banner2.getBid());
        c50924Jyi.setClientOrder(this.LJLJI + 1);
        c50924Jyi.setTagId(LJJJJLI);
        c50924Jyi.setEnterFrom("discovery");
        FMX.LJIIL("banner_click", c50924Jyi.buildParams());
        Banner banner3 = this.LJLILLLLZI;
        o.LJI(banner3);
        if (banner3.isAd()) {
            Context context = this.itemView.getContext();
            Banner banner4 = this.LJLILLLLZI;
            int i = this.LJLJI + 1;
            C73340SqO.LJIL().getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("banner_order", Integer.valueOf(i));
            C59127NIl LIZ = C59128NIm.LIZ();
            LIZ.LIZIZ = "click";
            LIZ.LJII(banner4.getLogExtra());
            LIZ.LIZ = "discovery_ad";
            LIZ.LJIIIIZZ("banner");
            LIZ.LIZLLL(Long.valueOf(banner4.getCreativeId()));
            LIZ.LIZ(hashMap);
            LIZ.LJIIIZ(context);
            C58655N0h LJ = C58704N2e.LJ("discovery_ad", "click", String.valueOf(banner4.getCreativeId()), banner4.getLogExtra(), CardStruct.IStatusCode.DEFAULT);
            LJ.LIZJ("banner", "refer");
            LJ.LIZIZ(Integer.valueOf(i), "banner_order");
            LJ.LJII();
            O8Z.LIZIZ("click", banner4.getClickTrackUrlList(), Long.valueOf(banner4.getCreativeId()), banner4.getLogExtra(), new JSONObject(hashMap));
        }
        int i2 = 0;
        try {
            if (C30591Hz.LJIL("aweme://challenge/detail/:id", str) || ujb.o.LJJJLIIL(str, "sslocal://challenge/detail", false)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enter_from", "banner");
                jSONObject.put("enter_method", "click_banner");
                jSONObject.put("process_id", this.LJLJJL);
                jSONObject.put("tag_id", LJJJJLI);
                jSONObject.put("scene_id", "1008");
                jSONObject.put("shoot_enter_from", "discovery");
                Banner banner5 = this.LJLILLLLZI;
                if (banner5 != null && (bid = banner5.getBid()) != null) {
                    jSONObject.put("banner_id", bid);
                }
                if (!TextUtils.isEmpty(str2)) {
                    i2 = 1;
                }
                jSONObject.put("is_bundled", i2);
                if (str2 != null) {
                    jSONObject.put("prop_id", str2);
                }
                FMX.LJIILJJIL("enter_tag_detail", jSONObject);
                return;
            }
            if (ujb.o.LJJJLIIL(str, "aweme://sticker/detail", false)) {
                String substring = str.substring(s.LJJLIIIJLLLLLLLZ(str, '/', 0, 6) + 1);
                o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("group_id", "");
                jSONObject2.put("author_id", "");
                jSONObject2.put("process_id", this.LJLJJL);
                jSONObject2.put("impr_type", "");
                jSONObject2.put("prop_id", substring);
                jSONObject2.put("enter_from", "discovery");
                jSONObject2.put("enter_method", "click_trending_cell");
                Banner banner6 = this.LJLILLLLZI;
                if (banner6 != null && (bid2 = banner6.getBid()) != null) {
                    jSONObject2.put("banner_id", bid2);
                }
                FMX.LJIILJJIL("enter_prop_detail", jSONObject2);
            }
        } catch (JSONException unused) {
        }
    }
}
