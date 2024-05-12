package com.bytedance.android.livesdk.feed.drawerfeed.viewholder;

import X.BJA;
import X.BJB;
import X.BJF;
import X.BJG;
import X.BJM;
import X.BLG;
import X.BMA;
import X.BML;
import X.BNR;
import X.BZI;
import X.C05170If;
import X.C08680Vs;
import X.C09650Zl;
import X.C0NB;
import X.C113554cx;
import X.C15620jO;
import X.C15650jR;
import X.C16880lQ;
import X.C28509BGv;
import X.C28594BKc;
import X.C28668BMy;
import X.C28787BRn;
import X.C28835BTj;
import X.C29306Beo;
import X.C32151Nz;
import X.C38354F3m;
import X.C47061t0;
import X.C47121t6;
import X.C63081OpJ;
import X.C73893SzJ;
import X.C78720Uuy;
import X.C79004UzY;
import X.C86881Y7x;
import X.CCJ;
import X.CN1;
import X.CXJ;
import X.E2C;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.ORZ;
import X.X1D;
import Y.ACListenerS24S0101000_5;
import Y.AfS17S0001000_5;
import Y.AfS36S0101000_5;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import au3.IDdS56S0100000_5;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAudienceImageCacheRefactorSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerDrawOptSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.FeedRoomLabel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DrawerSmallLiveViewHolder extends BNR<FeedItem> {
    public static int LLIIII = -1;
    public final FeedDataKey LJLJI;
    public final C73893SzJ<FeedItem> LJLJJI;
    public final C73893SzJ<Boolean> LJLJJL;
    public final ViewGroup LJLJJLL;
    public final String LJLJL;
    public TextView LJLJLJ;
    public C47061t0 LJLJLLL;
    public TextView LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public C47121t6 LJLLL;
    public View LJLLLL;
    public View LJLLLLLL;
    public C47061t0 LJLZ;
    public C47061t0 LJZ;
    public C47121t6 LJZI;
    public BJG LJZL;
    public Room LL;
    public FeedItem LLD;
    public int LLF;
    public LogExtraData LLFF;
    public LogExtraData LLFFF;
    public int LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public View LLIFFJFJJ;
    public View LLII;

    /* loaded from: classes6.dex */
    public static class LogExtraData {

        @InterfaceC65349Pkn("label_language")
        public String labelLanguage;

        @InterfaceC65349Pkn("label_rank")
        public int labelRank;

        @InterfaceC65349Pkn("label_type")
        public String labelType;

        @InterfaceC65349Pkn("show_type")
        public int showType;
    }

    @Override // X.BNR
    public final void onViewAttachedToWindow() {
        this.LJLIL = true;
        if (!this.LLFZ) {
            return;
        }
        int i = this.LLFII;
        if (i == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onViewAttachedToWindow room");
            LIZ.append(this.LL.getId());
            C0NB.LIZIZ("onViewAttachedToWindow", X1D.LIZIZ(LIZ));
            P(this.LL);
        } else if (i == 0) {
            C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
            String str = c08680Vs.LJII;
            if (str == null) {
                str = "";
            }
            if (TextUtils.equals(str, this.LJLJL)) {
                P(this.LL);
            }
            boolean isEmpty = c08680Vs.LIZIZ().isEmpty();
            if (!this.LLI && !isEmpty) {
                P(this.LL);
                this.LLI = true;
            }
        }
        C08680Vs c08680Vs2 = C08680Vs.LJIILJJIL;
        FeedItem item = this.LLD;
        c08680Vs2.getClass();
        o.LJIIIZ(item, "item");
        c08680Vs2.LIZJ().remove(item);
    }

    public final String M() {
        LogExtraData logExtraData = this.LLFF;
        if (logExtraData == null) {
            return "";
        }
        if (logExtraData.labelRank == 0) {
            StringBuilder LIZ = X1D.LIZ();
            return JBR.LJFF(LIZ, this.LLFF.labelType, "", LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LLFF.labelType);
        LIZ2.append("_");
        LIZ2.append(this.LLFF.labelRank);
        return X1D.LIZIZ(LIZ2);
    }

    public final void P(Room room) {
        long id;
        String str;
        boolean z;
        Map<String, String> L;
        Object obj;
        String str2;
        Intent intent;
        if (room == null) {
            return;
        }
        if (room.getOwner() == null) {
            id = 0;
        } else {
            id = room.getOwner().getId();
        }
        HashMap hashMap = new HashMap();
        String str3 = "live_cover";
        String str4 = "live_merge";
        if (C28594BKc.LIZJ() != null) {
            if (C28594BKc.LIZJ().LIZ() != null) {
                str4 = C28594BKc.LIZJ().LIZ();
            }
            if (C28594BKc.LIZJ().LIZIZ() != null) {
                str3 = C28594BKc.LIZJ().LIZIZ();
            }
        }
        hashMap.put("enter_from_merge", str4);
        hashMap.put("enter_method", str3);
        hashMap.put("log_pb", room.getLog_pb());
        hashMap.put("anchor_id", String.valueOf(id));
        hashMap.put("request_id", room.getRequestId());
        hashMap.put("room_id", String.valueOf(room.getId()));
        hashMap.put("show_type", "stay");
        hashMap.put("live_type", C28509BGv.LIZ(room.getStreamType()));
        if (room.isThirdParty) {
            str = "thirdparty";
        } else {
            str = "general";
        }
        hashMap.put("streaming_type", str);
        hashMap.put("event_belong", "live_view");
        hashMap.put("event_page", "live");
        if (getAdapterPosition() != -1) {
            hashMap.put("small_picture_order", String.valueOf(getAdapterPosition() + 1));
        }
        hashMap.put("event_type", "core");
        hashMap.put("event_module", "live");
        hashMap.put("action_type", "click");
        hashMap.put("request_page", C28594BKc.LIZJ().LIZLLL());
        hashMap.put("live_window_mode", "small_picture");
        C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
        hashMap.put("small_picture_type", c08680Vs.LIZIZ());
        BJA bja = BJB.LJFF;
        if (bja.LJLIL.length() > 0) {
            L = bja.L();
        } else {
            if (bja.LJLILLLLZI.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                L = E2C.LIZJ("drawer_from_room_id", bja.LJLILLLLZI);
            } else {
                BJA bja2 = (BJA) ORZ.LLFII(BJB.LIZJ());
                if (bja2 != null) {
                    bja = bja2;
                }
                if (bja.LJLIL.length() == 0) {
                    if (bja.LJLILLLLZI.length() > 0) {
                        L = E2C.LIZJ("drawer_from_room_id", bja.LJLILLLLZI);
                    } else {
                        L = C113554cx.LJJJLIIL();
                    }
                } else {
                    L = bja.L();
                }
            }
        }
        hashMap.putAll(L);
        if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
            hashMap.put("enter_live_method", C28594BKc.LIZJ().LIZLLL());
        }
        if (room.getOwner() != null && room.getOwner().getFollowInfo() != null) {
            hashMap.put("follow_status", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
            hashMap.put("initial_follow_status", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
        }
        if (!TextUtils.isEmpty(this.LLD.liveReason)) {
            hashMap.put("live_reason", this.LLD.liveReason);
        }
        if ((this.itemView.getContext() instanceof Activity) && (intent = C29306Beo.LIZIZ(this.itemView.getContext()).getIntent()) != null) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "gd_label");
            if (!TextUtils.isEmpty(LLJJIJIIJIL)) {
                hashMap.put("gd_label", LLJJIJIIJIL);
            }
        }
        String LJIIIZ = BJM.LJIIIZ();
        String str5 = "1";
        if (!TextUtils.isEmpty(LJIIIZ) && "click_push_live_cd_user".equals(LJIIIZ)) {
            hashMap.put("is_subscribe", "1");
        } else {
            hashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        hashMap.put("is_return", CardStruct.IStatusCode.DEFAULT);
        if (room.hasCommerceGoods) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_ecom", obj);
        hashMap.put("room_position", String.valueOf(this.LLF));
        hashMap.put("is_from_draw_req", CardStruct.IStatusCode.DEFAULT);
        hashMap.put("top_left_label", M());
        hashMap.put("has_banner", String.valueOf(c08680Vs.LJII()));
        hashMap.put("explore_level", String.valueOf(c08680Vs.LJ()));
        hashMap.put("from_drawer_tab", c08680Vs.LJIIJ);
        String str6 = "";
        if (this.LLFF != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_drawer_toplabel_show");
            LIZ.LJJIFFI(hashMap);
            LIZ.LJIJJ(this.LLFF.labelType, "type");
            LIZ.LJIJJ(Integer.valueOf(this.LLFF.labelRank), "rank");
            LIZ.LJIJJ(this.LLFF.labelLanguage, "language");
            LIZ.LJIJJ(Integer.valueOf(this.LLFF.showType), "room_type");
            LIZ.LJJIIJZLJL();
            hashMap.put("drawer_label_type", M());
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("");
            LIZ2.append(this.LLFF.showType);
            hashMap.put("drawer_label_show_type", X1D.LIZIZ(LIZ2));
        }
        if (room.getSquareCoverImg() != null && !C32151Nz.LJJIIJZLJL(room.getSquareCoverImg().getUrls())) {
            str2 = "screen_shot";
        } else {
            str2 = "user_upload";
        }
        hashMap.put("cover_type", str2);
        if (!this.LLD.isFresh) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_fresh", str5);
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        hashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        hashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        BZI LIZ3 = C28787BRn.LIZ("livesdk_live_show");
        LIZ3.LJJIFFI(hashMap);
        if (this.LLFFF != null) {
            StringBuilder LIZ4 = X1D.LIZ();
            str6 = JBR.LJFF(LIZ4, this.LLFFF.labelType, "", LIZ4);
        }
        LIZ3.LJIJJ(C08680Vs.LIZLLL(str6), "connection_type");
        LIZ3.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ3.LJIJJ(c08680Vs.LJIIJJI, "landing_reason");
        LIZ3.LJIJJ(c08680Vs.LJII, "tab_type");
        LIZ3.LJJIIJZLJL();
        C28668BMy.LIZJ(2, room.getId(), System.currentTimeMillis());
    }

    public static void N(ImageModel imageModel, C47061t0 c47061t0) {
        if (imageModel == null || C32151Nz.LJJIIJZLJL(imageModel.getUrls())) {
            c47061t0.setVisibility(8);
            return;
        }
        c47061t0.setVisibility(0);
        C15620jO.LIZJ(c47061t0, imageModel, null, null, new IDdS56S0100000_5(c47061t0, 2), imageModel.isAnimated());
    }

    public final void Q(int i, int i2) {
        int measuredWidth = (this.LJLJJLL.getMeasuredWidth() - 3) / 2;
        LLIIII = measuredWidth;
        if (i > 0 && i2 > 0) {
            measuredWidth = (measuredWidth * i2) / i;
        }
        ViewGroup.LayoutParams layoutParams = this.LJLJLLL.getLayoutParams();
        if (o.LJ(C08680Vs.LJIILJJIL.LJIIIIZZ, "game_drawer")) {
            int i3 = layoutParams.width;
            int i4 = LLIIII;
            if (i3 == i4 && layoutParams.height == ((int) (i4 * 0.625f))) {
                return;
            }
            layoutParams.width = i4;
            layoutParams.height = (int) (i4 * 0.625f);
        } else {
            int i5 = layoutParams.width;
            int i6 = LLIIII;
            if (i5 == i6 && layoutParams.height == measuredWidth) {
                return;
            }
            layoutParams.width = i6;
            layoutParams.height = measuredWidth;
        }
        this.LJLJLLL.setLayoutParams(layoutParams);
    }

    @Override // X.BNR
    public final void bind(FeedItem feedItem, int i) {
        String str;
        int i2;
        int i3;
        FeedItem feedItem2 = feedItem;
        if (feedItem2 != null) {
            BLG blg = feedItem2.item;
            if (blg instanceof Room) {
                this.LLF = i;
                this.LLD = feedItem2;
                this.LL = (Room) blg;
                this.itemView.setOnLongClickListener(null);
                if (!TextUtils.isEmpty(this.LL.getTitle())) {
                    this.LJLJLJ.setText(BML.LIZ("%s", this.LL.getTitle()));
                } else if (this.LL.getOwner() != null && !TextUtils.isEmpty(C05170If.LIZ(this.LL.getOwner()))) {
                    this.LJLJLJ.setText(C05170If.LIZ(this.LL.getOwner()));
                } else {
                    this.LJLJLJ.setText((CharSequence) null);
                }
                if (CCJ.LIZ(this.LJLJLJ.getContext())) {
                    this.LJLJLJ.setGravity(5);
                } else {
                    this.LJLJLJ.setGravity(3);
                }
                ImageModel cover = this.LL.getCover();
                if (this.LL.getSquareCoverImg() != null && !C32151Nz.LJJIIJZLJL(this.LL.getSquareCoverImg().getUrls())) {
                    cover = this.LL.getSquareCoverImg();
                }
                if (cover == null || C32151Nz.LJJIIJZLJL(cover.getUrls())) {
                    this.LJLJLLL.setImageResource(R.drawable.csx);
                    View view = this.LJLLI;
                    if (view != null && this.LJLLILLLL != null) {
                        view.setVisibility(8);
                        this.LJLLILLLL.setVisibility(8);
                    }
                    if (cover == null) {
                        Q(0, 0);
                    } else {
                        Q(cover.width, cover.height);
                    }
                } else {
                    Room room = this.LL;
                    Q(cover.getWidth(), cover.getHeight());
                    long[] jArr = new long[1];
                    this.LJZL = new BJG();
                    if (LiveAudienceImageCacheRefactorSetting.INSTANCE.getValue()) {
                        i2 = this.LJLJLLL.getLayoutParams().width;
                        i3 = this.LJLJLLL.getLayoutParams().height;
                    } else {
                        i2 = -1;
                        i3 = -1;
                    }
                    C78720Uuy LJIIIIZZ = C15650jR.LIZ().LJIIIIZZ("drawer_cover", cover.mUrls);
                    LJIIIIZZ.LJI = i2;
                    LJIIIIZZ.LJII = i3;
                    LJIIIIZZ.LJIIJJI = new BJF(this, jArr, room);
                    LJIIIIZZ.LJIIJJI(this.LJLJLLL);
                    BMA bma = BMA.LIZIZ;
                    if (bma == null) {
                        synchronized (BMA.class) {
                            if (BMA.LIZIZ == null) {
                                BMA.LIZIZ = new BMA();
                            }
                        }
                        bma = BMA.LIZIZ;
                    }
                    List<String> urls = cover.getUrls();
                    bma.getClass();
                    if (urls != null) {
                        Iterator<String> it = urls.iterator();
                        while (it.hasNext()) {
                            bma.LIZ.put(it.next(), 2);
                        }
                    }
                }
                this.LJLLJ.setVisibility(8);
                this.LJLLLL.setVisibility(8);
                this.LJLLLLLL.setVisibility(8);
                List<FeedRoomLabel> feedRoomLabelList = this.LL.getFeedRoomLabelList();
                if (!C79004UzY.LJJIFFI(feedRoomLabelList)) {
                    for (FeedRoomLabel feedRoomLabel : feedRoomLabelList) {
                        if (feedRoomLabel != null) {
                            long j = feedRoomLabel.location;
                            if (j != 3 && j == 0) {
                                this.LJLLLLLL.setVisibility(0);
                                ImageModel imageModel = feedRoomLabel.bgImage;
                                if (imageModel != null) {
                                    N(imageModel, this.LJZ);
                                } else {
                                    this.LJLLLL.setVisibility(0);
                                    if (!TextUtils.isEmpty(feedRoomLabel.backgroundColor)) {
                                        GradientDrawable gradientDrawable = (GradientDrawable) this.LJLLLL.getBackground();
                                        gradientDrawable.mutate();
                                        gradientDrawable.setColor(ColorProtector.parseColor(feedRoomLabel.backgroundColor));
                                    }
                                    C47121t6 c47121t6 = this.LJZI;
                                    Text text = feedRoomLabel.text;
                                    if (c47121t6 != null && text != null) {
                                        String str2 = text.defaultPattern;
                                        if (!TextUtils.isEmpty(text.key)) {
                                            str = C86881Y7x.LIZIZ().LIZ(text.key);
                                        } else {
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            str2 = str;
                                        }
                                        c47121t6.setText(CXJ.LJI(str2, text, null));
                                    }
                                    N(feedRoomLabel.icon, this.LJLZ);
                                }
                            }
                        }
                    }
                }
                if (this.LL.getStatus() == 4) {
                    this.LJLL.setText(C63081OpJ.LJJIJIL(0L));
                } else {
                    this.LJLL.setText(C63081OpJ.LJJIJIL(this.LL.getUserCount()));
                }
                C16880lQ.LJIIJ(new ACListenerS24S0101000_5(0, this, 2), this.itemView);
                this.LL.setLog_pb(this.LLD.logPb);
                this.LL.setRequestId(this.LLD.resId);
                Room room2 = this.LL;
                this.LLFF = null;
                this.LLFFF = null;
                if (!C79004UzY.LJJIFFI(room2.getFeedRoomLabelList())) {
                    for (FeedRoomLabel feedRoomLabel2 : room2.getFeedRoomLabelList()) {
                        if (feedRoomLabel2 != null) {
                            long j2 = feedRoomLabel2.location;
                            if (j2 == 0) {
                                try {
                                    this.LLFF = (LogExtraData) C09650Zl.LIZJ.LJI(feedRoomLabel2.logExtra, LogExtraData.class);
                                } catch (Exception unused) {
                                }
                            } else if (j2 == 3) {
                                this.LLFFF = (LogExtraData) C09650Zl.LIZJ.LJI(feedRoomLabel2.logExtra, LogExtraData.class);
                            }
                        }
                    }
                }
                C73893SzJ<Boolean> c73893SzJ = this.LJLJJL;
                if (c73893SzJ != null) {
                    this.LJLILLLLZI.LIZ(c73893SzJ.LJJJLIIL(new AfS36S0101000_5(2, this, 44), new AfS17S0001000_5(1, 15)));
                }
                if (LiveDrawerDrawOptSetting.INSTANCE.isOpt()) {
                    this.LLIFFJFJJ.setVisibility(8);
                    this.LLII.setVisibility(8);
                    this.LLIFFJFJJ.setBackgroundResource(0);
                    this.LLII.setBackgroundResource(0);
                } else {
                    this.LLIFFJFJJ.setVisibility(0);
                    this.LLII.setVisibility(0);
                    this.LLIFFJFJJ.setBackgroundResource(R.drawable.cgv);
                    this.LLII.setBackgroundResource(R.drawable.cgu);
                }
                if (!TextUtils.isEmpty(this.LLD.drawerGameTag)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(" ");
                    this.LJLLL.setText(JBR.LJFF(LIZ, this.LLD.drawerGameTag, " ", LIZ));
                    this.LJLLL.setVisibility(0);
                    return;
                }
                this.LJLLL.setVisibility(8);
                return;
            }
        }
        this.itemView.setOnLongClickListener(null);
        this.LL = null;
    }

    public DrawerSmallLiveViewHolder(View view, FeedDataKey feedDataKey, C73893SzJ c73893SzJ, C73893SzJ c73893SzJ2, ViewGroup viewGroup, String str) {
        super(view);
        this.LLF = -1;
        this.LLFZ = true;
        this.LJLJI = feedDataKey;
        this.LJLJJI = c73893SzJ;
        this.LJLJJL = c73893SzJ2;
        this.LJLJL = str;
        this.LJLJJLL = viewGroup;
        this.LJLJLJ = (TextView) this.itemView.findViewById(R.id.title);
        this.LJLJLLL = (C47061t0) this.itemView.findViewById(R.id.fvr);
        this.LJLL = (TextView) this.itemView.findViewById(R.id.a9q);
        this.LJLLI = this.itemView.findViewById(R.id.gex);
        this.LJLLILLLL = this.itemView.findViewById(R.id.gel);
        this.LJLLJ = this.itemView.findViewById(R.id.fol);
        this.itemView.findViewById(R.id.fon);
        this.itemView.findViewById(R.id.fom);
        this.LJLLLLLL = this.itemView.findViewById(R.id.fpt);
        this.LJLLLL = this.itemView.findViewById(R.id.fpr);
        this.LJLZ = (C47061t0) this.itemView.findViewById(R.id.fpu);
        this.LJZ = (C47061t0) this.itemView.findViewById(R.id.fps);
        this.LJZI = (C47121t6) this.itemView.findViewById(R.id.fpv);
        this.LLIFFJFJJ = this.itemView.findViewById(R.id.gex);
        this.LLII = this.itemView.findViewById(R.id.gel);
        this.LJLLL = (C47121t6) this.itemView.findViewById(R.id.he8);
    }
}
