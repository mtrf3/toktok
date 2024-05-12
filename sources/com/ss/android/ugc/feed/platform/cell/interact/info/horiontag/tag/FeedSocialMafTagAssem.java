package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C211058Qb;
import X.C211068Qc;
import X.C211078Qd;
import X.C214348b8;
import X.C221108m2;
import X.C241249dQ;
import X.C58049MqL;
import X.C58050MqM;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8QV;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedSocialMafTagAssem extends BaseCellSlotComponent<FeedSocialMafTagAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public final InterfaceC115514g7 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public int LLIIII;
    public String LLIIIILZ;

    static {
        TBT tbt = new TBT(FeedSocialMafTagAssem.class, "videoTagVM", "getVideoTagVM()Lcom/ss/android/ugc/feed/platform/cell/interact/info/horiontag/tag/FeedSocialTagViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aeo;
    }

    public FeedSocialMafTagAssem() {
        new LinkedHashMap();
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FeedSocialTagViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 1297), null, C211058Qb.INSTANCE, null, null);
        this.LLFZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1296));
        this.LLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1295));
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 1299));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1298));
        this.LLII = C221108m2.LIZIZ(C211078Qd.LJLIL);
        this.LLIIII = -1;
        this.LLIIIILZ = "";
    }

    public final LinearLayout q4() {
        return (LinearLayout) this.LLI.getValue();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        Integer num;
        List<MutualUser> userList;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme == null) {
            return;
        }
        getContainerView().setVisibility(0);
        Y3().setVisibility(0);
        Object value = this.LLFZ.getValue();
        o.LJIIIIZZ(value, "<get-root>(...)");
        ((ViewGroup) value).removeAllViews();
        MatchedFriendStruct LIZ = C211068Qc.LIZ(aweme);
        String str = null;
        if (LIZ != null) {
            MutualStruct mMutualStruct = LIZ.getMMutualStruct();
            if (mMutualStruct != null && (userList = mMutualStruct.getUserList()) != null) {
                num = Integer.valueOf(userList.size());
            } else {
                num = null;
            }
            if (o.LJ(this.LLIIIILZ, LIZ.getRecType())) {
                int i = this.LLIIII;
                if (num != null && i == num.intValue()) {
                    ((C58049MqL) q4().findViewById(R.id.iuj)).LJJJJ(LIZ, C58050MqM.LJIIJJI);
                    Object value2 = this.LLFZ.getValue();
                    o.LJIIIIZZ(value2, "<get-root>(...)");
                    ((ViewGroup) value2).addView(q4(), (ViewGroup.LayoutParams) this.LLII.getValue());
                }
            }
            q4().setVisibility(4);
            this.LLIIIILZ = String.valueOf(LIZ.getRecType());
            if (num != null) {
                this.LLIIII = num.intValue();
            }
            ((C58049MqL) q4().findViewById(R.id.iuj)).LJJJJ(LIZ, C58050MqM.LJIIJ);
            q4().post(new ARunnableS39S0100000_3(this, 2));
            Object value22 = this.LLFZ.getValue();
            o.LJIIIIZZ(value22, "<get-root>(...)");
            ((ViewGroup) value22).addView(q4(), (ViewGroup.LayoutParams) this.LLII.getValue());
        }
        View Y3 = Y3();
        VideoItemParams videoItemParams2 = (VideoItemParams) ((AssemViewModelWithItem) this.LLFII.LIZ(this, LLIIIJ[0])).gv0();
        if (videoItemParams2 != null) {
            str = videoItemParams2.mEventType;
        }
        C8QV.LIZ(Y3, aweme, str);
    }
}
