package com.bytedance.android.livesdk.hashtag;

import X.AbstractC030309z;
import X.BMH;
import X.BOT;
import X.BTJ;
import X.BY6;
import X.C06490Nh;
import X.C0K5;
import X.C15380j0;
import X.C15640jQ;
import X.C17280m4;
import X.C28507BGt;
import X.C28620BLc;
import X.C28622BLe;
import X.C28625BLh;
import X.C28626BLi;
import X.C28627BLj;
import X.C28632BLo;
import X.C29306Beo;
import X.C2NU;
import X.C56K;
import X.C62705OjF;
import X.C78920UyC;
import X.C80217Ve1;
import X.CN1;
import X.EnumC29609Bjh;
import X.InterfaceC29882Bo6;
import X.Q7L;
import X.X1D;
import Y.AfS4S0100100_5;
import Y.AfS57S0100000_5;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import ujb.o;

/* loaded from: classes6.dex */
public final class HashtagAudienceDialog extends LiveDialogFragment {
    public Room LJLIL;
    public BMH LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;
    public C28625BLh LJLJL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final String LJLILLLLZI = FeedDrawMtSetting.INSTANCE.getValue().getUrl();
    public final float LJLJLJ = 0.5f;
    public final float LJLJLLL = 0.3f;
    public final boolean LJLL = BOT.LIZJ();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC29882Bo6 genLandscapeDialogProxy() {
        return new BY6(R.layout.cxq);
    }

    public final void wl() {
        String str;
        long j;
        Hashtag hashtag;
        Long l;
        Hashtag hashtag2;
        String str2;
        C78920UyC.LJI("livesdk_hashtag_anchor_live_take_button", "click", "action_type");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (hashtag2 = (Hashtag) dataChannel.kv0(HashtagChangedChannel.class)) != null && (str2 = hashtag2.title) != null) {
            str = o.LJJJJZ(str2, "&", "%26", false);
        } else {
            str = "";
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (hashtag = (Hashtag) dataChannel2.kv0(HashtagChangedChannel.class)) != null && (l = hashtag.id) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        StringBuilder LIZJ = C06490Nh.LIZJ("source_params={\"hashtag_title\":\"", str, "\",\"hashtag_id\":", j);
        LIZJ.append(",\"request_from\":hashtag}");
        ((IHostAction) CN1.LIZ(IHostAction.class)).handleSchema(C29306Beo.LIZIZ(getContext()), i0.LJFF("sslocal://openRecord?enter_from=direct_shoot&tab=live&", X1D.LIZIZ(LIZJ)), new Bundle());
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        if (C15380j0.LJIILLIIL()) {
            C28507BGt c28507BGt = new C28507BGt(R.layout.cxq);
            c28507BGt.LIZLLL = true;
            c28507BGt.LJII = 80;
            c28507BGt.LJI = 0.0f;
            c28507BGt.LJIIJJI = 73;
            return c28507BGt;
        }
        C28507BGt c28507BGt2 = new C28507BGt(R.layout.cxr);
        c28507BGt2.LIZLLL = false;
        c28507BGt2.LJII = 8388613;
        c28507BGt2.LJIIJ = -1;
        c28507BGt2.LJIIIZ = C15380j0.LIZ(490.0f);
        return c28507BGt2;
    }

