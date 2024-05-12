package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.search.SearchExtraStruct;
import com.ss.android.ugc.aweme.feed.model.search.SearchLiveStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.JLb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49003JLb implements JUO {
    public final C48935JIl LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;

    @Override // X.JUO
    public final void LIZ() {
    }

    @Override // X.JUO
    public final void LIZIZ() {
    }

    @Override // X.JUO
    public final void LIZJ() {
    }

    @Override // X.JUO
    public final void LIZLLL() {
    }

    @Override // X.JUO
    public final void LJ() {
    }

    @Override // X.JUO
    public final void LJI(int i, int i2, View view) {
    }

    @Override // X.JUO
    public final void LJII() {
    }

    @Override // X.JUO
    public final void onBind() {
    }

    @Override // X.JUO
    public final void onLoading() {
    }

    public final LiveRoomStruct LJIIIIZZ() {
        Aweme aweme = this.LJLIL.LJI;
        if (aweme != null) {
            return aweme.getNewLiveRoomData();
        }
        return null;
    }

    @Override // X.JUO
    public final void onDestroy() {
        this.LJLJI = 0L;
    }

    @Override // X.JUO
    public final void onInit() {
        this.LJLJI = 0L;
    }

    @Override // X.JUO
    public final void LJFF() {
        this.LJLILLLLZI = System.currentTimeMillis();
        this.LJLJJI = System.currentTimeMillis();
    }

    @Override // X.JUO
    public final void LJIIIZ() {
        this.LJLJI = System.currentTimeMillis();
        if (this.LJLILLLLZI >= 0) {
            this.LJLILLLLZI = -1L;
        }
    }

    @Override // X.JUO
    public final void onPause() {
        JQA jqa;
        Object obj;
        User user;
        Long l;
        Integer num;
        Long l2;
        String str;
        String str2;
        boolean z;
        String str3;
        java.util.Map<String, String> invoke;
        SearchExtraStruct searchExtraStruct;
        SearchLiveStruct searchLiveStruct;
        LiveRoomStruct LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null && LJIIIIZZ.isFinish()) {
            return;
        }
        C48935JIl c48935JIl = this.LJLIL;
        if (c48935JIl.LJIIIZ && this.LJLJI > 0 && this.LJLJJI > 0 && (jqa = c48935JIl.LJII) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C49005JLd c49005JLd = new C49005JLd();
            c49005JLd.LJIIZILJ("enter_from_merge", jqa.LJFF);
            c49005JLd.LJIIZILJ("enter_method", jqa.LJI);
            LiveRoomStruct LJIIIIZZ2 = LJIIIIZZ();
            LiveRoomStruct liveRoomStruct = null;
            if (LJIIIIZZ2 != null) {
                obj = Long.valueOf(LJIIIIZZ2.ownerUserId);
            } else {
                LiveRoomStruct LJIIIIZZ3 = LJIIIIZZ();
                if (LJIIIIZZ3 != null && (user = LJIIIIZZ3.owner) != null) {
                    obj = user.getUid();
                } else {
                    obj = null;
                }
            }
            c49005JLd.LJIIZILJ("anchor_id", String.valueOf(obj));
            LiveRoomStruct LJIIIIZZ4 = LJIIIIZZ();
            if (LJIIIIZZ4 != null) {
                l = Long.valueOf(LJIIIIZZ4.id);
            } else {
                l = null;
            }
            c49005JLd.LJIIZILJ("room_id", String.valueOf(l));
            c49005JLd.LJIIZILJ("action_type", "click");
            c49005JLd.LJIIZILJ("request_id", jqa.LJIIIIZZ);
            c49005JLd.LJIIZILJ("duration", String.valueOf(Long.valueOf(currentTimeMillis - this.LJLJJI)));
            c49005JLd.LJIIZILJ("search_id", jqa.LJII);
            c49005JLd.LJIIZILJ("search_keyword", jqa.LJ);
            c49005JLd.LJIIZILJ("search_type", jqa.LIZJ);
            c49005JLd.LJIJ("search_result_id", jqa.LJIILJJIL);
            Aweme aweme = this.LJLIL.LJI;
            if (aweme != null) {
                num = Integer.valueOf(aweme.getFollowStatus());
            } else {
                num = null;
            }
            c49005JLd.LJIIZILJ("follow_status", String.valueOf(num));
            c49005JLd.LJIILLIIL(jqa.LJJIIJ);
            LiveRoomStruct LJIIIIZZ5 = LJIIIIZZ();
            if (LJIIIIZZ5 != null) {
                l2 = Long.valueOf(LJIIIIZZ5.id);
            } else {
                l2 = null;
            }
            c49005JLd.LJIIZILJ("list_item_id", String.valueOf(l2));
            String param = String.valueOf(this.LJLJI - this.LJLJJI);
            o.LJIIIZ(param, "param");
            c49005JLd.LJIIZILJ("first_frame_time", param);
            Aweme aweme2 = this.LJLIL.LJI;
            if (aweme2 != null && (searchExtraStruct = aweme2.getSearchExtraStruct()) != null && (searchLiveStruct = searchExtraStruct.getSearchLiveStruct()) != null) {
                str = searchLiveStruct.getLiveCoverType();
            } else {
                str = null;
            }
            c49005JLd.LJIIZILJ("cover_type", str);
            Aweme aweme3 = this.LJLIL.LJI;
            if (aweme3 != null) {
                liveRoomStruct = aweme3.getNewLiveRoomData();
            }
            if (C44729Hgz.LJJIJL(liveRoomStruct)) {
                str2 = "vertical";
            } else {
                str2 = "horizontal";
            }
            c49005JLd.LJIIZILJ("live_screen_type", str2);
            Aweme aweme4 = this.LJLIL.LJI;
            if (aweme4 != null && aweme4.isAd()) {
                z = true;
            } else {
                z = false;
            }
            String str4 = "1";
            if (z) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c49005JLd.LIZLLL("is_ad", str3);
            Aweme aweme5 = this.LJLIL.LJI;
            if (aweme5 == null || !aweme5.getIsLiveHasProduct()) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c49005JLd.LIZLLL("is_ecom", str4);
            InterfaceC65784Pro<? extends java.util.Map<String, String>> interfaceC65784Pro = this.LJLIL.LJIIL;
            if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
                c49005JLd.LJIILLIIL(invoke);
            }
            c49005JLd.LJIILIIL();
        }
        this.LJLJI = 0L;
    }

    public C49003JLb(C48935JIl dataProvider) {
        o.LJIIIZ(dataProvider, "dataProvider");
        this.LJLIL = dataProvider;
        this.LJLILLLLZI = -1L;
    }

    @Override // X.JUO
    public final void onError(String info) {
        o.LJIIIZ(info, "info");
        this.LJLJI = 0L;
    }
}
