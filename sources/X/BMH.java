package X;

import Y.ACListenerS40S0200000_5;
import Y.IDcS8S0200000_5;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAudienceImageCacheRefactorSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BMH extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final InterfaceC88472Yns<Room, C76800UCe> LJLIL;
    public int LJLILLLLZI = 2;
    public final List<FeedItem> LJLJI = new ArrayList();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJI).size() + 1;
    }

    public BMH(AqS171S0100000_5 aqS171S0100000_5) {
        this.LJLIL = aqS171S0100000_5;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i + 1 == getItemCount()) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LLJLILLLLZIIL(new IDcS8S0200000_5(this, layoutManager, 1));
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z;
        long userCount;
        long j;
        Long l;
        List<String> urls;
        o.LJIIIZ(holder, "holder");
        if (holder instanceof BMI) {
            BMI bmi = (BMI) holder;
            Room room = ((FeedItem) ListProtector.get(this.LJLJI, i)).getRoom();
            InterfaceC88472Yns<Room, C76800UCe> listener = this.LJLIL;
            o.LJIIIZ(listener, "listener");
            if (room != null) {
                ImageModel cover = room.getCover();
                if (cover == null) {
                    z = true;
                } else {
                    z = false;
                }
                String str = null;
                if (z || cover == null || (urls = cover.getUrls()) == null || urls.isEmpty()) {
                    bmi.LJLIL.setActualImageResource(R.drawable.csx);
                    bmi.LJLJJI.setVisibility(8);
                    bmi.LJLJJL.setVisibility(8);
                } else {
                    ArrayList arrayList = new ArrayList();
                    List<String> urls2 = cover.getUrls();
                    o.LJIIIIZZ(urls2, "it.urls");
                    Iterator<String> it = urls2.iterator();
                    while (it.hasNext()) {
                        C32364Cn2 c32364Cn2 = new C32364Cn2(it.next());
                        c32364Cn2.LIZJ("biz_tag", "scene_cover");
                        arrayList.add(c32364Cn2.LIZLLL());
                    }
                    cover.setUrls(arrayList);
                    boolean value = LiveAudienceImageCacheRefactorSetting.INSTANCE.getValue();
                    C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(cover);
                    LJIIIZ.LJIIIIZZ = R.drawable.csx;
                    LJIIIZ.LJIIZILJ(Float.valueOf(C15380j0.LIZ(0.0f) + 0.0f));
                    LJIIIZ.LJIL = value;
                    LJIIIZ.LJIIJJI(bmi.LJLIL);
                }
                String title = room.getTitle();
                if (title != null) {
                    bmi.LJLILLLLZI.setText(BML.LIZ("%s", title));
                }
                C47121t6 c47121t6 = bmi.LJLJI;
                if (room.getStatus() == 4) {
                    userCount = 0;
                } else {
                    userCount = room.getUserCount();
                }
                c47121t6.setText(C1FP.LJIIL(userCount));
                C16880lQ.LJIIJ(new ACListenerS40S0200000_5(room, listener, 74), bmi.itemView);
                ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
                BZI LIZ = C28787BRn.LIZ("livesdk_live_show");
                LIZ.LJIIZILJ();
                LIZ.LIZJ("click");
                LIZ.LJIJJ("live_detail", "enter_from_merge");
                LIZ.LJIJJ("hashtag", "enter_method");
                Hashtag hashtag = room.hashtag;
                if (hashtag != null) {
                    str = hashtag.title;
                }
                LIZ.LJIJJ(str, "hash_type");
                LIZ.LJIJJ(CardStruct.IStatusCode.DEFAULT, "is_return");
                User owner = room.getOwner();
                if (owner == null || (l = owner.followStatus) == null) {
                    j = -1;
                } else {
                    j = l.longValue();
                }
                LIZ.LJIJJ(Long.valueOf(j), "initial_follow_status");
                LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
                LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
                LIZ.LJJIIJZLJL();
                return;
            }
            return;
        }
        if (!(holder instanceof BMJ)) {
            return;
        }
        BMJ bmj = (BMJ) holder;
        int i2 = this.LJLILLLLZI;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                bmj.LJLIL.setVisibility(8);
                return;
            }
            bmj.LJLIL.setVisibility(4);
            return;
        }
        bmj.LJLIL.setVisibility(0);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder bmj;
        o.LJIIIZ(parent, "parent");
        if (i == 0) {
            bmj = new BMI(C1FL.LIZIZ(parent, R.layout.cxv, parent, false, "from(parent.context).inf…feed_item, parent, false)"));
        } else {
            bmj = new BMJ(C1FL.LIZIZ(parent, R.layout.d6c, parent, false, "from(parent.context).inf…ding_more, parent, false)"));
        }
        C0AX.LIZ(parent, bmj.itemView, R.id.lj7);
        View view = bmj.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (bmj.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(bmj.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) bmj.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(bmj.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = bmj.getClass().getName();
        return bmj;
    }
}