    public final void vl() {
        String str;
        long j;
        Hashtag hashtag;
        Long l;
        String l2;
        ((C0K5) _$_findCachedViewById(R.id.e2t)).LJFF();
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            if (this.LJLL) {
                hashMap.put("is_non_personalized", "1");
            }
            FeedApi feedApi = (FeedApi) Q7L.LIZIZ(FeedApi.class);
            String str2 = this.LJLILLLLZI;
            Room room = this.LJLIL;
            String str3 = "";
            if (room == null || (str = C17280m4.LIZ(room)) == null) {
                str = "";
            }
            Room room2 = this.LJLIL;
            if (room2 != null && (l2 = Long.valueOf(room2.getOwnerUserId()).toString()) != null) {
                str3 = l2;
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (hashtag = (Hashtag) dataChannel.kv0(HashtagChangedChannel.class)) != null && (l = hashtag.id) != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            feedApi.feed(str2, 0L, "enter_hashtag_refresh", "76", str, str3, j, 6L, hashMap).LJJIJL(new C28620BLc()).LJII(new C62705OjF()).LJII(BTJ.LIZIZ(this)).LJJJLIIL(new AfS4S0100100_5(currentTimeMillis, this, 6), new AfS57S0100000_5(this, 111));
            return;
        }
        ((C0K5) _$_findCachedViewById(R.id.e2t)).LJI();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final EnumC29609Bjh getPanelType() {
        return EnumC29609Bjh.PANEL_HASHTAG_AUDIENCE;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room room;
        Hashtag hashtag;
        ImageModel imageModel;
        String str;
        String str2;
        kotlin.jvm.internal.o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (!C15380j0.LJIILLIIL()) {
            View findViewById = view.findViewById(R.id.j7n);
            if (findViewById != null) {
                findViewById.setBackgroundResource(R.drawable.cgr);
            }
            View findViewById2 = view.findViewById(R.id.l_2);
            if (findViewById2 != null) {
                findViewById2.setBackgroundResource(R.drawable.cgr);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, LiveEndDismissDialogEvent.class, new AqS171S0100000_5(this, 385));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLIL = room;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            hashtag = (Hashtag) dataChannel3.kv0(HashtagChangedChannel.class);
        } else {
            hashtag = null;
        }
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.e2u);
        if (hashtag != null) {
            imageModel = hashtag.image;
        } else {
            imageModel = null;
        }
        C15640jQ.LJII(imageView, imageModel, R.drawable.cf6, 2);
        TextView textView = (TextView) _$_findCachedViewById(R.id.e2z);
        if (hashtag != null) {
            str = hashtag.title;
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.e30);
        if (textView2 != null) {
            if (hashtag != null) {
                str2 = hashtag.title;
            } else {
                str2 = null;
            }
            textView2.setText(str2);
        }
        ((C80217Ve1) _$_findCachedViewById(R.id.a6s)).LIZ(new C28622BLe(new C56K(), this));
        this.LJLJI = new BMH(new AqS171S0100000_5(this, 386));
        this.LJLJL = new C28625BLh(new AqS155S0100000_5(this, 212));
        C0K5 c0k5 = (C0K5) _$_findCachedViewById(R.id.e2t);
        c0k5.LIZIZ(R.layout.cxt, "WithoutGoLivePerm");
        c0k5.LIZIZ(R.layout.cxs, "WithGoLivePerm");
        c0k5.setOfflineClickListener(new C28626BLi(this));
        c0k5.setErrorClickListener(new C28627BLj(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.d7o);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        BMH bmh = this.LJLJI;
        if (bmh != null) {
            recyclerView.setAdapter(bmh);
            recyclerView.LJII(new AbstractC030309z() { // from class: X.4mt
                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view2, RecyclerView recyclerView2, C0AC c0ac) {
                    T28.LJ(rect, "outRect", view2, "view", recyclerView2, "parent", c0ac, "state");
                    super.LJ(rect, view2, recyclerView2, c0ac);
                    rect.set(C15380j0.LIZ(2.0f), 0, C15380j0.LIZ(2.0f), C15380j0.LIZ(3.0f));
                }
            }, -1);
            C28625BLh c28625BLh = this.LJLJL;
            if (c28625BLh != null) {
                recyclerView.LJIIJJI(c28625BLh);
                vl();
                ((IHostUser) CN1.LIZ(IHostUser.class)).requestLivePermission(new C28632BLo(this), "hash_tag");
                return;
            }
            kotlin.jvm.internal.o.LJIJI("feedRecyclerOnScrollListener");
            throw null;
        }
        kotlin.jvm.internal.o.LJIJI("mAdapter");
        throw null;
    }
}
