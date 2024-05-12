package com.ss.android.ugc.aweme.upvote.detail.repostlist;

import X.AnonymousClass781;
import X.C16880lQ;
import X.C184077Kh;
import X.C1DI;
import X.C208458Gb;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C77123UOp;
import X.C78926UyI;
import X.C78939UyV;
import X.C78996UzQ;
import X.C78K;
import X.C78N;
import X.InterfaceC207258Bl;
import X.InterfaceC55251LmJ;
import X.J7H;
import X.W5F;
import X.W5G;
import X.W5U;
import Y.ACListenerS38S0200000_3;
import Y.IDCListenerS109S0200000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RepostListCell extends PowerCell<C78K> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1176));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1177));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1178));
    public final C214378bB LJLJJI;

    public final TuxIconView L() {
        return (TuxIconView) this.LJLJI.getValue();
    }

    public RepostListCell() {
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1179);
        this.LJLJJI = new C214378bB(C65352Pkq.LIZ(RepostListViewModel.class), aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C78N.INSTANCE, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ((SmartImageView) this.itemView.findViewById(R.id.f12)).setAttached(true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        ((SmartImageView) this.itemView.findViewById(R.id.f12)).setAttached(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C78K c78k) {
        UrlModel cover;
        long j;
        String str;
        AnonymousClass781 anonymousClass781;
        C78K listItem = c78k;
        o.LJIIIZ(listItem, "listItem");
        Aweme aweme = listItem.LJLIL;
        ((W5G) this.itemView.findViewById(R.id.f12)).setActualImageResource(0);
        Video video = aweme.getVideo();
        if (video != null) {
            SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.f12);
            o.LJIIIIZZ(smartImageView, "itemView.iv_cover");
            if (!C208458Gb.LIZJ(smartImageView, video, "RepostListCell", false, LiveTryModeCountDownThresholdSetting.DEFAULT) && (cover = video.getCover()) != null) {
                W5F LJII = W5U.LJII(C78939UyV.LJ(cover));
                int[] LIZ = J7H.LIZ(200);
                if (LIZ != null) {
                    LJII.LJIILIIL(LIZ);
                }
                LJII.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.f12);
                LJII.LIZIZ("RepostListCell");
                C16880lQ.LLJJJ(LJII);
            }
        }
        Aweme aweme2 = listItem.LJLIL;
        View view = this.itemView;
        ((ImageView) view.findViewById(R.id.e9_)).setVisibility(0);
        view.findViewById(R.id.m34).setVisibility(0);
        ((TuxIconView) view.findViewById(R.id.e9_)).setIconRes(R.raw.icon_play);
        TextView textView = (TextView) view.findViewById(R.id.m34);
        AwemeStatistics statistics = aweme2.getStatistics();
        if (statistics != null) {
            j = statistics.getPlayCount();
        } else {
            j = 0;
        }
        textView.setText(C77123UOp.LJJIIJ(j));
        ((InterfaceC207258Bl) this.LJLIL.getValue()).LIZIZ(listItem.LJLIL);
        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, listItem, 104), this.itemView);
        this.itemView.setOnLongClickListener(new IDCListenerS109S0200000_3(this, listItem, 4));
        Aweme aweme3 = listItem.LJLIL;
        if (aweme3.isProhibited()) {
            ((TextView) this.itemView.findViewById(R.id.ib_)).setText(aweme3.getCoverNotice());
            this.itemView.findViewById(R.id.geh).setVisibility(0);
            this.itemView.findViewById(R.id.ib_).setVisibility(0);
            this.itemView.findViewById(R.id.g1z).setVisibility(8);
        } else {
            this.itemView.findViewById(R.id.geh).setVisibility(8);
            this.itemView.findViewById(R.id.ib_).setVisibility(8);
            this.itemView.findViewById(R.id.g1z).setVisibility(0);
        }
        Boolean isPrivate = SharePrefCache.inst().getIsPrivateAvailable().LIZ();
        Aweme aweme4 = listItem.LJLIL;
        InterfaceC55251LmJ interfaceC55251LmJ = (InterfaceC55251LmJ) this.LJLILLLLZI.getValue();
        if (interfaceC55251LmJ != null && (anonymousClass781 = (AnonymousClass781) interfaceC55251LmJ.getSource()) != null) {
            str = anonymousClass781.LJLIL;
        } else {
            str = null;
        }
        o.LJ(str, "personal_homepage");
        o.LJIIIIZZ(isPrivate, "isPrivate");
        boolean booleanValue = isPrivate.booleanValue();
        if (aweme4 == null) {
            L().setVisibility(8);
            return;
        }
        if (aweme4.isSubOnlyVideo()) {
            L().setVisibility(0);
            L().setIconRes(R.raw.icon_star_ring);
            return;
        }
        if (aweme4.getStatus() == null) {
            L().setVisibility(8);
            return;
        }
        if (booleanValue && C78996UzQ.LJJIIZI(aweme4) && aweme4.getStatus().getPrivateStatus() != 0) {
            L().setVisibility(0);
            if (aweme4.getStatus().getPrivateStatus() == 1) {
                L().setIconRes(R.raw.icon_lock_small);
                return;
            } else {
                if (aweme4.getStatus().getPrivateStatus() != 2) {
                    return;
                }
                L().setIconRes(R.raw.icon_two_person);
                return;
            }
        }
        L().setVisibility(8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.dre, viewGroup, false, "from(parent.context)\n   …list_item, parent, false)");
    }
}
