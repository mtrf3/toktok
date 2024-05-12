package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.BI3;
import X.BI8;
import X.BZI;
import X.C0NB;
import X.C1EW;
import X.C28509BGv;
import X.C28787BRn;
import X.C29044Baa;
import X.C29137Bc5;
import X.C29306Beo;
import X.C32855Cux;
import X.C51029K0z;
import X.C76800UCe;
import X.CW6;
import X.CW8;
import X.CWA;
import X.CWC;
import X.CWG;
import X.EnumC28536BHw;
import X.InterfaceC64592gB;
import X.InterfaceC88473Ynt;
import X.Q7L;
import X.X1D;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.android.livesdk.dataChannel.BroadcastGameTagHasChangeChannel;
import com.bytedance.android.livesdk.dataChannel.HashtagDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.GameCategoryListFragment;
import com.bytedance.android.livesdk.hashtag.HashtagApi;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSimplifiedGoLivePageSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.postrechargeretention.PostRechargeRetentionViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class IDqS430S0100000_5 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS430S0100000_5(CWA cwa, int i) {
        super(3);
        this.$t = i;
        this.l0 = cwa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS430S0100000_5(GameCategoryListFragment gameCategoryListFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = gameCategoryListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS430S0100000_5(PostRechargeRetentionViewModel postRechargeRetentionViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = postRechargeRetentionViewModel;
    }

    public static final Object invoke$0(IDqS430S0100000_5 iDqS430S0100000_5, Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        String str2;
        Room room;
        GameTag gameTag;
        String str3;
        String str4;
        String str5;
        Editable editableText;
        Editable editableText2;
        Editable editableText3;
        DataChannel LJIILIIL;
        String str6;
        GameTag gameTag2 = (GameTag) obj;
        int intValue = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        o.LJIIIZ(gameTag2, "gameTag");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("select item callback. gameItem=");
        LIZ.append(gameTag2);
        C0NB.LJIIIZ("GameCategoryListDialog", X1D.LIZIZ(LIZ));
        GameCategoryListFragment gameCategoryListFragment = (GameCategoryListFragment) iDqS430S0100000_5.l0;
        LiveMode liveMode = gameCategoryListFragment.LJLJJL;
        if (liveMode != null && !C29137Bc5.LIZJ(liveMode)) {
            z = true;
        } else {
            z = false;
        }
        String str7 = null;
        if (!z) {
            String str8 = "null";
            if (TextUtils.isEmpty(gameCategoryListFragment.LJLJL)) {
                str = "null";
            } else if (gameCategoryListFragment.LJLJLJ) {
                str = "backend";
            } else {
                str = "frontend";
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_language_setting");
            LIZ2.LJIJJ(gameCategoryListFragment.wl(), "anchor_id");
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(gameCategoryListFragment);
            if (LJIILIIL2 == null || (room = (Room) LJIILIIL2.kv0(RoomChannel.class)) == null || (str2 = room.getIdStr()) == null) {
                str2 = "null";
            }
            LIZ2.LJIJJ(str2, "room_id");
            LIZ2.LJIJJ("screen_share", "live_type");
            if (!TextUtils.isEmpty(gameCategoryListFragment.LJLJL)) {
                str8 = gameCategoryListFragment.LJLJL;
            }
            LIZ2.LJIJJ(str8, "search_text");
            LIZ2.LJIJJ(gameTag2.showName, "game_label");
            LIZ2.LJIJJ(gameTag2.id, "game_label_id");
            LIZ2.LJIJJ(Integer.valueOf(intValue + 1), "tag_rank");
            LIZ2.LJIJJ(str, "source");
            LIZ2.LJJIIJZLJL();
        }
        GameCategoryListFragment gameCategoryListFragment2 = (GameCategoryListFragment) iDqS430S0100000_5.l0;
        BI8 bi8 = gameCategoryListFragment2.LJLIL;
        if (bi8 != null) {
            gameTag = bi8.LJLILLLLZI;
        } else {
            gameTag = null;
        }
        gameCategoryListFragment2.LJLJI = gameTag;
        if (gameTag != null) {
            DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(gameCategoryListFragment2);
            if (LJIILIIL3 != null) {
                LJIILIIL3.qv0(HashtagDialogPageChannel.class, EnumC28536BHw.FINISH);
            }
            if (booleanValue) {
                BZI LIZ3 = C28787BRn.LIZ("livesdk_livetake_topic_two_click");
                LIZ3.LJIJJ(gameCategoryListFragment2.wl(), "anchor_id");
                LIZ3.LJIJJ(gameTag.id, "choose_hashtag_id");
                LIZ3.LJIJJ(gameTag.showName, "choose_hashtag_name");
                LiveMode liveMode2 = gameCategoryListFragment2.LJLJJL;
                if (liveMode2 != null) {
                    LIZ3.LJIJJ(liveMode2.logStreamingType, "live_type");
                    if (C29306Beo.LJJIFFI(Boolean.valueOf(C28509BGv.LJI(liveMode2)))) {
                        if (LivePreviewComponentsSimplifyTypeSetting.INSTANCE.inExperiment()) {
                            str6 = "live_detail";
                        } else if (LiveSimplifiedGoLivePageSetting.INSTANCE.enableSimplifiedGoLivePageV1orV2()) {
                            str6 = "settings";
                        }
                        LIZ3.LJIJJ(str6, "position");
                    }
                    str6 = "outside";
                    LIZ3.LJIJJ(str6, "position");
                }
                DataChannel LJIILIIL4 = C51029K0z.LJIILIIL(gameCategoryListFragment2);
                if (LJIILIIL4 != null) {
                    LIZ3.LJIILLIIL(LJIILIIL4);
                }
                LIZ3.LJJIIJZLJL();
            }
            return C76800UCe.LIZ;
        }
        GameCategoryListFragment gameCategoryListFragment3 = (GameCategoryListFragment) iDqS430S0100000_5.l0;
        if (gameCategoryListFragment3.LJLJJLL && (LJIILIIL = C51029K0z.LJIILIIL(gameCategoryListFragment3)) != null) {
            LJIILIIL.rv0(BroadcastGameTagHasChangeChannel.class, gameTag2);
        }
        TextView textView = (TextView) ((GameCategoryListFragment) iDqS430S0100000_5.l0)._$_findCachedViewById(R.id.czv);
        if (textView != null && (editableText3 = textView.getEditableText()) != null) {
            str3 = editableText3.toString();
        } else {
            str3 = null;
        }
        if (!TextUtils.isEmpty(str3)) {
            HashtagApi hashtagApi = (HashtagApi) Q7L.LIZIZ(HashtagApi.class);
            String wl = ((GameCategoryListFragment) iDqS430S0100000_5.l0).wl();
            Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room2 == null || (str4 = room2.getIdStr()) == null) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            TextView textView2 = (TextView) ((GameCategoryListFragment) iDqS430S0100000_5.l0)._$_findCachedViewById(R.id.czv);
            if (textView2 != null && (editableText2 = textView2.getEditableText()) != null) {
                str5 = editableText2.toString();
            } else {
                str5 = null;
            }
            C1EW.LIZ(hashtagApi.sendTagRecord(wl, str4, str5, gameTag2.id)).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9DJ
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj4) {
                }
            }, BI3.LJLIL);
            TextView textView3 = (TextView) ((GameCategoryListFragment) iDqS430S0100000_5.l0)._$_findCachedViewById(R.id.czv);
            if (textView3 != null && (editableText = textView3.getEditableText()) != null) {
                str7 = editableText.toString();
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("text=");
            LIZ4.append(str7);
            C0NB.LJ("GameCategoryListDialog", X1D.LIZIZ(LIZ4));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS430S0100000_5 iDqS430S0100000_5, Object obj, Object obj2, Object obj3) {
        PostRechargeRetentionViewModel postRechargeRetentionViewModel;
        C32855Cux c32855Cux;
        Gift gift;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        C32855Cux c32855Cux2 = ((PostRechargeRetentionViewModel) iDqS430S0100000_5.l0).LJLJLLL;
        Long l = null;
        if (c32855Cux2 != null && (gift = c32855Cux2.LIZ) != null) {
            l = Long.valueOf(gift.id);
        }
        if (o.LJ(obj2, l) && (c32855Cux = (postRechargeRetentionViewModel = (PostRechargeRetentionViewModel) iDqS430S0100000_5.l0).LJLJLLL) != null && c32855Cux.LIZLLL) {
            if (booleanValue && c32855Cux != null) {
                c32855Cux.LIZLLL = false;
            }
            if (postRechargeRetentionViewModel.LJLILLLLZI == 1) {
                return "gift_rec";
            }
            return "gift_retain_popup";
        }
        return obj;
    }

    public static final Object invoke$2(IDqS430S0100000_5 iDqS430S0100000_5, Object obj, Object obj2, Object obj3) {
        CW8 cw8;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        CWC scaleLevel = (CWC) obj3;
        o.LJIIIZ(scaleLevel, "scaleLevel");
        int i = CWG.LIZ[scaleLevel.ordinal()];
        if (i != 1) {
            if (i != 2) {
                cw8 = CW8.ZOOM_OUT;
            } else {
                cw8 = CW8.DEFAULT;
            }
        } else {
            cw8 = CW8.ZOOM_IN;
        }
        CW6 cw6 = ((CWA) iDqS430S0100000_5.l0).LLI;
        if (cw6 != null) {
            cw6.LIZJ(cw8, intValue, intValue2);
        }
        return C76800UCe.LIZ;
    }
}
