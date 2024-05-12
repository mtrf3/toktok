package com.ss.android.ugc.aweme.toptab.ui;

import X.AV1;
import X.C16880lQ;
import X.C17N;
import X.C188727au;
import X.C199867ss;
import X.C1DI;
import X.C2068389v;
import X.C32186CkA;
import X.C51093K3l;
import X.C53946LFe;
import X.C54740Le4;
import X.C59992Xb;
import X.C62846OlW;
import X.C78688UuS;
import X.C78765Uvh;
import X.C86344Xue;
import X.C8DJ;
import X.C8DL;
import X.C8DM;
import X.EnumC72797Shd;
import X.InterfaceC86348Xui;
import X.InterfaceC86353Xun;
import X.JUV;
import X.ORZ;
import Y.ACListenerS35S0100000_15;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList;
import com.ss.android.ugc.aweme.feed.model.live.LiveAuthenticationInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LiveDualFeedCell extends PowerCell<C59992Xb> implements C8DJ {
    public InterfaceC86353Xun LJLIL;
    public InterfaceC86348Xui LJLILLLLZI;
    public boolean LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public final void L() {
        Aweme aweme;
        LiveRoomStruct newLiveRoomData;
        C59992Xb item = getItem();
        if (item != null && (aweme = item.LJLIL) != null && (newLiveRoomData = aweme.getNewLiveRoomData()) != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from_merge", "homepage_live");
            c188727au.LJIIIZ("action_type", "click");
            c188727au.LJIIIZ("anchor_id", newLiveRoomData.owner.getUid());
            c188727au.LJ(newLiveRoomData.id, "room_id");
            c188727au.LJIIIZ("enter_method", "live_cell");
            c188727au.LIZLLL(C54740Le4.LIZ(newLiveRoomData), "follow_status");
            String str = newLiveRoomData.liveReason;
            if (str == null) {
                str = "";
            }
            c188727au.LJIIIZ("live_reason", str);
            c188727au.LIZLLL(getLayoutPosition(), "room_position");
            C78688UuS.LJJJJZ(c188727au.LIZ);
        }
    }

    @Override // X.C8DJ
    public final void LLLLLL() {
        C17N.LJJLIIIJJI(_$_findCachedViewById(R.id.ej9));
        M(false);
        InterfaceC86353Xun interfaceC86353Xun = this.LJLIL;
        if (interfaceC86353Xun != null) {
            interfaceC86353Xun.LLZZLLIL();
        }
        InterfaceC86353Xun interfaceC86353Xun2 = this.LJLIL;
        if (interfaceC86353Xun2 != null) {
            interfaceC86353Xun2.destroy();
        }
        this.LJLIL = null;
        this.LJLILLLLZI = null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 148), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        L();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        LLLLLL();
    }

    @Override // X.C8DJ
    public final void LLLZI(C8DM listener) {
        Aweme aweme;
        LiveRoomStruct newLiveRoomData;
        o.LJIIIZ(listener, "listener");
        LLLLLL();
        C59992Xb item = getItem();
        if (item != null && (aweme = item.LJLIL) != null && (newLiveRoomData = aweme.getNewLiveRoomData()) != null) {
            this.LJLILLLLZI = listener;
            C32186CkA LJJJJZI = LiveOuterService.LJJJLL().LJJJJZI(new C86344Xue(this), EnumC72797Shd.CLEAN);
            LJJJJZI.LJIJ = new C51093K3l("homepage_live", "live_cell", "");
            JUV.LIZ(LJJJJZI, C8DL.LJLJLLL, newLiveRoomData, (FrameLayout) _$_findCachedViewById(R.id.dfp), 24);
            this.LJLIL = LJJJJZI;
        }
    }

    public final void M(boolean z) {
        int i;
        if (z) {
            C17N.LJJLIIIJJI(_$_findCachedViewById(R.id.m14));
            TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.m14);
            C2068389v c2068389v = new C2068389v();
            if (C8DL.LJLJLLL) {
                i = R.raw.icon_speaker_x_mark_fill_ltr;
            } else {
                i = R.raw.icon_speaker_2_fill_ltr;
            }
            c2068389v.LIZ = i;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView.setTuxIcon(c2068389v);
            InterfaceC86353Xun interfaceC86353Xun = this.LJLIL;
            if (interfaceC86353Xun != null) {
                interfaceC86353Xun.setMute(C8DL.LJLJLLL);
            }
            C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.m14), new ACListenerS35S0100000_15(this, 149));
            return;
        }
        C17N.LJJIIJZLJL(_$_findCachedViewById(R.id.m14));
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view == null) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            View findViewById = itemView.findViewById(i);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C59992Xb c59992Xb) {
        String str;
        String str2;
        UrlModel authenticationBadge;
        List<FeedRoomTag> subTags;
        FeedRoomTag feedRoomTag;
        String content;
        C59992Xb item = c59992Xb;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        UrlModel urlModel = null;
        int i = (C53946LFe.LIZJ(this.itemView.getContext(), null).LIZIZ - (C199867ss.LJLJI * 3)) / 2;
        _$_findCachedViewById(R.id.ddf).getLayoutParams().width = i;
        _$_findCachedViewById(R.id.ddf).getLayoutParams().height = (int) (i * 1.51d);
        LiveRoomStruct newLiveRoomData = item.LJLIL.getNewLiveRoomData();
        if (newLiveRoomData != null) {
            C17N.LJJLIIIJJI(_$_findCachedViewById(R.id.ej9));
            C78765Uvh.LJFF((C62846OlW) _$_findCachedViewById(R.id.ej9), newLiveRoomData.roomCover);
            ((ViewGroup) _$_findCachedViewById(R.id.dfp)).removeAllViews();
            ((TextView) _$_findCachedViewById(R.id.mql)).setText(newLiveRoomData.getUserCountDes());
            C17N.LJJIIJZLJL(_$_findCachedViewById(R.id.m12));
            FeedRoomTagList feedRoomTagList = newLiveRoomData.feedRoomTagList;
            if (feedRoomTagList != null && (subTags = feedRoomTagList.getSubTags()) != null && (feedRoomTag = (FeedRoomTag) ORZ.LJLLLL(subTags)) != null && (content = feedRoomTag.getContent()) != null && !TextUtils.isEmpty(content)) {
                C17N.LJJLIIIJJI(_$_findCachedViewById(R.id.m12));
                ((TextView) _$_findCachedViewById(R.id.m12)).setText(content);
            }
            M(false);
            C17N.LJJLIIIJJI(_$_findCachedViewById(R.id.mo6));
            if (!TextUtils.isEmpty(newLiveRoomData.title)) {
                ((TextView) _$_findCachedViewById(R.id.mo6)).setText(newLiveRoomData.title);
            } else {
                TopFrameSummary topFrameSummary = newLiveRoomData.topFrameSummary;
                if (topFrameSummary != null) {
                    str = topFrameSummary.getTitle();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    TextView textView = (TextView) _$_findCachedViewById(R.id.mo6);
                    TopFrameSummary topFrameSummary2 = newLiveRoomData.topFrameSummary;
                    if (topFrameSummary2 != null) {
                        str2 = topFrameSummary2.getTitle();
                    } else {
                        str2 = null;
                    }
                    textView.setText(str2);
                } else {
                    C17N.LJJIIJZLJL(_$_findCachedViewById(R.id.mo6));
                }
            }
            _$_findCachedViewById(R.id.eiw).setBackgroundResource(R.drawable.cul);
            C62846OlW c62846OlW = (C62846OlW) _$_findCachedViewById(R.id.eiw);
            User user = newLiveRoomData.owner;
            if (user != null) {
                urlModel = user.getAvatarThumb();
            }
            C78765Uvh.LJFF(c62846OlW, urlModel);
            ((TextView) _$_findCachedViewById(R.id.mc3)).setText(AV1.LIZJ(newLiveRoomData.owner, false));
            C17N.LJJIIJZLJL(_$_findCachedViewById(R.id.f7m));
            LiveAuthenticationInfo liveAuthenticationInfo = newLiveRoomData.owner.authenticationInfo;
            if (liveAuthenticationInfo != null && (authenticationBadge = liveAuthenticationInfo.getAuthenticationBadge()) != null) {
                C17N.LJJLIIIJJI(_$_findCachedViewById(R.id.f7m));
                C78765Uvh.LJFF((C62846OlW) _$_findCachedViewById(R.id.f7m), authenticationBadge);
            }
            this.LJLJI = false;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bqy, viewGroup, false, "from(parent.context).inf…dual_item, parent, false)");
    }
}
